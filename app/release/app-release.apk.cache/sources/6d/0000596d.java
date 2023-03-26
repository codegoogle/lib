package com.p7700g.p99005;

import java.io.Serializable;

/* compiled from: MACAddressProvider.java */
/* loaded from: classes3.dex */
public interface r64 extends Serializable {
    public static final r64 j0 = new a();

    /* compiled from: MACAddressProvider.java */
    /* loaded from: classes3.dex */
    public class a implements r64 {
        @Override // com.p7700g.p99005.r64
        public gl4 a1() {
            return null;
        }

        public String toString() {
            return pg1.d;
        }
    }

    /* compiled from: MACAddressProvider.java */
    /* loaded from: classes3.dex */
    public static final class b implements r64 {
        private static final long s = 4;
        private x64 t;
        private gl4 u;

        public b(gl4 gl4Var) {
            this.u = gl4Var;
        }

        @Override // com.p7700g.p99005.r64
        public gl4 a1() {
            if (this.t != null) {
                synchronized (this) {
                    x64 x64Var = this.t;
                    if (x64Var != null) {
                        this.u = x64Var.x3();
                        this.t = null;
                    }
                }
            }
            return this.u;
        }

        public String toString() {
            return String.valueOf(a1());
        }
    }

    gl4 a1();
}