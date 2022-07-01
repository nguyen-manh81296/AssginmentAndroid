package com.example.assgigimentandroid.model;

import java.util.Date;

public class Wheather {
    private String DateTime;
    private String  IconPhrase;
    private int WheatherIcon;
    private Temperture Temperature;


    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public int getWheatherIcon() {
        return WheatherIcon;
    }

    public void setWheatherIcon(int wheatherIcon) {
        WheatherIcon = wheatherIcon;
    }

    public Temperture getTemperature() {
        return Temperature;
    }

    public void setTemperature(Temperture temperature) {
        Temperature = temperature;
    }
}
