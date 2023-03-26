package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.p7700g.p99005.i2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p4 implements tk {
    private static final String l = "MenuBuilder";
    private static final String m = "android:menu:presenters";
    private static final String n = "android:menu:actionviewstates";
    private static final String o = "android:menu:expandedactionview";
    private static final int[] p = {1, 4, 5, 3, 2, 0};
    private ContextMenu.ContextMenuInfo C;
    public CharSequence D;
    public Drawable E;
    public View F;
    private s4 N;
    private boolean P;
    private final Context q;
    private final Resources r;
    private boolean s;
    private boolean t;
    private a u;
    private int B = 0;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private ArrayList<s4> L = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<w4>> M = new CopyOnWriteArrayList<>();
    private boolean O = false;
    private ArrayList<s4> v = new ArrayList<>();
    private ArrayList<s4> w = new ArrayList<>();
    private boolean x = true;
    private ArrayList<s4> y = new ArrayList<>();
    private ArrayList<s4> z = new ArrayList<>();
    private boolean A = true;

    /* compiled from: MenuBuilder.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemSelected(@x1 p4 p4Var, @x1 MenuItem menuItem);

        void onMenuModeChange(@x1 p4 p4Var);
    }

    /* compiled from: MenuBuilder.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface b {
        boolean invokeItem(s4 s4Var);
    }

    public p4(Context context) {
        this.q = context;
        this.r = context.getResources();
        k0(true);
    }

    private static int E(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = p;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int i, boolean z) {
        if (i < 0 || i >= this.v.size()) {
            return;
        }
        this.v.remove(i);
        if (z) {
            N(true);
        }
    }

    private void d0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources F = F();
        if (view != null) {
            this.F = view;
            this.D = null;
            this.E = null;
        } else {
            if (i > 0) {
                this.D = F.getText(i);
            } else if (charSequence != null) {
                this.D = charSequence;
            }
            if (i2 > 0) {
                this.E = gh.i(x(), i2);
            } else if (drawable != null) {
                this.E = drawable;
            }
            this.F = null;
        }
        N(false);
    }

    private s4 h(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new s4(this, i, i2, i3, i4, charSequence, i5);
    }

    private void j(boolean z) {
        if (this.M.isEmpty()) {
            return;
        }
        m0();
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var = next.get();
            if (w4Var == null) {
                this.M.remove(next);
            } else {
                w4Var.updateMenuView(z);
            }
        }
        l0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(m);
        if (sparseParcelableArray == null || this.M.isEmpty()) {
            return;
        }
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var = next.get();
            if (w4Var == null) {
                this.M.remove(next);
            } else {
                int id = w4Var.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    w4Var.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void k0(boolean z) {
        boolean z2 = true;
        this.t = (z && this.r.getConfiguration().keyboard != 1 && tr.g(ViewConfiguration.get(this.q), this.q)) ? false : false;
    }

    private void l(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.M.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var = next.get();
            if (w4Var == null) {
                this.M.remove(next);
            } else {
                int id = w4Var.getId();
                if (id > 0 && (onSaveInstanceState = w4Var.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(m, sparseArray);
    }

    private boolean m(b5 b5Var, w4 w4Var) {
        if (this.M.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = w4Var != null ? w4Var.onSubMenuSelected(b5Var) : false;
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var2 = next.get();
            if (w4Var2 == null) {
                this.M.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = w4Var2.onSubMenuSelected(b5Var);
            }
        }
        return onSubMenuSelected;
    }

    private static int q(ArrayList<s4> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.D;
    }

    public View B() {
        return this.F;
    }

    public ArrayList<s4> C() {
        u();
        return this.z;
    }

    public boolean D() {
        return this.J;
    }

    public Resources F() {
        return this.r;
    }

    public p4 G() {
        return this;
    }

    @x1
    public ArrayList<s4> H() {
        if (this.x) {
            this.w.clear();
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                s4 s4Var = this.v.get(i);
                if (s4Var.isVisible()) {
                    this.w.add(s4Var);
                }
            }
            this.x = false;
            this.A = true;
            return this.w;
        }
        return this.w;
    }

    public boolean I() {
        return this.O;
    }

    public boolean J() {
        return this.s;
    }

    public boolean K() {
        return this.t;
    }

    public void L(s4 s4Var) {
        this.A = true;
        N(true);
    }

    public void M(s4 s4Var) {
        this.x = true;
        N(true);
    }

    public void N(boolean z) {
        if (!this.G) {
            if (z) {
                this.x = true;
                this.A = true;
            }
            j(z);
            return;
        }
        this.H = true;
        if (z) {
            this.I = true;
        }
    }

    public boolean O(MenuItem menuItem, int i) {
        return P(menuItem, null, i);
    }

    public boolean P(MenuItem menuItem, w4 w4Var, int i) {
        s4 s4Var = (s4) menuItem;
        if (s4Var == null || !s4Var.isEnabled()) {
            return false;
        }
        boolean n2 = s4Var.n();
        gq b2 = s4Var.b();
        boolean z = b2 != null && b2.hasSubMenu();
        if (s4Var.m()) {
            n2 |= s4Var.expandActionView();
            if (n2) {
                f(true);
            }
        } else if (s4Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                f(false);
            }
            if (!s4Var.hasSubMenu()) {
                s4Var.A(new b5(x(), this, s4Var));
            }
            b5 b5Var = (b5) s4Var.getSubMenu();
            if (z) {
                b2.onPrepareSubMenu(b5Var);
            }
            n2 |= m(b5Var, w4Var);
            if (!n2) {
                f(true);
            }
        } else if ((i & 1) == 0) {
            f(true);
        }
        return n2;
    }

    public void Q(int i) {
        R(i, true);
    }

    public void S(w4 w4Var) {
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var2 = next.get();
            if (w4Var2 == null || w4Var2 == w4Var) {
                this.M.remove(next);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((b5) item.getSubMenu()).T(bundle);
            }
        }
        int i2 = bundle.getInt(o);
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(o, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((b5) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.u = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.C = contextMenuInfo;
    }

    public p4 Z(int i) {
        this.B = i;
        return this;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int E = E(i3);
        s4 h = h(i, i2, i3, E, charSequence, this.B);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.C;
        if (contextMenuInfo != null) {
            h.y(contextMenuInfo);
        }
        ArrayList<s4> arrayList = this.v;
        arrayList.add(q(arrayList, E), h);
        N(true);
        return h;
    }

    public void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.v.size();
        m0();
        for (int i = 0; i < size; i++) {
            s4 s4Var = this.v.get(i);
            if (s4Var.getGroupId() == groupId && s4Var.p() && s4Var.isCheckable()) {
                s4Var.v(s4Var == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.q.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(w4 w4Var) {
        c(w4Var, this.q);
    }

    public p4 b0(int i) {
        d0(0, null, i, null, null);
        return this;
    }

    public void c(w4 w4Var, Context context) {
        this.M.add(new WeakReference<>(w4Var));
        w4Var.initForMenu(context, this);
        this.A = true;
    }

    public p4 c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        s4 s4Var = this.N;
        if (s4Var != null) {
            g(s4Var);
        }
        this.v.clear();
        N(true);
    }

    public void clearHeader() {
        this.E = null;
        this.D = null;
        this.F = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.u;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    public void e() {
        this.G = true;
        clear();
        clearHeader();
        this.M.clear();
        this.G = false;
        this.H = false;
        this.I = false;
        N(true);
    }

    public p4 e0(int i) {
        d0(i, null, 0, null, null);
        return this;
    }

    public final void f(boolean z) {
        if (this.K) {
            return;
        }
        this.K = true;
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var = next.get();
            if (w4Var == null) {
                this.M.remove(next);
            } else {
                w4Var.onCloseMenu(this, z);
            }
        }
        this.K = false;
    }

    public p4 f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            s4 s4Var = this.v.get(i2);
            if (s4Var.getItemId() == i) {
                return s4Var;
            }
            if (s4Var.hasSubMenu() && (findItem = s4Var.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(s4 s4Var) {
        boolean z = false;
        if (!this.M.isEmpty() && this.N == s4Var) {
            m0();
            Iterator<WeakReference<w4>> it = this.M.iterator();
            while (it.hasNext()) {
                WeakReference<w4> next = it.next();
                w4 w4Var = next.get();
                if (w4Var == null) {
                    this.M.remove(next);
                } else {
                    z = w4Var.collapseItemActionView(this, s4Var);
                    if (z) {
                        break;
                    }
                }
            }
            l0();
            if (z) {
                this.N = null;
            }
        }
        return z;
    }

    public p4 g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.v.get(i);
    }

    public void h0(boolean z) {
        this.J = z;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.P) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.v.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(@x1 p4 p4Var, @x1 MenuItem menuItem) {
        a aVar = this.u;
        return aVar != null && aVar.onMenuItemSelected(p4Var, menuItem);
    }

    public void i0(boolean z) {
        this.P = z;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return s(i, keyEvent) != null;
    }

    public void j0(boolean z) {
        if (this.t == z) {
            return;
        }
        k0(z);
        N(false);
    }

    public void l0() {
        this.G = false;
        if (this.H) {
            this.H = false;
            N(this.I);
        }
    }

    public void m0() {
        if (this.G) {
            return;
        }
        this.G = true;
        this.H = false;
        this.I = false;
    }

    public boolean n(s4 s4Var) {
        boolean z = false;
        if (this.M.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<w4>> it = this.M.iterator();
        while (it.hasNext()) {
            WeakReference<w4> next = it.next();
            w4 w4Var = next.get();
            if (w4Var == null) {
                this.M.remove(next);
            } else {
                z = w4Var.expandItemActionView(this, s4Var);
                if (z) {
                    break;
                }
            }
        }
        l0();
        if (z) {
            this.N = s4Var;
        }
        return z;
    }

    public int o(int i) {
        return p(i, 0);
    }

    public int p(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.v.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return O(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        s4 s = s(i, keyEvent);
        boolean O = s != null ? O(s, i2) : false;
        if ((i2 & 2) != 0) {
            f(true);
        }
        return O;
    }

    public int r(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.v.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int o2 = o(i);
        if (o2 >= 0) {
            int size = this.v.size() - o2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.v.get(o2).getGroupId() != i) {
                    break;
                }
                R(o2, false);
                i2 = i3;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        R(r(i), true);
    }

    public s4 s(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<s4> arrayList = this.L;
        arrayList.clear();
        t(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J = J();
        for (int i2 = 0; i2 < size; i2++) {
            s4 s4Var = arrayList.get(i2);
            if (J) {
                numericShortcut = s4Var.getAlphabeticShortcut();
            } else {
                numericShortcut = s4Var.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (J && numericShortcut == '\b' && i == 67))) {
                return s4Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            s4 s4Var = this.v.get(i2);
            if (s4Var.getGroupId() == i) {
                s4Var.w(z2);
                s4Var.setCheckable(z);
            }
        }
    }

    @Override // com.p7700g.p99005.tk, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.O = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            s4 s4Var = this.v.get(i2);
            if (s4Var.getGroupId() == i) {
                s4Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.v.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            s4 s4Var = this.v.get(i2);
            if (s4Var.getGroupId() == i && s4Var.B(z)) {
                z2 = true;
            }
        }
        if (z2) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.s = z;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.v.size();
    }

    public void t(List<s4> list, int i, KeyEvent keyEvent) {
        boolean J = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                s4 s4Var = this.v.get(i2);
                if (s4Var.hasSubMenu()) {
                    ((p4) s4Var.getSubMenu()).t(list, i, keyEvent);
                }
                char alphabeticShortcut = J ? s4Var.getAlphabeticShortcut() : s4Var.getNumericShortcut();
                if (((modifiers & tk.e) == ((J ? s4Var.getAlphabeticModifiers() : s4Var.getNumericModifiers()) & tk.e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J && alphabeticShortcut == '\b' && i == 67)) && s4Var.isEnabled()) {
                        list.add(s4Var);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<s4> H = H();
        if (this.A) {
            Iterator<WeakReference<w4>> it = this.M.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<w4> next = it.next();
                w4 w4Var = next.get();
                if (w4Var == null) {
                    this.M.remove(next);
                } else {
                    z |= w4Var.flagActionItems();
                }
            }
            if (z) {
                this.y.clear();
                this.z.clear();
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    s4 s4Var = H.get(i);
                    if (s4Var.o()) {
                        this.y.add(s4Var);
                    } else {
                        this.z.add(s4Var);
                    }
                }
            } else {
                this.y.clear();
                this.z.clear();
                this.z.addAll(H());
            }
            this.A = false;
        }
    }

    public ArrayList<s4> v() {
        u();
        return this.y;
    }

    public String w() {
        return n;
    }

    public Context x() {
        return this.q;
    }

    public s4 y() {
        return this.N;
    }

    public Drawable z() {
        return this.E;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.r.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.r.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        s4 s4Var = (s4) a(i, i2, i3, charSequence);
        b5 b5Var = new b5(this.q, this, s4Var);
        s4Var.A(b5Var);
        return b5Var;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.r.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.r.getString(i4));
    }
}