package com.anythink.basead.f;

import android.content.Context;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes2.dex */
public class f extends c {
    public static final String a = "f";
    private com.anythink.basead.e.g k;

    public f(Context context, j jVar, String str, boolean z) {
        super(context, jVar, str, z);
    }

    public final void a(com.anythink.basead.e.g gVar) {
        this.k = gVar;
    }

    @Override // com.anythink.basead.f.a
    public final void a(Map<String, Object> map) {
        try {
            if (this.c == null) {
                com.anythink.basead.e.g gVar = this.k;
                if (gVar != null) {
                    gVar.onVideoShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.y));
                    return;
                }
                return;
            }
            map.get(c.h);
            String obj = map.get("extra_scenario").toString();
            int intValue = ((Integer) map.get(c.j)).intValue();
            final String str = this.d.b + this.e + System.currentTimeMillis();
            com.anythink.basead.e.b.a().a(str, new b.InterfaceC0030b() { // from class: com.anythink.basead.f.f.1
                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a() {
                    com.anythink.core.common.j.e.a(f.a, "onShow.......");
                    if (f.this.k != null) {
                        f.this.k.onAdShow();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void b() {
                    com.anythink.core.common.j.e.a(f.a, "onVideoPlayStart.......");
                    if (f.this.k != null) {
                        f.this.k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void c() {
                    com.anythink.core.common.j.e.a(f.a, "onVideoPlayEnd.......");
                    if (f.this.k != null) {
                        f.this.k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void d() {
                    com.anythink.core.common.j.e.a(f.a, "onRewarded.......");
                    if (f.this.k != null) {
                        f.this.k.onRewarded();
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void e() {
                    com.anythink.core.common.j.e.a(f.a, "onClose.......");
                    if (f.this.k != null) {
                        f.this.k.onAdClosed();
                    }
                    com.anythink.basead.e.b.a().b(str);
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(com.anythink.basead.c.e eVar) {
                    String str2 = f.a;
                    com.anythink.core.common.j.e.a(str2, "onVideoShowFailed......." + eVar.c());
                    if (f.this.k != null) {
                        f.this.k.onVideoShowFailed(eVar);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(int i) {
                    com.anythink.core.common.j.e.a(f.a, "onClick.......");
                    if (f.this.k != null) {
                        f.this.k.onAdClick(i);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(boolean z) {
                    com.anythink.core.common.j.e.a(f.a, "onDeeplinkCallback.......:".concat(String.valueOf(z)));
                    if (f.this.k != null) {
                        f.this.k.onDeeplinkCallback(z);
                    }
                }
            });
            com.anythink.core.basead.b.a aVar = new com.anythink.core.basead.b.a();
            aVar.c = this.g;
            aVar.d = str;
            aVar.a = 1;
            aVar.h = this.d;
            aVar.e = intValue;
            aVar.b = obj;
            BaseAdActivity.a(this.c, aVar);
        } catch (Exception e) {
            e.printStackTrace();
            com.anythink.basead.e.g gVar2 = this.k;
            if (gVar2 != null) {
                gVar2.onVideoShowFailed(com.anythink.basead.c.f.a("-9999", e.getMessage()));
            }
        }
    }
}