package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.p7700g.p99005.ga2;

/* compiled from: CalendarStyle.java */
/* loaded from: classes3.dex */
public final class qc2 {
    @x1
    public final pc2 a;
    @x1
    public final pc2 b;
    @x1
    public final pc2 c;
    @x1
    public final pc2 d;
    @x1
    public final pc2 e;
    @x1
    public final pc2 f;
    @x1
    public final pc2 g;
    @x1
    public final Paint h;

    public qc2(@x1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(rg2.g(context, ga2.c.Ya, yc2.class.getCanonicalName()), ga2.o.yl);
        this.a = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Cl, 0));
        this.g = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Al, 0));
        this.b = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Bl, 0));
        this.c = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Dl, 0));
        ColorStateList a = sg2.a(context, obtainStyledAttributes, ga2.o.Fl);
        this.d = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Hl, 0));
        this.e = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Gl, 0));
        this.f = pc2.a(context, obtainStyledAttributes.getResourceId(ga2.o.Il, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}