package com.p7700g.p99005;

import com.p7700g.p99005.ni4;
import com.p7700g.p99005.yb4;

/* compiled from: IPAddressConverter.java */
/* loaded from: classes3.dex */
public interface k14 extends ni4.b, yb4.a {

    /* compiled from: IPAddressConverter.java */
    /* loaded from: classes3.dex */
    public static class a implements k14 {
        @Override // com.p7700g.p99005.k14
        public boolean a(j14 j14Var) {
            return true;
        }

        @Override // com.p7700g.p99005.k14
        public boolean b(j14 j14Var) {
            return j14Var.J4() || (!j14Var.B5().W6() && j14Var.B5().e7());
        }

        @Override // com.p7700g.p99005.yb4.a
        public yb4 c(j14 j14Var) {
            if (b(j14Var)) {
                return j14Var.J4() ? j14Var.A5() : j14Var.B5().u6();
            }
            return null;
        }

        @Override // com.p7700g.p99005.ni4.b
        public ni4 d(j14 j14Var) {
            return j14Var.L4() ? j14Var.B5() : j14Var.A5().t6();
        }
    }

    boolean a(j14 j14Var);

    boolean b(j14 j14Var);
}