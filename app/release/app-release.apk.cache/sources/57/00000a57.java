package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes2.dex */
public final class b extends d {
    private AnythinkVideoView af;
    private AnythinkContainerView ag;

    public b(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.a aVar, String str, String str2, com.anythink.expressad.video.module.a.a aVar2, int i, boolean z) {
        super(cVar, aVar, cVar2, str, str2, aVar2, i, z);
        this.af = anythinkVideoView;
        this.ag = anythinkContainerView;
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.W) {
            if (i == 8) {
                AnythinkContainerView anythinkContainerView = this.ag;
                if (anythinkContainerView != null) {
                    if (!anythinkContainerView.showAlertWebView()) {
                        AnythinkVideoView anythinkVideoView = this.af;
                        if (anythinkVideoView != null) {
                            anythinkVideoView.showAlertView();
                        }
                    } else {
                        AnythinkVideoView anythinkVideoView2 = this.af;
                        if (anythinkVideoView2 != null) {
                            anythinkVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    AnythinkVideoView anythinkVideoView3 = this.af;
                    if (anythinkVideoView3 != null) {
                        anythinkVideoView3.showAlertView();
                    }
                }
            } else if (i == 107) {
                this.ag.showVideoClickView(-1);
                this.af.setCover(false);
                this.af.videoOperate(1);
            } else if (i == 112) {
                this.af.setCover(true);
                this.af.videoOperate(2);
            } else if (i == 115) {
                this.ag.resizeMiniCard(this.af.getBorderViewWidth(), this.af.getBorderViewHeight(), this.af.getBorderViewRadius());
            }
        }
        super.a(i, obj);
    }
}