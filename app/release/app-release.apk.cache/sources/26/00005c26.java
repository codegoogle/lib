package com.p7700g.p99005;

import com.p7700g.p99005.jm3;

/* compiled from: OSLogWrapper.java */
/* loaded from: classes3.dex */
public class sk3 implements tk3 {
    @Override // com.p7700g.p99005.tk3
    public void a(@x1 String str, @x1 Throwable th) {
        jm3.b(jm3.u0.ERROR, str, th);
    }

    @Override // com.p7700g.p99005.tk3
    public void b(@x1 String str) {
        jm3.a(jm3.u0.DEBUG, str);
    }

    @Override // com.p7700g.p99005.tk3
    public void c(@x1 String str) {
        jm3.a(jm3.u0.WARN, str);
    }

    @Override // com.p7700g.p99005.tk3
    public void d(@x1 String str) {
        jm3.a(jm3.u0.ERROR, str);
    }

    @Override // com.p7700g.p99005.tk3
    public void e(@x1 String str) {
        jm3.a(jm3.u0.VERBOSE, str);
    }

    @Override // com.p7700g.p99005.tk3
    public void f(@x1 String str) {
        jm3.a(jm3.u0.INFO, str);
    }
}