package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.qi4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public class v30 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 4;
    public static final int i = 16;
    public static final int j = 32;
    public static final int k = 64;
    public static final int l = 8;
    public static final int m = 256;
    public static final int n = 512;
    public static final int o = 1024;
    public static final int p = 12;
    public static final int q = 4096;
    public static final int r = 8192;
    public static final int s = 16384;
    public static final int t = 7;
    public final b u;
    public a v = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public void a(int i) {
            this.a = i | this.a;
        }

        public boolean b() {
            int i = this.a;
            if ((i & 7) == 0 || (i & (c(this.d, this.b) << 0)) != 0) {
                int i2 = this.a;
                if ((i2 & 112) == 0 || (i2 & (c(this.d, this.c) << 4)) != 0) {
                    int i3 = this.a;
                    if ((i3 & qi4.h.j) == 0 || (i3 & (c(this.e, this.b) << 8)) != 0) {
                        int i4 = this.a;
                        return (i4 & 28672) == 0 || (i4 & (c(this.e, this.c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void d() {
            this.a = 0;
        }

        public void e(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* compiled from: ViewBoundsCheck.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public v30(b bVar) {
        this.u = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int c2 = this.u.c();
        int d2 = this.u.d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a2 = this.u.a(i2);
            this.v.e(c2, d2, this.u.b(a2), this.u.e(a2));
            if (i4 != 0) {
                this.v.d();
                this.v.a(i4);
                if (this.v.b()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                this.v.d();
                this.v.a(i5);
                if (this.v.b()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        this.v.e(this.u.c(), this.u.d(), this.u.b(view), this.u.e(view));
        if (i2 != 0) {
            this.v.d();
            this.v.a(i2);
            return this.v.b();
        }
        return false;
    }
}