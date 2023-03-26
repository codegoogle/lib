package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.p7700g.p99005.cx;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    private ArrayList<View> s;
    private ArrayList<View> t;
    private View.OnApplyWindowInsetsListener u;
    private boolean v;

    public FragmentContainerView(@x1 Context context) {
        super(context);
        this.v = true;
    }

    private void a(@x1 View view) {
        ArrayList<View> arrayList = this.t;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@x1 View view, int i, @z1 ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.N0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@x1 View view, int i, @z1 ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.N0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    @e2(20)
    @x1
    public WindowInsets dispatchApplyWindowInsets(@x1 WindowInsets windowInsets) {
        gs f1;
        gs K = gs.K(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.u;
        if (onApplyWindowInsetsListener != null) {
            f1 = gs.K(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            f1 = sr.f1(this, K);
        }
        if (!f1.A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                sr.o(getChildAt(i), f1);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@x1 Canvas canvas) {
        if (this.v && this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                super.drawChild(canvas, this.s.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@x1 Canvas canvas, @x1 View view, long j) {
        ArrayList<View> arrayList;
        if (!this.v || (arrayList = this.s) == null || arrayList.size() <= 0 || !this.s.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@x1 View view) {
        ArrayList<View> arrayList = this.t;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.s;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.v = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @e2(20)
    @x1
    public WindowInsets onApplyWindowInsets(@x1 WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(@x1 View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@x1 View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@x1 View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.v = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@z1 LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@x1 View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.u = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@x1 View view) {
        if (view.getParent() == this) {
            if (this.t == null) {
                this.t = new ArrayList<>();
            }
            this.t.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.v = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cx.l.D);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(cx.l.E);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(wo1.w("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, "\""));
            }
        }
    }

    public FragmentContainerView(@x1 Context context, @x1 AttributeSet attributeSet, @x1 FragmentManager fragmentManager) {
        super(context, attributeSet);
        this.v = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cx.l.D);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(cx.l.E) : classAttribute;
        String string = obtainStyledAttributes.getString(cx.l.F);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment p0 = fragmentManager.p0(id);
        if (classAttribute != null && p0 == null) {
            if (id <= 0) {
                throw new IllegalStateException(wo1.u("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? wo1.t(" with tag ", string) : ""));
            }
            Fragment a = fragmentManager.E0().a(context.getClassLoader(), classAttribute);
            a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.r().Q(true).j(this, a, string).t();
        }
        fragmentManager.i1(this);
    }
}