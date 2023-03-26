package com.p7700g.p99005;

/* compiled from: LanguageContext.java */
/* loaded from: classes3.dex */
public class go3 {
    private static go3 a;
    private ho3 b;

    public go3(sl3 sl3Var) {
        a = this;
        if (sl3Var.f(sl3Var.h(), io3.a, null) != null) {
            this.b = new io3(sl3Var);
        } else {
            this.b = new jo3();
        }
    }

    public static go3 a() {
        return a;
    }

    @x1
    public String b() {
        return this.b.a();
    }

    public void c(ho3 ho3Var) {
        this.b = ho3Var;
    }
}