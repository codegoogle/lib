package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class MuteImageView extends ImageView {
    private boolean a;

    public MuteImageView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    public void setMute(boolean z) {
        if (z) {
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}