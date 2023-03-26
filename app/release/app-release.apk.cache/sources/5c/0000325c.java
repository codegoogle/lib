package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.oa2;
import com.p7700g.p99005.qa2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @z1
    private Map<View, Integer> l;

    public FabTransformationSheetBehavior() {
    }

    private void j0(@x1 View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.l = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.l;
                        if (map != null && map.containsKey(childAt)) {
                            sr.Q1(childAt, this.l.get(childAt).intValue());
                        }
                    } else {
                        this.l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        sr.Q1(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @t0
    public boolean K(@x1 View view, @x1 View view2, boolean z, boolean z2) {
        j0(view2, z);
        return super.K(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @x1
    public FabTransformationBehavior.e h0(Context context, boolean z) {
        int i;
        if (z) {
            i = ga2.b.z;
        } else {
            i = ga2.b.y;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = oa2.d(context, i);
        eVar.b = new qa2(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}