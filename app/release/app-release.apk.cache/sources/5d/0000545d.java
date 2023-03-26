package com.p7700g.p99005;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes3.dex */
public final class oh2 implements fh2 {
    private final float a;

    public oh2(@g1(from = 0.0d, to = 1.0d) float f) {
        this.a = f;
    }

    @Override // com.p7700g.p99005.fh2
    public float a(@x1 RectF rectF) {
        return rectF.height() * this.a;
    }

    @g1(from = zg2.s, to = 1.0d)
    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh2) && this.a == ((oh2) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}