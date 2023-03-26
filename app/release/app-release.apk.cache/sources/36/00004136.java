package com.p7700g.p99005;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes3.dex */
public final class ex2 extends nx2 {
    private static final Reader D0 = new a();
    private static final Object E0 = new Object();
    private Object[] F0;
    private int G0;
    private String[] H0;
    private int[] I0;

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes3.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public ex2(uv2 uv2Var) {
        super(D0);
        this.F0 = new Object[32];
        this.G0 = 0;
        this.H0 = new String[32];
        this.I0 = new int[32];
        f2(uv2Var);
    }

    private void a2(px2 px2Var) throws IOException {
        if (Y() == px2Var) {
            return;
        }
        throw new IllegalStateException("Expected " + px2Var + " but was " + Y() + v());
    }

    private Object c2() {
        return this.F0[this.G0 - 1];
    }

    private Object d2() {
        Object[] objArr = this.F0;
        int i = this.G0 - 1;
        this.G0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void f2(Object obj) {
        int i = this.G0;
        Object[] objArr = this.F0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.F0 = Arrays.copyOf(objArr, i2);
            this.I0 = Arrays.copyOf(this.I0, i2);
            this.H0 = (String[]) Arrays.copyOf(this.H0, i2);
        }
        Object[] objArr2 = this.F0;
        int i3 = this.G0;
        this.G0 = i3 + 1;
        objArr2[i3] = obj;
    }

