package com.example.thispc.fun;

import android.graphics.Color;
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

public class FunFactsActivity extends AppCompatActivity {

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

                int color = colorWheel.getColor();

                // get a random color and set the background color
                layout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                // Update the screen with a new fact
                factTextView.setText(factBook.getFact());
            }
        };

        // Attaching onClick listener to our button
        showFactButton.setOnClickListener(listener);
    }
}
