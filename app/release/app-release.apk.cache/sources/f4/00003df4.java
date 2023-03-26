package com.p7700g.p99005;

import com.p7700g.p99005.o41;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: DefaultRemoteFileHandlerFactory.java */
/* loaded from: classes.dex */
public class d31 implements o41.a {
    @x1
    private final x31 a;
    @x1
    public final j31 b;
    @x1
    public final u41 c;
    @x1
    private final h31 d;
    @x1
    public final Executor e;

    public d31(@x1 x31 x31Var, @x1 j31 j31Var, @x1 u41 u41Var, @x1 h31 h31Var, @x1 Executor executor) {
        this.a = x31Var;
        this.b = j31Var;
        this.c = u41Var;
        this.d = h31Var;
        this.e = executor;
    }

    @Override // com.p7700g.p99005.o41.a
    @x1
    public List<n41> a(@x1 String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new n41(new p41(this.a, str, o41.b, this.d), this.b, this.e, this.c));
        arrayList.add(new n41(new p41(this.a, str, o41.c), this.b, this.e, this.c));
        return arrayList;
    }
}