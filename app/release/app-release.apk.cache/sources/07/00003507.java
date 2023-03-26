package com.ironsource.mediationsdk.model;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ironsource/mediationsdk/model/ApplicationAuctionSettings;", "", "auctionData", "", "(Ljava/lang/String;)V", "getAuctionData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @NotNull
    private final String a;

    public b() {
        this(null, 1);
    }

    public b(@NotNull String str) {
        c25.p(str, "auctionData");
        this.a = str;
    }

    private /* synthetic */ b(String str, int i) {
        this("");
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && c25.g(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return wo1.B(new StringBuilder("ApplicationAuctionSettings(auctionData="), this.a, ')');
    }
}