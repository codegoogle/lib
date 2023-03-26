package com.p7700g.p99005;

import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes.dex */
public class cn0 {
    private cn0() {
    }

    private static <T> List<ep0<T>> a(po0 po0Var, float f, ei0 ei0Var, mo0<T> mo0Var) throws IOException {
        return tn0.a(po0Var, ei0Var, f, mo0Var, false);
    }

    private static <T> List<ep0<T>> b(po0 po0Var, ei0 ei0Var, mo0<T> mo0Var) throws IOException {
        return tn0.a(po0Var, ei0Var, 1.0f, mo0Var, false);
    }

    public static yk0 c(po0 po0Var, ei0 ei0Var) throws IOException {
        return new yk0(b(po0Var, ei0Var, fn0.a));
    }

    public static hl0 d(po0 po0Var, ei0 ei0Var) throws IOException {
        return new hl0(b(po0Var, ei0Var, hn0.a));
    }

    public static zk0 e(po0 po0Var, ei0 ei0Var) throws IOException {
        return f(po0Var, ei0Var, true);
    }

    public static zk0 f(po0 po0Var, ei0 ei0Var, boolean z) throws IOException {
        return new zk0(a(po0Var, z ? cp0.e() : 1.0f, ei0Var, kn0.a));
    }

    public static al0 g(po0 po0Var, ei0 ei0Var, int i) throws IOException {
        return new al0(b(po0Var, ei0Var, new nn0(i)));
    }

    public static bl0 h(po0 po0Var, ei0 ei0Var) throws IOException {
        return new bl0(b(po0Var, ei0Var, qn0.a));
    }

    public static dl0 i(po0 po0Var, ei0 ei0Var) throws IOException {
        return new dl0(tn0.a(po0Var, ei0Var, cp0.e(), ao0.a, true));
    }

    public static el0 j(po0 po0Var, ei0 ei0Var) throws IOException {
        return new el0(b(po0Var, ei0Var, fo0.a));
    }

    public static fl0 k(po0 po0Var, ei0 ei0Var) throws IOException {
        return new fl0(a(po0Var, cp0.e(), ei0Var, go0.a));
    }
}