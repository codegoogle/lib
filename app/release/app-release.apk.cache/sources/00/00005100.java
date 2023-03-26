package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.p7700g.p99005.jr3;

/* compiled from: AttributeController.java */
/* loaded from: classes3.dex */
public class mq3 {
    private pq3 a;

    public mq3(@x1 pq3 pq3Var) {
        this.a = pq3Var;
    }

    private eq3 a(int i) {
        switch (i) {
            case 0:
                return eq3.NONE;
            case 1:
                return eq3.COLOR;
            case 2:
                return eq3.SCALE;
            case 3:
                return eq3.WORM;
            case 4:
                return eq3.SLIDE;
            case 5:
                return eq3.FILL;
            case 6:
                return eq3.THIN_WORM;
            case 7:
                return eq3.DROP;
            case 8:
                return eq3.SWAP;
            case 9:
                return eq3.SCALE_DOWN;
            default:
                return eq3.NONE;
        }
    }

    public static sq3 b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return sq3.Auto;
                }
                return sq3.Auto;
            }
            return sq3.Off;
        }
        return sq3.On;
    }

    private void d(@x1 TypedArray typedArray) {
        boolean z = typedArray.getBoolean(jr3.m.W5, false);
        int i = typedArray.getInt(jr3.m.R5, aq3.a);
        int i2 = i >= 0 ? i : 0;
        eq3 a = a(typedArray.getInt(jr3.m.S5, eq3.NONE.ordinal()));
        sq3 b = b(typedArray.getInt(jr3.m.a6, sq3.Off.ordinal()));
        this.a.y(i2);
        this.a.E(z);
        this.a.z(a);
        this.a.N(b);
    }

    private void e(@x1 TypedArray typedArray) {
        int color = typedArray.getColor(jr3.m.f6, Color.parseColor(bq3.e));
        int color2 = typedArray.getColor(jr3.m.d6, Color.parseColor(bq3.f));
        this.a.T(color);
        this.a.P(color2);
    }

    private void f(@x1 TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(jr3.m.g6, -1);
        boolean z = typedArray.getBoolean(jr3.m.T5, true);
        int i = 0;
        boolean z2 = typedArray.getBoolean(jr3.m.V5, false);
        int i2 = typedArray.getInt(jr3.m.U5, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = typedArray.getInt(jr3.m.c6, 0);
        if (i3 >= 0 && (i2 <= 0 || i3 <= i2 - 1)) {
            i = i3;
        }
        this.a.U(resourceId);
        this.a.A(z);
        this.a.C(z2);
        this.a.B(i2);
        this.a.Q(i);
        this.a.R(i);
        this.a.F(i);
    }

    private void g(@x1 TypedArray typedArray) {
        int i = jr3.m.X5;
        qq3 qq3Var = qq3.HORIZONTAL;
        if (typedArray.getInt(i, qq3Var.ordinal()) != 0) {
            qq3Var = qq3.VERTICAL;
        }
        int dimension = (int) typedArray.getDimension(jr3.m.Z5, gr3.a(6));
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(jr3.m.Y5, gr3.a(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(jr3.m.b6, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) typedArray.getDimension(jr3.m.e6, gr3.a(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        int i2 = this.a.b() == eq3.FILL ? dimension3 : 0;
        this.a.M(dimension);
        this.a.G(qq3Var);
        this.a.H(dimension2);
        this.a.O(f);
        this.a.S(i2);
    }

    public void c(@x1 Context context, @z1 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jr3.m.Q5, 0, 0);
        f(obtainStyledAttributes);
        e(obtainStyledAttributes);
        d(obtainStyledAttributes);
        g(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}