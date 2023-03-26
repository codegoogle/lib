package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import java.util.Arrays;

/* compiled from: CircularFlow.java */
/* loaded from: classes.dex */
public class cd extends jf {
    private static final String D = "CircularFlow";
    private static int E;
    private static float F;
    public ConstraintLayout G;
    public int H;
    private float[] I;
    private int[] J;
    private int K;
    private int L;
    private String M;
    private String N;
    private Float O;
    private Integer P;

    public cd(Context context) {
        super(context);
    }

    private void K(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.u == null || (fArr = this.I) == null) {
            return;
        }
        if (this.L + 1 > fArr.length) {
            this.I = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.I[this.L] = Integer.parseInt(angleString);
        this.L++;
    }

    private void L(String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.u == null || (iArr = this.J) == null) {
            return;
        }
        if (this.K + 1 > iArr.length) {
            this.J = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.J[this.K] = (int) (Integer.parseInt(radiusString) * this.u.getResources().getDisplayMetrics().density);
        this.K++;
    }

    private void N() {
        this.G = (ConstraintLayout) getParent();
        for (int i = 0; i < this.t; i++) {
            View n = this.G.n(this.s[i]);
            if (n != null) {
                int i2 = E;
                float f = F;
                int[] iArr = this.J;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.P;
                    if (num != null && num.intValue() != -1) {
                        this.K++;
                        if (this.J == null) {
                            this.J = new int[1];
                        }
                        int[] radius = getRadius();
                        this.J = radius;
                        radius[this.K - 1] = i2;
                    } else {
                        this.A.get(Integer.valueOf(n.getId()));
                    }
                }
                float[] fArr = this.I;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.O;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.L++;
                        if (this.I == null) {
                            this.I = new float[1];
                        }
                        float[] angles = getAngles();
                        this.I = angles;
                        angles[this.L - 1] = f;
                    } else {
                        this.A.get(Integer.valueOf(n.getId()));
                    }
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) n.getLayoutParams();
                bVar.P = f;
                bVar.N = this.H;
                bVar.O = i2;
                n.setLayoutParams(bVar);
            }
        }
        p();
    }

    private float[] P(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.L) ? angles : Q(angles, index);
    }

    public static float[] Q(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i = 0;
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 != index) {
                fArr[i] = array[i2];
                i++;
            }
        }
        return fArr;
    }

    public static int[] R(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i = 0;
        for (int i2 = 0; i2 < array.length; i2++) {
            if (i2 != index) {
                iArr[i] = array[i2];
                i++;
            }
        }
        return iArr;
    }

    private int[] S(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.K) ? radius : R(radius, index);
    }

    private void setAngles(String idList) {
        if (idList == null) {
            return;
        }
        int i = 0;
        this.L = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i);
            if (indexOf == -1) {
                K(idList.substring(i).trim());
                return;
            } else {
                K(idList.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void setRadius(String idList) {
        if (idList == null) {
            return;
        }
        int i = 0;
        this.K = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i);
            if (indexOf == -1) {
                L(idList.substring(i).trim());
                return;
            } else {
                L(idList.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    @Override // com.p7700g.p99005.xe
    public int A(View view) {
        int A = super.A(view);
        if (A == -1) {
            return A;
        }
        af afVar = new af();
        afVar.H(this.G);
        afVar.F(view.getId(), 8);
        afVar.r(this.G);
        float[] fArr = this.I;
        if (A < fArr.length) {
            this.I = P(fArr, A);
            this.L--;
        }
        int[] iArr = this.J;
        if (A < iArr.length) {
            this.J = S(iArr, A);
            this.K--;
        }
        N();
        return A;
    }

    public void M(View view, int radius, float angle) {
        if (s(view.getId())) {
            return;
        }
        o(view);
        this.L++;
        float[] angles = getAngles();
        this.I = angles;
        angles[this.L - 1] = angle;
        this.K++;
        int[] radius2 = getRadius();
        this.J = radius2;
        radius2[this.K - 1] = (int) (radius * this.u.getResources().getDisplayMetrics().density);
        N();
    }

    public boolean O(View view) {
        return s(view.getId()) && x(view.getId()) != -1;
    }

    public void T(View view, float angle) {
        if (!O(view)) {
            view.getId();
            return;
        }
        int x = x(view.getId());
        if (x > this.I.length) {
            return;
        }
        float[] angles = getAngles();
        this.I = angles;
        angles[x] = angle;
        N();
    }

    public void U(View view, int radius) {
        if (!O(view)) {
            view.getId();
            return;
        }
        int x = x(view.getId());
        if (x > this.J.length) {
            return;
        }
        int[] radius2 = getRadius();
        this.J = radius2;
        radius2[x] = (int) (radius * this.u.getResources().getDisplayMetrics().density);
        N();
    }

    public void V(View view, int radius, float angle) {
        if (!O(view)) {
            view.getId();
            return;
        }
        int x = x(view.getId());
        if (getAngles().length > x) {
            float[] angles = getAngles();
            this.I = angles;
            angles[x] = angle;
        }
        if (getRadius().length > x) {
            int[] radius2 = getRadius();
            this.J = radius2;
            radius2[x] = (int) (radius * this.u.getResources().getDisplayMetrics().density);
        }
        N();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.I, this.L);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.J, this.K);
    }

    @Override // com.p7700g.p99005.jf, com.p7700g.p99005.xe, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.M;
        if (str != null) {
            this.I = new float[1];
            setAngles(str);
        }
        String str2 = this.N;
        if (str2 != null) {
            this.J = new int[1];
            setRadius(str2);
        }
        Float f = this.O;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.P;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        N();
    }

    public void setDefaultAngle(float angle) {
        F = angle;
    }

    public void setDefaultRadius(int radius) {
        E = radius;
    }

    @Override // com.p7700g.p99005.jf, com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.f7) {
                    this.H = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == ff.m.b7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.M = string;
                    setAngles(string);
                } else if (index == ff.m.e7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.N = string2;
                    setRadius(string2);
                } else if (index == ff.m.c7) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, F));
                    this.O = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == ff.m.d7) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, E));
                    this.P = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public cd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public cd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}