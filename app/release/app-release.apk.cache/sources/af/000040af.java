package com.p7700g.p99005;

/* compiled from: OSInAppMessageControllerFactory.java */
/* loaded from: classes3.dex */
public class ek3 {
    private static final Object a = new Object();
    private dk3 b;

    public dk3 a(rm3 rm3Var, yl3 yl3Var, tk3 tk3Var, sl3 sl3Var, go3 go3Var) {
        if (this.b == null) {
            synchronized (a) {
                if (this.b == null) {
                    this.b = new dk3(rm3Var, yl3Var, tk3Var, sl3Var, go3Var);
                }
            }
        }
        return this.b;
    }
}