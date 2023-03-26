package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ff;
import java.util.HashMap;

/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public class xd extends yd {
    private static final String F = "KeyPosition";
    public static final String G = "KeyPosition";
    public static final int H = 2;
    public static final int I = 1;
    public static final int J = 0;
    public static final String K = "transitionEasing";
    public static final String L = "drawPath";
    public static final String M = "percentWidth";
    public static final String N = "percentHeight";
    public static final String O = "sizePercent";
    public static final String P = "percentX";
    public static final String Q = "percentY";
    public static final int R = 2;
    public String S = null;
    public int T = td.a;
    public int U = 0;
    public float V = Float.NaN;
    public float W = Float.NaN;
    public float X = Float.NaN;
    public float Y = Float.NaN;
    public float Z = Float.NaN;
    public float a0 = Float.NaN;
    public int b0 = 0;
    private float c0 = Float.NaN;
    private float d0 = Float.NaN;

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static SparseIntArray m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            m = sparseIntArray;
            sparseIntArray.append(ff.m.Gf, 1);
            m.append(ff.m.Ef, 2);
            m.append(ff.m.Nf, 3);
            m.append(ff.m.Cf, 4);
            m.append(ff.m.Df, 5);
            m.append(ff.m.Kf, 6);
            m.append(ff.m.Lf, 7);
            m.append(ff.m.Ff, 9);
            m.append(ff.m.Mf, 8);
            m.append(ff.m.Jf, 11);
            m.append(ff.m.If, 12);
            m.append(ff.m.Hf, 10);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(xd c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (m.get(index)) {
                    case 1:
                        if (ge.H0) {
                            int resourceId = a2.getResourceId(index, c2.z);
                            c2.z = resourceId;
                            if (resourceId == -1) {
                                c2.A = a2.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.A = a2.getString(index);
                            break;
                        } else {
                            c2.z = a2.getResourceId(index, c2.z);
                            break;
                        }
                    case 2:
                        c2.y = a2.getInt(index, c2.y);
                        break;
                    case 3:
                        if (a2.peekValue(index).type == 3) {
                            c2.S = a2.getString(index);
                            break;
                        } else {
                            c2.S = h9.n[a2.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c2.E = a2.getInteger(index, c2.E);
                        break;
                    case 5:
                        c2.U = a2.getInt(index, c2.U);
                        break;
                    case 6:
                        c2.X = a2.getFloat(index, c2.X);
                        break;
                    case 7:
                        c2.Y = a2.getFloat(index, c2.Y);
                        break;
                    case 8:
                        float f2 = a2.getFloat(index, c2.W);
                        c2.V = f2;
                        c2.W = f2;
                        break;
                    case 9:
                        c2.b0 = a2.getInt(index, c2.b0);
                        break;
                    case 10:
                        c2.T = a2.getInt(index, c2.T);
                        break;
                    case 11:
                        c2.V = a2.getFloat(index, c2.V);
                        break;
                    case 12:
                        c2.W = a2.getFloat(index, c2.W);
                        break;
                    default:
                        Integer.toHexString(index);
                        m.get(index);
                        break;
                }
            }
            int i3 = c2.y;
        }
    }

    public xd() {
        this.B = 2;
    }

    private void t(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = Float.isNaN(this.X) ? 0.0f : this.X;
        float f4 = Float.isNaN(this.a0) ? 0.0f : this.a0;
        float f5 = Float.isNaN(this.Y) ? 0.0f : this.Y;
        this.c0 = (int) (((Float.isNaN(this.Z) ? 0.0f : this.Z) * f2) + (f3 * f) + start_x);
        this.d0 = (int) ((f2 * f5) + (f * f4) + start_y);
    }

    private void u(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = this.X;
        float f4 = (f * f3) + start_x;
        float f5 = this.Y;
        this.c0 = ((-f2) * f5) + f4;
        this.d0 = (f * f5) + (f2 * f3) + start_y;
    }

    private void v(int layoutWidth, int layoutHeight) {
        float f = this.X;
        float f2 = 0;
        this.c0 = ((layoutWidth - 0) * f) + f2;
        this.d0 = ((layoutHeight - 0) * f) + f2;
    }

    @Override // com.p7700g.p99005.td
    public void a(HashMap<String, kd> splines) {
    }

    @Override // com.p7700g.p99005.td
    /* renamed from: b */
    public td clone() {
        return new xd().c(this);
    }

    @Override // com.p7700g.p99005.td
    public td c(td src) {
        super.c(src);
        xd xdVar = (xd) src;
        this.S = xdVar.S;
        this.T = xdVar.T;
        this.U = xdVar.U;
        this.V = xdVar.V;
        this.W = Float.NaN;
        this.X = xdVar.X;
        this.Y = xdVar.Y;
        this.Z = xdVar.Z;
        this.a0 = xdVar.a0;
        this.c0 = xdVar.c0;
        this.d0 = xdVar.d0;
        return this;
    }

    @Override // com.p7700g.p99005.td
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, ff.m.Bf));
    }

    @Override // com.p7700g.p99005.td
    public void j(String tag, Object value) {
        tag.hashCode();
        char c = 65535;
        switch (tag.hashCode()) {
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (tag.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (tag.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (tag.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (tag.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (tag.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (tag.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.S = value.toString();
                return;
            case 1:
                this.V = m(value);
                return;
            case 2:
                this.W = m(value);
                return;
            case 3:
                this.U = n(value);
                return;
            case 4:
                float m = m(value);
                this.V = m;
                this.W = m;
                return;
            case 5:
                this.X = m(value);
                return;
            case 6:
                this.Y = m(value);
                return;
            default:
                return;
        }
    }

    @Override // com.p7700g.p99005.yd
    public void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i = this.b0;
        if (i == 1) {
            u(start_x, start_y, end_x, end_y);
        } else if (i != 2) {
            t(start_x, start_y, end_x, end_y);
        } else {
            v(layoutWidth, layoutHeight);
        }
    }

    @Override // com.p7700g.p99005.yd
    public float p() {
        return this.c0;
    }

    @Override // com.p7700g.p99005.yd
    public float q() {
        return this.d0;
    }

    @Override // com.p7700g.p99005.yd
    public boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x, float y) {
        o(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x - this.c0) < 20.0f && Math.abs(y - this.d0) < 20.0f;
    }

    @Override // com.p7700g.p99005.yd
    public void s(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        int i = this.b0;
        if (i == 1) {
            x(start, end, x, y, attribute, value);
        } else if (i != 2) {
            w(start, end, x, y, attribute, value);
        } else {
            y(view, start, end, x, y, attribute, value);
        }
    }

    public void w(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = (x - centerX) / centerX2;
                value[1] = (y - centerY) / centerY2;
                return;
            }
            value[1] = (x - centerX) / centerX2;
            value[0] = (y - centerY) / centerY2;
            return;
        }
        attribute[0] = "percentX";
        value[0] = (x - centerX) / centerX2;
        attribute[1] = "percentY";
        value[1] = (y - centerY) / centerY2;
    }

    public void x(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f = centerX2 / hypot;
        float f2 = centerY2 / hypot;
        float f3 = y - centerY;
        float f4 = x - centerX;
        float f5 = ((f * f3) - (f4 * f2)) / hypot;
        float f6 = ((f2 * f3) + (f * f4)) / hypot;
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = f6;
                value[1] = f5;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f6;
        value[1] = f5;
    }

    public void y(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (attribute[0] != null) {
            if ("percentX".equals(attribute[0])) {
                value[0] = x / width;
                value[1] = y / height;
                return;
            }
            value[1] = x / width;
            value[0] = y / height;
            return;
        }
        attribute[0] = "percentX";
        value[0] = x / width;
        attribute[1] = "percentY";
        value[1] = y / height;
    }

    public void z(int type) {
        this.b0 = type;
    }
}