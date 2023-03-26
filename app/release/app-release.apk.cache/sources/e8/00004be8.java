package com.p7700g.p99005;

import com.p7700g.p99005.h54;
import com.p7700g.p99005.l54;
import com.p7700g.p99005.o34;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: IPAddressPartStringSubCollection.java */
/* loaded from: classes3.dex */
public abstract class k54<T extends o34, P extends l54<T>, S extends h54<T, P>> extends j54<T, P, S> {
    public final T s;
    public ArrayList<P> t = new ArrayList<>();

    /* compiled from: IPAddressPartStringSubCollection.java */
    /* loaded from: classes3.dex */
    public abstract class a implements Iterator<S> {
        public Iterator<P> s;

        public a() {
            this.s = k54.this.t.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.s.remove();
        }
    }

    public k54(T t) {
        this.s = t;
    }

    @Override // com.p7700g.p99005.j54
    public /* bridge */ /* synthetic */ String[] a() {
        return super.a();
    }

    public void b(P p) {
        this.t.add(p);
    }

    public int c() {
        return this.t.size();
    }

    public P[] d(P[] pArr) {
        return (P[]) ((l54[]) this.t.toArray(pArr));
    }

    @Override // com.p7700g.p99005.j54
    public int size() {
        return this.t.size();
    }
}