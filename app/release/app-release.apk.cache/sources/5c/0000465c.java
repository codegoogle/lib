package com.p7700g.p99005;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: SharedValues.java */
/* loaded from: classes.dex */
public class hf {
    public static final int a = -1;
    private SparseIntArray b = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<a>>> c = new HashMap<>();

    /* compiled from: SharedValues.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int key, int newValue, int oldValue);
    }

    public void a(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.c.get(Integer.valueOf(key));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.c.put(Integer.valueOf(key), hashSet);
        }
        hashSet.add(new WeakReference<>(listener));
    }

    public void b() {
        this.c.clear();
    }

    public void c(int key, int value) {
        int i = this.b.get(key, -1);
        if (i == value) {
            return;
        }
        this.b.put(key, value);
        HashSet<WeakReference<a>> hashSet = this.c.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(key, value, i);
            } else {
                z = true;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<a>> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference<a> next = it2.next();
                if (next.get() == null) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int d(int key) {
        return this.b.get(key, -1);
    }

    public void e(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.c.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            a aVar = next.get();
            if (aVar == null || aVar == listener) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a listener) {
        for (Integer num : this.c.keySet()) {
            e(num.intValue(), listener);
        }
    }
}