package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.util.ArrayList;

/* compiled from: CLKey.java */
/* loaded from: classes.dex */
public class oa extends ma {
    private static ArrayList<String> A;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        A = arrayList;
        arrayList.add("ConstraintSets");
        A.add("Variables");
        A.add("Generate");
        A.add(aa.h.a);
        A.add("KeyFrames");
        A.add(aa.a.a);
        A.add("KeyPositions");
        A.add("KeyCycles");
    }

    public oa(char[] cArr) {
        super(cArr);
    }

    public static na D(char[] cArr) {
        return new oa(cArr);
    }

    public static na i0(String str, na naVar) {
        oa oaVar = new oa(str.toCharArray());
        oaVar.y(0L);
        oaVar.u(str.length() - 1);
        oaVar.l0(naVar);
        return oaVar;
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder(d());
        a(sb, i);
        String b = b();
        if (this.z.size() > 0) {
            sb.append(b);
            sb.append(": ");
            if (A.contains(b)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.z.get(0).A(i, i2 - 1));
            } else {
                String B = this.z.get(0).B();
                if (B.length() + i < na.s) {
                    sb.append(B);
                } else {
                    sb.append(this.z.get(0).A(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return wo1.t(b, ": <> ");
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        if (this.z.size() > 0) {
            return d() + b() + ": " + this.z.get(0).B();
        }
        return d() + b() + ": <> ";
    }

    public String j0() {
        return b();
    }

    public na k0() {
        if (this.z.size() > 0) {
            return this.z.get(0);
        }
        return null;
    }

    public void l0(na naVar) {
        if (this.z.size() > 0) {
            this.z.set(0, naVar);
        } else {
            this.z.add(naVar);
        }
    }
}