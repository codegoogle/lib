package com.adssdk;

import android.app.Application;
import android.content.Context;
import com.p7700g.p99005.f3;
import com.p7700g.p99005.h20;
import com.p7700g.p99005.mf3;
import com.p7700g.p99005.yg3;

/* loaded from: classes.dex */
public class App extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        h20.l(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        mf3.e = true;
        mf3.c = "https://appdataclient.github.io/appdata/";
        new yg3().f(this);
        f3.L(1);
    }
}