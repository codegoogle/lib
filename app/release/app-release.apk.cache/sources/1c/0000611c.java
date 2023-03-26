package com.p7700g.p99005;

import com.p7700g.p99005.b42;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes2.dex */
public final class v32 extends b42 {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final e42 g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes2.dex */
    public static final class b extends b42.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private e42 g;

        @Override // com.p7700g.p99005.b42.a
        public b42 a() {
            String str = this.a == null ? " eventTimeMs" : "";
            if (this.c == null) {
                str = wo1.t(str, " eventUptimeMs");
            }
            if (this.f == null) {
                str = wo1.t(str, " timezoneOffsetSeconds");
            }
            if (str.isEmpty()) {
                return new v32(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a b(@z1 Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a e(@z1 e42 e42Var) {
            this.g = e42Var;
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a f(@z1 byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a g(@z1 String str) {
            this.e = str;
            return this;
        }

        @Override // com.p7700g.p99005.b42.a
        public b42.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.p7700g.p99005.b42
    @z1
    public Integer b() {
        return this.b;
    }

    @Override // com.p7700g.p99005.b42
    public long c() {
        return this.a;
    }

    @Override // com.p7700g.p99005.b42
    public long d() {
        return this.c;
    }

    @Override // com.p7700g.p99005.b42
    @z1
    public e42 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b42) {
            b42 b42Var = (b42) obj;
            if (this.a == b42Var.c() && ((num = this.b) != null ? num.equals(b42Var.b()) : b42Var.b() == null) && this.c == b42Var.d()) {
                if (Arrays.equals(this.d, b42Var instanceof v32 ? ((v32) b42Var).d : b42Var.f()) && ((str = this.e) != null ? str.equals(b42Var.g()) : b42Var.g() == null) && this.f == b42Var.h()) {
                    e42 e42Var = this.g;
                    if (e42Var == null) {
                        if (b42Var.e() == null) {
                            return true;
                        }
                    } else if (e42Var.equals(b42Var.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.b42
    @z1
    public byte[] f() {
        return this.d;
    }

    @Override // com.p7700g.p99005.b42
    @z1
    public String g() {
        return this.e;
    }

    @Override // com.p7700g.p99005.b42
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        e42 e42Var = this.g;
        return i2 ^ (e42Var != null ? e42Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("LogEvent{eventTimeMs=");
        G.append(this.a);
        G.append(", eventCode=");
        G.append(this.b);
        G.append(", eventUptimeMs=");
        G.append(this.c);
        G.append(", sourceExtension=");
        G.append(Arrays.toString(this.d));
        G.append(", sourceExtensionJsonProto3=");
        G.append(this.e);
        G.append(", timezoneOffsetSeconds=");
        G.append(this.f);
        G.append(", networkConnectionInfo=");
        G.append(this.g);
        G.append("}");
        return G.toString();
    }

    private v32(long j, @z1 Integer num, long j2, @z1 byte[] bArr, @z1 String str, long j3, @z1 e42 e42Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = e42Var;
    }
}