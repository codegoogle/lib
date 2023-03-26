package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f {
    public c a;
    public long b;
    public ArrayList<g> c;
    public g d;
    public int e;
    public int f;
    public com.ironsource.mediationsdk.utils.c g;
    public boolean h;
    private int i;

    public f() {
        this.a = new c();
        this.c = new ArrayList<>();
    }

    public f(int i, long j, c cVar, int i2, com.ironsource.mediationsdk.utils.c cVar2, int i3, boolean z) {
        this.c = new ArrayList<>();
        this.i = i;
        this.b = j;
        this.a = cVar;
        this.e = i2;
        this.f = i3;
        this.g = cVar2;
        this.h = z;
    }

    public final g a() {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.d;
    }

    public final g a(String str) {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}