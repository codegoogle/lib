package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.p7700g.p99005.fi3;
import java.lang.ref.WeakReference;

/* compiled from: OSViewUtils.java */
/* loaded from: classes3.dex */
public class gm3 {
    private static final int a = b(24);

    /* compiled from: OSViewUtils.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ Runnable t;

        /* compiled from: OSViewUtils.java */
        /* renamed from: com.p7700g.p99005.gm3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0183a extends fi3.b {
            public final /* synthetic */ fi3 a;

            public C0183a(fi3 fi3Var) {
                this.a = fi3Var;
            }

            @Override // com.p7700g.p99005.fi3.b
            public void a(@x1 Activity activity) {
                this.a.q(a.this.s);
                if (gm3.k(activity)) {
                    a.this.t.run();
                } else {
                    gm3.a(activity, a.this.t);
                }
            }
        }

        public a(String str, Runnable runnable) {
            this.s = str;
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            fi3 b = gi3.b();
            if (b != null) {
                b.b(this.s, new C0183a(b));
            }
        }
    }

    public static void a(@x1 Activity activity, @x1 Runnable runnable) {
        activity.getWindow().getDecorView().post(new a("decorViewReady:" + runnable, runnable));
    }

    public static int b(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int[] c(@x1 Activity activity) {
        float f;
        DisplayCutout cutout;
        Rect i = i(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = (i.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - i.bottom) / Resources.getSystem().getDisplayMetrics().density;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f = 0.0f;
        } else {
            f2 = cutout.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            f = cutout.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(f2), Math.round(f)};
    }

    private static int d(@x1 Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int e(@x1 Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.getWindow().getDecorView().getWidth();
        }
        return j(activity);
    }

    public static int f(@x1 Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return g(activity);
        }
        return h(activity);
    }

    @TargetApi(23)
    private static int g(@x1 Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private static int h(@x1 Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return i(activity).height();
        }
        return d(activity);
    }

    @x1
    private static Rect i(@x1 Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static int j(@x1 Activity activity) {
        return i(activity).width();
    }

    public static boolean k(@x1 Activity activity) {
        boolean z = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z;
        }
        return z && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    public static boolean l(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = weakReference.get().getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        return view != null && displayMetrics.heightPixels - rect.bottom > a;
    }
}