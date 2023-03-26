package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes2.dex */
public final class zt1 implements xt1 {
    private final Map<String, List<yt1>> c;
    private volatile Map<String, String> d;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final String a = "User-Agent";
        private static final String b;
        private static final Map<String, List<yt1>> c;
        private boolean d = true;
        private Map<String, List<yt1>> e = c;
        private boolean f = true;

        static {
            String g = g();
            b = g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g)));
            }
            c = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<yt1>> d() {
            HashMap hashMap = new HashMap(this.e.size());
            for (Map.Entry<String, List<yt1>> entry : this.e.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.d) {
                this.d = false;
                this.e = d();
            }
        }

        private List<yt1> f(String str) {
            List<yt1> list = this.e.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.e.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        @r2
        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(@x1 String str, @x1 yt1 yt1Var) {
            if (this.f && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, yt1Var);
            }
            e();
            f(str).add(yt1Var);
            return this;
        }

        public a b(@x1 String str, @x1 String str2) {
            return a(str, new b(str2));
        }

        public zt1 c() {
            this.d = true;
            return new zt1(this.e);
        }

        public a h(@x1 String str, @z1 yt1 yt1Var) {
            e();
            if (yt1Var == null) {
                this.e.remove(str);
            } else {
                List<yt1> f = f(str);
                f.clear();
                f.add(yt1Var);
            }
            if (this.f && "User-Agent".equalsIgnoreCase(str)) {
                this.f = false;
            }
            return this;
        }

        public a i(@x1 String str, @z1 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes2.dex */
    public static final class b implements yt1 {
        @x1
        private final String a;

        public b(@x1 String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yt1
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder G = wo1.G("StringHeaderFactory{value='");
            G.append(this.a);
            G.append('\'');
            G.append('}');
            return G.toString();
        }
    }

    public zt1(Map<String, List<yt1>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @x1
    private String b(@x1 List<yt1> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(e14.f0);
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<yt1>> entry : this.c.entrySet()) {
            String b2 = b(entry.getValue());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put(entry.getKey(), b2);
            }
        }
        return hashMap;
    }

    @Override // com.p7700g.p99005.xt1
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zt1) {
            return this.c.equals(((zt1) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("LazyHeaders{headers=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}