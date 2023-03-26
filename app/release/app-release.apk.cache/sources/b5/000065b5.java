package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: MaterialArcMotion.java */
/* loaded from: classes3.dex */
public final class xj2 extends i80 {
    private static PointF b(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // com.p7700g.p99005.i80
    @x1
    public Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF b = b(f, f2, f3, f4);
        path.quadTo(b.x, b.y, f3, f4);
        return path;
    }
}