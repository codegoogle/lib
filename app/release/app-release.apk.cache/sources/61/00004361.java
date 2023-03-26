package com.p7700g.p99005;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes3.dex */
public final class fx2 extends qx2 {
    private static final Writer E = new a();
    private static final aw2 F = new aw2("closed");
    private final List<uv2> G;
    private String H;
    private uv2 I;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes3.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public fx2() {
        super(E);
        this.G = new ArrayList();
        this.I = wv2.a;
    }

    private uv2 T1() {
        List<uv2> list = this.G;
        return list.get(list.size() - 1);
    }

    private void Y1(uv2 uv2Var) {
        if (this.H != null) {
            if (!uv2Var.B() || k()) {
                ((xv2) T1()).E(this.H, uv2Var);
            }
            this.H = null;
        } else if (this.G.isEmpty()) {
            this.I = uv2Var;
        } else {
            uv2 T1 = T1();
            if (T1 instanceof rv2) {
                ((rv2) T1).E(uv2Var);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 D1(boolean z) throws IOException {
        Y1(new aw2(Boolean.valueOf(z)));
        return this;
    }

    public uv2 K1() {
        if (this.G.isEmpty()) {
            return this.I;
        }
        StringBuilder G = wo1.G("Expected one JSON element but was ");
        G.append(this.G);
        throw new IllegalStateException(G.toString());
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 X0(Boolean bool) throws IOException {
        if (bool == null) {
            return w();
        }
        Y1(new aw2(bool));
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 Y(double d) throws IOException {
        if (!m() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        Y1(new aw2(Double.valueOf(d)));
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 Z(float f) throws IOException {
        if (!m() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        Y1(new aw2(Float.valueOf(f)));
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 c1(Number number) throws IOException {
        if (number == null) {
            return w();
        }
        if (!m()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        Y1(new aw2(number));
        return this;
    }

    @Override // com.p7700g.p99005.qx2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.G.isEmpty()) {
            this.G.add(F);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 d() throws IOException {
        rv2 rv2Var = new rv2();
        Y1(rv2Var);
        this.G.add(rv2Var);
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 d1(String str) throws IOException {
        if (str == null) {
            return w();
        }
        Y1(new aw2(str));
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 e() throws IOException {
        xv2 xv2Var = new xv2();
        Y1(xv2Var);
        this.G.add(xv2Var);
        return this;
    }

    @Override // com.p7700g.p99005.qx2, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 h() throws IOException {
        if (!this.G.isEmpty() && this.H == null) {
            if (T1() instanceof rv2) {
                List<uv2> list = this.G;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 j() throws IOException {
        if (!this.G.isEmpty() && this.H == null) {
            if (T1() instanceof xv2) {
                List<uv2> list = this.G;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 s(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.G.isEmpty() && this.H == null) {
            if (T1() instanceof xv2) {
                this.H = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 w() throws IOException {
        Y1(wv2.a);
        return this;
    }

    @Override // com.p7700g.p99005.qx2
    public qx2 x0(long j) throws IOException {
        Y1(new aw2(Long.valueOf(j)));
        return this;
    }
}