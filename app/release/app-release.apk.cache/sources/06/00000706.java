package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.r;
import com.anythink.core.common.res.image.RecycleImageView;

/* loaded from: classes2.dex */
public class RoundImageView extends RecycleImageView {
    public int a;
    public boolean b;

    public RoundImageView(Context context) {
        super(context);
        this.a = h.a(getContext(), 5.0f);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            if (this.b) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.dispatchDraw(canvas);
                r.a(canvas, getWidth(), getHeight(), this.a);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (this.b) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                super.onDraw(canvas);
                r.a(canvas, getWidth(), getHeight(), this.a);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
    }

    public void setNeedRadiu(boolean z) {
        this.b = z;
    }

    public void setRadiusInDip(int i) {
        this.a = h.a(getContext(), i);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = h.a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = h.a(getContext(), 5.0f);
    }
}