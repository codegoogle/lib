package com.anythink.expressad.out;

/* loaded from: classes2.dex */
public class g {
    private static com.anythink.expressad.e.a a;

    private g() {
    }

    public static com.anythink.expressad.e.a a() {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new com.anythink.expressad.e.a();
                }
            }
        }
        return a;
    }
}