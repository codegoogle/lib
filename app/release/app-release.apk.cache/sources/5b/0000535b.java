package com.p7700g.p99005;

import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: HttpException.java */
/* loaded from: classes4.dex */
public class nz5 extends RuntimeException {
    private final int s;
    private final String t;
    private final transient xz5<?> u;

    public nz5(xz5<?> xz5Var) {
        super(g(xz5Var));
        this.s = xz5Var.b();
        this.t = xz5Var.h();
        this.u = xz5Var;
    }

    private static String g(xz5<?> xz5Var) {
        Objects.requireNonNull(xz5Var, "response == null");
        return "HTTP " + xz5Var.b() + " " + xz5Var.h();
    }

    public int f() {
        return this.s;
    }

    public String h() {
        return this.t;
    }

    @Nullable
    public xz5<?> i() {
        return this.u;
    }
}