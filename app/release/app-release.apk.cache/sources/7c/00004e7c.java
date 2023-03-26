package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ng0;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* compiled from: RecycerViewAdapter.java */
/* loaded from: classes.dex */
public class lg0 extends RecyclerView.g<RecyclerView.f0> {
    private Context c;
    private ArrayList<Integer> d;
    private d e;
    private boolean f = true;
    public Integer g;
    public ng0.b h;

    /* compiled from: RecycerViewAdapter.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            lg0.this.e.a(view);
        }
    }

    /* compiled from: RecycerViewAdapter.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.f0 {
        public LinearLayout H;

        public b(@x1 View itemView) {
            super(itemView);
            this.H = (LinearLayout) itemView.findViewById(R.id.ads);
        }
    }

    /* compiled from: RecycerViewAdapter.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.f0 {
        public ImageView H;

        public c(@x1 View itemView) {
            super(itemView);
            this.H = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    /* compiled from: RecycerViewAdapter.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(View v);
    }

    public lg0(Context context, ArrayList<Integer> list, Integer layoutId, ng0.b animationType, d recycerViewAdapter_click) {
        this.c = context;
        this.d = list;
        this.e = recycerViewAdapter_click;
        this.g = layoutId;
        this.h = animationType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int g(int position) {
        return this.d.get(position).intValue() == -1 ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void u(@x1 RecyclerView.f0 holder, int position) {
        ng0.a(this.c, holder.p, this.h);
        if (holder.l() == -1) {
            b bVar = (b) holder;
            if (this.f) {
                this.f = false;
                ng3.n((Activity) this.c, bVar.H);
                return;
            }
            this.f = true;
            ng3.m((Activity) this.c, bVar.H);
            return;
        }
        c cVar = (c) holder;
        cVar.H.setImageResource(this.d.get(position).intValue());
        cVar.p.setOnClickListener(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    public RecyclerView.f0 w(@x1 ViewGroup parent, int viewType) {
        if (viewType == -1) {
            return new b(LayoutInflater.from(this.c).inflate(R.layout.ads_viewholder, parent, false));
        }
        return new c(LayoutInflater.from(this.c).inflate(this.g.intValue(), parent, false));
    }
}