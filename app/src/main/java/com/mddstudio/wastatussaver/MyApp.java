package com.mddstudio.wastatussaver;

import android.app.Application;

import com.mddstudio.wastatussaver.util.AdController;
import com.mddstudio.wastatussaver.util.AppOpenManager;
import com.onesignal.OneSignal;

public class MyApp extends Application {

    AppOpenManager appOpenManager;
    private static final String ONESIGNAL_APP_ID = "0508f571-7ca1-46fa-975c-6c3efaa7dd9a";

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);


        AdController.initAd(this);


        appOpenManager = new AppOpenManager(this);
    }
}
