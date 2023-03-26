package com.p7700g.p99005;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes2.dex */
public class by1 {
    private static final String a = "RequestTracker";
    private final Set<vy1> b = Collections.newSetFromMap(new WeakHashMap());
    private final Set<vy1> c = new HashSet();
    private boolean d;

    @r2
    public void a(vy1 vy1Var) {
        this.b.add(vy1Var);
    }

    public boolean b(@z1 vy1 vy1Var) {
        boolean z = true;
        if (vy1Var == null) {
            return true;
        }
        boolean remove = this.b.remove(vy1Var);
        if (!this.c.remove(vy1Var) && !remove) {
            z = false;
        }
        if (z) {
            vy1Var.clear();
        }
        return z;
    }

    public void c() {
        for (vy1 vy1Var : z02.k(this.b)) {
            b(vy1Var);
        }
        this.c.clear();
    }

    public boolean d() {
        return this.d;
    }

    public void e() {
        this.d = true;
        for (vy1 vy1Var : z02.k(this.b)) {
            if (vy1Var.isRunning() || vy1Var.j()) {
                vy1Var.clear();
                this.c.add(vy1Var);
            }
        }
    }

    public void f() {
        this.d = true;
        for (vy1 vy1Var : z02.k(this.b)) {
            if (vy1Var.isRunning()) {
                vy1Var.pause();
                this.c.add(vy1Var);
            }
        }
    }

    public void g() {
        for (vy1 vy1Var : z02.k(this.b)) {
            if (!vy1Var.j() && !vy1Var.f()) {
                vy1Var.clear();
                if (!this.d) {
                    vy1Var.h();
                } else {
                    this.c.add(vy1Var);
                }
            }
        }
    }

    public void h() {
        this.d = false;
        for (vy1 vy1Var : z02.k(this.b)) {
            if (!vy1Var.j() && !vy1Var.isRunning()) {
                vy1Var.h();
            }
        }
        this.c.clear();
    }

    public void i(@x1 vy1 vy1Var) {
        this.b.add(vy1Var);
        if (!this.d) {
            vy1Var.h();
            return;
        }
        vy1Var.clear();
        Log.isLoggable(a, 2);
        this.c.add(vy1Var);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.b.size() + ", isPaused=" + this.d + "}";
    }
}