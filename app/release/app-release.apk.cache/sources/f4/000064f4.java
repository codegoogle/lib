package com.p7700g.p99005;

import android.os.Bundle;

/* compiled from: CustomTabColorSchemeParams.java */
/* loaded from: classes.dex */
public final class x5 {
    @w0
    @z1
    public final Integer a;
    @w0
    @z1
    public final Integer b;
    @w0
    @z1
    public final Integer c;
    @w0
    @z1
    public final Integer d;

    /* compiled from: CustomTabColorSchemeParams.java */
    /* loaded from: classes.dex */
    public static final class a {
        @w0
        @z1
        private Integer a;
        @w0
        @z1
        private Integer b;
        @w0
        @z1
        private Integer c;
        @w0
        @z1
        private Integer d;

        @x1
        public x5 a() {
            return new x5(this.a, this.b, this.c, this.d);
        }

        @x1
        public a b(@w0 int i) {
            this.c = Integer.valueOf(i | sr.t);
            return this;
        }

        @x1
        public a c(@w0 int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @x1
        public a d(@w0 int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @x1
        public a e(@w0 int i) {
            this.a = Integer.valueOf(i | sr.t);
            return this;
        }
    }

    public x5(@w0 @z1 Integer num, @w0 @z1 Integer num2, @w0 @z1 Integer num3, @w0 @z1 Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    @x1
    public static x5 a(@z1 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new x5((Integer) bundle.get(a6.i), (Integer) bundle.get(a6.q), (Integer) bundle.get(a6.K), (Integer) bundle.get(a6.L));
    }

    @x1
    public Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt(a6.i, num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt(a6.q, num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt(a6.K, num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt(a6.L, num4.intValue());
        }
        return bundle;
    }

    @x1
    public x5 c(@x1 x5 x5Var) {
        Integer num = this.a;
        if (num == null) {
            num = x5Var.a;
        }
        Integer num2 = this.b;
        if (num2 == null) {
            num2 = x5Var.b;
        }
        Integer num3 = this.c;
        if (num3 == null) {
            num3 = x5Var.c;
        }
        Integer num4 = this.d;
        if (num4 == null) {
            num4 = x5Var.d;
        }
        return new x5(num, num2, num3, num4);
    }
}