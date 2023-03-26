package com.p7700g.p99005;

import com.p7700g.p99005.il4;
import com.p7700g.p99005.w14;
import java.util.Arrays;

/* compiled from: MACAddressProvider.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class q64 {

    /* compiled from: MACAddressProvider.java */
    /* loaded from: classes3.dex */
    public class a implements r64 {
        private static final long s = 4;
        public final /* synthetic */ il4.a t;
        public final /* synthetic */ kl4[] u;

        public a(il4.a aVar, kl4[] kl4VarArr) {
            this.t = aVar;
            this.u = kl4VarArr;
        }

        @Override // com.p7700g.p99005.r64
        public gl4 a1() {
            return this.t.H((jl4) this.t.u(this.u));
        }

        public String toString() {
            return String.valueOf(a1());
        }
    }

    public static r64 a(w14 w14Var) {
        il4 p = w14Var.p();
        w14.a aVar = w14Var.F;
        il4.a g = p.g();
        kl4 w0 = g.w0(0, 255);
        kl4[] d = g.d(aVar == w14.a.EUI64 ? 8 : 6);
        Arrays.fill(d, w0);
        return new a(g, d);
    }
}