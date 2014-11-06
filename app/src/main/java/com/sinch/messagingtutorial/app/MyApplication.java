package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "BeqFRwB54DDaFtIVRShmZQkTMaFRU3ZI0g1LsPpH", "UjKFqIavX7ITUImIkSGL0MahwQd9oiUPMYECjHpf");
    }
}
