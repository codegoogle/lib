package com.p7700g.p99005;

import com.p7700g.p99005.ls2;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes3.dex */
public final class hs2 extends ls2 {
    private final String a;
    private final long b;
    private final ls2.b c;

    /* compiled from: AutoValue_TokenResult.java */
    /* loaded from: classes3.dex */
    public static final class b extends ls2.a {
        private String a;
        private Long b;
        private ls2.b c;

        @Override // com.p7700g.p99005.ls2.a
        public ls2 a() {
            String str = this.b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new hs2(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.ls2.a
        public ls2.a b(ls2.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.p7700g.p99005.ls2.a
        public ls2.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.p7700g.p99005.ls2.a
        public ls2.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        private b(ls2 ls2Var) {
            this.a = ls2Var.c();
            this.b = Long.valueOf(ls2Var.d());
            this.c = ls2Var.b();
        }
    }

    @Override // com.p7700g.p99005.ls2
    @z1
    public ls2.b b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.ls2
    @z1
    public String c() {
        return this.a;
    }

    @Override // com.p7700g.p99005.ls2
    @x1
    public long d() {
        return this.b;
    }

    @Override // com.p7700g.p99005.ls2
    public ls2.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ls2) {
            ls2 ls2Var = (ls2) obj;
            String str = this.a;
            if (str != null ? str.equals(ls2Var.c()) : ls2Var.c() == null) {
                if (this.b == ls2Var.d()) {
                    ls2.b bVar = this.c;
                    if (bVar == null) {
                        if (ls2Var.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(ls2Var.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ls2.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("TokenResult{token=");
        G.append(this.a);
        G.append(", tokenExpirationTimestamp=");
        G.append(this.b);
        G.append(", responseCode=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }

    private hs2(@z1 String str, long j, @z1 ls2.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}