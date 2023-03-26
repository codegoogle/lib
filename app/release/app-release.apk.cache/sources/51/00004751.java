package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: EmojiMetadata.java */
@e2(19)
@i2({i2.a.LIBRARY_GROUP})
@o0
/* loaded from: classes.dex */
public class hv {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final ThreadLocal<fw> d = new ThreadLocal<>();
    private final int e;
    @x1
    private final mv f;
    private volatile int g = 0;

    /* compiled from: EmojiMetadata.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public hv(@x1 mv mvVar, @p1(from = 0) int i) {
        this.f = mvVar;
        this.e = i;
    }

    private fw h() {
        ThreadLocal<fw> threadLocal = d;
        fw fwVar = threadLocal.get();
        if (fwVar == null) {
            fwVar = new fw();
            threadLocal.set(fwVar);
        }
        this.f.g().J(fwVar, this.e);
        return fwVar;
    }

    public void a(@x1 Canvas canvas, float f, float f2, @x1 Paint paint) {
        Typeface j = this.f.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j);
        canvas.drawText(this.f.f(), this.e * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return h().F(i);
    }

    public int c() {
        return h().I();
    }

    public short d() {
        return h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int e() {
        return this.g;
    }

    public short f() {
        return h().S();
    }

    public int g() {
        return h().T();
    }

    public short i() {
        return h().U();
    }

    @x1
    public Typeface j() {
        return this.f.j();
    }

    public short k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    @i2({i2.a.TESTS})
    public void m() {
        this.g = 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void n(boolean z) {
        this.g = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(g()));
        sb.append(", codepoints:");
        int c2 = c();
        for (int i = 0; i < c2; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}