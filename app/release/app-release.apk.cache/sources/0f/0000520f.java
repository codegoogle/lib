package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.p7700g.p99005.xu0;
import java.util.concurrent.Callable;

/* compiled from: StartArgumentsHelper.java */
/* loaded from: classes2.dex */
public class nb1 {
    @x1
    private final Context a;

    public nb1(@x1 Context context) {
        this.a = context;
    }

    private boolean b(@x1 @xu0.d String str) {
        return xu0.e.a.equals(str) || xu0.e.c.equals(str) || xu0.e.b.equals(str) || xu0.e.d.equals(str);
    }

    @x1
    public ve1 a(@x1 String str, @x1 @xu0.d String str2, @x1 co1 co1Var, @x1 Bundle bundle, @x1 ti1 ti1Var) {
        Bundle bundle2 = new Bundle(bundle);
        if (b(str2)) {
            bundle2.putString(xu0.f.A, ti1Var.d());
        } else {
            ve1 c = c();
            if (c != null) {
                Bundle d = c.d();
                if (d.containsKey(xu0.f.A)) {
                    bundle2.putString(xu0.f.A, d.getString(xu0.f.A));
                }
            }
        }
        if (!bundle2.containsKey(xu0.f.A)) {
            bundle2.putString(xu0.f.A, ti1Var.d());
        }
        return ve1.k().m(str).l(str2).h(co1Var).i(bundle2).g();
    }

    @z1
    public ve1 c() {
        Bundle call = this.a.getContentResolver().call(CredentialsContentProvider.d(this.a), CredentialsContentProvider.y, (String) null, new Bundle());
        if (call == null) {
            return null;
        }
        call.setClassLoader(AFVpnService.class.getClassLoader());
        return (ve1) call.getParcelable("response");
    }

    @x1
    public dq0<ve1> d() {
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.fb1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nb1.this.c();
            }
        });
    }

    public void e(@z1 ve1 ve1Var) {
        if (ve1Var != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(CredentialsContentProvider.A, ve1Var);
            this.a.getContentResolver().call(CredentialsContentProvider.d(this.a), CredentialsContentProvider.x, (String) null, bundle);
        }
    }
}