package com.p7700g.p99005;

import com.p7700g.p99005.kb;

/* compiled from: BarrierReference.java */
/* loaded from: classes.dex */
public class pb extends fb {
    private kb.d n0;
    private int o0;
    private vb p0;

    /* compiled from: BarrierReference.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            kb.d.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                iArr[kb.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kb.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kb.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kb.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kb.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kb.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public pb(kb kbVar) {
        super(kbVar, kb.e.BARRIER);
    }

    @Override // com.p7700g.p99005.fb
    public ec N0() {
        if (this.p0 == null) {
            this.p0 = new vb();
        }
        return this.p0;
    }

    public void Q0(kb.d dVar) {
        this.n0 = dVar;
    }

    @Override // com.p7700g.p99005.fb, com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
        N0();
        int ordinal = this.n0.ordinal();
        int i = 3;
        if (ordinal == 1 || ordinal == 3) {
            i = 1;
        } else if (ordinal == 4) {
            i = 2;
        } else if (ordinal != 5) {
            i = 0;
        }
        this.p0.u2(i);
        this.p0.v2(this.o0);
    }

    @Override // com.p7700g.p99005.db
    public db c0(int i) {
        this.o0 = i;
        return this;
    }

    @Override // com.p7700g.p99005.db
    public db d0(Object obj) {
        c0(this.j0.f(obj));
        return this;
    }
}