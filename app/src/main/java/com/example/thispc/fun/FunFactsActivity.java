package com.example.thispc.fun;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity implements SensorEventListener {

    private static final float SHAKE_THRESHOLD_GRAVITY = 2.0f;
    private static final int SHAKE_SLOP_TIME_MS = 500;

    private long mShakeTimestamp = 0;
    private SensorManager sensorManager;

    // instantiate FactBook and ColorWheel
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    // view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // creating activity and giving the layout to display
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // making the app go full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Assign the Views for the layout file to the corresponding variables
        factTextView=findViewById(R.id.factTextView);
        showFactButton=findViewById(R.id.showFactButton);
        layout=findViewById(R.id.mainLayout);

        // On click listener for our button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNewFact();
            }
        };

        // Attaching onClick listener to our button
        showFactButton.setOnClickListener(listener);

        // randomly show a fact for the very first time the app is opened
        showNewFact();

        // setting up the sensor manager for shake detection
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensor mAccelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }

    private void showNewFact(){
        int color = colorWheel.getColor();

        // get a random color and set the background color
        layout.setBackgroundColor(color);
        showFactButton.setTextColor(color);

        // Update the screen with a new fact
        factTextView.setText(factBook.getFact());
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        float gX = x / SensorManager.GRAVITY_EARTH;
        float gY = y / SensorManager.GRAVITY_EARTH;
        float gZ = z / SensorManager.GRAVITY_EARTH;

        // gForce value should be close to 1 if there is no intense shaking
        float gForce = (float)Math.sqrt(gX * gX + gY * gY + gZ * gZ);

        if (gForce > SHAKE_THRESHOLD_GRAVITY) {

            final long now = System.currentTimeMillis();

            // ignoring close shaking events
            if (mShakeTimestamp + SHAKE_SLOP_TIME_MS > now) {
                return;
            }

            mShakeTimestamp = now;

            // shake detected
            showNewFact();
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // ignore this method
    }
}
