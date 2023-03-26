package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.p7700g.p99005.sr;

/* loaded from: classes2.dex */
public class WebProgressBarView extends View {
    public int a;
    public int b;
    public Paint c;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.b = -14575885;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(this.b);
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.a = 0;
        setBackgroundColor(sr.s);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.a) / 100, getHeight(), this.c);
        canvas.restore();
    }

    public void setProgress(int i) {
        this.a = i;
        postInvalidate();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}