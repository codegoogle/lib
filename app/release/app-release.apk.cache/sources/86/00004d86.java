package com.p7700g.p99005;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes2.dex */
public class kx1 implements vx1 {
    private final Set<wx1> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // com.p7700g.p99005.vx1
    public void a(@x1 wx1 wx1Var) {
        this.a.add(wx1Var);
        if (this.c) {
            wx1Var.onDestroy();
        } else if (this.b) {
            wx1Var.onStart();
        } else {
            wx1Var.onStop();
        }
    }

    @Override // com.p7700g.p99005.vx1
    public void b(@x1 wx1 wx1Var) {
        this.a.remove(wx1Var);
    }

    public void c() {
        this.c = true;
        for (wx1 wx1Var : z02.k(this.a)) {
            wx1Var.onDestroy();
        }
    }

    public void d() {
        this.b = true;
        for (wx1 wx1Var : z02.k(this.a)) {
            wx1Var.onStart();
        }
    }

    public void e() {
        this.b = false;
        for (wx1 wx1Var : z02.k(this.a)) {
            wx1Var.onStop();
        }
    }
}