package com.example.facebookintegration;

import android.app.Application;

import com.facebook.appevents.AppEventsLogger;

public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppEventsLogger.activateApp(this);
    }
}
