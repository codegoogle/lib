package com.p7700g.p99005;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: KeyPositionBase.java */
/* loaded from: classes.dex */
public abstract class yd extends td {
    public static final float D = 20.0f;
    public int E = td.a;

    @Override // com.p7700g.p99005.td
    public void d(HashSet<String> attributes) {
    }

    public abstract void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    public abstract float p();

    public abstract float q();

    public abstract boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x, float y);

    public abstract void s(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value);
}