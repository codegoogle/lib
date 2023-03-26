package com.anythink.expressad.splash.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.d.q;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.videocommon.b.g;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xg1;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SplashJsUtils {
    public static final String a = "onSystemPause";
    public static final String b = "onSystemResume";
    public static final String c = "onSystemDestory";
    private static String d = "SplashJsUtils";
    private static int e = 0;
    private static int f = 1;

    private static void b(String str, c cVar) {
        if (f.o == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, f.f);
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f);
            jSONObject.put(qm3.b.j, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            n.a(d, e2.getMessage());
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            n.a(d, e2.getMessage());
        }
    }

    public static String codeToJsonString(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            n.d(d, "code to string is error");
            return "";
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        n.d(d, "fireOnJSBridgeConnected");
        j.a();
        j.b(webView);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x020c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:83:0x020c */
    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        int i;
        String str5;
        String str6 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str7 = qm3.b.j;
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(qm3.b.j, "params is null");
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                n.a(d, e2.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(qm3.b.j, "");
            JSONArray jSONArray2 = jSONObject.getJSONArray(xg1.v);
            try {
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    int length = jSONArray2.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                        String optString = jSONObject3.optString("ref", str6);
                        int i4 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        if (i4 == i2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            q a2 = d.a(com.anythink.expressad.foundation.c.c.a(m.a().e())).a(optString);
                            if (a2 != null) {
                                jSONArray = jSONArray2;
                                i = length;
                                n.a(d, "VideoBean not null");
                                jSONObject5.put("type", 1);
                                jSONObject5.put("videoDataLength", a2.c());
                                String e3 = a2.e();
                                str4 = str7;
                                if (TextUtils.isEmpty(e3)) {
                                    n.a(d, "VideoPath null");
                                    jSONObject5.put(la1.k, str6);
                                    jSONObject5.put("path4Web", str6);
                                    str3 = str6;
                                } else {
                                    str3 = str6;
                                    n.a(d, "VideoPath not null");
                                    jSONObject5.put(la1.k, e3);
                                    jSONObject5.put("path4Web", e3);
                                }
                                if (a2.d() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                } else {
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(optString, jSONObject5);
                                jSONArray3.put(jSONObject4);
                            } else {
                                str3 = str6;
                                str4 = str7;
                                jSONArray = jSONArray2;
                                i = length;
                                n.a(d, "VideoBean null");
                            }
                        } else {
                            str3 = str6;
                            str4 = str7;
                            jSONArray = jSONArray2;
                            i = length;
                            if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put(la1.k, g.a().c(optString) == null ? str3 : g.a().c(optString));
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray3.put(jSONObject4);
                            } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    n.a(d, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                    str5 = "file:////".concat(String.valueOf(optString));
                                } else {
                                    str5 = str3;
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put(la1.k, str5);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray3.put(jSONObject4);
                            } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put(la1.k, r.a(optString) == null ? str3 : r.a(optString));
                                jSONObject4.put(optString, jSONObject8);
                                jSONArray3.put(jSONObject4);
                            }
                        }
                        i3++;
                        jSONArray2 = jSONArray;
                        length = i;
                        str7 = str4;
                        str6 = str3;
                        i2 = 1;
                    }
                    jSONObject2.put(xg1.v, jSONArray3);
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
                try {
                    jSONObject2.put("code", 1);
                    str = qm3.b.j;
                } catch (JSONException e4) {
                    e = e4;
                    str = qm3.b.j;
                }
                try {
                    try {
                        jSONObject2.put(str, "resource is null");
                        j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (Throwable th) {
                        th = th;
                        try {
                            jSONObject2.put("code", 1);
                            jSONObject2.put(str, th.getLocalizedMessage());
                            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        } catch (JSONException e5) {
                            n.a(d, e5.getMessage());
                        }
                    }
                } catch (JSONException e6) {
                    e = e6;
                    n.a(d, e.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                str = str2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = str7;
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            c b2 = c.b(optJSONObject);
            if (b2 == null) {
                callbackExcep(obj, "data camapign is empty");
                return;
            }
            updateFrequence(b2);
            callbackSuccess(obj, "");
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void sendEventToH5(WebView webView, String str, String str2) {
        j.a();
        j.a(webView, str, str2);
    }

    public static void updateFrequence(final c cVar) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.splash.js.SplashJsUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SplashJsUtils.a(c.this.I(), c.this);
                } catch (Throwable th) {
                    n.b(SplashJsUtils.d, th.getMessage(), th);
                }
            }
        }).start();
    }

    public static /* synthetic */ void a(String str, c cVar) {
        if (f.o == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, f.f);
    }
}