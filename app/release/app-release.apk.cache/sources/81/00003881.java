package com.p7700g.p99005;

import com.p7700g.p99005.d82;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes2.dex */
public final class a82 extends d82 {
    private final v92 e;
    private final Map<d32, d82.b> f;

    public a82(v92 v92Var, Map<d32, d82.b> map) {
        Objects.requireNonNull(v92Var, "Null clock");
        this.e = v92Var;
        Objects.requireNonNull(map, "Null values");
        this.f = map;
    }

    @Override // com.p7700g.p99005.d82
    public v92 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d82) {
            d82 d82Var = (d82) obj;
            return this.e.equals(d82Var.e()) && this.f.equals(d82Var.i());
        }
        return false;
    }

    public int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.p7700g.p99005.d82
    public Map<d32, d82.b> i() {
        return this.f;
    }

    public String toString() {
        StringBuilder G = wo1.G("SchedulerConfig{clock=");
        G.append(this.e);
        G.append(", values=");
        G.append(this.f);
        G.append("}");
        return G.toString();
    }
}