package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.p7700g.p99005.ff;

/* compiled from: MockView.java */
/* loaded from: classes.dex */
public class se extends View {
    private int A;
    private int B;
    private int C;
    private Paint s;
    private Paint t;
    private Paint u;
    private boolean v;
    private boolean w;
    public String x;
    private Rect y;
    private int z;

    public se(Context context) {
        super(context);
        this.s = new Paint();
        this.t = new Paint();
        this.u = new Paint();
        this.v = true;
        this.w = true;
        this.x = null;
        this.y = new Rect();
        this.z = Color.argb(255, 0, 0, 0);
        this.A = Color.argb(255, 200, 200, 200);
        this.B = Color.argb(255, 50, 50, 50);
        this.C = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.ej);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.gj) {
                    this.x = obtainStyledAttributes.getString(index);
                } else if (index == ff.m.jj) {
                    this.v = obtainStyledAttributes.getBoolean(index, this.v);
                } else if (index == ff.m.fj) {
                    this.z = obtainStyledAttributes.getColor(index, this.z);
                } else if (index == ff.m.hj) {
                    this.B = obtainStyledAttributes.getColor(index, this.B);
                } else if (index == ff.m.ij) {
                    this.A = obtainStyledAttributes.getColor(index, this.A);
                } else if (index == ff.m.kj) {
                    this.w = obtainStyledAttributes.getBoolean(index, this.w);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.x == null) {
            try {
                this.x = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.s.setColor(this.z);
        this.s.setAntiAlias(true);
        this.t.setColor(this.A);
        this.t.setAntiAlias(true);
        this.u.setColor(this.B);
        this.C = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.C);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.v) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.s);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.s);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.s);
            canvas.drawLine(f, 0.0f, f, f2, this.s);
            canvas.drawLine(f, f2, 0.0f, f2, this.s);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.s);
        }
        String str = this.x;
        if (str == null || !this.w) {
            return;
        }
        this.t.getTextBounds(str, 0, str.length(), this.y);
        float width2 = (width - this.y.width()) / 2.0f;
        float height2 = ((height - this.y.height()) / 2.0f) + this.y.height();
        this.y.offset((int) width2, (int) height2);
        Rect rect = this.y;
        int i = rect.left;
        int i2 = this.C;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.y, this.u);
        canvas.drawText(this.x, width2, height2, this.t);
    }

    public se(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = new Paint();
        this.t = new Paint();
        this.u = new Paint();
        this.v = true;
        this.w = true;
        this.x = null;
        this.y = new Rect();
        this.z = Color.argb(255, 0, 0, 0);
        this.A = Color.argb(255, 200, 200, 200);
        this.B = Color.argb(255, 50, 50, 50);
        this.C = 4;
        a(context, attrs);
    }

    public se(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = new Paint();
        this.t = new Paint();
        this.u = new Paint();
        this.v = true;
        this.w = true;
        this.x = null;
        this.y = new Rect();
        this.z = Color.argb(255, 0, 0, 0);
        this.A = Color.argb(255, 200, 200, 200);
        this.B = Color.argb(255, 50, 50, 50);
        this.C = 4;
        a(context, attrs);
    }
}