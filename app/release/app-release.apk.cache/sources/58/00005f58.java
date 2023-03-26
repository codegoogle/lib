package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup.java */
/* loaded from: classes.dex */
public abstract class u4 implements z4, w4, AdapterView.OnItemClickListener {
    private Rect s;

    public static int d(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean m(p4 p4Var) {
        int size = p4Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = p4Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static o4 n(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (o4) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (o4) listAdapter;
    }

    public abstract void a(p4 p4Var);

    public boolean b() {
        return true;
    }

    public Rect c() {
        return this.s;
    }

    @Override // com.p7700g.p99005.w4
    public boolean collapseItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public abstract void e(View view);

    @Override // com.p7700g.p99005.w4
    public boolean expandItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public void f(Rect rect) {
        this.s = rect;
    }

    public abstract void g(boolean z);

    @Override // com.p7700g.p99005.w4
    public int getId() {
        return 0;
    }

    @Override // com.p7700g.p99005.w4
    public x4 getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void h(int i);

    public abstract void i(int i);

    @Override // com.p7700g.p99005.w4
    public void initForMenu(@x1 Context context, @z1 p4 p4Var) {
    }

    public abstract void j(PopupWindow.OnDismissListener onDismissListener);

    public abstract void k(boolean z);

    public abstract void l(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        n(listAdapter).s.P((MenuItem) listAdapter.getItem(i), this, b() ? 0 : 4);
    }
}