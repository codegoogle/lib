package com.p7700g.p99005;

import android.util.Pair;
import android.view.View;

/* compiled from: MeasureController.java */
/* loaded from: classes3.dex */
public class oq3 {
    public Pair<Integer, Integer> a(@x1 pq3 pq3Var, int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int c = pq3Var.c();
        int l = pq3Var.l();
        int r = pq3Var.r();
        int g = pq3Var.g();
        int i5 = pq3Var.i();
        int k = pq3Var.k();
        int j = pq3Var.j();
        int h = pq3Var.h();
        int i6 = l * 2;
        qq3 f = pq3Var.f();
        if (c != 0) {
            i4 = (i6 * c) + (r * 2 * c) + ((c - 1) * g);
            i3 = i6 + r;
            if (f != qq3.HORIZONTAL) {
                i4 = i3;
                i3 = i4;
            }
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (pq3Var.b() == eq3.DROP) {
            if (f == qq3.HORIZONTAL) {
                i3 *= 2;
            } else {
                i4 *= 2;
            }
        }
        qq3 qq3Var = qq3.HORIZONTAL;
        int i7 = i4 + i5 + j;
        int i8 = i3 + k + h;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i7, size) : i7;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i8, size2) : i8;
        }
        if (size < 0) {
            size = 0;
        }
        int i9 = size2 >= 0 ? size2 : 0;
        pq3Var.V(size);
        pq3Var.D(i9);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i9));
    }
}