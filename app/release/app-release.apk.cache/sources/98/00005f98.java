package com.p7700g.p99005;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
@e2(18)
/* loaded from: classes.dex */
public class u90 implements v90 {
    private final WindowId a;

    public u90(@x1 View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof u90) && ((u90) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}