package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: LottieCompositionCache.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class vk0 {
    private static final vk0 a = new vk0();
    private final w7<String, ei0> b = new w7<>(20);

    public static vk0 c() {
        return a;
    }

    public void a() {
        this.b.evictAll();
    }

    @z1
    public ei0 b(@z1 String str) {
        if (str == null) {
            return null;
        }
        return this.b.get(str);
    }

    public void d(@z1 String str, ei0 ei0Var) {
        if (str == null) {
            return;
        }
        this.b.put(str, ei0Var);
    }

    public void e(int i) {
        this.b.resize(i);
    }
}