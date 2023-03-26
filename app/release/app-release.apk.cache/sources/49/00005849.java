package com.p7700g.p99005;

import android.graphics.Point;
import android.graphics.PointF;
import org.jetbrains.annotations.NotNull;

/* compiled from: Point.kt */
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0004H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\r"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "minus", "p", "xy", "plus", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qj {
    public static final float a(@NotNull PointF pointF) {
        c25.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@NotNull Point point) {
        c25.p(point, "<this>");
        return point.x;
    }

    public static final float c(@NotNull PointF pointF) {
        c25.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@NotNull Point point) {
        c25.p(point, "<this>");
        return point.y;
    }

    @NotNull
    public static final Point e(@NotNull Point point, int i) {
        c25.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @NotNull
    public static final Point f(@NotNull Point point, @NotNull Point point2) {
        c25.p(point, "<this>");
        c25.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @NotNull
    public static final PointF g(@NotNull PointF pointF, float f) {
        c25.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @NotNull
    public static final PointF h(@NotNull PointF pointF, @NotNull PointF pointF2) {
        c25.p(pointF, "<this>");
        c25.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @NotNull
    public static final Point i(@NotNull Point point, int i) {
        c25.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @NotNull
    public static final Point j(@NotNull Point point, @NotNull Point point2) {
        c25.p(point, "<this>");
        c25.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @NotNull
    public static final PointF k(@NotNull PointF pointF, float f) {
        c25.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    @NotNull
    public static final PointF l(@NotNull PointF pointF, @NotNull PointF pointF2) {
        c25.p(pointF, "<this>");
        c25.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @NotNull
    public static final Point m(@NotNull PointF pointF) {
        c25.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @NotNull
    public static final PointF n(@NotNull Point point) {
        c25.p(point, "<this>");
        return new PointF(point);
    }

    @NotNull
    public static final Point o(@NotNull Point point) {
        c25.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @NotNull
    public static final PointF p(@NotNull PointF pointF) {
        c25.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}