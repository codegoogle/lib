package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.ie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public class oe {
    private static String a = "ViewTransition";
    public static final String b = "ViewTransition";
    public static final String c = "KeyFrameSet";
    public static final String d = "ConstraintOverride";
    public static final String e = "CustomAttribute";
    public static final String f = "CustomMethod";
    private static final int g = -1;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    private static final int p = -1;
    private static final int q = -2;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;
    public static final int x = 6;
    public int D;
    public wd E;
    public af.a F;
    private int I;
    private String J;
    public Context N;
    public af y;
    private int z;
    private int A = -1;
    private boolean B = false;
    private int C = 0;
    private int G = -1;
    private int H = -1;
    private int K = 0;
    private String L = null;
    private int M = -1;
    private int O = -1;
    private int P = -1;
    private int Q = -1;
    private int R = -1;
    private int S = -1;
    private int T = -1;
    private int U = -1;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ h9 a;

        public a(final oe this$0, final h9 val$easing) {
            this.a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v) {
            return (float) this.a.a(v);
        }
    }

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public static class b {
        private final int a;
        private final int b;
        public long c;
        public ce d;
        public int e;
        public int f;
        public pe h;
        public Interpolator i;
        public float k;
        public float l;
        public long m;
        public boolean o;
        public k9 g = new k9();
        public boolean j = false;
        public Rect n = new Rect();

        public b(pe controller, ce motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.o = false;
            this.h = controller;
            this.d = motionController;
            this.e = duration;
            this.f = upDuration;
            long nanoTime = System.nanoTime();
            this.c = nanoTime;
            this.m = nanoTime;
            this.h.c(this);
            this.i = interpolator;
            this.a = setTag;
            this.b = clearTag;
            if (mode == 3) {
                this.o = true;
            }
            this.l = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            a();
        }

        public void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        public void b() {
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l) + this.k;
            this.k = f;
            if (f >= 1.0f) {
                this.k = 1.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            ce ceVar = this.d;
            boolean L = ceVar.L(ceVar.C, interpolation, nanoTime, this.g);
            if (this.k >= 1.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                if (!this.o) {
                    this.h.k(this);
                }
            }
            if (this.k < 1.0f || L) {
                this.h.g();
            }
        }

        public void c() {
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = this.k - (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l);
            this.k = f;
            if (f < 0.0f) {
                this.k = 0.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            ce ceVar = this.d;
            boolean L = ceVar.L(ceVar.C, interpolation, nanoTime, this.g);
            if (this.k <= 0.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                this.h.k(this);
            }
            if (this.k > 0.0f || L) {
                this.h.g();
            }
        }

        public void d(int action, float x, float y) {
            if (action == 1) {
                if (this.j) {
                    return;
                }
                e(true);
            } else if (action != 2) {
            } else {
                this.d.J().getHitRect(this.n);
                if (this.n.contains((int) x, (int) y) || this.j) {
                    return;
                }
                e(true);
            }
        }

        public void e(boolean dir) {
            int i;
            this.j = dir;
            if (dir && (i = this.f) != -1) {
                this.l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.h.g();
            this.m = System.nanoTime();
        }
    }

    public oe(Context context, XmlPullParser parser) {
        char c2;
        this.N = context;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(d)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals(c)) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 61998586:
                            if (name.equals(b)) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 366511058:
                            if (name.equals(f)) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals(e)) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        n(context, parser);
                    } else if (c2 == 1) {
                        this.E = new wd(context, parser);
                    } else if (c2 == 2) {
                        this.F = af.w(context, parser);
                    } else if (c2 != 3 && c2 != 4) {
                        qd.f();
                        parser.getLineNumber();
                    } else {
                        we.q(context, parser, this.F.g);
                    }
                } else if (eventType != 3) {
                    continue;
                } else if (b.equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void l(View[] viewArr) {
        if (this.O != -1) {
            for (View view : viewArr) {
                view.setTag(this.O, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.P != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.P, null);
            }
        }
    }

    private void n(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.no);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == ff.m.oo) {
                this.z = obtainStyledAttributes.getResourceId(index, this.z);
            } else if (index == ff.m.wo) {
                if (ge.H0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.I);
                    this.I = resourceId;
                    if (resourceId == -1) {
                        this.J = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.J = obtainStyledAttributes.getString(index);
                } else {
                    this.I = obtainStyledAttributes.getResourceId(index, this.I);
                }
            } else if (index == ff.m.xo) {
                this.A = obtainStyledAttributes.getInt(index, this.A);
            } else if (index == ff.m.Ao) {
                this.B = obtainStyledAttributes.getBoolean(index, this.B);
            } else if (index == ff.m.yo) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == ff.m.so) {
                this.G = obtainStyledAttributes.getInt(index, this.G);
            } else if (index == ff.m.Bo) {
                this.H = obtainStyledAttributes.getInt(index, this.H);
            } else if (index == ff.m.Co) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            } else if (index == ff.m.vo) {
                int i3 = obtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.M = resourceId2;
                    if (resourceId2 != -1) {
                        this.K = -2;
                    }
                } else if (i3 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.L = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.M = obtainStyledAttributes.getResourceId(index, -1);
                        this.K = -2;
                    } else {
                        this.K = -1;
                    }
                } else {
                    this.K = obtainStyledAttributes.getInteger(index, this.K);
                }
            } else if (index == ff.m.zo) {
                this.O = obtainStyledAttributes.getResourceId(index, this.O);
            } else if (index == ff.m.ro) {
                this.P = obtainStyledAttributes.getResourceId(index, this.P);
            } else if (index == ff.m.uo) {
                this.Q = obtainStyledAttributes.getResourceId(index, this.Q);
            } else if (index == ff.m.to) {
                this.R = obtainStyledAttributes.getResourceId(index, this.R);
            } else if (index == ff.m.qo) {
                this.T = obtainStyledAttributes.getResourceId(index, this.T);
            } else if (index == ff.m.po) {
                this.S = obtainStyledAttributes.getInteger(index, this.S);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void v(ie.b transition, View view) {
        int i2 = this.G;
        if (i2 != -1) {
            transition.O(i2);
        }
        transition.V(this.C);
        transition.R(this.K, this.L, this.M);
        int id = view.getId();
        wd wdVar = this.E;
        if (wdVar != null) {
            ArrayList<td> d2 = wdVar.d(-1);
            wd wdVar2 = new wd();
            Iterator<td> it = d2.iterator();
            while (it.hasNext()) {
                wdVar2.c(it.next().clone().k(id));
            }
            transition.t(wdVar2);
        }
    }

    public void a(pe controller, ge motionLayout, View view) {
        ce ceVar = new ce(view);
        ceVar.R(view);
        this.E.a(ceVar);
        ceVar.a0(motionLayout.getWidth(), motionLayout.getHeight(), this.G, System.nanoTime());
        new b(controller, ceVar, this.G, this.H, this.A, e(motionLayout.getContext()), this.O, this.P);
    }

    public void b(pe controller, ge layout, int fromId, af current, final View... views) {
        int[] constraintSetIds;
        if (this.B) {
            return;
        }
        int i2 = this.D;
        if (i2 == 2) {
            a(controller, layout, views[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : layout.getConstraintSetIds()) {
                if (i3 != fromId) {
                    af v0 = layout.v0(i3);
                    for (View view : views) {
                        af.a k0 = v0.k0(view.getId());
                        af.a aVar = this.F;
                        if (aVar != null) {
                            aVar.h(k0);
                            k0.g.putAll(this.F.g);
                        }
                    }
                }
            }
        }
        af afVar = new af();
        afVar.I(current);
        for (View view2 : views) {
            af.a k02 = afVar.k0(view2.getId());
            af.a aVar2 = this.F;
            if (aVar2 != null) {
                aVar2.h(k02);
                k02.g.putAll(this.F.g);
            }
        }
        layout.f1(fromId, afVar);
        int i4 = ff.g.N3;
        layout.f1(i4, current);
        layout.z(i4, -1, -1);
        ie.b bVar = new ie.b(-1, layout.R0, i4, fromId);
        for (View view3 : views) {
            v(bVar, view3);
        }
        layout.setTransition(bVar);
        layout.Y0(new Runnable() { // from class: com.p7700g.p99005.nd
            @Override // java.lang.Runnable
            public final void run() {
                oe.this.l(views);
            }
        });
    }

    public boolean c(View view) {
        int i2 = this.Q;
        boolean z = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.R;
        return z && (i3 == -1 || view.getTag(i3) == null);
    }

    public int d() {
        return this.z;
    }

    public Interpolator e(Context context) {
        int i2 = this.K;
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    if (i2 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, h9.c(this.L));
        }
        return AnimationUtils.loadInterpolator(context, this.M);
    }

    public int f() {
        return this.S;
    }

    public int g() {
        return this.U;
    }

    public int h() {
        return this.T;
    }

    public int i() {
        return this.A;
    }

    public boolean j() {
        return !this.B;
    }

    public boolean m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (!(this.I == -1 && this.J == null) && c(view)) {
            if (view.getId() == this.I) {
                return true;
            }
            return this.J != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).A0) != null && str.matches(this.J);
        }
        return false;
    }

    public void o(boolean enable) {
        this.B = !enable;
    }

    public void p(int id) {
        this.z = id;
    }

    public void q(int sharedValue) {
        this.S = sharedValue;
    }

    public void r(int sharedValueCurrent) {
        this.U = sharedValueCurrent;
    }

    public void s(int sharedValueID) {
        this.T = sharedValueID;
    }

    public void t(int stateTransition) {
        this.A = stateTransition;
    }

    public String toString() {
        StringBuilder G = wo1.G("ViewTransition(");
        G.append(qd.i(this.N, this.z));
        G.append(")");
        return G.toString();
    }

    public boolean u(int action) {
        int i2 = this.A;
        return i2 == 1 ? action == 0 : i2 == 2 ? action == 1 : i2 == 3 && action == 0;
    }
}