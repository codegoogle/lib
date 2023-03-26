package com.p7700g.p99005;

/* compiled from: CLParsingException.java */
/* loaded from: classes.dex */
public class sa extends Exception {
    private final String s;
    private final int t;
    private final String u;

    public sa(String str, na naVar) {
        this.s = str;
        if (naVar != null) {
            this.u = naVar.m();
            this.t = naVar.h();
            return;
        }
        this.u = "unknown";
        this.t = 0;
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.s);
        sb.append(" (");
        sb.append(this.u);
        sb.append(" at line ");
        return wo1.z(sb, this.t, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder G = wo1.G("CLParsingException (");
        G.append(hashCode());
        G.append(") : ");
        G.append(f());
        return G.toString();
    }
}