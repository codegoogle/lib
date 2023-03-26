package com.ironsource.mediationsdk;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ironsource/mediationsdk/CachedResponse;", "", "cachedAppKey", "", "cachedUserId", "cachedSettings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCachedAppKey", "()Ljava/lang/String;", "setCachedAppKey", "(Ljava/lang/String;)V", "getCachedSettings", "setCachedSettings", "getCachedUserId", "setCachedUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.ironsource.mediationsdk.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1285t {
    @NotNull
    public String a;
    @NotNull
    public String b;
    @NotNull
    public String c;

    public C1285t(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "cachedAppKey");
        c25.p(str2, "cachedUserId");
        c25.p(str3, "cachedSettings");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1285t) {
            C1285t c1285t = (C1285t) obj;
            return c25.g(this.a, c1285t.a) && c25.g(this.b, c1285t.b) && c25.g(this.c, c1285t.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + wo1.x(this.b, this.a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedResponse(cachedAppKey=");
        sb.append(this.a);
        sb.append(", cachedUserId=");
        sb.append(this.b);
        sb.append(", cachedSettings=");
        return wo1.B(sb, this.c, ')');
    }
}