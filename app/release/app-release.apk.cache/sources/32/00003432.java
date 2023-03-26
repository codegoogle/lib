package com.ironsource.mediationsdk;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ironsource/mediationsdk/IronSourceAdvId;", "", "advId", "", "advIdType", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdvId", "()Ljava/lang/String;", "getAdvIdType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K {
    @NotNull
    public final String a;
    @NotNull
    public final String b;

    public K(@NotNull String str, @NotNull String str2) {
        c25.p(str, "advId");
        c25.p(str2, "advIdType");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            K k = (K) obj;
            return c25.g(this.a, k.a) && c25.g(this.b, k.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IronSourceAdvId(advId=");
        sb.append(this.a);
        sb.append(", advIdType=");
        return wo1.B(sb, this.b, ')');
    }
}