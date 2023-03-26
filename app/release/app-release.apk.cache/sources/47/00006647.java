package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;

/* compiled from: CipherSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0019\u0010'\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/p7700g/p99005/xv5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", "d", "()V", "e", "a", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "", "s", AFHydra.STATUS_IDLE, "blockSize", "t", "Lcom/p7700g/p99005/sv5;", "buffer", "Lcom/p7700g/p99005/uv5;", "w", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", com.ironsource.sdk.controller.v.a, "Z", "closed", "u", "final", "Ljavax/crypto/Cipher;", "x", "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lcom/p7700g/p99005/uv5;Ljavax/crypto/Cipher;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class xv5 implements xw5 {
    private final int s;
    private final sv5 t;
    private boolean u;
    private boolean v;
    private final uv5 w;
    @NotNull
    private final Cipher x;

    public xv5(@NotNull uv5 uv5Var, @NotNull Cipher cipher) {
        c25.p(uv5Var, rs2.f.b);
        c25.p(cipher, "cipher");
        this.w = uv5Var;
        this.x = cipher;
        int blockSize = cipher.getBlockSize();
        this.s = blockSize;
        this.t = new sv5();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void a() {
        int outputSize = this.x.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        sw5 D2 = this.t.D2(outputSize);
        int doFinal = this.x.doFinal(D2.d, D2.e);
        D2.f += doFinal;
        sv5 sv5Var = this.t;
        sv5Var.v2(sv5Var.z2() + doFinal);
        if (D2.e == D2.f) {
            this.t.s = D2.b();
            tw5.d(D2);
        }
    }

    private final void d() {
        while (this.t.z2() == 0) {
            if (this.w.f0()) {
                this.u = true;
                a();
                return;
            }
            e();
        }
    }

    private final void e() {
        sw5 sw5Var = this.w.o().s;
        c25.m(sw5Var);
        int i = sw5Var.f - sw5Var.e;
        int outputSize = this.x.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.s;
            if (i > i2) {
                i -= i2;
                outputSize = this.x.getOutputSize(i);
            } else {
                throw new IllegalStateException(wo1.o("Unexpected output size ", outputSize, " for input size ", i).toString());
            }
        }
        sw5 D2 = this.t.D2(outputSize);
        int update = this.x.update(sw5Var.d, sw5Var.e, i, D2.d, D2.e);
        this.w.skip(i);
        D2.f += update;
        sv5 sv5Var = this.t;
        sv5Var.v2(sv5Var.z2() + update);
        if (D2.e == D2.f) {
            this.t.s = D2.b();
            tw5.d(D2);
        }
    }

    @NotNull
    public final Cipher b() {
        return this.x;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.v = true;
        this.w.close();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.v) {
                if (i == 0) {
                    return 0L;
                }
                if (this.u) {
                    return this.t.read(sv5Var, j);
                }
                d();
                return this.t.read(sv5Var, j);
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.w.timeout();
    }
}