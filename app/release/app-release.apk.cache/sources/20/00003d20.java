package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import com.anythink.core.api.ATAdConst;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: LongSparseArray.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0087\n\u001a!\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a&\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\f\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\r\u001aT\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u001a.\u0010\u0014\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0016\u001a7\u0010\u0017\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a\u0019\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a\u0018\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a-\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\u0002\u001a&\u0010 \u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a-\u0010!\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\"\u001a.\u0010#\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010$\u001a\u001e\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "T", "Landroid/util/LongSparseArray;", "getSize", "(Landroid/util/LongSparseArray;)I", "contains", "", "key", "", "containsKey", "containsValue", "value", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "other", "putAll", la1.b, "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", la1.a, "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class cp {

    /* compiled from: LongSparseArray.kt */
    @vo4(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0002J\b\u0010\n\u001a\u00020\u000bH\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"androidx/core/util/LongSparseArrayKt$keyIterator$1", "Lkotlin/collections/LongIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextLong", "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends gt4 {
        private int s;
        public final /* synthetic */ LongSparseArray<T> t;

        public a(LongSparseArray<T> longSparseArray) {
            this.t = longSparseArray;
        }

        @Override // com.p7700g.p99005.gt4
        @SuppressLint({"ClassVerificationFailure"})
        public long b() {
            LongSparseArray<T> longSparseArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return longSparseArray.keyAt(i);
        }

        public final int c() {
            return this.s;
        }

        public final void d(int i) {
            this.s = i;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.s < this.t.size();
        }
    }

    /* compiled from: LongSparseArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0097\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements Iterator<T>, n35 {
        private int s;
        public final /* synthetic */ LongSparseArray<T> t;

        public b(LongSparseArray<T> longSparseArray) {
            this.t = longSparseArray;
        }

        public final int a() {
            return this.s;
        }

        public final void b(int i) {
            this.s = i;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.s < this.t.size();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean a(@NotNull LongSparseArray<T> longSparseArray, long j) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean b(@NotNull LongSparseArray<T> longSparseArray, long j) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean c(@NotNull LongSparseArray<T> longSparseArray, T t) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void d(@NotNull LongSparseArray<T> longSparseArray, @NotNull j05<? super Long, ? super T, yq4> j05Var) {
        c25.p(longSparseArray, "<this>");
        c25.p(j05Var, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            j05Var.w3(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T e(@NotNull LongSparseArray<T> longSparseArray, long j, T t) {
        c25.p(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T f(@NotNull LongSparseArray<T> longSparseArray, long j, @NotNull uz4<? extends T> uz4Var) {
        c25.p(longSparseArray, "<this>");
        c25.p(uz4Var, "defaultValue");
        T t = longSparseArray.get(j);
        return t == null ? uz4Var.x() : t;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> int g(@NotNull LongSparseArray<T> longSparseArray) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean h(@NotNull LongSparseArray<T> longSparseArray) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean i(@NotNull LongSparseArray<T> longSparseArray) {
        c25.p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @e2(16)
    @NotNull
    public static final <T> gt4 j(@NotNull LongSparseArray<T> longSparseArray) {
        c25.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final <T> LongSparseArray<T> k(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        c25.p(longSparseArray, "<this>");
        c25.p(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @e2(16)
    public static final <T> void l(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        c25.p(longSparseArray, "<this>");
        c25.p(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean m(@NotNull LongSparseArray<T> longSparseArray, long j, T t) {
        c25.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !c25.g(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @e2(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void n(@NotNull LongSparseArray<T> longSparseArray, long j, T t) {
        c25.p(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @e2(16)
    @NotNull
    public static final <T> Iterator<T> o(@NotNull LongSparseArray<T> longSparseArray) {
        c25.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}