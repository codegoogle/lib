package com.p7700g.p99005;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: Throttler.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\tB\t\b\u0016¢\u0006\u0004\b \u0010!J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/yw5;", "", "", com.anythink.basead.d.g.i, "(J)J", "f", "nanosToWait", "Lcom/p7700g/p99005/yq4;", "k", "(J)V", "bytesPerSecond", "waitByteCount", "maxByteCount", "d", "(JJJ)V", "byteCount", "j", "now", "a", "(JJ)J", "Lcom/p7700g/p99005/xw5;", rs2.f.b, "i", "(Lcom/p7700g/p99005/xw5;)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/vw5;", "sink", "h", "(Lcom/p7700g/p99005/vw5;)Lcom/p7700g/p99005/vw5;", "c", "J", "b", "allocatedUntil", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class yw5 {
    private long a;
    private long b;
    private long c;
    private long d;

    /* compiled from: Throttler.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p7700g/p99005/yw5$a", "Lcom/p7700g/p99005/aw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a extends aw5 {
        public final /* synthetic */ vw5 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vw5 vw5Var, vw5 vw5Var2) {
            super(vw5Var2);
            this.t = vw5Var;
        }

        @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5
        public void write(@NotNull sv5 sv5Var, long j) throws IOException {
            c25.p(sv5Var, rs2.f.b);
            while (j > 0) {
                try {
                    long j2 = yw5.this.j(j);
                    super.write(sv5Var, j2);
                    j -= j2;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* compiled from: Throttler.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/p7700g/p99005/yw5$b", "Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class b extends bw5 {
        public final /* synthetic */ xw5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xw5 xw5Var, xw5 xw5Var2) {
            super(xw5Var2);
            this.u = xw5Var;
        }

        @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5
        public long read(@NotNull sv5 sv5Var, long j) {
            c25.p(sv5Var, "sink");
            try {
                return super.read(sv5Var, yw5.this.j(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public yw5(long j) {
        this.d = j;
        this.b = PlaybackStateCompat.F;
        this.c = PlaybackStateCompat.K;
    }

    public static /* synthetic */ void e(yw5 yw5Var, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = yw5Var.b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = yw5Var.c;
        }
        yw5Var.d(j, j4, j3);
    }

    private final long f(long j) {
        return (j * 1000000000) / this.a;
    }

    private final long g(long j) {
        return (j * this.a) / 1000000000;
    }

    private final void k(long j) {
        long j2 = j / 1000000;
        wait(j2, (int) (j - (1000000 * j2)));
    }

    public final long a(long j, long j2) {
        if (this.a == 0) {
            return j2;
        }
        long max = Math.max(this.d - j, 0L);
        long g = this.c - g(max);
        if (g >= j2) {
            this.d = j + max + f(j2);
            return j2;
        }
        long j3 = this.b;
        if (g >= j3) {
            this.d = j + f(this.c);
            return g;
        }
        long min = Math.min(j3, j2);
        long f = max + f(min - this.c);
        if (f == 0) {
            this.d = j + f(this.c);
            return min;
        }
        return -f;
    }

    @gz4
    public final void b(long j) {
        e(this, j, 0L, 0L, 6, null);
    }

    @gz4
    public final void c(long j, long j2) {
        e(this, j, j2, 0L, 4, null);
    }

    @gz4
    public final void d(long j, long j2, long j3) {
        synchronized (this) {
            if (!(j >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j2 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j3 >= j2) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                notifyAll();
                yq4 yq4Var = yq4.a;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @NotNull
    public final vw5 h(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        return new a(vw5Var, vw5Var);
    }

    @NotNull
    public final xw5 i(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        return new b(xw5Var, xw5Var);
    }

    public final long j(long j) {
        long a2;
        if (j > 0) {
            synchronized (this) {
                while (true) {
                    a2 = a(System.nanoTime(), j);
                    if (a2 < 0) {
                        k(-a2);
                    }
                }
            }
            return a2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public yw5() {
        this(System.nanoTime());
    }
}