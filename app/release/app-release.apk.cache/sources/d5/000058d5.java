package com.p7700g.p99005;

import java.text.ParseException;

/* compiled from: AcceptableLanguageTag.java */
/* loaded from: classes3.dex */
public class qs3 extends ys3 implements ft3 {
    public int h;

    public qs3(String str, String str2) {
        super(str, str2);
        this.h = 1000;
    }

    @Override // com.p7700g.p99005.ft3
    public int a() {
        return this.h;
    }

    public qs3(String str) throws ParseException {
        this(kt3.g(str));
    }

    public qs3(kt3 kt3Var) throws ParseException {
        this.h = 1000;
        kt3Var.e();
        String p = kt3Var.p();
        this.e = p;
        if (!p.equals(tm4.g)) {
            h(this.e);
        } else {
            this.f = this.e;
        }
        if (kt3Var.e()) {
            this.h = kt3.J(kt3Var);
        }
    }
}