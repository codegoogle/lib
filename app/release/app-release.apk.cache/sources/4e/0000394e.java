package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationTracker.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/p7700g/p99005/ao3;", "Lcom/p7700g/p99005/xn3;", "", "id", "Lorg/json/JSONArray;", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;)Lorg/json/JSONArray;", "channelObjects", "Lcom/p7700g/p99005/yq4;", "u", "(Lorg/json/JSONArray;)V", "p", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/p7700g/p99005/do3;", "influence", "a", "(Lorg/json/JSONObject;Lcom/p7700g/p99005/do3;)V", "b", "l", "()Lorg/json/JSONArray;", "lastChannelObjects", "Lcom/p7700g/p99005/eo3;", "d", "()Lcom/p7700g/p99005/eo3;", "channelType", "", "i", "()I", "indirectAttributionWindow", "c", "channelLimit", "h", "()Ljava/lang/String;", "idTag", "Lcom/p7700g/p99005/zn3;", "dataRepository", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/bm3;", "timeProvider", "<init>", "(Lcom/p7700g/p99005/zn3;Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/bm3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class ao3 extends xn3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao3(@NotNull zn3 zn3Var, @NotNull tk3 tk3Var, @NotNull bm3 bm3Var) {
        super(zn3Var, tk3Var, bm3Var);
        c25.p(zn3Var, "dataRepository");
        c25.p(tk3Var, "logger");
        c25.p(bm3Var, "timeProvider");
    }

    @Override // com.p7700g.p99005.xn3
    public void a(@NotNull JSONObject jSONObject, @NotNull do3 do3Var) {
        c25.p(jSONObject, "jsonObject");
        c25.p(do3Var, "influence");
        if (do3Var.e().f()) {
            try {
                jSONObject.put("direct", do3Var.e().g());
                jSONObject.put("notification_ids", do3Var.c());
            } catch (JSONException e) {
                o().a("Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    @Override // com.p7700g.p99005.xn3
    public void b() {
        zn3 f = f();
        fo3 k = k();
        if (k == null) {
            k = fo3.UNATTRIBUTED;
        }
        f.b(k);
        f().c(g());
    }

    @Override // com.p7700g.p99005.xn3
    public int c() {
        return f().l();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public eo3 d() {
        return eo3.NOTIFICATION;
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public String h() {
        return "notification_id";
    }

    @Override // com.p7700g.p99005.xn3
    public int i() {
        return f().k();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public JSONArray l() throws JSONException {
        return f().i();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public JSONArray m(@Nullable String str) {
        try {
            return l();
        } catch (JSONException e) {
            o().a("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    @Override // com.p7700g.p99005.xn3
    public void p() {
        fo3 j = f().j();
        if (j.i()) {
            y(n());
        } else if (j.g()) {
            x(f().d());
        }
        yq4 yq4Var = yq4.a;
        z(j);
        tk3 o = o();
        o.b("OneSignal NotificationTracker initInfluencedTypeFromCache: " + this);
    }

    @Override // com.p7700g.p99005.xn3
    public void u(@NotNull JSONArray jSONArray) {
        c25.p(jSONArray, "channelObjects");
        f().r(jSONArray);
    }
}