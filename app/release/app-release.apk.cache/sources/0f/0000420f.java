package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.tf2;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes2.dex */
public class fb2 extends tf2 {
    public static final int E = 5;

    /* compiled from: BottomNavigationView.java */
    /* loaded from: classes2.dex */
    public class a implements kf2.e {
        public a() {
        }

        @Override // com.p7700g.p99005.kf2.e
        @x1
        public gs a(View view, @x1 gs gsVar, @x1 kf2.f fVar) {
            fVar.d = gsVar.o() + fVar.d;
            boolean z = sr.Y(view) == 1;
            int p = gsVar.p();
            int q = gsVar.q();
            fVar.a += z ? q : p;
            int i = fVar.c;
            if (!z) {
                p = q;
            }
            fVar.c = i + p;
            fVar.a(view);
            return gsVar;
        }
    }

    /* compiled from: BottomNavigationView.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends tf2.c {
    }

    /* compiled from: BottomNavigationView.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface c extends tf2.d {
    }

    public fb2(@x1 Context context) {
        this(context, null);
    }

    private void k(@x1 Context context) {
        View view = new View(context);
        view.setBackgroundColor(gh.f(context, ga2.e.U));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(ga2.f.a1)));
        addView(view);
    }

    private void l() {
        kf2.d(this, new a());
    }

    private int n(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        int paddingTop = getPaddingTop();
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
    }

    private boolean o() {
        return false;
    }

    @Override // com.p7700g.p99005.tf2
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public rf2 d(@x1 Context context) {
        return new eb2(context);
    }

    @Override // com.p7700g.p99005.tf2
    public int getMaxItemCount() {
        return 5;
    }

    public boolean m() {
        return ((eb2) getMenuView()).t();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, n(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        eb2 eb2Var = (eb2) getMenuView();
        if (eb2Var.t() != z) {
            eb2Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@z1 b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@z1 c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public fb2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.P0);
    }

    public fb2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, ga2.n.be);
    }

    public fb2(@x1 Context context, @z1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        TintTypedArray k = cf2.k(context2, attributeSet, ga2.o.G4, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(k.getBoolean(ga2.o.I4, true));
        int i3 = ga2.o.H4;
        if (k.hasValue(i3)) {
            setMinimumHeight(k.getDimensionPixelSize(i3, 0));
        }
        k.recycle();
        if (o()) {
            k(context2);
        }
        l();
    }
}