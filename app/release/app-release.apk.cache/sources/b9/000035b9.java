package com.ironsource.sdk.controller;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.c.d;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements com.ironsource.sdk.b.a {
    public y a;
    private d b = d.a();
    private c c;

    /* renamed from: com.ironsource.sdk.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0123a {
        public String a;
        public JSONObject b;
        public String c;
        public String d;

        private C0123a() {
        }

        public /* synthetic */ C0123a(byte b) {
            this();
        }
    }

    public a(c cVar) {
        this.c = cVar;
    }

    public final void a(String str, x.d.a aVar) {
        JSONObject jSONObject = new JSONObject(str);
        C0123a c0123a = new C0123a((byte) 0);
        c0123a.a = jSONObject.optString("functionName");
        c0123a.b = jSONObject.optJSONObject("functionParams");
        c0123a.c = jSONObject.optString("success");
        c0123a.d = jSONObject.optString("fail");
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        try {
            String str2 = c0123a.a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals("removeAdView")) {
                        c = 2;
                        break;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1491535759:
                    if (str2.equals("webviewAction")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                final d dVar = this.b;
                final JSONObject jSONObject2 = c0123a.b;
                final Activity a = this.c.a();
                final String str3 = c0123a.c;
                final String str4 = c0123a.d;
                final String string = jSONObject2.getString("adViewId");
                if (string.isEmpty()) {
                    Logger.i(d.a, "loadWithUrl fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                com.ironsource.sdk.a c2 = dVar.c(jSONObject2);
                if (dVar.b.containsKey(string)) {
                    Logger.i(d.a, "sendMessageToAd fail - collection already contain adViewId");
                    throw new Exception("collection already contain adViewId");
                }
                final com.ironsource.sdk.c.c cVar = new com.ironsource.sdk.c.c(this, a, string, c2);
                cVar.b = IronSourceStorageUtils.getNetworkStorageDir(a.getApplicationContext());
                com.ironsource.environment.e.a aVar2 = com.ironsource.environment.e.a.a;
                aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (cVar.u != null) {
                            com.ironsource.sdk.a.d.a(f.n, new com.ironsource.sdk.a.a().a("callfailreason", "loadWithUrl | webView is not null").a);
                        }
                        try {
                            c.e(cVar, str4);
                            cVar.u.loadUrl(c.g(cVar, jSONObject2.getString("urlForWebView")));
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("adViewId", cVar.t);
                            cVar.d.a(str3, jSONObject3);
                        } catch (Exception e) {
                            cVar.b(str4, e.getMessage());
                            com.ironsource.sdk.a.d.a(f.n, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
                        }
                    }
                });
                if (d.b(jSONObject2)) {
                    aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.d.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.b.put(string, new a(cVar, a.getApplicationContext()));
                        }
                    });
                } else {
                    dVar.b.put(string, cVar);
                }
            } else if (c == 1) {
                d dVar2 = this.b;
                JSONObject jSONObject3 = c0123a.b;
                String str5 = c0123a.c;
                String str6 = c0123a.d;
                String string2 = new JSONObject(jSONObject3.getString("params")).getString("adViewId");
                if (string2.isEmpty()) {
                    Logger.i(d.a, "sendMessageToAd fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar2.b.containsKey(string2)) {
                    Logger.i(d.a, "sendMessageToAd fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    e eVar = dVar2.b.get(string2);
                    if (eVar != null) {
                        eVar.b(jSONObject3, str5, str6);
                    }
                }
            } else if (c == 2) {
                d dVar3 = this.b;
                JSONObject jSONObject4 = c0123a.b;
                String str7 = c0123a.c;
                String str8 = c0123a.d;
                String string3 = jSONObject4.getString("adViewId");
                if (string3.isEmpty()) {
                    Logger.i(d.a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar3.b.containsKey(string3)) {
                    Logger.i(d.a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    e eVar2 = dVar3.b.get(string3);
                    dVar3.b.remove(string3);
                    if (eVar2 != null) {
                        eVar2.a(str7, str8);
                    }
                }
            } else if (c == 3) {
                d dVar4 = this.b;
                JSONObject jSONObject5 = c0123a.b;
                String str9 = c0123a.c;
                String str10 = c0123a.d;
                String string4 = jSONObject5.getString("adViewId");
                if (string4.isEmpty()) {
                    Logger.i(d.a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar4.b.containsKey(string4)) {
                    Logger.i(d.a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    e eVar3 = dVar4.b.get(string4);
                    if (eVar3 != null) {
                        eVar3.a(jSONObject5, str9, str10);
                    }
                }
            } else if (c != 4) {
                throw new IllegalArgumentException(String.format("%s | unsupported AdViews API", c0123a.a));
            } else {
                d dVar5 = this.b;
                JSONObject jSONObject6 = c0123a.b;
                String str11 = c0123a.c;
                String str12 = c0123a.d;
                String string5 = jSONObject6.getString("adViewId");
                if (string5.isEmpty()) {
                    Logger.i(d.a, "performWebViewAction fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar5.b.containsKey(string5)) {
                    Logger.i(d.a, "performWebViewAction fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    e eVar4 = dVar5.b.get(string5);
                    String string6 = jSONObject6.getString("actionName");
                    if (eVar4 != null) {
                        eVar4.a(string6, str11, str12);
                    }
                }
            }
        } catch (Exception e) {
            fVar.a("errMsg", e.getMessage());
            String a2 = d.a(c0123a.b);
            if (!TextUtils.isEmpty(a2)) {
                fVar.a("adViewId", a2);
            }
            aVar.a(false, c0123a.d, fVar);
        }
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, String str2, String str3) {
        a(str, a.AnonymousClass1.b(str2, str3));
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }
}