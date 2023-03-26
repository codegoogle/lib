package com.p7700g.p99005;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes2.dex */
public final class x32 extends d42 {
    private final long b;

    public x32(long j) {
        this.b = j;
    }

    @Override // com.p7700g.p99005.d42
    public long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof d42) && this.b == ((d42) obj).c();
    }

    public int hashCode() {
        long j = this.b;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder G = wo1.G("LogResponse{nextRequestWaitMillis=");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }
}