package com.p7700g.p99005;

import com.p7700g.p99005.kb;
import java.util.Iterator;

/* compiled from: HorizontalChainReference.java */
/* loaded from: classes.dex */
public class tb extends qb {

    /* compiled from: HorizontalChainReference.java */
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

    public tb(kb kbVar) {
        super(kbVar, kb.e.HORIZONTAL_CHAIN);
    }

    @Override // com.p7700g.p99005.fb, com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
        Iterator<Object> it = this.l0.iterator();
        while (it.hasNext()) {
            this.j0.e(it.next()).v();
        }
        Iterator<Object> it2 = this.l0.iterator();
        db dbVar = null;
        db dbVar2 = null;
        while (it2.hasNext()) {
            db e = this.j0.e(it2.next());
            if (dbVar2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    e.B0(obj).c0(this.m).e0(this.s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        e.A0(obj2).c0(this.m).e0(this.s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            e.B0(obj3).c0(this.k).e0(this.q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                e.A0(obj4).c0(this.k).e0(this.q);
                            } else {
                                e.B0(kb.e);
                            }
                        }
                    }
                }
                dbVar2 = e;
            }
            if (dbVar != null) {
                dbVar.B(e.getKey());
                e.A0(dbVar.getKey());
            }
            dbVar = e;
        }
        if (dbVar != null) {
            Object obj5 = this.Q;
            if (obj5 != null) {
                dbVar.B(obj5).c0(this.n).e0(this.t);
            } else {
                Object obj6 = this.R;
                if (obj6 != null) {
                    dbVar.A(obj6).c0(this.n).e0(this.t);
                } else {
                    Object obj7 = this.M;
                    if (obj7 != null) {
                        dbVar.B(obj7).c0(this.l).e0(this.r);
                    } else {
                        Object obj8 = this.N;
                        if (obj8 != null) {
                            dbVar.A(obj8).c0(this.l).e0(this.r);
                        } else {
                            dbVar.A(kb.e);
                        }
                    }
                }
            }
        }
        if (dbVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            dbVar2.Y(f);
        }
        int ordinal = this.o0.ordinal();
        if (ordinal == 0) {
            dbVar2.s0(0);
        } else if (ordinal == 1) {
            dbVar2.s0(1);
        } else if (ordinal != 2) {
        } else {
            dbVar2.s0(2);
        }
    }
}