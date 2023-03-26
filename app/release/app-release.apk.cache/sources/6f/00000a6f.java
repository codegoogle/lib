package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class d implements com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h {
    public static final String j = "DefaultJSContainerModule";

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i2, int i3) {
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        com.anythink.expressad.foundation.h.n.a(j, "endCardShowing");
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        com.anythink.expressad.foundation.h.n.a(j, "handlerPlayableException ,msg=".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        com.anythink.expressad.foundation.h.n.a(j, "hideAlertWebview ,msg=");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.foundation.h.n.a(j, "install ,campaign=".concat(String.valueOf(cVar)));
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        com.anythink.expressad.foundation.h.n.a(j, "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        com.anythink.expressad.foundation.h.n.a(j, "miniCardLoaded");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        com.anythink.expressad.foundation.h.n.a(j, "miniCardShowing");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        wo1.Z(i, "notifyCloseBtn:state = ", j);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        com.anythink.expressad.foundation.h.n.a(j, "orientation ,config=".concat(String.valueOf(configuration)));
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        com.anythink.expressad.foundation.h.n.a(j, "preLoadData");
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        wo1.Z(i, "readyStatus:isReady=", j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i2, int i3) {
        com.anythink.expressad.foundation.h.n.a(j, "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        com.anythink.expressad.foundation.h.n.a(j, "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        wo1.Z(i, "showEndcard,type=", j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        com.anythink.expressad.foundation.h.n.a(j, "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        com.anythink.expressad.foundation.h.n.a(j, "showPlayableView");
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        wo1.Z(i, "showVideoClickView:", j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        com.anythink.expressad.foundation.h.n.a(j, "showVideoEndCover");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        wo1.Z(i, "toggleCloseBtn:state=", j);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        com.anythink.expressad.foundation.h.n.a(j, "webviewshow");
    }
}