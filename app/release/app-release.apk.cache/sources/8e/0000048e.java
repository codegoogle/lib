package com.anythink.basead.e;

import com.anythink.core.common.e.i;

/* loaded from: classes2.dex */
public abstract class f implements g {
    public i a;

    public f(i iVar) {
        this.a = iVar;
    }

    private void a() {
        i iVar = this.a;
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                com.anythink.core.common.a.b.a().b(gVar);
            }
        }
    }

    @Override // com.anythink.basead.e.a
    public void onAdShow() {
        i iVar = this.a;
        if (iVar instanceof com.anythink.core.common.e.g) {
            com.anythink.core.common.e.g gVar = (com.anythink.core.common.e.g) iVar;
            if (gVar.c() == 1) {
                com.anythink.core.common.a.b.a().b(gVar);
            }
        }
    }
}