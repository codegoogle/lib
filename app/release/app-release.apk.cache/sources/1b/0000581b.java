package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes.dex */
public class qi0 {
    private boolean a = false;
    private final Set<b> b = new r7();
    private final Map<String, ap0> c = new HashMap();
    private final Comparator<fp<String, Float>> d = new a();

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<fp<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(fp<String, Float> fpVar, fp<String, Float> fpVar2) {
            float floatValue = fpVar.b.floatValue();
            float floatValue2 = fpVar2.b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(float f);
    }

    public void a(b bVar) {
        this.b.add(bVar);
    }

    public void b() {
        this.c.clear();
    }

    public List<fp<String, Float>> c() {
        if (!this.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        for (Map.Entry<String, ap0> entry : this.c.entrySet()) {
            arrayList.add(new fp(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.d);
        return arrayList;
    }

    public void d() {
        if (this.a) {
            List<fp<String, Float>> c = c();
            for (int i = 0; i < c.size(); i++) {
                fp<String, Float> fpVar = c.get(i);
                String.format("\t\t%30s:%.2f", fpVar.a, fpVar.b);
            }
        }
    }

    public void e(String str, float f) {
        if (this.a) {
            ap0 ap0Var = this.c.get(str);
            if (ap0Var == null) {
                ap0Var = new ap0();
                this.c.put(str, ap0Var);
            }
            ap0Var.a(f);
            if (str.equals("__container")) {
                for (b bVar : this.b) {
                    bVar.a(f);
                }
            }
        }
    }

    public void f(b bVar) {
        this.b.remove(bVar);
    }

    public void g(boolean z) {
        this.a = z;
    }
}