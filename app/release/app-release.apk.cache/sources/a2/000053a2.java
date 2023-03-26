package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: EncodedPayload.java */
/* loaded from: classes2.dex */
public final class o42 {
    private final b32 a;
    private final byte[] b;

    public o42(@x1 b32 b32Var, @x1 byte[] bArr) {
        Objects.requireNonNull(b32Var, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = b32Var;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public b32 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o42) {
            o42 o42Var = (o42) obj;
            if (this.a.equals(o42Var.a)) {
                return Arrays.equals(this.b, o42Var.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder G = wo1.G("EncodedPayload{encoding=");
        G.append(this.a);
        G.append(", bytes=[...]}");
        return G.toString();
    }
}