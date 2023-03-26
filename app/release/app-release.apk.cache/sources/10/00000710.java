package com.anythink.expressad.a.a;

import com.anythink.expressad.foundation.g.a.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c implements e<String, b> {
    private final LinkedHashMap<String, b> a;
    private final int b;
    private int c;

    public c(int i) {
        if (i > 0) {
            this.b = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static int c() {
        return 1;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public final void a(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            if (this.a.remove(str) != null) {
                this.c--;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final b b(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            b bVar = this.a.get(str);
            if (bVar != null) {
                return bVar;
            }
            return null;
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                this.c++;
                if (this.a.put(str, bVar) != null) {
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
                    Map.Entry<String, b> next = this.a.entrySet().iterator().next();
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