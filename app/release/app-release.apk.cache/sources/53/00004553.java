package com.p7700g.p99005;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes3.dex */
public class gv2 {
    private static volatile gv2 a;
    private final Set<iv2> b = new HashSet();

    public static gv2 a() {
        gv2 gv2Var = a;
        if (gv2Var == null) {
            synchronized (gv2.class) {
                gv2Var = a;
                if (gv2Var == null) {
                    gv2Var = new gv2();
                    a = gv2Var;
                }
            }
        }
        return gv2Var;
    }

    public Set<iv2> b() {
        Set<iv2> unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = Collections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.b) {
            this.b.add(iv2.a(str, str2));
        }
    }
}