package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ironsource/mediationsdk/TokenRepository;", "", "()V", "getBiddingData", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "tokenSettings", "Lcom/ironsource/mediationsdk/utils/TokenSettings;", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class am {
    @Nullable
    public static JSONObject a(@NotNull Context context, @NotNull com.ironsource.mediationsdk.utils.p pVar) {
        AbstractAdapter a;
        c25.p(context, "context");
        c25.p(pVar, "tokenSettings");
        if (pVar.d) {
            com.ironsource.environment.f.b bVar = new com.ironsource.environment.f.b();
            c25.p(context, "context");
            JSONObject a2 = C1284r.a(context, bVar.a);
            c25.o(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
            return com.ironsource.environment.f.b.a(a2);
        }
        NetworkSettings networkSettings = pVar.b;
        if (networkSettings == null || (a = C1272d.a().a(networkSettings, networkSettings.getApplicationSettings(), true, false)) == null) {
            return null;
        }
        return C1274f.a().a(a.getPlayerBiddingData(), pVar.c, pVar.a);
    }
}