package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: Encoding.java */
/* loaded from: classes2.dex */
public final class b32 {
    private final String a;

    private b32(@x1 String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public static b32 b(@x1 String str) {
        return new b32(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b32) {
            return this.a.equals(((b32) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @x1
    public String toString() {
        return wo1.C(wo1.G("Encoding{name=\""), this.a, "\"}");
    }
}