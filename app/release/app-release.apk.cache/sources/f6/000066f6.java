package com.p7700g.p99005;

import com.p7700g.p99005.zb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class yc {
    private static final boolean a = false;
    public static int b;
    public int d;
    public int f;
    public ArrayList<zb> c = new ArrayList<>();
    public boolean e = false;
    public ArrayList<a> g = null;
    private int h = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public WeakReference<zb> a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a(zb zbVar, i8 i8Var, int i) {
            this.a = new WeakReference<>(zbVar);
            this.b = i8Var.O(zbVar.w0);
            this.c = i8Var.O(zbVar.x0);
            this.d = i8Var.O(zbVar.y0);
            this.e = i8Var.O(zbVar.z0);
            this.f = i8Var.O(zbVar.A0);
            this.g = i;
        }

        public void a() {
            zb zbVar = this.a.get();
            if (zbVar != null) {
                zbVar.p1(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    public yc(int i) {
        this.d = -1;
        this.f = 0;
        int i2 = b;
        b = i2 + 1;
        this.d = i2;
        this.f = i;
    }

    private boolean e(zb zbVar) {
        return this.c.contains(zbVar);
    }

    private String h() {
        int i = this.f;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    private int k(int i, zb zbVar) {
        zb.b z = zbVar.z(i);
        if (z == zb.b.WRAP_CONTENT || z == zb.b.MATCH_PARENT || z == zb.b.FIXED) {
            if (i == 0) {
                return zbVar.m0();
            }
            return zbVar.D();
        }
        return -1;
    }

    private int q(i8 i8Var, ArrayList<zb> arrayList, int i) {
        int O;
        int O2;
        ac acVar = (ac) arrayList.get(0).U();
        i8Var.Y();
        acVar.g(i8Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(i8Var, false);
        }
        if (i == 0 && acVar.R1 > 0) {
            wb.b(acVar, i8Var, arrayList, 0);
        }
        if (i == 1 && acVar.S1 > 0) {
            wb.b(acVar, i8Var, arrayList, 1);
        }
        try {
            i8Var.T();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.g = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.g.add(new a(arrayList.get(i3), i8Var, i));
        }
        if (i == 0) {
            O = i8Var.O(acVar.w0);
            O2 = i8Var.O(acVar.y0);
            i8Var.Y();
        } else {
            O = i8Var.O(acVar.x0);
            O2 = i8Var.O(acVar.z0);
            i8Var.Y();
        }
        return O2 - O;
    }

    public boolean a(zb zbVar) {
        if (this.c.contains(zbVar)) {
            return false;
        }
        this.c.add(zbVar);
        return true;
    }

    public void b() {
        if (this.g != null && this.e) {
            for (int i = 0; i < this.g.size(); i++) {
                this.g.get(i).a();
            }
        }
    }

    public void c(ArrayList<yc> arrayList) {
        int size = this.c.size();
        if (this.h != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                yc ycVar = arrayList.get(i);
                if (this.h == ycVar.d) {
                    m(this.f, ycVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.c.clear();
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.f;
    }

    public boolean i(yc ycVar) {
        for (int i = 0; i < this.c.size(); i++) {
            if (ycVar.e(this.c.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.e;
    }

    public int l(i8 i8Var, int i) {
        if (this.c.size() == 0) {
            return 0;
        }
        return q(i8Var, this.c, i);
    }

    public void m(int i, yc ycVar) {
        Iterator<zb> it = this.c.iterator();
        while (it.hasNext()) {
            zb next = it.next();
            ycVar.a(next);
            if (i == 0) {
                next.y1 = ycVar.f();
            } else {
                next.z1 = ycVar.f();
            }
        }
        this.h = ycVar.d;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public void o(int i) {
        this.f = i;
    }

    public int p() {
        return this.c.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h());
        sb.append(" [");
        String z = wo1.z(sb, this.d, "] <");
        Iterator<zb> it = this.c.iterator();
        while (it.hasNext()) {
            StringBuilder L = wo1.L(z, " ");
            L.append(it.next().y());
            z = L.toString();
        }
        return wo1.t(z, " >");
    }
}