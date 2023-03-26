package com.p7700g.p99005;

import java.text.ParseException;

/* compiled from: Token.java */
/* loaded from: classes3.dex */
public class ht3 {
    public String e;

    public ht3() {
    }

    public String b() {
        return this.e;
    }

    public final boolean c(String str) {
        if (this.e.equals(tm4.g)) {
            return true;
        }
        return this.e.equals(str);
    }

    public ht3(String str) throws ParseException {
        this(kt3.g(str));
    }

    public ht3(kt3 kt3Var) throws ParseException {
        kt3Var.e();
        this.e = kt3Var.p();
        if (kt3Var.e()) {
            throw new ParseException("Invalid token", kt3Var.c());
        }
    }
}