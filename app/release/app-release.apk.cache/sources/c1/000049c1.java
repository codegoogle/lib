package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.v42;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes2.dex */
public final class j42 extends v42 {
    private final String a;
    private final byte[] b;
    private final d32 c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes2.dex */
    public static final class b extends v42.a {
        private String a;
        private byte[] b;
        private d32 c;

        @Override // com.p7700g.p99005.v42.a
        public v42 a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = wo1.t(str, " priority");
            }
            if (str.isEmpty()) {
                return new j42(this.a, this.b, this.c);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.v42.a
        public v42.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        @Override // com.p7700g.p99005.v42.a
        public v42.a c(@z1 byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.p7700g.p99005.v42.a
        public v42.a d(d32 d32Var) {
            Objects.requireNonNull(d32Var, "Null priority");
            this.c = d32Var;
            return this;
        }
    }

    @Override // com.p7700g.p99005.v42
    public String b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.v42
    @z1
    public byte[] c() {
        return this.b;
    }

    @Override // com.p7700g.p99005.v42
    @i2({i2.a.LIBRARY_GROUP})
    public d32 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v42) {
            v42 v42Var = (v42) obj;
            if (this.a.equals(v42Var.b())) {
                if (Arrays.equals(this.b, v42Var instanceof j42 ? ((j42) v42Var).b : v42Var.c()) && this.c.equals(v42Var.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    private j42(String str, @z1 byte[] bArr, d32 d32Var) {
        this.a = str;
        this.b = bArr;
        this.c = d32Var;
    }
}