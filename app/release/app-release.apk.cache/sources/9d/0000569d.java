package com.p7700g.p99005;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class po0 implements Closeable {
    private static final String[] s = new String[128];
    public int t;
    public int[] u = new int[32];
    public String[] v = new String[32];
    public int[] w = new int[32];
    public boolean x;
    public boolean y;

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String[] a;
        public final mw5 b;

        private a(String[] strArr, mw5 mw5Var) {
            this.a = strArr;
            this.b = mw5Var;
        }

        public static a a(String... strArr) {
            try {
                vv5[] vv5VarArr = new vv5[strArr.length];
                sv5 sv5Var = new sv5();
                for (int i = 0; i < strArr.length; i++) {
                    po0.E(sv5Var, strArr[i]);
                    sv5Var.readByte();
                    vv5VarArr[i] = sv5Var.f1();
                }
                return new a((String[]) strArr.clone(), mw5.m(vv5VarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void E(tv5 tv5Var, String str) throws IOException {
        int i;
        String str2;
        String[] strArr = s;
        tv5Var.g0(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    tv5Var.a1(str, i2, i);
                }
                tv5Var.K0(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                tv5Var.K0(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            tv5Var.a1(str, i2, length);
        }
        tv5Var.g0(34);
    }

    public static po0 r(uv5 uv5Var) {
        return new ro0(uv5Var);
    }

    public abstract void A() throws IOException;

    public final oo0 F(String str) throws oo0 {
        StringBuilder L = wo1.L(str, " at path ");
        L.append(getPath());
        throw new oo0(L.toString());
    }

    public abstract void b() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public final String getPath() {
        return qo0.a(this.t, this.u, this.v, this.w);
    }

    public abstract boolean h() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int l() throws IOException;

    public abstract String m() throws IOException;

    public abstract String q() throws IOException;

    public abstract b s() throws IOException;

    public final void v(int i) {
        int i2 = this.t;
        int[] iArr = this.u;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.u = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.v;
                this.v = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.w;
                this.w = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder G = wo1.G("Nesting too deep at ");
                G.append(getPath());
                throw new no0(G.toString());
            }
        }
        int[] iArr3 = this.u;
        int i3 = this.t;
        this.t = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int w(a aVar) throws IOException;

    public abstract void z() throws IOException;
}