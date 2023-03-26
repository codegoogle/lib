package com.p7700g.p99005;

import com.p7700g.p99005.fb0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class za0 extends fb0.j {
    @x1
    private final List<fb0.j> a;

    public za0(int i) {
        this.a = new ArrayList(i);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // com.p7700g.p99005.fb0.j
    public void a(int i) {
        try {
            for (fb0.j jVar : this.a) {
                jVar.a(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // com.p7700g.p99005.fb0.j
    public void b(int i, float f, @c2 int i2) {
        try {
            for (fb0.j jVar : this.a) {
                jVar.b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    @Override // com.p7700g.p99005.fb0.j
    public void c(int i) {
        try {
            for (fb0.j jVar : this.a) {
                jVar.c(i);
            }
        } catch (ConcurrentModificationException e) {
            f(e);
        }
    }

    public void d(fb0.j jVar) {
        this.a.add(jVar);
    }

    public void e(fb0.j jVar) {
        this.a.remove(jVar);
    }
}