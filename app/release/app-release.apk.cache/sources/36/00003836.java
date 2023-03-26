package com.p7700g.p99005;

/* compiled from: PropertyReference.java */
/* loaded from: classes3.dex */
public abstract class a35 extends i15 implements f65 {
    public a35() {
    }

    @Override // com.p7700g.p99005.f65
    @tp4(version = "1.1")
    public boolean D() {
        return H4().D();
    }

    @Override // com.p7700g.p99005.i15
    @tp4(version = "1.1")
    /* renamed from: J4 */
    public f65 H4() {
        return (f65) super.H4();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a35) {
            a35 a35Var = (a35) obj;
            return G4().equals(a35Var.G4()) && getName().equals(a35Var.getName()) && I4().equals(a35Var.I4()) && c25.g(F4(), a35Var.F4());
        } else if (obj instanceof f65) {
            return obj.equals(D4());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return I4().hashCode() + ((hashCode + (G4().hashCode() * 31)) * 31);
    }

    @Override // com.p7700g.p99005.f65
    @tp4(version = "1.1")
    public boolean q4() {
        return H4().q4();
    }

    public String toString() {
        t55 D4 = D4();
        if (D4 != this) {
            return D4.toString();
        }
        StringBuilder G = wo1.G("property ");
        G.append(getName());
        G.append(c35.b);
        return G.toString();
    }

    @tp4(version = "1.1")
    public a35(Object obj) {
        super(obj);
    }

    @tp4(version = "1.4")
    public a35(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}