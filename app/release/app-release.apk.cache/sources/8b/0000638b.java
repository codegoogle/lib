package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: TypefaceUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class wg2 {
    private wg2() {
    }

    @z1
    public static Typeface a(@x1 Context context, @x1 Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    @z1
    public static Typeface b(@x1 Configuration configuration, @x1 Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0) {
            return null;
        }
        return Typeface.create(typeface, bm.e(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}