package com.p7700g.p99005;

import com.p7700g.p99005.hr5;
import com.p7700g.p99005.jr5;
import com.p7700g.p99005.rz5;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: Response.java */
/* loaded from: classes4.dex */
public final class xz5<T> {
    private final jr5 a;
    @Nullable
    private final T b;
    @Nullable
    private final kr5 c;

    private xz5(jr5 jr5Var, @Nullable T t, @Nullable kr5 kr5Var) {
        this.a = jr5Var;
        this.b = t;
        this.c = kr5Var;
    }

    public static <T> xz5<T> c(int i, kr5 kr5Var) {
        Objects.requireNonNull(kr5Var, "body == null");
        if (i >= 400) {
            return d(kr5Var, new jr5.a().b(new rz5.c(kr5Var.k(), kr5Var.j())).g(i).y("Response.error()").B(gr5.HTTP_1_1).E(new hr5.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException(wo1.l("code < 400: ", i));
    }

    public static <T> xz5<T> d(kr5 kr5Var, jr5 jr5Var) {
        Objects.requireNonNull(kr5Var, "body == null");
        Objects.requireNonNull(jr5Var, "rawResponse == null");
        if (!jr5Var.s1()) {
            return new xz5<>(jr5Var, null, kr5Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> xz5<T> j(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return m(t, new jr5.a().g(i).y("Response.success()").B(gr5.HTTP_1_1).E(new hr5.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException(wo1.l("code < 200 or >= 300: ", i));
    }

    public static <T> xz5<T> k(@Nullable T t) {
        return m(t, new jr5.a().g(200).y(it0.a).B(gr5.HTTP_1_1).E(new hr5.a().B("http://localhost/").b()).c());
    }

    public static <T> xz5<T> l(@Nullable T t, yq5 yq5Var) {
        Objects.requireNonNull(yq5Var, "headers == null");
        return m(t, new jr5.a().g(200).y(it0.a).B(gr5.HTTP_1_1).w(yq5Var).E(new hr5.a().B("http://localhost/").b()).c());
    }

    public static <T> xz5<T> m(@Nullable T t, jr5 jr5Var) {
        Objects.requireNonNull(jr5Var, "rawResponse == null");
        if (jr5Var.s1()) {
            return new xz5<>(jr5Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.E();
    }

    @Nullable
    public kr5 e() {
        return this.c;
    }

    public yq5 f() {
        return this.a.Y();
    }

    public boolean g() {
        return this.a.s1();
    }

    public String h() {
        return this.a.x0();
    }

    public jr5 i() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}