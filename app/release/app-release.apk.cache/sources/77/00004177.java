package com.p7700g.p99005;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import com.p7700g.p99005.a3;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class f3 {
    public static final int A = -100;
    private static int B = -100;
    private static final r7<WeakReference<f3>> C = new r7<>();
    private static final Object D = new Object();
    public static final int E = 108;
    public static final int F = 109;
    public static final int G = 10;
    public static final boolean s = false;
    public static final String t = "AppCompatDelegate";
    public static final int u = -1;
    @Deprecated
    public static final int v = 0;
    @Deprecated
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;

    /* compiled from: AppCompatDelegate.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public static void E(@x1 f3 f3Var) {
        synchronized (D) {
            F(f3Var);
        }
    }

    private static void F(@x1 f3 f3Var) {
        synchronized (D) {
            Iterator<WeakReference<f3>> it = C.iterator();
            while (it.hasNext()) {
                f3 f3Var2 = it.next().get();
                if (f3Var2 == f3Var || f3Var2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void H(boolean z2) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z2);
    }

    public static void L(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && B != i) {
            B = i;
            d();
        }
    }

    public static void a(@x1 f3 f3Var) {
        synchronized (D) {
            F(f3Var);
            C.add(new WeakReference<>(f3Var));
        }
    }

    private static void d() {
        synchronized (D) {
            Iterator<WeakReference<f3>> it = C.iterator();
            while (it.hasNext()) {
                f3 f3Var = it.next().get();
                if (f3Var != null) {
                    f3Var.c();
                }
            }
        }
    }

    @x1
    public static f3 g(@x1 Activity activity, @z1 e3 e3Var) {
        return new g3(activity, e3Var);
    }

    @x1
    public static f3 h(@x1 Dialog dialog, @z1 e3 e3Var) {
        return new g3(dialog, e3Var);
    }

    @x1
    public static f3 i(@x1 Context context, @x1 Activity activity, @z1 e3 e3Var) {
        return new g3(context, activity, e3Var);
    }

    @x1
    public static f3 j(@x1 Context context, @x1 Window window, @z1 e3 e3Var) {
        return new g3(context, window, e3Var);
    }

    public static int m() {
        return B;
    }

    public static boolean u() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i);

    public abstract void I(@s1 int i);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void M(boolean z2);

    @e2(17)
    public abstract void N(int i);

    public abstract void O(@z1 Toolbar toolbar);

    public void P(@m2 int i) {
    }

    public abstract void Q(@z1 CharSequence charSequence);

    @z1
    public abstract b4 R(@x1 b4.a aVar);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean c();

    @Deprecated
    public void e(Context context) {
    }

    @x1
    @t0
    public Context f(@x1 Context context) {
        e(context);
        return context;
    }

    public abstract View k(@z1 View view, String str, @x1 Context context, @x1 AttributeSet attributeSet);

    @z1
    public abstract <T extends View> T l(@m1 int i);

    @z1
    public abstract a3.b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater p();

    @z1
    public abstract z2 q();

    public abstract boolean r(int i);

    public abstract void s();

    public abstract void t();

    public abstract boolean v();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}