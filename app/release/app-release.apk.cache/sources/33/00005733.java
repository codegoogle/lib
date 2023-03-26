package com.p7700g.p99005;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Invocation.java */
/* loaded from: classes4.dex */
public final class pz5 {
    private final Method a;
    private final List<?> b;

    public pz5(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public static pz5 c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new pz5(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.b;
    }

    public Method b() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}