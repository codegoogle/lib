package com.p7700g.p99005;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentViewHolder.java */
/* loaded from: classes.dex */
public final class wa0 extends RecyclerView.f0 {
    private wa0(@x1 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @x1
    public static wa0 O(@x1 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(sr.C());
        frameLayout.setSaveEnabled(false);
        return new wa0(frameLayout);
    }

    @x1
    public FrameLayout P() {
        return (FrameLayout) this.p;
    }
}