package com.p7700g.p99005;

import com.p7700g.p99005.xq2;
import java.util.Objects;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes3.dex */
public final class sq2 extends zq2 {
    private final String a;
    private final long b;
    private final xq2.a c;

    public sq2(String str, long j, xq2.a aVar) {
        Objects.requireNonNull(str, "Null sdkName");
        this.a = str;
        this.b = j;
        Objects.requireNonNull(aVar, "Null heartBeat");
        this.c = aVar;
    }

    @Override // com.p7700g.p99005.zq2
    public xq2.a b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.zq2
    public long c() {
        return this.b;
    }

    @Override // com.p7700g.p99005.zq2
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zq2) {
            zq2 zq2Var = (zq2) obj;
            return this.a.equals(zq2Var.d()) && this.b == zq2Var.c() && this.c.equals(zq2Var.b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("HeartBeatResult{sdkName=");
        G.append(this.a);
        G.append(", millis=");
        G.append(this.b);
        G.append(", heartBeat=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }
}