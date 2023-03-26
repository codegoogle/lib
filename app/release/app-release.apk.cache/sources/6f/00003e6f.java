package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import java.util.HashMap;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public class de extends xe implements ee {
    private boolean B;
    private boolean C;
    private float D;
    public View[] E;

    public de(Context context) {
        super(context);
        this.B = false;
        this.C = false;
    }

    public void J(View view, float progress) {
    }

    public void a(ge motionLayout, int startId, int endId, float progress) {
    }

    @Override // com.p7700g.p99005.ee
    public void b(ge motionLayout) {
    }

    @Override // com.p7700g.p99005.ge.l
    public void c(ge motionLayout, int startId, int endId) {
    }

    @Override // com.p7700g.p99005.ge.l
    public void d(ge motionLayout, int triggerId, boolean positive, float progress) {
    }

    @Override // com.p7700g.p99005.ee
    public boolean e() {
        return this.B;
    }

    @Override // com.p7700g.p99005.ee
    public boolean f() {
        return this.C;
    }

    @Override // com.p7700g.p99005.ee
    public void g(ge motionLayout, HashMap<View, ce> controllerMap) {
    }

    @Override // com.p7700g.p99005.od
    public float getProgress() {
        return this.D;
    }

    @Override // com.p7700g.p99005.ee
    public void h(Canvas canvas) {
    }

    @Override // com.p7700g.p99005.ee
    public void i(Canvas canvas) {
    }

    @Override // com.p7700g.p99005.ee
    public boolean j() {
        return false;
    }

    public void k(ge motionLayout, int currentId) {
    }

    @Override // com.p7700g.p99005.od
    public void setProgress(float progress) {
        this.D = progress;
        int i = 0;
        if (this.t > 0) {
            this.E = w((ConstraintLayout) getParent());
            while (i < this.t) {
                J(this.E[i], progress);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof de)) {
                J(childAt, progress);
            }
            i++;
        }
    }

    @Override // com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.Fj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Hj) {
                    this.B = obtainStyledAttributes.getBoolean(index, this.B);
                } else if (index == ff.m.Gj) {
                    this.C = obtainStyledAttributes.getBoolean(index, this.C);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public de(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.B = false;
        this.C = false;
        y(attrs);
    }

    public de(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.B = false;
        this.C = false;
        y(attrs);
    }
}