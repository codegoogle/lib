package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.foundation.h.s;

/* loaded from: classes2.dex */
public class WindVaneWebView extends BaseWebView {
    public o b;
    public d c;
    public i d;
    private Object e;
    private Object f;
    private String g;
    private e h;
    private String i;
    private boolean j;
    private float k;
    private float l;

    public WindVaneWebView(Context context) {
        super(context);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public void clearWebView() {
        if (this.j) {
            return;
        }
        loadUrl("about:blank");
    }

    public String getCampaignId() {
        return this.g;
    }

    public Object getJsObject(String str) {
        i iVar = this.d;
        if (iVar == null) {
            return null;
        }
        return iVar.a(str);
    }

    public Object getMraidObject() {
        return this.f;
    }

    public Object getObject() {
        return this.e;
    }

    public String getRid() {
        return this.i;
    }

    public d getSignalCommunication() {
        return this.c;
    }

    public e getWebViewListener() {
        return this.h;
    }

    public boolean isDestroyed() {
        return this.j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.anythink.expressad.atsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.k = motionEvent.getRawX();
                    this.l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.k;
                    float y = motionEvent.getY() - this.l;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48.0f) && ((rawX <= 0.0f || rawX <= 48.0f) && ((y >= 0.0f || (-1.0f) * y <= 48.0f) && (y <= 0.0f || y <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        if (this.d == null) {
            return;
        }
        i.a(cls);
    }

    public void release() {
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.e = null;
            int j = s.j(getContext());
            if (j == 0) {
                this.j = true;
                destroy();
                return;
            }
            new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView.1
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView.this.j = true;
                    WindVaneWebView.this.destroy();
                }
            }, j * 1000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        i iVar = this.d;
        if (iVar != null) {
            iVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        i iVar = this.d;
        if (iVar != null) {
            iVar.a(obj);
        }
    }

    public void setCampaignId(String str) {
        this.g = str;
    }

    public void setMraidObject(Object obj) {
        this.f = obj;
    }

    public void setObject(Object obj) {
        this.e = obj;
    }

    public void setRid(String str) {
        this.i = str;
    }

    public void setSignalCommunication(d dVar) {
        this.c = dVar;
        dVar.a(this);
    }

    public void setWebViewChromeClient(o oVar) {
        this.b = oVar;
        setWebChromeClient(oVar);
    }

    public void setWebViewListener(e eVar) {
        this.h = eVar;
        o oVar = this.b;
        if (oVar != null) {
            oVar.a(eVar);
        }
        com.anythink.expressad.atsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(eVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.anythink.expressad.atsignalcommon.base.BaseWebView
    public final void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            WebSettings settings = getSettings();
            settings.setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            WebSettings settings2 = getSettings();
            settings2.setUserAgentString(com.anythink.core.common.j.d.i() + " WindVane/3.0.2");
        }
        if (this.b == null) {
            this.b = new o(this);
        }
        setWebViewChromeClient(this.b);
        p pVar = new p();
        this.mWebViewClient = pVar;
        setWebViewClient(pVar);
        if (this.c == null) {
            d mVar = new m(this.a);
            this.c = mVar;
            setSignalCommunication(mVar);
        }
        this.d = new i(this.a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = 0.0f;
        this.l = 0.0f;
    }
}