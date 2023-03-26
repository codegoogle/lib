package com.p7700g.p99005;

import com.p7700g.p99005.j52;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes2.dex */
public final class d52 extends j52 {
    private final j52.a a;
    private final long b;

    public d52(j52.a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.b = j;
    }

    @Override // com.p7700g.p99005.j52
    public long b() {
        return this.b;
    }

    @Override // com.p7700g.p99005.j52
    public j52.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j52) {
            j52 j52Var = (j52) obj;
            return this.a.equals(j52Var.c()) && this.b == j52Var.b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder G = wo1.G("BackendResponse{status=");
        G.append(this.a);
        G.append(", nextRequestWaitMillis=");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }
}