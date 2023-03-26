package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p7700g.p99005.sr;

/* loaded from: assets/audience_network.dex */
public final class OO extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public OO(C1080Wh c1080Wh, String str) {
        super(c1080Wh);
        float f = c1080Wh.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1080Wh);
        textView.setTextColor(sr.t);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (6.0f * f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new RectF();
        C0795Le.A0P(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}