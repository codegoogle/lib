package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ChangeScroll.java */
/* loaded from: classes.dex */
public class t70 extends s80 {
    private static final String I0 = "android:changeScroll:x";
    private static final String J0 = "android:changeScroll:y";
    private static final String[] K0 = {I0, J0};

    public t70() {
    }

    private void Q0(z80 z80Var) {
        z80Var.a.put(I0, Integer.valueOf(z80Var.b.getScrollX()));
        z80Var.a.put(J0, Integer.valueOf(z80Var.b.getScrollY()));
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (z80Var == null || z80Var2 == null) {
            return null;
        }
        View view = z80Var2.b;
        int intValue = ((Integer) z80Var.a.get(I0)).intValue();
        int intValue2 = ((Integer) z80Var2.a.get(I0)).intValue();
        int intValue3 = ((Integer) z80Var.a.get(J0)).intValue();
        int intValue4 = ((Integer) z80Var2.a.get(J0)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return y80.c(objectAnimator, objectAnimator2);
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public String[] h0() {
        return K0;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    public t70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}