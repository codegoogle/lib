package com.p7700g.p99005;

import com.p7700g.p99005.wm3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: OSInfluenceDataRepository.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b8\u00109J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010 \u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\"\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0013\u0010%\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0013\u0010,\u001a\u00020)8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010.\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010$R\u0015\u00101\u001a\u0004\u0018\u00010\b8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00103\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0013\u00105\u001a\u00020)8F@\u0006¢\u0006\u0006\u001a\u0004\b4\u0010+R\u0013\u00107\u001a\u00020)8F@\u0006¢\u0006\u0006\u001a\u0004\b6\u0010+¨\u0006:"}, d2 = {"Lcom/p7700g/p99005/zn3;", "", "Lcom/p7700g/p99005/fo3;", "influenceType", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/fo3;)V", "a", "", "id", "c", "(Ljava/lang/String;)V", "Lorg/json/JSONArray;", "notifications", "r", "(Lorg/json/JSONArray;)V", "iams", "p", "Lcom/p7700g/p99005/wm3$e;", "influenceParams", "q", "(Lcom/p7700g/p99005/wm3$e;)V", "", com.anythink.basead.d.g.i, "()I", "iamLimit", "h", "()Lorg/json/JSONArray;", "lastIAMsReceivedData", "k", "notificationIndirectAttributionWindow", "l", "notificationLimit", "f", "iamIndirectAttributionWindow", "j", "()Lcom/p7700g/p99005/fo3;", "notificationCachedInfluenceType", "Lcom/p7700g/p99005/sl3;", "Lcom/p7700g/p99005/sl3;", "preferences", "", ij3.b, "()Z", "isUnattributedInfluenceEnabled", "e", "iamCachedInfluenceType", "d", "()Ljava/lang/String;", "cachedNotificationOpenId", "i", "lastNotificationsReceivedData", com.anythink.expressad.d.a.b.dH, "isDirectInfluenceEnabled", "n", "isIndirectInfluenceEnabled", "<init>", "(Lcom/p7700g/p99005/sl3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class zn3 {
    private final sl3 a;

    public zn3(@NotNull sl3 sl3Var) {
        c25.p(sl3Var, "preferences");
        this.a = sl3Var;
    }

    public final void a(@NotNull fo3 fo3Var) {
        c25.p(fo3Var, "influenceType");
        sl3 sl3Var = this.a;
        sl3Var.l(sl3Var.h(), wn3.v, fo3Var.toString());
    }

    public final void b(@NotNull fo3 fo3Var) {
        c25.p(fo3Var, "influenceType");
        sl3 sl3Var = this.a;
        sl3Var.l(sl3Var.h(), wn3.u, fo3Var.toString());
    }

    public final void c(@Nullable String str) {
        sl3 sl3Var = this.a;
        sl3Var.l(sl3Var.h(), wn3.k, str);
    }

    @Nullable
    public final String d() {
        sl3 sl3Var = this.a;
        return sl3Var.f(sl3Var.h(), wn3.k, null);
    }

    @NotNull
    public final fo3 e() {
        String str = fo3.UNATTRIBUTED.toString();
        sl3 sl3Var = this.a;
        return fo3.x.a(sl3Var.f(sl3Var.h(), wn3.v, str));
    }

    public final int f() {
        sl3 sl3Var = this.a;
        return sl3Var.d(sl3Var.h(), wn3.q, wm3.u);
    }

    public final int g() {
        sl3 sl3Var = this.a;
        return sl3Var.d(sl3Var.h(), wn3.o, 10);
    }

    @NotNull
    public final JSONArray h() throws JSONException {
        sl3 sl3Var = this.a;
        String f = sl3Var.f(sl3Var.h(), wn3.m, zq5.e);
        return f != null ? new JSONArray(f) : new JSONArray();
    }

    @NotNull
    public final JSONArray i() throws JSONException {
        sl3 sl3Var = this.a;
        String f = sl3Var.f(sl3Var.h(), wn3.l, zq5.e);
        return f != null ? new JSONArray(f) : new JSONArray();
    }

    @NotNull
    public final fo3 j() {
        sl3 sl3Var = this.a;
        return fo3.x.a(sl3Var.f(sl3Var.h(), wn3.u, fo3.UNATTRIBUTED.toString()));
    }

    public final int k() {
        sl3 sl3Var = this.a;
        return sl3Var.d(sl3Var.h(), wn3.p, wm3.u);
    }

    public final int l() {
        sl3 sl3Var = this.a;
        return sl3Var.d(sl3Var.h(), wn3.n, 10);
    }

    public final boolean m() {
        sl3 sl3Var = this.a;
        return sl3Var.n(sl3Var.h(), wn3.r, false);
    }

    public final boolean n() {
        sl3 sl3Var = this.a;
        return sl3Var.n(sl3Var.h(), wn3.s, false);
    }

    public final boolean o() {
        sl3 sl3Var = this.a;
        return sl3Var.n(sl3Var.h(), wn3.t, false);
    }

    public final void p(@NotNull JSONArray jSONArray) {
        c25.p(jSONArray, "iams");
        sl3 sl3Var = this.a;
        sl3Var.l(sl3Var.h(), wn3.m, jSONArray.toString());
    }

    public final void q(@NotNull wm3.e eVar) {
        c25.p(eVar, "influenceParams");
        sl3 sl3Var = this.a;
        sl3Var.b(sl3Var.h(), wn3.r, eVar.e());
        sl3 sl3Var2 = this.a;
        sl3Var2.b(sl3Var2.h(), wn3.s, eVar.f());
        sl3 sl3Var3 = this.a;
        sl3Var3.b(sl3Var3.h(), wn3.t, eVar.g());
        sl3 sl3Var4 = this.a;
        sl3Var4.a(sl3Var4.h(), wn3.n, eVar.d());
        sl3 sl3Var5 = this.a;
        sl3Var5.a(sl3Var5.h(), wn3.p, eVar.c());
        sl3 sl3Var6 = this.a;
        sl3Var6.a(sl3Var6.h(), wn3.o, eVar.a());
        sl3 sl3Var7 = this.a;
        sl3Var7.a(sl3Var7.h(), wn3.q, eVar.b());
    }

    public final void r(@NotNull JSONArray jSONArray) {
        c25.p(jSONArray, "notifications");
        sl3 sl3Var = this.a;
        sl3Var.l(sl3Var.h(), wn3.l, jSONArray.toString());
    }
}