package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.jz4;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@vo4(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ironsource/mediationsdk/InitServerResponse;", "", "()V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class H {
    @NotNull
    private static a a = new a((byte) 0);

    @vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/mediationsdk/InitServerResponse$Companion;", "", "()V", "getCachedResponse", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "isResponseCached", "", "loadFromCache", "Lcom/ironsource/mediationsdk/utils/ServerResponseWrapper;", "loadResponseFromCache", "Lcom/ironsource/mediationsdk/CachedResponse;", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static JSONObject b(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @jz4
        @NotNull
        public final C1285t a(@NotNull Context context) {
            c25.p(context, "context");
            JSONObject b = b(context);
            String optString = b.optString("appKey");
            String optString2 = b.optString(DataKeys.USER_ID);
            String optString3 = b.optString("response");
            c25.o(optString, "cachedAppKey");
            c25.o(optString2, "cachedUserId");
            c25.o(optString3, "cachedSettings");
            return new C1285t(optString, optString2, optString3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if ((r0.c.length() > 0) != false) goto L13;
     */
    @jz4
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.ironsource.mediationsdk.utils.l a(@NotNull Context context) {
        a aVar = a;
        c25.p(context, "context");
        C1285t a2 = aVar.a(context);
        boolean z = true;
        if (a2.a.length() > 0) {
            if (a2.b.length() > 0) {
            }
        }
        z = false;
        if (!z) {
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        com.ironsource.mediationsdk.utils.l lVar = new com.ironsource.mediationsdk.utils.l(context, a2.a, a2.b, a2.c);
        lVar.e = l.a.b;
        return lVar;
    }

    @jz4
    public static final boolean b(@NotNull Context context) {
        a aVar = a;
        c25.p(context, "context");
        C1285t a2 = aVar.a(context);
        if (a2.a.length() > 0) {
            if (a2.b.length() > 0) {
                if (a2.c.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}