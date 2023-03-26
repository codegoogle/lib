package com.p7700g.p99005;

/* compiled from: FadeModeEvaluators.java */
@e2(21)
/* loaded from: classes3.dex */
public class kk2 {
    private static final jk2 a = new a();
    private static final jk2 b = new b();
    private static final jk2 c = new c();
    private static final jk2 d = new d();

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class a implements jk2 {
        @Override // com.p7700g.p99005.jk2
        public lk2 a(float f, float f2, float f3, float f4) {
            return lk2.a(255, el2.n(0, 255, f2, f3, f));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class b implements jk2 {
        @Override // com.p7700g.p99005.jk2
        public lk2 a(float f, float f2, float f3, float f4) {
            return lk2.b(el2.n(255, 0, f2, f3, f), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class c implements jk2 {
        @Override // com.p7700g.p99005.jk2
        public lk2 a(float f, float f2, float f3, float f4) {
            return lk2.b(el2.n(255, 0, f2, f3, f), el2.n(0, 255, f2, f3, f));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class d implements jk2 {
        @Override // com.p7700g.p99005.jk2
        public lk2 a(float f, float f2, float f3, float f4) {
            float a = wo1.a(f3, f2, f4, f2);
            return lk2.b(el2.n(255, 0, f2, a, f), el2.n(0, 255, a, f3, f));
        }
    }

    private kk2() {
    }

    public static jk2 a(int i, boolean z) {
        if (i == 0) {
            return z ? a : b;
        } else if (i == 1) {
            return z ? b : a;
        } else if (i != 2) {
            if (i == 3) {
                return d;
            }
            throw new IllegalArgumentException(wo1.l("Invalid fade mode: ", i));
        } else {
            return c;
        }
    }
}