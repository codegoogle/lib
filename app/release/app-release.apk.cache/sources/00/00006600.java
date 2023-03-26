package com.p7700g.p99005;

import android.view.Menu;
import android.view.MenuItem;
import com.anythink.core.api.ATAdConst;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Menu.kt */
@vo4(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a3\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", la1.l, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class xq {

    /* compiled from: Menu.kt */
    @vo4(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/MenuKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "iterator", "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements g75<MenuItem> {
        public final /* synthetic */ Menu a;

        public a(Menu menu) {
            this.a = menu;
        }

        @Override // com.p7700g.p99005.g75
        @NotNull
        public Iterator<MenuItem> iterator() {
            return xq.i(this.a);
        }
    }

    /* compiled from: Menu.kt */
    @vo4(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", la1.l, "", "hasNext", "", "next", la1.b, "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements Iterator<MenuItem>, q35 {
        private int s;
        public final /* synthetic */ Menu t;

        public b(Menu menu) {
            this.t = menu;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public MenuItem next() {
            Menu menu = this.t;
            int i = this.s;
            this.s = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s < this.t.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.t;
            int i = this.s - 1;
            this.s = i;
            menu.removeItem(i);
        }
    }

    public static final boolean a(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        c25.p(menu, "<this>");
        c25.p(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (c25.g(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@NotNull Menu menu, @NotNull f05<? super MenuItem, yq4> f05Var) {
        c25.p(menu, "<this>");
        c25.p(f05Var, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            c25.o(item, "getItem(index)");
            f05Var.M(item);
        }
    }

    public static final void c(@NotNull Menu menu, @NotNull j05<? super Integer, ? super MenuItem, yq4> j05Var) {
        c25.p(menu, "<this>");
        c25.p(j05Var, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            c25.o(item, "getItem(index)");
            j05Var.w3(valueOf, item);
        }
    }

    @NotNull
    public static final MenuItem d(@NotNull Menu menu, int i) {
        c25.p(menu, "<this>");
        MenuItem item = menu.getItem(i);
        c25.o(item, "getItem(index)");
        return item;
    }

    @NotNull
    public static final g75<MenuItem> e(@NotNull Menu menu) {
        c25.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@NotNull Menu menu) {
        c25.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@NotNull Menu menu) {
        c25.p(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean h(@NotNull Menu menu) {
        c25.p(menu, "<this>");
        return menu.size() != 0;
    }

    @NotNull
    public static final Iterator<MenuItem> i(@NotNull Menu menu) {
        c25.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        c25.p(menu, "<this>");
        c25.p(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}