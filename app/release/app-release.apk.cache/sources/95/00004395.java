package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.partner.celpher.PartnerCelpher;
import com.p7700g.p99005.bt0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: CarrierFactory.java */
/* loaded from: classes.dex */
public class g21 {
    public static x11 a(@x1 Context context, @x1 ClientInfo clientInfo, @x1 String str, @x1 String str2, @x1 v41 v41Var, @x1 Executor executor) {
        x31 x31Var = (x31) i61.a().d(x31.class);
        h31 h31Var = (h31) i61.a().d(h31.class);
        a31 a31Var = new a31(x31Var, clientInfo.getCarrierId());
        w11 w11Var = new w11(x31Var, clientInfo.getCarrierId());
        br0 a = ((cr0) i61.a().d(cr0.class)).a(context, clientInfo);
        return new e21(new fr0().e(a31Var).m(w11Var).d(clientInfo).j((ot0) i61.a().d(ot0.class)).i(context).h(str).b(str2).g(new c51(context, v41Var, (bt0.e) i61.a().b(bt0.e.class)).a()).n(a).l(new PartnerCelpher(context)).c(), x31Var, clientInfo, (u41) i61.a().d(u41.class), h31Var, a, executor, Executors.newSingleThreadExecutor());
    }
}