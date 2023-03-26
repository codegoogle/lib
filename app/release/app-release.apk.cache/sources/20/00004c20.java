package com.p7700g.p99005;

import android.util.Property;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes2.dex */
public class ka2 extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new ka2("childrenAlpha");

    private ka2(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @x1
    /* renamed from: a */
    public Float get(@x1 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(ga2.h.q3);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@x1 ViewGroup viewGroup, @x1 Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(ga2.h.q3, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}