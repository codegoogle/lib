package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.zg3;

/* compiled from: QurekaSSAdapter.java */
/* loaded from: classes3.dex */
public class lf3 extends RecyclerView.g<b> {
    public String[] c;
    public Context d;
    public c e;

    /* compiled from: QurekaSSAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            lf3.this.e.a();
        }
    }

    /* compiled from: QurekaSSAdapter.java */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.f0 {
        public ImageView H;

        public b(@x1 View itemView) {
            super(itemView);
            this.H = (ImageView) itemView.findViewById(zg3.e.L);
        }
    }

    /* compiled from: QurekaSSAdapter.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();
    }

    public lf3(Context context, String[] adsIdsList, c qurekaSSAdapterClick) {
        this.d = context;
        this.c = adsIdsList;
        this.e = qurekaSSAdapterClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: F */
    public void u(@x1 b holder, int position) {
        yo1.E(this.d).a(this.c[position]).p().E1(holder.H);
        holder.p.setOnClickListener(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    /* renamed from: G */
    public b w(@x1 ViewGroup parent, int viewType) {
        return new b(LayoutInflater.from(parent.getContext()).inflate(zg3.g.T, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.c.length;
    }
}