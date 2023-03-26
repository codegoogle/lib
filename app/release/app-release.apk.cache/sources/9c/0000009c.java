package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import com.p7700g.p99005.a0;
import com.p7700g.p99005.b0;
import com.p7700g.p99005.b00;
import com.p7700g.p99005.bg;
import com.p7700g.p99005.c0;
import com.p7700g.p99005.d00;
import com.p7700g.p99005.d10;
import com.p7700g.p99005.e0;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f0;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.fg;
import com.p7700g.p99005.g0;
import com.p7700g.p99005.g00;
import com.p7700g.p99005.g60;
import com.p7700g.p99005.h0;
import com.p7700g.p99005.h60;
import com.p7700g.p99005.i0;
import com.p7700g.p99005.i60;
import com.p7700g.p99005.j0;
import com.p7700g.p99005.j70;
import com.p7700g.p99005.k0;
import com.p7700g.p99005.lz;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.mh;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.nh;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.p00;
import com.p7700g.p99005.q00;
import com.p7700g.p99005.qg;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.r00;
import com.p7700g.p99005.rg;
import com.p7700g.p99005.rz;
import com.p7700g.p99005.s1;
import com.p7700g.p99005.sf;
import com.p7700g.p99005.sg;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.t00;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.uf;
import com.p7700g.p99005.ug;
import com.p7700g.p99005.uq;
import com.p7700g.p99005.vo;
import com.p7700g.p99005.vq;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z;
import com.p7700g.p99005.z0;
import com.p7700g.p99005.z00;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zq;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends bg implements a0, qz, q00, lz, h60, x, h0, f0, mh, nh, rg, qg, sg, uq {
    private static final String u = "android:support:activity-result";
    private m00.b A;
    private final OnBackPressedDispatcher B;
    @s1
    private int C;
    private final AtomicInteger D;
    private final ActivityResultRegistry E;
    private final CopyOnWriteArrayList<vo<Configuration>> F;
    private final CopyOnWriteArrayList<vo<Integer>> G;
    private final CopyOnWriteArrayList<vo<Intent>> H;
    private final CopyOnWriteArrayList<vo<fg>> I;
    private final CopyOnWriteArrayList<vo<ug>> J;
    public final b0 v;
    private final vq w;
    private final rz x;
    public final g60 y;
    private p00 z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ int s;
            public final /* synthetic */ j0.a t;

            public a(int i, j0.a aVar) {
                this.s = i;
                this.t = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.s, this.t.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0002b implements Runnable {
            public final /* synthetic */ int s;
            public final /* synthetic */ IntentSender.SendIntentException t;

            public RunnableC0002b(int i, IntentSender.SendIntentException sendIntentException) {
                this.s = i;
                this.t = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.s, 0, new Intent().setAction(k0.l.b).putExtra(k0.l.d, this.t));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i, @x1 j0<I, O> j0Var, I i2, @z1 uf ufVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            j0.a<O> b = j0Var.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, b));
                return;
            }
            Intent a2 = j0Var.a(componentActivity, i2);
            Bundle bundle = null;
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra(k0.k.b)) {
                bundle = a2.getBundleExtra(k0.k.b);
                a2.removeExtra(k0.k.b);
            } else if (ufVar != null) {
                bundle = ufVar.l();
            }
            Bundle bundle2 = bundle;
            if (k0.i.b.equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra(k0.i.c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                sf.F(componentActivity, stringArrayExtra, i);
            } else if (k0.l.b.equals(a2.getAction())) {
                i0 i0Var = (i0) a2.getParcelableExtra(k0.l.c);
                try {
                    sf.N(componentActivity, i0Var.g(), i, i0Var.c(), i0Var.d(), i0Var.e(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0002b(i, e));
                }
            } else {
                sf.M(componentActivity, a2, i, bundle2);
            }
        }
    }

    @e2(19)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public Object a;
        public p00 b;
    }

    public ComponentActivity() {
        this.v = new b0();
        this.w = new vq(new Runnable() { // from class: com.p7700g.p99005.q
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.x = new rz(this);
        g60 a2 = g60.a(this);
        this.y = a2;
        this.B = new OnBackPressedDispatcher(new a());
        this.D = new AtomicInteger();
        this.E = new b();
        this.F = new CopyOnWriteArrayList<>();
        this.G = new CopyOnWriteArrayList<>();
        this.H = new CopyOnWriteArrayList<>();
        this.I = new CopyOnWriteArrayList<>();
        this.J = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().a(new oz() { // from class: androidx.activity.ComponentActivity.3
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                    if (bVar == mz.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            c.a(peekDecorView);
                        }
                    }
                }
            });
            getLifecycle().a(new oz() { // from class: androidx.activity.ComponentActivity.4
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                    if (bVar == mz.b.ON_DESTROY) {
                        ComponentActivity.this.v.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new oz() { // from class: androidx.activity.ComponentActivity.5
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                    ComponentActivity.this.C();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            a2.c();
            d00.c(this);
            if (i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().j(u, new f60.c() { // from class: com.p7700g.p99005.s
                @Override // com.p7700g.p99005.f60.c
                public final Bundle a() {
                    return ComponentActivity.this.G();
                }
            });
            v(new c0() { // from class: com.p7700g.p99005.r
                @Override // com.p7700g.p99005.c0
                public final void a(Context context) {
                    ComponentActivity.this.I(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void E() {
        r00.b(getWindow().getDecorView(), this);
        t00.b(getWindow().getDecorView(), this);
        i60.b(getWindow().getDecorView(), this);
        z.b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Bundle G() {
        Bundle bundle = new Bundle();
        this.E.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void I(Context context) {
        Bundle a2 = getSavedStateRegistry().a(u);
        if (a2 != null) {
            this.E.g(a2);
        }
    }

    public void C() {
        if (this.z == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.z = dVar.b;
            }
            if (this.z == null) {
                this.z = new p00();
            }
        }
    }

    @z1
    @Deprecated
    public Object D() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }

    @z1
    @Deprecated
    public Object J() {
        return null;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        super.addContentView(view, layoutParams);
    }

    @Override // com.p7700g.p99005.uq
    public void addMenuProvider(@x1 zq zqVar) {
        this.w.a(zqVar);
    }

    @Override // com.p7700g.p99005.x
    @x1
    public final OnBackPressedDispatcher c() {
        return this.B;
    }

    @Override // com.p7700g.p99005.mh
    public final void d(@x1 vo<Configuration> voVar) {
        this.F.add(voVar);
    }

    @Override // com.p7700g.p99005.sg
    public final void g(@x1 vo<ug> voVar) {
        this.J.remove(voVar);
    }

    @Override // com.p7700g.p99005.lz
    @x1
    public m00.b getDefaultViewModelProviderFactory() {
        if (this.A == null) {
            this.A = new g00(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.A;
    }

    @Override // com.p7700g.p99005.bg, com.p7700g.p99005.qz
    @x1
    public mz getLifecycle() {
        return this.x;
    }

    @Override // com.p7700g.p99005.h60
    @x1
    public final f60 getSavedStateRegistry() {
        return this.y.b();
    }

    @Override // com.p7700g.p99005.q00
    @x1
    public p00 getViewModelStore() {
        if (getApplication() != null) {
            C();
            return this.z;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // com.p7700g.p99005.nh
    public final void h(@x1 vo<Integer> voVar) {
        this.G.remove(voVar);
    }

    @Override // com.p7700g.p99005.a0
    public final void i(@x1 c0 c0Var) {
        this.v.e(c0Var);
    }

    @Override // com.p7700g.p99005.uq
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // com.p7700g.p99005.lz
    @x1
    @t0
    public z00 j() {
        d10 d10Var = new d10();
        if (getApplication() != null) {
            d10Var.c(m00.a.h, getApplication());
        }
        d10Var.c(d00.c, this);
        d10Var.c(d00.d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            d10Var.c(d00.e, getIntent().getExtras());
        }
        return d10Var;
    }

    @Override // com.p7700g.p99005.a0
    @z1
    public Context k() {
        return this.v.d();
    }

    @Override // com.p7700g.p99005.sg
    public final void l(@x1 vo<ug> voVar) {
        this.J.add(voVar);
    }

    @Override // com.p7700g.p99005.h0
    @x1
    public final ActivityResultRegistry m() {
        return this.E;
    }

    @Override // com.p7700g.p99005.qg
    public final void n(@x1 vo<fg> voVar) {
        this.I.add(voVar);
    }

    @Override // android.app.Activity
    @t0
    @Deprecated
    public void onActivityResult(int i, int i2, @z1 Intent intent) {
        if (this.E.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @u1
    public void onBackPressed() {
        this.B.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @t0
    public void onConfigurationChanged(@x1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<vo<Configuration>> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(@z1 Bundle bundle) {
        this.y.d(bundle);
        this.v.c(this);
        super.onCreate(bundle);
        b00.g(this);
        int i = this.C;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @x1 Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.w.h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @x1 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.w.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @t0
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<vo<fg>> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().accept(new fg(z));
        }
    }

    @Override // android.app.Activity
    @t0
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<vo<Intent>> it = this.H.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @x1 Menu menu) {
        this.w.i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @t0
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<vo<ug>> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().accept(new ug(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @z1 View view, @x1 Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.w.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @t0
    @Deprecated
    public void onRequestPermissionsResult(int i, @x1 String[] strArr, @x1 int[] iArr) {
        if (this.E.b(i, -1, new Intent().putExtra(k0.i.c, strArr).putExtra(k0.i.d, iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    @z1
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object J = J();
        p00 p00Var = this.z;
        if (p00Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            p00Var = dVar.b;
        }
        if (p00Var == null && J == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.a = J;
        dVar2.b = p00Var;
        return dVar2;
    }

    @Override // com.p7700g.p99005.bg, android.app.Activity
    @t0
    public void onSaveInstanceState(@x1 Bundle bundle) {
        mz lifecycle = getLifecycle();
        if (lifecycle instanceof rz) {
            ((rz) lifecycle).q(mz.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.y.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @t0
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<vo<Integer>> it = this.G.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // com.p7700g.p99005.rg
    public final void p(@x1 vo<Intent> voVar) {
        this.H.remove(voVar);
    }

    @Override // com.p7700g.p99005.mh
    public final void r(@x1 vo<Configuration> voVar) {
        this.F.remove(voVar);
    }

    @Override // com.p7700g.p99005.f0
    @x1
    public final <I, O> g0<I> registerForActivityResult(@x1 j0<I, O> j0Var, @x1 ActivityResultRegistry activityResultRegistry, @x1 e0<O> e0Var) {
        StringBuilder G = wo1.G("activity_rq#");
        G.append(this.D.getAndIncrement());
        return activityResultRegistry.j(G.toString(), this, j0Var, e0Var);
    }

    @Override // com.p7700g.p99005.uq
    public void removeMenuProvider(@x1 zq zqVar) {
        this.w.l(zqVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (j70.h()) {
                j70.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            j70.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@s1 int i) {
        E();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @z1 Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // com.p7700g.p99005.nh
    public final void t(@x1 vo<Integer> voVar) {
        this.G.add(voVar);
    }

    @Override // com.p7700g.p99005.rg
    public final void u(@x1 vo<Intent> voVar) {
        this.H.add(voVar);
    }

    @Override // com.p7700g.p99005.a0
    public final void v(@x1 c0 c0Var) {
        this.v.a(c0Var);
    }

    @Override // com.p7700g.p99005.qg
    public final void w(@x1 vo<fg> voVar) {
        this.I.remove(voVar);
    }

    @Override // com.p7700g.p99005.uq
    public void addMenuProvider(@x1 zq zqVar, @x1 qz qzVar) {
        this.w.b(zqVar, qzVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @z1 Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @z1 Intent intent, int i2, int i3, int i4, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // com.p7700g.p99005.uq
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@x1 zq zqVar, @x1 qz qzVar, @x1 mz.c cVar) {
        this.w.c(zqVar, qzVar, cVar);
    }

    @Override // android.app.Activity
    @e2(api = 26)
    @t0
    public void onMultiWindowModeChanged(boolean z, @x1 Configuration configuration) {
        Iterator<vo<fg>> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().accept(new fg(z, configuration));
        }
    }

    @Override // android.app.Activity
    @e2(api = 26)
    @t0
    public void onPictureInPictureModeChanged(boolean z, @x1 Configuration configuration) {
        Iterator<vo<ug>> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().accept(new ug(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        E();
        super.setContentView(view);
    }

    @Override // com.p7700g.p99005.f0
    @x1
    public final <I, O> g0<I> registerForActivityResult(@x1 j0<I, O> j0Var, @x1 e0<O> e0Var) {
        return registerForActivityResult(j0Var, this.E, e0Var);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        super.setContentView(view, layoutParams);
    }

    @z0
    public ComponentActivity(@s1 int i) {
        this();
        this.C = i;
    }
}