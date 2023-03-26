package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;
import com.p7700g.p99005.j41;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: RemoteConfigUrlProvider.java */
/* loaded from: classes.dex */
public class z71 extends w71 {
    @x1
    private final i41 g;

    public z71(@x1 Gson gson, @x1 o51 o51Var, @x1 s41 s41Var, @x1 i41 i41Var, @x1 h31 h31Var) {
        super(gson, o51Var, s41Var, h31Var);
        this.g = i41Var;
    }

    @z1
    private List<mr0> h() {
        dq0<TContinuationResult> q = this.e.q0().q(new aq0() { // from class: com.p7700g.p99005.u71
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return z71.this.j(dq0Var);
            }
        });
        try {
            q.Z(10L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            w71.a.f(th);
        }
        return (List) q.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ List j(dq0 dq0Var) throws Exception {
        ArrayList arrayList = new ArrayList();
        List<ClientInfo> list = (List) dq0Var.F();
        if (list != null) {
            for (ClientInfo clientInfo : list) {
                mr0 g = new RemoteConfigRepository(this.c, this.g, clientInfo.getCarrierId()).g();
                if (g != null) {
                    arrayList.add(g);
                }
            }
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.w71
    @z1
    public String f() {
        j41.a a;
        j41.b a2;
        en1 b = b();
        List<mr0> h = h();
        if (h == null) {
            return super.f();
        }
        for (mr0 mr0Var : h) {
            try {
                j41 j41Var = (j41) this.c.n(mr0Var.f(), j41.class);
                if (j41Var != null && (a = j41Var.a()) != null && (a2 = a.a()) != null && a2.e()) {
                    List<String> d = a2.d(b != en1.CONNECTED);
                    kj1 kj1Var = w71.a;
                    kj1Var.c("Got domains from remote config: %s", TextUtils.join(", ", d));
                    String c = c(a2, d);
                    kj1Var.c("Return url from remote config: %s state: %s", c, b);
                    if (!TextUtils.isEmpty(c)) {
                        return c;
                    }
                }
            } catch (Throwable th) {
                w71.a.f(th);
            }
        }
        return super.f();
    }
}