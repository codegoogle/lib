package com.anythink.expressad.video.dynview.h;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public final class a {
    private static PointF a(float f, PointF pointF, PointF pointF2, PointF pointF3) {
        PointF pointF4 = new PointF();
        float f2 = 1.0f - f;
        float f3 = f2 * f2;
        float f4 = 2.0f * f * f2;
        float f5 = f * f;
        pointF4.x = (pointF3.x * f5) + (pointF2.x * f4) + (pointF.x * f3);
        float f6 = f3 * pointF.y;
        pointF4.y = (f5 * pointF3.y) + (f4 * pointF2.y) + f6;
        return pointF4;
    }

    private static PointF a(float f, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        PointF pointF5 = new PointF();
        float f2 = 1.0f - f;
        pointF5.x = (pointF4.x * f * f * f) + (pointF3.x * 3.0f * f * f * f2) + (pointF2.x * 3.0f * f * f2 * f2) + (pointF.x * f2 * f2 * f2);
        pointF5.y = (pointF4.y * f * f * f) + (pointF3.y * 3.0f * f * f * f2) + (pointF2.y * 3.0f * f * f2 * f2) + (pointF.y * f2 * f2 * f2);
        return pointF5;
    }
}