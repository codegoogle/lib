package com.p7700g.p99005;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: State.java */
/* loaded from: classes.dex */
public class kb {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final Integer e = 0;
    public HashMap<Object, hb> f = new HashMap<>();
    public HashMap<Object, fb> g = new HashMap<>();
    public HashMap<String, ArrayList<String>> h = new HashMap<>();
    public final db i;
    private int j;

    /* compiled from: State.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            e.values();
            int[] iArr = new int[7];
            a = iArr;
            try {
                iArr[e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: State.java */
    /* loaded from: classes.dex */
    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* compiled from: State.java */
    /* loaded from: classes.dex */
    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* compiled from: State.java */
    /* loaded from: classes.dex */
    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* compiled from: State.java */
    /* loaded from: classes.dex */
    public enum e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public kb() {
        db dbVar = new db(this);
        this.i = dbVar;
        this.j = 0;
        this.f.put(e, dbVar);
    }

    private String h() {
        StringBuilder G = wo1.G("__HELPER_KEY_");
        int i = this.j;
        this.j = i + 1;
        return wo1.z(G, i, "__");
    }

    public sb A(Object obj) {
        return k(obj, 1);
    }

    public kb B(eb ebVar) {
        return x(ebVar);
    }

    public void a(ac acVar) {
        fb fbVar;
        ec N0;
        ec N02;
        acVar.p2();
        this.i.W().j(this, acVar, 0);
        this.i.E().j(this, acVar, 1);
        for (Object obj : this.g.keySet()) {
            ec N03 = this.g.get(obj).N0();
            if (N03 != null) {
                hb hbVar = this.f.get(obj);
                if (hbVar == null) {
                    hbVar = e(obj);
                }
                hbVar.c(N03);
            }
        }
        for (Object obj2 : this.f.keySet()) {
            hb hbVar2 = this.f.get(obj2);
            if (hbVar2 != this.i && (hbVar2.e() instanceof fb) && (N02 = ((fb) hbVar2.e()).N0()) != null) {
                hb hbVar3 = this.f.get(obj2);
                if (hbVar3 == null) {
                    hbVar3 = e(obj2);
                }
                hbVar3.c(N02);
            }
        }
        for (Object obj3 : this.f.keySet()) {
            hb hbVar4 = this.f.get(obj3);
            if (hbVar4 != this.i) {
                zb b2 = hbVar4.b();
                b2.j1(hbVar4.getKey().toString());
                b2.S1(null);
                if (hbVar4.e() instanceof sb) {
                    hbVar4.a();
                }
                acVar.b(b2);
            } else {
                hbVar4.c(acVar);
            }
        }
        for (Object obj4 : this.g.keySet()) {
            fb fbVar2 = this.g.get(obj4);
            if (fbVar2.N0() != null) {
                Iterator<Object> it = fbVar2.l0.iterator();
                while (it.hasNext()) {
                    fbVar2.N0().b(this.f.get(it.next()).b());
                }
                fbVar2.a();
            } else {
                fbVar2.a();
            }
        }
        for (Object obj5 : this.f.keySet()) {
            hb hbVar5 = this.f.get(obj5);
            if (hbVar5 != this.i && (hbVar5.e() instanceof fb) && (N0 = (fbVar = (fb) hbVar5.e()).N0()) != null) {
                Iterator<Object> it2 = fbVar.l0.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    hb hbVar6 = this.f.get(next);
                    if (hbVar6 != null) {
                        N0.b(hbVar6.b());
                    } else if (next instanceof hb) {
                        N0.b(((hb) next).b());
                    } else {
                        PrintStream printStream = System.out;
                        printStream.println("couldn't find reference for " + next);
                    }
                }
                hbVar5.a();
            }
        }
        for (Object obj6 : this.f.keySet()) {
            hb hbVar7 = this.f.get(obj6);
            hbVar7.a();
            zb b3 = hbVar7.b();
            if (b3 != null && obj6 != null) {
                b3.U = obj6.toString();
            }
        }
    }

    public pb b(Object obj, d dVar) {
        db e2 = e(obj);
        if (e2.e() == null || !(e2.e() instanceof pb)) {
            pb pbVar = new pb(this);
            pbVar.Q0(dVar);
            e2.q0(pbVar);
        }
        return (pb) e2.e();
    }

    public nb c(Object... objArr) {
        nb nbVar = (nb) m(null, e.ALIGN_HORIZONTALLY);
        nbVar.M0(objArr);
        return nbVar;
    }

    public ob d(Object... objArr) {
        ob obVar = (ob) m(null, e.ALIGN_VERTICALLY);
        obVar.M0(objArr);
        return obVar;
    }

    public db e(Object obj) {
        hb hbVar = this.f.get(obj);
        if (hbVar == null) {
            hbVar = g(obj);
            this.f.put(obj, hbVar);
            hbVar.d(obj);
        }
        if (hbVar instanceof db) {
            return (db) hbVar;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public db g(Object obj) {
        return new db(this);
    }

    public void i() {
        for (Object obj : this.f.keySet()) {
            db e2 = e(obj);
            if (e2 instanceof db) {
                e2.x0(obj);
            }
        }
    }

    public ArrayList<String> j(String str) {
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }

    public sb k(Object obj, int i) {
        db e2 = e(obj);
        if (e2.e() == null || !(e2.e() instanceof sb)) {
            sb sbVar = new sb(this);
            sbVar.i(i);
            sbVar.d(obj);
            e2.q0(sbVar);
        }
        return (sb) e2.e();
    }

    public kb l(eb ebVar) {
        return v(ebVar);
    }

    public fb m(Object obj, e eVar) {
        fb tbVar;
        if (obj == null) {
            obj = h();
        }
        fb fbVar = this.g.get(obj);
        if (fbVar == null) {
            int ordinal = eVar.ordinal();
            if (ordinal == 0) {
                tbVar = new tb(this);
            } else if (ordinal == 1) {
                tbVar = new ub(this);
            } else if (ordinal == 2) {
                tbVar = new nb(this);
            } else if (ordinal == 3) {
                tbVar = new ob(this);
            } else if (ordinal != 4) {
                fbVar = new fb(this, eVar);
                fbVar.d(obj);
                this.g.put(obj, fbVar);
            } else {
                tbVar = new pb(this);
            }
            fbVar = tbVar;
            fbVar.d(obj);
            this.g.put(obj, fbVar);
        }
        return fbVar;
    }

    public tb n() {
        return (tb) m(null, e.HORIZONTAL_CHAIN);
    }

    public tb o(Object... objArr) {
        tb tbVar = (tb) m(null, e.HORIZONTAL_CHAIN);
        tbVar.M0(objArr);
        return tbVar;
    }

    public sb p(Object obj) {
        return k(obj, 0);
    }

    public void q(Object obj, Object obj2) {
        db e2 = e(obj);
        if (e2 instanceof db) {
            e2.x0(obj2);
        }
    }

    public hb r(Object obj) {
        return this.f.get(obj);
    }

    public void s() {
        this.g.clear();
        this.h.clear();
    }

    public boolean t(int i) {
        return this.i.E().k(i);
    }

    public boolean u(int i) {
        return this.i.W().k(i);
    }

    public kb v(eb ebVar) {
        this.i.r0(ebVar);
        return this;
    }

    public void w(String str, String str2) {
        ArrayList<String> arrayList;
        db e2 = e(str);
        if (e2 instanceof db) {
            e2.u0(str2);
            if (!this.h.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.h.put(str2, arrayList);
            } else {
                arrayList = this.h.get(str2);
            }
            arrayList.add(str);
        }
    }

    public kb x(eb ebVar) {
        this.i.y0(ebVar);
        return this;
    }

    public ub y() {
        return (ub) m(null, e.VERTICAL_CHAIN);
    }

    public ub z(Object... objArr) {
        ub ubVar = (ub) m(null, e.VERTICAL_CHAIN);
        ubVar.M0(objArr);
        return ubVar;
    }
}