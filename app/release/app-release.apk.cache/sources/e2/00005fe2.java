package com.p7700g.p99005;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* compiled from: ActivityOptionsCompat.java */
/* loaded from: classes.dex */
public class uf {
    public static final String a = "android.activity.usage_time";
    public static final String b = "android.usage_time_packages";

    /* compiled from: ActivityOptionsCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a extends uf {
        private final ActivityOptions c;

        public a(ActivityOptions activityOptions) {
            this.c = activityOptions;
        }

        @Override // com.p7700g.p99005.uf
        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return e.a(this.c);
        }

        @Override // com.p7700g.p99005.uf
        public void j(@x1 PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                d.c(this.c, pendingIntent);
            }
        }

        @Override // com.p7700g.p99005.uf
        @x1
        public uf k(@z1 Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(e.b(this.c, rect));
        }

        @Override // com.p7700g.p99005.uf
        public Bundle l() {
            return this.c.toBundle();
        }

        @Override // com.p7700g.p99005.uf
        public void m(@x1 uf ufVar) {
            if (ufVar instanceof a) {
                this.c.update(((a) ufVar).c);
            }
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static ActivityOptions a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        @e1
        public static ActivityOptions b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        @e1
        public static ActivityOptions c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @e1
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @e1
        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @e1
        public static ActivityOptions b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @e1
        public static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @e1
        public static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @x1
    public static uf b() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new a(d.a());
        }
        return new uf();
    }

    @x1
    public static uf c(@x1 View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new a(d.b(view, i, i2, i3, i4));
        }
        return new uf();
    }

    @x1
    public static uf d(@x1 Context context, int i, int i2) {
        return new a(b.a(context, i, i2));
    }

    @x1
    public static uf e(@x1 View view, int i, int i2, int i3, int i4) {
        return new a(b.b(view, i, i2, i3, i4));
    }

    @x1
    public static uf f(@x1 Activity activity, @x1 View view, @x1 String str) {
        return new a(c.a(activity, view, str));
    }

    @x1
    public static uf g(@x1 Activity activity, @z1 fp<View, String>... fpVarArr) {
        Pair[] pairArr = null;
        if (fpVarArr != null) {
            pairArr = new Pair[fpVarArr.length];
            for (int i = 0; i < fpVarArr.length; i++) {
                pairArr[i] = Pair.create(fpVarArr[i].a, fpVarArr[i].b);
            }
        }
        return new a(c.b(activity, pairArr));
    }

    @x1
    public static uf h() {
        return new a(c.c());
    }

    @x1
    public static uf i(@x1 View view, @x1 Bitmap bitmap, int i, int i2) {
        return new a(b.c(view, bitmap, i, i2));
    }

    @z1
    public Rect a() {
        return null;
    }

    public void j(@x1 PendingIntent pendingIntent) {
    }

    @x1
    public uf k(@z1 Rect rect) {
        return this;
    }

    @z1
    public Bundle l() {
        return null;
    }

    public void m(@x1 uf ufVar) {
    }
}