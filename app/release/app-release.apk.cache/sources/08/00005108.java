package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.mr3.b;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: SliderViewAdapter.java */
/* loaded from: classes3.dex */
public abstract class mr3<VH extends b> extends ra0 {
    private a e;
    private Queue<VH> f = new LinkedList();

    /* compiled from: SliderViewAdapter.java */
    /* loaded from: classes3.dex */
    public interface a {
        void d();
    }

    /* compiled from: SliderViewAdapter.java */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public final View a;

        public b(View view) {
            this.a = view;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.ra0
    public final void b(ViewGroup viewGroup, int i, @x1 Object obj) {
        b bVar = (b) obj;
        viewGroup.removeView(bVar.a);
        this.f.add(bVar);
    }

    @Override // com.p7700g.p99005.ra0
    public int f(Object obj) {
        return -2;
    }

    @Override // com.p7700g.p99005.ra0
    @x1
    public Object j(@x1 ViewGroup viewGroup, int i) {
        VH poll = this.f.poll();
        if (poll == null) {
            poll = x(viewGroup);
        }
        viewGroup.addView(poll.a);
        w(poll, i);
        return poll;
    }

    @Override // com.p7700g.p99005.ra0
    public final boolean k(@x1 View view, @x1 Object obj) {
        return ((b) obj).a == view;
    }

    @Override // com.p7700g.p99005.ra0
    public void l() {
        super.l();
        a aVar = this.e;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void v(a aVar) {
        this.e = aVar;
    }

    public abstract void w(VH vh, int i);

    public abstract VH x(ViewGroup viewGroup);
}