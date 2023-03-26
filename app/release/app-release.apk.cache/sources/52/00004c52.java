package com.p7700g.p99005;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes3.dex */
public class kd2 extends LinearLayoutManager {
    private static final float O = 100.0f;

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes3.dex */
    public class a extends f30 {
        public a(Context context) {
            super(context);
        }

        @Override // com.p7700g.p99005.f30
        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public kd2(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i);
        g2(aVar);
    }
}