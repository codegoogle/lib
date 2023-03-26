package com.p7700g.p99005;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CLContainer.java */
/* loaded from: classes.dex */
public class ma extends na {
    public ArrayList<na> z;

    public ma(char[] cArr) {
        super(cArr);
        this.z = new ArrayList<>();
    }

    public static na D(char[] cArr) {
        return new ma(cArr);
    }

    public void C(na naVar) {
        this.z.add(naVar);
        if (ra.a) {
            PrintStream printStream = System.out;
            printStream.println("added element " + naVar + " to " + this);
        }
    }

    public na E(int i) throws sa {
        if (i >= 0 && i < this.z.size()) {
            return this.z.get(i);
        }
        throw new sa(wo1.l("no element at index ", i), this);
    }

    public na G(String str) throws sa {
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            oa oaVar = (oa) it.next();
            if (oaVar.b().equals(str)) {
                return oaVar.k0();
            }
        }
        throw new sa(wo1.u("no element for key <", str, ">"), this);
    }

    public la H(int i) throws sa {
        na E = E(i);
        if (E instanceof la) {
            return (la) E;
        }
        throw new sa(wo1.l("no array at index ", i), this);
    }

    public la I(String str) throws sa {
        na G = G(str);
        if (G instanceof la) {
            return (la) G;
        }
        StringBuilder M = wo1.M("no array found for key <", str, ">, found [");
        M.append(G.m());
        M.append("] : ");
        M.append(G);
        throw new sa(M.toString(), this);
    }

    public la J(String str) {
        na X = X(str);
        if (X instanceof la) {
            return (la) X;
        }
        return null;
    }

    public boolean L(int i) throws sa {
        na E = E(i);
        if (E instanceof ua) {
            return ((ua) E).D();
        }
        throw new sa(wo1.l("no boolean at index ", i), this);
    }

    public boolean M(String str) throws sa {
        na G = G(str);
        if (G instanceof ua) {
            return ((ua) G).D();
        }
        StringBuilder M = wo1.M("no boolean found for key <", str, ">, found [");
        M.append(G.m());
        M.append("] : ");
        M.append(G);
        throw new sa(M.toString(), this);
    }

    public float N(int i) throws sa {
        na E = E(i);
        if (E != null) {
            return E.f();
        }
        throw new sa(wo1.l("no float at index ", i), this);
    }

    public float O(String str) throws sa {
        na G = G(str);
        if (G != null) {
            return G.f();
        }
        StringBuilder M = wo1.M("no float found for key <", str, ">, found [");
        M.append(G.m());
        M.append("] : ");
        M.append(G);
        throw new sa(M.toString(), this);
    }

    public float P(String str) {
        na X = X(str);
        if (X instanceof pa) {
            return X.f();
        }
        return Float.NaN;
    }

    public int Q(int i) throws sa {
        na E = E(i);
        if (E != null) {
            return E.g();
        }
        throw new sa(wo1.l("no int at index ", i), this);
    }

    public int R(String str) throws sa {
        na G = G(str);
        if (G != null) {
            return G.g();
        }
        StringBuilder M = wo1.M("no int found for key <", str, ">, found [");
        M.append(G.m());
        M.append("] : ");
        M.append(G);
        throw new sa(M.toString(), this);
    }

    public qa S(int i) throws sa {
        na E = E(i);
        if (E instanceof qa) {
            return (qa) E;
        }
        throw new sa(wo1.l("no object at index ", i), this);
    }

    public qa T(String str) throws sa {
        na G = G(str);
        if (G instanceof qa) {
            return (qa) G;
        }
        StringBuilder M = wo1.M("no object found for key <", str, ">, found [");
        M.append(G.m());
        M.append("] : ");
        M.append(G);
        throw new sa(M.toString(), this);
    }

    public qa U(String str) {
        na X = X(str);
        if (X instanceof qa) {
            return (qa) X;
        }
        return null;
    }

    public na V(int i) {
        if (i < 0 || i >= this.z.size()) {
            return null;
        }
        return this.z.get(i);
    }

    public na X(String str) {
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            oa oaVar = (oa) it.next();
            if (oaVar.b().equals(str)) {
                return oaVar.k0();
            }
        }
        return null;
    }

    public String Z(int i) throws sa {
        na E = E(i);
        if (E instanceof ta) {
            return E.b();
        }
        throw new sa(wo1.l("no string at index ", i), this);
    }

    public String a0(String str) throws sa {
        na G = G(str);
        if (G instanceof ta) {
            return G.b();
        }
        StringBuilder N = wo1.N("no string found for key <", str, ">, found [", G != null ? G.m() : null, "] : ");
        N.append(G);
        throw new sa(N.toString(), this);
    }

    public String b0(int i) {
        na V = V(i);
        if (V instanceof ta) {
            return V.b();
        }
        return null;
    }

    public String c0(String str) {
        na X = X(str);
        if (X instanceof ta) {
            return X.b();
        }
        return null;
    }

    public boolean d0(String str) {
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            na next = it.next();
            if ((next instanceof oa) && ((oa) next).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> e0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            na next = it.next();
            if (next instanceof oa) {
                arrayList.add(((oa) next).b());
            }
        }
        return arrayList;
    }

    public void f0(String str, na naVar) {
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            oa oaVar = (oa) it.next();
            if (oaVar.b().equals(str)) {
                oaVar.l0(naVar);
                return;
            }
        }
        this.z.add((oa) oa.i0(str, naVar));
    }

    public void g0(String str, float f) {
        f0(str, new pa(f));
    }

    public void h0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            na next = it.next();
            if (((oa) next).b().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.z.remove((na) it2.next());
        }
    }

    public int size() {
        return this.z.size();
    }

    @Override // com.p7700g.p99005.na
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<na> it = this.z.iterator();
        while (it.hasNext()) {
            na next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }
}