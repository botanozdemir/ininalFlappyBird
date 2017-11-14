package com.example.mahmoudreda.simplegame;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by botanozdemir on 13.11.2017.
 */

public class BaseApplication extends Application {

    private Typeface avenirTypefaceLight;
    private Typeface avenirTypefaceMedium;
    private Typeface avenirTypefaceBlack;
    private Typeface avenirTypefaceBook;
    private Typeface avenirTypefaceRoman;
    private Typeface helveticaNeueTypefaceMedium;
    private Typeface ocraextTypeface;
    private long lastInteractionTime;

    public long getLastInteractionTime() {
        return lastInteractionTime;
    }

    public void setLastInteractionTime(long lastInteractionTime) {
        this.lastInteractionTime = lastInteractionTime;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }


}
