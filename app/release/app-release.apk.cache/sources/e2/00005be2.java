package com.p7700g.p99005;

/* compiled from: Techniques.java */
/* loaded from: classes3.dex */
public enum sg3 {
    Bounce(pg3.class),
    FadeIn(qg3.class),
    Shake(rg3.class);
    
    private Class w;

    sg3(Class clazz) {
        this.w = clazz;
    }

    public og3 f() {
        try {
            return (og3) this.w.newInstance();
        } catch (Exception unused) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}