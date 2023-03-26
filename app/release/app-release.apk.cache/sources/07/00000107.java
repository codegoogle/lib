package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.p7700g.p99005.lt;
import com.p7700g.p99005.m2;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.S4, i, i2);
        int i3 = x2.m.V4;
        if (obtainStyledAttributes.hasValue(i3)) {
            setSupportOverlapAnchor(obtainStyledAttributes.getBoolean(i3, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(x2.m.T4));
        obtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z;
        } else {
            lt.c(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}