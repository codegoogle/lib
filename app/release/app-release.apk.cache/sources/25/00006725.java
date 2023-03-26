package com.p7700g.p99005;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ye2 {
    public static final int a;
    public static final float b = 0.0f;
    public static final float c = 1.0f;
    private static final String d = "android.text.TextDirectionHeuristic";
    private static final String e = "android.text.TextDirectionHeuristics";
    private static final String f = "LTR";
    private static final String g = "RTL";
    private static boolean h;
    @z1
    private static Constructor<StaticLayout> i;
    @z1
    private static Object j;
    private CharSequence k;
    private final TextPaint l;
    private final int m;
    private int o;
    private boolean v;
    private int n = 0;
    private Layout.Alignment p = Layout.Alignment.ALIGN_NORMAL;
    private int q = Integer.MAX_VALUE;
    private float r = 0.0f;
    private float s = 1.0f;
    private int t = a;
    private boolean u = true;
    @z1
    private TextUtils.TruncateAt w = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Throwable th) {
            super(r0.toString(), th);
            StringBuilder G = wo1.G("Error thrown initializing StaticLayout ");
            G.append(th.getMessage());
        }
    }

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private ye2(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.k = charSequence;
        this.l = textPaint;
        this.m = i2;
        this.o = charSequence.length();
    }

    private void b() throws a {
        if (h) {
            return;
        }
        try {
            j = this.v && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            i = declaredConstructor;
            declaredConstructor.setAccessible(true);
            h = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    @x1
    public static ye2 c(@x1 CharSequence charSequence, @x1 TextPaint textPaint, @p1(from = 0) int i2) {
        return new ye2(charSequence, textPaint, i2);
    }

    public StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.k == null) {
            this.k = "";
        }
        int max = Math.max(0, this.m);
        CharSequence charSequence = this.k;
        if (this.q == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.l, max, this.w);
        }
        int min = Math.min(charSequence.length(), this.o);
        this.o = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.v && this.q == 1) {
                this.p = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.n, min, this.l, max);
            obtain.setAlignment(this.p);
            obtain.setIncludePad(this.u);
            if (this.v) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.w;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.q);
            float f2 = this.r;
            if (f2 != 0.0f || this.s != 1.0f) {
                obtain.setLineSpacing(f2, this.s);
            }
            if (this.q > 1) {
                obtain.setHyphenationFrequency(this.t);
            }
            return obtain.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) jp.l(i)).newInstance(charSequence, Integer.valueOf(this.n), Integer.valueOf(this.o), this.l, Integer.valueOf(max), this.p, jp.l(j), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.u), null, Integer.valueOf(max), Integer.valueOf(this.q));
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    @x1
    public ye2 d(@x1 Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    @x1
    public ye2 e(@z1 TextUtils.TruncateAt truncateAt) {
        this.w = truncateAt;
        return this;
    }

    @x1
    public ye2 f(@p1(from = 0) int i2) {
        this.o = i2;
        return this;
    }

    @x1
    public ye2 g(int i2) {
        this.t = i2;
        return this;
    }

    @x1
    public ye2 h(boolean z) {
        this.u = z;
        return this;
    }

    public ye2 i(boolean z) {
        this.v = z;
        return this;
    }

    @x1
    public ye2 j(float f2, float f3) {
        this.r = f2;
        this.s = f3;
        return this;
    }

    @x1
    public ye2 k(@p1(from = 0) int i2) {
        this.q = i2;
        return this;
    }

    @x1
    public ye2 l(@p1(from = 0) int i2) {
        this.n = i2;
        return this;
    }
}