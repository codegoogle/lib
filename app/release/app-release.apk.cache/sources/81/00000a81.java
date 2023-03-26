package com.anythink.expressad.video.signal.communication;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.d.b;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.zq5;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaseVideoBridge extends AbsFeedBackForH5 implements IVideoBridge {
    public static final String h = "JS-Video-Brigde";
    private static final int j = 1;
    private static final int k = 2;
    private static final String l = "showTransparent";
    private static final String m = "mute";
    private static final String n = "closeType";
    private static final String o = "orientationType";
    private static final String p = "type";
    private static final String q = "h5cbp";
    private static final String r = "webfront";
    private static final String s = "showAlertRole";
    public IJSFactory i;

    private static String a(int i) {
        switch (i) {
            case 1:
                return ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO;
            case 2:
                return "unit_id";
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return AbstractLog.DEVICE;
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    private static void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put(qm3.b.j, "params is null");
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            n.a(h, e.getMessage());
        }
    }

    private static String b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            n.d(h, "code to string is error");
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "appendSubView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "appendViewTo error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void bringViewToFront(Object obj, String str) {
        a(obj, str);
        try {
            c.a().m(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "bringViewToFront error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void broadcast(Object obj, String str) {
        a(obj, str);
        try {
            c.a().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "broadcast error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void cai(Object obj, String str) {
        n.a(h, "cai:".concat(String.valueOf(str)));
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
                    n.a(h, e.getMessage());
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
                n.b(h, "cai", e2);
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
            n.b(h, "cai", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void clearAllCache(Object obj, String str) {
        try {
            m.a().e().getSharedPreferences(a.p, 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put(qm3.b.j, "Success");
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            n.d(h, "getAllCache error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void click(Object obj, String str) {
        String str2;
        int i;
        com.anythink.expressad.video.signal.a.j jVar;
        n.b(h, com.anythink.expressad.foundation.d.c.bY);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                i = jSONObject.optInt("type");
                str2 = jSONObject.optString("pt");
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = "";
                i = 1;
            }
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(i, str2);
            } else if (obj != null) {
                com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                if (!(aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) || (jVar = (com.anythink.expressad.video.signal.a.j) aVar.a.getObject()) == null) {
                    return;
                }
                jVar.click(i, str2);
            }
        } catch (Throwable th) {
            n.b(h, "click error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeAd(Object obj, String str) {
        a(obj, str);
        try {
            c.a().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "closeAd error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(com.anythink.expressad.foundation.d.c.cd);
            int optInt2 = jSONObject.optInt("view_visible");
            n.b(h, "closeVideoOperte,close:" + optInt + ",viewVisible:" + optInt2);
            this.i.getJSVideoModule().closeVideoOperate(optInt, optInt2);
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "closeOperte error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeWeb(Object obj, String str) {
        n.d(h, "type".concat(String.valueOf(str)));
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("status");
            this.i.getJSContainerModule().hideAlertWebview();
            this.i.getJSVideoModule().hideAlertView(optInt);
        } catch (Throwable th) {
            n.b(h, "closeWeb", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createNativeEC(Object obj, String str) {
        a(obj, str);
        try {
            c.a().Q(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "createNativeEC error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createPlayerView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "createPlayerView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "createSubPlayTemplateView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "createWebview error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createWebview(Object obj, String str) {
        a(obj, str);
        try {
            c.a().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "createWebview error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void destroyComponent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "destroyComponent error ".concat(String.valueOf(th)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #2 {all -> 0x0097, blocks: (B:15:0x0064, B:18:0x0077, B:21:0x0082, B:19:0x007b), top: B:30:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[Catch: all -> 0x0097, TryCatch #2 {all -> 0x0097, blocks: (B:15:0x0064, B:18:0x0077, B:21:0x0082, B:19:0x007b), top: B:30:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:15:0x0064, B:18:0x0077, B:21:0x0082, B:19:0x007b), top: B:30:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getAllCache(Object obj, String str) {
        JSONObject jSONObject;
        Throwable th;
        String str2;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = m.a().e().getSharedPreferences(a.p, 0);
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            jSONObject = null;
            th = th2;
        }
        try {
            try {
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str2 = "getAllCache Success";
            } catch (Throwable th3) {
                th = th3;
                n.d(h, "getAllCache error ".concat(String.valueOf(th)));
                str2 = "getAllCache Error, reason is : " + th.getMessage();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 0);
                jSONObject2.put(qm3.b.j, str2);
                if (jSONObject == null) {
                }
                if (obj == null) {
                }
            }
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("code", 0);
            jSONObject22.put(qm3.b.j, str2);
            if (jSONObject == null) {
                jSONObject22.put("data", jSONObject);
            } else {
                jSONObject22.put("data", "{}");
            }
            if (obj == null) {
                j.a().a(obj, Base64.encodeToString(jSONObject22.toString().getBytes(), 2));
            }
        } catch (Throwable th4) {
            n.d(h, "getAllCache error ".concat(String.valueOf(th4)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                b.a();
                String a = b.a(optString);
                if (TextUtils.isEmpty(a)) {
                    b.a();
                    jSONObject = new JSONObject(b.c().T());
                } else {
                    jSONObject = new JSONObject(a);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(qm3.b.j, "Success");
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(qm3.b.j, "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put(qm3.b.j, "Get App Setting error, because must give a appId.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.d(h, "getAppSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getComponentOptions(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.f(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "getComponentOptions error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.i;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                n.b(h, "getCurrentProgress:".concat(String.valueOf(currentProgress)));
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                j.a().a(obj, currentProgress);
            }
        } catch (Throwable th) {
            n.b(h, "getCurrentProgress error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCutout(Object obj, String str) {
        try {
            String o2 = this.i.getJSCommon().o();
            n.d(h, o2);
            if (obj != null && !TextUtils.isEmpty(o2)) {
                j.a().a(obj, Base64.encodeToString(o2.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(qm3.b.j, "No notch data, plz try again later.");
            j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.d(h, "getCutout error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getEncryptPrice(Object obj, String str) {
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getFileInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.P(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.b(h, "getFileInfo error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject k2 = com.anythink.expressad.videocommon.e.c.a().b().k();
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                jSONObject.put("code", 0);
                jSONObject.put(qm3.b.j, "Success");
                jSONObject.put("data", k2);
            } else {
                jSONObject.put("code", 1);
                jSONObject.put(qm3.b.j, "Get Reward Setting error, plz try again later.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.d(h, "getRewardSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appid", "");
            String optString2 = jSONObject.optString(d.a.c, "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONObject Q = com.anythink.expressad.videocommon.e.c.a().a(optString, optString2).Q();
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(qm3.b.j, "Success");
                    jSONObject2.put("data", Q);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(qm3.b.j, "Get Reward Unit Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put(qm3.b.j, "Get reward unit Setting error, because must give appId and unitId.");
            }
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.d(h, "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getSDKInfo(Object obj, String str) {
        n.b(h, "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.i != null) {
                    while (i < jSONArray.length()) {
                        int i2 = jSONArray.getInt(i);
                        jSONObject.put(a(i2), this.i.getJSCommon().h(i2));
                        i++;
                    }
                } else if (obj != null) {
                    while (i < jSONArray.length()) {
                        int i3 = jSONArray.getInt(i);
                        com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                        if (aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                            jSONObject.put(a(i3), ((com.anythink.expressad.video.signal.a.j) aVar.a.getObject()).h(i3));
                        }
                        i++;
                    }
                }
                j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            j.a().b(obj, "params is null");
        } catch (Throwable th) {
            n.b(h, "getSDKInfo error", th);
            j.a().b(obj, "exception");
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(qm3.b.j, "Get Unit Setting error, RV/IV can not support this method.");
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.d(h, "getUnitSetting error : " + th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void gial(Object obj, String str) {
        n.a(h, "gial:".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", zq5.e);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            n.a(h, e.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            n.a(h, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handleNativeObject(Object obj, String str) {
        a(obj, str);
        try {
            com.anythink.expressad.video.bt.a.b.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "handleNativeObject error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            n.b(h, "handlerH5Exception,params:".concat(String.valueOf(str)));
            this.i.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString(qm3.b.j, "h5 error"));
        } catch (Throwable th) {
            n.b(h, "handlerH5Exception", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void hideView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "hideView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void increaseOfferFrequence(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            new JSONObject(str);
            c.a(obj);
        } catch (Throwable th) {
            n.d(h, "increaseOfferFrequence error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void init(Object obj, String str) {
        n.b(h, e31.b);
        try {
            IJSFactory iJSFactory = this.i;
            int i = 1;
            if (iJSFactory != null) {
                String i2 = iJSFactory.getJSCommon().i();
                if (!TextUtils.isEmpty(i2)) {
                    i2 = Base64.encodeToString(i2.getBytes(), 2);
                }
                j.a().a(obj, i2);
                this.i.getJSCommon().h();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(l);
                int optInt2 = jSONObject.optInt("mute");
                int optInt3 = jSONObject.optInt(n);
                int optInt4 = jSONObject.optInt(o);
                int optInt5 = jSONObject.optInt(q);
                int optInt6 = jSONObject.optInt(r);
                int optInt7 = jSONObject.optInt(s);
                this.i.getJSCommon().a(optInt == 1);
                this.i.getJSCommon().b(optInt2);
                this.i.getJSCommon().c(optInt3);
                this.i.getJSCommon().d(optInt4);
                this.i.getJSCommon().e(optInt5);
                this.i.getJSCommon().f(optInt6);
                com.anythink.expressad.video.signal.c jSCommon = this.i.getJSCommon();
                if (optInt7 != 0) {
                    i = optInt7;
                }
                jSCommon.i(i);
            } else if (obj != null) {
                com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                if (aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    com.anythink.expressad.video.signal.a.j jVar = (com.anythink.expressad.video.signal.a.j) aVar.a.getObject();
                    String i3 = jVar.i();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt8 = jSONObject2.optInt(l);
                        int optInt9 = jSONObject2.optInt("mute");
                        int optInt10 = jSONObject2.optInt(n);
                        int optInt11 = jSONObject2.optInt(o);
                        int optInt12 = jSONObject2.optInt(q);
                        int optInt13 = jSONObject2.optInt(r);
                        int optInt14 = jSONObject2.optInt(s);
                        jVar.a(optInt8 == 1);
                        jVar.b(optInt9);
                        jVar.c(optInt10);
                        jVar.d(optInt11);
                        jVar.e(optInt12);
                        jVar.f(optInt13);
                        if (optInt14 != 0) {
                            i = optInt14;
                        }
                        jVar.i(i);
                        n.b(h, "init jsCommon.setIsShowingTransparent = ".concat(String.valueOf(optInt8)));
                    }
                    j.a().a(obj, Base64.encodeToString(i3.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            n.b(h, "init error", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.i = (IJSFactory) obj;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "insertViewAbove error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "insertViewBelow error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void isSystemResume(Object obj, String str) {
        try {
            if (this.i != null) {
                n.b(h, "isSystemResume,params:".concat(String.valueOf(str)));
                j.a().a(obj, b(this.i.getActivityProxy().h()));
            }
        } catch (Throwable th) {
            n.b(h, "isSystemResume", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        n.d(h, "ivRewardAdsWithoutVideo ： params".concat(String.valueOf(str)));
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable th) {
            n.b(h, "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadads(Object obj, String str) {
        String str2;
        int i;
        int i2;
        n.b(h, "loadads");
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = "";
                i = 1;
                i2 = 1;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                str2 = jSONObject.optString("unitId");
                i2 = jSONObject.optInt("type", 1);
                if (i2 > 2) {
                    i2 = 1;
                }
                i = jSONObject.optInt("adtype", 1);
            }
            if (TextUtils.isEmpty(str2)) {
                j.a().a(obj, b(1));
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(str2, i2, i);
                }
            }
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "loadads error", th);
            j.a().a(obj, b(1));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadingResourceStatus(Object obj, String str) {
        a(obj, str);
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().loadingResourceStatus(windVaneWebView, optInt);
            } catch (Throwable th) {
                n.d(h, "loadingResourceStatus error ".concat(String.valueOf(th)));
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            n.b(h, "notifyCloseBtn,result:".concat(String.valueOf(optInt)));
            this.i.getJSVideoModule().notifyCloseBtn(optInt);
        } catch (Throwable th) {
            n.b(h, "notifyCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "appendSubView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.a().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "appendViewTo error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.a().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "insertViewAbove error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.a().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "insertViewBelow error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void openURL(Object obj, String str) {
        n.d(h, "openURL:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
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
            n.d(h, e.getMessage());
        } catch (Throwable th) {
            n.d(h, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("type");
            n.b(h, "playVideoFinishOperate,type: ".concat(String.valueOf(optInt)));
            this.i.getJSCommon().g(optInt);
        } catch (Throwable th) {
            n.b(h, "playVideoFinishOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerGetMuteState(Object obj, String str) {
        a(obj, str);
        try {
            c.a().H(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerGetMuteState error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerMute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerMute error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPause(Object obj, String str) {
        a(obj, str);
        try {
            c.a().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerPause error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPlay(Object obj, String str) {
        a(obj, str);
        try {
            c.a().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerPlay error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerResume(Object obj, String str) {
        a(obj, str);
        try {
            c.a().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerResume error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetRenderType(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.J(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerSetRenderType error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetSource(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.I(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerSetSource error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerStop(Object obj, String str) {
        a(obj, str);
        try {
            c.a().D(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerStop error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUnmute(Object obj, String str) {
        a(obj, str);
        try {
            c.a().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerUnmute error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUpdateFrame(Object obj, String str) {
        a(obj, str);
        try {
            c.a();
            c.E(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "playerUpdateFrame error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void preloadSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            if (this.i != null) {
                c.a().K(obj, new JSONObject(str));
                return;
            }
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
            if (windVaneWebView instanceof WindVaneWebView) {
                if (windVaneWebView.getWebViewListener() != null) {
                    ((com.anythink.expressad.atsignalcommon.a.a) windVaneWebView.getWebViewListener()).a(obj, str);
                    n.a(h, "preloadSubPlayTemplateView: RVWebViewListener");
                    return;
                }
                n.a(h, "preloadSubPlayTemplateView: failed");
            }
        } catch (Throwable th) {
            n.d(h, "preloadSubPlayTemplateView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "progressOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("progress");
            int optInt2 = jSONObject.optInt("view_visible");
            n.b(h, "progressOperate,progress:" + optInt + ",viewVisible:" + optInt2);
            this.i.getJSVideoModule().progressOperate(optInt, optInt2);
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "progressOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reactDeveloper(Object obj, String str) {
        n.a(h, "reactDeveloper");
        try {
            if (this.i != null && !TextUtils.isEmpty(str)) {
                this.i.getJSBTModule().reactDeveloper(obj, str);
            } else {
                j.a().b(obj, b(1));
            }
        } catch (Throwable th) {
            n.d(h, "reactDeveloper error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.anythink.expressad.atsignalcommon.windvane.a aVar = (com.anythink.expressad.atsignalcommon.windvane.a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.a.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    ((com.anythink.expressad.video.signal.a.j) aVar.a.getObject()).j(optInt);
                }
                WindVaneWebView windVaneWebView = aVar.a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, optInt);
            } catch (Throwable th) {
                n.b(h, "readyStatus", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void removeCacheItem(Object obj, String str) {
        String str2;
        boolean z;
        JSONObject jSONObject;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = m.a().e().getSharedPreferences(a.p, 0);
        } catch (Throwable th) {
            n.d(h, "removeCacheItem error ".concat(String.valueOf(th)));
            str2 = "Delete Error, reason is : " + th.getMessage();
        }
        if (!TextUtils.isEmpty(str)) {
            String string = new JSONObject(str).getString("key");
            if (!TextUtils.isEmpty(string)) {
                sharedPreferences.edit().remove(string).apply();
            }
            str2 = "Delete Success";
            z = true;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("code", z ? 0 : 1);
                jSONObject.put(qm3.b.j, str2);
                if (obj == null && z) {
                    j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } else {
                    j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Throwable unused) {
                n.d(h, "removeCacheItem error ");
                return;
            }
        }
        str2 = "";
        z = false;
        jSONObject = new JSONObject();
        jSONObject.put("code", z ? 0 : 1);
        jSONObject.put(qm3.b.j, str2);
        if (obj == null) {
        }
        j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void removeFromSuperView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "removeFromSuperView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reportUrls(Object obj, String str) {
        n.a(h, "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                c.a();
                c.b(obj, str);
                return;
            }
            j.a().b(obj, b(1));
        } catch (Throwable th) {
            n.d(h, "reportUrls error ".concat(String.valueOf(th)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCacheItem(Object obj, String str) {
        String str2;
        boolean z;
        JSONObject jSONObject;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = m.a().e().getSharedPreferences(a.p, 0);
        } catch (Throwable th) {
            n.d(h, "setCacheItem error ".concat(String.valueOf(th)));
            str2 = "Save Error, reason is : " + th.getMessage();
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("key");
            String string2 = jSONObject2.getString("value");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                sharedPreferences.edit().putString(string, string2).apply();
            }
            str2 = "Save Success";
            z = true;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("code", z ? 0 : 1);
                jSONObject.put(qm3.b.j, str2);
                if (obj == null && z) {
                    j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } else {
                    j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Throwable unused) {
                n.d(h, "setCacheItem error ");
                return;
            }
        }
        str2 = "";
        z = false;
        jSONObject = new JSONObject();
        jSONObject.put("code", z ? 0 : 1);
        jSONObject.put(qm3.b.j, str2);
        if (obj == null) {
        }
        j.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("fitxy");
            n.b(h, "setScaleFitXY,type:".concat(String.valueOf(optInt)));
            this.i.getJSVideoModule().setScaleFitXY(optInt);
        } catch (Throwable th) {
            n.b(h, "showVideoClickView error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setSubPlayTemplateInfo(Object obj, String str) {
        n.d(h, "setSubPlayTemplateInfo : ".concat(String.valueOf(str)));
        a(obj, str);
        try {
            c.a().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setSubPlayTemplateInfo error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewAlpha(Object obj, String str) {
        a(obj, str);
        try {
            c.a().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setViewAlpha error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewBgColor(Object obj, String str) {
        a(obj, str);
        try {
            c.a().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setViewBgColor error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewRect(Object obj, String str) {
        a(obj, str);
        try {
            c.a().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setViewRect error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewScale(Object obj, String str) {
        a(obj, str);
        try {
            c.a().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setViewScale error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showAlertView(Object obj, String str) {
        n.b(h, "showAlertView");
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.getJSVideoModule().showIVRewardAlertView(str);
            j.a().a(obj, "showAlertView", "");
        } catch (Throwable th) {
            n.b(h, "showAlertView", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("type");
            n.b(h, "showVideoClickView,type:".concat(String.valueOf(optInt)));
            this.i.getJSContainerModule().showVideoClickView(optInt);
        } catch (Throwable th) {
            n.b(h, "showVideoClickView error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("margin_top", 0);
            int optInt2 = jSONObject.optInt("margin_left", 0);
            int optInt3 = jSONObject.optInt("view_width", 0);
            int optInt4 = jSONObject.optInt("view_height", 0);
            int optInt5 = jSONObject.optInt("radius", 0);
            int optInt6 = jSONObject.optInt("border_top", 0);
            int optInt7 = jSONObject.optInt("border_left", 0);
            int optInt8 = jSONObject.optInt("border_width", 0);
            int optInt9 = jSONObject.optInt("border_height", 0);
            n.b(h, "showVideoLocation,margin_top:" + optInt + ",marginLeft:" + optInt2 + ",viewWidth:" + optInt3 + ",viewHeight:" + optInt4 + ",radius:" + optInt5 + ",borderTop: " + optInt6 + ",borderLeft: " + optInt7 + ",borderWidth: " + optInt8 + ",borderHeight: " + optInt9);
            this.i.getJSVideoModule().showVideoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optInt7, optInt8, optInt9);
            this.i.getJSCommon().l();
        } catch (Throwable th) {
            n.b(h, "showVideoLocation error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showView(Object obj, String str) {
        a(obj, str);
        try {
            c.a().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "showView error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void soundOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("mute");
            int optInt2 = jSONObject.optInt("view_visible");
            String optString = jSONObject.optString("pt", "");
            n.b(h, "soundOperate,mute:" + optInt + ",viewVisible:" + optInt2 + ",pt:" + optString);
            if (TextUtils.isEmpty(optString)) {
                this.i.getJSVideoModule().soundOperate(optInt, optInt2);
            } else {
                this.i.getJSVideoModule().soundOperate(optInt, optInt2, optString);
            }
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "soundOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void statistics(Object obj, String str) {
        n.b(h, "statistics,params:".concat(String.valueOf(str)));
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.i.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable th) {
            n.b(h, "statistics error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            n.b(h, "toggleCloseBtn,result:".concat(String.valueOf(optInt)));
            int i = 2;
            if (optInt != 1) {
                i = optInt == 2 ? 1 : 0;
            }
            this.i.getJSVideoModule().closeVideoOperate(0, i);
        } catch (Throwable th) {
            n.b(h, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void triggerCloseBtn(Object obj, String str) {
        n.b(h, "triggerCloseBtn");
        try {
            if (this.i == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString(CallMraidJS.b).equals(com.anythink.expressad.foundation.d.c.bY)) {
                return;
            }
            this.i.getJSVideoModule().closeVideoOperate(1, -1);
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "triggerCloseBtn error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void videoOperate(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt("pause_or_resume");
            n.b(h, "videoOperate,pauseOrResume:".concat(String.valueOf(optInt)));
            this.i.getJSVideoModule().videoOperate(optInt);
            j.a().a(obj, b(0));
        } catch (Throwable th) {
            n.b(h, "videoOperate error", th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewFireEvent(Object obj, String str) {
        a(obj, str);
        try {
            c.a().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "setSubPlayTemplateInfo error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoBack(Object obj, String str) {
        a(obj, str);
        try {
            c.a().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "webviewGoBack error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoForward(Object obj, String str) {
        a(obj, str);
        try {
            c.a().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "webviewGoForward error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewLoad(Object obj, String str) {
        a(obj, str);
        try {
            c.a().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "webviewLoad error ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewReload(Object obj, String str) {
        a(obj, str);
        try {
            c.a().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.d(h, "webviewReload error ".concat(String.valueOf(th)));
        }
    }
}