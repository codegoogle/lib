package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.p7700g.p99005.ff;

/* compiled from: MotionButton.java */
/* loaded from: classes.dex */
public class te extends AppCompatButton {
    private float s;
    private float t;
    private Path u;
    public ViewOutlineProvider v;
    public RectF w;

    /* compiled from: MotionButton.java */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = te.this.getWidth();
            int height = te.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (te.this.s * Math.min(width, height)) / 2.0f);
        }
    }

    /* compiled from: MotionButton.java */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, te.this.getWidth(), te.this.getHeight(), te.this.t);
        }
    }

    public te(Context context) {
        super(context);
        this.s = 0.0f;
        this.t = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == ff.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (0 != 0) {
            canvas.restore();
        }
    }

    public float getRound() {
        return this.t;
    }

    public float getRoundPercent() {
        return this.s;
    }

    @e2(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.t = round;
            float f = this.s;
            this.s = -1.0f;
            setRoundPercent(f);
            return;
        }
        boolean z = this.t != round;
        this.t = round;
        if (round != 0.0f) {
            if (this.u == null) {
                this.u = new Path();
            }
            if (this.w == null) {
                this.w = new RectF();
            }
            if (this.v == null) {
                b bVar = new b();
                this.v = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.w.set(0.0f, 0.0f, getWidth(), getHeight());
            this.u.reset();
            Path path = this.u;
            RectF rectF = this.w;
            float f2 = this.t;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @e2(21)
    public void setRoundPercent(float round) {
        boolean z = this.s != round;
        this.s = round;
        if (round != 0.0f) {
            if (this.u == null) {
                this.u = new Path();
            }
            if (this.w == null) {
                this.w = new RectF();
            }
            if (this.v == null) {
                a aVar = new a();
                this.v = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.s) / 2.0f;
            this.w.set(0.0f, 0.0f, width, height);
            this.u.reset();
            this.u.addRoundRect(this.w, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public te(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = 0.0f;
        this.t = Float.NaN;
        c(context, attrs);
    }

    public te(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = 0.0f;
        this.t = Float.NaN;
        c(context, attrs);
    }
}