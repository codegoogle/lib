package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.core.common.j.h;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class FeedbackTextView extends AutoResizeTextView {
    public FeedbackTextView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(h.a(context, "myoffer_bg_feedback_textview", com.anythink.expressad.foundation.h.h.c));
    }

    private void a(Context context) {
        setBackgroundResource(h.a(context, "myoffer_bg_feedback_textview", com.anythink.expressad.foundation.h.h.c));
    }
}