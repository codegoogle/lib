package com.p7700g.p99005;

import com.p7700g.p99005.j92;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes2.dex */
public final class g92 extends j92 {
    private final long g;
    private final int h;
    private final int i;
    private final long j;
    private final int k;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* loaded from: classes2.dex */
    public static final class b extends j92.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override // com.p7700g.p99005.j92.a
        public j92 a() {
            String str = this.a == null ? " maxStorageSizeInBytes" : "";
            if (this.b == null) {
                str = wo1.t(str, " loadBatchSize");
            }
            if (this.c == null) {
                str = wo1.t(str, " criticalSectionEnterTimeoutMs");
            }
            if (this.d == null) {
                str = wo1.t(str, " eventCleanUpAge");
            }
            if (this.e == null) {
                str = wo1.t(str, " maxBlobByteSizePerRow");
            }
            if (str.isEmpty()) {
                return new g92(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.j92.a
        public j92.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.p7700g.p99005.j92.a
        public j92.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.j92.a
        public j92.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.p7700g.p99005.j92.a
        public j92.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.p7700g.p99005.j92.a
        public j92.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.p7700g.p99005.j92
    public int b() {
        return this.i;
    }

    @Override // com.p7700g.p99005.j92
    public long c() {
        return this.j;
    }

    @Override // com.p7700g.p99005.j92
    public int d() {
        return this.h;
    }

    @Override // com.p7700g.p99005.j92
    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j92) {
            j92 j92Var = (j92) obj;
            return this.g == j92Var.f() && this.h == j92Var.d() && this.i == j92Var.b() && this.j == j92Var.c() && this.k == j92Var.e();
        }
        return false;
    }

    @Override // com.p7700g.p99005.j92
    public long f() {
        return this.g;
    }

    public int hashCode() {
        long j = this.g;
        long j2 = this.j;
        return this.k ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        StringBuilder G = wo1.G("EventStoreConfig{maxStorageSizeInBytes=");
        G.append(this.g);
        G.append(", loadBatchSize=");
        G.append(this.h);
        G.append(", criticalSectionEnterTimeoutMs=");
        G.append(this.i);
        G.append(", eventCleanUpAge=");
        G.append(this.j);
        G.append(", maxBlobByteSizePerRow=");
        return wo1.z(G, this.k, "}");
    }

    private g92(long j, int i, int i2, long j2, int i3) {
        this.g = j;
        this.h = i;
        this.i = i2;
        this.j = j2;
        this.k = i3;
    }
}