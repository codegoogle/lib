package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n4 implements w4, AdapterView.OnItemClickListener {
    private static final String s = "ListMenuPresenter";
    public static final String t = "android:menu:list";
    public int A;
    private w4.a B;
    public a C;
    private int D;
    public Context u;
    public LayoutInflater v;
    public p4 w;
    public ExpandedMenuView x;
    public int y;
    public int z;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private int s = -1;

        public a() {
            a();
        }

        public void a() {
            s4 y = n4.this.w.y();
            if (y != null) {
                ArrayList<s4> C = n4.this.w.C();
                int size = C.size();
                for (int i = 0; i < size; i++) {
                    if (C.get(i) == y) {
                        this.s = i;
                        return;
                    }
                }
            }
            this.s = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public s4 getItem(int i) {
            ArrayList<s4> C = n4.this.w.C();
            int i2 = i + n4.this.y;
            int i3 = this.s;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return C.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = n4.this.w.C().size() - n4.this.y;
            return this.s < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                n4 n4Var = n4.this;
                view = n4Var.v.inflate(n4Var.A, viewGroup, false);
            }
            ((x4.a) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public n4(Context context, int i) {
        this(i, 0);
        this.u = context;
        this.v = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.C == null) {
            this.C = new a();
        }
        return this.C;
    }

    public int b() {
        return this.y;
    }

    public void c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t);
        if (sparseParcelableArray != null) {
            this.x.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // com.p7700g.p99005.w4
    public boolean collapseItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public void d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.x;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(t, sparseArray);
    }

    public void e(int i) {
        this.D = i;
    }

    @Override // com.p7700g.p99005.w4
    public boolean expandItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public void f(int i) {
        this.y = i;
        if (this.x != null) {
            updateMenuView(false);
        }
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public int getId() {
        return this.D;
    }

    @Override // com.p7700g.p99005.w4
    public x4 getMenuView(ViewGroup viewGroup) {
        if (this.x == null) {
            this.x = (ExpandedMenuView) this.v.inflate(x2.j.n, viewGroup, false);
            if (this.C == null) {
                this.C = new a();
            }
            this.x.setAdapter((ListAdapter) this.C);
            this.x.setOnItemClickListener(this);
        }
        return this.x;
    }

    @Override // com.p7700g.p99005.w4
    public void initForMenu(Context context, p4 p4Var) {
        if (this.z != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.z);
            this.u = contextThemeWrapper;
            this.v = LayoutInflater.from(contextThemeWrapper);
        } else if (this.u != null) {
            this.u = context;
            if (this.v == null) {
                this.v = LayoutInflater.from(context);
            }
        }
        this.w = p4Var;
        a aVar = this.C;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        w4.a aVar = this.B;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.w.P(this.C.getItem(i), this, 0);
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(Parcelable parcelable) {
        c((Bundle) parcelable);
    }

    @Override // com.p7700g.p99005.w4
    public Parcelable onSaveInstanceState() {
        if (this.x == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d(bundle);
        return bundle;
    }

    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        if (b5Var.hasVisibleItems()) {
            new q4(b5Var).c(null);
            w4.a aVar = this.B;
            if (aVar != null) {
                aVar.onOpenSubMenu(b5Var);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(w4.a aVar) {
        this.B = aVar;
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        a aVar = this.C;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n4(int i, int i2) {
        this.A = i;
        this.z = i2;
    }
}