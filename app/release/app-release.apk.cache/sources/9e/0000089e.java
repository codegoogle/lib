package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.videocommon.b.g;

/* loaded from: classes2.dex */
public class f implements g.b {
    private static final String a = "f";
    private com.anythink.expressad.mbbanner.a.d.b b;
    private String c;

    public f(com.anythink.expressad.mbbanner.a.d.b bVar, String str) {
        this.b = bVar;
        this.c = str;
    }

    @Override // com.anythink.expressad.videocommon.b.g.a
    public final void a(String str) {
        n.b(a, "DownloadBannerUrlListener HTML SUCCESS:".concat(String.valueOf(str)));
        com.anythink.expressad.mbbanner.a.d.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, 3, str, true);
        }
    }

    @Override // com.anythink.expressad.videocommon.b.g.a
    public final void a(String str, String str2) {
        n.b(a, "DownloadBannerUrlListener HTML FAIL:".concat(String.valueOf(str)));
        com.anythink.expressad.mbbanner.a.d.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, 3, str, false);
        }
    }
}