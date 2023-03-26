package com.greedygame.core.uii;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.dy2;
import com.p7700g.p99005.yz2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class CloseImageView extends AppCompatImageView {
    @NotNull
    public static final a s = new a(null);
    private Paint t;
    private Paint u;
    private Paint v;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseImageView(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        a();
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.t = paint;
        if (paint != null) {
            paint.setStrokeWidth(dy2.b(getContext(), 2.0f));
            Paint paint2 = this.t;
            if (paint2 != null) {
                paint2.setColor(-1);
                Paint paint3 = this.t;
                if (paint3 != null) {
                    paint3.setStyle(Paint.Style.STROKE);
                    int a2 = yz2.a(getContext(), b03.e.o0);
                    Paint paint4 = new Paint(1);
                    this.u = paint4;
                    if (paint4 != null) {
                        paint4.setColor(a2);
                        Paint paint5 = this.u;
                        if (paint5 != null) {
                            paint5.setStyle(Paint.Style.FILL);
                            Paint paint6 = new Paint(1);
                            this.v = paint6;
                            if (paint6 != null) {
                                paint6.setStrokeWidth(dy2.b(getContext(), 4.0f));
                                Paint paint7 = this.v;
                                if (paint7 != null) {
                                    paint7.setColor(-1);
                                    invalidate();
                                    return;
                                }
                                c25.S("mCrossPaint");
                                throw null;
                            }
                            c25.S("mCrossPaint");
                            throw null;
                        }
                        c25.S("innerCirclePaint");
                        throw null;
                    }
                    c25.S("innerCirclePaint");
                    throw null;
                }
                c25.S("outerCirclePaint");
                throw null;
            }
            c25.S("outerCirclePaint");
            throw null;
        }
        c25.S("outerCirclePaint");
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        c25.p(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = new RectF(6.0f, 6.0f, canvas.getWidth() - 6, canvas.getHeight() - 6);
        Paint paint = this.u;
        if (paint != null) {
            canvas.drawOval(rectF, paint);
            Paint paint2 = this.t;
            if (paint2 != null) {
                canvas.drawOval(rectF, paint2);
                float b = dy2.b(getContext(), 12.0f);
                float b2 = dy2.b(getContext(), 22.0f);
                float b3 = dy2.b(getContext(), 22.0f);
                float b4 = dy2.b(getContext(), 12.0f);
                Paint paint3 = this.v;
                if (paint3 != null) {
                    canvas.drawLine(b, b2, b3, b4, paint3);
                    float b5 = dy2.b(getContext(), 22.0f);
                    float b6 = dy2.b(getContext(), 22.0f);
                    float b7 = dy2.b(getContext(), 12.0f);
                    float b8 = dy2.b(getContext(), 12.0f);
                    Paint paint4 = this.v;
                    if (paint4 != null) {
                        canvas.drawLine(b5, b6, b7, b8, paint4);
                        return;
                    } else {
                        c25.S("mCrossPaint");
                        throw null;
                    }
                }
                c25.S("mCrossPaint");
                throw null;
            }
            c25.S("outerCirclePaint");
            throw null;
        }
        c25.S("innerCirclePaint");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c25.p(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        a();
    }
}