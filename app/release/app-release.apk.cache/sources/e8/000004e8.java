package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.r;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class CloseImageView extends ImageView {
    private static final String a = CloseImageView.class.getSimpleName();
    private float b;
    private Rect c;

    public CloseImageView(Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        if (this.b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || this.c.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setClickAreaScaleFactor(float f) {
        this.b = f;
        if (f <= 0.0f) {
            this.b = 1.0f;
        }
        String str = a;
        e.b(str, "setClickAreaScaleFactor: " + this.b);
        float f2 = this.b;
        if (f2 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.c);
                    int width = ((int) ((CloseImageView.this.b - 1.0f) * CloseImageView.this.c.width())) / 2;
                    int height = ((int) ((CloseImageView.this.b - 1.0f) * CloseImageView.this.c.height())) / 2;
                    CloseImageView.this.c.top -= height;
                    CloseImageView.this.c.bottom += height;
                    CloseImageView.this.c.left -= width;
                    CloseImageView.this.c.right += width;
                }
            });
        } else if (f2 > 1.0f) {
            r.a(this, f2);
        }
    }

    public void setType(int i) {
        if (i == 0) {
            setBackgroundResource(h.a(getContext(), "myoffer_video_close", com.anythink.expressad.foundation.h.h.c));
        } else {
            setBackgroundResource(h.a(getContext(), "myoffer_half_screen_close", com.anythink.expressad.foundation.h.h.c));
        }
    }
}