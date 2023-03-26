package com.p7700g.p99005;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes3.dex */
public interface g43 {

    /* compiled from: Cache.java */
    /* loaded from: classes3.dex */
    public static class a {
        public byte[] a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();
        public List<l43> h;

        public boolean a() {
            return this.e < System.currentTimeMillis();
        }

        public boolean b() {
            return this.f < System.currentTimeMillis();
        }
    }

    void a(String key, a entry);

    void clear();

    a get(String key);

    void initialize();

    void invalidate(String key, boolean fullExpire);

    void remove(String key);
}