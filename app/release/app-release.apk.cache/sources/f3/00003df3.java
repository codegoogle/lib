package com.p7700g.p99005;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.o20;

/* compiled from: ItemTouchUIUtilImpl.java */
/* loaded from: classes.dex */
public class d30 implements c30 {
    public static final c30 a = new d30();

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float Q = sr.Q(childAt);
                if (Q > f) {
                    f = Q;
                }
            }
        }
        return f;
    }

    @Override // com.p7700g.p99005.c30
    public void a(View view) {
        int i = o20.e.V;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            sr.M1(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // com.p7700g.p99005.c30
    public void b(View view) {
    }

    @Override // com.p7700g.p99005.c30
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // com.p7700g.p99005.c30
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = o20.e.V;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(sr.Q(view));
                sr.M1(view, e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}