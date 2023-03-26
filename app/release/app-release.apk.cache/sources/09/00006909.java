package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdError;

/* compiled from: ConstraintProperties.java */
/* loaded from: classes.dex */
public class ze {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = -1;
    public static final int i = 0;
    public static final int j = 0;
    public static final int k = -2;
    public static final int l = 1;
    public static final int m = 0;
    public ConstraintLayout.b n;
    public View o;

    public ze(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.n = (ConstraintLayout.b) layoutParams;
            this.o = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    private String K(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return com.anythink.expressad.foundation.d.c.bR;
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public ze A(float weight) {
        this.n.j0 = weight;
        return this;
    }

    public ze B(int anchor, int value) {
        switch (anchor) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.n).leftMargin = value;
                break;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.n).rightMargin = value;
                break;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.n).topMargin = value;
                break;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.n).bottomMargin = value;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.n.setMarginStart(value);
                break;
            case 7:
                this.n.setMarginEnd(value);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ze C(int anchor) {
        switch (anchor) {
            case 1:
                ConstraintLayout.b bVar = this.n;
                bVar.D = -1;
                bVar.C = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.U = Integer.MIN_VALUE;
                break;
            case 2:
                ConstraintLayout.b bVar2 = this.n;
                bVar2.F = -1;
                bVar2.E = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.W = Integer.MIN_VALUE;
                break;
            case 3:
                ConstraintLayout.b bVar3 = this.n;
                bVar3.H = -1;
                bVar3.G = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.V = Integer.MIN_VALUE;
                break;
            case 4:
                ConstraintLayout.b bVar4 = this.n;
                bVar4.I = -1;
                bVar4.J = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.X = Integer.MIN_VALUE;
                break;
            case 5:
                this.n.K = -1;
                break;
            case 6:
                ConstraintLayout.b bVar5 = this.n;
                bVar5.Q = -1;
                bVar5.R = -1;
                bVar5.setMarginStart(-1);
                this.n.Y = Integer.MIN_VALUE;
                break;
            case 7:
                ConstraintLayout.b bVar6 = this.n;
                bVar6.S = -1;
                bVar6.T = -1;
                bVar6.setMarginEnd(-1);
                this.n.Z = Integer.MIN_VALUE;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ze D() {
        ConstraintLayout.b bVar = this.n;
        int i2 = bVar.D;
        int i3 = bVar.E;
        if (i2 == -1 && i3 == -1) {
            int i4 = bVar.Q;
            int i5 = bVar.S;
            if (i4 != -1 || i5 != -1) {
                ze zeVar = new ze(((ViewGroup) this.o.getParent()).findViewById(i4));
                ze zeVar2 = new ze(((ViewGroup) this.o.getParent()).findViewById(i5));
                ConstraintLayout.b bVar2 = this.n;
                if (i4 != -1 && i5 != -1) {
                    zeVar.m(7, i5, 6, 0);
                    zeVar2.m(6, i2, 7, 0);
                } else if (i2 != -1 || i5 != -1) {
                    int i6 = bVar2.F;
                    if (i6 != -1) {
                        zeVar.m(7, i6, 7, 0);
                    } else {
                        int i7 = bVar2.C;
                        if (i7 != -1) {
                            zeVar2.m(6, i7, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            ze zeVar3 = new ze(((ViewGroup) this.o.getParent()).findViewById(i2));
            ze zeVar4 = new ze(((ViewGroup) this.o.getParent()).findViewById(i3));
            ConstraintLayout.b bVar3 = this.n;
            if (i2 != -1 && i3 != -1) {
                zeVar3.m(2, i3, 1, 0);
                zeVar4.m(1, i2, 2, 0);
            } else if (i2 != -1 || i3 != -1) {
                int i8 = bVar3.F;
                if (i8 != -1) {
                    zeVar3.m(2, i8, 2, 0);
                } else {
                    int i9 = bVar3.C;
                    if (i9 != -1) {
                        zeVar4.m(1, i9, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public ze E() {
        ConstraintLayout.b bVar = this.n;
        int i2 = bVar.H;
        int i3 = bVar.I;
        if (i2 != -1 || i3 != -1) {
            ze zeVar = new ze(((ViewGroup) this.o.getParent()).findViewById(i2));
            ze zeVar2 = new ze(((ViewGroup) this.o.getParent()).findViewById(i3));
            ConstraintLayout.b bVar2 = this.n;
            if (i2 != -1 && i3 != -1) {
                zeVar.m(4, i3, 3, 0);
                zeVar2.m(3, i2, 4, 0);
            } else if (i2 != -1 || i3 != -1) {
                int i4 = bVar2.J;
                if (i4 != -1) {
                    zeVar.m(4, i4, 4, 0);
                } else {
                    int i5 = bVar2.G;
                    if (i5 != -1) {
                        zeVar2.m(3, i5, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public ze F(float rotation) {
        this.o.setRotation(rotation);
        return this;
    }

    public ze G(float rotationX) {
        this.o.setRotationX(rotationX);
        return this;
    }

    public ze H(float rotationY) {
        this.o.setRotationY(rotationY);
        return this;
    }

    public ze I(float scaleX) {
        this.o.setScaleY(scaleX);
        return this;
    }

    public ze J(float scaleY) {
        return this;
    }

    public ze L(float transformPivotX, float transformPivotY) {
        this.o.setPivotX(transformPivotX);
        this.o.setPivotY(transformPivotY);
        return this;
    }

    public ze M(float transformPivotX) {
        this.o.setPivotX(transformPivotX);
        return this;
    }

    public ze N(float transformPivotY) {
        this.o.setPivotY(transformPivotY);
        return this;
    }

    public ze O(float translationX, float translationY) {
        this.o.setTranslationX(translationX);
        this.o.setTranslationY(translationY);
        return this;
    }

    public ze P(float translationX) {
        this.o.setTranslationX(translationX);
        return this;
    }

    public ze Q(float translationY) {
        this.o.setTranslationY(translationY);
        return this;
    }

    public ze R(float translationZ) {
        this.o.setTranslationZ(translationZ);
        return this;
    }

    public ze S(float bias) {
        this.n.f0 = bias;
        return this;
    }

    public ze T(int chainStyle) {
        this.n.m0 = chainStyle;
        return this;
    }

    public ze U(float weight) {
        this.n.k0 = weight;
        return this;
    }

    public ze V(int visibility) {
        this.o.setVisibility(visibility);
        return this;
    }

    public ze a(int leftId, int rightId) {
        m(1, leftId, leftId == 0 ? 1 : 2, 0);
        m(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(leftId)).m(2, this.o.getId(), 1, 0);
        }
        if (rightId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(rightId)).m(1, this.o.getId(), 2, 0);
        }
        return this;
    }

    public ze b(int leftId, int rightId) {
        m(6, leftId, leftId == 0 ? 6 : 7, 0);
        m(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(leftId)).m(7, this.o.getId(), 6, 0);
        }
        if (rightId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(rightId)).m(6, this.o.getId(), 7, 0);
        }
        return this;
    }

    public ze c(int topId, int bottomId) {
        m(3, topId, topId == 0 ? 3 : 4, 0);
        m(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(topId)).m(4, this.o.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new ze(((ViewGroup) this.o.getParent()).findViewById(bottomId)).m(3, this.o.getId(), 4, 0);
        }
        return this;
    }

    public ze d(float alpha) {
        this.o.setAlpha(alpha);
        return this;
    }

    public void e() {
    }

    public ze f(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin >= 0) {
            if (secondMargin >= 0) {
                if (bias <= 0.0f || bias > 1.0f) {
                    throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
                }
                if (firstSide == 1 || firstSide == 2) {
                    m(1, firstID, firstSide, firstMargin);
                    m(2, secondId, secondSide, secondMargin);
                    this.n.e0 = bias;
                } else if (firstSide != 6 && firstSide != 7) {
                    m(3, firstID, firstSide, firstMargin);
                    m(4, secondId, secondSide, secondMargin);
                    this.n.f0 = bias;
                } else {
                    m(6, firstID, firstSide, firstMargin);
                    m(7, secondId, secondSide, secondMargin);
                    this.n.e0 = bias;
                }
                return this;
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public ze g(int toView) {
        if (toView == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(toView, 2, 0, toView, 1, 0, 0.5f);
        }
        return this;
    }

    public ze h(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        m(1, leftId, leftSide, leftMargin);
        m(2, rightId, rightSide, rightMargin);
        this.n.e0 = bias;
        return this;
    }

    public ze i(int toView) {
        if (toView == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(toView, 7, 0, toView, 6, 0, 0.5f);
        }
        return this;
    }

    public ze j(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        m(6, startId, startSide, startMargin);
        m(7, endId, endSide, endMargin);
        this.n.e0 = bias;
        return this;
    }

    public ze k(int toView) {
        if (toView == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(toView, 4, 0, toView, 3, 0, 0.5f);
        }
        return this;
    }

    public ze l(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        m(3, topId, topSide, topMargin);
        m(4, bottomId, bottomSide, bottomMargin);
        this.n.f0 = bias;
        return this;
    }

    public ze m(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    ConstraintLayout.b bVar = this.n;
                    bVar.C = endID;
                    bVar.D = -1;
                } else if (endSide == 2) {
                    ConstraintLayout.b bVar2 = this.n;
                    bVar2.D = endID;
                    bVar2.C = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("Left to "), K(endSide), " undefined"));
                }
                ((ViewGroup.MarginLayoutParams) this.n).leftMargin = margin;
                break;
            case 2:
                if (endSide == 1) {
                    ConstraintLayout.b bVar3 = this.n;
                    bVar3.E = endID;
                    bVar3.F = -1;
                } else if (endSide == 2) {
                    ConstraintLayout.b bVar4 = this.n;
                    bVar4.F = endID;
                    bVar4.E = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                ((ViewGroup.MarginLayoutParams) this.n).rightMargin = margin;
                break;
            case 3:
                if (endSide == 3) {
                    ConstraintLayout.b bVar5 = this.n;
                    bVar5.G = endID;
                    bVar5.H = -1;
                    bVar5.K = -1;
                    bVar5.L = -1;
                    bVar5.M = -1;
                } else if (endSide == 4) {
                    ConstraintLayout.b bVar6 = this.n;
                    bVar6.H = endID;
                    bVar6.G = -1;
                    bVar6.K = -1;
                    bVar6.L = -1;
                    bVar6.M = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                ((ViewGroup.MarginLayoutParams) this.n).topMargin = margin;
                break;
            case 4:
                if (endSide == 4) {
                    ConstraintLayout.b bVar7 = this.n;
                    bVar7.J = endID;
                    bVar7.I = -1;
                    bVar7.K = -1;
                    bVar7.L = -1;
                    bVar7.M = -1;
                } else if (endSide == 3) {
                    ConstraintLayout.b bVar8 = this.n;
                    bVar8.I = endID;
                    bVar8.J = -1;
                    bVar8.K = -1;
                    bVar8.L = -1;
                    bVar8.M = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                ((ViewGroup.MarginLayoutParams) this.n).bottomMargin = margin;
                break;
            case 5:
                if (endSide == 5) {
                    ConstraintLayout.b bVar9 = this.n;
                    bVar9.K = endID;
                    bVar9.J = -1;
                    bVar9.I = -1;
                    bVar9.G = -1;
                    bVar9.H = -1;
                }
                if (endSide == 3) {
                    ConstraintLayout.b bVar10 = this.n;
                    bVar10.L = endID;
                    bVar10.J = -1;
                    bVar10.I = -1;
                    bVar10.G = -1;
                    bVar10.H = -1;
                } else if (endSide == 4) {
                    ConstraintLayout.b bVar11 = this.n;
                    bVar11.M = endID;
                    bVar11.J = -1;
                    bVar11.I = -1;
                    bVar11.G = -1;
                    bVar11.H = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                this.n.b0 = margin;
                break;
            case 6:
                if (endSide == 6) {
                    ConstraintLayout.b bVar12 = this.n;
                    bVar12.R = endID;
                    bVar12.Q = -1;
                } else if (endSide == 7) {
                    ConstraintLayout.b bVar13 = this.n;
                    bVar13.Q = endID;
                    bVar13.R = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                this.n.setMarginStart(margin);
                break;
            case 7:
                if (endSide == 7) {
                    ConstraintLayout.b bVar14 = this.n;
                    bVar14.T = endID;
                    bVar14.S = -1;
                } else if (endSide == 6) {
                    ConstraintLayout.b bVar15 = this.n;
                    bVar15.S = endID;
                    bVar15.T = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), K(endSide), " undefined"));
                }
                this.n.setMarginEnd(margin);
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(K(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(wo1.C(sb, K(endSide), " unknown"));
        }
        return this;
    }

    public ze n(int height) {
        this.n.o0 = height;
        return this;
    }

    public ze o(int width) {
        this.n.n0 = width;
        return this;
    }

    public ze p(int height) {
        ((ViewGroup.MarginLayoutParams) this.n).height = height;
        return this;
    }

    public ze q(int height) {
        this.n.s0 = height;
        return this;
    }

    public ze r(int width) {
        this.n.r0 = width;
        return this;
    }

    public ze s(int height) {
        this.n.q0 = height;
        return this;
    }

    public ze t(int width) {
        this.n.p0 = width;
        return this;
    }

    public ze u(int width) {
        ((ViewGroup.MarginLayoutParams) this.n).width = width;
        return this;
    }

    public ze v(String ratio) {
        this.n.g0 = ratio;
        return this;
    }

    public ze w(float elevation) {
        this.o.setElevation(elevation);
        return this;
    }

    public ze x(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.n.U = value;
                break;
            case 2:
                this.n.W = value;
                break;
            case 3:
                this.n.V = value;
                break;
            case 4:
                this.n.X = value;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.n.Y = value;
                break;
            case 7:
                this.n.Z = value;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ze y(float bias) {
        this.n.e0 = bias;
        return this;
    }

    public ze z(int chainStyle) {
        this.n.l0 = chainStyle;
        return this;
    }
}