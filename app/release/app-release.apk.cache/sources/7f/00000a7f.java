package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.p7700g.p99005.zq5;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaseRewardJs extends AbsFeedBackForH5 implements IRewardBridge {
    public static final String h = "JS-Reward-Brigde";
    public IRewardBridge i;

    private static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
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
                        n.a("JS-Reward-Brigde", e.getMessage());
                    }
                } catch (Throwable th) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                    n.b("JS-Reward-Brigde", "cai", th);
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
                n.b("JS-Reward-Brigde", "cai", e2);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.i;
            if (iRewardBridge != null) {
                iRewardBridge.getEndScreenInfo(obj, str);
                n.d("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            n.d("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((a) obj).a;
                if (!(windVaneWebView instanceof WindVaneWebView) || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(obj);
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
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.handlerPlayableException(obj, str);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "handlerPlayableException", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(context, windVaneWebView);
        try {
            z = Class.forName("com.anythink.expressad.video.signal.factory.IJSFactory").isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        try {
            if (z) {
                Class<?> cls = Class.forName("com.anythink.expressad.video.signal.communication.BaseRewardJsH5");
                this.i = (IRewardBridge) cls.newInstance();
                cls.getMethod("initialize", Context.class, WindVaneWebView.class).invoke(this.i, context, windVaneWebView);
            } else if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
            } else {
                this.i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.i;
            if (iRewardBridge != null) {
                iRewardBridge.install(obj, str);
            } else if (TextUtils.isEmpty(str)) {
            } else {
                if (obj != null) {
                    a aVar = (a) obj;
                    if (aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                        com.anythink.expressad.video.signal.a.j jVar = (com.anythink.expressad.video.signal.a.j) aVar.a.getObject();
                        Context context = aVar.a.getContext();
                        if (context != null && context != context.getApplicationContext()) {
                            jVar.a(context);
                        }
                        jVar.click(1, str);
                        n.d("JS-Reward-Brigde", "JSCommon install jump success");
                    }
                }
                n.d("JS-Reward-Brigde", "JSCommon install failed");
            }
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "install", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.notifyCloseBtn(obj, str);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        n.d("JS-Reward-Brigde", "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    k.a(this.e, optString);
                } else if (optInt == 2) {
                    k.b(this.e, optString);
                }
            } catch (JSONException e) {
                n.d("JS-Reward-Brigde", e.getMessage());
            } catch (Throwable th) {
                n.d("JS-Reward-Brigde", th.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.setOrientation(obj, str);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.toggleCloseBtn(obj, str);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.triggerCloseBtn(obj, str);
        } catch (Throwable th) {
            n.b("JS-Reward-Brigde", "triggerCloseBtn", th);
            j.a().a(obj, a());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(obj, windVaneWebView);
        try {
            z = Class.forName("com.anythink.expressad.video.signal.factory.IJSFactory").isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        try {
            if (z) {
                Class<?> cls = Class.forName("com.anythink.expressad.video.signal.communication.BaseRewardJsH5");
                this.i = (IRewardBridge) cls.newInstance();
                cls.getMethod("initialize", Object.class, WindVaneWebView.class).invoke(this.i, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
            } else {
                this.i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }
}