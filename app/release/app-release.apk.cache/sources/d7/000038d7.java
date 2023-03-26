package com.p7700g.p99005;

import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class af3 {
    private bf3 a;
    private boolean b = false;

    public af3(bf3 bf3Var) {
        this.a = bf3Var;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.a.a;
    }
}