package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.fb0;

/* compiled from: MarginPageTransformer.java */
/* loaded from: classes.dex */
public final class cb0 implements fb0.m {
    private final int a;

    public cb0(@c2 int i) {
        jp.j(i, "Margin must be non-negative");
        this.a = i;
    }

    private fb0 b(@x1 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof fb0)) {
            return (fb0) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // com.p7700g.p99005.fb0.m
    public void a(@x1 View view, float f) {
        fb0 b = b(view);
        float f2 = this.a * f;
        if (b.getOrientation() == 0) {
            if (b.k()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}