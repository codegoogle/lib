package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.anchorfree.vpnsdk.vpnservice.credentials.DefaultCaptivePortalChecker;
import com.p7700g.p99005.xu0;
import java.util.concurrent.Callable;

/* compiled from: ServiceCredentials.java */
/* loaded from: classes2.dex */
public class jb1 {
    @x1
    private do1 a = new DefaultCaptivePortalChecker();
    @x1
    private final Context b;
    private final td1 c;

    /* compiled from: ServiceCredentials.java */
    /* loaded from: classes2.dex */
    public class a implements va1 {
        public final /* synthetic */ eq0 b;

        public a(eq0 eq0Var) {
            jb1.this = r1;
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.b.f(gc1Var);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            this.b.g(null);
        }
    }

    public jb1(@x1 Context context, @x1 td1 td1Var) {
        this.b = context;
        this.c = td1Var;
    }

    public static /* synthetic */ fo1 c(Bundle bundle, String str, ti1 ti1Var, Context context, boolean z, co1 co1Var, String str2) throws Exception {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(CredentialsContentProvider.z, str);
        bundle2.putParcelable(CredentialsContentProvider.B, ti1Var);
        Bundle call = context.getContentResolver().call(CredentialsContentProvider.d(context), z ? CredentialsContentProvider.v : CredentialsContentProvider.u, (String) null, bundle2);
        if (call != null) {
            call.setClassLoader(AFVpnService.class.getClassLoader());
            go1 go1Var = (go1) call.getParcelable("response");
            if (go1Var != null) {
                fo1 fo1Var = new fo1(co1Var, go1Var.t, go1Var.u, go1Var.v, go1Var.x, ti1Var, go1Var.y, go1Var.z);
                fo1Var.y.putString("reason", str2);
                if (!str.isEmpty()) {
                    fo1Var.y.putString(xu0.f.y, str);
                } else {
                    fo1Var.y.putString(xu0.f.y, xu0.f.z);
                }
                if (!fo1Var.y.containsKey(xu0.f.A)) {
                    fo1Var.y.putString(xu0.f.A, bundle.getString(xu0.f.A));
                }
                return fo1Var;
            }
            Throwable th = (Throwable) call.getSerializable("exception");
            if (th == null) {
                th = zb1.f();
            }
            if (th instanceof gc1) {
                throw ((gc1) th);
            }
            throw new ub1(th);
        }
        throw zb1.g();
    }

    public void a() {
        this.b.getContentResolver().call(CredentialsContentProvider.d(this.b), CredentialsContentProvider.t, (String) null, Bundle.EMPTY);
    }

    @x1
    public dq0<Void> b(@x1 Bundle bundle, @x1 wp0 wp0Var) {
        final eq0 eq0Var = new eq0();
        wp0Var.b(new Runnable() { // from class: com.p7700g.p99005.hb1
            @Override // java.lang.Runnable
            public final void run() {
                eq0.this.e();
            }
        });
        try {
            this.a.a(this.b, this.c, new a(eq0Var), bundle);
            return eq0Var.a();
        } catch (Throwable unused) {
            return dq0.D(null);
        }
    }

    @x1
    public dq0<fo1> d(@x1 final Context context, @x1 final String str, @x1 final String str2, @x1 final ti1 ti1Var, @x1 final co1 co1Var, @x1 final Bundle bundle, final boolean z, @z1 wp0 wp0Var) {
        return dq0.f(new Callable() { // from class: com.p7700g.p99005.gb1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jb1.c(bundle, str, ti1Var, context, z, co1Var, str2);
            }
        }, dq0.a, wp0Var);
    }

    @x1
    public dq0<fo1> e(@x1 dq0<fo1> dq0Var, @x1 String str, @x1 Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(CredentialsContentProvider.z, str);
        this.b.getContentResolver().call(CredentialsContentProvider.d(this.b), CredentialsContentProvider.w, (String) null, bundle2);
        return dq0Var;
    }

    public void f(@x1 do1 do1Var) {
        this.a = do1Var;
    }
}