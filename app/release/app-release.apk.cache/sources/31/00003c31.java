package com.p7700g.p99005;

import com.p7700g.p99005.i52;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes2.dex */
public final class c52 extends i52 {
    private final Iterable<p42> a;
    private final byte[] b;

    /* compiled from: AutoValue_BackendRequest.java */
    /* loaded from: classes2.dex */
    public static final class b extends i52.a {
        private Iterable<p42> a;
        private byte[] b;

        @Override // com.p7700g.p99005.i52.a
        public i52 a() {
            String str = this.a == null ? " events" : "";
            if (str.isEmpty()) {
                return new c52(this.a, this.b);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @Override // com.p7700g.p99005.i52.a
        public i52.a b(Iterable<p42> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.a = iterable;
            return this;
        }

        @Override // com.p7700g.p99005.i52.a
        public i52.a c(@z1 byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // com.p7700g.p99005.i52
    public Iterable<p42> c() {
        return this.a;
    }

    @Override // com.p7700g.p99005.i52
    @z1
    public byte[] d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i52) {
            i52 i52Var = (i52) obj;
            if (this.a.equals(i52Var.c())) {
                if (Arrays.equals(this.b, i52Var instanceof c52 ? ((c52) i52Var).b : i52Var.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder G = wo1.G("BackendRequest{events=");
        G.append(this.a);
        G.append(", extras=");
        G.append(Arrays.toString(this.b));
        G.append("}");
        return G.toString();
    }

    private c52(Iterable<p42> iterable, @z1 byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}