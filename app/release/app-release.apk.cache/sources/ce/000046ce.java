package com.p7700g.p99005;

import com.p7700g.p99005.jm3;

/* compiled from: OSInAppMessageLifecycleHandler.java */
/* loaded from: classes3.dex */
public abstract class hk3 {
    public void a(zj3 zj3Var) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        StringBuilder G = wo1.G("OSInAppMessageLifecycleHandler: IAM Did Dismiss: ");
        G.append(zj3Var.a());
        jm3.a(u0Var, G.toString());
    }

    public void b(zj3 zj3Var) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        StringBuilder G = wo1.G("OSInAppMessageLifecycleHandler: IAM Did Display: ");
        G.append(zj3Var.a());
        jm3.a(u0Var, G.toString());
    }

    public void c(zj3 zj3Var) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        StringBuilder G = wo1.G("OSInAppMessageLifecycleHandler: IAM Will Dismiss: ");
        G.append(zj3Var.a());
        jm3.a(u0Var, G.toString());
    }

    public void d(zj3 zj3Var) {
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        StringBuilder G = wo1.G("OSInAppMessageLifecycleHandler: IAM Will Display: ");
        G.append(zj3Var.a());
        jm3.a(u0Var, G.toString());
    }
}