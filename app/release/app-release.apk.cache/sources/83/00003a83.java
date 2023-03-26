package com.p7700g.p99005;

import com.p7700g.p99005.d82;
import java.util.Objects;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes2.dex */
public final class b82 extends d82.b {
    private final long a;
    private final long b;
    private final Set<d82.c> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes2.dex */
    public static final class b extends d82.b.a {
        private Long a;
        private Long b;
        private Set<d82.c> c;

        @Override // com.p7700g.p99005.d82.b.a
        public d82.b a() {
            String str = this.a == null ? " delta" : "";
            if (this.b == null) {
                str = wo1.t(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = wo1.t(str, " flags");
            }
            if (str.isEmpty()) {
                return new b82(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.d82.b.a
        public d82.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.d82.b.a
        public d82.b.a c(Set<d82.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.c = set;
            return this;
        }

        @Override // com.p7700g.p99005.d82.b.a
        public d82.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.p7700g.p99005.d82.b
    public long b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.d82.b
    public Set<d82.c> c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.d82.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d82.b) {
            d82.b bVar = (d82.b) obj;
            return this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        StringBuilder G = wo1.G("ConfigValue{delta=");
        G.append(this.a);
        G.append(", maxAllowedDelay=");
        G.append(this.b);
        G.append(", flags=");
        G.append(this.c);
        G.append("}");
        return G.toString();
    }

    private b82(long j, long j2, Set<d82.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}