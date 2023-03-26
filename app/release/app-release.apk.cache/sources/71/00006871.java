package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes2.dex */
public final class z22<T> extends c32<T> {
    private final Integer a;
    private final T b;
    private final d32 c;

    public z22(@z1 Integer num, T t, d32 d32Var) {
        this.a = num;
        Objects.requireNonNull(t, "Null payload");
        this.b = t;
        Objects.requireNonNull(d32Var, "Null priority");
        this.c = d32Var;
    }

    @Override // com.p7700g.p99005.c32
    @z1
    public Integer a() {
        return this.a;
    }

    @Override // com.p7700g.p99005.c32
    public T b() {
        return this.b;
    }

    @Override // com.p7700g.p99005.c32
    public d32 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c32) {
            c32 c32Var = (c32) obj;
            Integer num = this.a;
            if (num != null ? num.equals(c32Var.a()) : c32Var.a() == null) {
                if (this.b.equals(c32Var.b()) && this.c.equals(c32Var.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("Event{code=");
        G.append(this.a);
        G.append(", payload=");
        G.append(this.b);
        G.append(", priority=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }
}