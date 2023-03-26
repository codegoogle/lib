package com.anythink.expressad.splash.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.anythink.expressad.atsignalcommon.base.d;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.d.b;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.splash.d.a;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.qm3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SplashJSBridgeImpl implements ISplashBridge {
    private WeakReference<Context> b;
    private List<c> c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int i;
    private a j;
    private SplashExpandDialog k;
    private String a = "SplashJSBridgeImpl";
    private int h = 5;

    public SplashJSBridgeImpl(Context context, String str, String str2) {
        this.e = str;
        this.d = str2;
        this.b = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void cai(Object obj, String str) {
        n.a(this.a, "cai:".concat(String.valueOf(str)));
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
                        n.a(this.a, e.getMessage());
                    }
                } catch (Throwable th) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                    n.b(this.a, "cai", th);
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
                n.b(this.a, "cai", e2);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        n.d(this.a, c.cd);
        try {
            a aVar = this.j;
            if (aVar != null) {
                aVar.c();
            }
        } catch (Throwable th) {
            n.b(this.a, c.cd, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.b.get(), bundle, this.j);
                this.k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.d, this.c);
                this.k.show();
                a aVar = this.j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable th) {
            n.b(this.a, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public c getMraidCampaign() {
        List<c> list = this.c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.c.get(0);
    }

    public a getSplashBridgeListener() {
        return this.j;
    }

    public List<c> getmCampaignList() {
        return this.c;
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void gial(Object obj, String str) {
        n.a(this.a, "gial:".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", new JSONArray());
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            n.a(this.a, e.getMessage());
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            n.a(this.a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.splash.a.a aVar = new com.anythink.expressad.splash.a.a(m.a().e());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(AbstractLog.DEVICE, aVar.a());
            jSONObject.put("campaignList", c.b(this.c));
            b.a();
            com.anythink.expressad.d.c c = b.c(com.anythink.expressad.foundation.b.a.b().e(), this.d);
            if (c == null) {
                c = com.anythink.expressad.d.c.c(this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                c.e(this.e);
            }
            c.a(this.d);
            c.b(this.h);
            c.a(this.g);
            jSONObject.put("unitSetting", c.s());
            b.a();
            String a = b.a(com.anythink.expressad.foundation.b.a.b().e());
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("appSetting", new JSONObject(a));
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, d.a);
            String str2 = this.a;
            n.d(str2, e31.b + jSONObject.toString());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.b(this.a, e31.b, th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void install(Object obj, String str) {
        n.d(this.a, "install");
        try {
            List<c> list = this.c;
            if (list == null) {
                return;
            }
            c cVar = null;
            if (list != null && list.size() > 0) {
                cVar = this.c.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a = c.a(cVar);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a.put(next, jSONObject.getString(next));
                }
                c b = c.b(a);
                String optString = a.optString("unitId");
                if (!TextUtils.isEmpty(optString)) {
                    b.j(optString);
                }
                cVar = b;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(cVar);
            }
        } catch (Throwable th) {
            n.b(this.a, c.bY, th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) {
                j.a();
                j.b(((com.anythink.expressad.atsignalcommon.windvane.a) obj).a);
            }
        } catch (Throwable th) {
            n.b(this.a, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        n.d(this.a, "openURL:".concat(String.valueOf(str)));
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
                if ((obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                    e = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                n.d(this.a, e2.getMessage());
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
            n.d(this.a, e3.getMessage());
        } catch (Throwable th) {
            n.d(this.a, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void pauseCountDown(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(qm3.b.j, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.expressad.d.a.b.dk, this.i);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            n.d(this.a, e.getMessage());
        }
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void readyStatus(Object obj, String str) {
    }

    public void release() {
        if (this.j != null) {
            this.j = null;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void reportUrls(Object obj, String str) {
        n.a(this.a, "reportUrls:".concat(String.valueOf(str)));
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
                    if (optInt2 == 0) {
                        com.anythink.expressad.a.a.a(m.a().e(), (c) null, "", optString, optInt != 0);
                    } else {
                        com.anythink.expressad.a.a.a(m.a().e(), null, "", optString, false, optInt != 0, optInt2);
                    }
                    com.anythink.expressad.a.a.a(m.a().e(), (c) null, "", optString, optInt != 0);
                }
                j.a().a(obj, SplashJsUtils.codeToJsonString(0));
            } catch (Throwable th) {
                n.b(this.a, "reportUrls", th);
            }
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = new JSONObject(str).getInt(com.anythink.expressad.d.a.b.dk);
            a aVar = this.j;
            if (aVar != null) {
                aVar.b(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.expressad.splash.js.ISplashBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resumeCountDown(Object obj, String str) {
        int optInt;
        a aVar;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                optInt = new JSONObject(str).optInt(com.anythink.expressad.d.a.b.dk);
            } catch (Exception e) {
                e = e;
            }
            try {
                j.a().a(obj, SplashJsUtils.codeToJsonString(0));
                i = optInt;
            } catch (Exception e2) {
                e = e2;
                i = optInt;
                n.d(this.a, e.getMessage());
                aVar = this.j;
                if (aVar == null) {
                }
            }
        }
        aVar = this.j;
        if (aVar == null) {
            aVar.a(2, i);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void sendImpressions(Object obj, String str) {
        n.a(this.a, "sendImpressions:".concat(String.valueOf(str)));
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (c cVar : this.c) {
                    if (cVar.aZ().equals(string)) {
                        f.a(this.d, cVar, f.f);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable th) {
            n.b(this.a, "sendImpressions", th);
        }
    }

    public void setAllowSkip(int i) {
        this.g = i;
    }

    public void setCampaignList(List<c> list) {
        this.c = list;
    }

    public void setCountdownS(int i) {
        this.h = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.f = i;
    }

    public void setSplashBridgeListener(a aVar) {
        if (aVar != null) {
            this.j = aVar;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable th) {
            n.b(this.a, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void triggerCloseBtn(Object obj, String str) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.b = new WeakReference<>(context);
    }

    public void updateCountDown(int i) {
        this.i = i;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(i);
            }
        } catch (Throwable th) {
            n.b(this.a, "useCustomClose", th);
        }
    }
}