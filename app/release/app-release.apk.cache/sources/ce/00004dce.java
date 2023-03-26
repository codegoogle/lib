package com.p7700g.p99005;

import com.google.gson.Gson;
import com.p7700g.p99005.x31;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CnlLocalRepository.java */
/* loaded from: classes.dex */
public class l21 implements n21 {
    @x1
    public static final String b = "data:cnl:config:local";
    @x1
    private final Gson c;
    @x1
    private final x31 d;

    /* compiled from: CnlLocalRepository.java */
    /* loaded from: classes.dex */
    public class a extends lx2<List<j21>> {
        public a() {
        }
    }

    public l21(@x1 Gson gson, @x1 x31 x31Var) {
        this.c = gson;
        this.d = x31Var;
    }

    @Override // com.p7700g.p99005.n21
    public List<j21> a(@x1 String str) {
        x31 x31Var = this.d;
        List<j21> list = (List) this.c.o(x31Var.e(b + str, ""), new a().g());
        return list == null ? new ArrayList() : list;
    }

    @Override // com.p7700g.p99005.n21
    public void b(@x1 String str, @x1 List<j21> list) {
        String z = this.c.z(list);
        x31.a c = this.d.c();
        c.b(b + str, z).a();
    }

    @Override // com.p7700g.p99005.n21
    public void clear(@x1 String str) {
        x31.a c = this.d.c();
        c.remove(b + str).a();
    }
}