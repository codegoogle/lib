package com.anythink.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.l;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MraidJSBridge extends l {
    public static final String a = "MraidJSBridge";
    private IMraidJSBridge b;

    public void close(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).a, c.cd);
        }
        try {
            n.d(a, "MRAID close");
            IMraidJSBridge iMraidJSBridge = this.b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.close();
            }
        } catch (Throwable th) {
            n.b(a, "MRAID close", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).a, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            n.d(a, "MRAID expand " + optString + " " + optString2);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.b == null) {
                return;
            }
            this.b.expand(optString, optString2.toLowerCase().equals("true"));
        } catch (Throwable th) {
            n.b(a, "MRAID expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidJSBridge) {
                this.b = (IMraidJSBridge) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidJSBridge)) {
                this.b = (IMraidJSBridge) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidJSBridge)) {
                return;
            }
            this.b = (IMraidJSBridge) windVaneWebView.getMraidObject();
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof a) {
            windVaneWebView = ((a) obj).a;
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(windVaneWebView, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            n.d(a, "MRAID Open ".concat(String.valueOf(optString)));
            if (this.b == null || TextUtils.isEmpty(optString)) {
                return;
            }
            if (windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                c mraidCampaign = this.b.getMraidCampaign();
                windVaneWebView.getUrl();
                int i = com.anythink.expressad.a.b.a.a;
                if (com.anythink.expressad.a.b.a.a(mraidCampaign)) {
                    return;
                }
            }
            this.b.open(optString);
        } catch (Throwable th) {
            n.b(a, "MRAID Open", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            n.d(a, "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.b == null) {
                return;
            }
            optString.toLowerCase().equals("true");
            String lowerCase = optString2.toLowerCase();
            int hashCode = lowerCase.hashCode();
            if (hashCode == 729267099) {
                if (lowerCase.equals("portrait")) {
                }
            } else if (hashCode != 1430647483) {
            } else {
                lowerCase.equals("landscape");
            }
        } catch (Throwable th) {
            n.b(a, "MRAID setOrientationProperties", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).a, "unload");
        }
        try {
            n.d(a, "MRAID unload");
            IMraidJSBridge iMraidJSBridge = this.b;
            if (iMraidJSBridge != null) {
                iMraidJSBridge.unload();
            }
        } catch (Throwable th) {
            n.b(a, "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof a) {
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(((a) obj).a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            n.d(a, "MRAID useCustomClose ".concat(String.valueOf(optString)));
            if (TextUtils.isEmpty(optString) || this.b == null) {
                return;
            }
            this.b.useCustomClose(optString.toLowerCase().equals("true"));
        } catch (Throwable th) {
            n.b(a, "MRAID useCustomClose", th);
        }
    }
}