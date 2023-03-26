package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anchorfree.sdk.DBProvider;
import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.t35;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentWeakMap.kt */
@vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*:\u0003&'(B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", bx.C4, "", "weakRefQueue", "<init>", "(Z)V", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "w", "", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "clear", "()V", "decrementSize", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", la1.b, "runWeakRefQueueCleaningLoopUntilInterrupted", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", DBProvider.s, "", "getSize", "()I", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core", "Lkotlin/collections/AbstractMutableMap;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class vh5<K, V> extends rr4<K, V> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(vh5.class, "_size");
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    public volatile /* synthetic */ Object core;
    @Nullable
    private final ReferenceQueue<K> t;

    /* compiled from: ConcurrentWeakMap.kt */
    @vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0018:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013\"\u0004\b\u0002\u0010\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010 R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "weakRef", "", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "key", "getImpl", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", la1.l, "(I)I", "E", "Lkotlin/Function2;", "factory", "", "keyValueIterator", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "value", "weakKey0", "", "putImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "rehash", "()Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "removeCleanedAt", "(I)V", AFHydra.STATUS_IDLE, "shift", "threshold", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a {
        private static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");
        private final int b;
        private final int c;
        private final int d;
        @NotNull
        public /* synthetic */ AtomicReferenceArray e;
        @NotNull
        public /* synthetic */ AtomicReferenceArray f;
        @NotNull
        private volatile /* synthetic */ int load = 0;

        /* compiled from: ConcurrentWeakMap.kt */
        @vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", la1.l, "", "key", "Ljava/lang/Object;", "value", "findNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", la1.b, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.vh5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0261a<E> implements Iterator<E>, q35 {
            @NotNull
            private final j05<K, V, E> s;
            private int t = -1;
            private K u;
            private V v;

            /* JADX WARN: Multi-variable type inference failed */
            public C0261a(@NotNull j05<? super K, ? super V, ? extends E> j05Var) {
                this.s = j05Var;
                a();
            }

            private final void a() {
                while (true) {
                    int i = this.t + 1;
                    this.t = i;
                    if (i >= ((a) a.this).b) {
                        return;
                    }
                    ei5 ei5Var = (ei5) a.this.e.get(this.t);
                    K k = ei5Var == null ? null : (K) ei5Var.get();
                    if (k != null) {
                        this.u = k;
                        V v = (V) a.this.f.get(this.t);
                        if (v instanceof fi5) {
                            v = (V) ((fi5) v).a;
                        }
                        if (v != null) {
                            this.v = v;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: b */
            public Void remove() {
                wh5.e();
                throw new lo4();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.t < ((a) a.this).b;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.t < ((a) a.this).b) {
                    j05<K, V, E> j05Var = this.s;
                    K k = this.u;
                    if (k == null) {
                        c25.S("key");
                        k = (K) yq4.a;
                    }
                    V v = this.v;
                    if (v == null) {
                        c25.S("value");
                        v = (V) yq4.a;
                    }
                    E w3 = j05Var.w3(k, v);
                    a();
                    return w3;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i) {
            this.b = i;
            this.c = Integer.numberOfLeadingZeros(i) + 1;
            this.d = (i * 2) / 3;
            this.e = new AtomicReferenceArray(i);
            this.f = new AtomicReferenceArray(i);
        }

        private final int d(int i) {
            return (i * (-1640531527)) >>> this.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, ei5 ei5Var, int i, Object obj3) {
            if ((i & 4) != 0) {
                ei5Var = null;
            }
            return aVar.f(obj, obj2, ei5Var);
        }

        private final void i(int i) {
            Object obj;
            do {
                obj = this.f.get(i);
                if (obj == null || (obj instanceof fi5)) {
                    return;
                }
            } while (!this.f.compareAndSet(i, obj, null));
            vh5.this.m();
        }

        public final void b(@NotNull ei5<?> ei5Var) {
            int d = d(ei5Var.a);
            while (true) {
                ei5<?> ei5Var2 = (ei5) this.e.get(d);
                if (ei5Var2 == null) {
                    return;
                }
                if (ei5Var2 == ei5Var) {
                    i(d);
                    return;
                }
                if (d == 0) {
                    d = this.b;
                }
                d--;
            }
        }

        @Nullable
        public final V c(@NotNull K k) {
            int d = d(k.hashCode());
            while (true) {
                ei5 ei5Var = (ei5) this.e.get(d);
                if (ei5Var == null) {
                    return null;
                }
                T t = ei5Var.get();
                if (c25.g(k, t)) {
                    V v = (V) this.f.get(d);
                    return v instanceof fi5 ? (V) ((fi5) v).a : v;
                }
                if (t == 0) {
                    i(d);
                }
                if (d == 0) {
                    d = this.b;
                }
                d--;
            }
        }

        @NotNull
        public final <E> Iterator<E> e(@NotNull j05<? super K, ? super V, ? extends E> j05Var) {
            return new C0261a(j05Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
            r6 = r5.f.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
            if ((r6 instanceof com.p7700g.p99005.fi5) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
            r6 = com.p7700g.p99005.wh5.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r5.f.compareAndSet(r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
            return r6;
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(@NotNull K k, @Nullable V v, @Nullable ei5<K> ei5Var) {
            int i;
            an5 an5Var;
            int d = d(k.hashCode());
            boolean z = false;
            while (true) {
                ei5 ei5Var2 = (ei5) this.e.get(d);
                if (ei5Var2 != null) {
                    T t = ei5Var2.get();
                    if (!c25.g(k, t)) {
                        if (t == 0) {
                            i(d);
                        }
                        if (d == 0) {
                            d = this.b;
                        }
                        d--;
                    } else if (z) {
                        a.decrementAndGet(this);
                    }
                } else if (v == null) {
                    return null;
                } else {
                    if (!z) {
                        do {
                            i = this.load;
                            if (i >= this.d) {
                                an5Var = wh5.c;
                                return an5Var;
                            }
                        } while (!a.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (ei5Var == null) {
                        ei5Var = new ei5<>(k, ((vh5) vh5.this).t);
                    }
                    if (this.e.compareAndSet(d, null, ei5Var)) {
                        break;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final vh5<K, V>.a h() {
            Object obj;
            an5 an5Var;
            fi5 d;
            while (true) {
                vh5<K, V>.a aVar = (vh5<K, V>.a) new a(Integer.highestOneBit(i55.n(vh5.this.size(), 4)) * 4);
                int i = 0;
                int i2 = this.b;
                while (i < i2) {
                    int i3 = i + 1;
                    ei5 ei5Var = (ei5) this.e.get(i);
                    Object obj2 = ei5Var == null ? null : ei5Var.get();
                    if (ei5Var != null && obj2 == null) {
                        i(i);
                    }
                    while (true) {
                        obj = this.f.get(i);
                        if (obj instanceof fi5) {
                            obj = ((fi5) obj).a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f;
                        d = wh5.d(obj);
                        if (atomicReferenceArray.compareAndSet(i, obj, d)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object f = aVar.f(obj2, obj, ei5Var);
                        an5Var = wh5.c;
                        if (f == an5Var) {
                            break;
                        }
                    }
                    i = i3;
                }
                return aVar;
            }
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", bx.C4, "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, t35.a {
        private final K s;
        private final V t;

        public b(K k, V v) {
            this.s = k;
            this.t = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            wh5.e();
            throw new lo4();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", com.anythink.expressad.d.a.b.ay, "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class c<E> extends sr4<E> {
        @NotNull
        private final j05<K, V, E> s;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull j05<? super K, ? super V, ? extends E> j05Var) {
            this.s = j05Var;
        }

        @Override // com.p7700g.p99005.sr4, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            wh5.e();
            throw new lo4();
        }

        @Override // com.p7700g.p99005.sr4
        public int h() {
            return vh5.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((a) vh5.this.core).e(this.s);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", bx.C4, "", "k", com.ironsource.sdk.controller.v.a, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements j05<K, V, Map.Entry<K, V>> {
        public static final d t = new d();

        public d() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final Map.Entry<K, V> w3(@NotNull K k, @NotNull V v) {
            return new b(k, v);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @vo4(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", bx.C4, "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements j05<K, V, K> {
        public static final e t = new e();

        public e() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        public final K w3(@NotNull K k, @NotNull V v) {
            return k;
        }
    }

    public vh5() {
        this(false, 1, null);
    }

    public /* synthetic */ vh5(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    private final void l(ei5<?> ei5Var) {
        ((a) this.core).b(ei5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        s.decrementAndGet(this);
    }

    private final synchronized V n(K k, V v) {
        V v2;
        an5 an5Var;
        a aVar = (a) this.core;
        while (true) {
            v2 = (V) a.g(aVar, k, v, null, 4, null);
            an5Var = wh5.c;
            if (v2 == an5Var) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return v2;
    }

    @Override // com.p7700g.p99005.rr4
    @NotNull
    public Set<Map.Entry<K, V>> a() {
        return new c(d.t);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k : keySet()) {
            remove(k);
        }
    }

    @Override // com.p7700g.p99005.rr4
    @NotNull
    public Set<K> e() {
        return new c(e.t);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) this.core).c(obj);
    }

    @Override // com.p7700g.p99005.rr4
    public int h() {
        return this._size;
    }

    public final void o() {
        if (!(this.t != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.t.remove();
                if (remove == null) {
                    break;
                }
                l((ei5) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
    }

    @Override // com.p7700g.p99005.rr4, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k, @NotNull V v) {
        an5 an5Var;
        V v2 = (V) a.g((a) this.core, k, v, null, 4, null);
        an5Var = wh5.c;
        if (v2 == an5Var) {
            v2 = n(k, v);
        }
        if (v2 == null) {
            s.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        an5 an5Var;
        if (obj == 0) {
            return null;
        }
        V v = (V) a.g((a) this.core, obj, null, null, 4, null);
        an5Var = wh5.c;
        if (v == an5Var) {
            v = n(obj, null);
        }
        if (v != null) {
            s.decrementAndGet(this);
        }
        return v;
    }

    public vh5(boolean z) {
        this._size = 0;
        this.core = new a(16);
        this.t = z ? new ReferenceQueue<>() : null;
    }
}