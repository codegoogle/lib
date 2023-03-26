package com.p7700g.p99005;

import android.util.LruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LruCache.kt */
@vo4(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aû\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"lruCache", "Landroid/util/LruCache;", "K", bx.C4, "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class dp {

    /* compiled from: LruCache.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "", bx.C4, "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements j05<K, V, Integer> {
        public static final a t = new a();

        public a() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final Integer w3(@NotNull K k, @NotNull V v) {
            c25.p(k, "<anonymous parameter 0>");
            c25.p(v, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* compiled from: LruCache.kt */
    @vo4(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", bx.C4, "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class b extends e25 implements f05<K, V> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        public final V M(@NotNull K k) {
            c25.p(k, "it");
            return null;
        }
    }

    /* compiled from: LruCache.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0006\u0010\b\u001a\u0002H\u00042\b\u0010\t\u001a\u0004\u0018\u0001H\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "K", "", bx.C4, "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class c extends e25 implements l05<Boolean, K, V, V, yq4> {
        public static final c t = new c();

        public c() {
            super(4);
        }

        @Override // com.p7700g.p99005.l05
        public /* bridge */ /* synthetic */ yq4 Z(Boolean bool, Object obj, Object obj2, Object obj3) {
            a(bool.booleanValue(), obj, obj2, obj3);
            return yq4.a;
        }

        public final void a(boolean z, @NotNull K k, @NotNull V v, @Nullable V v2) {
            c25.p(k, "<anonymous parameter 1>");
            c25.p(v, "<anonymous parameter 2>");
        }
    }

    /* compiled from: LruCache.kt */
    @vo4(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class d extends LruCache<K, V> {
        public final /* synthetic */ j05<K, V, Integer> a;
        public final /* synthetic */ f05<K, V> b;
        public final /* synthetic */ l05<Boolean, K, V, V, yq4> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, j05<? super K, ? super V, Integer> j05Var, f05<? super K, ? extends V> f05Var, l05<? super Boolean, ? super K, ? super V, ? super V, yq4> l05Var) {
            super(i);
            this.a = j05Var;
            this.b = f05Var;
            this.c = l05Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
        @Override // android.util.LruCache
        @Nullable
        public V create(@NotNull K k) {
            c25.p(k, "key");
            return this.b.M(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, @NotNull K k, @NotNull V v, @Nullable V v2) {
            c25.p(k, "key");
            c25.p(v, "oldValue");
            this.c.Z(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(@NotNull K k, @NotNull V v) {
            c25.p(k, "key");
            c25.p(v, "value");
            return this.a.w3(k, v).intValue();
        }
    }

    @NotNull
    public static final <K, V> LruCache<K, V> a(int i, @NotNull j05<? super K, ? super V, Integer> j05Var, @NotNull f05<? super K, ? extends V> f05Var, @NotNull l05<? super Boolean, ? super K, ? super V, ? super V, yq4> l05Var) {
        c25.p(j05Var, "sizeOf");
        c25.p(f05Var, "create");
        c25.p(l05Var, "onEntryRemoved");
        return new d(i, j05Var, f05Var, l05Var);
    }

    public static /* synthetic */ LruCache b(int i, j05 j05Var, f05 f05Var, l05 l05Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j05Var = a.t;
        }
        if ((i2 & 4) != 0) {
            f05Var = b.t;
        }
        if ((i2 & 8) != 0) {
            l05Var = c.t;
        }
        c25.p(j05Var, "sizeOf");
        c25.p(f05Var, "create");
        c25.p(l05Var, "onEntryRemoved");
        return new d(i, j05Var, f05Var, l05Var);
    }
}