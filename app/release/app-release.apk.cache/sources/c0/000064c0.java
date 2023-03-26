package com.p7700g.p99005;

/* compiled from: FunctionReference.java */
/* loaded from: classes3.dex */
public class x15 extends i15 implements v15, z55 {
    @tp4(version = "1.4")
    private final int A;
    private final int z;

    public x15(int i) {
        this(i, i15.s, null, null, null, 0);
    }

    @Override // com.p7700g.p99005.z55
    @tp4(version = "1.1")
    public boolean B() {
        return H4().B();
    }

    @Override // com.p7700g.p99005.i15
    @tp4(version = "1.1")
    public t55 E4() {
        return c35.c(this);
    }

    @Override // com.p7700g.p99005.i15
    @tp4(version = "1.1")
    /* renamed from: J4 */
    public z55 H4() {
        return (z55) super.H4();
    }

    @Override // com.p7700g.p99005.z55
    @tp4(version = "1.1")
    public boolean U() {
        return H4().U();
    }

    @Override // com.p7700g.p99005.z55
    @tp4(version = "1.1")
    public boolean e4() {
        return H4().e4();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x15) {
            x15 x15Var = (x15) obj;
            return getName().equals(x15Var.getName()) && I4().equals(x15Var.I4()) && this.A == x15Var.A && this.z == x15Var.z && c25.g(F4(), x15Var.F4()) && c25.g(G4(), x15Var.G4());
        } else if (obj instanceof z55) {
            return obj.equals(D4());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return I4().hashCode() + ((getName().hashCode() + (G4() == null ? 0 : G4().hashCode() * 31)) * 31);
    }

    @Override // com.p7700g.p99005.v15
    public int i() {
        return this.z;
    }

    @Override // com.p7700g.p99005.i15, com.p7700g.p99005.t55
    @tp4(version = "1.1")
    public boolean t() {
        return H4().t();
    }

    public String toString() {
        t55 D4 = D4();
        if (D4 != this) {
            return D4.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder G = wo1.G("function ");
        G.append(getName());
        G.append(c35.b);
        return G.toString();
    }

    @Override // com.p7700g.p99005.z55
    @tp4(version = "1.1")
    public boolean x4() {
        return H4().x4();
    }

    @tp4(version = "1.1")
    public x15(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @tp4(version = "1.4")
    public x15(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.z = i;
        this.A = i2 >> 1;
    }
}