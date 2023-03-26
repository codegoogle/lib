package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.hf;

/* compiled from: ReactiveGuide.java */
/* loaded from: classes.dex */
public class gf extends View implements hf.a {
    private int s;
    private boolean t;
    private int u;
    private boolean v;

    public gf(Context context) {
        super(context);
        this.s = -1;
        this.t = false;
        this.u = 0;
        this.v = true;
        super.setVisibility(8);
        c(null);
    }

    private void b(int newValue, int id, ge motionLayout, int currentState) {
        af v0 = motionLayout.v0(currentState);
        v0.d1(id, newValue);
        motionLayout.f1(currentState, v0);
    }

    private void c(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.J8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.N8) {
                    this.s = obtainStyledAttributes.getResourceId(index, this.s);
                } else if (index == ff.m.K8) {
                    this.t = obtainStyledAttributes.getBoolean(index, this.t);
                } else if (index == ff.m.M8) {
                    this.u = obtainStyledAttributes.getResourceId(index, this.u);
                } else if (index == ff.m.L8) {
                    this.v = obtainStyledAttributes.getBoolean(index, this.v);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.s != -1) {
            ConstraintLayout.getSharedValues().a(this.s, this);
        }
    }

    @Override // com.p7700g.p99005.hf.a
    public void a(int key, int newValue, int oldValue) {
        setGuidelineBegin(newValue);
        int id = getId();
        if (id > 0 && (getParent() instanceof ge)) {
            ge geVar = (ge) getParent();
            int currentState = geVar.getCurrentState();
            int i = this.u;
            if (i != 0) {
                currentState = i;
            }
            int i2 = 0;
            if (this.t) {
                if (this.v) {
                    int[] constraintSetIds = geVar.getConstraintSetIds();
                    while (i2 < constraintSetIds.length) {
                        int i3 = constraintSetIds[i2];
                        if (i3 != currentState) {
                            b(newValue, id, geVar, i3);
                        }
                        i2++;
                    }
                }
                af h0 = geVar.h0(currentState);
                h0.d1(id, newValue);
                geVar.g1(currentState, h0, 1000);
            } else if (this.v) {
                int[] constraintSetIds2 = geVar.getConstraintSetIds();
                while (i2 < constraintSetIds2.length) {
                    b(newValue, id, geVar, constraintSetIds2[i2]);
                    i2++;
                }
            } else {
                b(newValue, id, geVar, currentState);
            }
        }
    }

    public boolean d() {
        return this.t;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.u;
    }

    public int getAttributeId() {
        return this.s;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean animate) {
        this.t = animate;
    }

    public void setApplyToConstraintSetId(int id) {
        this.u = id;
    }

    public void setAttributeId(int id) {
        hf sharedValues = ConstraintLayout.getSharedValues();
        int i = this.s;
        if (i != -1) {
            sharedValues.e(i, this);
        }
        this.s = id;
        if (id != -1) {
            sharedValues.a(id, this);
        }
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.y = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.z = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.A = ratio;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public gf(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = -1;
        this.t = false;
        this.u = 0;
        this.v = true;
        super.setVisibility(8);
        c(attrs);
    }

    public gf(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = -1;
        this.t = false;
        this.u = 0;
        this.v = true;
        super.setVisibility(8);
        c(attrs);
    }

    public gf(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.s = -1;
        this.t = false;
        this.u = 0;
        this.v = true;
        super.setVisibility(8);
        c(attrs);
    }
}