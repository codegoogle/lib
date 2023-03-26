package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.vv5;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Relay.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 @2\u00020\u0001:\u0002G\fB5\b\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010=\u0012\b\u0010<\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0019\u0010-\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00103\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010/\u001a\u0004\b0\u00101\"\u0004\b%\u00102R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u000bR\u0019\u00108\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b7\u0010,R$\u0010<\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\b)\u0010\u0011\"\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\b\u0012\u0010BR\u0013\u0010D\u001a\u00020.8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u00101¨\u0006H"}, d2 = {"Lcom/p7700g/p99005/bs5;", "", "Lcom/p7700g/p99005/vv5;", "prefix", "", "upstreamSize", "metadataSize", "Lcom/p7700g/p99005/yq4;", "u", "(Lcom/p7700g/p99005/vv5;JJ)V", com.ironsource.sdk.controller.v.a, "(J)V", "b", com.anythink.expressad.d.a.b.dH, "()Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/xw5;", "n", "()Lcom/p7700g/p99005/xw5;", "p", "J", "d", "()J", "bufferMaxSize", "Ljava/lang/Thread;", com.anythink.basead.d.g.i, "Ljava/lang/Thread;", "k", "()Ljava/lang/Thread;", "t", "(Ljava/lang/Thread;)V", "upstreamReader", "", AFHydra.STATUS_IDLE, "()I", "q", "(I)V", "sourceCount", ij3.b, "Lcom/p7700g/p99005/vv5;", "metadata", "Lcom/p7700g/p99005/sv5;", "h", "Lcom/p7700g/p99005/sv5;", "i", "()Lcom/p7700g/p99005/sv5;", "upstreamBuffer", "", "Z", "e", "()Z", "(Z)V", com.anythink.expressad.foundation.d.c.bV, "j", "s", "upstreamPos", "c", "buffer", "Lcom/p7700g/p99005/xw5;", "r", "(Lcom/p7700g/p99005/xw5;)V", "upstream", "Ljava/io/RandomAccessFile;", "l", "Ljava/io/RandomAccessFile;", "f", "()Ljava/io/RandomAccessFile;", "(Ljava/io/RandomAccessFile;)V", o31.b, "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lcom/p7700g/p99005/xw5;JLcom/p7700g/p99005/vv5;J)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class bs5 {
    private static final int a = 1;
    private static final int b = 2;
    @cz4
    @NotNull
    public static final vv5 c;
    @cz4
    @NotNull
    public static final vv5 d;
    private static final long e = 32;
    public static final a f = new a(null);
    @Nullable
    private Thread g;
    @NotNull
    private final sv5 h;
    private boolean i;
    @NotNull
    private final sv5 j;
    private int k;
    @Nullable
    private RandomAccessFile l;
    @Nullable
    private xw5 m;
    private long n;
    private final vv5 o;
    private final long p;

    /* compiled from: Relay.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"com/p7700g/p99005/bs5$a", "", "Ljava/io/File;", o31.b, "Lcom/p7700g/p99005/xw5;", "upstream", "Lcom/p7700g/p99005/vv5;", "metadata", "", "bufferMaxSize", "Lcom/p7700g/p99005/bs5;", "a", "(Ljava/io/File;Lcom/p7700g/p99005/xw5;Lcom/p7700g/p99005/vv5;J)Lcom/p7700g/p99005/bs5;", "b", "(Ljava/io/File;)Lcom/p7700g/p99005/bs5;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lcom/p7700g/p99005/vv5;", "PREFIX_DIRTY", "", "SOURCE_FILE", AFHydra.STATUS_IDLE, "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final bs5 a(@NotNull File file, @NotNull xw5 xw5Var, @NotNull vv5 vv5Var, long j) throws IOException {
            c25.p(file, o31.b);
            c25.p(xw5Var, "upstream");
            c25.p(vv5Var, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            bs5 bs5Var = new bs5(randomAccessFile, xw5Var, 0L, vv5Var, j, null);
            randomAccessFile.setLength(0L);
            bs5Var.u(bs5.d, -1L, -1L);
            return bs5Var;
        }

        @NotNull
        public final bs5 b(@NotNull File file) throws IOException {
            c25.p(file, o31.b);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            c25.o(channel, "randomAccessFile.channel");
            as5 as5Var = new as5(channel);
            sv5 sv5Var = new sv5();
            as5Var.a(0L, sv5Var, 32L);
            vv5 vv5Var = bs5.c;
            if (!(!c25.g(sv5Var.D(vv5Var.C3()), vv5Var))) {
                long readLong = sv5Var.readLong();
                long readLong2 = sv5Var.readLong();
                sv5 sv5Var2 = new sv5();
                as5Var.a(readLong + 32, sv5Var2, readLong2);
                return new bs5(randomAccessFile, null, readLong, sv5Var2.f1(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Relay.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"com/p7700g/p99005/bs5$b", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/as5;", "t", "Lcom/p7700g/p99005/as5;", "fileOperator", "s", "Lcom/p7700g/p99005/zw5;", "u", "J", "sourcePos", "<init>", "(Lcom/p7700g/p99005/bs5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class b implements xw5 {
        private final zw5 s = new zw5();
        private as5 t;
        private long u;

        public b() {
            RandomAccessFile f = bs5.this.f();
            c25.m(f);
            FileChannel channel = f.getChannel();
            c25.o(channel, "file!!.channel");
            this.t = new as5(channel);
        }

        @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.t == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.t = null;
            synchronized (bs5.this) {
                bs5 bs5Var = bs5.this;
                bs5Var.q(bs5Var.g() - 1);
                if (bs5.this.g() == 0) {
                    RandomAccessFile f = bs5.this.f();
                    bs5.this.p(null);
                    randomAccessFile = f;
                }
                yq4 yq4Var = yq4.a;
            }
            if (randomAccessFile != null) {
                sr5.l(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            if (r4 != 2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
            r10 = java.lang.Math.min(r21, r19.v.j() - r19.u);
            r2 = r19.t;
            com.p7700g.p99005.c25.m(r2);
            r2.a(r19.u + 32, r20, r10);
            r19.u += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
            r0 = r19.v.h();
            com.p7700g.p99005.c25.m(r0);
            r14 = r0.read(r19.v.i(), r19.v.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
            if (r14 != (-1)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
            r0 = r19.v;
            r0.b(r0.j());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
            r2 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
            r19.v.t(null);
            r0 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
            if (r0 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
            r0.notifyAll();
            r0 = com.p7700g.p99005.yq4.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
            r11 = java.lang.Math.min(r14, r21);
            r19.v.i().X(r20, 0, r11);
            r19.u += r11;
            r13 = r19.t;
            com.p7700g.p99005.c25.m(r13);
            r13.b(r19.v.j() + 32, r19.v.i().clone(), r14);
            r2 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
            r19.v.c().write(r19.v.i(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
            if (r19.v.c().z2() <= r19.v.d()) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
            r19.v.c().skip(r19.v.c().z2() - r19.v.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
            r0 = r19.v;
            r0.s(r0.j() + r14);
            r0 = com.p7700g.p99005.yq4.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
            r2 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
            r19.v.t(null);
            r0 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            if (r0 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
            monitor-enter(r19.v);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
            r19.v.t(null);
            r3 = r19.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
            if (r3 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
            r3.notifyAll();
            r3 = com.p7700g.p99005.yq4.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
            throw r0;
         */
        @Override // com.p7700g.p99005.xw5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, "sink");
            char c = 1;
            if (this.t != null) {
                synchronized (bs5.this) {
                    while (true) {
                        if (this.u != bs5.this.j()) {
                            long j2 = bs5.this.j() - bs5.this.c().z2();
                            if (this.u >= j2) {
                                long min = Math.min(j, bs5.this.j() - this.u);
                                bs5.this.c().X(sv5Var, this.u - j2, min);
                                this.u += min;
                                return min;
                            }
                            c = 2;
                        } else if (!bs5.this.e()) {
                            if (bs5.this.k() != null) {
                                this.s.k(bs5.this);
                            } else {
                                bs5.this.t(Thread.currentThread());
                                break;
                            }
                        } else {
                            return -1L;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @Override // com.p7700g.p99005.xw5
        @NotNull
        public zw5 timeout() {
            return this.s;
        }
    }

    static {
        vv5.a aVar = vv5.u;
        c = aVar.l("OkHttp cache v1\n");
        d = aVar.l("OkHttp DIRTY :(\n");
    }

    private bs5(RandomAccessFile randomAccessFile, xw5 xw5Var, long j, vv5 vv5Var, long j2) {
        this.l = randomAccessFile;
        this.m = xw5Var;
        this.n = j;
        this.o = vv5Var;
        this.p = j2;
        this.h = new sv5();
        this.i = this.m == null;
        this.j = new sv5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(vv5 vv5Var, long j, long j2) throws IOException {
        sv5 sv5Var = new sv5();
        sv5Var.y1(vv5Var);
        sv5Var.O1(j);
        sv5Var.O1(j2);
        if (sv5Var.z2() == 32) {
            RandomAccessFile randomAccessFile = this.l;
            c25.m(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            c25.o(channel, "file!!.channel");
            new as5(channel).b(0L, sv5Var, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void v(long j) throws IOException {
        sv5 sv5Var = new sv5();
        sv5Var.y1(this.o);
        RandomAccessFile randomAccessFile = this.l;
        c25.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        c25.o(channel, "file!!.channel");
        new as5(channel).b(32 + j, sv5Var, this.o.C3());
    }

    public final void b(long j) throws IOException {
        v(j);
        RandomAccessFile randomAccessFile = this.l;
        c25.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(c, j, this.o.C3());
        RandomAccessFile randomAccessFile2 = this.l;
        c25.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.i = true;
            yq4 yq4Var = yq4.a;
        }
        xw5 xw5Var = this.m;
        if (xw5Var != null) {
            sr5.l(xw5Var);
        }
        this.m = null;
    }

    @NotNull
    public final sv5 c() {
        return this.j;
    }

    public final long d() {
        return this.p;
    }

    public final boolean e() {
        return this.i;
    }

    @Nullable
    public final RandomAccessFile f() {
        return this.l;
    }

    public final int g() {
        return this.k;
    }

    @Nullable
    public final xw5 h() {
        return this.m;
    }

    @NotNull
    public final sv5 i() {
        return this.h;
    }

    public final long j() {
        return this.n;
    }

    @Nullable
    public final Thread k() {
        return this.g;
    }

    public final boolean l() {
        return this.l == null;
    }

    @NotNull
    public final vv5 m() {
        return this.o;
    }

    @Nullable
    public final xw5 n() {
        synchronized (this) {
            if (this.l == null) {
                return null;
            }
            this.k++;
            return new b();
        }
    }

    public final void o(boolean z) {
        this.i = z;
    }

    public final void p(@Nullable RandomAccessFile randomAccessFile) {
        this.l = randomAccessFile;
    }

    public final void q(int i) {
        this.k = i;
    }

    public final void r(@Nullable xw5 xw5Var) {
        this.m = xw5Var;
    }

    public final void s(long j) {
        this.n = j;
    }

    public final void t(@Nullable Thread thread) {
        this.g = thread;
    }

    public /* synthetic */ bs5(RandomAccessFile randomAccessFile, xw5 xw5Var, long j, vv5 vv5Var, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, xw5Var, j, vv5Var, j2);
    }
}