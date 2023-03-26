package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ht5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.xu0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.xbill.DNS.TTL;

/* compiled from: Http2Reader.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00033\u001e4B\u0017\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u0010+\u001a\u00020\u001c¢\u0006\u0004\b0\u00101J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\nJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\nJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\nJ/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\nJ/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\nJ/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\nJ/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/p7700g/p99005/lt5;", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/lt5$c;", "handler", "", "length", "flags", "streamId", "Lcom/p7700g/p99005/yq4;", "j", "(Lcom/p7700g/p99005/lt5$c;III)V", "padding", "", "Lcom/p7700g/p99005/gt5;", "h", "(IIII)Ljava/util/List;", "e", com.anythink.expressad.d.a.b.dH, "l", "(Lcom/p7700g/p99005/lt5$c;I)V", "r", "s", "q", "k", "f", com.ironsource.sdk.controller.v.a, "d", "(Lcom/p7700g/p99005/lt5$c;)V", "", "requireSettings", "b", "(ZLcom/p7700g/p99005/lt5$c;)Z", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/ht5$a;", "Lcom/p7700g/p99005/ht5$a;", "hpackReader", "Lcom/p7700g/p99005/lt5$b;", "u", "Lcom/p7700g/p99005/lt5$b;", "continuation", "x", "Z", m31.a, "Lcom/p7700g/p99005/uv5;", "w", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "<init>", "(Lcom/p7700g/p99005/uv5;Z)V", "t", "a", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class lt5 implements Closeable {
    @NotNull
    private static final Logger s;
    public static final a t = new a(null);
    private final b u;
    private final ht5.a v;
    private final uv5 w;
    private final boolean x;

    /* compiled from: Http2Reader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/p7700g/p99005/lt5$a", "", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final Logger a() {
            return lt5.s;
        }

        public final int b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(wo1.o("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Reader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015¨\u0006-"}, d2 = {"com/p7700g/p99005/lt5$b", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", "h", "()V", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", com.anythink.expressad.foundation.d.c.cd, "", "u", AFHydra.STATUS_IDLE, "f", "()I", "q", "(I)V", "streamId", "w", "e", com.anythink.expressad.d.a.b.dH, "padding", "Lcom/p7700g/p99005/uv5;", "x", "Lcom/p7700g/p99005/uv5;", rs2.f.b, com.ironsource.sdk.controller.v.a, "b", "k", "left", "s", "d", "l", "length", "t", "a", "j", "flags", "<init>", "(Lcom/p7700g/p99005/uv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b implements xw5 {
        private int s;
        private int t;
        private int u;
        private int v;
        private int w;
        private final uv5 x;

        public b(@NotNull uv5 uv5Var) {
            c25.p(uv5Var, rs2.f.b);
            this.x = uv5Var;
        }

        private final void h() throws IOException {
            int i = this.u;
            int R = sr5.R(this.x);
            this.v = R;
            this.s = R;
            int b = sr5.b(this.x.readByte(), 255);
            this.t = sr5.b(this.x.readByte(), 255);
            a aVar = lt5.t;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(it5.x.c(true, this.u, this.s, b, this.t));
            }
            int readInt = this.x.readInt() & Integer.MAX_VALUE;
            this.u = readInt;
            if (b == 9) {
                if (readInt != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(b + " != TYPE_CONTINUATION");
        }

        public final int a() {
            return this.t;
        }

        public final int b() {
            return this.v;
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int d() {
            return this.s;
        }

        public final int e() {
            return this.w;
        }

        public final int f() {
            return this.u;
        }

        public final void j(int i) {
            this.t = i;
        }

        public final void k(int i) {
            this.v = i;
        }

        public final void l(int i) {
            this.s = i;
        }

        public final void m(int i) {
            this.w = i;
        }

        public final void q(int i) {
            this.u = i;
        }

        @Override // com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, "sink");
            while (true) {
                int i = this.v;
                if (i == 0) {
                    this.x.skip(this.w);
                    this.w = 0;
                    if ((this.t & 4) != 0) {
                        return -1L;
                    }
                    h();
                } else {
                    long read = this.x.read(sv5Var, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.v -= (int) read;
                    return read;
                }
            }
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        public zw5 timeout() {
            return this.x.timeout();
        }
    }

    /* compiled from: Http2Reader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103J?\u0010:\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020'H&¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"com/p7700g/p99005/lt5$c", "", "", "inFinished", "", "streamId", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "length", "Lcom/p7700g/p99005/yq4;", "l", "(ZILcom/p7700g/p99005/uv5;I)V", "associatedStreamId", "", "Lcom/p7700g/p99005/gt5;", "headerBlock", "h", "(ZIILjava/util/List;)V", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, ij3.b, "(ILcom/p7700g/p99005/ft5;)V", "clearPrevious", "Lcom/p7700g/p99005/qt5;", "settings", "b", "(ZLcom/p7700g/p99005/qt5;)V", "a", "()V", "ack", "payload1", "payload2", com.anythink.expressad.d.a.b.dH, "(ZII)V", "lastGoodStreamId", "Lcom/p7700g/p99005/vv5;", "debugData", "q", "(ILcom/p7700g/p99005/ft5;Lcom/p7700g/p99005/vv5;)V", "", "windowSizeIncrement", "j", "(IJ)V", "streamDependency", "weight", "exclusive", "n", "(IIIZ)V", "promisedStreamId", "requestHeaders", "p", "(IILjava/util/List;)V", "", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, xu0.f.m, "host", "port", "maxAge", "k", "(ILjava/lang/String;Lcom/p7700g/p99005/vv5;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(boolean z, @NotNull qt5 qt5Var);

        void h(boolean z, int i, int i2, @NotNull List<gt5> list);

        void j(int i, long j);

        void k(int i, @NotNull String str, @NotNull vv5 vv5Var, @NotNull String str2, int i2, long j);

        void l(boolean z, int i, @NotNull uv5 uv5Var, int i2) throws IOException;

        void m(boolean z, int i, int i2);

        void n(int i, int i2, int i3, boolean z);

        void o(int i, @NotNull ft5 ft5Var);

        void p(int i, int i2, @NotNull List<gt5> list) throws IOException;

        void q(int i, @NotNull ft5 ft5Var, @NotNull vv5 vv5Var);
    }

    static {
        Logger logger = Logger.getLogger(it5.class.getName());
        c25.o(logger, "Logger.getLogger(Http2::class.java.name)");
        s = logger;
    }

    public lt5(@NotNull uv5 uv5Var, boolean z) {
        c25.p(uv5Var, rs2.f.b);
        this.w = uv5Var;
        this.x = z;
        b bVar = new b(uv5Var);
        this.u = bVar;
        this.v = new ht5.a(bVar, 4096, 0, 4, null);
    }

    private final void e(c cVar, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if (!((i2 & 32) != 0)) {
            int b2 = (i2 & 8) != 0 ? sr5.b(this.w.readByte(), 255) : 0;
            cVar.l(z, i3, this.w, t.b(i, i2, b2));
            this.w.skip(b2);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }

    private final void f(c cVar, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException(wo1.l("TYPE_GOAWAY length < 8: ", i));
        }
        if (i3 == 0) {
            int readInt = this.w.readInt();
            int readInt2 = this.w.readInt();
            int i4 = i - 8;
            ft5 a2 = ft5.H.a(readInt2);
            if (a2 != null) {
                vv5 vv5Var = vv5.t;
                if (i4 > 0) {
                    vv5Var = this.w.D(i4);
                }
                cVar.q(readInt, a2, vv5Var);
                return;
            }
            throw new IOException(wo1.l("TYPE_GOAWAY unexpected error code: ", readInt2));
        }
        throw new IOException("TYPE_GOAWAY streamId != 0");
    }

    private final List<gt5> h(int i, int i2, int i3, int i4) throws IOException {
        this.u.k(i);
        b bVar = this.u;
        bVar.l(bVar.b());
        this.u.m(i2);
        this.u.j(i3);
        this.u.q(i4);
        this.v.l();
        return this.v.e();
    }

    private final void j(c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            boolean z = (i2 & 1) != 0;
            int b2 = (i2 & 8) != 0 ? sr5.b(this.w.readByte(), 255) : 0;
            if ((i2 & 32) != 0) {
                l(cVar, i3);
                i -= 5;
            }
            cVar.h(z, i3, -1, h(t.b(i, i2, b2), b2, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void k(c cVar, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(wo1.l("TYPE_PING length != 8: ", i));
        }
        if (i3 == 0) {
            cVar.m((i2 & 1) != 0, this.w.readInt(), this.w.readInt());
            return;
        }
        throw new IOException("TYPE_PING streamId != 0");
    }

    private final void l(c cVar, int i) throws IOException {
        int readInt = this.w.readInt();
        cVar.n(i, readInt & Integer.MAX_VALUE, sr5.b(this.w.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    private final void m(c cVar, int i, int i2, int i3) throws IOException {
        if (i != 5) {
            throw new IOException(wo1.n("TYPE_PRIORITY length: ", i, " != 5"));
        }
        if (i3 != 0) {
            l(cVar, i3);
            return;
        }
        throw new IOException("TYPE_PRIORITY streamId == 0");
    }

    private final void q(c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int b2 = (i2 & 8) != 0 ? sr5.b(this.w.readByte(), 255) : 0;
            cVar.p(i3, this.w.readInt() & Integer.MAX_VALUE, h(t.b(i - 4, i2, b2), b2, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void r(c cVar, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException(wo1.n("TYPE_RST_STREAM length: ", i, " != 4"));
        }
        if (i3 != 0) {
            int readInt = this.w.readInt();
            ft5 a2 = ft5.H.a(readInt);
            if (a2 != null) {
                cVar.o(i3, a2);
                return;
            }
            throw new IOException(wo1.l("TYPE_RST_STREAM unexpected error code: ", readInt));
        }
        throw new IOException("TYPE_RST_STREAM streamId == 0");
    }

    private final void s(c cVar, int i, int i2, int i3) throws IOException {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            qt5 qt5Var = new qt5();
            a55 e1 = i55.e1(i55.z1(0, i), 6);
            int e = e1.e();
            int h = e1.h();
            int i4 = e1.i();
            if (i4 < 0 ? e >= h : e <= h) {
                while (true) {
                    int c2 = sr5.c(this.w.readShort(), 65535);
                    readInt = this.w.readInt();
                    if (c2 != 2) {
                        if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 4) {
                            c2 = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (c2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    qt5Var.k(c2, readInt);
                    if (e == h) {
                        break;
                    }
                    e += i4;
                }
                throw new IOException(wo1.l("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
            }
            cVar.b(false, qt5Var);
        } else {
            throw new IOException(wo1.l("TYPE_SETTINGS length % 6 != 0: ", i));
        }
    }

    private final void v(c cVar, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long d = sr5.d(this.w.readInt(), TTL.MAX_VALUE);
            if (d != 0) {
                cVar.j(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(wo1.l("TYPE_WINDOW_UPDATE length !=4: ", i));
    }

    public final boolean b(boolean z, @NotNull c cVar) throws IOException {
        c25.p(cVar, "handler");
        try {
            this.w.P1(9L);
            int R = sr5.R(this.w);
            if (R <= 16384) {
                int b2 = sr5.b(this.w.readByte(), 255);
                int b3 = sr5.b(this.w.readByte(), 255);
                int readInt = this.w.readInt() & Integer.MAX_VALUE;
                Logger logger = s;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(it5.x.c(true, readInt, R, b2, b3));
                }
                if (z && b2 != 4) {
                    StringBuilder G = wo1.G("Expected a SETTINGS frame but was ");
                    G.append(it5.x.b(b2));
                    throw new IOException(G.toString());
                }
                switch (b2) {
                    case 0:
                        e(cVar, R, b3, readInt);
                        return true;
                    case 1:
                        j(cVar, R, b3, readInt);
                        return true;
                    case 2:
                        m(cVar, R, b3, readInt);
                        return true;
                    case 3:
                        r(cVar, R, b3, readInt);
                        return true;
                    case 4:
                        s(cVar, R, b3, readInt);
                        return true;
                    case 5:
                        q(cVar, R, b3, readInt);
                        return true;
                    case 6:
                        k(cVar, R, b3, readInt);
                        return true;
                    case 7:
                        f(cVar, R, b3, readInt);
                        return true;
                    case 8:
                        v(cVar, R, b3, readInt);
                        return true;
                    default:
                        this.w.skip(R);
                        return true;
                }
            }
            throw new IOException(wo1.l("FRAME_SIZE_ERROR: ", R));
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.w.close();
    }

    public final void d(@NotNull c cVar) throws IOException {
        c25.p(cVar, "handler");
        if (this.x) {
            if (!b(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        uv5 uv5Var = this.w;
        vv5 vv5Var = it5.a;
        vv5 D = uv5Var.D(vv5Var.C3());
        Logger logger = s;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder G = wo1.G("<< CONNECTION ");
            G.append(D.H());
            logger.fine(sr5.v(G.toString(), new Object[0]));
        }
        if (!c25.g(vv5Var, D)) {
            StringBuilder G2 = wo1.G("Expected a connection header but was ");
            G2.append(D.p4());
            throw new IOException(G2.toString());
        }
    }
}