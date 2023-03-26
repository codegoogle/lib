package com.p7700g.p99005;

import com.anchorfree.sdk.HydraCredentialsSource;
import com.anchorfree.sdk.SessionConfig;

/* compiled from: PatcherCredentialsHandler.java */
/* loaded from: classes.dex */
public class d41 implements HydraCredentialsSource.b {
    @z1
    private final r21 a;

    public d41(@z1 r21 r21Var) {
        this.a = r21Var;
    }

    @Override // com.anchorfree.sdk.HydraCredentialsSource.b
    public String a(@x1 ft0 ft0Var, @x1 String str, @x1 q21 q21Var, @x1 SessionConfig sessionConfig) {
        r21 r21Var = this.a;
        return r21Var != null ? r21Var.a(ft0Var, q21Var.d, str, sessionConfig) : str;
    }
}