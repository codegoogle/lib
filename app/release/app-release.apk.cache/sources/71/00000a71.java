package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class f implements com.anythink.expressad.video.signal.i {
    public static final String a = "js";

    @Override // com.anythink.expressad.video.signal.i
    public String a() {
        com.anythink.expressad.foundation.h.n.a(a, "getEndScreenInfo");
        return "{}";
    }

    @Override // com.anythink.expressad.video.signal.i
    public void b(String str) {
        com.anythink.expressad.foundation.h.n.a(a, "setOrientation,landscape=".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.signal.i, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        com.anythink.expressad.foundation.h.n.a(a, "handlerPlayableException，msg=".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.foundation.h.n.a(a, "install:campaignEx=".concat(String.valueOf(cVar)));
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        wo1.Z(i, "notifyCloseBtn,state=", a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        com.anythink.expressad.foundation.h.n.a(a, "orientation，config=".concat(String.valueOf(configuration)));
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        wo1.Z(i, "readyStatus,isReady=", a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        wo1.Z(i, "toggleCloseBtn,state=", a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        com.anythink.expressad.foundation.h.n.a(a, "webviewshow");
    }

    @Override // com.anythink.expressad.video.signal.i
    public void a(String str) {
        com.anythink.expressad.foundation.h.n.a(a, "triggerCloseBtn,state=".concat(String.valueOf(str)));
    }
}