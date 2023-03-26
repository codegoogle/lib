package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u0013\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\u001d2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u000202HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\u0004¨\u0006@"}, d2 = {"Lcom/ironsource/mediationsdk/AuctionParams;", "", "adUnit", "", "(Ljava/lang/String;)V", "getAdUnit", "()Ljava/lang/String;", "auctionHistory", "Lcom/ironsource/mediationsdk/AuctionHistory;", "getAuctionHistory", "()Lcom/ironsource/mediationsdk/AuctionHistory;", "setAuctionHistory", "(Lcom/ironsource/mediationsdk/AuctionHistory;)V", "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", "getBannerSize", "()Lcom/ironsource/mediationsdk/ISBannerSize;", "setBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;)V", "bidders", "", "getBidders", "()Ljava/util/Map;", "setBidders", "(Ljava/util/Map;)V", ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, "getInstanceId", "setInstanceId", IronSourceConstants.EVENTS_DEMAND_ONLY, "", "()Z", "setDemandOnly", "(Z)V", "isEncryptedResponse", "setEncryptedResponse", "isOneFlow", "setOneFlow", "nonBidders", "", "getNonBidders", "()Ljava/util/List;", "setNonBidders", "(Ljava/util/List;)V", "segment", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "getSegment", "()Lcom/ironsource/mediationsdk/IronSourceSegment;", "setSegment", "(Lcom/ironsource/mediationsdk/IronSourceSegment;)V", IronSourceConstants.KEY_SESSION_DEPTH, "", "getSessionDepth", "()I", "setSessionDepth", "(I)V", "waterfallString", "getWaterfallString", "setWaterfallString", "component1", "copy", "equals", "other", "hashCode", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1278k {
    @NotNull
    public final String a;
    public boolean b;
    @NotNull
    private String c;
    public boolean d;
    @NotNull
    public Map<String, Object> e;
    @NotNull
    public List<String> f;
    public int g;
    @NotNull
    private String h;
    @Nullable
    public ISBannerSize i;
    public boolean j;

    public C1278k(@NotNull String str) {
        c25.p(str, "adUnit");
        this.a = str;
        this.c = "";
        this.e = new HashMap();
        this.f = new ArrayList();
        this.g = -1;
        this.h = "";
    }

    @NotNull
    public final String a() {
        return this.h;
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
    }

    public final void a(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.c = str;
    }

    public final void a(@NotNull List<String> list) {
        c25.p(list, "<set-?>");
        this.f = list;
    }

    public final void a(boolean z) {
        this.b = true;
    }

    public final void b(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.h = str;
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final void c(boolean z) {
        this.j = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1278k) && c25.g(this.a, ((C1278k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return wo1.B(new StringBuilder("AuctionParams(adUnit="), this.a, ')');
    }
}