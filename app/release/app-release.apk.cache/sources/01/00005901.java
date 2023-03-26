package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* compiled from: RealBufferedSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010R\u001a\u00020O¢\u0006\u0004\b[\u0010\\J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020)H\u0016¢\u0006\u0004\b\t\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010\u001dJ\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\u001dJ\u0017\u00104\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u001dJ\u0017\u00106\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010\u001dJ\u0017\u00107\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u001dJ\u0017\u00109\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010:J\u0017\u0010=\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010:J\u000f\u0010>\u001a\u00020\u0001H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0001H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010EJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020O8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010SR\u001d\u0010W\u001a\u00020\u00028Ö\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bV\u0010E\u001a\u0004\bU\u0010\u0004R\u0016\u0010Z\u001a\u00020F8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lcom/p7700g/p99005/qw5;", "Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/sv5;", "n", "()Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vv5;", "byteString", "y1", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/tv5;", "", "offset", "Q", "(Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/tv5;", "", "string", "K0", "(Ljava/lang/String;)Lcom/p7700g/p99005/tv5;", "beginIndex", "endIndex", "a1", "(Ljava/lang/String;II)Lcom/p7700g/p99005/tv5;", "codePoint", "O", "(I)Lcom/p7700g/p99005/tv5;", "Ljava/nio/charset/Charset;", "charset", "g1", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/p7700g/p99005/tv5;", "M1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/p7700g/p99005/tv5;", "", "w1", "([B)Lcom/p7700g/p99005/tv5;", "V0", "([BII)Lcom/p7700g/p99005/tv5;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lcom/p7700g/p99005/xw5;", "b1", "(Lcom/p7700g/p99005/xw5;)J", "j1", "(Lcom/p7700g/p99005/xw5;J)Lcom/p7700g/p99005/tv5;", "b", "g0", "s", "M", "G0", "i", "S", "e0", com.ironsource.sdk.controller.v.a, "O1", "(J)Lcom/p7700g/p99005/tv5;", bx.C4, "Q1", "e1", "p0", "()Lcom/p7700g/p99005/tv5;", "L", "Ljava/io/OutputStream;", "S1", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "toString", "()Ljava/lang/String;", "Lcom/p7700g/p99005/vw5;", "u", "Lcom/p7700g/p99005/vw5;", "sink", "Lcom/p7700g/p99005/sv5;", "bufferField", ij3.b, "getBuffer$annotations", "buffer", "t", "Z", "closed", "<init>", "(Lcom/p7700g/p99005/vw5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class qw5 implements tv5 {
    @cz4
    @NotNull
    public final sv5 s;
    @cz4
    public boolean t;
    @cz4
    @NotNull
    public final vw5 u;

    public qw5(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        this.u = vw5Var;
        this.s = new sv5();
    }

    public static /* synthetic */ void a() {
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 G0(int i) {
        if (!this.t) {
            this.s.G0(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 K0(@NotNull String str) {
        c25.p(str, "string");
        if (!this.t) {
            this.s.K0(str);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 L() {
        if (!this.t) {
            long z2 = this.s.z2();
            if (z2 > 0) {
                this.u.write(this.s, z2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 M(int i) {
        if (!this.t) {
            this.s.M(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 M1(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        c25.p(str, "string");
        c25.p(charset, "charset");
        if (!this.t) {
            this.s.M1(str, i, i2, charset);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 O(int i) {
        if (!this.t) {
            this.s.O(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 O1(long j) {
        if (!this.t) {
            this.s.O1(j);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 Q(@NotNull vv5 vv5Var, int i, int i2) {
        c25.p(vv5Var, "byteString");
        if (!this.t) {
            this.s.Q(vv5Var, i, i2);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 Q1(long j) {
        if (!this.t) {
            this.s.Q1(j);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 S(int i) {
        if (!this.t) {
            this.s.S(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public OutputStream S1() {
        return new a();
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 V(long j) {
        if (!this.t) {
            this.s.V(j);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 V0(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, rs2.f.b);
        if (!this.t) {
            this.s.V0(bArr, i, i2);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 a1(@NotNull String str, int i, int i2) {
        c25.p(str, "string");
        if (!this.t) {
            this.s.a1(str, i, i2);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    public long b1(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        long j = 0;
        while (true) {
            long read = xw5Var.read(this.s, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            p0();
        }
    }

    @Override // com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.t) {
            return;
        }
        Throwable th = null;
        try {
            if (this.s.z2() > 0) {
                vw5 vw5Var = this.u;
                sv5 sv5Var = this.s;
                vw5Var.write(sv5Var, sv5Var.z2());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.u.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.t = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 e0(int i) {
        if (!this.t) {
            this.s.e0(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 e1(long j) {
        if (!this.t) {
            this.s.e1(j);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5, com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
        if (!this.t) {
            if (this.s.z2() > 0) {
                vw5 vw5Var = this.u;
                sv5 sv5Var = this.s;
                vw5Var.write(sv5Var, sv5Var.z2());
            }
            this.u.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 g0(int i) {
        if (!this.t) {
            this.s.g0(i);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 g1(@NotNull String str, @NotNull Charset charset) {
        c25.p(str, "string");
        c25.p(charset, "charset");
        if (!this.t) {
            this.s.g1(str, charset);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.t;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 j1(@NotNull xw5 xw5Var, long j) {
        c25.p(xw5Var, rs2.f.b);
        while (j > 0) {
            long read = xw5Var.read(this.s, j);
            if (read != -1) {
                j -= read;
                p0();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public sv5 n() {
        return this.s;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public sv5 o() {
        return this.s;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 p0() {
        if (!this.t) {
            long f = this.s.f();
            if (f > 0) {
                this.u.write(this.s, f);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.vw5
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

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 w1(@NotNull byte[] bArr) {
        c25.p(bArr, rs2.f.b);
        if (!this.t) {
            this.s.w1(bArr);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) {
        c25.p(byteBuffer, rs2.f.b);
        if (!this.t) {
            int write = this.s.write(byteBuffer);
            p0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public tv5 y1(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "byteString");
        if (!this.t) {
            this.s.y1(vv5Var);
            return p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* compiled from: RealBufferedSink.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/qw5$a", "Ljava/io/OutputStream;", "", "b", "Lcom/p7700g/p99005/yq4;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            qw5.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            qw5 qw5Var = qw5.this;
            if (qw5Var.t) {
                return;
            }
            qw5Var.flush();
        }

        @NotNull
        public String toString() {
            return qw5.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            qw5 qw5Var = qw5.this;
            if (!qw5Var.t) {
                qw5Var.s.g0((byte) i);
                qw5.this.p0();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "data");
            qw5 qw5Var = qw5.this;
            if (!qw5Var.t) {
                qw5Var.s.V0(bArr, i, i2);
                qw5.this.p0();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, rs2.f.b);
        if (!this.t) {
            this.s.write(sv5Var, j);
            p0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}