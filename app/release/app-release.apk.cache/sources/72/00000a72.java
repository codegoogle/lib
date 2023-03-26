package com.anythink.expressad.video.signal.a;

import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class g implements com.anythink.expressad.video.signal.j {
    public static final String s = "DefaultJSVideoModule";

    @Override // com.anythink.expressad.video.signal.j
    public void alertWebViewShowed() {
        com.anythink.expressad.foundation.h.n.a(s, "alertWebViewShowed:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void closeVideoOperate(int i, int i2) {
        com.anythink.expressad.foundation.h.n.a(s, "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void dismissAllAlert() {
        com.anythink.expressad.foundation.h.n.a(s, "dismissAllAlert");
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public String getCurrentProgress() {
        com.anythink.expressad.foundation.h.n.a(s, "getCurrentProgress");
        return "{}";
    }

    @Override // com.anythink.expressad.video.signal.j
    public void hideAlertView(int i) {
        com.anythink.expressad.foundation.h.n.a(s, "hideAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void notifyCloseBtn(int i) {
        wo1.Z(i, "notifyCloseBtn:", s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressBarOperate(int i) {
        wo1.Z(i, "progressBarOperate:progressViewVisible=", s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressOperate(int i, int i2) {
        com.anythink.expressad.foundation.h.n.a(s, "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setCover(boolean z) {
        com.anythink.expressad.foundation.h.n.a(s, "setCover:".concat(String.valueOf(z)));
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setInstallDialogState(boolean z) {
        com.anythink.expressad.foundation.h.n.a(s, "setInstallDialogState");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setMiniEndCardState(boolean z) {
        com.anythink.expressad.foundation.h.n.a(s, "setMiniEndCardState");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setScaleFitXY(int i) {
        wo1.Z(i, "setScaleFitXY:", s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setVisible(int i) {
        wo1.Z(i, "setVisible:", s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showAlertView() {
        com.anythink.expressad.foundation.h.n.a(s, "showAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showIVRewardAlertView(String str) {
        com.anythink.expressad.foundation.h.n.a(s, "showAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        com.anythink.expressad.foundation.h.n.a(s, "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i2) {
        com.anythink.expressad.foundation.h.n.a(s, "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void videoOperate(int i) {
        wo1.Z(i, "videoOperate:", s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i2, String str) {
        com.anythink.expressad.foundation.h.n.a(s, "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }
}