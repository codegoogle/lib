package com.p7700g.p99005;

import com.p7700g.p99005.yp2;
import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes2.dex */
public final class t32 extends z32 {
    private final List<c42> a;

    public t32(List<c42> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    @Override // com.p7700g.p99005.z32
    @x1
    @yp2.a(name = "logRequest")
    public List<c42> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z32) {
            return this.a.equals(((z32) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder G = wo1.G("BatchedLogRequest{logRequests=");
        G.append(this.a);
        G.append("}");
        return G.toString();
    }
}