package com.adssdk;


import android.app.Application;
import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.multidex.MultiDex;

import com.google.play.Ads;
import com.google.play.MyApp;

import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class App extends Application{


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Ads.isdebugMode = true;
        Ads.URL = "https://appdataclient.github.io/appdata/";
        new MyApp().init(this);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

}
