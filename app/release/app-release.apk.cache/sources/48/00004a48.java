package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class jf extends xe {
    private boolean B;
    private boolean C;

    public jf(Context context) {
        super(context);
    }

    public void J(ic layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // com.p7700g.p99005.xe, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B || this.C) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.t; i++) {
                    View n = constraintLayout.n(this.s[i]);
                    if (n != null) {
                        if (this.B) {
                            n.setVisibility(visibility);
                        }
                        if (this.C && elevation > 0.0f) {
                            n.setTranslationZ(n.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.xe
    public void r(ConstraintLayout container) {
        q(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        p();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        p();
    }

    @Override // com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.E6) {
                    this.B = true;
                } else if (index == ff.m.U6) {
                    this.C = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public jf(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public jf(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}