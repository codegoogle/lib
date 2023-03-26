package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.ff;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public class ae extends td {
    public static final String D = "KeyTrigger";
    private static final String E = "KeyTrigger";
    public static final String F = "viewTransitionOnCross";
    public static final String G = "viewTransitionOnPositiveCross";
    public static final String H = "viewTransitionOnNegativeCross";
    public static final String I = "postLayout";
    public static final String J = "triggerSlack";
    public static final String K = "triggerCollisionView";
    public static final String L = "triggerCollisionId";
    public static final String M = "triggerID";
    public static final String N = "positiveCross";
    public static final String O = "negativeCross";
    public static final String P = "triggerReceiver";
    public static final String Q = "CROSS";
    public static final int R = 5;
    private int S = -1;
    private String T = null;
    private int U;
    private String V;
    private String W;
    private int X;
    private int Y;
    private View Z;
    public float a0;
    private boolean b0;
    private boolean c0;
    private boolean d0;
    private float e0;
    private float f0;
    private boolean g0;
    public int h0;
    public int i0;
    public int j0;
    public RectF k0;
    public RectF l0;
    public HashMap<String, Method> m0;

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 7;
        private static final int g = 8;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 11;
        private static final int k = 12;
        private static final int l = 13;
        private static final int m = 14;
        private static SparseIntArray n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(ff.m.lg, 8);
            n.append(ff.m.pg, 4);
            n.append(ff.m.qg, 1);
            n.append(ff.m.rg, 2);
            n.append(ff.m.mg, 7);
            n.append(ff.m.sg, 6);
            n.append(ff.m.ug, 5);
            n.append(ff.m.og, 9);
            n.append(ff.m.ng, 10);
            n.append(ff.m.tg, 11);
            n.append(ff.m.vg, 12);
            n.append(ff.m.wg, 13);
            n.append(ff.m.xg, 14);
        }

        private a() {
        }

        public static void a(ae c2, TypedArray a2, Context context) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        c2.V = a2.getString(index);
                        break;
                    case 2:
                        c2.W = a2.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        n.get(index);
                        break;
                    case 4:
                        c2.T = a2.getString(index);
                        break;
                    case 5:
                        c2.a0 = a2.getFloat(index, c2.a0);
                        break;
                    case 6:
                        c2.X = a2.getResourceId(index, c2.X);
                        break;
                    case 7:
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
                    case 8:
                        int integer = a2.getInteger(index, c2.y);
                        c2.y = integer;
                        c2.e0 = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c2.Y = a2.getResourceId(index, c2.Y);
                        break;
                    case 10:
                        c2.g0 = a2.getBoolean(index, c2.g0);
                        break;
                    case 11:
                        c2.U = a2.getResourceId(index, c2.U);
                        break;
                    case 12:
                        c2.j0 = a2.getResourceId(index, c2.j0);
                        break;
                    case 13:
                        c2.h0 = a2.getResourceId(index, c2.h0);
                        break;
                    case 14:
                        c2.i0 = a2.getResourceId(index, c2.i0);
                        break;
                }
            }
        }
    }

    public ae() {
        int i = td.a;
        this.U = i;
        this.V = null;
        this.W = null;
        this.X = i;
        this.Y = i;
        this.Z = null;
        this.a0 = 0.1f;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.e0 = Float.NaN;
        this.g0 = false;
        this.h0 = i;
        this.i0 = i;
        this.j0 = i;
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new HashMap<>();
        this.B = 5;
        this.C = new HashMap<>();
    }

    private void B(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(CryptoConstants.ALIAS_SEPARATOR)) {
            C(str, call);
            return;
        }
        if (this.m0.containsKey(str)) {
            method = this.m0.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new Class[0]);
                this.m0.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.m0.put(str, null);
                call.getClass().getSimpleName();
                qd.k(call);
                return;
            }
        }
        try {
            method.invoke(call, new Object[0]);
        } catch (Exception unused2) {
            call.getClass().getSimpleName();
            qd.k(call);
        }
    }

    private void C(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.C.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                we weVar = this.C.get(str2);
                if (weVar != null) {
                    weVar.a(view);
                }
            }
        }
    }

    private void E(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(float pos, View child) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.Y != td.a) {
            if (this.Z == null) {
                this.Z = ((ViewGroup) child.getParent()).findViewById(this.Y);
            }
            E(this.k0, this.Z, this.g0);
            E(this.l0, child, this.g0);
            if (this.k0.intersect(this.l0)) {
                if (this.b0) {
                    this.b0 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.d0) {
                    this.d0 = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.c0 = true;
                z5 = z6;
                z3 = false;
            } else {
                if (this.b0) {
                    z = false;
                } else {
                    this.b0 = true;
                    z = true;
                }
                if (this.c0) {
                    this.c0 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.d0 = true;
                z5 = false;
            }
        } else {
            if (this.b0) {
                float f = this.e0;
                if ((this.f0 - f) * (pos - f) < 0.0f) {
                    this.b0 = false;
                    z = true;
                    if (!this.c0) {
                        float f2 = this.e0;
                        float f3 = pos - f2;
                        if ((this.f0 - f2) * f3 < 0.0f && f3 < 0.0f) {
                            this.c0 = false;
                            z2 = true;
                            if (this.d0) {
                                float f4 = this.e0;
                                float f5 = pos - f4;
                                if ((this.f0 - f4) * f5 >= 0.0f || f5 <= 0.0f) {
                                    z4 = false;
                                } else {
                                    this.d0 = false;
                                    z4 = true;
                                }
                                boolean z7 = z2;
                                z5 = z4;
                                z3 = z7;
                            } else {
                                if (Math.abs(pos - this.e0) > this.a0) {
                                    this.d0 = true;
                                }
                                z3 = z2;
                                z5 = false;
                            }
                        }
                    } else if (Math.abs(pos - this.e0) > this.a0) {
                        this.c0 = true;
                    }
                    z2 = false;
                    if (this.d0) {
                    }
                }
            } else if (Math.abs(pos - this.e0) > this.a0) {
                this.b0 = true;
            }
            z = false;
            if (!this.c0) {
            }
            z2 = false;
            if (this.d0) {
            }
        }
        this.f0 = pos;
        if (z3 || z || z5) {
            ((ge) child.getParent()).t0(this.X, z5, pos);
        }
        View findViewById = this.U == td.a ? child : ((ge) child.getParent()).findViewById(this.U);
        if (z3) {
            String str = this.V;
            if (str != null) {
                B(str, findViewById);
            }
            if (this.h0 != td.a) {
                ((ge) child.getParent()).h1(this.h0, findViewById);
            }
        }
        if (z5) {
            String str2 = this.W;
            if (str2 != null) {
                B(str2, findViewById);
            }
            if (this.i0 != td.a) {
                ((ge) child.getParent()).h1(this.i0, findViewById);
            }
        }
        if (z) {
            String str3 = this.T;
            if (str3 != null) {
                B(str3, findViewById);
            }
            if (this.j0 != td.a) {
                ((ge) child.getParent()).h1(this.j0, findViewById);
            }
        }
    }

    public int D() {
        return this.S;
    }

    @Override // com.p7700g.p99005.td
    public void a(HashMap<String, kd> splines) {
    }

    @Override // com.p7700g.p99005.td
    /* renamed from: b */
    public td clone() {
        return new ae().c(this);
    }

    @Override // com.p7700g.p99005.td
    public td c(td src) {
        super.c(src);
        ae aeVar = (ae) src;
        this.S = aeVar.S;
        this.T = aeVar.T;
        this.U = aeVar.U;
        this.V = aeVar.V;
        this.W = aeVar.W;
        this.X = aeVar.X;
        this.Y = aeVar.Y;
        this.Z = aeVar.Z;
        this.a0 = aeVar.a0;
        this.b0 = aeVar.b0;
        this.c0 = aeVar.c0;
        this.d0 = aeVar.d0;
        this.e0 = aeVar.e0;
        this.f0 = aeVar.f0;
        this.g0 = aeVar.g0;
        this.k0 = aeVar.k0;
        this.l0 = aeVar.l0;
        this.m0 = aeVar.m0;
        return this;
    }

    @Override // com.p7700g.p99005.td
    public void d(HashSet<String> attributes) {
    }

    @Override // com.p7700g.p99005.td
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, ff.m.kg), context);
    }

    @Override // com.p7700g.p99005.td
    public void j(String tag, Object value) {
        tag.hashCode();
        char c = 65535;
        switch (tag.hashCode()) {
            case -1594793529:
                if (tag.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                break;
            case -966421266:
                if (tag.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                break;
            case -786670827:
                if (tag.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                break;
            case -648752941:
                if (tag.equals("triggerID")) {
                    c = 3;
                    break;
                }
                break;
            case -638126837:
                if (tag.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                break;
            case -76025313:
                if (tag.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                break;
            case -9754574:
                if (tag.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                break;
            case 64397344:
                if (tag.equals("CROSS")) {
                    c = 7;
                    break;
                }
                break;
            case 364489912:
                if (tag.equals("triggerSlack")) {
                    c = '\b';
                    break;
                }
                break;
            case 1301930599:
                if (tag.equals("viewTransitionOnCross")) {
                    c = '\t';
                    break;
                }
                break;
            case 1401391082:
                if (tag.equals("postLayout")) {
                    c = '\n';
                    break;
                }
                break;
            case 1535404999:
                if (tag.equals("triggerReceiver")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.W = value.toString();
                return;
            case 1:
                this.i0 = n(value);
                return;
            case 2:
                this.Y = n(value);
                return;
            case 3:
                this.X = n(value);
                return;
            case 4:
                this.V = value.toString();
                return;
            case 5:
                this.Z = (View) value;
                return;
            case 6:
                this.h0 = n(value);
                return;
            case 7:
                this.T = value.toString();
                return;
            case '\b':
                this.a0 = m(value);
                return;
            case '\t':
                this.j0 = n(value);
                return;
            case '\n':
                this.g0 = l(value);
                return;
            case 11:
                this.U = n(value);
                return;
            default:
                return;
        }
    }
}