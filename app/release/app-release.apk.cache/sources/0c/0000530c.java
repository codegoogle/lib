package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ht5;
import com.p7700g.p99005.rs2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.TTL;

/* compiled from: Http2Writer.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 Q2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010>\u001a\u00020\u001c¢\u0006\u0004\bO\u0010PJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000eJ%\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J%\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\bJ-\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\nJ+\u0010:\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0019\u0010D\u001a\u00020?8\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010IR\u0016\u0010M\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010=¨\u0006R"}, d2 = {"Lcom/p7700g/p99005/nt5;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lcom/p7700g/p99005/yq4;", "w", "(IJ)V", "b", "()V", "Lcom/p7700g/p99005/qt5;", "peerSettings", "a", "(Lcom/p7700g/p99005/qt5;)V", "promisedStreamId", "", "Lcom/p7700g/p99005/gt5;", "requestHeaders", "q", "(IILjava/util/List;)V", "flush", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "r", "(ILcom/p7700g/p99005/ft5;)V", "l", "()I", "", "outFinished", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "d", "(ZILcom/p7700g/p99005/sv5;I)V", "flags", "buffer", "e", "(IILcom/p7700g/p99005/sv5;I)V", "settings", "s", "ack", "payload1", "payload2", com.anythink.expressad.d.a.b.dH, "(ZII)V", "lastGoodStreamId", "", "debugData", "j", "(ILcom/p7700g/p99005/ft5;[B)V", "windowSizeIncrement", com.ironsource.sdk.controller.v.a, "length", "type", "f", "(IIII)V", com.anythink.expressad.foundation.d.c.cd, "headerBlock", "k", "(ZILjava/util/List;)V", "z", "Z", m31.a, "Lcom/p7700g/p99005/ht5$b;", "x", "Lcom/p7700g/p99005/ht5$b;", "h", "()Lcom/p7700g/p99005/ht5$b;", "hpackWriter", "Lcom/p7700g/p99005/tv5;", "y", "Lcom/p7700g/p99005/tv5;", "sink", AFHydra.STATUS_IDLE, "maxFrameSize", "u", "Lcom/p7700g/p99005/sv5;", "hpackBuffer", "closed", "<init>", "(Lcom/p7700g/p99005/tv5;Z)V", "t", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class nt5 implements Closeable {
    private final sv5 u;
    private int v;
    private boolean w;
    @NotNull
    private final ht5.b x;
    private final tv5 y;
    private final boolean z;
    public static final a t = new a(null);
    private static final Logger s = Logger.getLogger(it5.class.getName());

    /* compiled from: Http2Writer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/p7700g/p99005/nt5$a", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nt5(@NotNull tv5 tv5Var, boolean z) {
        c25.p(tv5Var, "sink");
        this.y = tv5Var;
        this.z = z;
        sv5 sv5Var = new sv5();
        this.u = sv5Var;
        this.v = 16384;
        this.x = new ht5.b(0, false, sv5Var, 3, null);
    }

    private final void w(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min(this.v, j);
            j -= min;
            f(i, (int) min, 9, j == 0 ? 4 : 0);
            this.y.write(this.u, min);
        }
    }

    public final synchronized void a(@NotNull qt5 qt5Var) throws IOException {
        c25.p(qt5Var, "peerSettings");
        if (!this.w) {
            this.v = qt5Var.g(this.v);
            if (qt5Var.d() != -1) {
                this.x.e(qt5Var.d());
            }
            f(0, 0, 4, 1);
            this.y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b() throws IOException {
        if (!this.w) {
            if (this.z) {
                Logger logger = s;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(sr5.v(">> CONNECTION " + it5.a.H(), new Object[0]));
                }
                this.y.y1(it5.a);
                this.y.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.w = true;
        this.y.close();
    }

    public final synchronized void d(boolean z, int i, @Nullable sv5 sv5Var, int i2) throws IOException {
        if (!this.w) {
            e(i, z ? 1 : 0, sv5Var, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void e(int i, int i2, @Nullable sv5 sv5Var, int i3) throws IOException {
        f(i, i3, 0, i2);
        if (i3 > 0) {
            tv5 tv5Var = this.y;
            c25.m(sv5Var);
            tv5Var.write(sv5Var, i3);
        }
    }

    public final void f(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(it5.x.c(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.v)) {
            StringBuilder G = wo1.G("FRAME_SIZE_ERROR length > ");
            G.append(this.v);
            G.append(": ");
            G.append(i2);
            throw new IllegalArgumentException(G.toString().toString());
        }
        if ((((int) 2147483648L) & i) == 0) {
            sr5.k0(this.y, i2);
            this.y.g0(i3 & 255);
            this.y.g0(i4 & 255);
            this.y.S(i & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(wo1.l("reserved bit set: ", i).toString());
    }

    public final synchronized void flush() throws IOException {
        if (!this.w) {
            this.y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @NotNull
    public final ht5.b h() {
        return this.x;
    }

    public final synchronized void j(int i, @NotNull ft5 ft5Var, @NotNull byte[] bArr) throws IOException {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        c25.p(bArr, "debugData");
        if (!this.w) {
            if (ft5Var.f() != -1) {
                f(0, bArr.length + 8, 7, 0);
                this.y.S(i);
                this.y.S(ft5Var.f());
                if (!(bArr.length == 0)) {
                    this.y.w1(bArr);
                }
                this.y.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(boolean z, int i, @NotNull List<gt5> list) throws IOException {
        c25.p(list, "headerBlock");
        if (!this.w) {
            this.x.g(list);
            long z2 = this.u.z2();
            long min = Math.min(this.v, z2);
            int i2 = (z2 > min ? 1 : (z2 == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            f(i, (int) min, 1, i3);
            this.y.write(this.u, min);
            if (i2 > 0) {
                w(i, z2 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int l() {
        return this.v;
    }

    public final synchronized void m(boolean z, int i, int i2) throws IOException {
        if (!this.w) {
            f(0, 8, 6, z ? 1 : 0);
            this.y.S(i);
            this.y.S(i2);
            this.y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i, int i2, @NotNull List<gt5> list) throws IOException {
        c25.p(list, "requestHeaders");
        if (!this.w) {
            this.x.g(list);
            long z2 = this.u.z2();
            int min = (int) Math.min(this.v - 4, z2);
            int i3 = min + 4;
            long j = min;
            int i4 = (z2 > j ? 1 : (z2 == j ? 0 : -1));
            f(i, i3, 5, i4 == 0 ? 4 : 0);
            this.y.S(i2 & Integer.MAX_VALUE);
            this.y.write(this.u, j);
            if (i4 > 0) {
                w(i, z2 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(int i, @NotNull ft5 ft5Var) throws IOException {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        if (!this.w) {
            if (ft5Var.f() != -1) {
                f(i, 4, 3, 0);
                this.y.S(ft5Var.f());
                this.y.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s(@NotNull qt5 qt5Var) throws IOException {
        c25.p(qt5Var, "settings");
        if (!this.w) {
            int i = 0;
            f(0, qt5Var.l() * 6, 4, 0);
            while (i < 10) {
                if (qt5Var.i(i)) {
                    this.y.M(i != 4 ? i != 7 ? i : 4 : 3);
                    this.y.S(qt5Var.b(i));
                }
                i++;
            }
            this.y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void v(int i, long j) throws IOException {
        if (this.w) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= TTL.MAX_VALUE) {
            f(i, 4, 8, 0);
            this.y.S((int) j);
            this.y.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
    }
}