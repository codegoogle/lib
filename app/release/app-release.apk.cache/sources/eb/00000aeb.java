package com.anythink.expressad.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.a.h;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.a.k;
import com.anythink.expressad.video.signal.a.l;
import com.anythink.expressad.video.signal.a.m;
import com.anythink.expressad.video.signal.a.n;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;

/* loaded from: classes2.dex */
public final class b extends a {
    private Activity h;
    private WebView i;
    private AnythinkVideoView j;
    private AnythinkContainerView k;
    private c l;
    private AnythinkBTContainer m;
    private c.a n;
    private String o;

    public b(Activity activity) {
        this.h = activity;
    }

    public final void a(j jVar) {
        this.b = jVar;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final com.anythink.expressad.video.signal.a getActivityProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.a == null) {
            this.a = new h(webView);
        }
        return this.a;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.k;
        if (anythinkContainerView != null && (activity = this.h) != null) {
            if (this.f == null) {
                this.f = new m(activity, anythinkContainerView);
            }
            return this.f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.h != null && this.m != null) {
            if (this.g == null) {
                this.g = new com.anythink.expressad.video.signal.a.i(this.h, this.m);
            }
            return this.g;
        }
        return super.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final com.anythink.expressad.video.signal.c getJSCommon() {
        if (this.h != null && this.l != null) {
            if (this.b == null) {
                this.b = new j(this.h, this.l);
            }
            this.b.a(this.h);
            this.b.a(this.o);
            this.b.a(this.n);
            return this.b;
        }
        return super.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.e == null) {
            this.e = new k(anythinkContainerView);
        }
        return this.e;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.d == null) {
            this.d = new l(webView);
        }
        return this.d;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public final com.anythink.expressad.video.signal.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.c == null) {
            this.c = new n(anythinkVideoView);
        }
        return this.c;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.h = activity;
        this.m = anythinkBTContainer;
        this.i = webView;
    }

    private b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar) {
        this.h = activity;
        this.i = webView;
        this.j = anythinkVideoView;
        this.k = anythinkContainerView;
        this.l = cVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, c.a aVar) {
        this.h = activity;
        this.i = webView;
        this.j = anythinkVideoView;
        this.k = anythinkContainerView;
        this.l = cVar;
        this.n = aVar;
        this.o = anythinkVideoView.getUnitId();
    }
}