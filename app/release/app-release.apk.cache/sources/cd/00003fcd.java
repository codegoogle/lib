package com.p7700g.p99005;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
public class e30 {
    public static final int a = -1;
    public static final int b = 1;
    public static final int c = Integer.MIN_VALUE;
    public static final int d = -1;
    public static final int e = 1;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean m;
    public boolean n;
    public boolean f = true;
    public int k = 0;
    public int l = 0;

    public boolean a(RecyclerView.c0 c0Var) {
        int i = this.h;
        return i >= 0 && i < c0Var.d();
    }

    public View b(RecyclerView.w wVar) {
        View p = wVar.p(this.h);
        this.h += this.i;
        return p;
    }

    public String toString() {
        StringBuilder G = wo1.G("LayoutState{mAvailable=");
        G.append(this.g);
        G.append(", mCurrentPosition=");
        G.append(this.h);
        G.append(", mItemDirection=");
        G.append(this.i);
        G.append(", mLayoutDirection=");
        G.append(this.j);
        G.append(", mStartLine=");
        G.append(this.k);
        G.append(", mEndLine=");
        return wo1.y(G, this.l, '}');
    }
}