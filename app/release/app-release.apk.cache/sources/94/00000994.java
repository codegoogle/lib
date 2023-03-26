package com.anythink.expressad.video.bt.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.q;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.bt.module.ATTempContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.bt.module.AnythinkBTNativeEC;
import com.anythink.expressad.video.bt.module.AnythinkBTVideoView;
import com.anythink.expressad.video.bt.module.AnythinkBTWebView;
import com.anythink.expressad.video.bt.module.BTBaseView;
import com.anythink.expressad.videocommon.b.g;
import com.anythink.expressad.videocommon.e.d;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.p7700g.p99005.ck3;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xg1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static final int a = -999;
    private static final String b = "OperateViews";
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> c = new ConcurrentHashMap<>();
    private static LinkedHashMap<String, String> d = new LinkedHashMap<>();
    private static LinkedHashMap<String, com.anythink.expressad.foundation.d.c> e = new LinkedHashMap<>();
    private static LinkedHashMap<String, d> f = new LinkedHashMap<>();
    private static LinkedHashMap<String, String> g = new LinkedHashMap<>();
    private static LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
    private static LinkedHashMap<String, Activity> i = new LinkedHashMap<>();
    private static volatile int j = 10000;
    private static int k = 0;
    private static int l = 1;
    private static String m = "";
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;

    /* loaded from: classes2.dex */
    public static class a {
        private static c a = new c((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public static void E(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void I(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void J(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void P(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5 = qm3.b.j;
        String str6 = "code";
        JSONObject jSONObject2 = new JSONObject();
        int i3 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(qm3.b.j, "");
            JSONArray jSONArray = jSONObject.getJSONArray(xg1.v);
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i4 = 0;
                while (i4 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                    String optString = jSONObject3.optString("ref", "");
                    int i5 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i5 == i3 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        q a2 = com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(m.a().e())).a(optString);
                        if (a2 != null) {
                            i2 = length;
                            n.a(b, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str2 = str5;
                            try {
                                jSONObject5.put("videoDataLength", a2.c());
                                String e2 = a2.e();
                                str3 = str6;
                                if (TextUtils.isEmpty(e2)) {
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
                                    jSONObject5.put(la1.k, e2);
                                    jSONObject5.put("path4Web", e2);
                                }
                                if (a2.d() == 5) {
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
                            i2 = length;
                            n.a(b, "VideoBean null");
                        }
                    } else {
                        str2 = str5;
                        str3 = str6;
                        i2 = length;
                        if (i5 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(la1.k, g.a().c(optString) == null ? "" : g.a().c(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i5 == 3 && !TextUtils.isEmpty(optString)) {
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
                        } else if (i5 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(la1.k, r.a(optString) == null ? "" : r.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    i4++;
                    jSONArray = jSONArray3;
                    length = i2;
                    str5 = str2;
                    str6 = str3;
                    i3 = 1;
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
            } catch (JSONException e3) {
                e = e3;
                str5 = str2;
            } catch (Throwable th3) {
                th = th3;
                str5 = str2;
                try {
                    jSONObject2.put(str, 1);
                    jSONObject2.put(str5, th.getLocalizedMessage());
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                } catch (JSONException e4) {
                    n.a(b, e4.getMessage());
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
            } catch (JSONException e5) {
                e = e5;
                n.a(b, e.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            str = str6;
        }
    }

    public static c a() {
        return a.a;
    }

    public static String b() {
        int i2 = j + 1;
        j = i2;
        return String.valueOf(i2);
    }

    public static void d(String str) {
        i.remove(str);
    }

    public static int e(String str) {
        if (h.containsKey(str)) {
            return h.get(str).intValue();
        }
        return 2;
    }

    public static void f(String str) {
        if (g.containsKey(str)) {
            g.remove(str);
        }
        if (f.containsKey(str)) {
            f.remove(str);
        }
        if (e.containsKey(str)) {
            e.remove(str);
        }
        if (d.containsKey(str)) {
            d.remove(str);
        }
    }

    public static void g(String str) {
        if (h.containsKey(str)) {
            h.remove(str);
        }
    }

    private static String h(String str) {
        return d.containsKey(str) ? d.get(str) : "";
    }

    private static Activity i(String str) {
        if (i.containsKey(str)) {
            return i.get(str);
        }
        return null;
    }

    public final void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).play();
                    a(obj, optString2);
                    n.a(b, "playerPlay success");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerPlay failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exit");
            n.a(b, "playerPlay failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerPlay failed: "), b);
        }
    }

    public final void B(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).pause();
                    a(obj, optString2);
                    n.a(b, "playerPause success");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerPause failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exit");
            n.a(b, "playerPause failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerPause failed: "), b);
        }
    }

    public final void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).resume();
                    a(obj, optString2);
                    n.a(b, "playerResume success");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerResume failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exit");
            n.a(b, "playerResume failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerResume failed: "), b);
        }
    }

    public final void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).stop();
                    a(obj, optString2);
                    n.a(b, "playerStop success");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerStop failed instanceId is not player instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exit");
            n.a(b, "playerStop failed instanceId not exit instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerStop failed: "), b);
        }
    }

    public final void F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    if (((AnythinkBTVideoView) view).playMute()) {
                        a(obj, optString2);
                        n.a(b, "playerMute success");
                        return;
                    }
                    c(obj, "set mute failed");
                    n.a(b, "playerMute failed set mute failed");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerMute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "playerMute failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerMute failed: "), b);
        }
    }

    public final void G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    if (((AnythinkBTVideoView) view).playUnMute()) {
                        a(obj, optString2);
                        a(obj, "onUnmute", optString2);
                        n.a(b, "playerUnmute successed");
                        return;
                    }
                    a(obj, "set unmute failed");
                    n.a(b, "playerUnmute failed: set unmute failed");
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerUnmute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exit");
            n.a(b, "playerUnmute failed: instanceId not exit");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerUnmute failed: "), b);
        }
    }

    public final void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTVideoView) {
                    int mute = ((AnythinkBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", k);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put("mute", mute);
                    jSONObject2.put("data", jSONObject3);
                    j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    n.a(b, "playerGetMuteState successed mute = ".concat(String.valueOf(mute)));
                    return;
                }
                c(obj, "instanceId is not player");
                n.a(b, "playerGetMuteState failed instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("playerGetMuteState failed: "), b);
        }
    }

    public final void K(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).preload();
                    a(obj, optString2);
                    return;
                }
                c(obj, "view not exist");
                return;
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("preloadSubPlayTemplateView failed: "), b);
        }
    }

    public final void L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            AnythinkBTContainer anythinkBTContainer = null;
            if (b2.size() > 0) {
                for (View view : b2.values()) {
                    if (view instanceof AnythinkBTContainer) {
                        anythinkBTContainer = (AnythinkBTContainer) view;
                    } else if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    } else if (view instanceof AnythinkBTVideoView) {
                        String instanceId = ((AnythinkBTVideoView) view).getInstanceId();
                        com.anythink.expressad.video.bt.a.a.a();
                        com.anythink.expressad.video.bt.a.a.a(instanceId);
                        ((AnythinkBTVideoView) view).onDestory();
                    } else if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                }
                if (anythinkBTContainer != null) {
                    anythinkBTContainer.onAdClose();
                    c.remove(b2);
                    b2.clear();
                    ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = c;
                    concurrentHashMap.remove(optString + "_" + h2);
                    a(obj, optString2);
                    return;
                }
                c(obj, "not found AnythinkBTContainer");
                n.a(b, "closeAd successed");
                return;
            }
            c(obj, "unitId or instanceId not exist");
            n.a(b, "closeAd failed: unitId or instanceId not exist unitId = ".concat(String.valueOf(optString)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("closeAd failed: "), b);
        }
    }

    public final void M(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> b2 = b(optString, rid);
            if (b2 != null && b2.size() > 0) {
                for (View view : b2.values()) {
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).broadcast(optString2, optJSONObject);
                    }
                    if (view instanceof AnythinkBTLayout) {
                        ((AnythinkBTLayout) view).broadcast(optString2, optJSONObject);
                    }
                }
                a(obj, "");
                return;
            }
            c(obj, "unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("broadcast failed: "), b);
        }
    }

    public final void N(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
            String str = "";
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString(DataKeys.USER_ID);
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString("extra");
            com.anythink.expressad.videocommon.c.c cVar = null;
            if (optJSONObject2 != null) {
                cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str = optJSONObject2.optString("id");
            }
            LinkedHashMap<String, View> b2 = b(optString, rid);
            if (b2.size() > 0 && g.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof ATTempContainer) {
                    ATTempContainer aTTempContainer = (ATTempContainer) view;
                    aTTempContainer.setReward(cVar);
                    aTTempContainer.setUserId(optString3);
                    aTTempContainer.setRewardId(str);
                    aTTempContainer.setCampaignExpired(optBoolean);
                    if (!TextUtils.isEmpty(optString4)) {
                        aTTempContainer.setDeveloperExtraData(optString4);
                    }
                    a(obj, optString2);
                    n.a(b, "setSubPlayTemplateInfo success instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "instanceId not exist");
                n.a(b, "setSubPlayTemplateInfo failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "unitId not exist");
            n.a(b, "setSubPlayTemplateInfo failed: unitId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("setSubPlayTemplateInfo failed: "), b);
        }
    }

    public final void O(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b2 = b(optString, rid);
            if (b2.size() > 0) {
                View view = b2.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof WindVaneWebView) {
                            j.a();
                            j.a((WebView) ((WindVaneWebView) childAt), optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            a(obj, optString2);
                            n.a(b, "webviewFireEvent instanceId = ".concat(String.valueOf(optString2)));
                            return;
                        }
                    }
                }
                c(obj, "instanceId not exist");
                n.a(b, "webviewFireEvent failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "unitId not exist");
            n.a(b, "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("webviewFireEvent failed: "), b);
        }
    }

    public final void Q(Object obj, JSONObject jSONObject) {
        n.a(b, "createNativeEC:".concat(String.valueOf(jSONObject)));
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                com.anythink.expressad.foundation.d.c b2 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject(rs2.f.f));
                if (b2 != null && !TextUtils.isEmpty(optString)) {
                    b2.j(optString);
                    str = b2.aa();
                }
                d a2 = d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a2 != null) {
                    a2.a(optString);
                }
                AnythinkBTNativeEC anythinkBTNativeEC = new AnythinkBTNativeEC(m.a().e());
                anythinkBTNativeEC.setCampaign(b2);
                com.anythink.expressad.video.signal.a.j jVar = new com.anythink.expressad.video.signal.a.j((Activity) null, b2);
                jVar.a(optString);
                anythinkBTNativeEC.setJSCommon(jVar);
                anythinkBTNativeEC.setUnitId(optString);
                anythinkBTNativeEC.setRewardUnitSetting(a2);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b3 = b(optString, str);
                String b4 = b();
                d.put(b4, str);
                anythinkBTNativeEC.setInstanceId(b4);
                b3.put(b4, anythinkBTNativeEC);
                anythinkBTNativeEC.preLoadData();
                if (b2 == null) {
                    c(obj, "campaign is null");
                    n.a(b, "createNativeEC failed");
                    return;
                }
                a(obj, b4);
                n.a(b, "createNativeEC instanceId = ".concat(String.valueOf(b4)));
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("createNativeEC failed："), b);
        }
    }

    public final void j(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b2 = b(optString, h2);
                if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b2.get(optString3);
                    View view = b2.get(optString2);
                    com.anythink.core.common.j.r.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof ATTempContainer) {
                            Iterator<View> it = b2.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof AnythinkBTContainer) {
                                    com.anythink.core.common.j.r.a(view);
                                    ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            Rect rect = null;
                            int i2 = 0;
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    i2 = ((BTBaseView) view).getViewWidth();
                                    optInt = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                                i2 = optJSONObject2.optInt("width");
                                optInt = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams a2 = a(layoutParams, rect, i2, optInt);
                            com.anythink.core.common.j.r.a(view);
                            viewGroup.addView(view, a2);
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        n.a(b, "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                n.a(b, "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("appendViewTo failed: "), b);
        }
    }

    public final void k(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString3) && b2.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b2.get(optString2);
                View view = b2.get(optString3);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i2 = 0;
                    if (view instanceof ATTempContainer) {
                        n.d(b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(n), Integer.valueOf(o), Integer.valueOf(p), Integer.valueOf(q), Integer.valueOf(r)));
                        ((ATTempContainer) view).setNotchPadding(n, o, p, q, r);
                        Iterator<View> it = b2.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                com.anythink.core.common.j.r.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                i2 = ((BTBaseView) view).getViewWidth();
                                optInt = ((BTBaseView) view).getViewHeight();
                            } else {
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            i2 = optJSONObject2.optInt("width");
                            optInt = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, i2, optInt));
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    n.a(b, "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            n.a(b, "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("appendSubView failed: "), b);
        }
    }

    public final void l(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b2 = b(optString, h2);
                if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b2.get(optString3);
                    View view = b2.get(optString2);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof ATTempContainer) {
                            Iterator<View> it = b2.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof AnythinkBTContainer) {
                                    com.anythink.core.common.j.r.a(view);
                                    ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            Rect rect = null;
                            int i2 = 0;
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    i2 = ((BTBaseView) view).getViewWidth();
                                    optInt = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                                i2 = optJSONObject2.optInt("width");
                                optInt = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, a(layoutParams, rect, i2, optInt));
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        n.a(b, "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                n.a(b, "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("appendViewTo failed: "), b);
        }
    }

    public final void m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        a(obj, optString2);
                        a(obj, "onBringViewToFront", optString2);
                        n.a(b, "bringViewToFront instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "parent is null");
                    n.a(b, "bringViewToFront failed: parent is null");
                    return;
                }
                c(obj, "view is null");
                n.a(b, "bringViewToFront failed: view is null");
                return;
            }
            c(obj, "instanceId is not exist");
            n.a(b, "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("bringViewToFront failed: "), b);
        }
    }

    public final void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    a(obj, optString2);
                    a(obj, "onHideView", optString2);
                    n.a(b, "hideView instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "hideView failed: view not exist");
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("hideView failed: + "), b);
        }
    }

    public final void o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    a(obj, optString2);
                    a(obj, "onShowView", optString2);
                    n.a(b, "showView instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "showView failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "showView failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("showView failed: "), b);
        }
    }

    public final void p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("color");
            if (TextUtils.isEmpty(optString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    a(obj, "onViewBgColorChanged", optString2);
                    n.a(b, "setViewBgColor instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "setViewBgColor failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "setViewBgColor failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("setViewBgColor failed: "), b);
        }
    }

    public final void q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewAlphaChanged", optString2);
                    n.a(b, "setViewAlpha instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "setViewAlpha failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "setViewAlpha failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("setViewAlpha failed: "), b);
        }
    }

    public final void r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewScaleChanged", optString2);
                    n.a(b, "setViewScale instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "setViewScale failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "setViewScale failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("setViewScale failed: "), b);
        }
    }

    public final void s(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                View view = b2.get(optString2);
                View view2 = b2.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    int i2 = 0;
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            i2 = ((BTBaseView) view).getViewWidth();
                            optInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        i2 = optJSONObject2.optInt("width");
                        optInt = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a2 = a(layoutParams, rect, i2, optInt);
                    com.anythink.core.common.j.r.a(view);
                    viewGroup.addView(view, indexOfChild + 1, a2);
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    n.a(b, "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "insertViewAbove failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "insertViewAbove failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("insertViewAbove failed: "), b);
        }
    }

    public final void t(Object obj, JSONObject jSONObject) {
        int optInt;
        int i2;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                View view = b2.get(optString2);
                View view2 = b2.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            i2 = ((BTBaseView) view).getViewWidth();
                            optInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            i2 = 0;
                            optInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        int optInt2 = optJSONObject2.optInt("width");
                        optInt = optJSONObject2.optInt("height");
                        i2 = optInt2;
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a2 = a(layoutParams, rect, i2, optInt);
                    com.anythink.core.common.j.r.a(view);
                    int i3 = indexOfChild - 1;
                    viewGroup.addView(view, i3 >= 0 ? i3 : 0, a2);
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    n.a(b, "insertViewBelow instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "insertViewBelow failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "insertViewBelow failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("insertViewBelow failed: "), b);
        }
    }

    public final void u(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                View view = b2.get(optString2);
                View view2 = b2.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    int i2 = 0;
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            i2 = ((BTBaseView) view).getViewWidth();
                            optInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        i2 = optJSONObject2.optInt("width");
                        optInt = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a(layoutParams, rect, i2, optInt));
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    n.a(b, "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "insertViewAbove failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "insertViewAbove failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("insertViewAbove failed: "), b);
        }
    }

    public final void v(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2) && b2.containsKey(optString3)) {
                View view = b2.get(optString2);
                View view2 = b2.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    Rect rect = null;
                    int i2 = 0;
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            i2 = ((BTBaseView) view).getViewWidth();
                            optInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        i2 = optJSONObject2.optInt("width");
                        optInt = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild, a(layoutParams, rect, i2, optInt));
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    n.a(b, "insertViewBelow instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "insertViewBelow failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "insertViewBelow failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("insertViewBelow failed: "), b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.graphics.Rect] */
    public final void w(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        int i2;
        int i3;
        LinkedHashMap<String, View> b2;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("content");
            if (optJSONObject2 == null) {
                c(obj, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString("filePath");
            String optString5 = optJSONObject2.optString(ck3.a);
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                c(obj, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    com.anythink.expressad.foundation.d.c b3 = com.anythink.expressad.foundation.d.c.b(optJSONArray.getJSONObject(i4));
                    if (b3 != null) {
                        b3.j(optString);
                        arrayList.add(b3);
                    }
                }
            }
            String optString6 = optJSONObject2.optString("unitId");
            d a2 = d.a(optJSONObject2.optJSONObject("unitSetting"));
            if (a2 != null) {
                a2.a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (optJSONObject3 != null) {
                int optInt = optJSONObject3.optInt("left", -999);
                int optInt2 = optJSONObject3.optInt("top", -999);
                int optInt3 = optJSONObject3.optInt("right", -999);
                str2 = b;
                try {
                    Rect rect2 = new Rect(optInt, optInt2, optInt3, optJSONObject3.optInt("bottom", -999));
                    int optInt4 = optJSONObject3.optInt("width");
                    i2 = optJSONObject3.optInt("height");
                    i3 = optInt4;
                    str = rect2;
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    c(obj, th.getMessage());
                    wo1.i0(th, new StringBuilder("webviewLoad failed: "), str);
                }
            } else {
                str2 = b;
                i2 = 0;
                i3 = 0;
                str = rect;
            }
            int optInt5 = optJSONObject2.optInt("refreshCache", 0);
            try {
                b2 = b(optString, h2);
            } catch (Throwable th2) {
                th = th2;
                str = str2;
                c(obj, th.getMessage());
                wo1.i0(th, new StringBuilder("webviewLoad failed: "), str);
            }
            try {
                if (b2.containsKey(optString2)) {
                    View view = b2.get(optString2);
                    if (view instanceof AnythinkBTWebView) {
                        AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) view;
                        anythinkBTWebView.setHtml(optString5);
                        anythinkBTWebView.setFilePath(optString4);
                        anythinkBTWebView.setFileURL(optString3);
                        anythinkBTWebView.setRect(str);
                        anythinkBTWebView.setLayout(i3, i2);
                        anythinkBTWebView.setCampaigns(arrayList);
                        anythinkBTWebView.setRewardUnitSetting(a2);
                        anythinkBTWebView.webviewLoad(optInt5);
                        a(obj, optString2);
                        n.a(str2, "webviewLoad instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "view not exist");
                    n.a(str2, "webviewLoad failed: view not exist instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "instanceId not exist");
                n.a(str2, "webviewLoad failed: instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
            } catch (Throwable th3) {
                th = th3;
                c(obj, th.getMessage());
                wo1.i0(th, new StringBuilder("webviewLoad failed: "), str);
            }
        } catch (Throwable th4) {
            th = th4;
            str = b;
        }
    }

    public final void x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewReload()) {
                        a(obj, optString2);
                        n.a(b, "webviewReload instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "reload failed");
                    n.a(b, "webviewReload failed reload failed instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "webviewReload failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "webviewReload failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("webviewReload failed: "), b);
        }
    }

    public final void y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewGoBack()) {
                        a(obj, optString2);
                        n.a(b, "webviewGoBack instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "webviewGoBack failed");
                    n.a(b, "webviewGoBack failed instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "webviewGoBack failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "webviewGoBack failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("webviewGoBack failed: "), b);
        }
    }

    public final void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view instanceof AnythinkBTWebView) {
                    if (((AnythinkBTWebView) view).webviewGoForward()) {
                        a(obj, optString2);
                        n.a(b, "webviewGoForward instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "webviewGoForward failed");
                    n.a(b, "webviewGoForward failed instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view not exist");
                n.a(b, "webviewGoForward failed view not exist instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "webviewGoForward failed instanceId not exist instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("webviewGoForward failed: "), b);
        }
    }

    private c() {
    }

    public static com.anythink.expressad.foundation.d.c a(String str) {
        if (e.containsKey(str)) {
            return e.get(str);
        }
        return null;
    }

    public static String c(String str) {
        return g.containsKey(str) ? g.get(str) : "";
    }

    public final void d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt("mute");
                String str = "";
                com.anythink.expressad.foundation.d.c b2 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject(rs2.f.f));
                if (b2 != null && !TextUtils.isEmpty(optString)) {
                    b2.j(optString);
                    str = b2.aa();
                }
                d a2 = d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a2 != null) {
                    a2.a(optString);
                }
                String optString2 = optJSONObject.optString(DataKeys.USER_ID);
                if (TextUtils.isEmpty(str) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                    str = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b3 = b(optString, str);
                String b4 = b();
                d.put(b4, str);
                ATTempContainer aTTempContainer = new ATTempContainer(m.a().e());
                aTTempContainer.setInstanceId(b4);
                aTTempContainer.setUnitId(optString);
                aTTempContainer.setCampaign(b2);
                aTTempContainer.setRewardUnitSetting(a2);
                aTTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    aTTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(optString3)) {
                        aTTempContainer.setRewardId(optString3);
                    }
                    if (!TextUtils.isEmpty(cVar.a())) {
                        aTTempContainer.setReward(cVar);
                    }
                }
                String optString4 = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString4)) {
                    aTTempContainer.setDeveloperExtraData(optString4);
                }
                aTTempContainer.setMute(optInt);
                b3.put(b4, aTTempContainer);
                g.put(b4, optString);
                e.put(b4, b2);
                f.put(b4, a2);
                a(obj, b4);
                n.a(b, "createSubPlayTemplateView instanceId = ".concat(String.valueOf(b4)));
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("createSubPlayTemplateView failed："), b);
        }
    }

    public static d b(String str) {
        if (f.containsKey(str)) {
            return f.get(str);
        }
        return null;
    }

    public final void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(optString)) {
                String h2 = h(optString2);
                if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                    h2 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b2 = b(optString, h2);
                if (b2 != null && b2.containsKey(optString2)) {
                    View view = b2.get(optString2);
                    b2.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    View childAt = viewGroup2.getChildAt(i2);
                                    if (childAt instanceof AnythinkBTWebView) {
                                        b2.remove(((AnythinkBTWebView) childAt).getInstanceId());
                                        ((AnythinkBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof AnythinkBTVideoView) {
                                        b2.remove(((AnythinkBTVideoView) childAt).getInstanceId());
                                        ((AnythinkBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof ATTempContainer) {
                                        b2.remove(((ATTempContainer) childAt).getInstanceId());
                                        ((ATTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    }
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onDestory();
                    }
                    a(obj, optString2);
                    a(obj, "onComponentDestroy", optString2);
                    n.a(b, "destroyComponent instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                n.a(b, "destroyComponent failed");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            n.a(b, "destroyComponent failed");
        }
    }

    public final void g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            Rect rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof AnythinkBTWebView) {
                            ((AnythinkBTWebView) view).setRect(rect);
                            ((AnythinkBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof AnythinkBTVideoView) {
                            ((AnythinkBTVideoView) view).setRect(rect);
                            ((AnythinkBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    a(obj, optString2);
                    a(obj, "onViewRectChanged", optString2);
                    n.a(b, "setViewRect instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view is null");
                n.a(b, "setViewRect failed: view is null");
                return;
            }
            c(obj, "instanceId not exist");
            n.a(b, "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("setViewRect failed: "), b);
        }
    }

    public final void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString2)) {
                View view = b2.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, optString2);
                        a(obj, "onRemoveFromView", optString2);
                        n.a(b, "removeFromSuperView instanceId = ".concat(String.valueOf(optString2)));
                        return;
                    }
                    c(obj, "parent is null");
                    n.a(b, "removeFromSuperView failed: parent is null instanceId = ".concat(String.valueOf(optString2)));
                    return;
                }
                c(obj, "view is null");
                n.a(b, "removeFromSuperView failed: view is null instanceId = ".concat(String.valueOf(optString2)));
                return;
            }
            c(obj, "params not enough");
            n.a(b, "removeFromSuperView failed: params not enough instanceId = ".concat(String.valueOf(optString2)));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("removeFromSuperView failed: "), b);
        }
    }

    public final void i(Object obj, JSONObject jSONObject) {
        int optInt;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h2 = h(optString2);
            if (TextUtils.isEmpty(h2) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a) != null) {
                h2 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b2 = b(optString, h2);
            if (b2.containsKey(optString3) && b2.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b2.get(optString2);
                View view = b2.get(optString3);
                com.anythink.core.common.j.r.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i2 = 0;
                    if (view instanceof ATTempContainer) {
                        n.d(b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(n), Integer.valueOf(o), Integer.valueOf(p), Integer.valueOf(q), Integer.valueOf(r)));
                        ((ATTempContainer) view).setNotchPadding(n, o, p, q, r);
                        Iterator<View> it = b2.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                com.anythink.core.common.j.r.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                i2 = ((BTBaseView) view).getViewWidth();
                                optInt = ((BTBaseView) view).getViewHeight();
                            } else {
                                optInt = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            i2 = optJSONObject2.optInt("width");
                            optInt = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams a2 = a(layoutParams, rect, i2, optInt);
                        com.anythink.core.common.j.r.a(view);
                        viewGroup.addView(view, a2);
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    n.a(b, "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            n.a(b, "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("appendSubView failed: "), b);
        }
    }

    public static void a(String str, String str2) {
        d.put(str, str2);
    }

    private static void c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", l);
            jSONObject.put(qm3.b.j, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            n.a(b, e2.getMessage());
        }
    }

    public static void a(String str, Activity activity) {
        i.put(str, activity);
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = c;
        if (concurrentHashMap.containsKey(str + "_" + str2)) {
            ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap2 = c;
            return concurrentHashMap2.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap3 = c;
        concurrentHashMap3.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public static void a(String str, int i2) {
        h.put(str, Integer.valueOf(i2));
    }

    public static void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", l);
            jSONObject.put(qm3.b.j, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            n.a(b, e2.getMessage());
        }
    }

    public static void f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                a(obj, optString);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void b(final Object obj, JSONObject jSONObject) {
        final Rect rect;
        final int i2;
        final int i3;
        try {
            final String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt("delay", 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString("filePath");
            final String optString4 = optJSONObject.optString(ck3.a);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i3 = optJSONObject2.optInt("height");
                rect = rect3;
                i2 = optInt2;
            } else {
                rect = rect2;
                i2 = 0;
                i3 = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b2 = c.this.b(optString, str);
                    String b3 = c.b();
                    c.d.put(b3, str);
                    AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(m.a().e());
                    b2.put(b3, anythinkBTWebView);
                    anythinkBTWebView.setInstanceId(b3);
                    anythinkBTWebView.setUnitId(optString);
                    anythinkBTWebView.setFileURL(optString2);
                    anythinkBTWebView.setFilePath(optString3);
                    anythinkBTWebView.setHtml(optString4);
                    anythinkBTWebView.setRect(rect);
                    anythinkBTWebView.setWebViewRid(str);
                    anythinkBTWebView.setCreateWebView(windVaneWebView);
                    int i4 = i2;
                    if (i4 > 0 || i3 > 0) {
                        anythinkBTWebView.setLayout(i4, i3);
                    }
                    anythinkBTWebView.preload();
                    c.a(obj, b3);
                    n.a(c.b, "createWebview instanceId = ".concat(String.valueOf(b3)));
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("createWebview failed："), b);
        }
    }

    public final void c(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                com.anythink.expressad.foundation.d.c b2 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject(rs2.f.f));
                if (b2 != null && !TextUtils.isEmpty(optString)) {
                    b2.j(optString);
                    str = b2.aa();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                AnythinkBTVideoView anythinkBTVideoView = new AnythinkBTVideoView(m.a().e());
                anythinkBTVideoView.setCampaign(b2);
                anythinkBTVideoView.setUnitId(optString);
                anythinkBTVideoView.setShowMute(optInt2);
                anythinkBTVideoView.setShowTime(optInt);
                anythinkBTVideoView.setShowClose(optInt3);
                anythinkBTVideoView.setOrientation(optInt4);
                anythinkBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b3 = b(optString, str);
                String b4 = b();
                d.put(b4, str);
                anythinkBTVideoView.setInstanceId(b4);
                b3.put(b4, anythinkBTVideoView);
                anythinkBTVideoView.preLoadData();
                if (b2 == null) {
                    c(obj, "campaign is null");
                    n.a(b, "createPlayerView failed");
                } else {
                    a(obj, b4);
                    n.a(b, "createPlayerView instanceId = ".concat(String.valueOf(b4)));
                }
                com.anythink.expressad.video.bt.a.a.a();
                com.anythink.expressad.video.bt.a.a.a(b4, anythinkBTVideoView);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("createPlayerView failed："), b);
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            n.a(b, e2.getMessage());
        }
    }

    private static void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c(obj, e2.getMessage());
            n.a(b, e2.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        n.a(b, "reportUrls:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                int optInt2 = jSONObject.optInt("report");
                boolean z = true;
                if (optInt2 == 0) {
                    Context e2 = m.a().e();
                    if (optInt == 0) {
                        z = false;
                    }
                    com.anythink.expressad.a.a.a(e2, (com.anythink.expressad.foundation.d.c) null, "", optString, z);
                } else {
                    com.anythink.expressad.a.a.a(m.a().e(), null, "", optString, false, optInt != 0, optInt2);
                }
            }
            a(obj, "");
        } catch (Throwable th) {
            n.b(b, "reportUrls", th);
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            j.a();
            j.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(webView, e2.getMessage());
            n.a(b, e2.getMessage());
        }
    }

    public final void a(final Object obj, JSONObject jSONObject) {
        final Rect rect;
        final int i2;
        final int i3;
        try {
            final String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt("delay", 0);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i3 = optJSONObject2.optInt("height");
                rect = rect3;
                i2 = optInt2;
            } else {
                rect = rect2;
                i2 = 0;
                i3 = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.a) obj).a;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b2 = c.this.b(optString, str);
                    String b3 = c.b();
                    c.d.put(b3, str);
                    AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(m.a().e());
                    b2.put(b3, anythinkBTLayout);
                    anythinkBTLayout.setInstanceId(b3);
                    anythinkBTLayout.setUnitId(optString);
                    anythinkBTLayout.setWebView(windVaneWebView);
                    anythinkBTLayout.setRect(rect);
                    int i4 = i2;
                    if (i4 > 0 || i3 > 0) {
                        anythinkBTLayout.setLayout(i4, i3);
                    }
                    c.a(obj, b3);
                    n.a(c.b, "create view instanceId = ".concat(String.valueOf(b3)));
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            wo1.i0(th, new StringBuilder("create view failed："), b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.widget.LinearLayout$LayoutParams] */
    private static ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i2, int i3) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context e2 = m.a().e();
        if (e2 == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i4 = rect.left;
            if (i4 != -999) {
                layoutParams2.leftMargin = s.b(e2, i4);
            }
            int i5 = rect.top;
            if (i5 != -999) {
                layoutParams2.topMargin = s.b(e2, i5);
            }
            int i6 = rect.right;
            if (i6 != -999) {
                layoutParams2.rightMargin = s.b(e2, i6);
            }
            int i7 = rect.bottom;
            if (i7 != -999) {
                layoutParams2.bottomMargin = s.b(e2, i7);
            }
            if (i2 > 0) {
                layoutParams2.width = s.b(e2, i2);
            }
            if (i3 > 0) {
                layoutParams2.height = s.b(e2, i3);
            }
            return layoutParams2;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i8 = rect.left;
            if (i8 != -999) {
                layoutParams3.leftMargin = s.b(e2, i8);
            }
            int i9 = rect.top;
            if (i9 != -999) {
                layoutParams3.topMargin = s.b(e2, i9);
            }
            int i10 = rect.right;
            if (i10 != -999) {
                layoutParams3.rightMargin = s.b(e2, i10);
            }
            int i11 = rect.bottom;
            if (i11 != -999) {
                layoutParams3.bottomMargin = s.b(e2, i11);
            }
            if (i2 > 0) {
                layoutParams3.width = s.b(e2, i2);
            }
            if (i3 > 0) {
                layoutParams3.height = s.b(e2, i3);
            }
            return layoutParams3;
        } else {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i12 = rect.left;
                if (i12 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = s.b(e2, i12);
                }
                int i13 = rect.top;
                if (i13 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = s.b(e2, i13);
                }
                int i14 = rect.right;
                if (i14 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = s.b(e2, i14);
                }
                int i15 = rect.bottom;
                if (i15 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = s.b(e2, i15);
                }
                if (i2 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = s.b(e2, i2);
                }
                if (i3 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = s.b(e2, i3);
                }
            }
            return layoutParams;
        }
    }

    public static void a(Object obj) {
        try {
            a(obj, "");
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    private static void a(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (f.k == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, "reward");
    }

    public static void a(int i2, int i3, int i4, int i5, int i6) {
        n.a(b, "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        m = com.anythink.expressad.foundation.h.g.a(i2, i3, i4, i5, i6);
        n = i2;
        o = i3;
        p = i4;
        q = i5;
        r = i6;
    }

    private static void a(String str, String str2, String str3) {
        try {
            LinkedHashMap<String, View> b2 = a.a.b(str, str2);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).notifyEvent(str3);
                }
            }
        } catch (Throwable th) {
            n.a(b, th.getMessage());
        }
    }
}