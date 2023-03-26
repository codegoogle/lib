package com.p7700g.p99005;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter.java */
/* loaded from: classes3.dex */
public class qx2 implements Closeable, Flushable {
    private static final Pattern s = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] t = new String[128];
    private static final String[] u;
    private boolean A;
    private boolean B;
    private String C;
    private boolean D;
    private final Writer v;
    private int[] w = new int[32];
    private int x = 0;
    private String y;
    private String z;

    static {
        for (int i = 0; i <= 31; i++) {
            t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        u = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public qx2(Writer writer) {
        E(6);
        this.z = ":";
        this.D = true;
        Objects.requireNonNull(writer, "out == null");
        this.v = writer;
    }

    private int A() {
        int i = this.x;
        if (i != 0) {
            return this.w[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void E(int i) {
        int i2 = this.x;
        int[] iArr = this.w;
        if (i2 == iArr.length) {
            this.w = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.w;
        int i3 = this.x;
        this.x = i3 + 1;
        iArr2[i3] = i;
    }

    private void F(int i) {
        this.w[this.x - 1] = i;
    }

    private void J1() throws IOException {
        if (this.C != null) {
            a();
            X(this.C);
            this.C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void X(String str) throws IOException {
        int i;
        String str2;
        String[] strArr = this.B ? u : t;
        this.v.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.v.write(str, i2, i - i2);
                }
                this.v.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.v.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.v.write(str, i2, length - i2);
        }
        this.v.write(34);
    }

    private void a() throws IOException {
        int A = A();
        if (A == 5) {
            this.v.write(44);
        } else if (A != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        v();
        F(4);
    }

    private void b() throws IOException {
        int A = A();
        if (A == 1) {
            F(2);
            v();
        } else if (A == 2) {
            this.v.append(e14.f0);
            v();
        } else if (A != 4) {
            if (A != 6) {
                if (A == 7) {
                    if (!this.A) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            F(7);
        } else {
            this.v.append((CharSequence) this.z);
            F(5);
        }
    }

    private qx2 f(int i, int i2, char c) throws IOException {
        int A = A();
        if (A != i2 && A != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.C == null) {
            this.x--;
            if (A == i2) {
                v();
            }
            this.v.write(c);
            return this;
        }
        StringBuilder G = wo1.G("Dangling name: ");
        G.append(this.C);
        throw new IllegalStateException(G.toString());
    }

    private static boolean q(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void v() throws IOException {
        if (this.y == null) {
            return;
        }
        this.v.write(10);
        int i = this.x;
        for (int i2 = 1; i2 < i; i2++) {
            this.v.write(this.y);
        }
    }

    private qx2 z(int i, char c) throws IOException {
        b();
        E(i);
        this.v.write(c);
        return this;
    }

    public qx2 D1(boolean z) throws IOException {
        J1();
        b();
        this.v.write(z ? "true" : "false");
        return this;
    }

    public final void K(boolean z) {
        this.B = z;
    }

    public final void P(String str) {
        if (str.length() == 0) {
            this.y = null;
            this.z = ":";
            return;
        }
        this.y = str;
        this.z = ": ";
    }

    public final void U(boolean z) {
        this.A = z;
    }

    public final void W(boolean z) {
        this.D = z;
    }

    public qx2 X0(Boolean bool) throws IOException {
        if (bool == null) {
            return w();
        }
        J1();
        b();
        this.v.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public qx2 Y(double d) throws IOException {
        J1();
        if (!this.A && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        b();
        this.v.append((CharSequence) Double.toString(d));
        return this;
    }

    public qx2 Z(float f) throws IOException {
        J1();
        if (!this.A && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        b();
        this.v.append((CharSequence) Float.toString(f));
        return this;
    }

    public qx2 c1(Number number) throws IOException {
        if (number == null) {
            return w();
        }
        J1();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!q(cls) && !s.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.A) {
            throw new IllegalArgumentException(wo1.t("Numeric values must be finite, but was ", obj));
        }
        b();
        this.v.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.v.close();
        int i = this.x;
        if (i <= 1 && (i != 1 || this.w[i - 1] == 7)) {
            this.x = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public qx2 d() throws IOException {
        J1();
        return z(1, f14.u);
    }

    public qx2 d1(String str) throws IOException {
        if (str == null) {
            return w();
        }
        J1();
        b();
        X(str);
        return this;
    }

    public qx2 e() throws IOException {
        J1();
        return z(3, '{');
    }

    public void flush() throws IOException {
        if (this.x != 0) {
            this.v.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public qx2 h() throws IOException {
        return f(1, 2, f14.v);
    }

    public qx2 j() throws IOException {
        return f(3, 5, '}');
    }

    public final boolean k() {
        return this.D;
    }

    public final boolean l() {
        return this.B;
    }

    public boolean m() {
        return this.A;
    }

    public qx2 r(String str) throws IOException {
        if (str == null) {
            return w();
        }
        J1();
        b();
        this.v.append((CharSequence) str);
        return this;
    }

    public qx2 s(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.C == null) {
            if (this.x != 0) {
                this.C = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public qx2 w() throws IOException {
        if (this.C != null) {
            if (this.D) {
                J1();
            } else {
                this.C = null;
                return this;
            }
        }
        b();
        this.v.write(pg1.d);
        return this;
    }

    public qx2 x0(long j) throws IOException {
        J1();
        b();
        this.v.write(Long.toString(j));
        return this;
    }
}