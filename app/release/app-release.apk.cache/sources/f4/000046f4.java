package com.p7700g.p99005;

import android.os.Bundle;

/* compiled from: CredentialsSource.java */
/* loaded from: classes2.dex */
public interface ho1 {
    @z1
    go1 get(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle) throws Exception;

    void load(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle, @x1 ua1<go1> ua1Var);

    @z1
    ve1 loadStartParams();

    void preloadCredentials(@x1 String str, @x1 Bundle bundle);

    void storeStartParams(@z1 ve1 ve1Var);
}