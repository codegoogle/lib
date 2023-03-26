package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.vn3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: OSInAppMessageContent.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0003\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b \u0010\bR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010*\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/p7700g/p99005/bk3;", "", "", "d", "Z", com.anythink.basead.d.g.i, "()Z", "k", "(Z)V", "isFullBleed", "", "f", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "i", "(Ljava/lang/Double;)V", "displayDuration", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "contentHtml", "", AFHydra.STATUS_IDLE, "()I", "l", "(I)V", "pageHeight", "c", "n", "useWidthMargin", "e", com.anythink.expressad.d.a.b.dH, "useHeightMargin", "Lcom/p7700g/p99005/vn3$m;", "Lcom/p7700g/p99005/vn3$m;", "()Lcom/p7700g/p99005/vn3$m;", "j", "(Lcom/p7700g/p99005/vn3$m;)V", vn3.k.k, "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public class bk3 {
    @Nullable
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    @Nullable
    private vn3.m e;
    @Nullable
    private Double f;
    private int g;

    public bk3(@NotNull JSONObject jSONObject) {
        c25.p(jSONObject, "jsonObject");
        this.b = true;
        this.c = true;
        this.a = jSONObject.optString(ck3.a);
        this.f = Double.valueOf(jSONObject.optDouble(ck3.c));
        JSONObject optJSONObject = jSONObject.optJSONObject(ck3.b);
        this.b = !(optJSONObject != null ? optJSONObject.optBoolean(ck3.d, false) : false);
        this.c = !(optJSONObject != null ? optJSONObject.optBoolean(ck3.e, false) : false);
        this.d = !this.b;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Double b() {
        return this.f;
    }

    @Nullable
    public final vn3.m c() {
        return this.e;
    }

    public final int d() {
        return this.g;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.d;
    }

    public final void h(@Nullable String str) {
        this.a = str;
    }

    public final void i(@Nullable Double d) {
        this.f = d;
    }

    public final void j(@Nullable vn3.m mVar) {
        this.e = mVar;
    }

    public final void k(boolean z) {
        this.d = z;
    }

    public final void l(int i) {
        this.g = i;
    }

    public final void m(boolean z) {
        this.b = z;
    }

    public final void n(boolean z) {
        this.c = z;
    }
}