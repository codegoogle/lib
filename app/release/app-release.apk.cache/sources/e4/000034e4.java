package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.mediationsdk.C1276h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import java.net.URL;
import java.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ironsource/mediationsdk/AuctionHelper;", "", "settings", "Lcom/ironsource/mediationsdk/utils/AuctionSettings;", "isOneToken", "", "sessionId", "", "(Lcom/ironsource/mediationsdk/utils/AuctionSettings;ZLjava/lang/String;)V", "generateAuctionHttpRequestTask", "Lcom/ironsource/mediationsdk/AuctionHandler$AuctionHttpRequestTask;", "context", "Landroid/content/Context;", "auctionParams", "Lcom/ironsource/mediationsdk/AuctionParams;", "auctionListener", "Lcom/ironsource/mediationsdk/AuctionEventListener;", "generateRequest", "Lorg/json/JSONObject;", "getSegmentDataJson", "segment", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "isAuctionEnabled", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    @NotNull
    private final com.ironsource.mediationsdk.utils.c a;
    private final boolean b;
    @NotNull
    private final String c;

    public i(@NotNull com.ironsource.mediationsdk.utils.c cVar, boolean z, @NotNull String str) {
        c25.p(cVar, "settings");
        c25.p(str, "sessionId");
        this.a = cVar;
        this.b = z;
        this.c = str;
    }

    private static JSONObject b(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a = ironSourceSegment.a();
        int i = 0;
        int size = a.size();
        while (i < size) {
            int i2 = i + 1;
            try {
                jSONObject.put((String) a.get(i).first, a.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog.INTERNAL.error(c25.C("exception ", e.getMessage()));
            }
            i = i2;
        }
        return jSONObject;
    }

    @NotNull
    public final C1276h.a a(@NotNull Context context, @NotNull C1278k c1278k, @NotNull InterfaceC1275g interfaceC1275g) {
        JSONObject b;
        c25.p(context, "context");
        c25.p(c1278k, "auctionParams");
        c25.p(interfaceC1275g, "auctionListener");
        new JSONObject();
        JSONObject b2 = b(null);
        if (this.b) {
            b = C1274f.a().f(c1278k.a, c1278k.d, c1278k.e, c1278k.f, null, c1278k.g, c1278k.i, b2);
            c25.o(b, "getInstance().enrichToke…segmentJson\n            )");
        } else {
            b = C1274f.a().b(context, c1278k.e, c1278k.f, null, c1278k.g, this.c, this.a, c1278k.i, b2);
            c25.o(b, "getInstance().enrichToke…segmentJson\n            )");
            b.put("adunit", c1278k.a);
            b.put("doNotEncryptResponse", c1278k.d ? "false" : "true");
        }
        JSONObject jSONObject = b;
        if (c1278k.j) {
            jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        }
        if (c1278k.b) {
            jSONObject.put("isOneFlow", 1);
        }
        URL url = new URL(c1278k.j ? this.a.e : this.a.d);
        boolean z = c1278k.d;
        com.ironsource.mediationsdk.utils.c cVar = this.a;
        return new C1276h.a(interfaceC1275g, url, jSONObject, z, cVar.f, cVar.i, cVar.q, cVar.r, cVar.s);
    }

    public final boolean a() {
        return this.a.f > 0;
    }
}