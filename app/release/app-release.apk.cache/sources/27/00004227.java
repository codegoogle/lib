package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import java.util.HashMap;

/* compiled from: MotionEffect.java */
/* loaded from: classes.dex */
public class fd extends de {
    public static final String F = "FadeMove";
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 3;
    private static final int L = -1;
    private float M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private int S;
    private int T;

    public fd(Context context) {
        super(context);
        this.M = 0.1f;
        this.N = 49;
        this.O = 50;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = -1;
        this.T = -1;
    }

    private void K(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.wj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Aj) {
                    int i2 = obtainStyledAttributes.getInt(index, this.N);
                    this.N = i2;
                    this.N = Math.max(Math.min(i2, 99), 0);
                } else if (index == ff.m.yj) {
                    int i3 = obtainStyledAttributes.getInt(index, this.O);
                    this.O = i3;
                    this.O = Math.max(Math.min(i3, 99), 0);
                } else if (index == ff.m.Cj) {
                    this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                } else if (index == ff.m.Dj) {
                    this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                } else if (index == ff.m.xj) {
                    this.M = obtainStyledAttributes.getFloat(index, this.M);
                } else if (index == ff.m.zj) {
                    this.T = obtainStyledAttributes.getInt(index, this.T);
                } else if (index == ff.m.Bj) {
                    this.R = obtainStyledAttributes.getBoolean(index, this.R);
                } else if (index == ff.m.Ej) {
                    this.S = obtainStyledAttributes.getResourceId(index, this.S);
                }
            }
            int i4 = this.N;
            int i5 = this.O;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.N = i4 - 1;
                } else {
                    this.O = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0172, code lost:
        if (r14 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
        if (r14 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
        if (r15 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a6, code lost:
        if (r15 == 0.0f) goto L62;
     */
    @Override // com.p7700g.p99005.de, com.p7700g.p99005.ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(ge motionLayout, HashMap<View, ce> controllerMap) {
        td tdVar;
        td tdVar2;
        td tdVar3;
        boolean z;
        HashMap<View, ce> hashMap = controllerMap;
        View[] w = w((ConstraintLayout) getParent());
        if (w == null) {
            qd.f();
            return;
        }
        td udVar = new ud();
        td udVar2 = new ud();
        udVar.j("alpha", Float.valueOf(this.M));
        udVar2.j("alpha", Float.valueOf(this.M));
        udVar.h(this.N);
        udVar2.h(this.O);
        xd xdVar = new xd();
        xdVar.h(this.N);
        xdVar.z(0);
        xdVar.j("percentX", 0);
        xdVar.j("percentY", 0);
        xd xdVar2 = new xd();
        xdVar2.h(this.O);
        xdVar2.z(0);
        xdVar2.j("percentX", 1);
        xdVar2.j("percentY", 1);
        td tdVar4 = null;
        if (this.P > 0) {
            tdVar = new ud();
            tdVar2 = new ud();
            tdVar.j("translationX", Integer.valueOf(this.P));
            tdVar.h(this.O);
            tdVar2.j("translationX", 0);
            tdVar2.h(this.O - 1);
        } else {
            tdVar = null;
            tdVar2 = null;
        }
        if (this.Q > 0) {
            tdVar4 = new ud();
            tdVar3 = new ud();
            tdVar4.j("translationY", Integer.valueOf(this.Q));
            tdVar4.h(this.O);
            tdVar3.j("translationY", 0);
            tdVar3.h(this.O - 1);
        } else {
            tdVar3 = null;
        }
        int i = this.T;
        if (i == -1) {
            int[] iArr = new int[4];
            for (View view : w) {
                ce ceVar = hashMap.get(view);
                if (ceVar != null) {
                    float t = ceVar.t() - ceVar.G();
                    float u = ceVar.u() - ceVar.H();
                    if (u < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (u > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (t > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (t < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i2 = iArr[0];
            int i3 = 1;
            i = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                if (i2 < iArr[i3]) {
                    i = i3;
                    i2 = iArr[i3];
                }
                i3++;
            }
        }
        int i5 = 0;
        while (i5 < w.length) {
            ce ceVar2 = hashMap.get(w[i5]);
            if (ceVar2 != null) {
                float t2 = ceVar2.t() - ceVar2.G();
                float u2 = ceVar2.u() - ceVar2.H();
                if (i == 0) {
                    if (u2 > 0.0f) {
                        if (this.R) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 1) {
                    if (u2 < 0.0f) {
                        if (this.R) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 2) {
                    if (t2 < 0.0f) {
                        if (this.R) {
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    if (i == 3) {
                        if (t2 > 0.0f) {
                            if (this.R) {
                            }
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    int i6 = this.S;
                    if (i6 == -1) {
                        ceVar2.a(udVar);
                        ceVar2.a(udVar2);
                        ceVar2.a(xdVar);
                        ceVar2.a(xdVar2);
                        if (this.P > 0) {
                            ceVar2.a(tdVar);
                            ceVar2.a(tdVar2);
                        }
                        if (this.Q > 0) {
                            ceVar2.a(tdVar4);
                            ceVar2.a(tdVar3);
                        }
                    } else {
                        motionLayout.c0(i6, ceVar2);
                    }
                    i5++;
                    hashMap = controllerMap;
                }
            }
            i5++;
            hashMap = controllerMap;
        }
    }

    @Override // com.p7700g.p99005.de, com.p7700g.p99005.ee
    public boolean j() {
        return true;
    }

    public fd(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.M = 0.1f;
        this.N = 49;
        this.O = 50;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = -1;
        this.T = -1;
        K(context, attrs);
    }

    public fd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.M = 0.1f;
        this.N = 49;
        this.O = 50;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = -1;
        this.T = -1;
        K(context, attrs);
    }
}