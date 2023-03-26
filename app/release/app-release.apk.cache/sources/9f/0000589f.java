package com.p7700g.p99005;

import android.util.SparseBooleanArray;
import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseBooleanArray.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0086\b\u001aH\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000\u001a\u001d\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\b\u001a&\u0010\u0013\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\bø\u0001\u0000\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u001f*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "Landroid/util/SparseBooleanArray;", "getSize", "(Landroid/util/SparseBooleanArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", la1.b, la1.a, "valueIterator", "Lkotlin/collections/BooleanIterator;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qp {

    /* compiled from: SparseBooleanArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseBooleanArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends ft4 {
        private int s;
        public final /* synthetic */ SparseBooleanArray t;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.t = sparseBooleanArray;
        }

        @Override // com.p7700g.p99005.ft4
        public int b() {
            SparseBooleanArray sparseBooleanArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseBooleanArray.keyAt(i);
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

    /* compiled from: SparseBooleanArray.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"androidx/core/util/SparseBooleanArrayKt$valueIterator$1", "Lkotlin/collections/BooleanIterator;", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextBoolean", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends cs4 {
        private int s;
        public final /* synthetic */ SparseBooleanArray t;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.t = sparseBooleanArray;
        }

        @Override // com.p7700g.p99005.cs4
        public boolean b() {
            SparseBooleanArray sparseBooleanArray = this.t;
            int i = this.s;
            this.s = i + 1;
            return sparseBooleanArray.valueAt(i);
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

    public static final boolean a(@NotNull SparseBooleanArray sparseBooleanArray, int i) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean b(@NotNull SparseBooleanArray sparseBooleanArray, int i) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean c(@NotNull SparseBooleanArray sparseBooleanArray, boolean z) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final void d(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull j05<? super Integer, ? super Boolean, yq4> j05Var) {
        c25.p(sparseBooleanArray, "<this>");
        c25.p(j05Var, "action");
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            j05Var.w3(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean e(@NotNull SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean f(@NotNull SparseBooleanArray sparseBooleanArray, int i, @NotNull uz4<Boolean> uz4Var) {
        c25.p(sparseBooleanArray, "<this>");
        c25.p(uz4Var, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : uz4Var.x().booleanValue();
    }

    public static final int g(@NotNull SparseBooleanArray sparseBooleanArray) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@NotNull SparseBooleanArray sparseBooleanArray) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseBooleanArray sparseBooleanArray) {
        c25.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    @NotNull
    public static final ft4 j(@NotNull SparseBooleanArray sparseBooleanArray) {
        c25.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @NotNull
    public static final SparseBooleanArray k(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        c25.p(sparseBooleanArray, "<this>");
        c25.p(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        c25.p(sparseBooleanArray, "<this>");
        c25.p(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean m(@NotNull SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        c25.p(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void n(@NotNull SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        c25.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    @NotNull
    public static final cs4 o(@NotNull SparseBooleanArray sparseBooleanArray) {
        c25.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}