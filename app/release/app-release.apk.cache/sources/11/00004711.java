package com.p7700g.p99005;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: MultiTransformation.java */
/* loaded from: classes2.dex */
public class hq1<T> implements nq1<T> {
    private final Collection<? extends nq1<T>> c;

    @SafeVarargs
    public hq1(@x1 nq1<T>... nq1VarArr) {
        if (nq1VarArr.length != 0) {
            this.c = Arrays.asList(nq1VarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        for (nq1<T> nq1Var : this.c) {
            nq1Var.a(messageDigest);
        }
    }

    @Override // com.p7700g.p99005.nq1
    @x1
    public cs1<T> b(@x1 Context context, @x1 cs1<T> cs1Var, int i, int i2) {
        cs1<T> cs1Var2 = cs1Var;
        for (nq1<T> nq1Var : this.c) {
            cs1<T> b = nq1Var.b(context, cs1Var2, i, i2);
            if (cs1Var2 != null && !cs1Var2.equals(cs1Var) && !cs1Var2.equals(b)) {
                cs1Var2.a();
            }
            cs1Var2 = b;
        }
        return cs1Var2;
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof hq1) {
            return this.c.equals(((hq1) obj).c);
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return this.c.hashCode();
    }

    public hq1(@x1 Collection<? extends nq1<T>> collection) {
        if (!collection.isEmpty()) {
            this.c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}