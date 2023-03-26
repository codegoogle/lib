package com.p7700g.p99005;

import com.p7700g.p99005.jm3;

/* compiled from: OSInAppMessagePrompt.java */
/* loaded from: classes3.dex */
public abstract class nk3 {
    private boolean a = false;

    public abstract String a();

    public abstract void b(jm3.c1 c1Var);

    public boolean c() {
        return this.a;
    }

    public void d(boolean z) {
        this.a = z;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSInAppMessagePrompt{key=");
        G.append(a());
        G.append(" prompted=");
        G.append(this.a);
        G.append('}');
        return G.toString();
    }
}