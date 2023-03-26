package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Application;

/* compiled from: AndroidViewModel.java */
/* loaded from: classes.dex */
public class bz extends k00 {
    @SuppressLint({"StaticFieldLeak"})
    private Application d;

    public bz(@x1 Application application) {
        this.d = application;
    }

    @x1
    public <T extends Application> T g() {
        return (T) this.d;
    }
}