package com.anythink.expressad.mbbanner.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.d.q;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.videocommon.b.g;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xg1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends CommonBannerJSBridgeImp {
    private static final String b = "BannerJSBridgeImpl";
    private WeakReference<Context> c;
    private List<com.anythink.expressad.foundation.d.c> d;
    private String e;
    private String f;
    private int g;
    private com.anythink.expressad.mbbanner.a.c.a h;
    private b i;
    private boolean j = false;

    public c(Context context, String str, String str2) {
        this.e = str;
        this.f = str2;
        this.c = new WeakReference<>(context);
    }

    public final void a(com.anythink.expressad.mbbanner.a.c.a aVar) {
        if (aVar != null) {
            this.h = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
        n.d(b, com.anythink.expressad.foundation.d.c.bY);
        try {
            List<com.anythink.expressad.foundation.d.c> list = this.d;
            if (list == null) {
                return;
            }
            com.anythink.expressad.foundation.d.c cVar = null;
            if (list != null && list.size() > 0) {
                cVar = this.d.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a = com.anythink.expressad.foundation.d.c.a(cVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a.put(next, jSONObject.getString(next));
                }
                com.anythink.expressad.foundation.d.c b2 = com.anythink.expressad.foundation.d.c.b(a);
                String optString = a.optString("unitId");
                if (!TextUtils.isEmpty(optString)) {
                    b2.j(optString);
                }
                cVar = b2;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a(cVar);
            }
        } catch (Throwable th) {
            n.b(b, com.anythink.expressad.foundation.d.c.bY, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void close() {
        n.d(b, com.anythink.expressad.foundation.d.c.cd);
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.b();
            }
        } catch (Throwable th) {
            n.b(b, com.anythink.expressad.foundation.d.c.cd, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z) {
        Context context;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().p())) {
                    str2 = getMraidCampaign().o();
                } else {
                    str2 = "file:////" + getMraidCampaign().p();
                }
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Context> weakReference = this.c;
            if (weakReference != null && (context = weakReference.get()) != null) {
                b bVar = this.i;
                if (bVar != null && bVar.isShowing()) {
                    return;
                }
                b bVar2 = new b(context, bundle, this.h);
                this.i = bVar2;
                bVar2.a(this.f, this.d);
                this.i.show();
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a(true);
            }
        } catch (Throwable th) {
            n.b(b, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            n.a(b, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
        List<com.anythink.expressad.foundation.d.c> list = this.d;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.d.get(0);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
        n.d(b, "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.foundation.h.b bVar = new com.anythink.expressad.foundation.h.b(m.a().e());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.g);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(AbstractLog.DEVICE, bVar.a());
            jSONObject.put("campaignList", com.anythink.expressad.foundation.d.c.b(this.d));
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.c c = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f);
            if (c == null) {
                c = com.anythink.expressad.d.c.c(this.f);
            }
            if (!TextUtils.isEmpty(this.e)) {
                c.e(this.e);
            }
            jSONObject.put("unitSetting", c.s());
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e());
            jSONObject.put("appSetting", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            n.b(b, e31.b, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void open(String str) {
        n.d(b, "open");
        try {
            n.d(b, str);
            if (this.d.size() > 1) {
                m.a().e().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th) {
            n.b(b, "open", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
                com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable th) {
                n.b(b, "readyStatus", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
        n.a(b, "sendImpressions:".concat(String.valueOf(str)));
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (com.anythink.expressad.foundation.d.c cVar : this.d) {
                    if (cVar.aZ().equals(string)) {
                        f.a(this.f, cVar, f.e);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable th) {
            n.b(b, "sendImpressions", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
        n.d(b, "toggleCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(CallMraidJS.b);
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable th) {
            n.b(b, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
        n.d(b, "triggerCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new JSONObject(str).optString(CallMraidJS.b);
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a();
            }
            j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable th) {
            n.b(b, "triggerCloseBtn", th);
            j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(-1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.h;
            if (aVar != null) {
                aVar.a(i);
            }
        } catch (Throwable th) {
            n.b(b, "useCustomClose", th);
        }
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.d = list;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a() {
        if (this.h != null) {
            this.h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5 = qm3.b.j;
        String str6 = "code";
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(qm3.b.j, "");
            JSONArray jSONArray = jSONObject.getJSONArray(xg1.v);
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    String optString = jSONObject3.optString("ref", "");
                    int i4 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i4 == i2 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        q a = d.a(com.anythink.expressad.foundation.c.c.a(m.a().e())).a(optString);
                        if (a != null) {
                            i = length;
                            n.a(b, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str2 = str5;
                            try {
                                jSONObject5.put("videoDataLength", a.c());
                                String e = a.e();
                                str3 = str6;
                                if (TextUtils.isEmpty(e)) {
                                    try {
                                        n.a(b, "VideoPath null");
                                        jSONObject5.put(la1.k, "");
                                        jSONObject5.put("path4Web", "");
                                    } catch (Throwable th) {
                                        th = th;
                                        str5 = str2;
                                        str = str3;
                                        jSONObject2.put(str, 1);
                                        jSONObject2.put(str5, th.getLocalizedMessage());
                                        j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    }
                                } else {
                                    n.a(b, "VideoPath not null");
                                    jSONObject5.put(la1.k, e);
                                    jSONObject5.put("path4Web", e);
                                }
                                if (a.d() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                } else {
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(optString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th2) {
                                th = th2;
                                str = str6;
                                str5 = str2;
                                jSONObject2.put(str, 1);
                                jSONObject2.put(str5, th.getLocalizedMessage());
                                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            i = length;
                            n.a(b, "VideoBean null");
                        }
                    } else {
                        str2 = str5;
                        str3 = str6;
                        i = length;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(la1.k, g.a().a(optString) == null ? "" : g.a().c(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                            File file = new File(optString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                n.a(b, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                str4 = "file:////".concat(String.valueOf(optString));
                            } else {
                                str4 = "";
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 3);
                            jSONObject7.put(la1.k, str4);
                            jSONObject4.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(la1.k, r.a(optString) == null ? "" : r.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    i3++;
                    jSONArray = jSONArray3;
                    length = i;
                    str5 = str2;
                    str6 = str3;
                    i2 = 1;
                }
                str2 = str5;
                str3 = str6;
                jSONObject2.put(xg1.v, jSONArray2);
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str2 = qm3.b.j;
            str = "code";
            try {
                jSONObject2.put(str, 1);
                str5 = str2;
            } catch (JSONException e2) {
                e = e2;
                str5 = str2;
            } catch (Throwable th3) {
                th = th3;
                str5 = str2;
                try {
                    jSONObject2.put(str, 1);
                    jSONObject2.put(str5, th.getLocalizedMessage());
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (JSONException e3) {
                    n.a(b, e3.getMessage());
                    return;
                }
            }
            try {
                try {
                    jSONObject2.put(str5, "resource is null");
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject2.put(str, 1);
                    jSONObject2.put(str5, th.getLocalizedMessage());
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            } catch (JSONException e4) {
                e = e4;
                n.a(b, e.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            str = str6;
        }
    }
}