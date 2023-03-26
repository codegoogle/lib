package com.p7700g.p99005;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.yc2;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes3.dex */
public class nd2 extends RecyclerView.g<b> {
    private final yc2<?> c;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int s;

        public a(int i) {
            this.s = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            nd2.this.c.y(nd2.this.c.q().i(dd2.d(this.s, nd2.this.c.s().t)));
            nd2.this.c.z(yc2.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.f0 {
        public final TextView H;

        public b(TextView textView) {
            super(textView);
            this.H = textView;
        }
    }

    public nd2(yc2<?> yc2Var) {
        this.c = yc2Var;
    }

    @x1
    private View.OnClickListener G(int i) {
        return new a(i);
    }

    public int H(int i) {
        return i - this.c.q().n().u;
    }

    public int I(int i) {
        return this.c.q().n().u + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: J */
    public void u(@x1 b bVar, int i) {
        int I = I(i);
        String string = bVar.H.getContext().getString(ga2.m.R0);
        bVar.H.setText(String.format(Locale.getDefault(), ej2.t, Integer.valueOf(I)));
        bVar.H.setContentDescription(String.format(string, Integer.valueOf(I)));
        qc2 r = this.c.r();
        Calendar t = md2.t();
        pc2 pc2Var = t.get(1) == I ? r.f : r.d;
        for (Long l : this.c.e().X()) {
            t.setTimeInMillis(l.longValue());
            if (t.get(1) == I) {
                pc2Var = r.e;
            }
        }
        pc2Var.f(bVar.H);
        bVar.H.setOnClickListener(G(I));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    /* renamed from: K */
    public b w(@x1 ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ga2.k.A0, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.c.q().o();
    }
}