package com.p7700g.p99005;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* loaded from: classes.dex */
public abstract class w {
    private boolean a;
    private CopyOnWriteArrayList<u> b = new CopyOnWriteArrayList<>();

    public w(boolean z) {
        this.a = z;
    }

    public void a(@x1 u uVar) {
        this.b.add(uVar);
    }

    @u1
    public abstract void b();

    @u1
    public final boolean c() {
        return this.a;
    }

    @u1
    public final void d() {
        Iterator<u> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(@x1 u uVar) {
        this.b.remove(uVar);
    }

    @u1
    public final void f(boolean z) {
        this.a = z;
    }
}