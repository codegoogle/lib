package com.anythink.expressad.out;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class k implements com.anythink.expressad.e.b {
    public static final int a = 6;
    public static final int b = 7;
    public static final int c = 8;
    private static String d = "CustomInfoManager";
    private static k e;
    private ConcurrentHashMap<String, String> f = new ConcurrentHashMap<>();

    private k() {
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (e == null) {
                synchronized (k.class) {
                    if (e == null) {
                        e = new k();
                    }
                }
            }
            kVar = e;
        }
        return kVar;
    }

    private void a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String a2 = com.anythink.expressad.foundation.h.i.a(str2);
        if (i == 6) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.f;
            concurrentHashMap.put(str + "_bid", a2);
        } else if (i != 7) {
            if (i != 8) {
                return;
            }
            this.f.put(str, a2);
        } else {
            ConcurrentHashMap<String, String> concurrentHashMap2 = this.f;
            concurrentHashMap2.put(str + "_bidload", a2);
        }
    }

    private String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.f;
            return concurrentHashMap.get(str + "_bid");
        } else if (i != 7) {
            return i != 8 ? "" : this.f.get(str);
        } else {
            ConcurrentHashMap<String, String> concurrentHashMap2 = this.f;
            return concurrentHashMap2.get(str + "_bidload");
        }
    }

    public final String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str2);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(com.anythink.expressad.foundation.g.a.j)) {
                    return a(str, 8);
                }
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(d, "Exception", th);
        }
        return "";
    }
}