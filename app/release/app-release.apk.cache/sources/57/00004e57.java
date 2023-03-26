package com.p7700g.p99005;

import android.view.View;

/* compiled from: ViewState.java */
/* loaded from: classes.dex */
public class ld {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void a(View v) {
        this.b = v.getLeft();
        this.c = v.getTop();
        this.d = v.getRight();
        this.e = v.getBottom();
        this.a = v.getRotation();
    }

    public int b() {
        return this.e - this.c;
    }

    public int c() {
        return this.d - this.b;
    }
}