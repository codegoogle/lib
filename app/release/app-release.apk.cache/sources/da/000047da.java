package com.p7700g.p99005;

import com.p7700g.p99005.u42;
import java.util.Objects;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes2.dex */
public final class i42 extends u42 {
    private final v42 a;
    private final String b;
    private final c32<?> c;
    private final f32<?, byte[]> d;
    private final b32 e;

    /* compiled from: AutoValue_SendRequest.java */
    /* loaded from: classes2.dex */
    public static final class b extends u42.a {
        private v42 a;
        private String b;
        private c32<?> c;
        private f32<?, byte[]> d;
        private b32 e;

        @Override // com.p7700g.p99005.u42.a
        public u42 a() {
            String str = this.a == null ? " transportContext" : "";
            if (this.b == null) {
                str = wo1.t(str, " transportName");
            }
            if (this.c == null) {
                str = wo1.t(str, " event");
            }
            if (this.d == null) {
                str = wo1.t(str, " transformer");
            }
            if (this.e == null) {
                str = wo1.t(str, " encoding");
            }
            if (str.isEmpty()) {
                return new i42(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.u42.a
        public u42.a b(b32 b32Var) {
            Objects.requireNonNull(b32Var, "Null encoding");
            this.e = b32Var;
            return this;
        }

        @Override // com.p7700g.p99005.u42.a
        public u42.a c(c32<?> c32Var) {
            Objects.requireNonNull(c32Var, "Null event");
            this.c = c32Var;
            return this;
        }

        @Override // com.p7700g.p99005.u42.a
        public u42.a e(f32<?, byte[]> f32Var) {
            Objects.requireNonNull(f32Var, "Null transformer");
            this.d = f32Var;
            return this;
        }

        @Override // com.p7700g.p99005.u42.a
        public u42.a f(v42 v42Var) {
            Objects.requireNonNull(v42Var, "Null transportContext");
            this.a = v42Var;
            return this;
        }

        @Override // com.p7700g.p99005.u42.a
        public u42.a g(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.b = str;
            return this;
        }
    }

    @Override // com.p7700g.p99005.u42
    public b32 b() {
        return this.e;
    }

    @Override // com.p7700g.p99005.u42
    public c32<?> c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.u42
    public f32<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u42) {
            u42 u42Var = (u42) obj;
            return this.a.equals(u42Var.f()) && this.b.equals(u42Var.g()) && this.c.equals(u42Var.c()) && this.d.equals(u42Var.e()) && this.e.equals(u42Var.b());
        }
        return false;
    }

    @Override // com.p7700g.p99005.u42
    public v42 f() {
        return this.a;
    }

    @Override // com.p7700g.p99005.u42
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("SendRequest{transportContext=");
        G.append(this.a);
        G.append(", transportName=");
        G.append(this.b);
        G.append(", event=");
        G.append(this.c);
        G.append(", transformer=");
        G.append(this.d);
        G.append(", encoding=");
        G.append(this.e);
        G.append("}");
        return G.toString();
    }

    private i42(v42 v42Var, String str, c32<?> c32Var, f32<?, byte[]> f32Var, b32 b32Var) {
        this.a = v42Var;
        this.b = str;
        this.c = c32Var;
        this.d = f32Var;
        this.e = b32Var;
    }
}