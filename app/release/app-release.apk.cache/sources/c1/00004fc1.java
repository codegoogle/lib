package com.p7700g.p99005;

import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CnlRemoteRepository.java */
/* loaded from: classes.dex */
public class m21 implements n21 {
    @x1
    private final c81 b;
    @x1
    private final x31 c;

    /* compiled from: CnlRemoteRepository.java */
    /* loaded from: classes.dex */
    public class a extends lx2<List<j21>> {
        public a() {
        }
    }

    public m21(@x1 c81 c81Var, @x1 x31 x31Var) {
        this.b = c81Var;
        this.c = x31Var;
    }

    @Override // com.p7700g.p99005.n21
    public List<j21> a(@x1 String str) {
        File file = new File(new p41(this.c, str, o41.c).d());
        kj1 kj1Var = n21.a;
        kj1Var.c("Check cnl for carrier: %s path: %s length: %d", str, file.getAbsolutePath(), Long.valueOf(file.length()));
        if (file.exists()) {
            String a2 = this.b.a(file);
            kj1Var.c("CNL file read content: %s", a2);
            List<j21> list = (List) new Gson().o(a2, new a().g());
            return list == null ? new ArrayList() : list;
        }
        return new ArrayList();
    }

    @Override // com.p7700g.p99005.n21
    public void b(@x1 String str, @x1 List<j21> list) {
    }

    @Override // com.p7700g.p99005.n21
    public void clear(@x1 String str) {
        new p41(this.c, str, o41.c).k();
    }
}