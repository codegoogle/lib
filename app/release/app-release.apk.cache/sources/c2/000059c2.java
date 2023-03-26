package com.p7700g.p99005;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.util.HashMap;

/* compiled from: DesignTool.java */
/* loaded from: classes.dex */
public class rd implements ke {
    private static final boolean a = false;
    private static final String b = "DesignTool";
    public static final HashMap<Pair<Integer, Integer>, String> c;
    public static final HashMap<String, String> d;
    private final ge e;
    private ie f;
    private String g = null;
    private String h = null;
    private int i = -1;
    private int j = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        d = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public rd(ge motionLayout) {
        this.e = motionLayout;
    }

    private static void j(int dpi, af set, View view, HashMap<String, String> attributes, int from, int to) {
        String str = c.get(Pair.create(Integer.valueOf(from), Integer.valueOf(to)));
        String str2 = attributes.get(str);
        if (str2 != null) {
            String str3 = d.get(str);
            set.L(view.getId(), from, Integer.parseInt(str2), to, str3 != null ? k(dpi, attributes.get(str3)) : 0);
        }
    }

    private static int k(int dpi, String value) {
        int indexOf;
        if (value == null || (indexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(value.substring(0, indexOf)).intValue() * dpi) / 160.0f);
    }

    private static void l(int dpi, af set, View view, HashMap<String, String> attributes) {
        String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.W0(view.getId(), k(dpi, str));
        }
        String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.X0(view.getId(), k(dpi, str2));
        }
    }

    private static void m(af set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.f1(view.getId(), Float.parseFloat(str));
            } else if (type == 1) {
                set.A1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void n(int dpi, af set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int k = str.equalsIgnoreCase("wrap_content") ? -2 : k(dpi, str);
            if (type == 0) {
                set.W(view.getId(), k);
            } else {
                set.P(view.getId(), k);
            }
        }
    }

    public String A() {
        if (this.g != null && this.h != null) {
            float y = y();
            if (y <= 0.01f) {
                return this.g;
            }
            if (y >= 0.99f) {
                return this.h;
            }
        }
        return this.g;
    }

    public boolean B() {
        return (this.g == null || this.h == null) ? false : true;
    }

    public void C(Object keyFrame, String tag, Object value) {
        if (keyFrame instanceof td) {
            ((td) keyFrame).j(tag, value);
            this.e.N0();
            this.e.j1 = true;
        }
    }

    public void D(String id) {
        if (id == null) {
            id = "motion_base";
        }
        if (this.g == id) {
            return;
        }
        this.g = id;
        this.h = null;
        ge geVar = this.e;
        if (geVar.R0 == null) {
            geVar.R0 = this.f;
        }
        int I0 = geVar.I0(id);
        this.i = I0;
        if (I0 != 0) {
            if (I0 == this.e.getStartState()) {
                this.e.setProgress(0.0f);
            } else if (I0 == this.e.getEndState()) {
                this.e.setProgress(1.0f);
            } else {
                this.e.a1(I0);
                this.e.setProgress(1.0f);
            }
        }
        this.e.requestLayout();
    }

    public void E(String start, String end) {
        ge geVar = this.e;
        if (geVar.R0 == null) {
            geVar.R0 = this.f;
        }
        int I0 = geVar.I0(start);
        int I02 = this.e.I0(end);
        this.e.S0(I0, I02);
        this.i = I0;
        this.j = I02;
        this.g = start;
        this.h = end;
    }

    public void F(Object view, int debugMode) {
        ce ceVar;
        if ((view instanceof View) && (ceVar = this.e.b1.get(view)) != null) {
            ceVar.S(debugMode);
            this.e.invalidate();
        }
    }

    @Override // com.p7700g.p99005.ke
    public long a() {
        return this.e.getTransitionTimeMs();
    }

    @Override // com.p7700g.p99005.ke
    public int b(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        ce ceVar;
        View view = (View) viewObject;
        if (cmd != 0) {
            ge geVar = this.e;
            if (geVar.R0 == null || view == null || (ceVar = geVar.b1.get(view)) == null) {
                return -1;
            }
        } else {
            ceVar = null;
        }
        if (cmd != 0) {
            if (cmd == 1) {
                int t = this.e.R0.t() / 16;
                ceVar.f(out, t);
                return t;
            } else if (cmd == 2) {
                int t2 = this.e.R0.t() / 16;
                ceVar.e(out, null);
                return t2;
            } else if (cmd != 3) {
                return -1;
            } else {
                int t3 = this.e.R0.t() / 16;
                return ceVar.l(type, out, outLength);
            }
        }
        return 1;
    }

    @Override // com.p7700g.p99005.ke
    public boolean c(Object view, int position, int type, float x, float y) {
        if (view instanceof View) {
            ge geVar = this.e;
            if (geVar.R0 != null) {
                ce ceVar = geVar.b1.get(view);
                ge geVar2 = this.e;
                int i = (int) (geVar2.e1 * 100.0f);
                if (ceVar != null) {
                    View view2 = (View) view;
                    if (geVar2.R0.S(view2, i)) {
                        float y2 = ceVar.y(2, x, y);
                        float y3 = ceVar.y(5, x, y);
                        this.e.R0.l0(view2, i, "motion:percentX", Float.valueOf(y2));
                        this.e.R0.l0(view2, i, "motion:percentY", Float.valueOf(y3));
                        this.e.N0();
                        this.e.o0(true);
                        this.e.invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.ke
    public void d(float position) {
        ge geVar = this.e;
        if (geVar.R0 == null) {
            geVar.R0 = this.f;
        }
        geVar.setProgress(position);
        this.e.o0(true);
        this.e.requestLayout();
        this.e.invalidate();
    }

    @Override // com.p7700g.p99005.ke
    public Boolean e(Object keyFrame, Object view, float x, float y, String[] attribute, float[] value) {
        if (keyFrame instanceof yd) {
            View view2 = (View) view;
            this.e.b1.get(view2).N(view2, (yd) keyFrame, x, y, attribute, value);
            this.e.N0();
            this.e.j1 = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.p7700g.p99005.ke
    public void f(Object view, int position, String name, Object value) {
        ie ieVar = this.e.R0;
        if (ieVar != null) {
            ieVar.l0((View) view, position, name, value);
            ge geVar = this.e;
            geVar.h1 = position / 100.0f;
            geVar.f1 = 0.0f;
            geVar.N0();
            this.e.o0(true);
        }
    }

    @Override // com.p7700g.p99005.ke
    public void g(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes) {
        View view = (View) opaqueView;
        HashMap hashMap = (HashMap) opaqueAttributes;
        int I0 = this.e.I0(constraintSetId);
        af o = this.e.R0.o(I0);
        if (o == null) {
            return;
        }
        o.E(view.getId());
        n(dpi, o, view, hashMap, 0);
        n(dpi, o, view, hashMap, 1);
        j(dpi, o, view, hashMap, 6, 6);
        j(dpi, o, view, hashMap, 6, 7);
        j(dpi, o, view, hashMap, 7, 7);
        j(dpi, o, view, hashMap, 7, 6);
        j(dpi, o, view, hashMap, 1, 1);
        j(dpi, o, view, hashMap, 1, 2);
        j(dpi, o, view, hashMap, 2, 2);
        j(dpi, o, view, hashMap, 2, 1);
        j(dpi, o, view, hashMap, 3, 3);
        j(dpi, o, view, hashMap, 3, 4);
        j(dpi, o, view, hashMap, 4, 3);
        j(dpi, o, view, hashMap, 4, 4);
        j(dpi, o, view, hashMap, 5, 5);
        m(o, view, hashMap, 0);
        m(o, view, hashMap, 1);
        l(dpi, o, view, hashMap);
        this.e.f1(I0, o);
        this.e.requestLayout();
    }

    @Override // com.p7700g.p99005.ke
    public float h(Object view, int type, float x, float y) {
        ce ceVar;
        if ((view instanceof View) && (ceVar = this.e.b1.get((View) view)) != null) {
            return ceVar.y(type, x, y);
        }
        return 0.0f;
    }

    @Override // com.p7700g.p99005.ke
    public Object i(Object viewObject, float x, float y) {
        ce ceVar;
        View view = (View) viewObject;
        ge geVar = this.e;
        if (geVar.R0 == null) {
            return -1;
        }
        if (view == null || (ceVar = geVar.b1.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return ceVar.B(viewGroup.getWidth(), viewGroup.getHeight(), x, y);
    }

    public void o(boolean disable) {
        this.e.k0(disable);
    }

    public void p(String set) {
        ge geVar = this.e;
        if (geVar.R0 == null) {
            geVar.R0 = this.f;
        }
        int I0 = geVar.I0(set);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + set + " (" + I0 + ")");
        try {
            this.e.R0.o(I0).g0(this.e.R0, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int q(Object view, float[] key) {
        ie ieVar = this.e.R0;
        if (ieVar == null) {
            return -1;
        }
        int t = ieVar.t() / 16;
        ce ceVar = this.e.b1.get(view);
        if (ceVar == null) {
            return 0;
        }
        ceVar.e(key, null);
        return t;
    }

    public int r(Object view, float[] path, int len) {
        ge geVar = this.e;
        if (geVar.R0 == null) {
            return -1;
        }
        ce ceVar = geVar.b1.get(view);
        if (ceVar == null) {
            return 0;
        }
        ceVar.f(path, len);
        return len;
    }

    public void s(Object view, float[] path) {
        ie ieVar = this.e.R0;
        if (ieVar == null) {
            return;
        }
        int t = ieVar.t() / 16;
        ce ceVar = this.e.b1.get(view);
        if (ceVar == null) {
            return;
        }
        ceVar.h(path, t);
    }

    public String t() {
        int endState = this.e.getEndState();
        if (this.j == endState) {
            return this.h;
        }
        String w0 = this.e.w0(endState);
        if (w0 != null) {
            this.h = w0;
            this.j = endState;
        }
        return w0;
    }

    public int u(Object view, int type, int[] info) {
        ce ceVar = this.e.b1.get((View) view);
        if (ceVar == null) {
            return 0;
        }
        return ceVar.x(type, info);
    }

    public int v(Object view, int[] type, float[] pos) {
        ce ceVar = this.e.b1.get((View) view);
        if (ceVar == null) {
            return 0;
        }
        return ceVar.z(type, pos);
    }

    public Object w(int type, int target, int position) {
        ge geVar = this.e;
        ie ieVar = geVar.R0;
        if (ieVar == null) {
            return null;
        }
        return ieVar.y(geVar.getContext(), type, target, position);
    }

    public Object x(Object view, int type, int position) {
        if (this.e.R0 == null) {
            return null;
        }
        int id = ((View) view).getId();
        ge geVar = this.e;
        return geVar.R0.y(geVar.getContext(), type, id, position);
    }

    public float y() {
        return this.e.getProgress();
    }

    public String z() {
        int startState = this.e.getStartState();
        if (this.i == startState) {
            return this.g;
        }
        String w0 = this.e.w0(startState);
        if (w0 != null) {
            this.g = w0;
            this.i = startState;
        }
        return this.e.w0(startState);
    }
}