package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.video.bt.a.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkBTLayout extends BTBaseView {
    private static final String p = "portrait";
    private static final String q = "landscape";
    private WebView r;

    public AnythinkBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.r != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                j.a();
                j.a(this.r, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a(this.r, "broadcast", getInstanceId());
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.r;
        if (webView != null) {
            BTBaseView.a(webView, str, this.d);
        }
    }

    public void onBackPressed() {
        if (this.r != null) {
            c.a();
            c.a(this.r, "onSystemBackPressed", this.d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.r != null) {
            try {
                com.anythink.expressad.foundation.d.c cVar = this.b;
                if (cVar == null || !cVar.j()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", q);
                    } else {
                        jSONObject.put("orientation", p);
                    }
                    jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.d);
                    String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                    j.a();
                    j.a(this.r, "orientation", encodeToString);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.r = webView;
    }

    public AnythinkBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}