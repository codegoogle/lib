package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.ge;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public class ie {
    public static final int A = 5;
    public static final int B = 6;
    private static final String a = "MotionScene";
    private static final boolean b = false;
    private static final int c = 8;
    public static final int d = 0;
    public static final int e = 1;
    private static final int f = -1;
    private static final int g = -2;
    public static final int h = -1;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    private static final String l = "MotionScene";
    private static final String m = "Transition";
    private static final String n = "OnSwipe";
    private static final String o = "OnClick";
    private static final String p = "StateSet";
    private static final String q = "Include";
    private static final String r = "include";
    private static final String s = "KeyFrameSet";
    private static final String t = "ConstraintSet";
    private static final String u = "ViewTransition";
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    private final ge C;
    private MotionEvent P;
    private ge.i S;
    private boolean T;
    public final pe U;
    public float V;
    public float W;
    public Cif D = null;
    public b E = null;
    private boolean F = false;
    private ArrayList<b> G = new ArrayList<>();
    private b H = null;
    private ArrayList<b> I = new ArrayList<>();
    private SparseArray<af> J = new SparseArray<>();
    private HashMap<String, Integer> K = new HashMap<>();
    private SparseIntArray L = new SparseIntArray();
    private boolean M = false;
    private int N = 400;
    private int O = 0;
    private boolean Q = false;
    private boolean R = false;

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ h9 a;

        public a(final ie this$0, final h9 val$easing) {
            this.a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v) {
            return (float) this.a.a(v);
        }
    }

    public ie(ge layout) {
        this.C = layout;
        this.U = new pe(layout);
    }

    public static String A(Context context, int resourceId, XmlPullParser pullParser) {
        StringBuilder G = wo1.G(".(");
        G.append(qd.i(context, resourceId));
        G.append(".xml:");
        G.append(pullParser.getLineNumber());
        G.append(") \"");
        G.append(pullParser.getName());
        G.append("\"");
        return G.toString();
    }

    private int G(int stateId) {
        int e2;
        Cif cif = this.D;
        return (cif == null || (e2 = cif.e(stateId, -1, -1)) == -1) ? stateId : e2;
    }

    private boolean R(int key) {
        int i2 = this.L.get(key);
        int size = this.L.size();
        while (i2 > 0) {
            if (i2 == key) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.L.get(i2);
            size = i3;
        }
        return false;
    }

    private boolean T() {
        return this.S != null;
    }

    private void V(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        b bVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    if (this.M) {
                        PrintStream printStream = System.out;
                        printStream.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(t)) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -687739768:
                            if (name.equals(q)) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 269306229:
                            if (name.equals(m)) {
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 312750793:
                            if (name.equals(o)) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 327855227:
                            if (name.equals(n)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 793277014:
                            if (name.equals(aa.d.a)) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals(p)) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1942574248:
                            if (name.equals(r)) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            c0(context, xml);
                            continue;
                        case 1:
                            ArrayList<b> arrayList = this.G;
                            b bVar2 = new b(this, context, xml);
                            arrayList.add(bVar2);
                            if (this.E == null && !bVar2.s) {
                                this.E = bVar2;
                                if (bVar2.C != null) {
                                    this.E.C.D(this.T);
                                }
                            }
                            if (bVar2.s) {
                                if (bVar2.t == -1) {
                                    this.H = bVar2;
                                } else {
                                    this.I.add(bVar2);
                                }
                                this.G.remove(bVar2);
                            }
                            bVar = bVar2;
                            continue;
                        case 2:
                            if (bVar == null) {
                                context.getResources().getResourceEntryName(resourceId);
                                xml.getLineNumber();
                            }
                            if (bVar != null) {
                                bVar.C = new le(context, this.C, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 3:
                            if (bVar != null) {
                                bVar.v(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 4:
                            this.D = new Cif(context, xml);
                            continue;
                        case 5:
                            Z(context, xml);
                            continue;
                        case 6:
                        case 7:
                            b0(context, xml);
                            continue;
                        case '\b':
                            wd wdVar = new wd(context, xml);
                            if (bVar != null) {
                                bVar.B.add(wdVar);
                                continue;
                            } else {
                                continue;
                            }
                        case '\t':
                            this.U.b(new oe(context, xml));
                            continue;
                        default:
                            continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int Z(Context context, XmlPullParser parser) {
        char c2;
        char c3;
        af afVar = new af();
        afVar.a1(false);
        int attributeCount = parser.getAttributeCount();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = parser.getAttributeName(i4);
            String attributeValue = parser.getAttributeValue(i4);
            if (this.M) {
                PrintStream printStream = System.out;
                printStream.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    i3 = v(context, attributeValue);
                    break;
                case 1:
                    try {
                        afVar.S1 = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                afVar.S1 = 4;
                                continue;
                            case 1:
                                afVar.S1 = 2;
                                continue;
                            case 2:
                                afVar.S1 = 0;
                                continue;
                            case 3:
                                afVar.S1 = 1;
                                continue;
                            case 4:
                                afVar.S1 = 3;
                                continue;
                        }
                    }
                    break;
                case 2:
                    i2 = v(context, attributeValue);
                    this.K.put(q0(attributeValue), Integer.valueOf(i2));
                    afVar.Q1 = qd.i(context, i2);
                    break;
            }
        }
        if (i2 != -1) {
            if (this.C.o1 != 0) {
                afVar.z1(true);
            }
            afVar.x0(context, parser);
            if (i3 != -1) {
                this.L.put(i2, i3);
            }
            this.J.put(i2, afVar);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && t.equals(name)) {
                    return Z(context, xml);
                }
            }
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    private void b0(Context context, XmlPullParser mainParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), ff.m.Do);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == ff.m.Eo) {
                a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void c0(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.pk);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == ff.m.qk) {
                int i3 = obtainStyledAttributes.getInt(index, this.N);
                this.N = i3;
                if (i3 < 8) {
                    this.N = 8;
                }
            } else if (index == ff.m.rk) {
                this.O = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void g0(int key, ge motionLayout) {
        af afVar = this.J.get(key);
        afVar.R1 = afVar.Q1;
        int i2 = this.L.get(key);
        if (i2 > 0) {
            g0(i2, motionLayout);
            af afVar2 = this.J.get(i2);
            if (afVar2 == null) {
                qd.i(this.C.getContext(), i2);
                return;
            }
            afVar.R1 += "/" + afVar2.R1;
            afVar.J0(afVar2);
        } else {
            afVar.R1 = wo1.C(new StringBuilder(), afVar.R1, "  layout");
            afVar.I0(motionLayout);
        }
        afVar.q(afVar);
    }

    public static String q0(String id) {
        if (id == null) {
            return "";
        }
        int indexOf = id.indexOf(47);
        return indexOf < 0 ? id : id.substring(indexOf + 1);
    }

    private int v(Context context, String idString) {
        int i2;
        if (idString.contains("/")) {
            i2 = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.M) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i2);
            }
        } else {
            i2 = -1;
        }
        return (i2 != -1 || idString.length() <= 1) ? i2 : Integer.parseInt(idString.substring(1));
    }

    private int w(b transition) {
        int i2 = transition.r;
        if (i2 != -1) {
            for (int i3 = 0; i3 < this.G.size(); i3++) {
                if (this.G.get(i3).r == i2) {
                    return i3;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public float B() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.i();
    }

    public float C() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.j();
    }

    public boolean D() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return false;
        }
        return this.E.C.k();
    }

    public float E(View view, int position) {
        return 0.0f;
    }

    public float F(float dx, float dy) {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.l(dx, dy);
    }

    public int H() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0;
        }
        return this.E.C.m();
    }

    public float I() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.n();
    }

    public float J() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.o();
    }

    public float K() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.p();
    }

    public float L() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0.0f;
        }
        return this.E.C.q();
    }

    public float M() {
        b bVar = this.E;
        if (bVar != null) {
            return bVar.z;
        }
        return 0.0f;
    }

    public int N() {
        b bVar = this.E;
        if (bVar == null) {
            return -1;
        }
        return bVar.u;
    }

    public b O(int id) {
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.r == id) {
                return next;
            }
        }
        return null;
    }

    public int P(int stateId) {
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            if (it.next().u == stateId) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> Q(int stateId) {
        int G = G(stateId);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.u == G || next.t == G) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean S(View view, int position) {
        b bVar = this.E;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.B.iterator();
        while (it.hasNext()) {
            Iterator<td> it2 = ((wd) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().y == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean U(int id) {
        return this.U.h(id);
    }

    public int W(String id) {
        Integer num = this.K.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String X(int id) {
        for (Map.Entry<String, Integer> entry : this.K.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void Y(boolean changed, int left, int top, int right, int bottom) {
    }

    public void d0(float dx, float dy) {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return;
        }
        this.E.C.w(dx, dy);
    }

    public void e0(float dx, float dy) {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return;
        }
        this.E.C.x(dx, dy);
    }

    public void f(ge motionLayout, int currentState) {
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.D.size() > 0) {
                Iterator it2 = next.D.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.I.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.D.size() > 0) {
                Iterator it4 = next2.D.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.G.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.D.size() > 0) {
                Iterator it6 = next3.D.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, currentState, next3);
                }
            }
        }
        Iterator<b> it7 = this.I.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.D.size() > 0) {
                Iterator it8 = next4.D.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, currentState, next4);
                }
            }
        }
    }

    public void f0(MotionEvent event, int currentState, ge motionLayout) {
        ge.i iVar;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.S == null) {
            this.S = this.C.J0();
        }
        this.S.e(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z2 = false;
            if (action != 0) {
                if (action == 2 && !this.Q) {
                    float rawY = event.getRawY() - this.W;
                    float rawX = event.getRawX() - this.V;
                    if ((rawX == zg2.s && rawY == zg2.s) || (motionEvent = this.P) == null) {
                        return;
                    }
                    b j2 = j(currentState, rawX, rawY, motionEvent);
                    if (j2 != null) {
                        motionLayout.setTransition(j2);
                        RectF r2 = this.E.C.r(this.C, rectF);
                        if (r2 != null && !r2.contains(this.P.getX(), this.P.getY())) {
                            z2 = true;
                        }
                        this.R = z2;
                        this.E.C.G(this.V, this.W);
                    }
                }
            } else {
                this.V = event.getRawX();
                this.W = event.getRawY();
                this.P = event;
                this.Q = false;
                if (this.E.C != null) {
                    RectF g2 = this.E.C.g(this.C, rectF);
                    if (g2 == null || g2.contains(this.P.getX(), this.P.getY())) {
                        RectF r3 = this.E.C.r(this.C, rectF);
                        if (r3 != null && !r3.contains(this.P.getX(), this.P.getY())) {
                            this.R = true;
                        } else {
                            this.R = false;
                        }
                        this.E.C.A(this.V, this.W);
                        return;
                    }
                    this.P = null;
                    this.Q = true;
                    return;
                }
                return;
            }
        }
        if (this.Q) {
            return;
        }
        b bVar = this.E;
        if (bVar != null && bVar.C != null && !this.R) {
            this.E.C.u(event, this.S, currentState, this);
        }
        this.V = event.getRawX();
        this.W = event.getRawY();
        if (event.getAction() != 1 || (iVar = this.S) == null) {
            return;
        }
        iVar.a();
        this.S = null;
        int i2 = motionLayout.W0;
        if (i2 != -1) {
            i(motionLayout, i2);
        }
    }

    public void g(b transition) {
        int w2 = w(transition);
        if (w2 == -1) {
            this.G.add(transition);
        } else {
            this.G.set(w2, transition);
        }
    }

    public boolean h(int viewTransitionId, ce motionController) {
        return this.U.e(viewTransitionId, motionController);
    }

    public void h0(ge motionLayout) {
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            int keyAt = this.J.keyAt(i2);
            if (R(keyAt)) {
                return;
            }
            g0(keyAt, motionLayout);
        }
    }

    public boolean i(ge motionLayout, int currentState) {
        b bVar;
        if (T() || this.F) {
            return false;
        }
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.E != 0 && ((bVar = this.E) != next || !bVar.L(2))) {
                if (currentState != next.u || (next.E != 4 && next.E != 2)) {
                    if (currentState == next.t && (next.E == 3 || next.E == 1)) {
                        ge.m mVar = ge.m.FINISHED;
                        motionLayout.setState(mVar);
                        motionLayout.setTransition(next);
                        if (next.E == 3) {
                            motionLayout.Z0();
                            motionLayout.setState(ge.m.SETUP);
                            motionLayout.setState(ge.m.MOVING);
                        } else {
                            motionLayout.setProgress(0.0f);
                            motionLayout.o0(true);
                            motionLayout.setState(ge.m.SETUP);
                            motionLayout.setState(ge.m.MOVING);
                            motionLayout.setState(mVar);
                            motionLayout.K0();
                        }
                        return true;
                    }
                } else {
                    ge.m mVar2 = ge.m.FINISHED;
                    motionLayout.setState(mVar2);
                    motionLayout.setTransition(next);
                    if (next.E == 4) {
                        motionLayout.X0();
                        motionLayout.setState(ge.m.SETUP);
                        motionLayout.setState(ge.m.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.o0(true);
                        motionLayout.setState(ge.m.SETUP);
                        motionLayout.setState(ge.m.MOVING);
                        motionLayout.setState(mVar2);
                        motionLayout.K0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void i0(b transition) {
        int w2 = w(transition);
        if (w2 != -1) {
            this.G.remove(w2);
        }
    }

    public b j(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState != -1) {
            List<b> Q = Q(currentState);
            float f2 = 0.0f;
            b bVar = null;
            RectF rectF = new RectF();
            for (b bVar2 : Q) {
                if (!bVar2.F && bVar2.C != null) {
                    bVar2.C.D(this.T);
                    RectF r2 = bVar2.C.r(this.C, rectF);
                    if (r2 == null || lastTouchDown == null || r2.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        RectF g2 = bVar2.C.g(this.C, rectF);
                        if (g2 == null || lastTouchDown == null || g2.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float a2 = bVar2.C.a(dx, dy);
                            if (bVar2.C.J && lastTouchDown != null) {
                                float x2 = lastTouchDown.getX() - bVar2.C.G;
                                float y2 = lastTouchDown.getY() - bVar2.C.H;
                                a2 = ((float) (Math.atan2(dy + y2, dx + x2) - Math.atan2(x2, y2))) * 10.0f;
                            }
                            float f3 = a2 * (bVar2.t == currentState ? -1.0f : 1.1f);
                            if (f3 > f2) {
                                bVar = bVar2;
                                f2 = f3;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.E;
    }

    public void j0(int id, af set) {
        this.J.put(id, set);
    }

    public void k(boolean disable) {
        this.F = disable;
    }

    public void k0(int duration) {
        b bVar = this.E;
        if (bVar != null) {
            bVar.O(duration);
        } else {
            this.N = duration;
        }
    }

    public void l(int id, boolean enable) {
        this.U.f(id, enable);
    }

    public void l0(View view, int position, String name, Object value) {
        b bVar = this.E;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.B.iterator();
        while (it.hasNext()) {
            Iterator<td> it2 = ((wd) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().y == position) {
                    int i2 = ((value != null ? ((Float) value).floatValue() : 0.0f) > 0.0f ? 1 : ((value != null ? ((Float) value).floatValue() : 0.0f) == 0.0f ? 0 : -1));
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public int m() {
        b bVar = this.E;
        if (bVar != null) {
            return bVar.G;
        }
        return -1;
    }

    public void m0(boolean rtl) {
        this.T = rtl;
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return;
        }
        this.E.C.D(this.T);
    }

    public int n() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return 0;
        }
        return this.E.C.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n0(int beginId, int endId) {
        int i2;
        int i3;
        Cif cif = this.D;
        if (cif != null) {
            i2 = cif.e(beginId, -1, -1);
            if (i2 == -1) {
                i2 = beginId;
            }
            i3 = this.D.e(endId, -1, -1);
        } else {
            i2 = beginId;
        }
        i3 = endId;
        b bVar = this.E;
        if (bVar != null && bVar.t == endId && this.E.u == beginId) {
            return;
        }
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if ((next.t == i3 && next.u == i2) || (next.t == endId && next.u == beginId)) {
                this.E = next;
                if (next == null || next.C == null) {
                    return;
                }
                this.E.C.D(this.T);
                return;
            }
        }
        b bVar2 = this.H;
        Iterator<b> it2 = this.I.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.t == endId) {
                bVar2 = next2;
            }
        }
        b bVar3 = new b(this, bVar2);
        bVar3.u = i2;
        bVar3.t = i3;
        if (i2 != -1) {
            this.G.add(bVar3);
        }
        this.E = bVar3;
    }

    public af o(int id) {
        return p(id, -1, -1);
    }

    public void o0(b transition) {
        this.E = transition;
        if (transition == null || transition.C == null) {
            return;
        }
        this.E.C.D(this.T);
    }

    public af p(int id, int width, int height) {
        int e2;
        if (this.M) {
            PrintStream printStream = System.out;
            printStream.println("id " + id);
            PrintStream printStream2 = System.out;
            StringBuilder G = wo1.G("size ");
            G.append(this.J.size());
            printStream2.println(G.toString());
        }
        Cif cif = this.D;
        if (cif != null && (e2 = cif.e(id, width, height)) != -1) {
            id = e2;
        }
        if (this.J.get(id) == null) {
            qd.i(this.C.getContext(), id);
            SparseArray<af> sparseArray = this.J;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.J.get(id);
    }

    public void p0() {
        b bVar = this.E;
        if (bVar == null || bVar.C == null) {
            return;
        }
        this.E.C.H();
    }

    public af q(Context context, String id) {
        if (this.M) {
            PrintStream printStream = System.out;
            printStream.println("id " + id);
            PrintStream printStream2 = System.out;
            StringBuilder G = wo1.G("size ");
            G.append(this.J.size());
            printStream2.println(G.toString());
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            int keyAt = this.J.keyAt(i2);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.M) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i2 + "> is <" + resourceName + "> looking for <" + id + ">");
            }
            if (id.equals(resourceName)) {
                return this.J.get(keyAt);
            }
        }
        return null;
    }

    public int[] r() {
        int size = this.J.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.J.keyAt(i2);
        }
        return iArr;
    }

    public boolean r0() {
        Iterator<b> it = this.G.iterator();
        while (it.hasNext()) {
            if (it.next().C != null) {
                return true;
            }
        }
        b bVar = this.E;
        return (bVar == null || bVar.C == null) ? false : true;
    }

    public ArrayList<b> s() {
        return this.G;
    }

    public boolean s0(ge layout) {
        return layout == this.C && layout.R0 == this;
    }

    public int t() {
        b bVar = this.E;
        if (bVar != null) {
            return bVar.y;
        }
        return this.N;
    }

    public void t0(int id, View... view) {
        this.U.m(id, view);
    }

    public int u() {
        b bVar = this.E;
        if (bVar == null) {
            return -1;
        }
        return bVar.t;
    }

    public Interpolator x() {
        int i2 = this.E.v;
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
            return new a(this, h9.c(this.E.w));
        }
        return AnimationUtils.loadInterpolator(this.C.getContext(), this.E.x);
    }

    public td y(Context context, int type, int target, int position) {
        b bVar = this.E;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.B.iterator();
        while (it.hasNext()) {
            wd wdVar = (wd) it.next();
            for (Integer num : wdVar.e()) {
                if (target == num.intValue()) {
                    Iterator<td> it2 = wdVar.d(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        td next = it2.next();
                        if (next.y == position && next.B == type) {
                            return next;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public void z(ce motionController) {
        b bVar = this.E;
        if (bVar != null) {
            Iterator it = bVar.B.iterator();
            while (it.hasNext()) {
                ((wd) it.next()).b(motionController);
            }
            return;
        }
        b bVar2 = this.H;
        if (bVar2 != null) {
            Iterator it2 = bVar2.B.iterator();
            while (it2.hasNext()) {
                ((wd) it2.next()).b(motionController);
            }
        }
    }

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 4;
        public static final int i = -2;
        public static final int j = -1;
        public static final int k = 0;
        public static final int l = 1;
        public static final int m = 2;
        public static final int n = 3;
        public static final int o = 4;
        public static final int p = 5;
        public static final int q = 6;
        private final ie A;
        private ArrayList<wd> B;
        private le C;
        private ArrayList<a> D;
        private int E;
        private boolean F;
        private int G;
        private int H;
        private int I;
        private int r;
        private boolean s;
        private int t;
        private int u;
        private int v;
        private String w;
        private int x;
        private int y;
        private float z;

        public b(ie motionScene, b global) {
            this.r = -1;
            this.s = false;
            this.t = -1;
            this.u = -1;
            this.v = 0;
            this.w = null;
            this.x = -1;
            this.y = 400;
            this.z = 0.0f;
            this.B = new ArrayList<>();
            this.C = null;
            this.D = new ArrayList<>();
            this.E = 0;
            this.F = false;
            this.G = -1;
            this.H = 0;
            this.I = 0;
            this.A = motionScene;
            this.y = motionScene.N;
            if (global != null) {
                this.G = global.G;
                this.v = global.v;
                this.w = global.w;
                this.x = global.x;
                this.y = global.y;
                this.B = global.B;
                this.z = global.z;
                this.H = global.H;
            }
        }

        private void x(ie motionScene, Context context, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                if (index == ff.m.Kn) {
                    this.t = a2.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.t);
                    if ("layout".equals(resourceTypeName)) {
                        af afVar = new af();
                        afVar.w0(context, this.t);
                        motionScene.J.append(this.t, afVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.t = motionScene.a0(context, this.t);
                    }
                } else if (index == ff.m.Ln) {
                    this.u = a2.getResourceId(index, this.u);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.u);
                    if ("layout".equals(resourceTypeName2)) {
                        af afVar2 = new af();
                        afVar2.w0(context, this.u);
                        motionScene.J.append(this.u, afVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.u = motionScene.a0(context, this.u);
                    }
                } else if (index == ff.m.On) {
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = a2.getResourceId(index, -1);
                        this.x = resourceId;
                        if (resourceId != -1) {
                            this.v = -2;
                        }
                    } else if (i3 == 3) {
                        String string = a2.getString(index);
                        this.w = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.x = a2.getResourceId(index, -1);
                                this.v = -2;
                            } else {
                                this.v = -1;
                            }
                        }
                    } else {
                        this.v = a2.getInteger(index, this.v);
                    }
                } else if (index == ff.m.Mn) {
                    int i4 = a2.getInt(index, this.y);
                    this.y = i4;
                    if (i4 < 8) {
                        this.y = 8;
                    }
                } else if (index == ff.m.Qn) {
                    this.z = a2.getFloat(index, this.z);
                } else if (index == ff.m.Jn) {
                    this.E = a2.getInteger(index, this.E);
                } else if (index == ff.m.In) {
                    this.r = a2.getResourceId(index, this.r);
                } else if (index == ff.m.Rn) {
                    this.F = a2.getBoolean(index, this.F);
                } else if (index == ff.m.Pn) {
                    this.G = a2.getInteger(index, -1);
                } else if (index == ff.m.Nn) {
                    this.H = a2.getInteger(index, 0);
                } else if (index == ff.m.Sn) {
                    this.I = a2.getInteger(index, 0);
                }
            }
            if (this.u == -1) {
                this.s = true;
            }
        }

        private void y(ie motionScene, Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.Hn);
            x(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.y;
        }

        public int B() {
            return this.t;
        }

        public int C() {
            return this.r;
        }

        public List<wd> D() {
            return this.B;
        }

        public int E() {
            return this.H;
        }

        public List<a> F() {
            return this.D;
        }

        public int G() {
            return this.G;
        }

        public float H() {
            return this.z;
        }

        public int I() {
            return this.u;
        }

        public le J() {
            return this.C;
        }

        public boolean K() {
            return !this.F;
        }

        public boolean L(int flag) {
            return (flag & this.I) != 0;
        }

        public void M(int id) {
            a aVar;
            Iterator<a> it = this.D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.y == id) {
                    break;
                }
            }
            if (aVar != null) {
                this.D.remove(aVar);
            }
        }

        public void N(int type) {
            this.E = type;
        }

        public void O(int duration) {
            this.y = Math.max(duration, 8);
        }

        public void P(boolean enable) {
            Q(enable);
        }

        public void Q(boolean enable) {
            this.F = !enable;
        }

        public void R(int interpolator, String interpolatorString, int interpolatorID) {
            this.v = interpolator;
            this.w = interpolatorString;
            this.x = interpolatorID;
        }

        public void S(int mode) {
            this.H = mode;
        }

        public void T(je onSwipe) {
            this.C = onSwipe == null ? null : new le(this.A.C, onSwipe);
        }

        public void U(int touchUpMode) {
            le J = J();
            if (J != null) {
                J.F(touchUpMode);
            }
        }

        public void V(int arcMode) {
            this.G = arcMode;
        }

        public void W(float stagger) {
            this.z = stagger;
        }

        public void X(int flag) {
            this.I = flag;
        }

        public void t(wd keyFrames) {
            this.B.add(keyFrames);
        }

        public void u(int id, int action) {
            Iterator<a> it = this.D.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.y == id) {
                    next.z = action;
                    return;
                }
            }
            this.D.add(new a(this, id, action));
        }

        public void v(Context context, XmlPullParser parser) {
            this.D.add(new a(context, this, parser));
        }

        public String w(Context context) {
            String resourceEntryName = this.u == -1 ? pg1.d : context.getResources().getResourceEntryName(this.u);
            if (this.t == -1) {
                return wo1.t(resourceEntryName, " -> null");
            }
            StringBuilder L = wo1.L(resourceEntryName, " -> ");
            L.append(context.getResources().getResourceEntryName(this.t));
            return L.toString();
        }

        public int z() {
            return this.E;
        }

        /* compiled from: MotionScene.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {
            public static final int s = 1;
            public static final int t = 17;
            public static final int u = 16;
            public static final int v = 256;
            public static final int w = 4096;
            private final b x;
            public int y;
            public int z;

            public a(Context context, b transition, XmlPullParser parser) {
                this.y = -1;
                this.z = 17;
                this.x = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.wk);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == ff.m.yk) {
                        this.y = obtainStyledAttributes.getResourceId(index, this.y);
                    } else if (index == ff.m.xk) {
                        this.z = obtainStyledAttributes.getInt(index, this.z);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
            public void a(ge motionLayout, int currentState, b transition) {
                int i = this.y;
                ge geVar = motionLayout;
                if (i != -1) {
                    geVar = motionLayout.findViewById(i);
                }
                if (geVar == null) {
                    return;
                }
                int i2 = transition.u;
                int i3 = transition.t;
                if (i2 == -1) {
                    geVar.setOnClickListener(this);
                    return;
                }
                int i4 = this.z;
                boolean z = false;
                boolean z2 = ((i4 & 1) != 0 && currentState == i2) | ((i4 & 1) != 0 && currentState == i2) | ((i4 & 256) != 0 && currentState == i2) | ((i4 & 16) != 0 && currentState == i3);
                if ((i4 & 4096) != 0 && currentState == i3) {
                    z = true;
                }
                if (z2 || z) {
                    geVar.setOnClickListener(this);
                }
            }

            public boolean b(b current, ge tl) {
                b bVar = this.x;
                if (bVar == current) {
                    return true;
                }
                int i = bVar.t;
                int i2 = this.x.u;
                if (i2 == -1) {
                    return tl.W0 != i;
                }
                int i3 = tl.W0;
                return i3 == i2 || i3 == i;
            }

            public void c(ge motionLayout) {
                View findViewById;
                int i = this.y;
                if (i == -1 || (findViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ge geVar = this.x.A.C;
                if (geVar.F0()) {
                    if (this.x.u != -1) {
                        b bVar = this.x.A.E;
                        int i = this.z;
                        boolean z = false;
                        boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                        boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                        if (z2 && z3) {
                            b bVar2 = this.x.A.E;
                            b bVar3 = this.x;
                            if (bVar2 != bVar3) {
                                geVar.setTransition(bVar3);
                            }
                            if (geVar.getCurrentState() != geVar.getEndState() && geVar.getProgress() <= 0.5f) {
                                z = z2;
                                z3 = false;
                            }
                        } else {
                            z = z2;
                        }
                        if (b(bVar, geVar)) {
                            if (z && (this.z & 1) != 0) {
                                geVar.setTransition(this.x);
                                geVar.X0();
                                return;
                            } else if (z3 && (this.z & 16) != 0) {
                                geVar.setTransition(this.x);
                                geVar.Z0();
                                return;
                            } else if (z && (this.z & 256) != 0) {
                                geVar.setTransition(this.x);
                                geVar.setProgress(1.0f);
                                return;
                            } else if (!z3 || (this.z & 4096) == 0) {
                                return;
                            } else {
                                geVar.setTransition(this.x);
                                geVar.setProgress(0.0f);
                                return;
                            }
                        }
                        return;
                    }
                    int currentState = geVar.getCurrentState();
                    if (currentState == -1) {
                        geVar.a1(this.x.t);
                        return;
                    }
                    b bVar4 = new b(this.x.A, this.x);
                    bVar4.u = currentState;
                    bVar4.t = this.x.t;
                    geVar.setTransition(bVar4);
                    geVar.X0();
                }
            }

            public a(b transition, int id, int action) {
                this.y = -1;
                this.z = 17;
                this.x = transition;
                this.y = id;
                this.z = action;
            }
        }

        public b(int id, ie motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.r = -1;
            this.s = false;
            this.t = -1;
            this.u = -1;
            this.v = 0;
            this.w = null;
            this.x = -1;
            this.y = 400;
            this.z = 0.0f;
            this.B = new ArrayList<>();
            this.C = null;
            this.D = new ArrayList<>();
            this.E = 0;
            this.F = false;
            this.G = -1;
            this.H = 0;
            this.I = 0;
            this.r = id;
            this.A = motionScene;
            this.u = constraintSetStartId;
            this.t = constraintSetEndId;
            this.y = motionScene.N;
            this.H = motionScene.O;
        }

        public b(ie motionScene, Context context, XmlPullParser parser) {
            this.r = -1;
            this.s = false;
            this.t = -1;
            this.u = -1;
            this.v = 0;
            this.w = null;
            this.x = -1;
            this.y = 400;
            this.z = 0.0f;
            this.B = new ArrayList<>();
            this.C = null;
            this.D = new ArrayList<>();
            this.E = 0;
            this.F = false;
            this.G = -1;
            this.H = 0;
            this.I = 0;
            this.y = motionScene.N;
            this.H = motionScene.O;
            this.A = motionScene;
            y(motionScene, context, Xml.asAttributeSet(parser));
        }
    }

    public ie(Context context, ge layout, int resourceID) {
        this.C = layout;
        this.U = new pe(layout);
        V(context, resourceID);
        SparseArray<af> sparseArray = this.J;
        int i2 = ff.g.V1;
        sparseArray.put(i2, new af());
        this.K.put("motion_base", Integer.valueOf(i2));
    }
}