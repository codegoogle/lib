package com.anythink.expressad.video.bt.module.b;

import com.anythink.expressad.foundation.h.n;

/* loaded from: classes2.dex */
public final class d extends c {
    private static final String a = "H5ShowRewardListener";
    private com.anythink.expressad.video.bt.module.a.b b;
    private String c;

    public d(com.anythink.expressad.video.bt.module.a.b bVar, String str) {
        this.b = bVar;
        this.c = str;
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a() {
        if (this.b != null) {
            n.a(a, "onAdShow");
            this.b.a(this.c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void b() {
        if (this.b != null) {
            n.a(a, "onVideoComplete");
            this.b.b(this.c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void c() {
        if (this.b != null) {
            n.a(a, "onEndcardShow");
            this.b.c(this.c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z, com.anythink.expressad.videocommon.c.c cVar) {
        if (this.b != null) {
            n.a(a, "onAdClose");
            this.b.a(this.c, z, cVar);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(String str) {
        if (this.b != null) {
            n.a(a, "onShowFail");
            this.b.a(this.c, str);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (this.b != null) {
            n.a(a, "onVideoAdClicked");
            this.b.a(this.c, cVar);
        }
    }
}