package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseLongArray.kt */
@vo4(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001aH\u0010\f\u001a\u00020\r*\u00020\u000226\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000fH\u0087\bø\u0001\u0000\u001a\u001d\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000bH\u0087\b\u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0087\bø\u0001\u0000\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0087\b\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0087\u0002\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u001d\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0087\n\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0002H\u0007\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "Landroid/util/SparseLongArray;", "getSize", "(Landroid/util/SparseLongArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", la1.b, la1.a, "valueIterator", "Lkotlin/collections/LongIterator;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class sp {

    /* compiled from: SparseLongArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseLongArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ft4 {
        private int s;
        public final /* synthetic */ SparseLongArray t;

        public a(SparseLongArray sparseLongArray) {
            this.t = sparseLongArray;
        }

        @Override // com.p7700g.p99005.ft4
        public int b() {
            SparseLongArray sparseLongArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseLongArray.keyAt(i);
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

    /* compiled from: SparseLongArray.kt */
    @vo4(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"androidx/core/util/SparseLongArrayKt$valueIterator$1", "Lkotlin/collections/LongIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextLong", "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends gt4 {
        private int s;
        public final /* synthetic */ SparseLongArray t;

        public b(SparseLongArray sparseLongArray) {
            this.t = sparseLongArray;
        }

        @Override // com.p7700g.p99005.gt4
        public long b() {
            SparseLongArray sparseLongArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseLongArray.valueAt(i);
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

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean a(@NotNull SparseLongArray sparseLongArray, int i) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean b(@NotNull SparseLongArray sparseLongArray, int i) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean c(@NotNull SparseLongArray sparseLongArray, long j) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void d(@NotNull SparseLongArray sparseLongArray, @NotNull j05<? super Integer, ? super Long, yq4> j05Var) {
        c25.p(sparseLongArray, "<this>");
        c25.p(j05Var, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            j05Var.w3(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long e(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long f(@NotNull SparseLongArray sparseLongArray, int i, @NotNull uz4<Long> uz4Var) {
        c25.p(sparseLongArray, "<this>");
        c25.p(uz4Var, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : uz4Var.x().longValue();
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int g(@NotNull SparseLongArray sparseLongArray) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean h(@NotNull SparseLongArray sparseLongArray) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean i(@NotNull SparseLongArray sparseLongArray) {
        c25.p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ft4 j(@NotNull SparseLongArray sparseLongArray) {
        c25.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final SparseLongArray k(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        c25.p(sparseLongArray, "<this>");
        c25.p(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void l(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        c25.p(sparseLongArray, "<this>");
        c25.p(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean m(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        c25.p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void n(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        c25.p(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @e2(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final gt4 o(@NotNull SparseLongArray sparseLongArray) {
        c25.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}