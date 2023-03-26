package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes2.dex */
public class ATSplashWebview extends WindVaneWebView {
    private static final String e = ATSplashWebview.class.getSimpleName();
    private String f;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public String getRequestId() {
        return this.f;
    }

    public void setRequestId(String str) {
        this.f = str;
    }
}