package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ng  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0848Ng extends RelativeLayout {
    public static final int A04 = (int) (C0795Le.A01 * 4.0f);
    public static final float[] A05;
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    static {
        int i = A04;
        A05 = new float[]{i, i, i, i, i, i, i, i};
    }

    public C0848Ng(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        C0795Le.A0P(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int min = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{min, min, min, min, min, min, min, min};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        this.A02.addRoundRect(this.A03, this.A00 ? getRadiiForCircularImage() : this.A01, Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.A00 = z;
    }

    public void setRadius(int i) {
        int i2 = (int) (i * C0795Le.A01);
        this.A01 = new float[]{i2, i2, i2, i2, i2, i2, i2, i2};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}