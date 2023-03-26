package com.p7700g.p99005;

import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes3.dex */
public final class ev2 extends iv2 {
    private final String a;
    private final String b;

    public ev2(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    @Override // com.p7700g.p99005.iv2
    @Nonnull
    public String b() {
        return this.a;
    }

    @Override // com.p7700g.p99005.iv2
    @Nonnull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iv2) {
            iv2 iv2Var = (iv2) obj;
            return this.a.equals(iv2Var.b()) && this.b.equals(iv2Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("LibraryVersion{libraryName=");
        G.append(this.a);
        G.append(", version=");
        return wo1.C(G, this.b, "}");
    }
}