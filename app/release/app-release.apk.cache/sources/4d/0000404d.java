package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.p7700g.p99005.ga2;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: classes3.dex */
public class ed2 extends BaseAdapter {
    public static final int s = md2.v().getMaximum(4);
    public final dd2 t;
    public final tc2<?> u;
    private Collection<Long> v;
    public qc2 w;
    public final oc2 x;

    public ed2(dd2 dd2Var, tc2<?> tc2Var, oc2 oc2Var) {
        this.t = dd2Var;
        this.u = tc2Var;
        this.x = oc2Var;
        this.v = tc2Var.X();
    }

    private void e(Context context) {
        if (this.w == null) {
            this.w = new qc2(context);
        }
    }

    private boolean h(long j) {
        Iterator<Long> it = this.u.X().iterator();
        while (it.hasNext()) {
            if (md2.a(j) == md2.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(@z1 TextView textView, long j) {
        pc2 pc2Var;
        if (textView == null) {
            return;
        }
        if (this.x.j().b(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                pc2Var = this.w.b;
            } else if (md2.t().getTimeInMillis() == j) {
                pc2Var = this.w.c;
            } else {
                pc2Var = this.w.a;
            }
        } else {
            textView.setEnabled(false);
            pc2Var = this.w.g;
        }
        pc2Var.f(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (dd2.e(j).equals(this.t)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.t.k(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.t.i();
    }

    @Override // android.widget.Adapter
    @z1
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.t.i() || i > i()) {
            return null;
        }
        return Long.valueOf(this.t.j(j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    @x1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, @z1 View view, @x1 ViewGroup viewGroup) {
        Long item;
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ga2.k.r0, viewGroup, false);
        }
        int b = i - b();
        if (b >= 0) {
            dd2 dd2Var = this.t;
            if (b < dd2Var.w) {
                int i2 = b + 1;
                textView.setTag(dd2Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, ej2.t, Integer.valueOf(i2)));
                long j = this.t.j(i2);
                if (this.t.u == dd2.g().u) {
                    textView.setContentDescription(uc2.g(j));
                } else {
                    textView.setContentDescription(uc2.l(j));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                k(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
    }

    public boolean f(int i) {
        return i % this.t.v == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.t.v == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return b() + this.t.w;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.t.v;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.t.i() + this.t.w) - 1;
    }

    public int j(int i) {
        return (i - this.t.i()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.v) {
            l(materialCalendarGridView, l.longValue());
        }
        tc2<?> tc2Var = this.u;
        if (tc2Var != null) {
            for (Long l2 : tc2Var.X()) {
                l(materialCalendarGridView, l2.longValue());
            }
            this.v = this.u.X();
        }
    }

    public boolean n(int i) {
        return i >= b() && i <= i();
    }
}