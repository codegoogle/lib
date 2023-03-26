package com.anythink.basead.d;

import android.content.Context;
import com.anythink.core.common.e.j;

/* loaded from: classes2.dex */
public final class f extends b {
    public f(Context context, int i, j jVar) {
        super(context, i, jVar);
    }

    public final void a(final com.anythink.basead.e.d dVar) {
        super.a(new com.anythink.basead.e.c() { // from class: com.anythink.basead.d.f.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                f fVar = f.this;
                i iVar = new i(fVar.a, fVar.d, fVar.b, fVar.e);
                com.anythink.basead.e.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoaded(iVar);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                com.anythink.basead.e.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoadError(eVar);
                }
            }
        });
    }
}