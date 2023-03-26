package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class AnyThinkDyImageView extends ImageView {
    private static final String a = "MBridgeDyImageView";

    public AnyThinkDyImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    public AnyThinkDyImageView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkDyImageView(Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}