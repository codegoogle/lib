package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSChannelTracker.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010I\u001a\u00020C\u0012\u0006\u0010'\u001a\u00020 \u0012\u0006\u0010X\u001a\u00020V¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0016\u0010/\u001a\u00020\u001d8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR$\u00106\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0013\u00108\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b!\u00107R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u0016R\u0016\u0010@\u001a\u00020\u001a8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u001a8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\"\u0010I\u001a\u00020C8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u001a8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010?R\u0016\u0010N\u001a\u00020\u00048f@&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0016\u0010Q\u001a\u00020\u001d8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001fR$\u0010U\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010R\u001a\u0004\bS\u0010M\"\u0004\bT\u0010\nR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010W¨\u0006["}, d2 = {"Lcom/p7700g/p99005/xn3;", "", "", "id", "Lorg/json/JSONArray;", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;)Lorg/json/JSONArray;", "channelObjects", "Lcom/p7700g/p99005/yq4;", "u", "(Lorg/json/JSONArray;)V", "p", "()V", "b", "Lorg/json/JSONObject;", "jsonObject", "Lcom/p7700g/p99005/do3;", "influence", "a", "(Lorg/json/JSONObject;Lcom/p7700g/p99005/do3;)V", "t", com.ironsource.sdk.controller.v.a, "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/p7700g/p99005/tk3;", "e", "Lcom/p7700g/p99005/tk3;", ij3.b, "()Lcom/p7700g/p99005/tk3;", bx.B4, "(Lcom/p7700g/p99005/tk3;)V", "logger", "Lcom/p7700g/p99005/eo3;", "d", "()Lcom/p7700g/p99005/eo3;", "channelType", "h", "idTag", "i", "indirectAttributionWindow", "Lcom/p7700g/p99005/fo3;", "Lcom/p7700g/p99005/fo3;", "k", "()Lcom/p7700g/p99005/fo3;", "z", "(Lcom/p7700g/p99005/fo3;)V", "influenceType", "()Lcom/p7700g/p99005/do3;", "currentSessionInfluence", "c", "Ljava/lang/String;", com.anythink.basead.d.g.i, "x", "directId", "q", "()Z", "isDirectSessionEnabled", "s", "isUnattributedSessionEnabled", "Lcom/p7700g/p99005/zn3;", "Lcom/p7700g/p99005/zn3;", "f", "()Lcom/p7700g/p99005/zn3;", "w", "(Lcom/p7700g/p99005/zn3;)V", "dataRepository", "r", "isIndirectSessionEnabled", "l", "()Lorg/json/JSONArray;", "lastChannelObjects", "n", "lastReceivedIds", "channelLimit", "Lorg/json/JSONArray;", "j", "y", "indirectIds", "Lcom/p7700g/p99005/bm3;", "Lcom/p7700g/p99005/bm3;", "timeProvider", "<init>", "(Lcom/p7700g/p99005/zn3;Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/bm3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public abstract class xn3 {
    @Nullable
    private fo3 a;
    @Nullable
    private JSONArray b;
    @Nullable
    private String c;
    @NotNull
    private zn3 d;
    @NotNull
    private tk3 e;
    private bm3 f;

    public xn3(@NotNull zn3 zn3Var, @NotNull tk3 tk3Var, @NotNull bm3 bm3Var) {
        c25.p(zn3Var, "dataRepository");
        c25.p(tk3Var, "logger");
        c25.p(bm3Var, "timeProvider");
        this.d = zn3Var;
        this.e = tk3Var;
        this.f = bm3Var;
    }

    private final boolean q() {
        return this.d.m();
    }

    private final boolean r() {
        return this.d.n();
    }

    private final boolean s() {
        return this.d.o();
    }

    public final void A(@NotNull tk3 tk3Var) {
        c25.p(tk3Var, "<set-?>");
        this.e = tk3Var;
    }

    public abstract void a(@NotNull JSONObject jSONObject, @NotNull do3 do3Var);

    public abstract void b();

    public abstract int c();

    @NotNull
    public abstract eo3 d();

    @NotNull
    public final do3 e() {
        eo3 d = d();
        fo3 fo3Var = fo3.DISABLED;
        do3 do3Var = new do3(d, fo3Var, null);
        if (this.a == null) {
            p();
        }
        fo3 fo3Var2 = this.a;
        if (fo3Var2 != null) {
            fo3Var = fo3Var2;
        }
        if (fo3Var.g()) {
            if (q()) {
                do3Var.f(new JSONArray().put(this.c));
                do3Var.g(fo3.DIRECT);
            }
        } else if (fo3Var.i()) {
            if (r()) {
                do3Var.f(this.b);
                do3Var.g(fo3.INDIRECT);
            }
        } else if (s()) {
            do3Var.g(fo3.UNATTRIBUTED);
        }
        return do3Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!c25.g(getClass(), obj.getClass()))) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return this.a == xn3Var.a && c25.g(xn3Var.h(), h());
    }

    @NotNull
    public final zn3 f() {
        return this.d;
    }

    @Nullable
    public final String g() {
        return this.c;
    }

    @NotNull
    public abstract String h();

    public int hashCode() {
        fo3 fo3Var = this.a;
        return h().hashCode() + ((fo3Var != null ? fo3Var.hashCode() : 0) * 31);
    }

    public abstract int i();

    @Nullable
    public final JSONArray j() {
        return this.b;
    }

    @Nullable
    public final fo3 k() {
        return this.a;
    }

    @NotNull
    public abstract JSONArray l() throws JSONException;

    @NotNull
    public abstract JSONArray m(@Nullable String str);

    @NotNull
    public final JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray l = l();
            tk3 tk3Var = this.e;
            tk3Var.b("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + l);
            long i = ((long) (i() * 60)) * 1000;
            long b = this.f.b();
            int length = l.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = l.getJSONObject(i2);
                if (b - jSONObject.getLong("time") <= i) {
                    jSONArray.put(jSONObject.getString(h()));
                }
            }
        } catch (JSONException e) {
            this.e.a("Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    @NotNull
    public final tk3 o() {
        return this.e;
    }

    public abstract void p();

    public final void t() {
        this.c = null;
        JSONArray n = n();
        this.b = n;
        this.a = (n != null ? n.length() : 0) > 0 ? fo3.INDIRECT : fo3.UNATTRIBUTED;
        b();
        tk3 tk3Var = this.e;
        StringBuilder G = wo1.G("OneSignal OSChannelTracker resetAndInitInfluence: ");
        G.append(h());
        G.append(" finish with influenceType: ");
        G.append(this.a);
        tk3Var.b(G.toString());
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("OSChannelTracker{tag=");
        G.append(h());
        G.append(", influenceType=");
        G.append(this.a);
        G.append(", indirectIds=");
        G.append(this.b);
        G.append(", directId=");
        return wo1.B(G, this.c, '}');
    }

    public abstract void u(@NotNull JSONArray jSONArray);

    public final void v(@Nullable String str) {
        tk3 tk3Var = this.e;
        StringBuilder G = wo1.G("OneSignal OSChannelTracker for: ");
        G.append(h());
        G.append(" saveLastId: ");
        G.append(str);
        tk3Var.b(G.toString());
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            JSONArray m = m(str);
            tk3 tk3Var2 = this.e;
            StringBuilder G2 = wo1.G("OneSignal OSChannelTracker for: ");
            G2.append(h());
            G2.append(" saveLastId with lastChannelObjectsReceived: ");
            G2.append(m);
            tk3Var2.b(G2.toString());
            try {
                m.put(new JSONObject().put(h(), str).put("time", this.f.b()));
                if (m.length() > c()) {
                    JSONArray jSONArray = new JSONArray();
                    int length = m.length();
                    for (int length2 = m.length() - c(); length2 < length; length2++) {
                        try {
                            jSONArray.put(m.get(length2));
                        } catch (JSONException e) {
                            this.e.a("Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                        }
                    }
                    m = jSONArray;
                }
                tk3 tk3Var3 = this.e;
                StringBuilder G3 = wo1.G("OneSignal OSChannelTracker for: ");
                G3.append(h());
                G3.append(" with channelObjectToSave: ");
                G3.append(m);
                tk3Var3.b(G3.toString());
                u(m);
            } catch (JSONException e2) {
                this.e.a("Generating tracker newInfluenceId JSONObject ", e2);
            }
        }
    }

    public final void w(@NotNull zn3 zn3Var) {
        c25.p(zn3Var, "<set-?>");
        this.d = zn3Var;
    }

    public final void x(@Nullable String str) {
        this.c = str;
    }

    public final void y(@Nullable JSONArray jSONArray) {
        this.b = jSONArray;
    }

    public final void z(@Nullable fo3 fo3Var) {
        this.a = fo3Var;
    }
}