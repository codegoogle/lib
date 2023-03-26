package com.p7700g.p99005;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes.dex */
public final class ya0 {
    private static final ViewGroup.MarginLayoutParams a;
    private LinearLayoutManager b;

    /* compiled from: AnimateLayoutChangeDetector.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<int[]> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public ya0(@x1 LinearLayoutManager linearLayoutManager) {
        this.b = linearLayoutManager;
    }

    private boolean a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int Q = this.b.Q();
        if (Q == 0) {
            return true;
        }
        boolean z = this.b.Q2() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, Q, 2);
        for (int i3 = 0; i3 < Q; i3++) {
            View P = this.b.P(i3);
            if (P != null) {
                ViewGroup.LayoutParams layoutParams = P.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = a;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = P.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = P.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = P.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = P.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new a());
        for (int i4 = 1; i4 < Q; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[Q - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    private boolean b() {
        int Q = this.b.Q();
        for (int i = 0; i < Q; i++) {
            if (c(this.b.P(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d() {
        return (!a() || this.b.Q() <= 1) && b();
    }
}