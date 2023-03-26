package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* compiled from: MaterialArcMotion.java */
@e2(21)
/* loaded from: classes3.dex */
public final class tk2 extends PathMotion {
    private static PointF a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // android.transition.PathMotion
    @x1
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF a = a(f, f2, f3, f4);
        path.quadTo(a.x, a.y, f3, f4);
        return path;
    }
}