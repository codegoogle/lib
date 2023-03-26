package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.b03;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class r23 extends Activity implements yb3 {
    @NotNull
    public static final a s = new a(null);
    private boolean t;
    @Nullable
    private Ad u;
    @Nullable
    private n03 v;
    @Nullable
    private s23 w;
    @Nullable
    private ia3 x;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void i() {
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
            window.setLayout(-1, -1);
            window.setDimAmount(0.0f);
            window.addFlags(2);
            return;
        }
        xz2.c("BseActv", "[ERROR] getWindow method returned null");
    }

    @Override // com.p7700g.p99005.yb3
    public void a() {
        finish();
        overridePendingTransition(0, b03.a.A);
    }

    @Override // com.p7700g.p99005.yb3
    public boolean b() {
        return this.t;
    }

    @Override // com.p7700g.p99005.yb3
    @Nullable
    public n03 c() {
        return this.v;
    }

    @Override // com.p7700g.p99005.yb3
    @Nullable
    public Ad d() {
        return this.u;
    }

    @Override // com.p7700g.p99005.yb3
    public boolean e(@Nullable Bundle bundle) {
        if (bundle == null || !bundle.containsKey("restart")) {
            return false;
        }
        j(true);
        return true;
    }

    @Override // com.p7700g.p99005.yb3
    @NotNull
    public Activity f() {
        return this;
    }

    @Nullable
    public final ia3 g() {
        return this.x;
    }

    @Override // com.p7700g.p99005.yb3
    @NotNull
    public Context getContext() {
        Context applicationContext = getApplicationContext();
        c25.o(applicationContext, "this.applicationContext");
        return applicationContext;
    }

    @Nullable
    public final s23 h() {
        return this.w;
    }

    public void j(boolean z) {
        this.t = z;
    }

    public void k(@Nullable Ad ad) {
        this.u = ad;
    }

    public final void l(@Nullable ia3 ia3Var) {
        this.x = ia3Var;
    }

    public void m(@Nullable n03 n03Var) {
        this.v = n03Var;
    }

    public final void n(@Nullable s23 s23Var) {
        this.w = s23Var;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        a();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Bundle extras = getIntent().getExtras();
        Bundle bundle2 = extras == null ? null : extras.getBundle("bundle");
        if (bundle2 != null) {
            m((n03) bundle2.getParcelable("unit_confid"));
            n03 c = c();
            if (c != null) {
                l(gc3.s.a().b(c));
                ia3 g = g();
                k(g != null ? g.c() : null);
            }
        }
        i();
        setFinishOnTouchOutside(true);
        overridePendingTransition(b03.a.z, 0);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        c25.p(bundle, "outState");
        bundle.putString("restart", "oncreatealreadycalled");
        super.onSaveInstanceState(bundle);
    }
}