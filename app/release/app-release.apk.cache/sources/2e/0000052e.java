package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public class StarLevelView extends ImageView {
    public Context a;

    public StarLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.a = context;
    }

    public void setState(boolean z) {
        if (z) {
            setImageResource(h.a(getContext(), "myoffer_splash_star", com.anythink.expressad.foundation.h.h.c));
        } else {
            setImageResource(h.a(getContext(), "myoffer_splash_star_gray", com.anythink.expressad.foundation.h.h.c));
        }
    }

    public StarLevelView(Context context) {
        this(context, null);
        this.a = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
    }
}