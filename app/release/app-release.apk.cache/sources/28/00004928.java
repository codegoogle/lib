package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes2.dex */
public final class it1 {
    private static final String a = "MemorySizeCalculator";
    @r2
    public static final int b = 4;
    private static final int c = 2;
    private final int d;
    private final int e;
    private final Context f;
    private final int g;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes2.dex */
    public static final class a {
        @r2
        public static final int a = 2;
        public static final int b;
        public static final float c = 0.4f;
        public static final float d = 0.33f;
        public static final int e = 4194304;
        public final Context f;
        public ActivityManager g;
        public c h;
        public float j;
        public float i = 2.0f;
        public float k = 0.4f;
        public float l = 0.33f;
        public int m = 4194304;

        static {
            b = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.j = b;
            this.f = context;
            this.g = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.h = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !it1.e(this.g)) {
                return;
            }
            this.j = 0.0f;
        }

        public it1 a() {
            return new it1(this);
        }

        @r2
        public a b(ActivityManager activityManager) {
            this.g = activityManager;
            return this;
        }

        public a c(int i) {
            this.m = i;
            return this;
        }

        public a d(float f) {
            x02.a(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.j = f;
            return this;
        }

        public a e(float f) {
            x02.a(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.l = f;
            return this;
        }

        public a f(float f) {
            x02.a(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.k = f;
            return this;
        }

        public a g(float f) {
            x02.a(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.i = f;
            return this;
        }

        @r2
        public a h(c cVar) {
            this.h = cVar;
            return this;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes2.dex */
    public static final class b implements c {
        private final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.p7700g.p99005.it1.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.p7700g.p99005.it1.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes2.dex */
    public interface c {
        int a();

        int b();
    }

    public it1(a aVar) {
        int i;
        this.f = aVar.f;
        if (e(aVar.g)) {
            i = aVar.m / 2;
        } else {
            i = aVar.m;
        }
        this.g = i;
        int c2 = c(aVar.g, aVar.k, aVar.l);
        float a2 = aVar.h.a() * aVar.h.b() * 4;
        int round = Math.round(aVar.j * a2);
        int round2 = Math.round(a2 * aVar.i);
        int i2 = c2 - i;
        if (round2 + round <= i2) {
            this.e = round2;
            this.d = round;
        } else {
            float f = i2;
            float f2 = aVar.j;
            float f3 = aVar.i;
            float f4 = f / (f2 + f3);
            this.e = Math.round(f3 * f4);
            this.d = Math.round(f4 * aVar.j);
        }
        if (Log.isLoggable(a, 3)) {
            f(this.e);
            f(this.d);
            f(i);
            f(c2);
            aVar.g.getMemoryClass();
            e(aVar.g);
        }
    }

    private static int c(ActivityManager activityManager, float f, float f2) {
        boolean e = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i) {
        return Formatter.formatFileSize(this.f, i);
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}