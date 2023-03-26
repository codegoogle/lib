package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.foundation.h.s;
import com.p7700g.p99005.qm3;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AbsFeedBackForH5 extends l {
    public static final int c = 1;
    public static final int d = 2;
    private static int i = 0;
    private static int j = 1;
    public static final String m_ = "onFeedbackAlertStatusNotify";
    public static final String n_ = "status";
    private String h = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", j);
            jSONObject.put(qm3.b.j, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            com.anythink.expressad.foundation.h.n.a(this.h, e.getMessage());
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(qm3.b.j, "");
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            com.anythink.expressad.foundation.h.n.a(this.h, e.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", i);
            jSONObject2.put(qm3.b.j, "");
            jSONObject2.put("data", jSONObject);
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            com.anythink.expressad.foundation.h.n.a(this.h, e.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width", -1);
                int optInt2 = jSONObject.optInt("height", -1);
                int optInt3 = jSONObject.optInt("radius", 20);
                int optInt4 = jSONObject.optInt("left", -1);
                int optInt5 = jSONObject.optInt("top", -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                com.anythink.expressad.foundation.f.a.a a = com.anythink.expressad.foundation.f.b.a().a(jSONObject.optString("key", ""));
                Context e = com.anythink.core.common.b.m.a().e();
                a.a(s.b(e, optInt4), s.b(e, optInt5), s.b(e, optInt), s.b(e, optInt2), s.b(e, optInt3), (float) optDouble, optString, optString2);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                a aVar = (a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                com.anythink.expressad.foundation.f.b a = com.anythink.expressad.foundation.f.b.a();
                int i2 = optInt == 1 ? 8 : 0;
                WindVaneWebView windVaneWebView = aVar.a;
                com.anythink.expressad.foundation.f.a.a a2 = a.a(optString);
                if (a2.c() != null) {
                    a2.a(i2);
                    if (i2 == 0) {
                        a.a(optString, com.anythink.core.common.b.m.a().e(), windVaneWebView, null);
                    }
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                com.anythink.expressad.foundation.f.a.a a = com.anythink.expressad.foundation.f.b.a().a(jSONObject.optString("key", ""));
                if (optInt == 1) {
                    a.b();
                } else {
                    a.a();
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void getCacheKey(Object obj, String str) {
        try {
            com.anythink.expressad.atsignalcommon.c.a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void startShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("deviceMotionUpdateInterval", 1);
                com.anythink.expressad.atsignalcommon.c.a.a().a(obj, ((a) obj).a, jSONObject.optString("oldCache", ""), jSONObject.optString(com.anythink.expressad.foundation.g.a.a.a, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.anythink.expressad.atsignalcommon.c.a.a().a(obj, ((a) obj).a, new JSONObject(str).optString(com.anythink.expressad.foundation.g.a.a.a, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }
}