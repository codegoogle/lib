package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewGroup.kt */
@vo4(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a3\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u001aH\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\bø\u0001\u0000\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", com.anythink.expressad.a.B, "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", la1.l, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", com.anythink.expressad.foundation.d.c.bR, "end", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class vr {

    /* compiled from: ViewGroup.kt */
    @vo4(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/ViewGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "iterator", "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements g75<View> {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<View> iterator() {
            return vr.k(this.a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @mw4(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {118, 120}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends rw4 implements j05<i75<? super View>, uv4<? super yq4>, Object> {
        public final /* synthetic */ ViewGroup A;
        public Object u;
        public Object v;
        public int w;
        public int x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, uv4<? super b> uv4Var) {
            super(2, uv4Var);
            this.A = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008e -> B:22:0x0090). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:24:0x009b). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            i75 i75Var;
            ViewGroup viewGroup;
            int i;
            int childCount;
            b bVar;
            b bVar2;
            i75 i75Var2;
            ViewGroup viewGroup2;
            View view;
            int i2;
            Object h = gw4.h();
            int i3 = this.y;
            if (i3 == 0) {
                rp4.n(obj);
                i75Var = (i75) this.z;
                viewGroup = this.A;
                i = 0;
                childCount = viewGroup.getChildCount();
                bVar = this;
                if (i >= childCount) {
                }
            } else if (i3 == 1) {
                i2 = this.x;
                i = this.w;
                view = (View) this.v;
                viewGroup2 = (ViewGroup) this.u;
                i75Var2 = (i75) this.z;
                rp4.n(obj);
                bVar2 = this;
                if (view instanceof ViewGroup) {
                }
            } else if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i2 = this.x;
                i = this.w;
                ViewGroup viewGroup3 = (ViewGroup) this.u;
                i75 i75Var3 = (i75) this.z;
                rp4.n(obj);
                bVar2 = this;
                i75 i75Var4 = i75Var3;
                bVar = bVar2;
                i75Var = i75Var4;
                ViewGroup viewGroup4 = viewGroup3;
                childCount = i2;
                viewGroup = viewGroup4;
                i++;
                if (i >= childCount) {
                    View childAt = viewGroup.getChildAt(i);
                    c25.o(childAt, "getChildAt(index)");
                    bVar.z = i75Var;
                    bVar.u = viewGroup;
                    bVar.v = childAt;
                    bVar.w = i;
                    bVar.x = childCount;
                    bVar.y = 1;
                    if (i75Var.b(childAt, bVar) == h) {
                        return h;
                    }
                    i75Var2 = i75Var;
                    bVar2 = bVar;
                    viewGroup2 = viewGroup;
                    i2 = childCount;
                    view = childAt;
                    if (view instanceof ViewGroup) {
                        childCount = i2;
                        viewGroup = viewGroup2;
                        bVar = bVar2;
                        i75Var = i75Var2;
                        i++;
                        if (i >= childCount) {
                        }
                    } else {
                        g75<View> f = vr.f((ViewGroup) view);
                        bVar2.z = i75Var2;
                        bVar2.u = viewGroup2;
                        bVar2.v = null;
                        bVar2.w = i;
                        bVar2.x = i2;
                        bVar2.y = 2;
                        if (i75Var2.e(f, bVar2) == h) {
                            return h;
                        }
                        viewGroup3 = viewGroup2;
                        i75Var3 = i75Var2;
                        i75 i75Var42 = i75Var3;
                        bVar = bVar2;
                        i75Var = i75Var42;
                        ViewGroup viewGroup42 = viewGroup3;
                        childCount = i2;
                        viewGroup = viewGroup42;
                        i++;
                        if (i >= childCount) {
                            return yq4.a;
                        }
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            b bVar = new b(this.A, uv4Var);
            bVar.z = obj;
            return bVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super View> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((b) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @vo4(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", la1.l, "", "hasNext", "", "next", la1.b, "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c implements Iterator<View>, q35 {
        private int s;
        public final /* synthetic */ ViewGroup t;

        public c(ViewGroup viewGroup) {
            this.t = viewGroup;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.t;
            int i = this.s;
            this.s = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s < this.t.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.t;
            int i = this.s - 1;
            this.s = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final boolean a(@NotNull ViewGroup viewGroup, @NotNull View view) {
        c25.p(viewGroup, "<this>");
        c25.p(view, com.anythink.expressad.a.B);
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@NotNull ViewGroup viewGroup, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(viewGroup, "<this>");
        c25.p(f05Var, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            c25.o(childAt, "getChildAt(index)");
            f05Var.M(childAt);
        }
    }

    public static final void c(@NotNull ViewGroup viewGroup, @NotNull j05<? super Integer, ? super View, yq4> j05Var) {
        c25.p(viewGroup, "<this>");
        c25.p(j05Var, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            c25.o(childAt, "getChildAt(index)");
            j05Var.w3(valueOf, childAt);
        }
    }

    @NotNull
    public static final View d(@NotNull ViewGroup viewGroup, int i) {
        c25.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder H = wo1.H("Index: ", i, ", Size: ");
        H.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(H.toString());
    }

    @NotNull
    public static final g75<View> e(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @NotNull
    public static final g75<View> f(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return k75.b(new b(viewGroup, null));
    }

    @NotNull
    public static final c55 g(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return i55.z1(0, viewGroup.getChildCount());
    }

    public static final int h(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean i(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @NotNull
    public static final Iterator<View> k(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, "<this>");
        return new c(viewGroup);
    }

    public static final void l(@NotNull ViewGroup viewGroup, @NotNull View view) {
        c25.p(viewGroup, "<this>");
        c25.p(view, com.anythink.expressad.a.B);
        viewGroup.removeView(view);
    }

    public static final void m(@NotNull ViewGroup viewGroup, @NotNull View view) {
        c25.p(viewGroup, "<this>");
        c25.p(view, com.anythink.expressad.a.B);
        viewGroup.addView(view);
    }

    public static final void n(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @c2 int i) {
        c25.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void o(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @c2 int i, @c2 int i2, @c2 int i3, @c2 int i4) {
        c25.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        c25.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @e2(17)
    public static final void q(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @c2 int i, @c2 int i2, @c2 int i3, @c2 int i4) {
        c25.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        c25.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}