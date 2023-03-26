package com.p7700g.p99005;

/* compiled from: CLString.java */
/* loaded from: classes.dex */
public class ta extends na {
    public ta(char[] cArr) {
        super(cArr);
    }

    public static na C(char[] cArr) {
        return new ta(cArr);
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        a(sb, i);
        sb.append("'");
        sb.append(b());
        sb.append("'");
        return sb.toString();
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        StringBuilder G = wo1.G("'");
        G.append(b());
        G.append("'");
        return G.toString();
    }
}