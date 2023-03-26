package com.greedygame.core.network.model.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class BidResponse {
    @Nullable
    private final List<Ad> a;
    private final boolean b;

    public BidResponse(@Json(name = "ads") @Nullable List<Ad> list, @Json(name = "manual_refresh") boolean z) {
        this.a = list;
        this.b = z;
    }

    @Nullable
    public final List<Ad> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public /* synthetic */ BidResponse(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}