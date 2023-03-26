package com.p7700g.p99005;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: classes3.dex */
public class oj2 {
    private static final nj2 a = new a();
    private static final nj2 b = new b();
    private static final nj2 c = new c();
    private static final nj2 d = new d();

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class a implements nj2 {
        @Override // com.p7700g.p99005.nj2
        public pj2 a(float f, float f2, float f3, float f4) {
            return pj2.a(255, hk2.n(0, 255, f2, f3, f));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class b implements nj2 {
        @Override // com.p7700g.p99005.nj2
        public pj2 a(float f, float f2, float f3, float f4) {
            return pj2.b(hk2.n(255, 0, f2, f3, f), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class c implements nj2 {
        @Override // com.p7700g.p99005.nj2
        public pj2 a(float f, float f2, float f3, float f4) {
            return pj2.b(hk2.n(255, 0, f2, f3, f), hk2.n(0, 255, f2, f3, f));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class d implements nj2 {
        @Override // com.p7700g.p99005.nj2
        public pj2 a(float f, float f2, float f3, float f4) {
            float a = wo1.a(f3, f2, f4, f2);
            return pj2.b(hk2.n(255, 0, f2, a, f), hk2.n(0, 255, a, f3, f));
        }
    }

    private oj2() {
    }

    public static nj2 a(int i, boolean z) {
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