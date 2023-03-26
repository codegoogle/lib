package com.p7700g.p99005;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes3.dex */
public final class ch2 implements fh2 {
    private final float a;

    public ch2(float f) {
        this.a = f;
    }

    @Override // com.p7700g.p99005.fh2
    public float a(@x1 RectF rectF) {
        return this.a;
    }

    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch2) && this.a == ((ch2) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}