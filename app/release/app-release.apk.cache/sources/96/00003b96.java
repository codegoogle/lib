package com.p7700g.p99005;

import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: AutoSizeableTextView.java */
@i2({i2.a.u})
/* loaded from: classes.dex */
public interface bt {
    @i2({i2.a.u})
    public static final boolean a0;

    static {
        a0 = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@x1 int[] iArr, int i) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);
}