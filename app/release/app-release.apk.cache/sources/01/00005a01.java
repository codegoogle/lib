package com.p7700g.p99005;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HydraConnectionErrorPool.java */
/* loaded from: classes2.dex */
public class rg1 {
    private static final int a = 100;
    @x1
    private SparseIntArray b = new SparseIntArray();
    @x1
    private SparseArray<Set<String>> c = new SparseArray<>();

    private int c(int i) {
        return i == 186 ? 101 : 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ int f(Integer num, Integer num2) {
        return Integer.compare(c(num2.intValue()), c(num.intValue()));
    }

    @x1
    public Set<String> a(int i) {
        return this.c.get(i, Collections.emptySet());
    }

    public int b() {
        if (this.b.size() == 0) {
            return -100;
        }
        if (this.b.size() == 1) {
            return this.b.keyAt(0);
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            i = Math.max(i, this.b.valueAt(i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (this.b.valueAt(i3) == i) {
                arrayList.add(Integer.valueOf(this.b.keyAt(i3)));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.p7700g.p99005.ng1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rg1.this.f((Integer) obj, (Integer) obj2);
            }
        });
        return ((Integer) arrayList.get(0)).intValue();
    }

    public boolean d() {
        return this.b.size() == 0;
    }

    public void g(int i, @z1 String str) {
        this.b.put(i, this.b.get(i, 0) + 1);
        if (str != null) {
            Set<String> set = this.c.get(i);
            if (set == null) {
                set = new HashSet<>();
                this.c.put(i, set);
            }
            set.add(str);
        }
    }
}