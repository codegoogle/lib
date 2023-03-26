package com.anythink.basead.f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.a.a;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.q;

/* loaded from: classes2.dex */
public abstract class c implements a {
    public static final String h = "extra_request_id";
    public static final String i = "extra_scenario";
    public static final String j = "extra_orientation";
    public String b = getClass().getSimpleName();
    public Context c;
    public j d;
    public String e;
    public boolean f;
    public q g;

    public c(Context context, j jVar, String str, boolean z) {
        this.c = context.getApplicationContext();
        this.d = jVar;
        this.e = str;
        this.f = z;
    }

    private com.anythink.basead.c.e b() {
        if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.d.b)) {
            q a = com.anythink.basead.f.a.a.a(this.c).a(this.d.b, this.e);
            this.g = a;
            if (a == null) {
                return com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.u);
            }
            if (this.d.m == null) {
                return com.anythink.basead.c.f.a(com.anythink.basead.c.f.j, com.anythink.basead.c.f.v);
            }
            return null;
        }
        return com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.s);
    }

    @Override // com.anythink.basead.f.a
    public boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.f.a.a.a(this.c).a(this.g, this.d.m, this.f);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void c() {
    }

    public final boolean d() {
        if (this.c == null) {
            com.anythink.core.common.j.e.a(this.b, "isReady() context = null!");
            return false;
        } else if (TextUtils.isEmpty(this.d.b)) {
            com.anythink.core.common.j.e.a(this.b, "isReady() mPlacementId = null!");
            return false;
        } else if (TextUtils.isEmpty(this.e)) {
            com.anythink.core.common.j.e.a(this.b, "isReady() mOfferId = null!");
            return false;
        } else if (this.g == null) {
            q a = com.anythink.basead.f.a.a.a(this.c).a(this.d.b, this.e);
            this.g = a;
            if (a == null) {
                com.anythink.core.common.j.e.a(this.b, "isReady() MyOffer no exist!");
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final q e() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: Exception -> 0x0064, TryCatch #0 {Exception -> 0x0064, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:17:0x0049, B:19:0x004d, B:11:0x0030, B:13:0x0036, B:15:0x0041), top: B:24:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:2:0x0000, B:5:0x000a, B:8:0x0015, B:10:0x0029, B:17:0x0049, B:19:0x004d, B:11:0x0030, B:13:0x0036, B:15:0x0041), top: B:24:0x0000 }] */
    @Override // com.anythink.basead.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final com.anythink.basead.e.c cVar) {
        com.anythink.basead.c.e a;
        try {
            if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.d.b)) {
                q a2 = com.anythink.basead.f.a.a.a(this.c).a(this.d.b, this.e);
                this.g = a2;
                if (a2 == null) {
                    a = com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.u);
                } else {
                    a = this.d.m == null ? com.anythink.basead.c.f.a(com.anythink.basead.c.f.j, com.anythink.basead.c.f.v) : null;
                }
                if (a == null) {
                    cVar.onAdLoadFailed(a);
                    return;
                }
                com.anythink.basead.f.a.a a3 = com.anythink.basead.f.a.a.a(this.c);
                j jVar = this.d;
                a3.a(jVar.b, this.g, jVar.m, new a.InterfaceC0017a() { // from class: com.anythink.basead.f.c.1
                    @Override // com.anythink.basead.a.a.a.InterfaceC0017a
                    public final void a() {
                        com.anythink.basead.e.c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.onAdCacheLoaded();
                        }
                    }

                    @Override // com.anythink.basead.a.a.a.InterfaceC0017a
                    public final void a(com.anythink.basead.c.e eVar) {
                        com.anythink.basead.e.c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.onAdLoadFailed(eVar);
                        }
                    }
                });
                return;
            }
            a = com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.s);
            if (a == null) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            cVar.onAdLoadFailed(com.anythink.basead.c.f.a("-9999", e.getMessage()));
        }
    }
}