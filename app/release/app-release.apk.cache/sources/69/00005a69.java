package com.p7700g.p99005;

import android.util.SparseIntArray;
import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseIntArray.kt */
@vo4(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001aH\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001a&\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\bø\u0001\u0000\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u0018*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "Landroid/util/SparseIntArray;", "getSize", "(Landroid/util/SparseIntArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", la1.b, la1.a, "valueIterator", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class rp {

    /* compiled from: SparseIntArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseIntArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ft4 {
        private int s;
        public final /* synthetic */ SparseIntArray t;

        public a(SparseIntArray sparseIntArray) {
            this.t = sparseIntArray;
        }

        @Override // com.p7700g.p99005.ft4
        public int b() {
            SparseIntArray sparseIntArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseIntArray.keyAt(i);
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

    /* compiled from: SparseIntArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseIntArrayKt$valueIterator$1", "Lkotlin/collections/IntIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ft4 {
        private int s;
        public final /* synthetic */ SparseIntArray t;

        public b(SparseIntArray sparseIntArray) {
            this.t = sparseIntArray;
        }

        @Override // com.p7700g.p99005.ft4
        public int b() {
            SparseIntArray sparseIntArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseIntArray.valueAt(i);
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

    public static final boolean a(@NotNull SparseIntArray sparseIntArray, int i) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean b(@NotNull SparseIntArray sparseIntArray, int i) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean c(@NotNull SparseIntArray sparseIntArray, int i) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i) >= 0;
    }

    public static final void d(@NotNull SparseIntArray sparseIntArray, @NotNull j05<? super Integer, ? super Integer, yq4> j05Var) {
        c25.p(sparseIntArray, "<this>");
        c25.p(j05Var, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            j05Var.w3(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int e(@NotNull SparseIntArray sparseIntArray, int i, int i2) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    public static final int f(@NotNull SparseIntArray sparseIntArray, int i, @NotNull uz4<Integer> uz4Var) {
        c25.p(sparseIntArray, "<this>");
        c25.p(uz4Var, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : uz4Var.x().intValue();
    }

    public static final int g(@NotNull SparseIntArray sparseIntArray) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@NotNull SparseIntArray sparseIntArray) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseIntArray sparseIntArray) {
        c25.p(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    @NotNull
    public static final ft4 j(@NotNull SparseIntArray sparseIntArray) {
        c25.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @NotNull
    public static final SparseIntArray k(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        c25.p(sparseIntArray, "<this>");
        c25.p(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray2.size() + sparseIntArray.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        c25.p(sparseIntArray, "<this>");
        c25.p(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean m(@NotNull SparseIntArray sparseIntArray, int i, int i2) {
        c25.p(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@NotNull SparseIntArray sparseIntArray, int i, int i2) {
        c25.p(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    @NotNull
    public static final ft4 o(@NotNull SparseIntArray sparseIntArray) {
        c25.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}