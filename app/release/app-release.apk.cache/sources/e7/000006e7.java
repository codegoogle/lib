package com.anythink.core.common;

import android.content.Context;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r {
    public static final int a = 35;
    public static final String b = "isDefaultOffer";
    private static r h;
    public Method c;
    public Method d;
    public Method e;
    public Method f;
    public Method g;

    private r() {
        try {
            Class<?> cls = Class.forName("com.anythink.network.myoffer.MyOfferAPI");
            this.c = cls.getDeclaredMethod("preloadTopOnOffer", Context.class, com.anythink.core.common.e.r.class);
            this.d = cls.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.e = cls.getDeclaredMethod("getCacheOfferIds", Context.class, String.class, com.anythink.core.common.e.s.class);
            this.f = cls.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.g = cls.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            if (h == null) {
                h = new r();
            }
            rVar = h;
        }
        return rVar;
    }

    public final String b(Context context, String str) {
        try {
            Method method = this.f;
            return method != null ? method.invoke(null, context, str).toString() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean c(Context context, String str) {
        try {
            Method method = this.g;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void a(Context context, String str) {
        try {
            if (this.c != null) {
                com.anythink.core.common.e.r rVar = new com.anythink.core.common.e.r();
                rVar.a = str;
                this.c.invoke(null, context, rVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final JSONArray a(Context context) {
        try {
            Method method = this.d;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONArray();
    }

    private JSONObject a(Context context, String str, com.anythink.core.common.e.s sVar) {
        try {
            Method method = this.e;
            if (method != null) {
                return new JSONObject(method.invoke(null, context, str, sVar).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}