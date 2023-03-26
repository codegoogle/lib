package com.p7700g.p99005;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public class o30 {
    private o30() {
    }

    public static int a(RecyclerView.c0 c0Var, l30 l30Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1;
        }
        return Math.min(l30Var.o(), l30Var.d(view2) - l30Var.g(view));
    }

    public static int b(RecyclerView.c0 c0Var, l30 l30Var, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        int max;
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.s0(view), oVar.s0(view2));
        int max2 = Math.max(oVar.s0(view), oVar.s0(view2));
        if (z2) {
            max = Math.max(0, (c0Var.d() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(l30Var.d(view2) - l30Var.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1))) + (l30Var.n() - l30Var.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.c0 c0Var, l30 l30Var, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0Var.d();
        }
        return (int) (((l30Var.d(view2) - l30Var.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1)) * c0Var.d());
    }
}