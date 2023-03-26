package com.p7700g.p99005;

import android.util.SparseArray;
import com.anythink.core.api.ATAdConst;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArray.kt */
@vo4(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a!\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a&\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\f\u001aT\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bø\u0001\u0000\u001a.\u0010\u0013\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0015\u001a7\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u0019\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0016\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a-\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a$\u0010\u001f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a+\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002¢\u0006\u0002\u0010!\u001a.\u0010\"\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "T", "Landroid/util/SparseArray;", "getSize", "(Landroid/util/SparseArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", la1.b, "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", la1.a, "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pp {

    /* compiled from: SparseArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ft4 {
        private int s;
        public final /* synthetic */ SparseArray<T> t;

        public a(SparseArray<T> sparseArray) {
            this.t = sparseArray;
        }

        @Override // com.p7700g.p99005.ft4
        public int b() {
            SparseArray<T> sparseArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseArray.keyAt(i);
        }

        public final int c() {
            return this.s;
        }

        public final void d(int i) {
            this.s = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s < this.t.size();
        }
    }

    /* compiled from: SparseArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/SparseArrayKt$valueIterator$1", "", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements Iterator<T>, n35 {
        private int s;
        public final /* synthetic */ SparseArray<T> t;

        public b(SparseArray<T> sparseArray) {
            this.t = sparseArray;
        }

        public final int a() {
            return this.s;
        }

        public final void b(int i) {
            this.s = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s < this.t.size();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull SparseArray<T> sparseArray, int i) {
        c25.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean b(@NotNull SparseArray<T> sparseArray, int i) {
        c25.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean c(@NotNull SparseArray<T> sparseArray, T t) {
        c25.p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void d(@NotNull SparseArray<T> sparseArray, @NotNull j05<? super Integer, ? super T, yq4> j05Var) {
        c25.p(sparseArray, "<this>");
        c25.p(j05Var, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            j05Var.w3(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T e(@NotNull SparseArray<T> sparseArray, int i, T t) {
        c25.p(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T f(@NotNull SparseArray<T> sparseArray, int i, @NotNull uz4<? extends T> uz4Var) {
        c25.p(sparseArray, "<this>");
        c25.p(uz4Var, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? uz4Var.x() : t;
    }

    public static final <T> int g(@NotNull SparseArray<T> sparseArray) {
        c25.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@NotNull SparseArray<T> sparseArray) {
        c25.p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@NotNull SparseArray<T> sparseArray) {
        c25.p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @NotNull
    public static final <T> ft4 j(@NotNull SparseArray<T> sparseArray) {
        c25.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @NotNull
    public static final <T> SparseArray<T> k(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        c25.p(sparseArray, "<this>");
        c25.p(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray2.size() + sparseArray.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        c25.p(sparseArray, "<this>");
        c25.p(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean m(@NotNull SparseArray<T> sparseArray, int i, T t) {
        c25.p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !c25.g(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@NotNull SparseArray<T> sparseArray, int i, T t) {
        c25.p(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    @NotNull
    public static final <T> Iterator<T> o(@NotNull SparseArray<T> sparseArray) {
        c25.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}