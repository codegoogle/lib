package com.anythink.expressad.video.bt.module.b;

import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.g54;

/* loaded from: classes2.dex */
public class c implements h {
    private static final String a = "ShowRewardListener";

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a() {
        n.a(a, "onAdShow");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void b() {
        n.a(a, "onVideoComplete: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void c() {
        n.a(a, "onEndcardShow: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(boolean z, com.anythink.expressad.videocommon.c.c cVar) {
        n.a(a, "onAdClose:isCompleteView:" + z + ",reward:" + cVar);
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(String str) {
        n.a(a, "onShowFail:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(com.anythink.expressad.foundation.d.c cVar) {
        n.a(a, "onVideoAdClicked:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(boolean z, int i) {
        n.a(a, "onAdCloseWithIVReward: " + z + g54.A + i);
    }
}