package com.p7700g.p99005;

import com.p7700g.p99005.e42;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes2.dex */
public final class y32 extends e42 {
    private final e42.c a;
    private final e42.b b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* loaded from: classes2.dex */
    public static final class b extends e42.a {
        private e42.c a;
        private e42.b b;

        @Override // com.p7700g.p99005.e42.a
        public e42 a() {
            return new y32(this.a, this.b);
        }

        @Override // com.p7700g.p99005.e42.a
        public e42.a b(@z1 e42.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // com.p7700g.p99005.e42.a
        public e42.a c(@z1 e42.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // com.p7700g.p99005.e42
    @z1
    public e42.b b() {
        return this.b;
    }

    @Override // com.p7700g.p99005.e42
    @z1
    public e42.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e42) {
            e42 e42Var = (e42) obj;
            e42.c cVar = this.a;
            if (cVar != null ? cVar.equals(e42Var.c()) : e42Var.c() == null) {
                e42.b bVar = this.b;
                if (bVar == null) {
                    if (e42Var.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(e42Var.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        e42.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        e42.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("NetworkConnectionInfo{networkType=");
        G.append(this.a);
        G.append(", mobileSubtype=");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }

    private y32(@z1 e42.c cVar, @z1 e42.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}