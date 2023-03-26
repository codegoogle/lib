package com.p7700g.p99005;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;

/* compiled from: TabItem.java */
/* loaded from: classes3.dex */
public class ki2 extends View {
    public final CharSequence s;
    public final Drawable t;
    public final int u;

    public ki2(Context context) {
        this(context, null);
    }

    public ki2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, ga2.o.Qs);
        this.s = obtainStyledAttributes.getText(ga2.o.Ts);
        this.t = obtainStyledAttributes.getDrawable(ga2.o.Rs);
        this.u = obtainStyledAttributes.getResourceId(ga2.o.Ss, 0);
        obtainStyledAttributes.recycle();
    }
}