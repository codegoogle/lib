package com.ironsource.environment.a;

import com.ironsource.mediationsdk.C1284r;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ironsource/environment/auction/AuctionProvider;", "", "()V", "mAuctionKeyList", "Ljava/util/ArrayList;", "", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getAuctionData", "environment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @NotNull
    private final ArrayList<String> a = new ArrayList<>(new a().a);
    @NotNull
    private final C1284r b = new C1284r();

    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        c25.o(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = com.ironsource.environment.c.b.a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}