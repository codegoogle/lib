package com.p7700g.p99005;

import com.p7700g.p99005.xs1;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes2.dex */
public class lr1<DataType> implements xs1.b {
    private final dq1<DataType> a;
    private final DataType b;
    private final jq1 c;

    public lr1(dq1<DataType> dq1Var, DataType datatype, jq1 jq1Var) {
        this.a = dq1Var;
        this.b = datatype;
        this.c = jq1Var;
    }

    @Override // com.p7700g.p99005.xs1.b
    public boolean a(@x1 File file) {
        return this.a.a(this.b, file, this.c);
    }
}