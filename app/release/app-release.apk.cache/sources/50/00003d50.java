package com.p7700g.p99005;

import com.p7700g.p99005.es2;
import com.p7700g.p99005.fs2;
import java.util.Objects;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes3.dex */
public final class cs2 extends fs2 {
    private final String b;
    private final es2.a c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* loaded from: classes3.dex */
    public static final class b extends fs2.a {
        private String a;
        private es2.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        @Override // com.p7700g.p99005.fs2.a
        public fs2 a() {
            String str = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                str = wo1.t(str, " expiresInSecs");
            }
            if (this.f == null) {
                str = wo1.t(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new cs2(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a b(@z1 String str) {
            this.c = str;
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a e(@z1 String str) {
            this.g = str;
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a f(@z1 String str) {
            this.d = str;
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a g(es2.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.b = aVar;
            return this;
        }

        @Override // com.p7700g.p99005.fs2.a
        public fs2.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        private b(fs2 fs2Var) {
            this.a = fs2Var.d();
            this.b = fs2Var.g();
            this.c = fs2Var.b();
            this.d = fs2Var.f();
            this.e = Long.valueOf(fs2Var.c());
            this.f = Long.valueOf(fs2Var.h());
            this.g = fs2Var.e();
        }
    }

    @Override // com.p7700g.p99005.fs2
    @z1
    public String b() {
        return this.d;
    }

    @Override // com.p7700g.p99005.fs2
    public long c() {
        return this.f;
    }

    @Override // com.p7700g.p99005.fs2
    @z1
    public String d() {
        return this.b;
    }

    @Override // com.p7700g.p99005.fs2
    @z1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fs2) {
            fs2 fs2Var = (fs2) obj;
            String str3 = this.b;
            if (str3 != null ? str3.equals(fs2Var.d()) : fs2Var.d() == null) {
                if (this.c.equals(fs2Var.g()) && ((str = this.d) != null ? str.equals(fs2Var.b()) : fs2Var.b() == null) && ((str2 = this.e) != null ? str2.equals(fs2Var.f()) : fs2Var.f() == null) && this.f == fs2Var.c() && this.g == fs2Var.h()) {
                    String str4 = this.h;
                    if (str4 == null) {
                        if (fs2Var.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(fs2Var.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.fs2
    @z1
    public String f() {
        return this.e;
    }

    @Override // com.p7700g.p99005.fs2
    @x1
    public es2.a g() {
        return this.c;
    }

    @Override // com.p7700g.p99005.fs2
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f;
        long j2 = this.g;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.p7700g.p99005.fs2
    public fs2.a n() {
        return new b(this);
    }

    public String toString() {
        StringBuilder G = wo1.G("PersistedInstallationEntry{firebaseInstallationId=");
        G.append(this.b);
        G.append(", registrationStatus=");
        G.append(this.c);
        G.append(", authToken=");
        G.append(this.d);
        G.append(", refreshToken=");
        G.append(this.e);
        G.append(", expiresInSecs=");
        G.append(this.f);
        G.append(", tokenCreationEpochInSecs=");
        G.append(this.g);
        G.append(", fisError=");
        return wo1.C(G, this.h, "}");
    }

    private cs2(@z1 String str, es2.a aVar, @z1 String str2, @z1 String str3, long j, long j2, @z1 String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}