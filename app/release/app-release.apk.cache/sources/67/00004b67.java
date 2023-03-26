package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.p7700g.p99005.i2;

/* compiled from: EmojiSpan.java */
@e2(19)
/* loaded from: classes.dex */
public abstract class jv extends ReplacementSpan {
    @x1
    private final hv t;
    private final Paint.FontMetricsInt s = new Paint.FontMetricsInt();
    private short u = -1;
    private short v = -1;
    private float w = 1.0f;

    @i2({i2.a.LIBRARY})
    public jv(@x1 hv hvVar) {
        jp.m(hvVar, "metadata cannot be null");
        this.t = hvVar;
    }

    @i2({i2.a.TESTS})
    public final int a() {
        return this.v;
    }

    @i2({i2.a.TESTS})
    public final int b() {
        return c().g();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public final hv c() {
        return this.t;
    }

    @i2({i2.a.LIBRARY})
    public final float d() {
        return this.w;
    }

    @i2({i2.a.LIBRARY})
    public final int e() {
        return this.u;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@x1 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @z1 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.s);
        Paint.FontMetricsInt fontMetricsInt2 = this.s;
        this.w = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.t.f();
        this.v = (short) (this.t.f() * this.w);
        short k = (short) (this.t.k() * this.w);
        this.u = k;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.s;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k;
    }
}