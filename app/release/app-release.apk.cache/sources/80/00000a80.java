package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.p7700g.p99005.zq5;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaseRewardJsH5 implements IRewardBridge {
    public static final String a = "JS-Reward-Brigde";
    public IJSFactory b;

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            n.d("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void cai(Object obj, String str) {
        n.a("JS-Reward-Brigde", "cai:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
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
                    n.a("JS-Reward-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
                n.b("JS-Reward-Brigde", "cai", e2);
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
            n.b("JS-Reward-Brigde", "cai", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            IJSFactory iJSFactory = this.b;
            if (iJSFactory != null) {
                String a2 = iJSFactory.getIJSRewardVideoV1().a();
                if (!TextUtils.isEmpty(a2)) {
                    str2 = Base64.encodeToString(a2.getBytes(), 2);
                    n.a("JS-Reward-Brigde", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    n.a("JS-Reward-Brigde", "getEndScreenInfo failed");
                }
                j.a().a(obj, str2);
            }
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "getEndScreenInfo", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        n.a("JS-Reward-Brigde", "gial:".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", zq5.e);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            n.a("JS-Reward-Brigde", e.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            n.a("JS-Reward-Brigde", th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            String optString = new JSONObject(str).optString("msg");
            n.a("JS-Reward-Brigde", "handlerPlayableException,msg:".concat(String.valueOf(str)));
            this.b.getIJSRewardVideoV1().handlerPlayableException(optString);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.b = (IJSFactory) context;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        com.anythink.expressad.video.signal.a.j jVar;
        Context context;
        try {
            if (this.b != null) {
                n.a("JS-Reward-Brigde", "install:".concat(String.valueOf(str)));
                if (obj != null) {
                    a aVar = (a) obj;
                    if ((aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) && (jVar = (com.anythink.expressad.video.signal.a.j) aVar.a.getObject()) != null && (context = aVar.a.getContext()) != null && context != context.getApplicationContext()) {
                        jVar.a(context);
                    }
                }
                if (this.b.getJSContainerModule().endCardShowing()) {
                    this.b.getJSCommon().click(3, str);
                } else {
                    this.b.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "install", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            n.a("JS-Reward-Brigde", "notifyCloseBtn,state:".concat(String.valueOf(str)));
            this.b.getIJSRewardVideoV1().notifyCloseBtn(optInt);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        n.d("JS-Reward-Brigde", "openURL:".concat(String.valueOf(str)));
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
                n.d("JS-Reward-Brigde", e2.getMessage());
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
            n.d("JS-Reward-Brigde", e3.getMessage());
        } catch (Throwable th) {
            n.d("JS-Reward-Brigde", th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            String optString = new JSONObject(str).optString(CallMraidJS.b);
            n.a("JS-Reward-Brigde", "setOrientation,state:".concat(String.valueOf(str)));
            this.b.getIJSRewardVideoV1().b(optString);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            n.a("JS-Reward-Brigde", "toggleCloseBtn,state:".concat(String.valueOf(str)));
            this.b.getIJSRewardVideoV1().toggleCloseBtn(optInt);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            j.a().a(obj, a(0));
            this.b.getIJSRewardVideoV1().a(new JSONObject(str).optString(CallMraidJS.b));
            n.a("JS-Reward-Brigde", "triggerCloseBtn,state:".concat(String.valueOf(str)));
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "triggerCloseBtn", th);
            j.a().a(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.b = (IJSFactory) obj;
        }
    }
}