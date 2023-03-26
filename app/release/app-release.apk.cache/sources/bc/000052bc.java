package com.p7700g.p99005;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionsConstructor.kt */
@vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class nn5 extends tl5 {
    @NotNull
    public static final nn5 a = new nn5();
    @NotNull
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    @NotNull
    private static final WeakHashMap<Class<? extends Throwable>, f05<Throwable, Throwable>> c = new WeakHashMap<>();

    private nn5() {
    }

    @Override // com.p7700g.p99005.tl5
    @NotNull
    public f05<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        f05<Throwable, Throwable> b2;
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            f05<Throwable, Throwable> f05Var = c.get(cls);
            if (f05Var == null) {
                readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i2 = 0;
                while (i2 < readHoldCount) {
                    i2++;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap<Class<? extends Throwable>, f05<Throwable, Throwable>> weakHashMap = c;
                    f05<Throwable, Throwable> f05Var2 = weakHashMap.get(cls);
                    if (f05Var2 == null) {
                        b2 = wl5.b(cls);
                        weakHashMap.put(cls, b2);
                        return b2;
                    }
                    while (i < readHoldCount) {
                        i++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return f05Var2;
                } finally {
                    while (i < readHoldCount) {
                        i++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return f05Var;
        } finally {
            readLock.unlock();
        }
    }
}