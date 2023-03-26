package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.h;

/* loaded from: classes2.dex */
public class SoundImageView extends ImageView {
    private boolean a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }

    public boolean getStatus() {
        return this.a;
    }

    public void setSoundStatus(boolean z) {
        this.a = z;
        if (z) {
            setImageResource(h.a(getContext(), "anythink_reward_sound_open", h.c));
        } else {
            setImageResource(h.a(getContext(), "anythink_reward_sound_close", h.c));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.a = true;
    }
}