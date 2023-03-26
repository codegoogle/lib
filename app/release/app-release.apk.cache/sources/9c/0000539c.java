package com.p7700g.p99005;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x4;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o4 extends BaseAdapter {
    public p4 s;
    private int t = -1;
    private boolean u;
    private final boolean v;
    private final LayoutInflater w;
    private final int x;

    public o4(p4 p4Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.v = z;
        this.w = layoutInflater;
        this.s = p4Var;
        this.x = i;
        a();
    }

    public void a() {
        s4 y = this.s.y();
        if (y != null) {
            ArrayList<s4> C = this.s.C();
            int size = C.size();
            for (int i = 0; i < size; i++) {
                if (C.get(i) == y) {
                    this.t = i;
                    return;
                }
            }
        }
        this.t = -1;
    }

    public p4 b() {
        return this.s;
    }

    public boolean c() {
        return this.u;
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public s4 getItem(int i) {
        ArrayList<s4> C = this.v ? this.s.C() : this.s.H();
        int i2 = this.t;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return C.get(i);
    }

    public void e(boolean z) {
        this.u = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<s4> C = this.v ? this.s.C() : this.s.H();
        if (this.t < 0) {
            return C.size();
        }
        return C.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.w.inflate(this.x, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.s.I() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        x4.a aVar = (x4.a) view;
        if (this.u) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}