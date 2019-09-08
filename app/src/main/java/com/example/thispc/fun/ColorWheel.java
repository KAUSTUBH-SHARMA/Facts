package com.example.thispc.fun;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] colors ={
           "#39add1","#3079ab","#c25975","#e15258","#f9845b","#838cc7","#7d669e","#53bbb4","#51b46d","#e0ab18","#637a91","#f092b0","#b7c0c7"
    };
    //Methods -Action the object can take
    int getColor(){


        //Randomly select a fact
        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}
