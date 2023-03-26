package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import com.p7700g.p99005.a3;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.f4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.pq;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class g3 extends f3 implements p4.a, LayoutInflater.Factory2 {
    private static final y7<String, Integer> H = new y7<>();
    private static final boolean I = false;
    private static final int[] J = {16842836};
    private static final boolean K = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean L = true;
    private static boolean M = false;
    public static final String N = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    public ViewGroup A0;
    private TextView B0;
    private View C0;
    private boolean D0;
    private boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    private boolean K0;
    private v[] L0;
    private v M0;
    private boolean N0;
    public final Object O;
    private boolean O0;
    public final Context P;
    private boolean P0;
    public Window Q;
    public boolean Q0;
    private p R;
    private Configuration R0;
    public final e3 S;
    private int S0;
    public z2 T;
    private int T0;
    public MenuInflater U;
    private boolean U0;
    private CharSequence V;
    private boolean V0;
    private DecorContentParent W;
    private r W0;
    private j X;
    private r X0;
    private w Y;
    public boolean Y0;
    public b4 Z;
    public int Z0;
    private final Runnable a1;
    private boolean b1;
    private Rect c1;
    private Rect d1;
    private j3 e1;
    private k3 f1;
    public ActionBarContextView u0;
    public PopupWindow v0;
    public Runnable w0;
    public yr x0;
    private boolean y0;
    private boolean z0;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains(com.anythink.expressad.foundation.h.h.c) || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@x1 Thread thread, @x1 Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + g3.N);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g3 g3Var = g3.this;
            if ((g3Var.Z0 & 1) != 0) {
                g3Var.f0(0);
            }
            g3 g3Var2 = g3.this;
            if ((g3Var2.Z0 & 4096) != 0) {
                g3Var2.f0(108);
            }
            g3 g3Var3 = g3.this;
            g3Var3.Y0 = false;
            g3Var3.Z0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class c implements jr {
        public c() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            int r = gsVar.r();
            int W0 = g3.this.W0(gsVar, null);
            if (r != W0) {
                gsVar = gsVar.D(gsVar.p(), W0, gsVar.q(), gsVar.o());
            }
            return sr.f1(view, gsVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        public d() {
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            rect.top = g3.this.W0(null, rect);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.OnAttachListener {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            g3.this.d0();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends as {
            public a() {
            }

            @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
            public void onAnimationEnd(View view) {
                g3.this.u0.setAlpha(1.0f);
                g3.this.x0.t(null);
                g3.this.x0 = null;
            }

            @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
            public void onAnimationStart(View view) {
                g3.this.u0.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g3 g3Var = g3.this;
            g3Var.v0.showAtLocation(g3Var.u0, 55, 0, 0);
            g3.this.g0();
            if (g3.this.P0()) {
                g3.this.u0.setAlpha(0.0f);
                g3 g3Var2 = g3.this;
                g3Var2.x0 = sr.f(g3Var2.u0).a(1.0f);
                g3.this.x0.t(new a());
                return;
            }
            g3.this.u0.setAlpha(1.0f);
            g3.this.u0.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class g extends as {
        public g() {
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationEnd(View view) {
            g3.this.u0.setAlpha(1.0f);
            g3.this.x0.t(null);
            g3.this.x0 = null;
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationStart(View view) {
            g3.this.u0.setVisibility(0);
            if (g3.this.u0.getParent() instanceof View) {
                sr.u1((View) g3.this.u0.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class h implements a3.b {
        public h() {
        }

        @Override // com.p7700g.p99005.a3.b
        public void a(Drawable drawable, int i) {
            z2 q = g3.this.q();
            if (q != null) {
                q.f0(drawable);
                q.c0(i);
            }
        }

        @Override // com.p7700g.p99005.a3.b
        public Drawable b() {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(e(), (AttributeSet) null, new int[]{x2.b.E1});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // com.p7700g.p99005.a3.b
        public void c(int i) {
            z2 q = g3.this.q();
            if (q != null) {
                q.c0(i);
            }
        }

        @Override // com.p7700g.p99005.a3.b
        public boolean d() {
            z2 q = g3.this.q();
            return (q == null || (q.j() & 4) == 0) ? false : true;
        }

        @Override // com.p7700g.p99005.a3.b
        public Context e() {
            return g3.this.l0();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(int i);

        @z1
        View onCreatePanelView(int i);
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class j implements w4.a {
        public j() {
        }

        @Override // com.p7700g.p99005.w4.a
        public void onCloseMenu(@x1 p4 p4Var, boolean z) {
            g3.this.X(p4Var);
        }

        @Override // com.p7700g.p99005.w4.a
        public boolean onOpenSubMenu(@x1 p4 p4Var) {
            Window.Callback s0 = g3.this.s0();
            if (s0 != null) {
                s0.onMenuOpened(108, p4Var);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class k implements b4.a {
        private b4.a a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends as {
            public a() {
            }

            @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
            public void onAnimationEnd(View view) {
                g3.this.u0.setVisibility(8);
                g3 g3Var = g3.this;
                PopupWindow popupWindow = g3Var.v0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (g3Var.u0.getParent() instanceof View) {
                    sr.u1((View) g3.this.u0.getParent());
                }
                g3.this.u0.killMode();
                g3.this.x0.t(null);
                g3 g3Var2 = g3.this;
                g3Var2.x0 = null;
                sr.u1(g3Var2.A0);
            }
        }

        public k(b4.a aVar) {
            this.a = aVar;
        }

        @Override // com.p7700g.p99005.b4.a
        public void a(b4 b4Var) {
            this.a.a(b4Var);
            g3 g3Var = g3.this;
            if (g3Var.v0 != null) {
                g3Var.Q.getDecorView().removeCallbacks(g3.this.w0);
            }
            g3 g3Var2 = g3.this;
            if (g3Var2.u0 != null) {
                g3Var2.g0();
                g3 g3Var3 = g3.this;
                g3Var3.x0 = sr.f(g3Var3.u0).a(0.0f);
                g3.this.x0.t(new a());
            }
            g3 g3Var4 = g3.this;
            e3 e3Var = g3Var4.S;
            if (e3Var != null) {
                e3Var.f(g3Var4.Z);
            }
            g3 g3Var5 = g3.this;
            g3Var5.Z = null;
            sr.u1(g3Var5.A0);
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean b(b4 b4Var, Menu menu) {
            return this.a.b(b4Var, menu);
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean c(b4 b4Var, Menu menu) {
            sr.u1(g3.this.A0);
            return this.a.c(b4Var, menu);
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean d(b4 b4Var, MenuItem menuItem) {
            return this.a.d(b4Var, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        public static Context a(@x1 Context context, @x1 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(@x1 Configuration configuration, @x1 Configuration configuration2, @x1 Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class m {
        private m() {
        }

        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class n {
        private n() {
        }

        public static void a(@x1 Configuration configuration, @x1 Configuration configuration2, @x1 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class o {
        private o() {
        }

        public static void a(@x1 Configuration configuration, @x1 Configuration configuration2, @x1 Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class q extends r {
        private final PowerManager c;

        public q(@x1 Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.p7700g.p99005.g3.r
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // com.p7700g.p99005.g3.r
        public int c() {
            return m.a(this.c) ? 2 : 1;
        }

        @Override // com.p7700g.p99005.g3.r
        public void e() {
            g3.this.c();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @i2({i2.a.LIBRARY})
    @r2
    /* loaded from: classes.dex */
    public abstract class r {
        private BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.e();
            }
        }

        public r() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    g3.this.P.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        @z1
        public abstract IntentFilter b();

        public abstract int c();

        public boolean d() {
            return this.a != null;
        }

        public abstract void e();

        public void f() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            g3.this.P.registerReceiver(this.a, b);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class s extends r {
        private final p3 c;

        public s(@x1 p3 p3Var) {
            super();
            this.c = p3Var;
        }

        @Override // com.p7700g.p99005.g3.r
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // com.p7700g.p99005.g3.r
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // com.p7700g.p99005.g3.r
        public void e() {
            g3.this.c();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class t {
        private t() {
        }

        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class u extends ContentFrameLayout {
        public u(Context context) {
            super(context);
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g3.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                g3.this.Z(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(r3.b(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class v {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public p4 j;
        public n4 k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public boolean s;
        public Bundle t;
        public Bundle u;

        /* compiled from: AppCompatDelegateImpl.java */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0177a();
            public int s;
            public boolean t;
            public Bundle u;

            /* compiled from: AppCompatDelegateImpl.java */
            /* renamed from: com.p7700g.p99005.g3$v$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0177a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return a.c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return a.c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public static a c(Parcel parcel, ClassLoader classLoader) {
                a aVar = new a();
                aVar.s = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                aVar.t = z;
                if (z) {
                    aVar.u = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.s);
                parcel.writeInt(this.t ? 1 : 0);
                if (this.t) {
                    parcel.writeBundle(this.u);
                }
            }
        }

        public v(int i) {
            this.a = i;
        }

        public void a() {
            Bundle bundle;
            p4 p4Var = this.j;
            if (p4Var == null || (bundle = this.t) == null) {
                return;
            }
            p4Var.U(bundle);
            this.t = null;
        }

        public void b() {
            p4 p4Var = this.j;
            if (p4Var != null) {
                p4Var.S(this.k);
            }
            this.k = null;
        }

        public x4 c(w4.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                n4 n4Var = new n4(this.l, x2.j.q);
                this.k = n4Var;
                n4Var.setCallback(aVar);
                this.j.b(this.k);
            }
            return this.k.getMenuView(this.g);
        }

        public boolean d() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        public void e(Parcelable parcelable) {
            a aVar = (a) parcelable;
            this.a = aVar.s;
            this.s = aVar.t;
            this.t = aVar.u;
            this.h = null;
            this.g = null;
        }

        public Parcelable f() {
            a aVar = new a();
            aVar.s = this.a;
            aVar.t = this.o;
            if (this.j != null) {
                Bundle bundle = new Bundle();
                aVar.u = bundle;
                this.j.W(bundle);
            }
            return aVar;
        }

        public void g(p4 p4Var) {
            n4 n4Var;
            p4 p4Var2 = this.j;
            if (p4Var == p4Var2) {
                return;
            }
            if (p4Var2 != null) {
                p4Var2.S(this.k);
            }
            this.j = p4Var;
            if (p4Var == null || (n4Var = this.k) == null) {
                return;
            }
            p4Var.b(n4Var);
        }

        public void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(x2.b.c, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(x2.b.x2, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(x2.l.P3, true);
            }
            d4 d4Var = new d4(context, 0);
            d4Var.getTheme().setTo(newTheme);
            this.l = d4Var;
            TypedArray obtainStyledAttributes = d4Var.obtainStyledAttributes(x2.m.S0);
            this.b = obtainStyledAttributes.getResourceId(x2.m.B2, 0);
            this.f = obtainStyledAttributes.getResourceId(x2.m.U0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class w implements w4.a {
        public w() {
        }

        @Override // com.p7700g.p99005.w4.a
        public void onCloseMenu(@x1 p4 p4Var, boolean z) {
            p4 G = p4Var.G();
            boolean z2 = G != p4Var;
            g3 g3Var = g3.this;
            if (z2) {
                p4Var = G;
            }
            v j0 = g3Var.j0(p4Var);
            if (j0 != null) {
                if (z2) {
                    g3.this.W(j0.a, j0, G);
                    g3.this.a0(j0, true);
                    return;
                }
                g3.this.a0(j0, z);
            }
        }

        @Override // com.p7700g.p99005.w4.a
        public boolean onOpenSubMenu(@x1 p4 p4Var) {
            Window.Callback s0;
            if (p4Var == p4Var.G()) {
                g3 g3Var = g3.this;
                if (!g3Var.F0 || (s0 = g3Var.s0()) == null || g3.this.Q0) {
                    return true;
                }
                s0.onMenuOpened(108, p4Var);
                return true;
            }
            return true;
        }
    }

    public g3(Activity activity, e3 e3Var) {
        this(activity, null, e3Var, activity);
    }

    private boolean C0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            v p0 = p0(i2, true);
            if (p0.o) {
                return false;
            }
            return M0(p0, keyEvent);
        }
        return false;
    }

    private boolean F0(int i2, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        DecorContentParent decorContentParent;
        if (this.Z != null) {
            return false;
        }
        boolean z2 = true;
        v p0 = p0(i2, true);
        if (i2 == 0 && (decorContentParent = this.W) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.P).hasPermanentMenuKey()) {
            if (!this.W.isOverflowMenuShowing()) {
                if (!this.Q0 && M0(p0, keyEvent)) {
                    z2 = this.W.showOverflowMenu();
                }
                z2 = false;
            } else {
                z2 = this.W.hideOverflowMenu();
            }
        } else {
            boolean z3 = p0.o;
            if (!z3 && !p0.n) {
                if (p0.m) {
                    if (p0.r) {
                        p0.m = false;
                        z = M0(p0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        J0(p0, keyEvent);
                    }
                }
                z2 = false;
            } else {
                a0(p0, true);
                z2 = z3;
            }
        }
        if (z2 && (audioManager = (AudioManager) this.P.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    private void J0(v vVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (vVar.o || this.Q0) {
            return;
        }
        if (vVar.a == 0) {
            if ((this.P.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback s0 = s0();
        if (s0 != null && !s0.onMenuOpened(vVar.a, vVar.j)) {
            a0(vVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.P.getSystemService("window");
        if (windowManager != null && M0(vVar, keyEvent)) {
            ViewGroup viewGroup = vVar.g;
            if (viewGroup != null && !vVar.q) {
                View view = vVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    vVar.n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, vVar.d, vVar.e, 1002, 8519680, -3);
                    layoutParams2.gravity = vVar.c;
                    layoutParams2.windowAnimations = vVar.f;
                    windowManager.addView(vVar.g, layoutParams2);
                    vVar.o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!v0(vVar) || vVar.g == null) {
                        return;
                    }
                } else if (vVar.q && viewGroup.getChildCount() > 0) {
                    vVar.g.removeAllViews();
                }
                if (u0(vVar) && vVar.d()) {
                    ViewGroup.LayoutParams layoutParams3 = vVar.h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    vVar.g.setBackgroundResource(vVar.b);
                    ViewParent parent = vVar.h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(vVar.h);
                    }
                    vVar.g.addView(vVar.h, layoutParams3);
                    if (!vVar.h.hasFocus()) {
                        vVar.h.requestFocus();
                    }
                } else {
                    vVar.q = true;
                    return;
                }
            }
            i2 = -2;
            vVar.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, vVar.d, vVar.e, 1002, 8519680, -3);
            layoutParams22.gravity = vVar.c;
            layoutParams22.windowAnimations = vVar.f;
            windowManager.addView(vVar.g, layoutParams22);
            vVar.o = true;
        }
    }

    private boolean L0(v vVar, int i2, KeyEvent keyEvent, int i3) {
        p4 p4Var;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.m || M0(vVar, keyEvent)) && (p4Var = vVar.j) != null) {
            z = p4Var.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.W == null) {
            a0(vVar, true);
        }
        return z;
    }

    private boolean M0(v vVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.Q0) {
            return false;
        }
        if (vVar.m) {
            return true;
        }
        v vVar2 = this.M0;
        if (vVar2 != null && vVar2 != vVar) {
            a0(vVar2, false);
        }
        Window.Callback s0 = s0();
        if (s0 != null) {
            vVar.i = s0.onCreatePanelView(vVar.a);
        }
        int i2 = vVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (decorContentParent3 = this.W) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (vVar.i == null && (!z || !(K0() instanceof n3))) {
            p4 p4Var = vVar.j;
            if (p4Var == null || vVar.r) {
                if (p4Var == null && (!w0(vVar) || vVar.j == null)) {
                    return false;
                }
                if (z && this.W != null) {
                    if (this.X == null) {
                        this.X = new j();
                    }
                    this.W.setMenu(vVar.j, this.X);
                }
                vVar.j.m0();
                if (!s0.onCreatePanelMenu(vVar.a, vVar.j)) {
                    vVar.g(null);
                    if (z && (decorContentParent = this.W) != null) {
                        decorContentParent.setMenu(null, this.X);
                    }
                    return false;
                }
                vVar.r = false;
            }
            vVar.j.m0();
            Bundle bundle = vVar.u;
            if (bundle != null) {
                vVar.j.T(bundle);
                vVar.u = null;
            }
            if (!s0.onPreparePanel(0, vVar.i, vVar.j)) {
                if (z && (decorContentParent2 = this.W) != null) {
                    decorContentParent2.setMenu(null, this.X);
                }
                vVar.j.l0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.p = z2;
            vVar.j.setQwertyMode(z2);
            vVar.j.l0();
        }
        vVar.m = true;
        vVar.n = false;
        this.M0 = vVar;
        return true;
    }

    private void N0(boolean z) {
        DecorContentParent decorContentParent = this.W;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.P).hasPermanentMenuKey() || this.W.isOverflowMenuShowPending())) {
            Window.Callback s0 = s0();
            if (this.W.isOverflowMenuShowing() && z) {
                this.W.hideOverflowMenu();
                if (this.Q0) {
                    return;
                }
                s0.onPanelClosed(108, p0(0, true).j);
                return;
            } else if (s0 == null || this.Q0) {
                return;
            } else {
                if (this.Y0 && (this.Z0 & 1) != 0) {
                    this.Q.getDecorView().removeCallbacks(this.a1);
                    this.a1.run();
                }
                v p0 = p0(0, true);
                p4 p4Var = p0.j;
                if (p4Var == null || p0.r || !s0.onPreparePanel(0, p0.i, p4Var)) {
                    return;
                }
                s0.onMenuOpened(108, p0.j);
                this.W.showOverflowMenu();
                return;
            }
        }
        v p02 = p0(0, true);
        p02.q = true;
        a0(p02, false);
        J0(p02, null);
    }

    private int O0(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    private boolean Q0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.Q.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || sr.N0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean S(boolean z) {
        if (this.Q0) {
            return false;
        }
        int V = V();
        boolean U0 = U0(z0(this.P, V), z);
        if (V == 0) {
            o0(this.P).f();
        } else {
            r rVar = this.W0;
            if (rVar != null) {
                rVar.a();
            }
        }
        if (V == 3) {
            m0(this.P).f();
        } else {
            r rVar2 = this.X0;
            if (rVar2 != null) {
                rVar2.a();
            }
        }
        return U0;
    }

    private void S0() {
        if (this.z0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void T() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.A0.findViewById(16908290);
        View decorView = this.Q.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.P.obtainStyledAttributes(x2.m.S0);
        obtainStyledAttributes.getValue(x2.m.n3, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(x2.m.o3, contentFrameLayout.getMinWidthMinor());
        int i2 = x2.m.l3;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = x2.m.m3;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = x2.m.j3;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = x2.m.k3;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @z1
    private d3 T0() {
        for (Context context = this.P; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof d3) {
                return (d3) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void U(@x1 Window window) {
        if (this.Q == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof p)) {
                p pVar = new p(callback);
                this.R = pVar;
                window.setCallback(pVar);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.P, (AttributeSet) null, J);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.Q = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean U0(int i2, boolean z) {
        boolean z2 = false;
        Configuration b0 = b0(this.P, i2, null, false);
        boolean y0 = y0(this.P);
        Configuration configuration = this.R0;
        if (configuration == null) {
            configuration = this.P.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = b0.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !y0 && this.O0 && (K || this.P0)) {
            Object obj = this.O;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                sf.D((Activity) this.O);
                z2 = true;
            }
        }
        if (z2 || i3 == i4) {
            z3 = z2;
        } else {
            V0(i4, y0, null);
        }
        if (z3) {
            Object obj2 = this.O;
            if (obj2 instanceof d3) {
                ((d3) obj2).g0(i2);
            }
        }
        return z3;
    }

    private int V() {
        int i2 = this.S0;
        return i2 != -100 ? i2 : f3.m();
    }

    private void V0(int i2, boolean z, @z1 Configuration configuration) {
        Resources resources = this.P.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            m3.a(resources);
        }
        int i4 = this.T0;
        if (i4 != 0) {
            this.P.setTheme(i4);
            if (i3 >= 23) {
                this.P.getTheme().applyStyle(this.T0, true);
            }
        }
        if (z) {
            Object obj = this.O;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof qz) {
                    if (((qz) activity).getLifecycle().b().a(mz.c.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (!this.P0 || this.Q0) {
                } else {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void X0(View view) {
        int f2;
        if ((sr.B0(view) & 8192) != 0) {
            f2 = gh.f(this.P, x2.d.g);
        } else {
            f2 = gh.f(this.P, x2.d.f);
        }
        view.setBackgroundColor(f2);
    }

    private void Y() {
        r rVar = this.W0;
        if (rVar != null) {
            rVar.a();
        }
        r rVar2 = this.X0;
        if (rVar2 != null) {
            rVar2.a();
        }
    }

    @x1
    private Configuration b0(@x1 Context context, int i2, @z1 Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup c0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.P.obtainStyledAttributes(x2.m.S0);
        int i2 = x2.m.g3;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(x2.m.p3, false)) {
                G(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                G(108);
            }
            if (obtainStyledAttributes.getBoolean(x2.m.h3, false)) {
                G(109);
            }
            if (obtainStyledAttributes.getBoolean(x2.m.i3, false)) {
                G(10);
            }
            this.I0 = obtainStyledAttributes.getBoolean(x2.m.T0, false);
            obtainStyledAttributes.recycle();
            i0();
            this.Q.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.P);
            if (!this.J0) {
                if (this.I0) {
                    viewGroup = (ViewGroup) from.inflate(x2.j.m, (ViewGroup) null);
                    this.G0 = false;
                    this.F0 = false;
                } else if (this.F0) {
                    TypedValue typedValue = new TypedValue();
                    this.P.getTheme().resolveAttribute(x2.b.j, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new d4(this.P, typedValue.resourceId);
                    } else {
                        context = this.P;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(x2.j.x, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(x2.g.x);
                    this.W = decorContentParent;
                    decorContentParent.setWindowCallback(s0());
                    if (this.G0) {
                        this.W.initFeature(109);
                    }
                    if (this.D0) {
                        this.W.initFeature(2);
                    }
                    if (this.E0) {
                        this.W.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.H0 ? (ViewGroup) from.inflate(x2.j.w, (ViewGroup) null) : (ViewGroup) from.inflate(x2.j.v, (ViewGroup) null);
            }
            if (viewGroup != null) {
                sr.Z1(viewGroup, new c());
                if (this.W == null) {
                    this.B0 = (TextView) viewGroup.findViewById(x2.g.s0);
                }
                ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(x2.g.b);
                ViewGroup viewGroup2 = (ViewGroup) this.Q.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.Q.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            StringBuilder G = wo1.G("AppCompat does not support the current theme features: { windowActionBar: ");
            G.append(this.F0);
            G.append(", windowActionBarOverlay: ");
            G.append(this.G0);
            G.append(", android:windowIsFloating: ");
            G.append(this.I0);
            G.append(", windowActionModeOverlay: ");
            G.append(this.H0);
            G.append(", windowNoTitle: ");
            G.append(this.J0);
            G.append(" }");
            throw new IllegalArgumentException(G.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void h0() {
        if (this.z0) {
            return;
        }
        this.A0 = c0();
        CharSequence r0 = r0();
        if (!TextUtils.isEmpty(r0)) {
            DecorContentParent decorContentParent = this.W;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(r0);
            } else if (K0() != null) {
                K0().v0(r0);
            } else {
                TextView textView = this.B0;
                if (textView != null) {
                    textView.setText(r0);
                }
            }
        }
        T();
        I0(this.A0);
        this.z0 = true;
        v p0 = p0(0, false);
        if (this.Q0) {
            return;
        }
        if (p0 == null || p0.j == null) {
            x0(108);
        }
    }

    private void i0() {
        if (this.Q == null) {
            Object obj = this.O;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.Q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @x1
    private static Configuration k0(@x1 Configuration configuration, @z1 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                n.a(configuration, configuration2, configuration3);
            } else if (!ep.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & yg1.K;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & yg1.K)) {
                configuration3.screenLayout |= i22 & yg1.K;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            l.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private r m0(@x1 Context context) {
        if (this.X0 == null) {
            this.X0 = new q(context);
        }
        return this.X0;
    }

    private r o0(@x1 Context context) {
        if (this.W0 == null) {
            this.W0 = new s(p3.a(context));
        }
        return this.W0;
    }

    private void t0() {
        h0();
        if (this.F0 && this.T == null) {
            Object obj = this.O;
            if (obj instanceof Activity) {
                this.T = new q3((Activity) this.O, this.G0);
            } else if (obj instanceof Dialog) {
                this.T = new q3((Dialog) this.O);
            }
            z2 z2Var = this.T;
            if (z2Var != null) {
                z2Var.R(this.b1);
            }
        }
    }

    private boolean u0(v vVar) {
        View view = vVar.i;
        if (view != null) {
            vVar.h = view;
            return true;
        } else if (vVar.j == null) {
            return false;
        } else {
            if (this.Y == null) {
                this.Y = new w();
            }
            View view2 = (View) vVar.c(this.Y);
            vVar.h = view2;
            return view2 != null;
        }
    }

    private boolean v0(v vVar) {
        vVar.h(l0());
        vVar.g = new u(vVar.l);
        vVar.c = 81;
        return true;
    }

    private boolean w0(v vVar) {
        Context context = this.P;
        int i2 = vVar.a;
        if ((i2 == 0 || i2 == 108) && this.W != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(x2.b.j, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(x2.b.k, typedValue, true);
            } else {
                theme.resolveAttribute(x2.b.k, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                d4 d4Var = new d4(context, 0);
                d4Var.getTheme().setTo(theme2);
                context = d4Var;
            }
        }
        p4 p4Var = new p4(context);
        p4Var.X(this);
        vVar.g(p4Var);
        return true;
    }

    private void x0(int i2) {
        this.Z0 = (1 << i2) | this.Z0;
        if (this.Y0) {
            return;
        }
        sr.o1(this.Q.getDecorView(), this.a1);
        this.Y0 = true;
    }

    private boolean y0(Context context) {
        if (!this.V0 && (this.O instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.O.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.U0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.U0 = false;
            }
        }
        this.V0 = true;
        return this.U0;
    }

    @Override // com.p7700g.p99005.f3
    public void A() {
        z2 q2 = q();
        if (q2 != null) {
            q2.o0(true);
        }
    }

    public boolean A0() {
        b4 b4Var = this.Z;
        if (b4Var != null) {
            b4Var.a();
            return true;
        }
        z2 q2 = q();
        return q2 != null && q2.g();
    }

    @Override // com.p7700g.p99005.f3
    public void B(Bundle bundle) {
    }

    public boolean B0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.N0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.f3
    public void C() {
        c();
    }

    @Override // com.p7700g.p99005.f3
    public void D() {
        z2 q2 = q();
        if (q2 != null) {
            q2.o0(false);
        }
    }

    public boolean D0(int i2, KeyEvent keyEvent) {
        z2 q2 = q();
        if (q2 == null || !q2.E(i2, keyEvent)) {
            v vVar = this.M0;
            if (vVar != null && L0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                v vVar2 = this.M0;
                if (vVar2 != null) {
                    vVar2.n = true;
                }
                return true;
            }
            if (this.M0 == null) {
                v p0 = p0(0, true);
                M0(p0, keyEvent);
                boolean L0 = L0(p0, keyEvent.getKeyCode(), keyEvent, 1);
                p0.m = false;
                if (L0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean E0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.N0;
            this.N0 = false;
            v p0 = p0(0, false);
            if (p0 != null && p0.o) {
                if (!z) {
                    a0(p0, true);
                }
                return true;
            } else if (A0()) {
                return true;
            }
        } else if (i2 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.f3
    public boolean G(int i2) {
        int O0 = O0(i2);
        if (this.J0 && O0 == 108) {
            return false;
        }
        if (this.F0 && O0 == 1) {
            this.F0 = false;
        }
        if (O0 == 1) {
            S0();
            this.J0 = true;
            return true;
        } else if (O0 == 2) {
            S0();
            this.D0 = true;
            return true;
        } else if (O0 == 5) {
            S0();
            this.E0 = true;
            return true;
        } else if (O0 == 10) {
            S0();
            this.H0 = true;
            return true;
        } else if (O0 == 108) {
            S0();
            this.F0 = true;
            return true;
        } else if (O0 != 109) {
            return this.Q.requestFeature(O0);
        } else {
            S0();
            this.G0 = true;
            return true;
        }
    }

    public void G0(int i2) {
        z2 q2;
        if (i2 != 108 || (q2 = q()) == null) {
            return;
        }
        q2.h(true);
    }

    public void H0(int i2) {
        if (i2 == 108) {
            z2 q2 = q();
            if (q2 != null) {
                q2.h(false);
            }
        } else if (i2 == 0) {
            v p0 = p0(i2, true);
            if (p0.o) {
                a0(p0, false);
            }
        }
    }

    @Override // com.p7700g.p99005.f3
    public void I(int i2) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.A0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.P).inflate(i2, viewGroup);
        this.R.c(this.Q.getCallback());
    }

    public void I0(ViewGroup viewGroup) {
    }

    @Override // com.p7700g.p99005.f3
    public void J(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.A0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.R.c(this.Q.getCallback());
    }

    @Override // com.p7700g.p99005.f3
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.A0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.R.c(this.Q.getCallback());
    }

    public final z2 K0() {
        return this.T;
    }

    @Override // com.p7700g.p99005.f3
    public void M(boolean z) {
        this.y0 = z;
    }

    @Override // com.p7700g.p99005.f3
    @e2(17)
    public void N(int i2) {
        if (this.S0 != i2) {
            this.S0 = i2;
            if (this.O0) {
                c();
            }
        }
    }

    @Override // com.p7700g.p99005.f3
    public void O(Toolbar toolbar) {
        if (this.O instanceof Activity) {
            z2 q2 = q();
            if (!(q2 instanceof q3)) {
                this.U = null;
                if (q2 != null) {
                    q2.D();
                }
                this.T = null;
                if (toolbar != null) {
                    n3 n3Var = new n3(toolbar, r0(), this.R);
                    this.T = n3Var;
                    this.R.e(n3Var.k);
                } else {
                    this.R.e(null);
                }
                t();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // com.p7700g.p99005.f3
    public void P(@m2 int i2) {
        this.T0 = i2;
    }

    public final boolean P0() {
        ViewGroup viewGroup;
        return this.z0 && (viewGroup = this.A0) != null && sr.T0(viewGroup);
    }

    @Override // com.p7700g.p99005.f3
    public final void Q(CharSequence charSequence) {
        this.V = charSequence;
        DecorContentParent decorContentParent = this.W;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (K0() != null) {
            K0().v0(charSequence);
        } else {
            TextView textView = this.B0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // com.p7700g.p99005.f3
    public b4 R(@x1 b4.a aVar) {
        e3 e3Var;
        if (aVar != null) {
            b4 b4Var = this.Z;
            if (b4Var != null) {
                b4Var.a();
            }
            k kVar = new k(aVar);
            z2 q2 = q();
            if (q2 != null) {
                b4 x0 = q2.x0(kVar);
                this.Z = x0;
                if (x0 != null && (e3Var = this.S) != null) {
                    e3Var.e(x0);
                }
            }
            if (this.Z == null) {
                this.Z = R0(kVar);
            }
            return this.Z;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b4 R0(@x1 b4.a aVar) {
        b4 b4Var;
        Context context;
        b4 b4Var2;
        e3 e3Var;
        g0();
        b4 b4Var3 = this.Z;
        if (b4Var3 != null) {
            b4Var3.a();
        }
        if (!(aVar instanceof k)) {
            aVar = new k(aVar);
        }
        e3 e3Var2 = this.S;
        if (e3Var2 != null && !this.Q0) {
            try {
                b4Var = e3Var2.q(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (b4Var == null) {
                this.Z = b4Var;
            } else {
                if (this.u0 == null) {
                    if (this.I0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.P.getTheme();
                        theme.resolveAttribute(x2.b.j, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.P.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new d4(this.P, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.P;
                        }
                        this.u0 = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, x2.b.y);
                        this.v0 = popupWindow;
                        lt.d(popupWindow, 2);
                        this.v0.setContentView(this.u0);
                        this.v0.setWidth(-1);
                        context.getTheme().resolveAttribute(x2.b.d, typedValue, true);
                        this.u0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.v0.setHeight(-2);
                        this.w0 = new f();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.A0.findViewById(x2.g.l);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(l0()));
                            this.u0 = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (this.u0 != null) {
                    g0();
                    this.u0.killMode();
                    e4 e4Var = new e4(this.u0.getContext(), this.u0, aVar, this.v0 == null);
                    if (aVar.b(e4Var, e4Var.c())) {
                        e4Var.i();
                        this.u0.initForMode(e4Var);
                        this.Z = e4Var;
                        if (P0()) {
                            this.u0.setAlpha(0.0f);
                            yr a2 = sr.f(this.u0).a(1.0f);
                            this.x0 = a2;
                            a2.t(new g());
                        } else {
                            this.u0.setAlpha(1.0f);
                            this.u0.setVisibility(0);
                            if (this.u0.getParent() instanceof View) {
                                sr.u1((View) this.u0.getParent());
                            }
                        }
                        if (this.v0 != null) {
                            this.Q.getDecorView().post(this.w0);
                        }
                    } else {
                        this.Z = null;
                    }
                }
            }
            b4Var2 = this.Z;
            if (b4Var2 != null && (e3Var = this.S) != null) {
                e3Var.e(b4Var2);
            }
            return this.Z;
        }
        b4Var = null;
        if (b4Var == null) {
        }
        b4Var2 = this.Z;
        if (b4Var2 != null) {
            e3Var.e(b4Var2);
        }
        return this.Z;
    }

    public void W(int i2, v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i2 >= 0) {
                v[] vVarArr = this.L0;
                if (i2 < vVarArr.length) {
                    vVar = vVarArr[i2];
                }
            }
            if (vVar != null) {
                menu = vVar.j;
            }
        }
        if ((vVar == null || vVar.o) && !this.Q0) {
            this.R.d(this.Q.getCallback(), i2, menu);
        }
    }

    public final int W0(@z1 gs gsVar, @z1 Rect rect) {
        int i2;
        boolean z;
        boolean z2;
        if (gsVar != null) {
            i2 = gsVar.r();
        } else {
            i2 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.u0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u0.getLayoutParams();
            if (this.u0.isShown()) {
                if (this.c1 == null) {
                    this.c1 = new Rect();
                    this.d1 = new Rect();
                }
                Rect rect2 = this.c1;
                Rect rect3 = this.d1;
                if (gsVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(gsVar.p(), gsVar.r(), gsVar.q(), gsVar.o());
                }
                ViewUtils.computeFitSystemWindows(this.A0, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                gs n0 = sr.n0(this.A0);
                int p2 = n0 == null ? 0 : n0.p();
                int q2 = n0 == null ? 0 : n0.q();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && this.C0 == null) {
                    View view = new View(this.P);
                    this.C0 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p2;
                    layoutParams.rightMargin = q2;
                    this.A0.addView(this.C0, -1, layoutParams);
                } else {
                    View view2 = this.C0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != p2 || marginLayoutParams2.rightMargin != q2) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = p2;
                            marginLayoutParams2.rightMargin = q2;
                            this.C0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.C0;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    X0(this.C0);
                }
                if (!this.H0 && r5) {
                    i2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.u0.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.C0;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    public void X(@x1 p4 p4Var) {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        this.W.dismissPopups();
        Window.Callback s0 = s0();
        if (s0 != null && !this.Q0) {
            s0.onPanelClosed(108, p4Var);
        }
        this.K0 = false;
    }

    public void Z(int i2) {
        a0(p0(i2, true), true);
    }

    public void a0(v vVar, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && vVar.a == 0 && (decorContentParent = this.W) != null && decorContentParent.isOverflowMenuShowing()) {
            X(vVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.P.getSystemService("window");
        if (windowManager != null && vVar.o && (viewGroup = vVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                W(vVar.a, vVar, null);
            }
        }
        vVar.m = false;
        vVar.n = false;
        vVar.o = false;
        vVar.h = null;
        vVar.q = true;
        if (this.M0 == vVar) {
            this.M0 = null;
        }
    }

    @Override // com.p7700g.p99005.f3
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.A0.findViewById(16908290)).addView(view, layoutParams);
        this.R.c(this.Q.getCallback());
    }

    @Override // com.p7700g.p99005.f3
    public boolean c() {
        return S(true);
    }

    public void d0() {
        p4 p4Var;
        DecorContentParent decorContentParent = this.W;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.v0 != null) {
            this.Q.getDecorView().removeCallbacks(this.w0);
            if (this.v0.isShowing()) {
                try {
                    this.v0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.v0 = null;
        }
        g0();
        v p0 = p0(0, false);
        if (p0 == null || (p4Var = p0.j) == null) {
            return;
        }
        p4Var.close();
    }

    public boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.O;
        if (((obj instanceof pq.a) || (obj instanceof h3)) && (decorView = this.Q.getDecorView()) != null && pq.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.R.b(this.Q.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    @Override // com.p7700g.p99005.f3
    @x1
    @t0
    public Context f(@x1 Context context) {
        this.O0 = true;
        int z0 = z0(context, V());
        boolean z = false;
        if (L && (context instanceof ContextThemeWrapper)) {
            try {
                t.a((ContextThemeWrapper) context, b0(context, z0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof d4) {
            try {
                ((d4) context).a(b0(context, z0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!K) {
            return super.f(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = l.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration b0 = b0(context, z0, configuration2.equals(configuration3) ? null : k0(configuration2, configuration3), true);
        d4 d4Var = new d4(context, x2.l.b4);
        d4Var.a(b0);
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            oi.h.a(d4Var.getTheme());
        }
        return super.f(d4Var);
    }

    public void f0(int i2) {
        v p0;
        v p02 = p0(i2, true);
        if (p02.j != null) {
            Bundle bundle = new Bundle();
            p02.j.V(bundle);
            if (bundle.size() > 0) {
                p02.u = bundle;
            }
            p02.j.m0();
            p02.j.clear();
        }
        p02.r = true;
        p02.q = true;
        if ((i2 != 108 && i2 != 0) || this.W == null || (p0 = p0(0, false)) == null) {
            return;
        }
        p0.m = false;
        M0(p0, null);
    }

    public void g0() {
        yr yrVar = this.x0;
        if (yrVar != null) {
            yrVar.c();
        }
    }

    public v j0(Menu menu) {
        v[] vVarArr = this.L0;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            v vVar = vVarArr[i2];
            if (vVar != null && vVar.j == menu) {
                return vVar;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.f3
    public View k(View view, String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.e1 == null) {
            String string = this.P.obtainStyledAttributes(x2.m.S0).getString(x2.m.f3);
            if (string == null) {
                this.e1 = new j3();
            } else {
                try {
                    this.e1 = (j3) this.P.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.e1 = new j3();
                }
            }
        }
        boolean z3 = I;
        if (z3) {
            if (this.f1 == null) {
                this.f1 = new k3();
            }
            if (this.f1.a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z2 = true;
                    }
                } else {
                    z2 = Q0((ViewParent) view);
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.e1.r(view, str, context, attributeSet, z, z3, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override // com.p7700g.p99005.f3
    @z1
    public <T extends View> T l(@m1 int i2) {
        h0();
        return (T) this.Q.findViewById(i2);
    }

    public final Context l0() {
        z2 q2 = q();
        Context u2 = q2 != null ? q2.u() : null;
        return u2 == null ? this.P : u2;
    }

    @Override // com.p7700g.p99005.f3
    public final a3.b n() {
        return new h();
    }

    @i2({i2.a.LIBRARY})
    @x1
    @r2
    public final r n0() {
        return o0(this.P);
    }

    @Override // com.p7700g.p99005.f3
    public int o() {
        return this.S0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return k(view, str, context, attributeSet);
    }

    @Override // com.p7700g.p99005.p4.a
    public boolean onMenuItemSelected(@x1 p4 p4Var, @x1 MenuItem menuItem) {
        v j0;
        Window.Callback s0 = s0();
        if (s0 == null || this.Q0 || (j0 = j0(p4Var.G())) == null) {
            return false;
        }
        return s0.onMenuItemSelected(j0.a, menuItem);
    }

    @Override // com.p7700g.p99005.p4.a
    public void onMenuModeChange(@x1 p4 p4Var) {
        N0(true);
    }

    @Override // com.p7700g.p99005.f3
    public MenuInflater p() {
        if (this.U == null) {
            t0();
            z2 z2Var = this.T;
            this.U = new g4(z2Var != null ? z2Var.u() : this.P);
        }
        return this.U;
    }

    public v p0(int i2, boolean z) {
        v[] vVarArr = this.L0;
        if (vVarArr == null || vVarArr.length <= i2) {
            v[] vVarArr2 = new v[i2 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.L0 = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i2];
        if (vVar == null) {
            v vVar2 = new v(i2);
            vVarArr[i2] = vVar2;
            return vVar2;
        }
        return vVar;
    }

    @Override // com.p7700g.p99005.f3
    public z2 q() {
        t0();
        return this.T;
    }

    public ViewGroup q0() {
        return this.A0;
    }

    @Override // com.p7700g.p99005.f3
    public boolean r(int i2) {
        boolean z;
        int O0 = O0(i2);
        if (O0 == 1) {
            z = this.J0;
        } else if (O0 == 2) {
            z = this.D0;
        } else if (O0 == 5) {
            z = this.E0;
        } else if (O0 == 10) {
            z = this.H0;
        } else if (O0 != 108) {
            z = O0 != 109 ? false : this.G0;
        } else {
            z = this.F0;
        }
        return z || this.Q.hasFeature(i2);
    }

    public final CharSequence r0() {
        Object obj = this.O;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.V;
    }

    @Override // com.p7700g.p99005.f3
    public void s() {
        LayoutInflater from = LayoutInflater.from(this.P);
        if (from.getFactory() == null) {
            qq.d(from, this);
        } else {
            boolean z = from.getFactory2() instanceof g3;
        }
    }

    public final Window.Callback s0() {
        return this.Q.getCallback();
    }

    @Override // com.p7700g.p99005.f3
    public void t() {
        if (K0() == null || q().x()) {
            return;
        }
        x0(0);
    }

    @Override // com.p7700g.p99005.f3
    public boolean v() {
        return this.y0;
    }

    @Override // com.p7700g.p99005.f3
    public void w(Configuration configuration) {
        z2 q2;
        if (this.F0 && this.z0 && (q2 = q()) != null) {
            q2.C(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.P);
        this.R0 = new Configuration(this.P.getResources().getConfiguration());
        S(false);
        configuration.updateFrom(this.P.getResources().getConfiguration());
    }

    @Override // com.p7700g.p99005.f3
    public void x(Bundle bundle) {
        this.O0 = true;
        S(false);
        i0();
        Object obj = this.O;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = gg.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                z2 K0 = K0();
                if (K0 == null) {
                    this.b1 = true;
                } else {
                    K0.R(true);
                }
            }
            f3.a(this);
        }
        this.R0 = new Configuration(this.P.getResources().getConfiguration());
        this.P0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // com.p7700g.p99005.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y() {
        z2 z2Var;
        if (this.O instanceof Activity) {
            f3.E(this);
        }
        if (this.Y0) {
            this.Q.getDecorView().removeCallbacks(this.a1);
        }
        this.Q0 = true;
        if (this.S0 != -100) {
            Object obj = this.O;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                H.put(this.O.getClass().getName(), Integer.valueOf(this.S0));
                z2Var = this.T;
                if (z2Var != null) {
                    z2Var.D();
                }
                Y();
            }
        }
        H.remove(this.O.getClass().getName());
        z2Var = this.T;
        if (z2Var != null) {
        }
        Y();
    }

    @Override // com.p7700g.p99005.f3
    public void z(Bundle bundle) {
        h0();
    }

    public int z0(@x1 Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return o0(context).c();
                    }
                    return -1;
                } else if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return m0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i2;
        }
        return -1;
    }

    public g3(Dialog dialog, e3 e3Var) {
        this(dialog.getContext(), dialog.getWindow(), e3Var, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public g3(Context context, Window window, e3 e3Var) {
        this(context, window, e3Var, context);
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class p extends i4 {
        private i t;
        private boolean u;
        private boolean v;
        private boolean w;

        public p(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.v = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.v = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.u = true;
                callback.onContentChanged();
            } finally {
                this.u = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.w = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.w = false;
            }
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.v) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return g3.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g3.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(@z1 i iVar) {
            this.t = iVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            f4.a aVar = new f4.a(g3.this.P, callback);
            b4 R = g3.this.R(aVar);
            if (R != null) {
                return aVar.e(R);
            }
            return null;
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public void onContentChanged() {
            if (this.u) {
                a().onContentChanged();
            }
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof p4)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            i iVar = this.t;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g3.this.G0(i);
            return true;
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.w) {
                a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            g3.this.H0(i);
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            p4 p4Var = menu instanceof p4 ? (p4) menu : null;
            if (i == 0 && p4Var == null) {
                return false;
            }
            boolean z = true;
            if (p4Var != null) {
                p4Var.i0(true);
            }
            i iVar = this.t;
            z = (iVar == null || !iVar.a(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (p4Var != null) {
                p4Var.i0(false);
            }
            return z;
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        @e2(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            p4 p4Var;
            v p0 = g3.this.p0(0, true);
            if (p0 != null && (p4Var = p0.j) != null) {
                super.onProvideKeyboardShortcuts(list, p4Var, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (g3.this.v()) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // com.p7700g.p99005.i4, android.view.Window.Callback
        @e2(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (g3.this.v() && i == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    public g3(Context context, Activity activity, e3 e3Var) {
        this(context, null, e3Var, activity);
    }

    private g3(Context context, Window window, e3 e3Var, Object obj) {
        y7<String, Integer> y7Var;
        Integer num;
        d3 T0;
        this.x0 = null;
        this.y0 = true;
        this.S0 = -100;
        this.a1 = new b();
        this.P = context;
        this.S = e3Var;
        this.O = obj;
        if (this.S0 == -100 && (obj instanceof Dialog) && (T0 = T0()) != null) {
            this.S0 = T0.c0().o();
        }
        if (this.S0 == -100 && (num = (y7Var = H).get(obj.getClass().getName())) != null) {
            this.S0 = num.intValue();
            y7Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            U(window);
        }
        AppCompatDrawableManager.preload();
    }
}