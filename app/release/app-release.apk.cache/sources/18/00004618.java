package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes2.dex */
public final class h92 extends o92 {
    private final long a;
    private final v42 b;
    private final p42 c;

    public h92(long j, v42 v42Var, p42 p42Var) {
        this.a = j;
        Objects.requireNonNull(v42Var, "Null transportContext");
        this.b = v42Var;
        Objects.requireNonNull(p42Var, "Null event");
        this.c = p42Var;
    }

    @Override // com.p7700g.p99005.o92
    public p42 b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.o92
    public long c() {
        return this.a;
    }

    @Override // com.p7700g.p99005.o92
    public v42 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o92) {
            o92 o92Var = (o92) obj;
            return this.a == o92Var.c() && this.b.equals(o92Var.d()) && this.c.equals(o92Var.b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder G = wo1.G("PersistedEvent{id=");
        G.append(this.a);
        G.append(", transportContext=");
        G.append(this.b);
        G.append(", event=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }
}