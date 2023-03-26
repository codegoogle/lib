package com.anythink.expressad.video.bt.module.b;

import com.anythink.expressad.foundation.h.n;

/* loaded from: classes2.dex */
public final class b implements g {
    private static final String a = "RewardVideoListener";

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a() {
        n.a(a, "onLoadSuccess:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void b() {
        n.a(a, "onVideoLoadSuccess:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void c() {
        n.a(a, "onAdShow");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void d() {
        n.a(a, "onVideoAdClicked:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void e() {
        n.a(a, "onEndcardShow: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void f() {
        n.a(a, "onVideoComplete: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a(String str) {
        n.a(a, "onVideoLoadFail:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void b(String str) {
        n.a(a, "onShowFail:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a(boolean z, String str, float f) {
        n.a(a, "onAdClose:" + z + ",RewardName:" + str + ",rewardAmout:" + f);
    }
}