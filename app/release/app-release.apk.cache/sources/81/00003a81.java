package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.p7700g.p99005.m80;
import java.util.ArrayList;

/* compiled from: GhostViewHolder.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class b80 extends FrameLayout {
    @x1
    private ViewGroup s;
    private boolean t;

    public b80(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.s = viewGroup;
        viewGroup.setTag(m80.e.k, this);
        f90.b(this.s).c(this);
        this.t = true;
    }

    public static b80 b(@x1 ViewGroup viewGroup) {
        return (b80) viewGroup.getTag(m80.e.k);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            d(((d80) getChildAt(i2)).u, arrayList2);
            if (f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(f90.a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    public void a(d80 d80Var) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(d80Var.u, arrayList);
        int c = c(arrayList);
        if (c >= 0 && c < getChildCount()) {
            addView(d80Var, c);
        } else {
            addView(d80Var);
        }
    }

    public void g() {
        if (this.t) {
            f90.b(this.s).d(this);
            f90.b(this.s).c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.t) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.s.setTag(m80.e.k, null);
            f90.b(this.s).d(this);
            this.t = false;
        }
    }
}