package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* compiled from: ChooseRowBtnAdapter.java */
/* loaded from: classes.dex */
public class kg0 extends RecyclerView.g<c> {
    private Context c;
    private ArrayList<qg0> d;
    private ArrayList<qg0> e;
    private b f;
    private Integer g;

    /* compiled from: ChooseRowBtnAdapter.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ c s;

        public a(final c val$holder) {
            this.s = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((qg0) kg0.this.d.get(this.s.j())).b().booleanValue()) {
                ((qg0) kg0.this.d.get(this.s.j())).d(Boolean.FALSE);
            } else {
                ((qg0) kg0.this.d.get(this.s.j())).d(Boolean.TRUE);
            }
            kg0.this.j();
            kg0.this.f.a(view, Integer.valueOf(this.s.j()));
        }
    }

    /* compiled from: ChooseRowBtnAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(View v, Integer pos);
    }

    /* compiled from: ChooseRowBtnAdapter.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.f0 {
        public ImageView H;

        public c(@x1 View itemView) {
            super(itemView);
            this.H = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public kg0(Context context, ArrayList<qg0> unselectedList, ArrayList<qg0> selectedList, Integer layoutId, b chooseRowBtnAdapter_click) {
        this.c = context;
        this.d = unselectedList;
        this.e = selectedList;
        this.g = layoutId;
        this.f = chooseRowBtnAdapter_click;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: H */
    public void u(@x1 c holder, int position) {
        if (this.d.get(position).b().booleanValue()) {
            holder.H.setImageResource(this.e.get(position).a().intValue());
        } else {
            holder.H.setImageResource(this.d.get(position).a().intValue());
        }
        holder.H.setOnClickListener(new a(holder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @x1
    /* renamed from: I */
    public c w(@x1 ViewGroup parent, int viewType) {
        return new c(LayoutInflater.from(this.c).inflate(this.g.intValue(), parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.d.size();
    }
}