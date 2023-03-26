package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a {
    private static final String a = "TemplateWebviewCache";
    private static ConcurrentHashMap<String, C0082a> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> c = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> d = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> e = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> f = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> g = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> i = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> j = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0082a> k = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.expressad.videocommon.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0082a {
        private WindVaneWebView a;
        private boolean b;

        public final WindVaneWebView a() {
            return this.a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public final boolean c() {
            return this.b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z) {
            this.b = z;
        }
    }

    public static C0082a a(String str) {
        if (h.containsKey(str)) {
            return h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (j.containsKey(str)) {
            return j.get(str);
        }
        if (k.containsKey(str)) {
            return k.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (h.containsKey(str)) {
            h.remove(str);
        }
        if (j.containsKey(str)) {
            j.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (k.containsKey(str)) {
            k.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    h.remove(str2);
                }
            }
        } else {
            h.clear();
        }
        i.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0082a> entry : h.entrySet()) {
            if (entry.getKey().contains(str)) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0082a> entry : i.entrySet()) {
            if (entry.getKey().contains(str)) {
                i.remove(entry.getKey());
            }
        }
    }

    private static void f(String str) {
        for (Map.Entry<String, C0082a> entry : j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                j.remove(entry.getKey());
            }
        }
    }

    private static void g(String str) {
        for (Map.Entry<String, C0082a> entry : k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                k.remove(entry.getKey());
            }
        }
    }

    private static void c() {
        h.clear();
    }

    public static void a(String str, C0082a c0082a, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                i.put(str, c0082a);
            } else {
                h.put(str, c0082a);
            }
        } else if (z2) {
            k.put(str, c0082a);
        } else {
            j.put(str, c0082a);
        }
    }

    public static void b() {
        j.clear();
        k.clear();
    }

    public static void b(int i2, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            String ab = cVar.ab();
            if (i2 == 94) {
                if (cVar.y()) {
                    ConcurrentHashMap<String, C0082a> concurrentHashMap = c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(ab);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0082a> concurrentHashMap2 = f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(ab);
                }
            } else if (i2 != 287) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap3 = b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(ab);
                }
            } else if (cVar.y()) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap4 = d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(ab);
                }
            } else {
                ConcurrentHashMap<String, C0082a> concurrentHashMap5 = g;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(ab);
                }
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        h.clear();
        i.clear();
    }

    private static void a(String str, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                for (Map.Entry<String, C0082a> entry : i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0082a> entry2 : h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    h.remove(entry2.getKey());
                }
            }
        } else if (z2) {
            for (Map.Entry<String, C0082a> entry3 : k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    k.remove(entry3.getKey());
                }
            }
        } else {
            for (Map.Entry<String, C0082a> entry4 : j.entrySet()) {
                if (entry4.getKey().startsWith(str)) {
                    j.remove(entry4.getKey());
                }
            }
        }
    }

    public static void b(int i2) {
        try {
            if (i2 == 94) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap = f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
            } else if (i2 != 287) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap2 = b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                }
            } else {
                ConcurrentHashMap<String, C0082a> concurrentHashMap3 = g;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.clear();
                }
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    public static C0082a a(int i2, c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            String ab = cVar.ab();
            if (i2 != 94) {
                if (i2 != 287) {
                    ConcurrentHashMap<String, C0082a> concurrentHashMap = b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return b.get(ab);
                    }
                } else if (cVar.y()) {
                    ConcurrentHashMap<String, C0082a> concurrentHashMap2 = d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return d.get(ab);
                    }
                } else {
                    ConcurrentHashMap<String, C0082a> concurrentHashMap3 = g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return g.get(ab);
                    }
                }
            } else if (cVar.y()) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap4 = c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return c.get(ab);
                }
            } else {
                ConcurrentHashMap<String, C0082a> concurrentHashMap5 = f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f.get(ab);
                }
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i2, String str, C0082a c0082a) {
        try {
            if (i2 == 94) {
                if (f == null) {
                    f = new ConcurrentHashMap<>();
                }
                f.put(str, c0082a);
            } else if (i2 != 287) {
                if (b == null) {
                    b = new ConcurrentHashMap<>();
                }
                b.put(str, c0082a);
            } else {
                if (g == null) {
                    g = new ConcurrentHashMap<>();
                }
                g.put(str, c0082a);
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    public static ConcurrentHashMap<String, C0082a> a(int i2, boolean z) {
        if (i2 == 94) {
            return z ? c : f;
        } else if (i2 != 287) {
            return b;
        } else {
            return z ? d : g;
        }
    }

    public static void a(int i2) {
        try {
            if (i2 == 94) {
                ConcurrentHashMap<String, C0082a> concurrentHashMap = c;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
            } else if (i2 != 287) {
            } else {
                ConcurrentHashMap<String, C0082a> concurrentHashMap2 = d;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                }
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i2, String str, C0082a c0082a) {
        try {
            if (i2 == 94) {
                if (c == null) {
                    c = new ConcurrentHashMap<>();
                }
                c.put(str, c0082a);
            } else if (i2 != 287) {
            } else {
                if (d == null) {
                    d = new ConcurrentHashMap<>();
                }
                d.put(str, c0082a);
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }
}