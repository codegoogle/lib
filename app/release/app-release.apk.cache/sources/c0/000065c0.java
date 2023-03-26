package com.p7700g.p99005;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

/* compiled from: LocationListenerCompat.java */
/* loaded from: classes.dex */
public final /* synthetic */ class xl {
    public static void a(yl ylVar, int i) {
    }

    public static void b(@x1 yl _this, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            _this.onLocationChanged((Location) list.get(i));
        }
    }

    public static void c(@x1 yl ylVar, String str) {
    }

    public static void d(@x1 yl ylVar, String str) {
    }

    public static void e(@x1 yl ylVar, String str, @z1 int i, Bundle bundle) {
    }
}