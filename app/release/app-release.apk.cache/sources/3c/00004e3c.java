package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* loaded from: classes2.dex */
public class la2 extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new la2();
    private final WeakHashMap<Drawable, Integer> b;

    private la2() {
        super(Integer.class, "drawableAlphaCompat");
        this.b = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @z1
    /* renamed from: a */
    public Integer get(@x1 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@x1 Drawable drawable, @x1 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}