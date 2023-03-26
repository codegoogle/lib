package com.p7700g.p99005;

import com.p7700g.p99005.a42;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes2.dex */
public final class u32 extends a42 {
    private final a42.b a;
    private final q32 b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* loaded from: classes2.dex */
    public static final class b extends a42.a {
        private a42.b a;
        private q32 b;

        @Override // com.p7700g.p99005.a42.a
        public a42 a() {
            return new u32(this.a, this.b);
        }

        @Override // com.p7700g.p99005.a42.a
        public a42.a b(@z1 q32 q32Var) {
            this.b = q32Var;
            return this;
        }

        @Override // com.p7700g.p99005.a42.a
        public a42.a c(@z1 a42.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // com.p7700g.p99005.a42
    @z1
    public q32 b() {
        return this.b;
    }

    @Override // com.p7700g.p99005.a42
    @z1
    public a42.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a42) {
            a42 a42Var = (a42) obj;
            a42.b bVar = this.a;
            if (bVar != null ? bVar.equals(a42Var.c()) : a42Var.c() == null) {
                q32 q32Var = this.b;
                if (q32Var == null) {
                    if (a42Var.b() == null) {
                        return true;
                    }
                } else if (q32Var.equals(a42Var.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a42.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        q32 q32Var = this.b;
        return hashCode ^ (q32Var != null ? q32Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("ClientInfo{clientType=");
        G.append(this.a);
        G.append(", androidClientInfo=");
        G.append(this.b);
        G.append("}");
        return G.toString();
    }

    private u32(@z1 a42.b bVar, @z1 q32 q32Var) {
        this.a = bVar;
        this.b = q32Var;
    }
}