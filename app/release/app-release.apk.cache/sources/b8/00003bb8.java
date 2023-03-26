package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.sv5;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketReader.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*B/\u0012\u0006\u0010:\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\rR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\rR\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\rR\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\rR\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/p7700g/p99005/bv5;", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/yq4;", "e", "()V", "d", "h", "j", "f", "b", com.anythink.expressad.foundation.d.c.cd, "", "s", "Z", "closed", com.ironsource.sdk.controller.v.a, "isFinalFrame", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "perMessageDeflate", "", "u", "J", "frameLength", "Lcom/p7700g/p99005/sv5;", "y", "Lcom/p7700g/p99005/sv5;", "controlFrameBuffer", "Lcom/p7700g/p99005/wu5;", bx.B4, "Lcom/p7700g/p99005/wu5;", "messageInflater", "", AFHydra.EV_BYTECOUNT, "[B", "maskKey", "Lcom/p7700g/p99005/sv5$a;", "C", "Lcom/p7700g/p99005/sv5$a;", "maskCursor", "Lcom/p7700g/p99005/uv5;", "E", "Lcom/p7700g/p99005/uv5;", "a", "()Lcom/p7700g/p99005/uv5;", rs2.f.b, "z", "messageFrameBuffer", "H", "noContextTakeover", "", "t", AFHydra.STATUS_IDLE, "opcode", "w", "isControlFrame", "x", "readingCompressedMessage", "D", "isClient", "Lcom/p7700g/p99005/bv5$a;", "F", "Lcom/p7700g/p99005/bv5$a;", "frameCallback", "<init>", "(ZLcom/p7700g/p99005/uv5;Lcom/p7700g/p99005/bv5$a;ZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class bv5 implements Closeable {
    private wu5 A;
    private final byte[] B;
    private final sv5.a C;
    private final boolean D;
    @NotNull
    private final uv5 E;
    private final a F;
    private final boolean G;
    private final boolean H;
    private boolean s;
    private int t;
    private long u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final sv5 y;
    private final sv5 z;

    /* compiled from: WebSocketReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/bv5$a", "", "", "text", "Lcom/p7700g/p99005/yq4;", "d", "(Ljava/lang/String;)V", "Lcom/p7700g/p99005/vv5;", "bytes", "c", "(Lcom/p7700g/p99005/vv5;)V", "payload", "e", "h", "", "code", "reason", "i", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        void c(@NotNull vv5 vv5Var) throws IOException;

        void d(@NotNull String str) throws IOException;

        void e(@NotNull vv5 vv5Var);

        void h(@NotNull vv5 vv5Var);

        void i(int i, @NotNull String str);
    }

    public bv5(boolean z, @NotNull uv5 uv5Var, @NotNull a aVar, boolean z2, boolean z3) {
        c25.p(uv5Var, rs2.f.b);
        c25.p(aVar, "frameCallback");
        this.D = z;
        this.E = uv5Var;
        this.F = aVar;
        this.G = z2;
        this.H = z3;
        this.y = new sv5();
        this.z = new sv5();
        this.B = z ? null : new byte[4];
        this.C = z ? null : new sv5.a();
    }

    private final void d() throws IOException {
        String str;
        long j = this.u;
        if (j > 0) {
            this.E.l0(this.y, j);
            if (!this.D) {
                sv5 sv5Var = this.y;
                sv5.a aVar = this.C;
                c25.m(aVar);
                sv5Var.l2(aVar);
                this.C.f(0L);
                av5 av5Var = av5.w;
                sv5.a aVar2 = this.C;
                byte[] bArr = this.B;
                c25.m(bArr);
                av5Var.c(aVar2, bArr);
                this.C.close();
            }
        }
        switch (this.t) {
            case 8:
                short s = 1005;
                long z2 = this.y.z2();
                if (z2 != 1) {
                    if (z2 != 0) {
                        s = this.y.readShort();
                        str = this.y.u1();
                        String b = av5.w.b(s);
                        if (b != null) {
                            throw new ProtocolException(b);
                        }
                    } else {
                        str = "";
                    }
                    this.F.i(s, str);
                    this.s = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.F.e(this.y.f1());
                return;
            case 10:
                this.F.h(this.y.f1());
                return;
            default:
                StringBuilder G = wo1.G("Unknown control opcode: ");
                G.append(sr5.Y(this.t));
                throw new ProtocolException(G.toString());
        }
    }

    private final void e() throws IOException, ProtocolException {
        boolean z;
        if (!this.s) {
            long j = this.E.timeout().j();
            this.E.timeout().b();
            try {
                int b = sr5.b(this.E.readByte(), 255);
                this.E.timeout().i(j, TimeUnit.NANOSECONDS);
                int i = b & 15;
                this.t = i;
                boolean z2 = (b & 128) != 0;
                this.v = z2;
                boolean z3 = (b & 8) != 0;
                this.w = z3;
                if (z3 && !z2) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z4 = (b & 64) != 0;
                if (i == 1 || i == 2) {
                    if (!z4) {
                        z = false;
                    } else if (!this.G) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    } else {
                        z = true;
                    }
                    this.x = z;
                } else if (z4) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                if ((b & 32) != 0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if (!((b & 16) != 0)) {
                    int b2 = sr5.b(this.E.readByte(), 255);
                    boolean z5 = (b2 & 128) != 0;
                    if (z5 == this.D) {
                        throw new ProtocolException(this.D ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j2 = b2 & 127;
                    this.u = j2;
                    if (j2 == 126) {
                        this.u = sr5.c(this.E.readShort(), 65535);
                    } else if (j2 == 127) {
                        long readLong = this.E.readLong();
                        this.u = readLong;
                        if (readLong < 0) {
                            StringBuilder G = wo1.G("Frame length 0x");
                            G.append(sr5.Z(this.u));
                            G.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(G.toString());
                        }
                    }
                    if (this.w && this.u > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z5) {
                        uv5 uv5Var = this.E;
                        byte[] bArr = this.B;
                        c25.m(bArr);
                        uv5Var.readFully(bArr);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Unexpected rsv3 flag");
            } catch (Throwable th) {
                this.E.timeout().i(j, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void f() throws IOException {
        while (!this.s) {
            long j = this.u;
            if (j > 0) {
                this.E.l0(this.z, j);
                if (!this.D) {
                    sv5 sv5Var = this.z;
                    sv5.a aVar = this.C;
                    c25.m(aVar);
                    sv5Var.l2(aVar);
                    this.C.f(this.z.z2() - this.u);
                    av5 av5Var = av5.w;
                    sv5.a aVar2 = this.C;
                    byte[] bArr = this.B;
                    c25.m(bArr);
                    av5Var.c(aVar2, bArr);
                    this.C.close();
                }
            }
            if (this.v) {
                return;
            }
            j();
            if (this.t != 0) {
                StringBuilder G = wo1.G("Expected continuation opcode. Got: ");
                G.append(sr5.Y(this.t));
                throw new ProtocolException(G.toString());
            }
        }
        throw new IOException("closed");
    }

    private final void h() throws IOException {
        int i = this.t;
        if (i != 1 && i != 2) {
            StringBuilder G = wo1.G("Unknown opcode: ");
            G.append(sr5.Y(i));
            throw new ProtocolException(G.toString());
        }
        f();
        if (this.x) {
            wu5 wu5Var = this.A;
            if (wu5Var == null) {
                wu5Var = new wu5(this.H);
                this.A = wu5Var;
            }
            wu5Var.a(this.z);
        }
        if (i == 1) {
            this.F.d(this.z.u1());
        } else {
            this.F.c(this.z.f1());
        }
    }

    private final void j() throws IOException {
        while (!this.s) {
            e();
            if (!this.w) {
                return;
            }
            d();
        }
    }

    @NotNull
    public final uv5 a() {
        return this.E;
    }

    public final void b() throws IOException {
        e();
        if (this.w) {
            d();
        } else {
            h();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        wu5 wu5Var = this.A;
        if (wu5Var != null) {
            wu5Var.close();
        }
    }
}