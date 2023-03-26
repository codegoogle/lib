package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeTaskQueue.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", "", CallMraidJS.b, "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", com.anythink.expressad.foundation.d.c.cd, "()Z", la1.l, "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", AFHydra.STATUS_IDLE, "isEmpty", "mask", "Z", "getSize", "()I", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class km5<E> {
    public static final int d = 8;
    public static final int e = 30;
    public static final int f = 1073741823;
    public static final int g = 0;
    public static final long h = 1073741823;
    public static final int i = 30;
    public static final long j = 1152921503533105152L;
    public static final int k = 60;
    public static final long l = 1152921504606846976L;
    public static final int m = 61;
    public static final long n = 2305843009213693952L;
    public static final int o = 1024;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ long _state = 0;
    private final int t;
    private final boolean u;
    private final int v;
    @NotNull
    private /* synthetic */ AtomicReferenceArray w;
    @NotNull
    public static final a a = new a(null);
    @cz4
    @NotNull
    public static final an5 p = new an5("REMOVE_FROZEN");
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(km5.class, Object.class, "_next");
    private static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(km5.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    @vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j) {
            return (j & km5.n) != 0 ? 2 : 1;
        }

        public final long b(long j, int i) {
            return e(j, km5.h) | (i << 0);
        }

        public final long c(long j, int i) {
            return e(j, km5.j) | (i << 30);
        }

        public final <T> T d(long j, @NotNull j05<? super Integer, ? super Integer, ? extends T> j05Var) {
            return j05Var.w3(Integer.valueOf((int) ((km5.h & j) >> 0)), Integer.valueOf((int) ((j & km5.j) >> 30)));
        }

        public final long e(long j, long j2) {
            return j & (~j2);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", la1.l, "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        @cz4
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public km5(int i2, boolean z) {
        this.t = i2;
        this.u = z;
        int i3 = i2 - 1;
        this.v = i3;
        this.w = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final km5<E> b(long j2) {
        km5<E> km5Var = new km5<>(this.t * 2, this.u);
        int i2 = (int) ((h & j2) >> 0);
        int i3 = (int) ((j & j2) >> 30);
        while (true) {
            int i4 = this.v;
            if ((i2 & i4) != (i3 & i4)) {
                Object obj = this.w.get(i4 & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                km5Var.w.set(km5Var.v & i2, obj);
                i2++;
            } else {
                km5Var._state = a.e(j2, l);
                return km5Var;
            }
        }
    }

    private final km5<E> c(long j2) {
        while (true) {
            km5<E> km5Var = (km5) this._next;
            if (km5Var != null) {
                return km5Var;
            }
            b.compareAndSet(this, null, b(j2));
        }
    }

    private final km5<E> e(int i2, E e2) {
        Object obj = this.w.get(this.v & i2);
        if ((obj instanceof b) && ((b) obj).a == i2) {
            this.w.set(i2 & this.v, e2);
            return this;
        }
        return null;
    }

    private final long j() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & l) != 0) {
                return j2;
            }
            j3 = j2 | l;
        } while (!c.compareAndSet(this, j2, j3));
        return j3;
    }

    private final km5<E> m(int i2, int i3) {
        long j2;
        a aVar;
        int i4;
        do {
            j2 = this._state;
            aVar = a;
            i4 = (int) ((h & j2) >> 0);
            if ((l & j2) != 0) {
                return k();
            }
        } while (!c.compareAndSet(this, j2, aVar.b(j2, i3)));
        this.w.set(this.v & i4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(@NotNull E e2) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return a.a(j2);
            }
            a aVar = a;
            int i2 = (int) ((h & j2) >> 0);
            int i3 = (int) ((j & j2) >> 30);
            int i4 = this.v;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.u && this.w.get(i3 & i4) != null) {
                int i5 = this.t;
                if (i5 < 1024 || ((i3 - i2) & f) > (i5 >> 1)) {
                    break;
                }
            } else if (c.compareAndSet(this, j2, aVar.c(j2, (i3 + 1) & f))) {
                this.w.set(i3 & i4, e2);
                km5<E> km5Var = this;
                while ((km5Var._state & l) != 0 && (km5Var = km5Var.k().e(i3, e2)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & n) != 0) {
                return true;
            }
            if ((l & j2) != 0) {
                return false;
            }
        } while (!c.compareAndSet(this, j2, j2 | n));
        return true;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & j) >> 30)) - ((int) ((h & j2) >> 0)));
    }

    public final boolean g() {
        return (this._state & n) != 0;
    }

    public final boolean h() {
        long j2 = this._state;
        return ((int) ((h & j2) >> 0)) == ((int) ((j2 & j) >> 30));
    }

    @NotNull
    public final <R> List<R> i(@NotNull f05<? super E, ? extends R> f05Var) {
        ArrayList arrayList = new ArrayList(this.t);
        long j2 = this._state;
        int i2 = (int) ((h & j2) >> 0);
        int i3 = (int) ((j2 & j) >> 30);
        while (true) {
            int i4 = this.v;
            if ((i2 & i4) == (i3 & i4)) {
                return arrayList;
            }
            Object obj = (Object) this.w.get(i4 & i2);
            if (obj != 0 && !(obj instanceof b)) {
                arrayList.add(f05Var.M(obj));
            }
            i2++;
        }
    }

    @NotNull
    public final km5<E> k() {
        return c(j());
    }

    @Nullable
    public final Object l() {
        while (true) {
            long j2 = this._state;
            if ((l & j2) != 0) {
                return p;
            }
            a aVar = a;
            int i2 = (int) ((h & j2) >> 0);
            int i3 = (int) ((j & j2) >> 30);
            int i4 = this.v;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.w.get(i4 & i2);
            if (obj == null) {
                if (this.u) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i5 = (i2 + 1) & f;
                if (c.compareAndSet(this, j2, aVar.b(j2, i5))) {
                    this.w.set(this.v & i2, null);
                    return obj;
                } else if (this.u) {
                    km5<E> km5Var = this;
                    do {
                        km5Var = km5Var.m(i2, i5);
                    } while (km5Var != null);
                    return obj;
                }
            }
        }
    }
}