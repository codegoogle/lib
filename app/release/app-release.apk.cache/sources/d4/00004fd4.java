package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class m4 extends u4 implements w4, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int t = x2.j.l;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 200;
    private final int A;
    private final boolean B;
    public final Handler C;
    private View K;
    public View L;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private boolean S;
    private w4.a T;
    public ViewTreeObserver U;
    private PopupWindow.OnDismissListener V;
    public boolean W;
    private final Context x;
    private final int y;
    private final int z;
    private final List<p4> D = new ArrayList();
    public final List<d> E = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener F = new a();
    private final View.OnAttachStateChangeListener G = new b();
    private final MenuItemHoverListener H = new c();
    private int I = 0;
    private int J = 0;
    private boolean R = false;
    private int M = s();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m4.this.isShowing() || m4.this.E.size() <= 0 || m4.this.E.get(0).a.isModal()) {
                return;
            }
            View view = m4.this.L;
            if (view != null && view.isShown()) {
                for (d dVar : m4.this.E) {
                    dVar.a.show();
                }
                return;
            }
            m4.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = m4.this.U;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    m4.this.U = view.getViewTreeObserver();
                }
                m4 m4Var = m4.this;
                m4Var.U.removeGlobalOnLayoutListener(m4Var.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements MenuItemHoverListener {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d s;
            public final /* synthetic */ MenuItem t;
            public final /* synthetic */ p4 u;

            public a(d dVar, MenuItem menuItem, p4 p4Var) {
                this.s = dVar;
                this.t = menuItem;
                this.u = p4Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.s;
                if (dVar != null) {
                    m4.this.W = true;
                    dVar.b.f(false);
                    m4.this.W = false;
                }
                if (this.t.isEnabled() && this.t.hasSubMenu()) {
                    this.u.O(this.t, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(@x1 p4 p4Var, @x1 MenuItem menuItem) {
            m4.this.C.removeCallbacksAndMessages(null);
            int size = m4.this.E.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (p4Var == m4.this.E.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            m4.this.C.postAtTime(new a(i2 < m4.this.E.size() ? m4.this.E.get(i2) : null, menuItem, p4Var), p4Var, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(@x1 p4 p4Var, @x1 MenuItem menuItem) {
            m4.this.C.removeCallbacksAndMessages(p4Var);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {
        public final MenuPopupWindow a;
        public final p4 b;
        public final int c;

        public d(@x1 MenuPopupWindow menuPopupWindow, @x1 p4 p4Var, int i) {
            this.a = menuPopupWindow;
            this.b = p4Var;
            this.c = i;
        }

        public ListView a() {
            return this.a.getListView();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public m4(@x1 Context context, @x1 View view, @q0 int i, @m2 int i2, boolean z) {
        this.x = context;
        this.K = view;
        this.z = i;
        this.A = i2;
        this.B = z;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(x2.e.x));
        this.C = new Handler();
    }

    private MenuPopupWindow o() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.x, null, this.z, this.A);
        menuPopupWindow.setHoverListener(this.H);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.K);
        menuPopupWindow.setDropDownGravity(this.J);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    private int p(@x1 p4 p4Var) {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            if (p4Var == this.E.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem q(@x1 p4 p4Var, @x1 p4 p4Var2) {
        int size = p4Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = p4Var.getItem(i);
            if (item.hasSubMenu() && p4Var2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @z1
    private View r(@x1 d dVar, @x1 p4 p4Var) {
        o4 o4Var;
        int i;
        int firstVisiblePosition;
        MenuItem q = q(dVar.b, p4Var);
        if (q == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            o4Var = (o4) headerViewListAdapter.getWrappedAdapter();
        } else {
            o4Var = (o4) adapter;
            i = 0;
        }
        int count = o4Var.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (q == o4Var.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int s() {
        return sr.Y(this.K) == 1 ? 0 : 1;
    }

    private int t(int i) {
        List<d> list = this.E;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.L.getWindowVisibleDisplayFrame(rect);
        if (this.M == 1) {
            return (a2.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    private void u(@x1 p4 p4Var) {
        d dVar;
        View view;
        int i;
        int i2;
        int width;
        LayoutInflater from = LayoutInflater.from(this.x);
        o4 o4Var = new o4(p4Var, from, this.B, t);
        if (!isShowing() && this.R) {
            o4Var.e(true);
        } else if (isShowing()) {
            o4Var.e(u4.m(p4Var));
        }
        int d2 = u4.d(o4Var, null, this.x, this.y);
        MenuPopupWindow o = o();
        o.setAdapter(o4Var);
        o.setContentWidth(d2);
        o.setDropDownGravity(this.J);
        if (this.E.size() > 0) {
            List<d> list = this.E;
            dVar = list.get(list.size() - 1);
            view = r(dVar, p4Var);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            o.setTouchModal(false);
            o.setEnterTransition(null);
            int t2 = t(d2);
            boolean z = t2 == 1;
            this.M = t2;
            if (Build.VERSION.SDK_INT >= 26) {
                o.setAnchorView(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.K.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.J & 7) == 5) {
                    iArr[0] = this.K.getWidth() + iArr[0];
                    iArr2[0] = view.getWidth() + iArr2[0];
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.J & 5) != 5) {
                if (z) {
                    width = i + view.getWidth();
                    o.setHorizontalOffset(width);
                    o.setOverlapAnchor(true);
                    o.setVerticalOffset(i2);
                }
                width = i - d2;
                o.setHorizontalOffset(width);
                o.setOverlapAnchor(true);
                o.setVerticalOffset(i2);
            } else if (!z) {
                d2 = view.getWidth();
                width = i - d2;
                o.setHorizontalOffset(width);
                o.setOverlapAnchor(true);
                o.setVerticalOffset(i2);
            } else {
                width = i + d2;
                o.setHorizontalOffset(width);
                o.setOverlapAnchor(true);
                o.setVerticalOffset(i2);
            }
        } else {
            if (this.N) {
                o.setHorizontalOffset(this.P);
            }
            if (this.O) {
                o.setVerticalOffset(this.Q);
            }
            o.setEpicenterBounds(c());
        }
        this.E.add(new d(o, p4Var, this.M));
        o.show();
        ListView listView = o.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.S && p4Var.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(x2.j.s, (ViewGroup) listView, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(p4Var.A());
            listView.addHeaderView(frameLayout, null, false);
            o.show();
        }
    }

    @Override // com.p7700g.p99005.u4
    public void a(p4 p4Var) {
        p4Var.c(this, this.x);
        if (isShowing()) {
            u(p4Var);
        } else {
            this.D.add(p4Var);
        }
    }

    @Override // com.p7700g.p99005.u4
    public boolean b() {
        return false;
    }

    @Override // com.p7700g.p99005.z4
    public void dismiss() {
        int size = this.E.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.E.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // com.p7700g.p99005.u4
    public void e(@x1 View view) {
        if (this.K != view) {
            this.K = view;
            this.J = nq.d(this.I, sr.Y(view));
        }
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    @Override // com.p7700g.p99005.u4
    public void g(boolean z) {
        this.R = z;
    }

    @Override // com.p7700g.p99005.z4
    public ListView getListView() {
        if (this.E.isEmpty()) {
            return null;
        }
        List<d> list = this.E;
        return list.get(list.size() - 1).a();
    }

    @Override // com.p7700g.p99005.u4
    public void h(int i) {
        if (this.I != i) {
            this.I = i;
            this.J = nq.d(i, sr.Y(this.K));
        }
    }

    @Override // com.p7700g.p99005.u4
    public void i(int i) {
        this.N = true;
        this.P = i;
    }

    @Override // com.p7700g.p99005.z4
    public boolean isShowing() {
        return this.E.size() > 0 && this.E.get(0).a.isShowing();
    }

    @Override // com.p7700g.p99005.u4
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // com.p7700g.p99005.u4
    public void k(boolean z) {
        this.S = z;
    }

    @Override // com.p7700g.p99005.u4
    public void l(int i) {
        this.O = true;
        this.Q = i;
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        int p = p(p4Var);
        if (p < 0) {
            return;
        }
        int i = p + 1;
        if (i < this.E.size()) {
            this.E.get(i).b.f(false);
        }
        d remove = this.E.remove(p);
        remove.b.S(this);
        if (this.W) {
            remove.a.setExitTransition(null);
            remove.a.setAnimationStyle(0);
        }
        remove.a.dismiss();
        int size = this.E.size();
        if (size > 0) {
            this.M = this.E.get(size - 1).c;
        } else {
            this.M = s();
        }
        if (size != 0) {
            if (z) {
                this.E.get(0).b.f(false);
                return;
            }
            return;
        }
        dismiss();
        w4.a aVar = this.T;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.U.removeGlobalOnLayoutListener(this.F);
            }
            this.U = null;
        }
        this.L.removeOnAttachStateChangeListener(this.G);
        this.V.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.E.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.E.get(i);
            if (!dVar.a.isShowing()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.f(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // com.p7700g.p99005.w4
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        for (d dVar : this.E) {
            if (b5Var == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (b5Var.hasVisibleItems()) {
            a(b5Var);
            w4.a aVar = this.T;
            if (aVar != null) {
                aVar.onOpenSubMenu(b5Var);
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(w4.a aVar) {
        this.T = aVar;
    }

    @Override // com.p7700g.p99005.z4
    public void show() {
        if (isShowing()) {
            return;
        }
        for (p4 p4Var : this.D) {
            u(p4Var);
        }
        this.D.clear();
        View view = this.K;
        this.L = view;
        if (view != null) {
            boolean z = this.U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.U = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            this.L.addOnAttachStateChangeListener(this.G);
        }
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        for (d dVar : this.E) {
            u4.n(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }
}