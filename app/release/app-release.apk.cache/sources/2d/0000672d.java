package com.p7700g.p99005;

import android.content.ContentResolver;
import android.provider.Settings;
import com.p7700g.p99005.i2;

/* compiled from: AnimatorDurationScaleProvider.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class yf2 {
    private static float a = 1.0f;

    @r2
    public static void b(float f) {
        a = f;
    }

    public float a(@x1 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}