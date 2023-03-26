package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.ga2;

/* compiled from: SurfaceColors.java */
/* loaded from: classes3.dex */
public enum vd2 {
    SURFACE_0(ga2.f.h4),
    SURFACE_1(ga2.f.i4),
    SURFACE_2(ga2.f.j4),
    SURFACE_3(ga2.f.k4),
    SURFACE_4(ga2.f.l4),
    SURFACE_5(ga2.f.m4);
    
    private final int z;

    vd2(@a1 int i) {
        this.z = i;
    }

    @w0
    public static int b(@x1 Context context, @b1 float f) {
        return new ud2(context).c(kc2.b(context, ga2.c.o3, 0), f);
    }

    @w0
    public int a(@x1 Context context) {
        return b(context, context.getResources().getDimension(this.z));
    }
}