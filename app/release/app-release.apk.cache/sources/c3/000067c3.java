package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageTracker.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010 \u001a\u00020\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/p7700g/p99005/yn3;", "Lcom/p7700g/p99005/xn3;", "", "id", "Lorg/json/JSONArray;", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;)Lorg/json/JSONArray;", "channelObjects", "Lcom/p7700g/p99005/yq4;", "u", "(Lorg/json/JSONArray;)V", "p", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/p7700g/p99005/do3;", "influence", "a", "(Lorg/json/JSONObject;Lcom/p7700g/p99005/do3;)V", "b", "", "i", "()I", "indirectAttributionWindow", "l", "()Lorg/json/JSONArray;", "lastChannelObjects", "c", "channelLimit", "Lcom/p7700g/p99005/eo3;", "d", "()Lcom/p7700g/p99005/eo3;", "channelType", "h", "()Ljava/lang/String;", "idTag", "Lcom/p7700g/p99005/zn3;", "dataRepository", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/bm3;", "timeProvider", "<init>", "(Lcom/p7700g/p99005/zn3;Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/bm3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class yn3 extends xn3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn3(@NotNull zn3 zn3Var, @NotNull tk3 tk3Var, @NotNull bm3 bm3Var) {
        super(zn3Var, tk3Var, bm3Var);
        c25.p(zn3Var, "dataRepository");
        c25.p(tk3Var, "logger");
        c25.p(bm3Var, "timeProvider");
    }

    @Override // com.p7700g.p99005.xn3
    public void a(@NotNull JSONObject jSONObject, @NotNull do3 do3Var) {
        c25.p(jSONObject, "jsonObject");
        c25.p(do3Var, "influence");
    }

    @Override // com.p7700g.p99005.xn3
    public void b() {
        fo3 k = k();
        if (k == null) {
            k = fo3.UNATTRIBUTED;
        }
        zn3 f = f();
        if (k == fo3.DIRECT) {
            k = fo3.INDIRECT;
        }
        f.a(k);
    }

    @Override // com.p7700g.p99005.xn3
    public int c() {
        return f().g();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public eo3 d() {
        return eo3.IAM;
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public String h() {
        return wn3.f;
    }

    @Override // com.p7700g.p99005.xn3
    public int i() {
        return f().f();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public JSONArray l() throws JSONException {
        return f().h();
    }

    @Override // com.p7700g.p99005.xn3
    @NotNull
    public JSONArray m(@Nullable String str) {
        try {
            JSONArray l = l();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = l.length();
                for (int i = 0; i < length; i++) {
                    if (!c25.g(str, l.getJSONObject(i).getString(h()))) {
                        jSONArray.put(l.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                o().a("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return l;
            }
        } catch (JSONException e2) {
            o().a("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    @Override // com.p7700g.p99005.xn3
    public void p() {
        fo3 e = f().e();
        if (e.i()) {
            y(n());
        }
        yq4 yq4Var = yq4.a;
        z(e);
        tk3 o = o();
        o.b("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
    }

    @Override // com.p7700g.p99005.xn3
    public void u(@NotNull JSONArray jSONArray) {
        c25.p(jSONArray, "channelObjects");
        f().p(jSONArray);
    }
}