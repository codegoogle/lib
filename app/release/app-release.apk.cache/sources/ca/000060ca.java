package com.p7700g.p99005;

import com.p7700g.p99005.sv5;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: MessageDeflater.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/p7700g/p99005/uu5;", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/sv5;", "Lcom/p7700g/p99005/vv5;", "suffix", "", "b", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/vv5;)Z", "buffer", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/sv5;)V", com.anythink.expressad.foundation.d.c.cd, "()V", "s", "Lcom/p7700g/p99005/sv5;", "deflatedBytes", "Lcom/p7700g/p99005/yv5;", "u", "Lcom/p7700g/p99005/yv5;", "deflaterSink", "Ljava/util/zip/Deflater;", "t", "Ljava/util/zip/Deflater;", "deflater", com.ironsource.sdk.controller.v.a, "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class uu5 implements Closeable {
    private final sv5 s;
    private final Deflater t;
    private final yv5 u;
    private final boolean v;

    public uu5(boolean z) {
        this.v = z;
        sv5 sv5Var = new sv5();
        this.s = sv5Var;
        Deflater deflater = new Deflater(-1, true);
        this.t = deflater;
        this.u = new yv5((vw5) sv5Var, deflater);
    }

    private final boolean b(sv5 sv5Var, vv5 vv5Var) {
        return sv5Var.Q0(sv5Var.z2() - vv5Var.C3(), vv5Var);
    }

    public final void a(@NotNull sv5 sv5Var) throws IOException {
        vv5 vv5Var;
        c25.p(sv5Var, "buffer");
        if (this.s.z2() == 0) {
            if (this.v) {
                this.t.reset();
            }
            this.u.write(sv5Var, sv5Var.z2());
            this.u.flush();
            sv5 sv5Var2 = this.s;
            vv5Var = vu5.a;
            if (b(sv5Var2, vv5Var)) {
                long z2 = this.s.z2() - 4;
                sv5.a m2 = sv5.m2(this.s, null, 1, null);
                try {
                    m2.e(z2);
                    ux4.a(m2, null);
                } finally {
                }
            } else {
                this.s.g0(0);
            }
            sv5 sv5Var3 = this.s;
            sv5Var.write(sv5Var3, sv5Var3.z2());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.u.close();
    }
}