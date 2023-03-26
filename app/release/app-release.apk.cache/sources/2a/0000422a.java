package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.yc2;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes3.dex */
public class fd2 extends RecyclerView.g<b> {
    @x1
    private final oc2 c;
    private final tc2<?> d;
    private final yc2.l e;
    private final int f;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView s;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.s = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.s.getAdapter2().n(i)) {
                fd2.this.e.a(this.s.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.f0 {
        public final TextView H;
        public final MaterialCalendarGridView I;

        public b(@x1 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ga2.h.d3);
            this.H = textView;
            sr.B1(textView, true);
            this.I = (MaterialCalendarGridView) linearLayout.findViewById(ga2.h.Y2);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public fd2(@x1 Context context, tc2<?> tc2Var, @x1 oc2 oc2Var, yc2.l lVar) {
        dd2 n = oc2Var.n();
        dd2 k = oc2Var.k();
        dd2 m = oc2Var.m();
        if (n.compareTo(m) <= 0) {
            if (m.compareTo(k) <= 0) {
                this.f = (yc2.t(context) * ed2.s) + (zc2.B(context) ? yc2.t(context) : 0);
                this.c = oc2Var;
                this.d = tc2Var;
                this.e = lVar;
                D(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @x1
    public dd2 G(int i) {
        return this.c.n().n(i);
    }

    @x1
    public CharSequence H(int i) {
        return G(i).l();
    }

    public int I(@x1 dd2 dd2Var) {
        return this.c.n().o(dd2Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: J */
    public void u(@x1 b bVar, int i) {
        dd2 n = this.c.n().n(i);
        bVar.H.setText(n.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.I.findViewById(ga2.h.Y2);
        if (materialCalendarGridView.getAdapter2() != null && n.equals(materialCalendarGridView.getAdapter2().t)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            ed2 ed2Var = new ed2(n, this.d, this.c);
            materialCalendarGridView.setNumColumns(n.v);
            materialCalendarGridView.setAdapter((ListAdapter) ed2Var);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    /* renamed from: K */
    public b w(@x1 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ga2.k.w0, viewGroup, false);
        if (zc2.B(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.c.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i) {
        return this.c.n().n(i).m();
    }
}