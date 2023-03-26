package com.anythink.expressad.atsignalcommon.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class CommonBannerJSBridgeImp implements IBannerJSBridge {
    public static final String a = "CommonBannerJSBridgeImp";

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void cai(Object obj, String str) {
        n.a(a, "cai:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                try {
                    String optString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(optString)) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                    }
                    int i = s.a(m.a().e(), optString) ? 1 : 2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", CommonJSBridgeImpUtils.b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i);
                        jSONObject.put("data", jSONObject2);
                        j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
                        n.a(a, e.getMessage());
                    }
                } catch (Throwable th) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                    n.b(a, "cai", th);
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
                n.b(a, "cai", e2);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        n.a(a, "click: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        n.a(a, "getFileInfo:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getNetstat(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        n.d(a, "getNetstat:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context e = m.a().e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (e == null) {
            try {
                if ((obj instanceof a) && (windVaneWebView = ((a) obj).a) != null) {
                    e = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                n.d(a, e2.getMessage());
            }
        }
        if (e == null) {
            j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NativeAdvancedJsUtils.m, com.anythink.expressad.foundation.h.j.a());
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            j.a().a(obj, jSONObject2);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
            j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void gial(Object obj, String str) {
        n.a(a, "gial:".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.b);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            n.a(a, e.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            n.a(a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void handlerH5Exception(Object obj, String str) {
        n.a(a, "handlerH5Exception: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void increaseOfferFrequence(Object obj, String str) {
        n.a(a, "increaseOfferFrequence:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                CommonJSBridgeImpUtils.increaseOfferFrequence(obj, new JSONObject(str));
            } catch (Throwable th) {
                n.b(a, "increaseOfferFrequence", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        n.a(a, "init: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        n.a(a, "install: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof a) {
                j.a();
                j.b(((a) obj).a);
            }
        } catch (Throwable th) {
            n.b(a, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        n.d(a, "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context e = m.a().e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (e == null) {
            try {
                if ((obj instanceof a) && (windVaneWebView = ((a) obj).a) != null) {
                    e = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                n.d(a, e2.getMessage());
            }
        }
        if (e == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                k.a(e, optString);
            } else if (optInt == 2) {
                k.b(e, optString);
            }
        } catch (JSONException e3) {
            n.d(a, e3.getMessage());
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        n.a(a, "readyStatus: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
        n.a(a, "reportUrls:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    String optString = jSONObject.optString("url");
                    int optInt2 = jSONObject.optInt("report");
                    boolean z = true;
                    if (optInt2 == 0) {
                        Context e = m.a().e();
                        if (optInt == 0) {
                            z = false;
                        }
                        com.anythink.expressad.a.a.a(e, (c) null, "", optString, z);
                    } else {
                        com.anythink.expressad.a.a.a(m.a().e(), null, "", optString, false, optInt != 0, optInt2);
                    }
                }
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
            } catch (Throwable th) {
                n.b(a, "reportUrls", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
        n.a(a, "resetCountdown: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        n.a(a, "sendImpressions: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        n.a(a, "toggleCloseBtn: ".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        n.a(a, "triggerCloseBtn: ".concat(String.valueOf(str)));
    }
}