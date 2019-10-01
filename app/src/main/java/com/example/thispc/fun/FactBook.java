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
            "A baby fetus develops fingerprints at eighteen weeks.",
            "60 cows can produce a ton of milk each day.",
            "The word 'Strengths' is the longest word in the English language with just one vowel.",
            "HTC Touch. was the first mobile phone to feature intuitive multi-touch interface.",
            "Chewing gum, according to research carried out at the University of Northumbria, can improve your memory significantly.",
            "Mumbai harbour is the biggest one in India & 2nd biggest is Chennai harbour.",
            "Indaia made its first Nuclear Bomb test on May 18, 1974.",
            "When 2 zebras stand side by side they usually face each other in opposite directions to keep an eye out for predators.",
            "Tarantula spiders can survive 2 and a half years without food.",
            "Sri Shanmukhananda Hall in Mumbai is the largest auditorium in India.",
            "Indira Gandhi was shot dead by her bodyguards 'Beant Singh', and 'Satwant Singh' on October 31, 1984.",

    };

    // Methods - Action the object can take
    public String getFact(){
        // return a randomly selected fact
        return facts[new Random().nextInt(facts.length)];
    }
}
