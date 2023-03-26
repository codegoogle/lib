package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.io.Writer;

/* compiled from: LogWriter.java */
@i2({i2.a.u})
@Deprecated
/* loaded from: classes.dex */
public class bp extends Writer {
    private final String s;
    private StringBuilder t = new StringBuilder(128);

    public bp(String str) {
        this.s = str;
    }

    private void a() {
        if (this.t.length() > 0) {
            this.t.toString();
            StringBuilder sb = this.t;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.t.append(c);
            }
        }
    }
}