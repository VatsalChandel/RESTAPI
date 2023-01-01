package com.example.restservice;

public class Greeting {

    private final String content;
    private final long howManyClicks;



    public Greeting(String content, long howManyClicks) {
        this.content = content;
        this.howManyClicks = howManyClicks;
    }

    public long getHowManyClicks(){
        return howManyClicks;
    }


    public String getContent(){
        return content;
    }
}
