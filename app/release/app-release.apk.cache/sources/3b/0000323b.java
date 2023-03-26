package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.n2;
import com.p7700g.p99005.rg2;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@x1 Context context) {
        this(context, null);
    }

    private void e(@x1 Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, ga2.o.ym);
        int h = h(getContext(), obtainStyledAttributes, ga2.o.Am, ga2.o.Bm);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            setLineHeight(h);
        }
    }

    private static boolean f(Context context) {
        return rg2.b(context, ga2.c.hg, true);
    }

    private static int g(@x1 Resources.Theme theme, @z1 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, ga2.o.Cm, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(ga2.o.Dm, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int h(@x1 Context context, @x1 TypedArray typedArray, @x1 @n2 int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = sg2.d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean i(@x1 Context context, @x1 Resources.Theme theme, @z1 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, ga2.o.Cm, i, i2);
        int h = h(context, obtainStyledAttributes, ga2.o.Em, ga2.o.Fm);
        obtainStyledAttributes.recycle();
        return h != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@x1 Context context, int i) {
        super.setTextAppearance(context, i);
        if (f(context)) {
            e(context.getTheme(), i);
        }
    }

    public MaterialTextView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@x1 Context context, @z1 AttributeSet attributeSet, int i, int i2) {
        super(yi2.c(context, attributeSet, i, i2), attributeSet, i);
        int g;
        Context context2 = getContext();
        if (f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (i(context2, theme, attributeSet, i, i2) || (g = g(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            e(theme, g);
        }
    }
}