package com.example.thispc.fun;

import java.util.Random;

class FactBook {

    // Fields or Member Variables-Properties about the object
    private String[] facts={
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; By the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Peanuts aren’t technically nuts.",
            "Firefighters use wetting agents to make water wetter.",
            "The longest English word is 189,819 letters long.",
            "Blue whales eat half a million calories in one mouthful.",
            "That tiny pocket in jeans was designed to store pocket watches.",
            "Most Disney characters wear gloves to keep animation simple.",
            "Thanks to 3D printing, NASA can basically “email” tools to astronauts.",
            "No number before 1,000 contains the letter A.",
            "Neil Armstrong’s hair was sold in 2004 for $3,000.",

    };

    // Methods - Action the object can take
    public String getFact(){
        // return a randomly selected fact
        return facts[new Random().nextInt(facts.length)];
    }
}
