package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlidingWindow.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class bu4 {

    /* compiled from: SlidingWindow.kt */
    @mw4(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends rw4 implements j05<i75<? super List<? extends T>>, uv4<? super yq4>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ Iterator<T> B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ boolean D;
        public Object u;
        public Object v;
        public int w;
        public int x;
        private /* synthetic */ Object y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.z = i;
            this.A = i2;
            this.B = it;
            this.C = z;
            this.D = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            int i;
            vt4 vt4Var;
            Iterator it;
            i75 i75Var;
            a aVar;
            int i2;
            i75 i75Var2;
            a aVar2;
            ArrayList arrayList;
            Iterator it2;
            vt4 vt4Var2;
            i75 i75Var3;
            Object h = gw4.h();
            int i3 = this.x;
            if (i3 == 0) {
                rp4.n(obj);
                i75 i75Var4 = (i75) this.y;
                int u = i55.u(this.z, 1024);
                i = this.A - this.z;
                if (i >= 0) {
                    ArrayList arrayList2 = new ArrayList(u);
                    i2 = 0;
                    i75Var2 = i75Var4;
                    aVar2 = this;
                    arrayList = arrayList2;
                    it2 = this.B;
                    while (it2.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                        aVar2.y = null;
                        aVar2.u = null;
                        aVar2.v = null;
                        aVar2.x = 2;
                        if (i75Var2.b(arrayList, aVar2) == h) {
                        }
                    }
                    return yq4.a;
                }
                vt4Var = new vt4(u);
                it = this.B;
                i75Var = i75Var4;
                aVar = this;
                while (it.hasNext()) {
                }
                if (aVar.D) {
                }
                return yq4.a;
            } else if (i3 == 1) {
                int i4 = this.w;
                it2 = (Iterator) this.v;
                arrayList = (ArrayList) this.u;
                i75Var2 = (i75) this.y;
                rp4.n(obj);
                aVar2 = this;
                i = i4;
                if (aVar2.C) {
                    arrayList = new ArrayList(aVar2.z);
                } else {
                    arrayList.clear();
                }
                i2 = i;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (i2 > 0) {
                        i2--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == aVar2.z) {
                            aVar2.y = i75Var2;
                            aVar2.u = arrayList;
                            aVar2.v = it2;
                            aVar2.w = i;
                            aVar2.x = 1;
                            if (i75Var2.b(arrayList, aVar2) == h) {
                                return h;
                            }
                            if (aVar2.C) {
                            }
                            i2 = i;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (aVar2.D || arrayList.size() == aVar2.z)) {
                    aVar2.y = null;
                    aVar2.u = null;
                    aVar2.v = null;
                    aVar2.x = 2;
                    if (i75Var2.b(arrayList, aVar2) == h) {
                        return h;
                    }
                }
                return yq4.a;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        it = (Iterator) this.v;
                        vt4Var = (vt4) this.u;
                        i75Var = (i75) this.y;
                        rp4.n(obj);
                        aVar = this;
                        vt4Var.n(aVar.A);
                        while (it.hasNext()) {
                            vt4Var.e(it.next());
                            if (vt4Var.m()) {
                                int size = vt4Var.size();
                                int i5 = aVar.z;
                                if (size >= i5) {
                                    RandomAccess arrayList3 = aVar.C ? vt4Var : new ArrayList(vt4Var);
                                    aVar.y = i75Var;
                                    aVar.u = vt4Var;
                                    aVar.v = it;
                                    aVar.x = 3;
                                    if (i75Var.b(arrayList3, aVar) == h) {
                                        return h;
                                    }
                                    vt4Var.n(aVar.A);
                                    while (it.hasNext()) {
                                    }
                                } else {
                                    vt4Var = vt4Var.h(i5);
                                }
                            }
                        }
                        if (aVar.D) {
                            vt4Var2 = vt4Var;
                            i75Var3 = i75Var;
                            if (vt4Var2.size() <= aVar.A) {
                            }
                        }
                        return yq4.a;
                    } else if (i3 == 4) {
                        vt4Var2 = (vt4) this.u;
                        i75Var3 = (i75) this.y;
                        rp4.n(obj);
                        aVar = this;
                        vt4Var2.n(aVar.A);
                        if (vt4Var2.size() <= aVar.A) {
                            RandomAccess arrayList4 = aVar.C ? vt4Var2 : new ArrayList(vt4Var2);
                            aVar.y = i75Var3;
                            aVar.u = vt4Var2;
                            aVar.v = null;
                            aVar.x = 4;
                            if (i75Var3.b(arrayList4, aVar) == h) {
                                return h;
                            }
                            vt4Var2.n(aVar.A);
                            if (vt4Var2.size() <= aVar.A) {
                                if (!vt4Var2.isEmpty()) {
                                    aVar.y = null;
                                    aVar.u = null;
                                    aVar.v = null;
                                    aVar.x = 5;
                                    if (i75Var3.b(vt4Var2, aVar) == h) {
                                        return h;
                                    }
                                }
                                return yq4.a;
                            }
                        }
                    } else if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                rp4.n(obj);
                return yq4.a;
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.z, this.A, this.B, this.C, this.D, uv4Var);
            aVar.y = obj;
            return aVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super List<? extends T>> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    /* compiled from: Sequences.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g75<List<? extends T>> {
        public final /* synthetic */ g75 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public b(g75 g75Var, int i, int i2, boolean z, boolean z2) {
            this.a = g75Var;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<List<? extends T>> iterator() {
            return bu4.b(this.a.iterator(), this.b, this.c, this.d, this.e);
        }
    }

    public static final void a(int i, int i2) {
        String n;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            n = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            n = wo1.n("size ", i, " must be greater than zero.");
        }
        throw new IllegalArgumentException(n.toString());
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        c25.p(it, "iterator");
        return !it.hasNext() ? ts4.s : k75.a(new a(i, i2, it, z2, z, null));
    }

    @NotNull
    public static final <T> g75<List<T>> c(@NotNull g75<? extends T> g75Var, int i, int i2, boolean z, boolean z2) {
        c25.p(g75Var, "<this>");
        a(i, i2);
        return new b(g75Var, i, i2, z, z2);
    }
}