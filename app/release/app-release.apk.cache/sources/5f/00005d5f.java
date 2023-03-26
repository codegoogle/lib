package com.p7700g.p99005;

import com.anchorfree.sdk.HydraCredentialsSource;
import com.anchorfree.sdk.SessionConfig;

/* compiled from: InternalCredentialsHandler.java */
/* loaded from: classes.dex */
public class t31 implements HydraCredentialsSource.b {
    @x1
    private final f61 a;

    public t31(@x1 f61 f61Var) {
        this.a = f61Var;
    }

    @Override // com.anchorfree.sdk.HydraCredentialsSource.b
    public String a(@x1 ft0 ft0Var, @x1 String str, @x1 q21 q21Var, @x1 SessionConfig sessionConfig) throws Exception {
        return this.a.g(ft0Var, q21Var.d, q21Var.a, q21Var.b, q21Var.c);
    }
}