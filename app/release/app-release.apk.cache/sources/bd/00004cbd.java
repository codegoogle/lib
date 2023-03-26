package com.p7700g.p99005;

import com.google.gson.Gson;
import com.p7700g.p99005.dv5;
import com.p7700g.p99005.fr5;
import com.p7700g.p99005.yz5;
import java.util.concurrent.TimeUnit;

/* compiled from: ApiClient.java */
/* loaded from: classes3.dex */
public class kh3 {
    private static Gson a = new pv2().x().e();

    public static yz5 a() {
        dv5 dv5Var = new dv5();
        dv5Var.h(dv5.a.NONE);
        fr5.a aVar = new fr5.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new yz5.b().c(mf3.c).j(aVar.k(60L, timeUnit).j0(60L, timeUnit).R0(60L, timeUnit).c(dv5Var).f()).b(d06.g(a)).f();
    }
}