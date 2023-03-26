package com.p7700g.p99005;

import com.p7700g.p99005.tr2;
import java.util.Objects;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes3.dex */
public final class kr2 extends tr2 {
    private final String a;
    private final long b;
    private final long c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* loaded from: classes3.dex */
    public static final class b extends tr2.a {
        private String a;
        private Long b;
        private Long c;

        @Override // com.p7700g.p99005.tr2.a
        public tr2 a() {
            String str = this.a == null ? " token" : "";
            if (this.b == null) {
                str = wo1.t(str, " tokenExpirationTimestamp");
            }
            if (this.c == null) {
                str = wo1.t(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                return new kr2(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.tr2.a
        public tr2.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.a = str;
            return this;
        }

        @Override // com.p7700g.p99005.tr2.a
        public tr2.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.tr2.a
        public tr2.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public b() {
        }

        private b(tr2 tr2Var) {
            this.a = tr2Var.b();
            this.b = Long.valueOf(tr2Var.d());
            this.c = Long.valueOf(tr2Var.c());
        }
    }

    @Override // com.p7700g.p99005.tr2
    @x1
    public String b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.tr2
    @x1
    public long c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.tr2
    @x1
    public long d() {
        return this.b;
    }

    @Override // com.p7700g.p99005.tr2
    public tr2.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tr2) {
            tr2 tr2Var = (tr2) obj;
            return this.a.equals(tr2Var.b()) && this.b == tr2Var.d() && this.c == tr2Var.c();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder G = wo1.G("InstallationTokenResult{token=");
        G.append(this.a);
        G.append(", tokenExpirationTimestamp=");
        G.append(this.b);
        G.append(", tokenCreationTimestamp=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }

    private kr2(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}