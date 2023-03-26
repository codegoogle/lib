package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: AutoValue_SdkHeartBeatResult.java */
/* loaded from: classes3.dex */
public final class tq2 extends ar2 {
    private final String s;
    private final long t;

    public tq2(String str, long j) {
        Objects.requireNonNull(str, "Null sdkName");
        this.s = str;
        this.t = j;
    }

    @Override // com.p7700g.p99005.ar2
    public long c() {
        return this.t;
    }

    @Override // com.p7700g.p99005.ar2
    public String d() {
        return this.s;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ar2) {
            ar2 ar2Var = (ar2) obj;
            return this.s.equals(ar2Var.d()) && this.t == ar2Var.c();
        }
        return false;
    }

    public int hashCode() {
        long j = this.t;
        return ((this.s.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder G = wo1.G("SdkHeartBeatResult{sdkName=");
        G.append(this.s);
        G.append(", millis=");
        G.append(this.t);
        G.append("}");
        return G.toString();
    }
}