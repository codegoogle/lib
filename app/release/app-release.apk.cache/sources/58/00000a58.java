package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes2.dex */
public final class c extends d {
    private IJSFactory af;

    public c(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.a aVar, String str, String str2, com.anythink.expressad.video.module.a.a aVar2, int i, boolean z) {
        super(cVar, aVar, cVar2, str, str2, aVar2, i, z);
        this.af = iJSFactory;
        if (iJSFactory == null) {
            this.W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.W) {
            if (i != 8) {
                if (i == 105) {
                    this.af.getJSNotifyProxy().a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.af.getJSContainerModule().showVideoClickView(-1);
                    this.af.getJSVideoModule().setCover(false);
                    this.af.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.af.getJSVideoModule().setCover(true);
                    this.af.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    com.anythink.expressad.video.signal.j jSVideoModule = this.af.getJSVideoModule();
                    this.af.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (!this.af.getJSContainerModule().showAlertWebView()) {
                this.af.getJSVideoModule().showAlertView();
            } else {
                this.af.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i, obj);
    }
}