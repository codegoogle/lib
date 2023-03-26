package com.anythink.expressad.advanced.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.m;
import com.anythink.expressad.advanced.a.b;
import com.anythink.expressad.advanced.d.a;
import com.anythink.expressad.atsignalcommon.base.d;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.e31;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NativeAdvancedJSBridgeImpl extends CommonBannerJSBridgeImp {
    private WeakReference<Context> c;
    private List<c> d;
    private String e;
    private String f;
    private int g;
    private int h;
    private a j;
    private NativeAdvancedExpandDialog k;
    private String b = "NativeAdvancedJSBridgeImpl";
    private int i = 5;

    public NativeAdvancedJSBridgeImpl(Context context, String str, String str2) {
        this.f = str;
        this.e = str2;
        this.c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        c cVar = null;
        try {
            List<c> list = this.d;
            if (list != null && list.size() > 0) {
                cVar = this.d.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a = c.a(cVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            n.b(this.b, c.bY, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        n.d(this.b, c.cd);
        try {
            a aVar = this.j;
            if (aVar != null) {
                aVar.d();
            }
        } catch (Throwable th) {
            n.b(this.b, c.cd, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.c.get(), bundle, this.j);
                this.k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.e, this.d);
                this.k.show();
                a aVar = this.j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable th) {
            n.b(this.b, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            NativeAdvancedJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.a(this.b, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public c getMraidCampaign() {
        List<c> list = this.d;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.d.get(0);
    }

    public List<c> getmCampaignList() {
        return this.d;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            b bVar = new b(m.a().e());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(AbstractLog.DEVICE, bVar.a());
            jSONObject.put("campaignList", c.b(this.d));
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.c d = com.anythink.expressad.d.b.d(com.anythink.expressad.foundation.b.a.b().e(), this.e);
            if (d == null) {
                d = com.anythink.expressad.d.c.y();
            }
            if (!TextUtils.isEmpty(this.f)) {
                d.e(this.f);
            }
            d.a(this.e);
            d.b(this.i);
            d.a(this.h);
            jSONObject.put("unitSetting", d.s());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, d.a);
            String str2 = this.b;
            n.d(str2, e31.b + jSONObject.toString());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.b(this.b, e31.b, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        n.d(this.b, "install");
        c cVar = null;
        try {
            List<c> list = this.d;
            if (list != null && list.size() > 0) {
                cVar = this.d.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a = c.a(cVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            n.b(this.b, "install", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) {
                j.a();
                j.b(((com.anythink.expressad.atsignalcommon.windvane.a) obj).a);
            }
        } catch (Throwable th) {
            n.b(this.b, "onJSBridgeConnect", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof com.anythink.expressad.atsignalcommon.windvane.a) || (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, 2);
            }
        } catch (Throwable th) {
            n.a(this.b, th.getMessage());
        }
    }

    public void release() {
        if (this.j != null) {
            this.j = null;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
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

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        n.a(this.b, "sendImpressions:".concat(String.valueOf(str)));
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (c cVar : this.d) {
                    if (cVar.aZ().equals(string)) {
                        f.a(this.e, cVar, f.g);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable th) {
            n.b(this.b, "sendImpressions", th);
        }
    }

    public void setAllowSkip(int i) {
        this.h = i;
    }

    public void setCampaignList(List<c> list) {
        this.d = list;
    }

    public void setCountdownS(int i) {
        this.i = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.g = i;
    }

    public void setNativeAdvancedBridgeListener(a aVar) {
        if (aVar != null) {
            this.j = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
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
            n.b(this.b, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        if (this.j != null) {
            NativeAdvancedJsUtils.callbackSuccess(obj);
            this.j.a();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.c = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        try {
            if (this.h == -1) {
                int i = z ? 2 : 1;
                a aVar = this.j;
                if (aVar != null) {
                    aVar.a(i);
                }
            }
        } catch (Throwable th) {
            n.b(this.b, "useCustomClose", th);
        }
    }
}