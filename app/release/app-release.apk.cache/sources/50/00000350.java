package com.anchorfree.vpnsdk.reconnect;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.vpnsdk.reconnect.SDKCaptivePortalChecker;
import com.anchorfree.vpnsdk.vpnservice.credentials.DefaultCaptivePortalChecker;
import com.p7700g.p99005.aq0;
import com.p7700g.p99005.do1;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.eo1;
import com.p7700g.p99005.eq0;
import com.p7700g.p99005.fc1;
import com.p7700g.p99005.g51;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.va1;
import com.p7700g.p99005.wp0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yp0;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SDKCaptivePortalChecker implements do1 {
    @x1
    private static final kj1 a = kj1.b("SDKCaptivePortalChecker");
    @x1
    private final do1 b = new DefaultCaptivePortalChecker();
    @x1
    private final h51 c = (h51) i61.a().d(h51.class);
    @x1
    private final o51 d = (o51) i61.a().d(o51.class);

    /* loaded from: classes2.dex */
    public class a implements va1 {
        public final /* synthetic */ eq0 b;

        public a(eq0 eq0Var) {
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.b.f(gc1Var);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            this.b.g(Boolean.TRUE);
        }
    }

    @x1
    private gc1 b(@x1 Bundle bundle, @x1 g51 g51Var, @z1 gc1 gc1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("partner_carrier", g51Var.a().getCarrierId());
        if (bundle.containsKey(xu0.f.A)) {
            hashMap.put(xu0.f.A, bundle.getString(xu0.f.A));
        }
        if (gc1Var instanceof fc1) {
            hashMap.putAll(((fc1) gc1Var).f());
        }
        return new fc1(hashMap, new eo1());
    }

    private void c(@x1 Context context, @x1 final g51 g51Var, @x1 final Bundle bundle, @z1 td1 td1Var, @x1 final va1 va1Var) {
        final eq0 eq0Var = new eq0();
        yp0 yp0Var = new yp0();
        wp0 j = yp0Var.j();
        yp0Var.e(TimeUnit.SECONDS.toMillis(10L));
        j.b(new Runnable() { // from class: com.p7700g.p99005.ke1
            @Override // java.lang.Runnable
            public final void run() {
                eq0.this.e();
            }
        });
        this.b.a(context, td1Var, new a(eq0Var), bundle);
        eq0Var.a().q(new aq0() { // from class: com.p7700g.p99005.je1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                SDKCaptivePortalChecker.this.g(va1Var, bundle, g51Var, dq0Var);
                return null;
            }
        });
    }

    private /* synthetic */ Object d(va1 va1Var, Bundle bundle, g51 g51Var, Context context, td1 td1Var, dq0 dq0Var) throws Exception {
        if (dq0Var.F() == Boolean.TRUE) {
            va1Var.a(b(bundle, g51Var, null));
        } else {
            c(context, g51Var, bundle, td1Var, va1Var);
        }
        return null;
    }

    private /* synthetic */ Object f(va1 va1Var, Bundle bundle, g51 g51Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            a.e("Check failed", dq0Var.E());
            va1Var.a(b(bundle, g51Var, gc1.cast(dq0Var.E())));
            return null;
        } else if (dq0Var.H()) {
            a.e("Check cancelled", new Object[0]);
            va1Var.complete();
            return null;
        } else {
            a.c("Check completed", new Object[0]);
            va1Var.complete();
            return null;
        }
    }

    @Override // com.p7700g.p99005.do1
    public void a(@x1 final Context context, @z1 final td1 td1Var, @x1 final va1 va1Var, @x1 final Bundle bundle) {
        final g51 h = this.c.h(bundle);
        try {
            this.d.f().q(new aq0() { // from class: com.p7700g.p99005.ie1
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    SDKCaptivePortalChecker.this.e(va1Var, bundle, h, context, td1Var, dq0Var);
                    return null;
                }
            });
        } catch (Throwable unused) {
            c(context, h, bundle, td1Var, va1Var);
        }
    }

    public /* synthetic */ Object e(va1 va1Var, Bundle bundle, g51 g51Var, Context context, td1 td1Var, dq0 dq0Var) {
        d(va1Var, bundle, g51Var, context, td1Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object g(va1 va1Var, Bundle bundle, g51 g51Var, dq0 dq0Var) {
        f(va1Var, bundle, g51Var, dq0Var);
        return null;
    }
}