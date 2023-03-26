package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: ObjectAnimatorUtils.java */
/* loaded from: classes.dex */
public class h80 {
    private h80() {
    }

    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}