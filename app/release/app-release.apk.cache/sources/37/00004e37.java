package com.p7700g.p99005;

import java.util.Iterator;

/* compiled from: CLArray.java */
/* loaded from: classes.dex */
public class la extends ma {
    public la(char[] cArr) {
        super(cArr);
    }

    public static na D(char[] cArr) {
        return new la(cArr);
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String B = B();
        if (i2 <= 0 && B.length() + i < na.s) {
            sb.append(B);
        } else {
            sb.append("[\n");
            Iterator<na> it = this.z.iterator();
            boolean z = true;
            while (it.hasNext()) {
                na next = it.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                a(sb, na.t + i);
                sb.append(next.A(na.t + i, i2 - 1));
            }
            sb.append("\n");
            a(sb, i);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        StringBuilder sb = new StringBuilder(d() + "[");
        boolean z = true;
        for (int i = 0; i < this.z.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.z.get(i).B());
        }
        return ((Object) sb) + "]";
    }
}