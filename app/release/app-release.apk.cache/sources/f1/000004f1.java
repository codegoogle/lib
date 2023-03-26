package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.anythink.core.common.j.h;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class FeedbackButton extends TextView {
    public FeedbackButton(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        setText(h.a(getContext(), "myoffer_feedback_text", "string"));
        setTextColor(-1);
        setTextSize(14.0f);
        setBackgroundResource(h.a(getContext(), "myoffer_bg_feedback_button", com.anythink.expressad.foundation.h.h.c));
        setGravity(17);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        setPadding(applyDimension, 0, applyDimension, 0);
    }

    private void a() {
        setText(h.a(getContext(), "myoffer_feedback_text", "string"));
        setTextColor(-1);
        setTextSize(14.0f);
        setBackgroundResource(h.a(getContext(), "myoffer_bg_feedback_button", com.anythink.expressad.foundation.h.h.c));
        setGravity(17);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        setPadding(applyDimension, 0, applyDimension, 0);
    }

    public void setType(int i) {
        if (i == 1) {
            setBackgroundResource(h.a(getContext(), "myoffer_half_screen_bg_feedback_button", com.anythink.expressad.foundation.h.h.c));
            setTextSize(12.0f);
        }
    }
}