package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.a.c;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.b91;

/* loaded from: classes2.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {
    private static final String e = ATNativeAdvancedWebview.class.getSimpleName();
    private c f;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f == null) {
                this.f = new c(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b91.a);
            getContext().registerReceiver(this.f, intentFilter);
        } catch (Throwable th) {
            n.a(e, th.getMessage());
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            c cVar = this.f;
            if (cVar != null) {
                cVar.a();
                getContext().unregisterReceiver(this.f);
            }
        } catch (Throwable th) {
            n.a(e, th.getMessage());
        }
    }
}