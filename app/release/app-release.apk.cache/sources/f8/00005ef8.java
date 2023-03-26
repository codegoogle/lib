package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* compiled from: SegmentPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\u00128\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/tw5;", "", "Lcom/p7700g/p99005/sw5;", "e", "()Lcom/p7700g/p99005/sw5;", "segment", "Lcom/p7700g/p99005/yq4;", "d", "(Lcom/p7700g/p99005/sw5;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "b", "Lcom/p7700g/p99005/sw5;", "LOCK", "", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "", AFHydra.STATUS_IDLE, "c", "()I", "MAX_SIZE", "byteCount", "HASH_BUCKET_COUNT", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class tw5 {
    private static final int c;
    private static final AtomicReference<sw5>[] d;
    @NotNull
    public static final tw5 e = new tw5();
    private static final int a = 65536;
    private static final sw5 b = new sw5(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        c = highestOneBit;
        AtomicReference<sw5>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        d = atomicReferenceArr;
    }

    private tw5() {
    }

    private final AtomicReference<sw5> a() {
        Thread currentThread = Thread.currentThread();
        c25.o(currentThread, "Thread.currentThread()");
        return d[(int) (currentThread.getId() & (c - 1))];
    }

    @jz4
    public static final void d(@NotNull sw5 sw5Var) {
        AtomicReference<sw5> a2;
        sw5 sw5Var2;
        c25.p(sw5Var, "segment");
        if (sw5Var.i == null && sw5Var.j == null) {
            if (sw5Var.g || (sw5Var2 = (a2 = e.a()).get()) == b) {
                return;
            }
            int i = sw5Var2 != null ? sw5Var2.f : 0;
            if (i >= a) {
                return;
            }
            sw5Var.i = sw5Var2;
            sw5Var.e = 0;
            sw5Var.f = i + 8192;
            if (a2.compareAndSet(sw5Var2, sw5Var)) {
                return;
            }
            sw5Var.i = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @jz4
    @NotNull
    public static final sw5 e() {
        AtomicReference<sw5> a2 = e.a();
        sw5 sw5Var = b;
        sw5 andSet = a2.getAndSet(sw5Var);
        if (andSet == sw5Var) {
            return new sw5();
        }
        if (andSet == null) {
            a2.set(null);
            return new sw5();
        }
        a2.set(andSet.i);
        andSet.i = null;
        andSet.f = 0;
        return andSet;
    }

    public final int b() {
        sw5 sw5Var = a().get();
        if (sw5Var != null) {
            return sw5Var.f;
        }
        return 0;
    }

    public final int c() {
        return a;
    }
}