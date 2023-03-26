package com.anythink.expressad.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.module.AnythinkVideoView;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l extends e {
    private static final String n = "onVideoStatusNotify";
    private static final String o = "onJSClick";
    private static final String p = "onVideoProgressNotify";
    private static final String q = "webviewshow";
    private static final String r = "showDataInfo";
    private static final String s = "portrait";
    private static final String t = "landscape";
    private WebView u;

    public l(WebView webView) {
        this.u = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a() {
        super.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.u);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i) {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.u, n, encodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, String str) {
        super.a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.u, o, encodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(AnythinkVideoView.a aVar) {
        super.a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(aVar.a, aVar.b));
            jSONObject.put("time", String.valueOf(aVar.a));
            jSONObject.put("duration", String.valueOf(aVar.b));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.u, p, encodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String a(int i, int i2) {
        if (i2 != 0) {
            double d = i / i2;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(s.a(Double.valueOf(d)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i2);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(Object obj) {
        super.a(obj);
        String encodeToString = (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2);
        com.anythink.expressad.atsignalcommon.windvane.j.a();
        com.anythink.expressad.atsignalcommon.windvane.j.a(this.u, "webviewshow", encodeToString);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = t;
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.u, r, encodeToString);
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }
}