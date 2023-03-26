package com.anythink.expressad.advanced.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.c.c;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.d.q;
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
public class NativeAdvancedJsUtils {
    public static final String a = "onViewDisappeared";
    public static final String b = "onViewAppeared";
    public static final String c = "onSystemDestory";
    public static final String d = "setStyleList";
    public static final String e = "params";
    public static final String f = "showCloseButton";
    public static final String g = "hideCloseButton";
    public static final String h = "setVolume";
    public static final String i = "mute";
    public static final String j = "setVideoPlayMode";
    public static final String k = "autoPlay";
    public static final String l = "onNetstatChanged";
    public static final String m = "netstat";
    public static final String n = "sq";
    public static final String o = "thirdPartyCalled";
    public static final String p = "action";
    public static final String q = "params";
    private static String r = "NativeAdvancedJsUtils";

    public static void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.b);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            n.a(r, e2.getMessage());
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        n.d(r, "fireOnJSBridgeConnected");
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
        int i2;
        String str5;
        String str6 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str7 = qm3.b.j;
        int i3 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(qm3.b.j, "params is null");
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                n.a(r, e2.getMessage());
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
                    int i4 = 0;
                    while (i4 < length) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                        String optString = jSONObject3.optString("ref", str6);
                        int i5 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        if (i5 == i3 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            q a2 = d.a(c.a(m.a().e())).a(optString);
                            if (a2 != null) {
                                jSONArray = jSONArray2;
                                i2 = length;
                                n.a(r, "VideoBean not null");
                                jSONObject5.put("type", 1);
                                jSONObject5.put("videoDataLength", a2.c());
                                String e3 = a2.e();
                                str4 = str7;
                                if (TextUtils.isEmpty(e3)) {
                                    n.a(r, "VideoPath null");
                                    jSONObject5.put(la1.k, str6);
                                    jSONObject5.put("path4Web", str6);
                                    str3 = str6;
                                } else {
                                    str3 = str6;
                                    n.a(r, "VideoPath not null");
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
                                i2 = length;
                                n.a(r, "VideoBean null");
                            }
                        } else {
                            str3 = str6;
                            str4 = str7;
                            jSONArray = jSONArray2;
                            i2 = length;
                            if (i5 == 2 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put(la1.k, g.a().c(optString) == null ? str3 : g.a().c(optString));
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray3.put(jSONObject4);
                            } else if (i5 == 3 && !TextUtils.isEmpty(optString)) {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    n.a(r, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                    str5 = "file:////".concat(String.valueOf(optString));
                                } else {
                                    str5 = str3;
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put(la1.k, str5);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray3.put(jSONObject4);
                            } else if (i5 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put(la1.k, r.a(optString) == null ? str3 : r.a(optString));
                                jSONObject4.put(optString, jSONObject8);
                                jSONArray3.put(jSONObject4);
                            }
                        }
                        i4++;
                        jSONArray2 = jSONArray;
                        length = i2;
                        str7 = str4;
                        str6 = str3;
                        i3 = 1;
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
                            n.a(r, e5.getMessage());
                        }
                    }
                } catch (JSONException e6) {
                    e = e6;
                    n.a(r, e.getMessage());
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

    public static void sendEventToH5(WebView webView, String str, String str2) {
        j.a();
        j.a(webView, str, str2);
    }

    public static void sendThirdToH5(WebView webView, String str, String str2, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(n, 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            j.a();
            j.a(webView, o, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}