package com.p7700g.p99005;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes3.dex */
public final class cx2 {
    private cx2() {
        throw new UnsupportedOperationException();
    }

    public static uv2 a(nx2 nx2Var) throws yv2 {
        boolean z;
        try {
            try {
                nx2Var.Y();
                z = false;
                try {
                    return TypeAdapters.V.read(nx2Var);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return wv2.a;
                    }
                    throw new ew2(e);
                }
            } catch (rx2 e2) {
                throw new ew2(e2);
            } catch (IOException e3) {
                throw new vv2(e3);
            } catch (NumberFormatException e4) {
                throw new ew2(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static void b(uv2 uv2Var, qx2 qx2Var) throws IOException {
        TypeAdapters.V.write(qx2Var, uv2Var);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    /* loaded from: classes3.dex */
    public static final class a extends Writer {
        private final Appendable s;
        private final C0156a t = new C0156a();

        /* compiled from: Streams.java */
        /* renamed from: com.p7700g.p99005.cx2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0156a implements CharSequence {
            public char[] s;

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.s[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.s.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.s, i, i2 - i);
            }
        }

        public a(Appendable appendable) {
            this.s = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C0156a c0156a = this.t;
            c0156a.s = cArr;
            this.s.append(c0156a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.s.append((char) i);
        }
    }
}