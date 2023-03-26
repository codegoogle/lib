package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: ComponentScope.java */
/* loaded from: classes3.dex */
public enum rv3 {
    Singleton,
    PerRequest,
    Undefined;
    
    public static final List<rv3> v;
    public static final List<rv3> w;
    public static final List<rv3> x;

    static {
        rv3 rv3Var = Singleton;
        rv3 rv3Var2 = PerRequest;
        rv3 rv3Var3 = Undefined;
        v = Collections.unmodifiableList(Arrays.asList(rv3Var3, rv3Var));
        w = Collections.unmodifiableList(Arrays.asList(rv3Var2, rv3Var3, rv3Var));
        x = Collections.unmodifiableList(Arrays.asList(rv3Var2, rv3Var3));
    }
}