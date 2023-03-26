package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.d.b.b;
import com.p7700g.p99005.tm4;

/* loaded from: classes2.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        windVaneWebView.loadDataWithBaseURL(null, "<html><script>" + b.a().b() + "</script></html>", tm4.D, "utf-8", null);
    }
}