package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CombinedCnlRepository.java */
/* loaded from: classes.dex */
public class p21 implements n21 {
    @x1
    private static final kj1 b = kj1.b("CombinedCnlRepository");
    @x1
    private final List<n21> c;

    public p21(@x1 List<n21> list) {
        this.c = list;
    }

    @Override // com.p7700g.p99005.n21
    @x1
    public List<j21> a(@x1 String str) {
        ArrayList arrayList = new ArrayList();
        for (n21 n21Var : this.c) {
            try {
                arrayList.addAll(n21Var.a(str));
            } catch (Throwable th) {
                b.o(th);
            }
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.n21
    public void b(@x1 String str, @x1 List<j21> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.n21
    public void clear(@x1 String str) {
        for (n21 n21Var : this.c) {
            n21Var.clear(str);
        }
    }
}