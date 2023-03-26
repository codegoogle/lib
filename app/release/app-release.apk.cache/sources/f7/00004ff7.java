package com.p7700g.p99005;

import com.p7700g.p99005.j14;

/* compiled from: AddressParseData.java */
/* loaded from: classes3.dex */
public class m64 extends k64 {
    private static final long B0 = 4;
    private v64 C0;
    private int D0;
    private boolean E0;
    private boolean F0;
    private j14.b G0;
    private boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public w64 L0;
    private boolean M0;
    private boolean N0;

    public m64(CharSequence charSequence) {
        super(charSequence);
        this.C0 = u64.u;
        this.D0 = -1;
    }

    private void S3(StringBuilder sb) {
        k64 j3 = j3();
        int n3 = n3();
        if (n3 >= 0) {
            CharSequence u = j3.u();
            sb.append(u.subSequence(n3, u.length()));
            return;
        }
        sb.append("unknown");
    }

    public void B4(boolean z) {
        this.I0 = z;
    }

    public boolean C3() {
        return j3().h() >= 0;
    }

    public boolean C4() {
        return this.M0;
    }

    public void D4(boolean z) {
        this.H0 = z;
    }

    public boolean E3(int i) {
        return G3(i, j3().t());
    }

    public boolean G3(int i, int[] iArr) {
        return k64.o(i, 6, iArr) == k64.o(i, 15, iArr);
    }

    public boolean I3() {
        return this.F0;
    }

    public boolean N3() {
        return this.H0;
    }

    public void U3(boolean z) {
        this.M0 = z;
    }

    public void W3(boolean z) {
        this.N0 = z;
    }

    public boolean b4() {
        return this.E0;
    }

    public void e4(boolean z) {
        this.K0 = z;
    }

    public void g4(boolean z) {
        this.J0 = z;
    }

    public void i3() {
        this.D0 = -1;
        this.F0 = false;
        this.E0 = false;
        this.N0 = false;
        this.C0 = u64.u;
    }

    public k64 j3() {
        return this;
    }

    public v64 k3() {
        return this.C0;
    }

    public int n3() {
        return this.D0;
    }

    public void n4(boolean z) {
        this.E0 = z;
    }

    public boolean o3() {
        j14.b w2 = w2();
        return w2 != null && w2.f();
    }

    public boolean p3() {
        return this.K0;
    }

    public void p4(w64 w64Var) {
        this.L0 = w64Var;
    }

    public void q4(v64 v64Var) {
        this.C0 = v64Var;
    }

    public boolean r4() {
        return this.L0 != null;
    }

    public boolean t3() {
        return this.J0;
    }

    @Override // com.p7700g.p99005.k64
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j3());
        sb.append("ip version: ");
        sb.append(w2());
        if (v2()) {
            if (r4()) {
                if (I3()) {
                    sb.append(", with zone ");
                    S3(sb);
                }
                if (b4()) {
                    sb.append(", with prefix length ");
                    S3(sb);
                }
                sb.append(", with IPv4 embedded address: ");
                sb.append('\n');
                sb.append(this.L0);
            } else {
                if (C4()) {
                    sb.append(" base 85");
                    if (x3()) {
                        sb.append(", with zone ");
                        S3(sb);
                    }
                } else if (I3()) {
                    sb.append(", with zone ");
                    S3(sb);
                }
                if (b4()) {
                    sb.append(", with prefix length ");
                    S3(sb);
                }
                sb.append('\n');
            }
        } else if (o3()) {
            if (b4()) {
                sb.append(", with prefix length  ");
                S3(sb);
            }
            if (N3()) {
                sb.append(", with joined segments");
            }
            if (w3()) {
                sb.append(", with at least one hex or octal value");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public boolean v2() {
        j14.b w2 = w2();
        return w2 != null && w2.g();
    }

    public j14.b w2() {
        return this.G0;
    }

    public boolean w3() {
        return this.I0;
    }

    public void w4(int i) {
        this.D0 = i;
    }

    public boolean x3() {
        return this.N0;
    }

    public void x4(j14.b bVar) {
        this.G0 = bVar;
    }

    public void y4(boolean z) {
        this.F0 = z;
    }
}