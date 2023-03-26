package com.p7700g.p99005;

import java.util.HashMap;
import java.util.Set;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public class ib {
    private static final ib a = new ib();
    private HashMap<String, jb> b = new HashMap<>();

    public static ib c() {
        return a;
    }

    public String a(String str) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            return jbVar.b();
        }
        return null;
    }

    public String b(String str) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            return jbVar.g();
        }
        return null;
    }

    public long d(String str) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            return jbVar.h();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.b.keySet();
    }

    public void f(String str, jb jbVar) {
        this.b.put(str, jbVar);
    }

    public void g(String str, int i) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            jbVar.c(i);
        }
    }

    public void h(String str, int i) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            jbVar.d(i);
        }
    }

    public void i(String str, jb jbVar) {
        this.b.remove(str);
    }

    public void j(String str, String str2) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            jbVar.a(str2);
        }
    }

    public void k(String str, int i, int i2) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            jbVar.f(i, i2);
        }
    }

    public void l(String str, float f) {
        jb jbVar = this.b.get(str);
        if (jbVar != null) {
            jbVar.e(f);
        }
    }
}