package com.example.thispc.fun;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our View Variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook=new FactBook();
    private ColorWheel colorWheel=new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //creating activiy and giving the layout to display
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views for the layout file to the corresponding variables
        factTextView=findViewById(R.id.factTextView);
        showFactButton=findViewById(R.id.showFactButton);
        layout=findViewById(R.id.mainLayout);
        //On click listener for our button
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color=colorWheel.getColor();
                layout.setBackgroundColor(color);
                //Update the screen with our new fact
                showFactButton.setTextColor(color);
                factTextView.setText(factBook.getFact());
            }
        };
        //Attaching on click listener to our button
        showFactButton.setOnClickListener( listener );
        //creating a new tost
        //Toast.makeText(this, "Yey! Our Activiy was created!", Toast.LENGTH_SHORT).show();

        Log.d(TAG ,"we are logging for On create method");
    }
}
