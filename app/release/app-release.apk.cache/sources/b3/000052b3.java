package com.p7700g.p99005;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainDispatchers.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class nm5 {
    @NotNull
    public static final nm5 a;
    private static final boolean b;
    @cz4
    @NotNull
    public static final qe5 c;

    static {
        nm5 nm5Var = new nm5();
        a = nm5Var;
        b = cn5.e("kotlinx.coroutines.fast.service.loader", true);
        c = nm5Var.a();
    }

    private nm5() {
    }

    private final qe5 a() {
        List<mm5> c3;
        Object next;
        try {
            if (b) {
                c3 = xl5.a.d();
            } else {
                c3 = o75.c3(m75.e(ServiceLoader.load(mm5.class, mm5.class.getClassLoader()).iterator()));
            }
            Iterator<T> it = c3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((mm5) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((mm5) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            mm5 mm5Var = (mm5) next;
            qe5 f = mm5Var == null ? null : om5.f(mm5Var, c3);
            return f == null ? om5.b(null, null, 3, null) : f;
        } catch (Throwable th) {
            return om5.b(th, null, 2, null);
        }
    }
}