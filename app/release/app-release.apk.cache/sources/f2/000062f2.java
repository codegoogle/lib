package com.p7700g.p99005;

import com.p7700g.p99005.c42;
import com.p7700g.p99005.yp2;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes2.dex */
public final class w32 extends c42 {
    private final long a;
    private final long b;
    private final a42 c;
    private final Integer d;
    private final String e;
    private final List<b42> f;
    private final f42 g;

    /* compiled from: AutoValue_LogRequest.java */
    /* loaded from: classes2.dex */
    public static final class b extends c42.a {
        private Long a;
        private Long b;
        private a42 c;
        private Integer d;
        private String e;
        private List<b42> f;
        private f42 g;

        @Override // com.p7700g.p99005.c42.a
        public c42 a() {
            String str = this.a == null ? " requestTimeMs" : "";
            if (this.b == null) {
                str = wo1.t(str, " requestUptimeMs");
            }
            if (str.isEmpty()) {
                return new w32(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a b(@z1 a42 a42Var) {
            this.c = a42Var;
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a c(@z1 List<b42> list) {
            this.f = list;
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a d(@z1 Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a e(@z1 String str) {
            this.e = str;
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a f(@z1 f42 f42Var) {
            this.g = f42Var;
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.p7700g.p99005.c42.a
        public c42.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.p7700g.p99005.c42
    @z1
    public a42 b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.c42
    @yp2.a(name = "logEvent")
    @z1
    public List<b42> c() {
        return this.f;
    }

    @Override // com.p7700g.p99005.c42
    @z1
    public Integer d() {
        return this.d;
    }

    @Override // com.p7700g.p99005.c42
    @z1
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        a42 a42Var;
        Integer num;
        String str;
        List<b42> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c42) {
            c42 c42Var = (c42) obj;
            if (this.a == c42Var.g() && this.b == c42Var.h() && ((a42Var = this.c) != null ? a42Var.equals(c42Var.b()) : c42Var.b() == null) && ((num = this.d) != null ? num.equals(c42Var.d()) : c42Var.d() == null) && ((str = this.e) != null ? str.equals(c42Var.e()) : c42Var.e() == null) && ((list = this.f) != null ? list.equals(c42Var.c()) : c42Var.c() == null)) {
                f42 f42Var = this.g;
                if (f42Var == null) {
                    if (c42Var.f() == null) {
                        return true;
                    }
                } else if (f42Var.equals(c42Var.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.c42
    @z1
    public f42 f() {
        return this.g;
    }

    @Override // com.p7700g.p99005.c42
    public long g() {
        return this.a;
    }

    @Override // com.p7700g.p99005.c42
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        a42 a42Var = this.c;
        int hashCode = (i ^ (a42Var == null ? 0 : a42Var.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<b42> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        f42 f42Var = this.g;
        return hashCode4 ^ (f42Var != null ? f42Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("LogRequest{requestTimeMs=");
        G.append(this.a);
        G.append(", requestUptimeMs=");
        G.append(this.b);
        G.append(", clientInfo=");
        G.append(this.c);
        G.append(", logSource=");
        G.append(this.d);
        G.append(", logSourceName=");
        G.append(this.e);
        G.append(", logEvents=");
        G.append(this.f);
        G.append(", qosTier=");
        G.append(this.g);
        G.append("}");
        return G.toString();
    }

    private w32(long j, long j2, @z1 a42 a42Var, @z1 Integer num, @z1 String str, @z1 List<b42> list, @z1 f42 f42Var) {
        this.a = j;
        this.b = j2;
        this.c = a42Var;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = f42Var;
    }
}