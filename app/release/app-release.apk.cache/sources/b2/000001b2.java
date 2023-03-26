package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ac;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ec;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.vb;
import com.p7700g.p99005.xe;
import com.p7700g.p99005.zb;

/* loaded from: classes.dex */
public class Barrier extends xe {
    public static final int B = 0;
    public static final int C = 2;
    public static final int D = 1;
    public static final int E = 3;
    public static final int F = 5;
    public static final int G = 6;
    private int H;
    private int I;
    private vb J;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void K(zb widget, int type, boolean isRtl) {
        this.I = type;
        if (isRtl) {
            int i = this.H;
            if (i == 5) {
                this.I = 1;
            } else if (i == 6) {
                this.I = 0;
            }
        } else {
            int i2 = this.H;
            if (i2 == 5) {
                this.I = 0;
            } else if (i2 == 6) {
                this.I = 1;
            }
        }
        if (widget instanceof vb) {
            ((vb) widget).u2(this.I);
        }
    }

    @Override // com.p7700g.p99005.xe
    public void B(zb widget, boolean isRtl) {
        K(widget, this.H, isRtl);
    }

    @Deprecated
    public boolean J() {
        return this.J.o2();
    }

    public boolean getAllowsGoneWidget() {
        return this.J.o2();
    }

    public int getMargin() {
        return this.J.q2();
    }

    public int getType() {
        return this.H;
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.J.t2(supportGone);
    }

    public void setDpMargin(int margin) {
        vb vbVar = this.J;
        vbVar.v2((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int margin) {
        this.J.v2(margin);
    }

    public void setType(int type) {
        this.H = type;
    }

    @Override // com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.J = new vb();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Y6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ff.m.X6) {
                    this.J.t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == ff.m.Z6) {
                    this.J.v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.v = this.J;
        I();
    }

    @Override // com.p7700g.p99005.xe
    public void z(af.a constraint, ec child, ConstraintLayout.b layoutParams, SparseArray<zb> mapIdToWidget) {
        super.z(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof vb) {
            vb vbVar = (vb) child;
            K(vbVar, constraint.e.A1, ((ac) child.U()).O2());
            vbVar.t2(constraint.e.I1);
            vbVar.v2(constraint.e.B1);
        }
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }
}