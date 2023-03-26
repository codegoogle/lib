package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rect.kt */
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0016\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0015\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f¨\u0006\u001d"}, d2 = {"and", "Landroid/graphics/Rect;", "r", "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", com.anythink.expressad.d.a.b.dH, "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class sj {
    @NotNull
    public static final Rect A(@NotNull Rect rect, int i) {
        c25.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @NotNull
    public static final RectF B(@NotNull RectF rectF, float f) {
        c25.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final RectF C(@NotNull RectF rectF, int i) {
        c25.p(rectF, "<this>");
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final Rect D(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @NotNull
    public static final RectF E(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return new RectF(rect);
    }

    @NotNull
    public static final Region F(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return new Region(rect);
    }

    @NotNull
    public static final Region G(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @NotNull
    public static final RectF H(@NotNull RectF rectF, @NotNull Matrix matrix) {
        c25.p(rectF, "<this>");
        c25.p(matrix, com.anythink.expressad.d.a.b.dH);
        matrix.mapRect(rectF);
        return rectF;
    }

    @NotNull
    public static final Region I(@NotNull Rect rect, @NotNull Rect rect2) {
        c25.p(rect, "<this>");
        c25.p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @NotNull
    public static final Region J(@NotNull RectF rectF, @NotNull RectF rectF2) {
        c25.p(rectF, "<this>");
        c25.p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final Rect a(@NotNull Rect rect, @NotNull Rect rect2) {
        c25.p(rect, "<this>");
        c25.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF b(@NotNull RectF rectF, @NotNull RectF rectF2) {
        c25.p(rectF, "<this>");
        c25.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@NotNull RectF rectF) {
        c25.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@NotNull Rect rect) {
        c25.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@NotNull Rect rect, @NotNull Point point) {
        c25.p(rect, "<this>");
        c25.p(point, "p");
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@NotNull RectF rectF, @NotNull PointF pointF) {
        c25.p(rectF, "<this>");
        c25.p(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    @NotNull
    public static final Rect m(@NotNull Rect rect, int i) {
        c25.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @NotNull
    public static final Rect n(@NotNull Rect rect, @NotNull Point point) {
        c25.p(rect, "<this>");
        c25.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @NotNull
    public static final RectF o(@NotNull RectF rectF, float f) {
        c25.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @NotNull
    public static final RectF p(@NotNull RectF rectF, @NotNull PointF pointF) {
        c25.p(rectF, "<this>");
        c25.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @NotNull
    public static final Region q(@NotNull Rect rect, @NotNull Rect rect2) {
        c25.p(rect, "<this>");
        c25.p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final Region r(@NotNull RectF rectF, @NotNull RectF rectF2) {
        c25.p(rectF, "<this>");
        c25.p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final Rect s(@NotNull Rect rect, @NotNull Rect rect2) {
        c25.p(rect, "<this>");
        c25.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final RectF t(@NotNull RectF rectF, @NotNull RectF rectF2) {
        c25.p(rectF, "<this>");
        c25.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @NotNull
    public static final Rect u(@NotNull Rect rect, int i) {
        c25.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @NotNull
    public static final Rect v(@NotNull Rect rect, @NotNull Point point) {
        c25.p(rect, "<this>");
        c25.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @NotNull
    public static final Rect w(@NotNull Rect rect, @NotNull Rect rect2) {
        c25.p(rect, "<this>");
        c25.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final RectF x(@NotNull RectF rectF, float f) {
        c25.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @NotNull
    public static final RectF y(@NotNull RectF rectF, @NotNull PointF pointF) {
        c25.p(rectF, "<this>");
        c25.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @NotNull
    public static final RectF z(@NotNull RectF rectF, @NotNull RectF rectF2) {
        c25.p(rectF, "<this>");
        c25.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}