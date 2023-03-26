package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmOkio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/p7700g/p99005/iw5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "s", "Ljava/io/InputStream;", "input", "t", "Lcom/p7700g/p99005/zw5;", "<init>", "(Ljava/io/InputStream;Lcom/p7700g/p99005/zw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class iw5 implements xw5 {
    private final InputStream s;
    private final zw5 t;

    public iw5(@NotNull InputStream inputStream, @NotNull zw5 zw5Var) {
        c25.p(inputStream, "input");
        c25.p(zw5Var, "timeout");
        this.s = inputStream;
        this.t = zw5Var;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s.close();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.t.h();
                sw5 D2 = sv5Var.D2(1);
                int read = this.s.read(D2.d, D2.f, (int) Math.min(j, 8192 - D2.f));
                if (read == -1) {
                    if (D2.e == D2.f) {
                        sv5Var.s = D2.b();
                        tw5.d(D2);
                        return -1L;
                    }
                    return -1L;
                }
                D2.f += read;
                long j2 = read;
                sv5Var.v2(sv5Var.z2() + j2);
                return j2;
            } catch (AssertionError e) {
                if (jw5.k(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.t;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("source(");
        G.append(this.s);
        G.append(')');
        return G.toString();
    }
}