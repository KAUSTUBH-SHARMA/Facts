package com.example.thispc.fun;

import java.util.Random;

class FactBook {
    //Fields or Member Variables-Properties about the object

    private String[] facts={
            "Ants stretch wne tey wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "you are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light form the Sun to reach Earth.",
            "Some bomboo Plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of water.",
            "ON average,it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Grat Pramid was being built."
    };
    //Methods -Action the object can take
    String getFact(){


        //Randomly select a fact
        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(facts.length);
        return ""+facts[randomNumber];
    }
}
