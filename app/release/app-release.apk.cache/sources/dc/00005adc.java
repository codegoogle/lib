package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealBufferedSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010x\u001a\u00020u¢\u0006\u0004\b|\u0010}J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\b\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J'\u0010\b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\b\u0010(J\u0017\u0010\b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020)H\u0016¢\u0006\u0004\b\b\u0010*J\u001f\u0010+\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002002\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b9\u0010:J\u0011\u0010;\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b;\u00102J\u000f\u0010<\u001a\u000200H\u0016¢\u0006\u0004\b<\u00102J\u0017\u0010>\u001a\u0002002\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u00104J\u000f\u0010?\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020AH\u0016¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\u001cH\u0016¢\u0006\u0004\bE\u0010@J\u000f\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bF\u0010@J\u000f\u0010G\u001a\u00020\u0006H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010HJ\u0017\u0010L\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\u000fJ\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010RJ'\u0010T\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00062\u0006\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0015H\u0016¢\u0006\u0004\bW\u0010XJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\\\u0010XJ\u001f\u0010]\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010ZJ\u001f\u0010^\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0015H\u0016¢\u0006\u0004\b^\u0010_J/\u0010a\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u0001H\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\nH\u0016¢\u0006\u0004\bh\u0010\fJ\u000f\u0010i\u001a\u00020\rH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u000200H\u0016¢\u0006\u0004\bn\u00102R\u001d\u0010q\u001a\u00020\u00028Ö\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bp\u0010j\u001a\u0004\bo\u0010\u0004R\u0016\u0010t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006~"}, d2 = {"Lcom/p7700g/p99005/rw5;", "Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/sv5;", "n", "()Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "", "f0", "()Z", "Lcom/p7700g/p99005/yq4;", "P1", "(J)V", "i1", "(J)Z", "", "readByte", "()B", "Lcom/p7700g/p99005/vv5;", "f1", "()Lcom/p7700g/p99005/vv5;", "D", "(J)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/mw5;", "options", "", "X1", "(Lcom/p7700g/p99005/mw5;)I", "", "b0", "()[B", "r1", "(J)[B", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "l0", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vw5;", "F1", "(Lcom/p7700g/p99005/vw5;)J", "", "u1", "()Ljava/lang/String;", com.anythink.basead.d.g.i, "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "R0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "x1", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "o0", "m1", "limit", "t0", "Y0", "()I", "", "readShort", "()S", "z1", "readInt", "o1", "readLong", "()J", AFHydra.STATUS_CONNECTED, "q0", "V1", "skip", "b", "U1", "(B)J", "fromIndex", "k0", "(BJ)J", "toIndex", "m0", "(BJJ)J", "bytes", "d0", "(Lcom/p7700g/p99005/vv5;)J", "i", "(Lcom/p7700g/p99005/vv5;J)J", "targetBytes", "n0", "N1", "Q0", "(JLcom/p7700g/p99005/vv5;)Z", "bytesOffset", "p1", "(JLcom/p7700g/p99005/vv5;II)Z", "p", "()Lcom/p7700g/p99005/uv5;", "Ljava/io/InputStream;", "W1", "()Ljava/io/InputStream;", "isOpen", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "toString", ij3.b, "getBuffer$annotations", "buffer", "t", "Z", "closed", "Lcom/p7700g/p99005/xw5;", "u", "Lcom/p7700g/p99005/xw5;", rs2.f.b, "s", "Lcom/p7700g/p99005/sv5;", "bufferField", "<init>", "(Lcom/p7700g/p99005/xw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class rw5 implements uv5 {
    @cz4
    @NotNull
    public final sv5 s;
    @cz4
    public boolean t;
    @cz4
    @NotNull
    public final xw5 u;

    public rw5(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        this.u = xw5Var;
        this.s = new sv5();
    }

    public static /* synthetic */ void a() {
    }

    @Override // com.p7700g.p99005.uv5
    public long C1() {
        P1(8L);
        return this.s.C1();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public vv5 D(long j) {
        P1(j);
        return this.s.D(j);
    }

    @Override // com.p7700g.p99005.uv5
    public long F1(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        long j = 0;
        while (this.u.read(this.s, 8192) != -1) {
            long f = this.s.f();
            if (f > 0) {
                j += f;
                vw5Var.write(this.s, f);
            }
        }
        if (this.s.z2() > 0) {
            long z2 = j + this.s.z2();
            sv5 sv5Var = this.s;
            vw5Var.write(sv5Var, sv5Var.z2());
            return z2;
        }
        return j;
    }

    @Override // com.p7700g.p99005.uv5
    public long N1(@NotNull vv5 vv5Var, long j) {
        c25.p(vv5Var, "targetBytes");
        if (!(!this.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long N1 = this.s.N1(vv5Var, j);
            if (N1 != -1) {
                return N1;
            }
            long z2 = this.s.z2();
            if (this.u.read(this.s, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, z2);
        }
    }

    @Override // com.p7700g.p99005.uv5
    public void P1(long j) {
        if (!i1(j)) {
            throw new EOFException();
        }
    }

    @Override // com.p7700g.p99005.uv5
    public boolean Q0(long j, @NotNull vv5 vv5Var) {
        c25.p(vv5Var, "bytes");
        return p1(j, vv5Var, 0, vv5Var.C3());
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String R0(@NotNull Charset charset) {
        c25.p(charset, "charset");
        this.s.b1(this.u);
        return this.s.R0(charset);
    }

    @Override // com.p7700g.p99005.uv5
    public long U1(byte b) {
        return m0(b, 0L, Long.MAX_VALUE);
    }

    @Override // com.p7700g.p99005.uv5
    public long V1() {
        byte d2;
        P1(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!i1(i2)) {
                break;
            }
            d2 = this.s.d2(i);
            if ((d2 < ((byte) 48) || d2 > ((byte) 57)) && ((d2 < ((byte) 97) || d2 > ((byte) 102)) && (d2 < ((byte) 65) || d2 > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder G = wo1.G("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(d2, d85.a(d85.a(16)));
            c25.o(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            G.append(num);
            throw new NumberFormatException(G.toString());
        }
        return this.s.V1();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public InputStream W1() {
        return new a();
    }

    @Override // com.p7700g.p99005.uv5
    public int X1(@NotNull mw5 mw5Var) {
        c25.p(mw5Var, "options");
        if (!this.t) {
            while (true) {
                int k0 = bx5.k0(this.s, mw5Var, true);
                if (k0 == -2) {
                    if (this.u.read(this.s, 8192) == -1) {
                        break;
                    }
                } else if (k0 != -1) {
                    this.s.skip(mw5Var.d()[k0].C3());
                    return k0;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.uv5
    public int Y0() {
        P1(1L);
        byte d2 = this.s.d2(0L);
        if ((d2 & 224) == 192) {
            P1(2L);
        } else if ((d2 & 240) == 224) {
            P1(3L);
        } else if ((d2 & 248) == 240) {
            P1(4L);
        }
        return this.s.Y0();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public byte[] b0() {
        this.s.b1(this.u);
        return this.s.b0();
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.u.close();
        this.s.d();
    }

    @Override // com.p7700g.p99005.uv5
    public long d0(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "bytes");
        return i(vv5Var, 0L);
    }

    @Override // com.p7700g.p99005.uv5
    public boolean f0() {
        if (!this.t) {
            return this.s.f0() && this.u.read(this.s, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public vv5 f1() {
        this.s.b1(this.u);
        return this.s.f1();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String g(long j) {
        P1(j);
        return this.s.g(j);
    }

    @Override // com.p7700g.p99005.uv5
    public long i(@NotNull vv5 vv5Var, long j) {
        c25.p(vv5Var, "bytes");
        if (!(!this.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long i = this.s.i(vv5Var, j);
            if (i != -1) {
                return i;
            }
            long z2 = this.s.z2();
            if (this.u.read(this.s, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, (z2 - vv5Var.C3()) + 1);
        }
    }

    @Override // com.p7700g.p99005.uv5
    public boolean i1(long j) {
        if (j >= 0) {
            if (!this.t) {
                while (this.s.z2() < j) {
                    if (this.u.read(this.s, 8192) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.t;
    }

    @Override // com.p7700g.p99005.uv5
    public long k0(byte b, long j) {
        return m0(b, j, Long.MAX_VALUE);
    }

    @Override // com.p7700g.p99005.uv5
    public void l0(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "sink");
        try {
            P1(j);
            this.s.l0(sv5Var, j);
        } catch (EOFException e) {
            sv5Var.b1(this.s);
            throw e;
        }
    }

    @Override // com.p7700g.p99005.uv5
    public long m0(byte b, long j, long j2) {
        boolean z = true;
        if (!this.t) {
            if (!((0 > j || j2 < j) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
            }
            while (j < j2) {
                long m0 = this.s.m0(b, j, j2);
                if (m0 != -1) {
                    return m0;
                }
                long z2 = this.s.z2();
                if (z2 >= j2 || this.u.read(this.s, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, z2);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String m1() {
        return t0(Long.MAX_VALUE);
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public sv5 n() {
        return this.s;
    }

    @Override // com.p7700g.p99005.uv5
    public long n0(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "targetBytes");
        return N1(vv5Var, 0L);
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public sv5 o() {
        return this.s;
    }

    @Override // com.p7700g.p99005.uv5
    @Nullable
    public String o0() {
        long U1 = U1((byte) 10);
        if (U1 == -1) {
            if (this.s.z2() != 0) {
                return g(this.s.z2());
            }
            return null;
        }
        return bx5.i0(this.s, U1);
    }

    @Override // com.p7700g.p99005.uv5
    public int o1() {
        P1(4L);
        return this.s.o1();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public uv5 p() {
        return jw5.d(new ow5(this));
    }

    @Override // com.p7700g.p99005.uv5
    public boolean p1(long j, @NotNull vv5 vv5Var, int i, int i2) {
        int i3;
        c25.p(vv5Var, "bytes");
        if (!this.t) {
            if (j >= 0 && i >= 0 && i2 >= 0 && vv5Var.C3() - i >= i2) {
                while (i3 < i2) {
                    long j2 = i3 + j;
                    i3 = (i1(1 + j2) && this.s.d2(j2) == vv5Var.A(i + i3)) ? i3 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = com.p7700g.p99005.wo1.G("Expected leading [0-9] or '-' character but was 0x");
        r2 = java.lang.Integer.toString(r8, com.p7700g.p99005.d85.a(com.p7700g.p99005.d85.a(16)));
        com.p7700g.p99005.c25.o(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // com.p7700g.p99005.uv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long q0() {
        P1(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!i1(j2)) {
                break;
            }
            byte d2 = this.s.d2(j);
            if ((d2 < ((byte) 48) || d2 > ((byte) 57)) && !(j == 0 && d2 == ((byte) 45))) {
                break;
            }
            j = j2;
        }
        return this.s.q0();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public byte[] r1(long j) {
        P1(j);
        return this.s.r1(j);
    }

    @Override // com.p7700g.p99005.uv5
    public int read(@NotNull byte[] bArr) {
        c25.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // com.p7700g.p99005.uv5
    public byte readByte() {
        P1(1L);
        return this.s.readByte();
    }

    @Override // com.p7700g.p99005.uv5
    public void readFully(@NotNull byte[] bArr) {
        c25.p(bArr, "sink");
        try {
            P1(bArr.length);
            this.s.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.s.z2() > 0) {
                sv5 sv5Var = this.s;
                int read = sv5Var.read(bArr, i, (int) sv5Var.z2());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // com.p7700g.p99005.uv5
    public int readInt() {
        P1(4L);
        return this.s.readInt();
    }

    @Override // com.p7700g.p99005.uv5
    public long readLong() {
        P1(8L);
        return this.s.readLong();
    }

    @Override // com.p7700g.p99005.uv5
    public short readShort() {
        P1(2L);
        return this.s.readShort();
    }

    @Override // com.p7700g.p99005.uv5
    public void skip(long j) {
        if (!(!this.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.s.z2() == 0 && this.u.read(this.s, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.s.z2());
            this.s.skip(min);
            j -= min;
        }
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String t0(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long m0 = m0(b, 0L, j2);
            if (m0 != -1) {
                return bx5.i0(this.s, m0);
            }
            if (j2 < Long.MAX_VALUE && i1(j2) && this.s.d2(j2 - 1) == ((byte) 13) && i1(1 + j2) && this.s.d2(j2) == b) {
                return bx5.i0(this.s, j2);
            }
            sv5 sv5Var = new sv5();
            sv5 sv5Var2 = this.s;
            sv5Var2.X(sv5Var, 0L, Math.min(32, sv5Var2.z2()));
            StringBuilder G = wo1.G("\\n not found: limit=");
            G.append(Math.min(this.s.z2(), j));
            G.append(" content=");
            G.append(sv5Var.f1().H());
            G.append("…");
            throw new EOFException(G.toString());
        }
        throw new IllegalArgumentException(wo1.p("limit < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.u.timeout();
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("buffer(");
        G.append(this.u);
        G.append(')');
        return G.toString();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String u1() {
        this.s.b1(this.u);
        return this.s.u1();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String x1(long j, @NotNull Charset charset) {
        c25.p(charset, "charset");
        P1(j);
        return this.s.x1(j, charset);
    }

    @Override // com.p7700g.p99005.uv5
    public short z1() {
        P1(2L);
        return this.s.z1();
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "sink");
        if (j >= 0) {
            if (!this.t) {
                if (this.s.z2() == 0 && this.u.read(this.s, 8192) == -1) {
                    return -1L;
                }
                return this.s.read(sv5Var, Math.min(j, this.s.z2()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    /* compiled from: RealBufferedSource.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/rw5$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            rw5 rw5Var = rw5.this;
            if (!rw5Var.t) {
                return (int) Math.min(rw5Var.s.z2(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            rw5.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            rw5 rw5Var = rw5.this;
            if (!rw5Var.t) {
                if (rw5Var.s.z2() == 0) {
                    rw5 rw5Var2 = rw5.this;
                    if (rw5Var2.u.read(rw5Var2.s, 8192) == -1) {
                        return -1;
                    }
                }
                return rw5.this.s.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @NotNull
        public String toString() {
            return rw5.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "data");
            if (!rw5.this.t) {
                pv5.e(bArr.length, i, i2);
                if (rw5.this.s.z2() == 0) {
                    rw5 rw5Var = rw5.this;
                    if (rw5Var.u.read(rw5Var.s, 8192) == -1) {
                        return -1;
                    }
                }
                return rw5.this.s.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.p7700g.p99005.uv5
    public int read(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, "sink");
        long j = i2;
        pv5.e(bArr.length, i, j);
        if (this.s.z2() == 0 && this.u.read(this.s, 8192) == -1) {
            return -1;
        }
        return this.s.read(bArr, i, (int) Math.min(j, this.s.z2()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
        c25.p(byteBuffer, "sink");
        if (this.s.z2() == 0 && this.u.read(this.s, 8192) == -1) {
            return -1;
        }
        return this.s.read(byteBuffer);
    }
}