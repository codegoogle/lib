package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.anythink.core.common.j.h;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class AdTextView extends TextView {
    public AdTextView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setBackgroundResource(h.a(context, "myoffer_bg_banner_ad_choice", com.anythink.expressad.foundation.h.h.c));
        setTextColor(-1);
        setText(context.getResources().getString(h.a(context, "basead_ad_text", "string")));
        setTextSize(8.0f);
        setGravity(17);
        setPadding(h.a(context, 3.0f), 0, h.a(context, 3.0f), 0);
    }

    public AdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public AdTextView(Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}