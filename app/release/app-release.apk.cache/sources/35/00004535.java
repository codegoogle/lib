package com.p7700g.p99005;

import com.p7700g.p99005.js2;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes3.dex */
public final class gs2 extends js2 {
    private final String a;
    private final String b;
    private final String c;
    private final ls2 d;
    private final js2.b e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* loaded from: classes3.dex */
    public static final class b extends js2.a {
        private String a;
        private String b;
        private String c;
        private ls2 d;
        private js2.b e;

        @Override // com.p7700g.p99005.js2.a
        public js2 a() {
            return new gs2(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.p7700g.p99005.js2.a
        public js2.a b(ls2 ls2Var) {
            this.d = ls2Var;
            return this;
        }

        @Override // com.p7700g.p99005.js2.a
        public js2.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.p7700g.p99005.js2.a
        public js2.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.p7700g.p99005.js2.a
        public js2.a e(js2.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.p7700g.p99005.js2.a
        public js2.a f(String str) {
            this.a = str;
            return this;
        }

        public b() {
        }

        private b(js2 js2Var) {
            this.a = js2Var.f();
            this.b = js2Var.c();
            this.c = js2Var.d();
            this.d = js2Var.b();
            this.e = js2Var.e();
        }
    }

    @Override // com.p7700g.p99005.js2
    @z1
    public ls2 b() {
        return this.d;
    }

    @Override // com.p7700g.p99005.js2
    @z1
    public String c() {
        return this.b;
    }

    @Override // com.p7700g.p99005.js2
    @z1
    public String d() {
        return this.c;
    }

    @Override // com.p7700g.p99005.js2
    @z1
    public js2.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof js2) {
            js2 js2Var = (js2) obj;
            String str = this.a;
            if (str != null ? str.equals(js2Var.f()) : js2Var.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(js2Var.c()) : js2Var.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(js2Var.d()) : js2Var.d() == null) {
                        ls2 ls2Var = this.d;
                        if (ls2Var != null ? ls2Var.equals(js2Var.b()) : js2Var.b() == null) {
                            js2.b bVar = this.e;
                            if (bVar == null) {
                                if (js2Var.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(js2Var.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.js2
    @z1
    public String f() {
        return this.a;
    }

    @Override // com.p7700g.p99005.js2
    public js2.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ls2 ls2Var = this.d;
        int hashCode4 = (hashCode3 ^ (ls2Var == null ? 0 : ls2Var.hashCode())) * 1000003;
        js2.b bVar = this.e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("InstallationResponse{uri=");
        G.append(this.a);
        G.append(", fid=");
        G.append(this.b);
        G.append(", refreshToken=");
        G.append(this.c);
        G.append(", authToken=");
        G.append(this.d);
        G.append(", responseCode=");
        G.append(this.e);
        G.append("}");
        return G.toString();
    }

    private gs2(@z1 String str, @z1 String str2, @z1 String str3, @z1 ls2 ls2Var, @z1 js2.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ls2Var;
        this.e = bVar;
    }
}