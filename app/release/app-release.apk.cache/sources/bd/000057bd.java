package com.p7700g.p99005;

import java.util.Iterator;

/* compiled from: CLObject.java */
/* loaded from: classes.dex */
public class qa extends ma implements Iterable<oa> {

    /* compiled from: CLObject.java */
    /* loaded from: classes.dex */
    public class a implements Iterator {
        public qa s;
        public int t = 0;

        public a(qa qaVar) {
            this.s = qaVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.t < this.s.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            oa oaVar = (oa) this.s.z.get(this.t);
            this.t++;
            return oaVar;
        }
    }

    public qa(char[] cArr) {
        super(cArr);
    }

    public static qa i0(char[] cArr) {
        return new qa(cArr);
    }

    @Override // com.p7700g.p99005.na
    public String A(int i, int i2) {
        StringBuilder sb = new StringBuilder(d());
        sb.append("{\n");
        Iterator<na> it = this.z.iterator();
        boolean z = true;
        while (it.hasNext()) {
            na next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(next.A(na.t + i, i2 - 1));
        }
        sb.append("\n");
        a(sb, i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.p7700g.p99005.na
    public String B() {
        StringBuilder sb = new StringBuilder(d() + "{ ");
        Iterator<na> it = this.z.iterator();
        boolean z = true;
        while (it.hasNext()) {
            na next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.B());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<oa> iterator() {
        return new a(this);
    }

    public String j0() {
        return A(0, 0);
    }
}