package com.p7700g.p99005;

import com.p7700g.p99005.m8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class yb {
    private static final boolean a = false;
    private static final int b = Integer.MIN_VALUE;
    private int d;
    private boolean e;
    public final zb f;
    public final b g;
    public yb h;
    public m8 k;
    private HashSet<yb> c = null;
    public int i = 0;
    public int j = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[9];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public yb(zb zbVar, b bVar) {
        this.f = zbVar;
        this.g = bVar;
    }

    private boolean s(zb zbVar, HashSet<zb> hashSet) {
        if (hashSet.contains(zbVar)) {
            return false;
        }
        hashSet.add(zbVar);
        if (zbVar == i()) {
            return true;
        }
        ArrayList<yb> s = zbVar.s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            yb ybVar = s.get(i);
            if (ybVar.u(this) && ybVar.p() && s(ybVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i) {
        this.d = i;
        this.e = true;
    }

    public void B(int i) {
        if (p()) {
            this.j = i;
        }
    }

    public void C(int i) {
        if (p()) {
            this.i = i;
        }
    }

    public boolean a(yb ybVar, int i) {
        return b(ybVar, i, Integer.MIN_VALUE, false);
    }

    public boolean b(yb ybVar, int i, int i2, boolean z) {
        if (ybVar == null) {
            x();
            return true;
        } else if (z || v(ybVar)) {
            this.h = ybVar;
            if (ybVar.c == null) {
                ybVar.c = new HashSet<>();
            }
            HashSet<yb> hashSet = this.h.c;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.i = i;
            this.j = i2;
            return true;
        } else {
            return false;
        }
    }

    public void c(yb ybVar, HashMap<zb, zb> hashMap) {
        HashSet<yb> hashSet;
        yb ybVar2 = this.h;
        if (ybVar2 != null && (hashSet = ybVar2.c) != null) {
            hashSet.remove(this);
        }
        yb ybVar3 = ybVar.h;
        if (ybVar3 != null) {
            this.h = hashMap.get(ybVar.h.f).r(ybVar3.l());
        } else {
            this.h = null;
        }
        yb ybVar4 = this.h;
        if (ybVar4 != null) {
            if (ybVar4.c == null) {
                ybVar4.c = new HashSet<>();
            }
            this.h.c.add(this);
        }
        this.i = ybVar.i;
        this.j = ybVar.j;
    }

    public void d(int i, ArrayList<yc> arrayList, yc ycVar) {
        HashSet<yb> hashSet = this.c;
        if (hashSet != null) {
            Iterator<yb> it = hashSet.iterator();
            while (it.hasNext()) {
                sc.a(it.next().f, i, arrayList, ycVar);
            }
        }
    }

    public HashSet<yb> e() {
        return this.c;
    }

    public int f() {
        if (this.e) {
            return this.d;
        }
        return 0;
    }

    public int g() {
        yb ybVar;
        if (this.f.l0() == 8) {
            return 0;
        }
        if (this.j != Integer.MIN_VALUE && (ybVar = this.h) != null && ybVar.f.l0() == 8) {
            return this.j;
        }
        return this.i;
    }

    public final yb h() {
        switch (this.g.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f.y0;
            case 2:
                return this.f.z0;
            case 3:
                return this.f.w0;
            case 4:
                return this.f.x0;
            default:
                throw new AssertionError(this.g.name());
        }
    }

    public zb i() {
        return this.f;
    }

    public m8 j() {
        return this.k;
    }

    public yb k() {
        return this.h;
    }

    public b l() {
        return this.g;
    }

    public boolean m() {
        HashSet<yb> hashSet = this.c;
        if (hashSet == null) {
            return false;
        }
        Iterator<yb> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<yb> hashSet = this.c;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.e;
    }

    public boolean p() {
        return this.h != null;
    }

    public boolean q(zb zbVar) {
        if (s(zbVar, new HashSet<>())) {
            return false;
        }
        zb U = i().U();
        return U == zbVar || zbVar.U() == U;
    }

    public boolean r(zb zbVar, yb ybVar) {
        return q(zbVar);
    }

    public boolean t() {
        switch (this.g.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw new AssertionError(this.g.name());
        }
    }

    public String toString() {
        return this.f.y() + ":" + this.g.toString();
    }

    public boolean u(yb ybVar) {
        b l = ybVar.l();
        b bVar = this.g;
        if (l == bVar) {
            return true;
        }
        switch (bVar.ordinal()) {
            case 0:
                return false;
            case 1:
            case 3:
            case 7:
                return l == b.LEFT || l == b.RIGHT || l == b.CENTER_X;
            case 2:
            case 4:
            case 5:
            case 8:
                return l == b.TOP || l == b.BOTTOM || l == b.CENTER_Y || l == b.BASELINE;
            case 6:
                return l != b.BASELINE;
            default:
                throw new AssertionError(this.g.name());
        }
    }

    public boolean v(yb ybVar) {
        boolean z = false;
        if (ybVar == null) {
            return false;
        }
        b l = ybVar.l();
        b bVar = this.g;
        if (l == bVar) {
            return bVar != b.BASELINE || (ybVar.i().q0() && i().q0());
        }
        switch (bVar.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = l == b.LEFT || l == b.RIGHT;
                if (ybVar.i() instanceof cc) {
                    return (z2 || l == b.CENTER_X) ? true : true;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = l == b.TOP || l == b.BOTTOM;
                if (ybVar.i() instanceof cc) {
                    return (z3 || l == b.CENTER_Y) ? true : true;
                }
                return z3;
            case 5:
                return (l == b.LEFT || l == b.RIGHT) ? false : true;
            case 6:
                return (l == b.BASELINE || l == b.CENTER_X || l == b.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.g.name());
        }
    }

    public boolean w() {
        switch (this.g.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 8:
                return true;
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(this.g.name());
        }
    }

    public void x() {
        HashSet<yb> hashSet;
        yb ybVar = this.h;
        if (ybVar != null && (hashSet = ybVar.c) != null) {
            hashSet.remove(this);
            if (this.h.c.size() == 0) {
                this.h.c = null;
            }
        }
        this.c = null;
        this.h = null;
        this.i = 0;
        this.j = Integer.MIN_VALUE;
        this.e = false;
        this.d = 0;
    }

    public void y() {
        this.e = false;
        this.d = 0;
    }

    public void z(g8 g8Var) {
        m8 m8Var = this.k;
        if (m8Var == null) {
            this.k = new m8(m8.b.UNRESTRICTED, (String) null);
        } else {
            m8Var.h();
        }
    }
}