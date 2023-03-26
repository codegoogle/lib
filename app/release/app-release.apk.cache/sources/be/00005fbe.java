package com.p7700g.p99005;

import com.p7700g.p99005.kb;
import java.util.Iterator;

/* compiled from: VerticalChainReference.java */
/* loaded from: classes.dex */
public class ub extends qb {

    /* compiled from: VerticalChainReference.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            kb.b.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[kb.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kb.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kb.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ub(kb kbVar) {
        super(kbVar, kb.e.VERTICAL_CHAIN);
    }

    @Override // com.p7700g.p99005.fb, com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
        Iterator<Object> it = this.l0.iterator();
        while (it.hasNext()) {
            this.j0.e(it.next()).w();
        }
        Iterator<Object> it2 = this.l0.iterator();
        db dbVar = null;
        db dbVar2 = null;
        while (it2.hasNext()) {
            db e = this.j0.e(it2.next());
            if (dbVar2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    e.E0(obj).c0(this.o).e0(this.u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        e.D0(obj2).c0(this.o).e0(this.u);
                    } else {
                        e.E0(kb.e);
                    }
                }
                dbVar2 = e;
            }
            if (dbVar != null) {
                dbVar.q(e.getKey());
                e.D0(dbVar.getKey());
            }
            dbVar = e;
        }
        if (dbVar != null) {
            Object obj3 = this.U;
            if (obj3 != null) {
                dbVar.q(obj3).c0(this.p).e0(this.v);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    dbVar.p(obj4).c0(this.p).e0(this.v);
                } else {
                    dbVar.p(kb.e);
                }
            }
        }
        if (dbVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            dbVar2.J0(f);
        }
        int ordinal = this.o0.ordinal();
        if (ordinal == 0) {
            dbVar2.v0(0);
        } else if (ordinal == 1) {
            dbVar2.v0(1);
        } else if (ordinal != 2) {
        } else {
            dbVar2.v0(2);
        }
    }
}