package com.anythink.expressad.foundation.g.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements e<String, JSONObject> {
    private int c;
    private final int b = 1000;
    private final LinkedHashMap<String, JSONObject> a = new LinkedHashMap<>(0, 0.75f, true);

    private static int c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        Objects.requireNonNull(str2, "key == null");
        synchronized (this) {
            if (this.a.remove(str2) != null) {
                this.c--;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private void b2(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            if (this.a.remove(str) != null) {
                this.c--;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            jSONObject = this.a.get(str);
        }
        return jSONObject;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                this.c++;
                if (this.a.put(str, jSONObject) != null) {
                    this.c--;
                }
            }
            a(this.b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                if (this.c >= 0 && (!this.a.isEmpty() || this.c == 0)) {
                    if (this.c <= i || this.a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, JSONObject> next = this.a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    next.getValue();
                    try {
                        this.a.remove(key);
                        this.c--;
                    } catch (Throwable unused) {
                    }
                } else {
                    break;
                }
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }
}