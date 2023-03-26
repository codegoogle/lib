package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.ip;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class lf<T> {
    private final ip.a<ArrayList<T>> a = new ip.b(10);
    private final y7<T, ArrayList<T>> b = new y7<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @x1
    private ArrayList<T> f() {
        ArrayList<T> b = this.a.b();
        return b == null ? new ArrayList<>() : b;
    }

    private void k(@x1 ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(@x1 T t, @x1 T t2) {
        if (this.b.containsKey(t) && this.b.containsKey(t2)) {
            ArrayList<T> arrayList = this.b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(@x1 T t) {
        if (this.b.containsKey(t)) {
            return;
        }
        this.b.put(t, null);
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> r = this.b.r(i);
            if (r != null) {
                k(r);
            }
        }
        this.b.clear();
    }

    public boolean d(@x1 T t) {
        return this.b.containsKey(t);
    }

    @z1
    public List g(@x1 T t) {
        return this.b.get(t);
    }

    @z1
    public List<T> h(@x1 T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> r = this.b.r(i);
            if (r != null && r.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.n(i));
            }
        }
        return arrayList;
    }

    @x1
    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.n(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(@x1 T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> r = this.b.r(i);
            if (r != null && r.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public int l() {
        return this.b.size();
    }
}