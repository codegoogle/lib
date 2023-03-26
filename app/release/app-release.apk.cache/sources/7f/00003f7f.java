package com.p7700g.p99005;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: JsonStreamParser.java */
/* loaded from: classes3.dex */
public final class dw2 implements Iterator<uv2> {
    private final nx2 s;
    private final Object t;

    public dw2(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public uv2 next() throws yv2 {
        if (hasNext()) {
            try {
                return cx2.a(this.s);
            } catch (yv2 e) {
                if (e.getCause() instanceof EOFException) {
                    throw new NoSuchElementException();
                }
                throw e;
            } catch (OutOfMemoryError e2) {
                throw new yv2("Failed parsing JSON source to Json", e2);
            } catch (StackOverflowError e3) {
                throw new yv2("Failed parsing JSON source to Json", e3);
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.t) {
            try {
                try {
                    try {
                        z = this.s.Y() != px2.END_DOCUMENT;
                    } catch (rx2 e) {
                        throw new ew2(e);
                    }
                } catch (IOException e2) {
                    throw new vv2(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public dw2(Reader reader) {
        nx2 nx2Var = new nx2(reader);
        this.s = nx2Var;
        nx2Var.d1(true);
        this.t = new Object();
    }
}