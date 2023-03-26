package com.p7700g.p99005;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.p7700g.p99005.qi4;

/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class cs {
    public static final int a = 8;
    public static final int b = 9;
    public static final int c = 10;

    /* compiled from: WindowCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(@x1 Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | qi4.h.j);
        }
    }

    /* compiled from: WindowCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static <T> T a(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    /* compiled from: WindowCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static void a(@x1 Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    private cs() {
    }

    @x1
    public static hs a(@x1 Window window, @x1 View view) {
        return new hs(window, view);
    }

    @x1
    public static <T extends View> T b(@x1 Window window, @m1 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@x1 Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}