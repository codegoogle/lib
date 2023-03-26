package com.ironsource.mediationsdk.config;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class ConfigFile {
    private static ConfigFile a;
    private String b;
    private String c;
    private String d;
    private String[] e = {"Unity", "AdobeAir", "Xamarin", "Corona", "AdMob", "ReactNative", "Unreal", "Flutter", "Cordova", "Cocos2dx", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (a == null) {
                a = new ConfigFile();
            }
            configFile = a;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.d;
    }

    public String getPluginType() {
        return this.b;
    }

    public String getPluginVersion() {
        return this.c;
    }

    public void setPluginData(String str, String str2, String str3) {
        if (str != null) {
            if (!Arrays.asList(this.e).contains(str)) {
                str = null;
            }
            this.b = str;
        }
        if (str2 != null) {
            this.c = str2;
        }
        if (str3 != null) {
            this.d = str3;
        }
    }
}