    private String l(boolean z) {
        StringBuilder F = wo1.F(h95.c);
        int i = 0;
        while (true) {
            int i2 = this.G0;
            if (i < i2) {
                Object[] objArr = this.F0;
                if (objArr[i] instanceof rv2) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.I0[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        F.append(f14.u);
                        F.append(i3);
                        F.append(f14.v);
                    }
                } else if ((objArr[i] instanceof xv2) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    F.append('.');
                    String[] strArr = this.H0;
                    if (strArr[i] != null) {
                        F.append(strArr[i]);
                    }
                }
                i++;
            } else {
                return F.toString();
            }
        }
    }

    private String v() {
        StringBuilder G = wo1.G(" at path ");
        G.append(getPath());
        return G.toString();
    }

    @Override // com.p7700g.p99005.nx2
    public int A() throws IOException {
        px2 Y = Y();
        px2 px2Var = px2.NUMBER;
        if (Y != px2Var && Y != px2.STRING) {
            throw new IllegalStateException("Expected " + px2Var + " but was " + Y + v());
        }
        int i = ((aw2) c2()).i();
        d2();
        int i2 = this.G0;
        if (i2 > 0) {
            int[] iArr = this.I0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return i;
    }

    @Override // com.p7700g.p99005.nx2
    public long E() throws IOException {
        px2 Y = Y();
        px2 px2Var = px2.NUMBER;
        if (Y != px2Var && Y != px2.STRING) {
            throw new IllegalStateException("Expected " + px2Var + " but was " + Y + v());
        }
        long t = ((aw2) c2()).t();
        d2();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return t;
    }

    @Override // com.p7700g.p99005.nx2
    public String F() throws IOException {
        a2(px2.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) c2()).next();
        String str = (String) entry.getKey();
        this.H0[this.G0 - 1] = str;
        f2(entry.getValue());
        return str;
    }

    @Override // com.p7700g.p99005.nx2
    public void P() throws IOException {
        a2(px2.NULL);
        d2();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.p7700g.p99005.nx2
    public String W() throws IOException {
        px2 Y = Y();
        px2 px2Var = px2.STRING;
        if (Y != px2Var && Y != px2.NUMBER) {
            throw new IllegalStateException("Expected " + px2Var + " but was " + Y + v());
        }
        String y = ((aw2) d2()).y();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return y;
    }

    @Override // com.p7700g.p99005.nx2
    public px2 Y() throws IOException {
        if (this.G0 == 0) {
            return px2.END_DOCUMENT;
        }
        Object c2 = c2();
        if (c2 instanceof Iterator) {
            boolean z = this.F0[this.G0 - 2] instanceof xv2;
            Iterator it = (Iterator) c2;
            if (!it.hasNext()) {
                return z ? px2.END_OBJECT : px2.END_ARRAY;
            } else if (z) {
                return px2.NAME;
            } else {
                f2(it.next());
                return Y();
            }
        } else if (c2 instanceof xv2) {
            return px2.BEGIN_OBJECT;
        } else {
            if (c2 instanceof rv2) {
                return px2.BEGIN_ARRAY;
            }
            if (c2 instanceof aw2) {
                aw2 aw2Var = (aw2) c2;
                if (aw2Var.J()) {
                    return px2.STRING;
                }
                if (aw2Var.G()) {
                    return px2.BOOLEAN;
                }
                if (aw2Var.I()) {
                    return px2.NUMBER;
                }
                throw new AssertionError();
            } else if (c2 instanceof wv2) {
                return px2.NULL;
            } else {
                if (c2 == E0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.p7700g.p99005.nx2
    public void Y1() throws IOException {
        if (Y() == px2.NAME) {
            F();
            this.H0[this.G0 - 2] = pg1.d;
        } else {
            d2();
            int i = this.G0;
            if (i > 0) {
                this.H0[i - 1] = pg1.d;
            }
        }
        int i2 = this.G0;
        if (i2 > 0) {
            int[] iArr = this.I0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.p7700g.p99005.nx2
    public void a() throws IOException {
        a2(px2.BEGIN_ARRAY);
        f2(((rv2) c2()).iterator());
        this.I0[this.G0 - 1] = 0;
    }

    @Override // com.p7700g.p99005.nx2
    public void b() throws IOException {
        a2(px2.BEGIN_OBJECT);
        f2(((xv2) c2()).M().iterator());
    }

    public uv2 b2() throws IOException {
        px2 Y = Y();
        if (Y != px2.NAME && Y != px2.END_ARRAY && Y != px2.END_OBJECT && Y != px2.END_DOCUMENT) {
            uv2 uv2Var = (uv2) c2();
            Y1();
            return uv2Var;
        }
        throw new IllegalStateException("Unexpected " + Y + " when reading a JsonElement.");
    }

    @Override // com.p7700g.p99005.nx2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.F0 = new Object[]{E0};
        this.G0 = 1;
    }

    public void e2() throws IOException {
        a2(px2.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) c2()).next();
        f2(entry.getValue());
        f2(new aw2((String) entry.getKey()));
    }

    @Override // com.p7700g.p99005.nx2
    public String getPath() {
        return l(false);
    }

    @Override // com.p7700g.p99005.nx2
    public void h() throws IOException {
        a2(px2.END_ARRAY);
        d2();
        d2();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.p7700g.p99005.nx2
    public void j() throws IOException {
        a2(px2.END_OBJECT);
        d2();
        d2();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.p7700g.p99005.nx2
    public String m() {
        return l(true);
    }

    @Override // com.p7700g.p99005.nx2
    public boolean q() throws IOException {
        px2 Y = Y();
        return (Y == px2.END_OBJECT || Y == px2.END_ARRAY || Y == px2.END_DOCUMENT) ? false : true;
    }

    @Override // com.p7700g.p99005.nx2
    public String toString() {
        return ex2.class.getSimpleName() + v();
    }

    @Override // com.p7700g.p99005.nx2
    public boolean w() throws IOException {
        a2(px2.BOOLEAN);
        boolean d = ((aw2) d2()).d();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    @Override // com.p7700g.p99005.nx2
    public double z() throws IOException {
        px2 Y = Y();
        px2 px2Var = px2.NUMBER;
        if (Y != px2Var && Y != px2.STRING) {
            throw new IllegalStateException("Expected " + px2Var + " but was " + Y + v());
        }
        double g = ((aw2) c2()).g();
        if (!r() && (Double.isNaN(g) || Double.isInfinite(g))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + g);
        }
        d2();
        int i = this.G0;
        if (i > 0) {
            int[] iArr = this.I0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g;
    }
}