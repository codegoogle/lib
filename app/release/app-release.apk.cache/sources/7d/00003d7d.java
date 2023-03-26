package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.sv5;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketWriter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010=\u001a\u000208\u0012\u0006\u0010?\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b@\u0010AJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u0019\u0010=\u001a\u0002088\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u001a¨\u0006B"}, d2 = {"Lcom/p7700g/p99005/cv5;", "Ljava/io/Closeable;", "", "opcode", "Lcom/p7700g/p99005/vv5;", "payload", "Lcom/p7700g/p99005/yq4;", "e", "(ILcom/p7700g/p99005/vv5;)V", "h", "(Lcom/p7700g/p99005/vv5;)V", "j", "code", "reason", "d", "formatOpcode", "data", "f", com.anythink.expressad.foundation.d.c.cd, "()V", "", "w", "[B", "maskKey", "", "C", "Z", "noContextTakeover", "y", "isClient", "Lcom/p7700g/p99005/tv5;", "z", "Lcom/p7700g/p99005/tv5;", "b", "()Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/uu5;", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/uu5;", "messageDeflater", "Lcom/p7700g/p99005/sv5;", "t", "Lcom/p7700g/p99005/sv5;", "sinkBuffer", "", "D", "J", "minimumDeflateSize", "u", "writerClosed", "Lcom/p7700g/p99005/sv5$a;", "x", "Lcom/p7700g/p99005/sv5$a;", "maskCursor", "s", "messageBuffer", "Ljava/util/Random;", bx.B4, "Ljava/util/Random;", "a", "()Ljava/util/Random;", "random", AFHydra.EV_BYTECOUNT, "perMessageDeflate", "<init>", "(ZLcom/p7700g/p99005/tv5;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class cv5 implements Closeable {
    @NotNull
    private final Random A;
    private final boolean B;
    private final boolean C;
    private final long D;
    private final sv5 s;
    private final sv5 t;
    private boolean u;
    private uu5 v;
    private final byte[] w;
    private final sv5.a x;
    private final boolean y;
    @NotNull
    private final tv5 z;

    public cv5(boolean z, @NotNull tv5 tv5Var, @NotNull Random random, boolean z2, boolean z3, long j) {
        c25.p(tv5Var, "sink");
        c25.p(random, "random");
        this.y = z;
        this.z = tv5Var;
        this.A = random;
        this.B = z2;
        this.C = z3;
        this.D = j;
        this.s = new sv5();
        this.t = tv5Var.o();
        this.w = z ? new byte[4] : null;
        this.x = z ? new sv5.a() : null;
    }

    private final void e(int i, vv5 vv5Var) throws IOException {
        if (!this.u) {
            int C3 = vv5Var.C3();
            if (((long) C3) <= 125) {
                this.t.g0(i | 128);
                if (this.y) {
                    this.t.g0(C3 | 128);
                    Random random = this.A;
                    byte[] bArr = this.w;
                    c25.m(bArr);
                    random.nextBytes(bArr);
                    this.t.w1(this.w);
                    if (C3 > 0) {
                        long z2 = this.t.z2();
                        this.t.y1(vv5Var);
                        sv5 sv5Var = this.t;
                        sv5.a aVar = this.x;
                        c25.m(aVar);
                        sv5Var.l2(aVar);
                        this.x.f(z2);
                        av5.w.c(this.x, this.w);
                        this.x.close();
                    }
                } else {
                    this.t.g0(C3);
                    this.t.y1(vv5Var);
                }
                this.z.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @NotNull
    public final Random a() {
        return this.A;
    }

    @NotNull
    public final tv5 b() {
        return this.z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        uu5 uu5Var = this.v;
        if (uu5Var != null) {
            uu5Var.close();
        }
    }

    public final void d(int i, @Nullable vv5 vv5Var) throws IOException {
        vv5 vv5Var2 = vv5.t;
        if (i != 0 || vv5Var != null) {
            if (i != 0) {
                av5.w.d(i);
            }
            sv5 sv5Var = new sv5();
            sv5Var.M(i);
            if (vv5Var != null) {
                sv5Var.y1(vv5Var);
            }
            vv5Var2 = sv5Var.f1();
        }
        try {
            e(8, vv5Var2);
        } finally {
            this.u = true;
        }
    }

    public final void f(int i, @NotNull vv5 vv5Var) throws IOException {
        c25.p(vv5Var, "data");
        if (!this.u) {
            this.s.y1(vv5Var);
            int i2 = i | 128;
            if (this.B && vv5Var.C3() >= this.D) {
                uu5 uu5Var = this.v;
                if (uu5Var == null) {
                    uu5Var = new uu5(this.C);
                    this.v = uu5Var;
                }
                uu5Var.a(this.s);
                i2 |= 64;
            }
            long z2 = this.s.z2();
            this.t.g0(i2);
            int i3 = this.y ? 128 : 0;
            if (z2 <= 125) {
                this.t.g0(((int) z2) | i3);
            } else if (z2 <= av5.s) {
                this.t.g0(i3 | 126);
                this.t.M((int) z2);
            } else {
                this.t.g0(i3 | 127);
                this.t.O1(z2);
            }
            if (this.y) {
                Random random = this.A;
                byte[] bArr = this.w;
                c25.m(bArr);
                random.nextBytes(bArr);
                this.t.w1(this.w);
                if (z2 > 0) {
                    sv5 sv5Var = this.s;
                    sv5.a aVar = this.x;
                    c25.m(aVar);
                    sv5Var.l2(aVar);
                    this.x.f(0L);
                    av5.w.c(this.x, this.w);
                    this.x.close();
                }
            }
            this.t.write(this.s, z2);
            this.z.L();
            return;
        }
        throw new IOException("closed");
    }

    public final void h(@NotNull vv5 vv5Var) throws IOException {
        c25.p(vv5Var, "payload");
        e(9, vv5Var);
    }

    public final void j(@NotNull vv5 vv5Var) throws IOException {
        c25.p(vv5Var, "payload");
        e(10, vv5Var);
    }
}