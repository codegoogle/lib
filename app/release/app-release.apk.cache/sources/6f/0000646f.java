package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;

/* compiled from: CipherSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/p7700g/p99005/wv5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "remaining", "", "d", "(Lcom/p7700g/p99005/sv5;J)I", "", "a", "()Ljava/lang/Throwable;", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "Ljavax/crypto/Cipher;", com.ironsource.sdk.controller.v.a, "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "cipher", "", "t", "Z", "closed", "Lcom/p7700g/p99005/tv5;", "u", "Lcom/p7700g/p99005/tv5;", "sink", "s", AFHydra.STATUS_IDLE, "blockSize", "<init>", "(Lcom/p7700g/p99005/tv5;Ljavax/crypto/Cipher;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class wv5 implements vw5 {
    private final int s;
    private boolean t;
    private final tv5 u;
    @NotNull
    private final Cipher v;

    public wv5(@NotNull tv5 tv5Var, @NotNull Cipher cipher) {
        c25.p(tv5Var, "sink");
        c25.p(cipher, "cipher");
        this.u = tv5Var;
        this.v = cipher;
        int blockSize = cipher.getBlockSize();
        this.s = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final Throwable a() {
        int outputSize = this.v.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        sv5 o = this.u.o();
        sw5 D2 = o.D2(outputSize);
        try {
            int doFinal = this.v.doFinal(D2.d, D2.f);
            D2.f += doFinal;
            o.v2(o.z2() + doFinal);
        } catch (Throwable th2) {
            th = th2;
        }
        if (D2.e == D2.f) {
            o.s = D2.b();
            tw5.d(D2);
        }
        return th;
    }

    private final int d(sv5 sv5Var, long j) {
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
        sv5 o = this.u.o();
        int outputSize = this.v.getOutputSize(min);
        while (outputSize > 8192) {
            int i = this.s;
            if (min > i) {
                min -= i;
                outputSize = this.v.getOutputSize(min);
            } else {
                throw new IllegalStateException(wo1.o("Unexpected output size ", outputSize, " for input size ", min).toString());
            }
        }
        sw5 D2 = o.D2(outputSize);
        int update = this.v.update(sw5Var.d, sw5Var.e, min, D2.d, D2.f);
        D2.f += update;
        o.v2(o.z2() + update);
        if (D2.e == D2.f) {
            o.s = D2.b();
            tw5.d(D2);
        }
        this.u.p0();
        sv5Var.v2(sv5Var.z2() - min);
        int i2 = sw5Var.e + min;
        sw5Var.e = i2;
        if (i2 == sw5Var.f) {
            sv5Var.s = sw5Var.b();
            tw5.d(sw5Var);
        }
        return min;
    }

    @NotNull
    public final Cipher b() {
        return this.v;
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.t) {
            return;
        }
        this.t = true;
        Throwable a = a();
        try {
            this.u.close();
        } catch (Throwable th) {
            if (a == null) {
                a = th;
            }
        }
        if (a != null) {
            throw a;
        }
    }

    @Override // com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
        this.u.flush();
    }

    @Override // com.p7700g.p99005.vw5
    @NotNull
    public zw5 timeout() {
        return this.u.timeout();
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        pv5.e(sv5Var.z2(), 0L, j);
        if (!(!this.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            j -= d(sv5Var, j);
        }
    }
}