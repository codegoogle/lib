package com.p7700g.p99005;

/* compiled from: CookieProvider.java */
/* loaded from: classes3.dex */
public class hu3 implements yx3<pm4> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return cls == pm4.class;
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public pm4 a(String str) {
        if (str != null) {
            return kt3.y(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(pm4 pm4Var) {
        StringBuilder G = wo1.G("$Version=");
        G.append(pm4Var.e());
        G.append(';');
        G.append(pm4Var.b());
        G.append('=');
        qu3.d(G, pm4Var.d());
        if (pm4Var.a() != null) {
            G.append(";$Domain=");
            qu3.d(G, pm4Var.a());
        }
        if (pm4Var.c() != null) {
            G.append(";$Path=");
            qu3.d(G, pm4Var.c());
        }
        return G.toString();
    }
}