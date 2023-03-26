package com.p7700g.p99005;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IdUtils.java */
/* loaded from: classes3.dex */
public class hr3 {
    private static final AtomicInteger a = new AtomicInteger(1);

    private static int a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int b() {
        return View.generateViewId();
    }
}