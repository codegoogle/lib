package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.kn5;
import java.lang.Comparable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadSafeHeap.kt */
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000602j\u0002`3B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b \u0010\u0012J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0082\u0010¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0082\u0010¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'R \u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u00100\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010#¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "<init>", "()V", "node", "", "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", "", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", la1.b, "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "", la1.l, "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "predicate", "removeFirstIf", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "value", "getSize", "()I", "setSize", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "kotlinx-coroutines-core", "", "Lkotlinx/coroutines/internal/SynchronizedObject;"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public class jn5<T extends kn5 & Comparable<? super T>> {
    @NotNull
    private volatile /* synthetic */ int _size = 0;
    @Nullable
    private T[] a;

    private final T[] i() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new kn5[4];
            this.a = tArr2;
            return tArr2;
        } else if (f() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, f() * 2);
            c25.o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((kn5[]) copyOf);
            this.a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void n(int i) {
        this._size = i;
    }

    private final void o(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= f()) {
                return;
            }
            T[] tArr = this.a;
            c25.m(tArr);
            int i3 = i2 + 1;
            if (i3 < f()) {
                T t = tArr[i3];
                c25.m(t);
                T t2 = tArr[i2];
                c25.m(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            c25.m(t3);
            T t4 = tArr[i2];
            c25.m(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            q(i, i2);
            i = i2;
        }
    }

    private final void p(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            c25.m(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            c25.m(t);
            T t2 = tArr[i];
            c25.m(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            q(i, i2);
            i = i2;
        }
    }

    private final void q(int i, int i2) {
        T[] tArr = this.a;
        c25.m(tArr);
        T t = tArr[i2];
        c25.m(t);
        T t2 = tArr[i];
        c25.m(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.c(i);
        t2.c(i2);
    }

    @np4
    public final void a(@NotNull T t) {
        t.a(this);
        T[] i = i();
        int f = f();
        n(f + 1);
        i[f] = t;
        t.c(f);
        p(f);
    }

    public final void b(@NotNull T t) {
        synchronized (this) {
            a(t);
            yq4 yq4Var = yq4.a;
        }
    }

    public final boolean c(@NotNull T t, @NotNull f05<? super T, Boolean> f05Var) {
        boolean z;
        synchronized (this) {
            try {
                if (f05Var.M(e()).booleanValue()) {
                    a(t);
                    z = true;
                } else {
                    z = false;
                }
                z15.d(1);
            } catch (Throwable th) {
                z15.d(1);
                z15.c(1);
                throw th;
            }
        }
        z15.c(1);
        return z;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                zr4.w2(tArr, null, 0, 0, 6, null);
            }
            this._size = 0;
            yq4 yq4Var = yq4.a;
        }
    }

    @np4
    @Nullable
    public final T e() {
        T[] tArr = this.a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int f() {
        return this._size;
    }

    public final boolean g() {
        return f() == 0;
    }

    @Nullable
    public final T h() {
        T e;
        synchronized (this) {
            e = e();
        }
        return e;
    }

    public final boolean j(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.b() == null) {
                z = false;
            } else {
                k(t.p());
                z = true;
            }
        }
        return z;
    }

    @np4
    @NotNull
    public final T k(int i) {
        T[] tArr = this.a;
        c25.m(tArr);
        n(f() - 1);
        if (i < f()) {
            q(i, f());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                c25.m(t);
                T t2 = tArr[i2];
                c25.m(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    q(i, i2);
                    p(i2);
                }
            }
            o(i);
        }
        T t3 = tArr[f()];
        c25.m(t3);
        t3.a(null);
        t3.c(-1);
        tArr[f()] = null;
        return t3;
    }

    @Nullable
    public final T l(@NotNull f05<? super T, Boolean> f05Var) {
        synchronized (this) {
            try {
                T e = e();
                if (e == null) {
                    z15.d(2);
                    z15.c(2);
                    return null;
                }
                T k = f05Var.M(e).booleanValue() ? k(0) : null;
                z15.d(1);
                z15.c(1);
                return k;
            } catch (Throwable th) {
                z15.d(1);
                z15.c(1);
                throw th;
            }
        }
    }

    @Nullable
    public final T m() {
        T k;
        synchronized (this) {
            k = f() > 0 ? k(0) : null;
        }
        return k;
    }
}