package com.p7700g.p99005;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* compiled from: ExpandableWidgetHelper.java */
/* loaded from: classes3.dex */
public final class yd2 {
    @x1
    private final View a;
    private boolean b = false;
    @m1
    private int c = 0;

    public yd2(xd2 xd2Var) {
        this.a = (View) xd2Var;
    }

    private void a() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).j(this.a);
        }
    }

    @m1
    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(@x1 Bundle bundle) {
        this.b = bundle.getBoolean(CallMraidJS.g, false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    @x1
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CallMraidJS.g, this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public boolean f(boolean z) {
        if (this.b != z) {
            this.b = z;
            a();
            return true;
        }
        return false;
    }

    public void g(@m1 int i) {
        this.c = i;
    }
}