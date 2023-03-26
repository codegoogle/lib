package com.anythink.expressad.foundation.g.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c implements e<String, Bitmap> {
    private final LinkedHashMap<String, Bitmap> a;
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

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        Objects.requireNonNull(str2, "key == null");
        synchronized (this) {
            Bitmap remove = this.a.remove(str2);
            if (remove != null) {
                this.c -= a(remove);
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
            Bitmap remove = this.a.remove(str);
            if (remove != null) {
                this.c -= a(remove);
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Bitmap b(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            Bitmap bitmap = this.a.get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                this.c += a(bitmap);
                Bitmap put = this.a.put(str, bitmap);
                if (put != null) {
                    this.c -= a(put);
                }
            }
            a(this.b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
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
                    Map.Entry<String, Bitmap> next = this.a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int a = a(next.getValue());
                        this.a.remove(key).recycle();
                        this.c -= a;
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

    private static int a(Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}