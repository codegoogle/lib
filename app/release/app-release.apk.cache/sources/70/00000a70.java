package com.anythink.expressad.video.signal.a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class e implements com.anythink.expressad.video.signal.g {
    public static final String m = "DefaultJSNotifyProxy";

    @Override // com.anythink.expressad.video.signal.g
    public void a() {
        com.anythink.expressad.foundation.h.n.a(m, "onSignalCommunication");
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i) {
        wo1.Z(i, "onVideoStatusNotify:", m);
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i, String str) {
        com.anythink.expressad.foundation.h.n.a(m, "onClick:" + i + ",pt:" + str);
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(AnythinkVideoView.a aVar) {
        com.anythink.expressad.foundation.h.n.a(m, "onProgressNotify:" + aVar.toString());
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(Object obj) {
        com.anythink.expressad.foundation.h.n.a(m, "onWebviewShow:".concat(String.valueOf(obj)));
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i, int i2, int i3, int i4) {
        com.anythink.expressad.foundation.h.n.a(m, "showDataInfo");
    }
}