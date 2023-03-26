package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.zb;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class ef extends View {
    private int s;
    private View t;
    private int u;

    public ef(Context context) {
        super(context);
        this.s = -1;
        this.t = null;
        this.u = 4;
        a(null);
    }

    private void a(AttributeSet attrs) {
        super.setVisibility(this.u);
        this.s = -1;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.O8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.P8) {
                    this.s = obtainStyledAttributes.getResourceId(index, this.s);
                } else if (index == ff.m.Q8) {
                    this.u = obtainStyledAttributes.getInt(index, this.u);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout container) {
        if (this.t == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.t.getLayoutParams();
        bVar2.T0.b2(0);
        zb.b H = bVar.T0.H();
        zb.b bVar3 = zb.b.FIXED;
        if (H != bVar3) {
            bVar.T0.c2(bVar2.T0.m0());
        }
        if (bVar.T0.j0() != bVar3) {
            bVar.T0.y1(bVar2.T0.D());
        }
        bVar2.T0.b2(8);
    }

    public void c(ConstraintLayout container) {
        if (this.s == -1 && !isInEditMode()) {
            setVisibility(this.u);
        }
        View findViewById = container.findViewById(this.s);
        this.t = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).H0 = true;
            this.t.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.t;
    }

    public int getEmptyVisibility() {
        return this.u;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int id) {
        View findViewById;
        if (this.s == id) {
            return;
        }
        View view = this.t;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.t.getLayoutParams()).H0 = false;
            this.t = null;
        }
        this.s = id;
        if (id == -1 || (findViewById = ((View) getParent()).findViewById(id)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int visibility) {
        this.u = visibility;
    }

    public ef(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = -1;
        this.t = null;
        this.u = 4;
        a(attrs);
    }

    public ef(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = -1;
        this.t = null;
        this.u = 4;
        a(attrs);
    }

    public ef(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.s = -1;
        this.t = null;
        this.u = 4;
        a(attrs);
    }
}