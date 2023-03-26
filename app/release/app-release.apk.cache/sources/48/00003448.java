package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ironsource/mediationsdk/SetAPSInterface;", "", "setAPSData", "", "adUnit", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "apsData", "Lorg/json/JSONObject;", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SetAPSInterface {
    void setAPSData(@NotNull IronSource.AD_UNIT ad_unit, @NotNull JSONObject jSONObject);
}