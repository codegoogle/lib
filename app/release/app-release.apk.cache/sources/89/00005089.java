package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p7700g.p99005.mr3;
import com.superapp.filemanager.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SliderAdapter.java */
/* loaded from: classes.dex */
public class mg0 extends mr3<b> {
    private Context g;
    private List<Integer> h;
    public c i;

    /* compiled from: SliderAdapter.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            mg0.this.i.a(v);
        }
    }

    /* compiled from: SliderAdapter.java */
    /* loaded from: classes.dex */
    public class b extends mr3.b {
        public View b;
        public ImageView c;

        public b(View itemView) {
            super(itemView);
            this.c = (ImageView) itemView.findViewById(R.id.image);
            this.b = itemView;
        }
    }

    /* compiled from: SliderAdapter.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(View v);
    }

    public mg0(Context context, ArrayList<Integer> mSliderItems, c slider_adapter_click) {
        this.h = new ArrayList();
        this.g = context;
        this.h = mSliderItems;
        this.i = slider_adapter_click;
    }

    @Override // com.p7700g.p99005.ra0
    public int e() {
        return this.h.size();
    }

    @Override // com.p7700g.p99005.mr3
    /* renamed from: y */
    public void w(b viewHolder, final int position) {
        viewHolder.c.setImageResource(this.h.get(position).intValue());
        viewHolder.b.setOnClickListener(new a());
    }

    @Override // com.p7700g.p99005.mr3
    /* renamed from: z */
    public b x(ViewGroup parent) {
        return new b(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_slider, (ViewGroup) null));
    }
}