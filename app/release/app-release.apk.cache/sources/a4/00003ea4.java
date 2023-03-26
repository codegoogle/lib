package com.p7700g.p99005;

import android.graphics.RectF;
import com.p7700g.p99005.i2;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class dh2 implements fh2 {
    private final fh2 a;
    private final float b;

    public dh2(float f, @x1 fh2 fh2Var) {
        while (fh2Var instanceof dh2) {
            fh2Var = ((dh2) fh2Var).a;
            f += ((dh2) fh2Var).b;
        }
        this.a = fh2Var;
        this.b = f;
    }

    @Override // com.p7700g.p99005.fh2
    public float a(@x1 RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dh2) {
            dh2 dh2Var = (dh2) obj;
            return this.a.equals(dh2Var.a) && this.b == dh2Var.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}