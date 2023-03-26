package com.p7700g.p99005;

import java.text.ParseException;

/* compiled from: AcceptableToken.java */
/* loaded from: classes3.dex */
public class ss3 extends ht3 implements ft3 {
    public int f;

    public ss3(String str) throws ParseException {
        this(kt3.g(str));
    }

    @Override // com.p7700g.p99005.ft3
    public int a() {
        return this.f;
    }

    public ss3(kt3 kt3Var) throws ParseException {
        this.f = 1000;
        kt3Var.e();
        this.e = kt3Var.p();
        if (kt3Var.e()) {
            this.f = kt3.J(kt3Var);
        }
    }
}