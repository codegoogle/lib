package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* compiled from: OSNotificationGenerationJob.java */
/* loaded from: classes3.dex */
public class al3 {
    private vk3 a;
    private Context b;
    private JSONObject c;
    private boolean d;
    private boolean e;
    private Long f;
    private CharSequence g;
    private CharSequence h;
    private Uri i;
    private Integer j;
    private Integer k;
    private Uri l;

    public al3(Context context) {
        this.b = context;
    }

    public void A(Uri uri) {
        this.i = uri;
    }

    public void B(CharSequence charSequence) {
        this.h = charSequence;
    }

    public void C(boolean z) {
        this.d = z;
    }

    public void D(Long l) {
        this.f = l;
    }

    public JSONObject a() {
        return this.a.e() != null ? this.a.e() : new JSONObject();
    }

    public Integer b() {
        return Integer.valueOf(this.a.f());
    }

    public String c() {
        return jm3.C0(this.c);
    }

    public CharSequence d() {
        CharSequence charSequence = this.g;
        return charSequence != null ? charSequence : this.a.i();
    }

    public Context e() {
        return this.b;
    }

    public JSONObject f() {
        return this.c;
    }

    public vk3 g() {
        return this.a;
    }

    public Integer h() {
        return this.k;
    }

    public Uri i() {
        return this.l;
    }

    public CharSequence j() {
        return this.g;
    }

    public Integer k() {
        return this.j;
    }

    public Uri l() {
        return this.i;
    }

    public CharSequence m() {
        return this.h;
    }

    public Long n() {
        return this.f;
    }

    public CharSequence o() {
        CharSequence charSequence = this.h;
        return charSequence != null ? charSequence : this.a.C();
    }

    public boolean p() {
        return this.a.s() != null;
    }

    public boolean q() {
        return this.e;
    }

    public boolean r() {
        return this.d;
    }

    public void s(Context context) {
        this.b = context;
    }

    public void t(boolean z) {
        this.e = z;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSNotificationGenerationJob{jsonPayload=");
        G.append(this.c);
        G.append(", isRestoring=");
        G.append(this.d);
        G.append(", isNotificationToDisplay=");
        G.append(this.e);
        G.append(", shownTimeStamp=");
        G.append(this.f);
        G.append(", overriddenBodyFromExtender=");
        G.append((Object) this.g);
        G.append(", overriddenTitleFromExtender=");
        G.append((Object) this.h);
        G.append(", overriddenSound=");
        G.append(this.i);
        G.append(", overriddenFlags=");
        G.append(this.j);
        G.append(", orgFlags=");
        G.append(this.k);
        G.append(", orgSound=");
        G.append(this.l);
        G.append(", notification=");
        G.append(this.a);
        G.append('}');
        return G.toString();
    }

    public void u(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void v(vk3 vk3Var) {
        if (vk3Var != null && !vk3Var.E()) {
            vk3 vk3Var2 = this.a;
            if (vk3Var2 != null && vk3Var2.E()) {
                vk3Var.K(this.a.f());
            } else {
                vk3Var.K(new SecureRandom().nextInt());
            }
        }
        this.a = vk3Var;
    }

    public void w(Integer num) {
        this.k = num;
    }

    public void x(Uri uri) {
        this.l = uri;
    }

    public void y(CharSequence charSequence) {
        this.g = charSequence;
    }

    public void z(Integer num) {
        this.j = num;
    }

    public al3(Context context, JSONObject jSONObject) {
        this(context, new vk3(jSONObject), jSONObject);
    }

    public al3(Context context, vk3 vk3Var, JSONObject jSONObject) {
        this.b = context;
        this.c = jSONObject;
        v(vk3Var);
    }
}