package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.sf;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class hx extends ComponentActivity implements sf.i, sf.k {
    public static final String K = "android:support:fragments";
    public final kx L;
    public final rz M;
    public boolean N;
    public boolean O;
    public boolean P;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a implements f60.c {
        public a() {
        }

        @Override // com.p7700g.p99005.f60.c
        @x1
        public Bundle a() {
            Bundle bundle = new Bundle();
            hx.this.O();
            hx.this.M.j(mz.b.ON_STOP);
            Parcelable P = hx.this.L.P();
            if (P != null) {
                bundle.putParcelable(hx.K, P);
            }
            return bundle;
        }
    }

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class b implements c0 {
        public b() {
        }

        @Override // com.p7700g.p99005.c0
        public void a(@x1 Context context) {
            hx.this.L.a(null);
            Bundle a = hx.this.getSavedStateRegistry().a(hx.K);
            if (a != null) {
                hx.this.L.L(a.getParcelable(hx.K));
            }
        }
    }

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class c extends mx<hx> implements q00, x, h0, tx {
        public c() {
            super(hx.this);
        }

        @Override // com.p7700g.p99005.tx
        public void a(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
            hx.this.Q(fragment);
        }

        @Override // com.p7700g.p99005.x
        @x1
        public OnBackPressedDispatcher c() {
            return hx.this.c();
        }

        @Override // com.p7700g.p99005.mx, com.p7700g.p99005.jx
        @z1
        public View d(int i) {
            return hx.this.findViewById(i);
        }

        @Override // com.p7700g.p99005.mx, com.p7700g.p99005.jx
        public boolean e() {
            Window window = hx.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // com.p7700g.p99005.qz
        @x1
        public mz getLifecycle() {
            return hx.this.M;
        }

        @Override // com.p7700g.p99005.q00
        @x1
        public p00 getViewModelStore() {
            return hx.this.getViewModelStore();
        }

        @Override // com.p7700g.p99005.mx
        public void i(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
            hx.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // com.p7700g.p99005.mx
        @x1
        public LayoutInflater k() {
            return hx.this.getLayoutInflater().cloneInContext(hx.this);
        }

        @Override // com.p7700g.p99005.mx
        public int l() {
            Window window = hx.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // com.p7700g.p99005.h0
        @x1
        public ActivityResultRegistry m() {
            return hx.this.m();
        }

        @Override // com.p7700g.p99005.mx
        public boolean n() {
            return hx.this.getWindow() != null;
        }

        @Override // com.p7700g.p99005.mx
        public boolean p(@x1 Fragment fragment) {
            return !hx.this.isFinishing();
        }

        @Override // com.p7700g.p99005.mx
        public boolean q(@x1 String str) {
            return sf.L(hx.this, str);
        }

        @Override // com.p7700g.p99005.mx
        public void u() {
            hx.this.Z();
        }

        @Override // com.p7700g.p99005.mx
        /* renamed from: v */
        public hx j() {
            return hx.this;
        }
    }

    public hx() {
        this.L = kx.b(new c());
        this.M = new rz(this);
        this.P = true;
        N();
    }

    private void N() {
        getSavedStateRegistry().j(K, new a());
        v(new b());
    }

    private static boolean P(FragmentManager fragmentManager, mz.c cVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.G0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= P(fragment.getChildFragmentManager(), cVar);
                }
                hy hyVar = fragment.mViewLifecycleOwner;
                if (hyVar != null && hyVar.getLifecycle().b().a(mz.c.STARTED)) {
                    fragment.mViewLifecycleOwner.g(cVar);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.b().a(mz.c.STARTED)) {
                    fragment.mLifecycleRegistry.q(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @z1
    public final View K(@z1 View view, @x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        return this.L.G(view, str, context, attributeSet);
    }

    @x1
    public FragmentManager L() {
        return this.L.D();
    }

    @x1
    @Deprecated
    public j10 M() {
        return j10.d(this);
    }

    public void O() {
        do {
        } while (P(L(), mz.c.CREATED));
    }

    @u1
    @Deprecated
    public void Q(@x1 Fragment fragment) {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public boolean R(@z1 View view, @x1 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void S() {
        this.M.j(mz.b.ON_RESUME);
        this.L.r();
    }

    public void T(@z1 yg ygVar) {
        sf.H(this, ygVar);
    }

    public void U(@z1 yg ygVar) {
        sf.I(this, ygVar);
    }

    public void V(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        W(fragment, intent, i, null);
    }

    public void W(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @z1 Bundle bundle) {
        if (i == -1) {
            sf.M(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void X(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @z1 Intent intent, int i2, int i3, int i4, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            sf.N(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void Y() {
        sf.w(this);
    }

    @Deprecated
    public void Z() {
        invalidateOptionsMenu();
    }

    @Override // com.p7700g.p99005.sf.k
    @Deprecated
    public final void a(int i) {
    }

    public void a0() {
        sf.C(this);
    }

    public void b0() {
        sf.O(this);
    }

    @Override // android.app.Activity
    public void dump(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + g54.A;
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.N);
        printWriter.print(" mResumed=");
        printWriter.print(this.O);
        printWriter.print(" mStopped=");
        printWriter.print(this.P);
        if (getApplication() != null) {
            j10.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.L.D().b0(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @t0
    public void onActivityResult(int i, int i2, @z1 Intent intent) {
        this.L.F();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@x1 Configuration configuration) {
        this.L.F();
        super.onConfigurationChanged(configuration);
        this.L.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        this.M.j(mz.b.ON_CREATE);
        this.L.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @x1 Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.L.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @z1
    public View onCreateView(@z1 View view, @x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        View K2 = K(view, str, context, attributeSet);
        return K2 == null ? super.onCreateView(view, str, context, attributeSet) : K2;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.L.h();
        this.M.j(mz.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.L.j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @x1 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.L.e(menuItem);
        }
        return this.L.l(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @t0
    public void onMultiWindowModeChanged(boolean z) {
        this.L.k(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @t0
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.L.F();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @x1 Menu menu) {
        if (i == 0) {
            this.L.m(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.O = false;
        this.L.n();
        this.M.j(mz.b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @t0
    public void onPictureInPictureModeChanged(boolean z) {
        this.L.o(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        S();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @z1 View view, @x1 Menu menu) {
        if (i == 0) {
            return R(view, menu) | this.L.p(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @t0
    public void onRequestPermissionsResult(int i, @x1 String[] strArr, @x1 int[] iArr) {
        this.L.F();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.L.F();
        super.onResume();
        this.O = true;
        this.L.z();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.L.F();
        super.onStart();
        this.P = false;
        if (!this.N) {
            this.N = true;
            this.L.c();
        }
        this.L.z();
        this.M.j(mz.b.ON_START);
        this.L.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.L.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.P = true;
        O();
        this.L.t();
        this.M.j(mz.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @z1
    public View onCreateView(@x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        View K2 = K(null, str, context, attributeSet);
        return K2 == null ? super.onCreateView(str, context, attributeSet) : K2;
    }

    @z0
    public hx(@s1 int i) {
        super(i);
        this.L = kx.b(new c());
        this.M = new rz(this);
        this.P = true;
        N();
    }
}