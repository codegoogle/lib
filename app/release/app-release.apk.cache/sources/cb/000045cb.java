package com.p7700g.p99005;

import com.p7700g.p99005.p42;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes2.dex */
public final class h42 extends p42 {
    private final String a;
    private final Integer b;
    private final o42 c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* compiled from: AutoValue_EventInternal.java */
    /* loaded from: classes2.dex */
    public static final class b extends p42.a {
        private String a;
        private Integer b;
        private o42 c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        @Override // com.p7700g.p99005.p42.a
        public p42 d() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = wo1.t(str, " encodedPayload");
            }
            if (this.d == null) {
                str = wo1.t(str, " eventMillis");
            }
            if (this.e == null) {
                str = wo1.t(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = wo1.t(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h42(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.p42.a
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f = map;
            return this;
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a h(o42 o42Var) {
            Objects.requireNonNull(o42Var, "Null encodedPayload");
            this.c = o42Var;
            return this;
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // com.p7700g.p99005.p42.a
        public p42.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.p7700g.p99005.p42
    public Map<String, String> c() {
        return this.f;
    }

    @Override // com.p7700g.p99005.p42
    @z1
    public Integer d() {
        return this.b;
    }

    @Override // com.p7700g.p99005.p42
    public o42 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p42) {
            p42 p42Var = (p42) obj;
            return this.a.equals(p42Var.l()) && ((num = this.b) != null ? num.equals(p42Var.d()) : p42Var.d() == null) && this.c.equals(p42Var.e()) && this.d == p42Var.f() && this.e == p42Var.m() && this.f.equals(p42Var.c());
        }
        return false;
    }

    @Override // com.p7700g.p99005.p42
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.p7700g.p99005.p42
    public String l() {
        return this.a;
    }

    @Override // com.p7700g.p99005.p42
    public long m() {
        return this.e;
    }

    public String toString() {
        StringBuilder G = wo1.G("EventInternal{transportName=");
        G.append(this.a);
        G.append(", code=");
        G.append(this.b);
        G.append(", encodedPayload=");
        G.append(this.c);
        G.append(", eventMillis=");
        G.append(this.d);
        G.append(", uptimeMillis=");
        G.append(this.e);
        G.append(", autoMetadata=");
        G.append(this.f);
        G.append("}");
        return G.toString();
    }

    private h42(String str, @z1 Integer num, o42 o42Var, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = o42Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}