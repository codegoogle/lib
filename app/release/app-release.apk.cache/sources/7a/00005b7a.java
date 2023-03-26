package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class s80 implements Cloneable {
    private static final String A = "instance";
    private static final String B = "name";
    private static final String C = "id";
    private static final String D = "itemId";
    private static final int[] E = {2, 1, 3, 4};
    private static final i80 F = new a();
    private static ThreadLocal<q7<Animator, d>> G = new ThreadLocal<>();
    private static final String s = "Transition";
    public static final boolean t = false;
    public static final int u = 1;
    private static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    private static final int z = 4;
    public w80 E0;
    private f F0;
    private q7<String, String> G0;
    private ArrayList<z80> u0;
    private ArrayList<z80> v0;
    private String H = getClass().getName();
    private long I = -1;
    public long J = -1;
    private TimeInterpolator K = null;
    public ArrayList<Integer> L = new ArrayList<>();
    public ArrayList<View> M = new ArrayList<>();
    private ArrayList<String> N = null;
    private ArrayList<Class<?>> O = null;
    private ArrayList<Integer> P = null;
    private ArrayList<View> Q = null;
    private ArrayList<Class<?>> R = null;
    private ArrayList<String> S = null;
    private ArrayList<Integer> T = null;
    private ArrayList<View> U = null;
    private ArrayList<Class<?>> V = null;
    private a90 W = new a90();
    private a90 X = new a90();
    public x80 Y = null;
    private int[] Z = E;
    private ViewGroup w0 = null;
    public boolean x0 = false;
    public ArrayList<Animator> y0 = new ArrayList<>();
    private int z0 = 0;
    private boolean A0 = false;
    private boolean B0 = false;
    private ArrayList<h> C0 = null;
    private ArrayList<Animator> D0 = new ArrayList<>();
    private i80 H0 = F;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class a extends i80 {
        @Override // com.p7700g.p99005.i80
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ q7 s;

        public b(q7 q7Var) {
            this.s = q7Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.remove(animator);
            s80.this.y0.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            s80.this.y0.add(animator);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            s80.this.C();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class d {
        public View a;
        public String b;
        public z80 c;
        public v90 d;
        public s80 e;

        public d(View view, String str, s80 s80Var, v90 v90Var, z80 z80Var) {
            this.a = view;
            this.b = str;
            this.c = z80Var;
            this.d = v90Var;
            this.e = s80Var;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t) {
            if (arrayList != null) {
                arrayList.remove(t);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a(@x1 s80 s80Var);
    }

    /* compiled from: Transition.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface h {
        void a(@x1 s80 s80Var);

        void b(@x1 s80 s80Var);

        void c(@x1 s80 s80Var);

        void d(@x1 s80 s80Var);

        void e(@x1 s80 s80Var);
    }

    public s80() {
    }

    private void D0(Animator animator, q7<Animator, d> q7Var) {
        if (animator != null) {
            animator.addListener(new b(q7Var));
            i(animator);
        }
    }

    private ArrayList<Integer> H(ArrayList<Integer> arrayList, int i, boolean z2) {
        if (i > 0) {
            if (z2) {
                return e.a(arrayList, Integer.valueOf(i));
            }
            return e.b(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> I(ArrayList<T> arrayList, T t2, boolean z2) {
        if (t2 != null) {
            if (z2) {
                return e.a(arrayList, t2);
            }
            return e.b(arrayList, t2);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> O(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z2) {
        if (cls != null) {
            if (z2) {
                return e.a(arrayList, cls);
            }
            return e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> P(ArrayList<View> arrayList, View view, boolean z2) {
        if (view != null) {
            if (z2) {
                return e.a(arrayList, view);
            }
            return e.b(arrayList, view);
        }
        return arrayList;
    }

    private static q7<Animator, d> b0() {
        q7<Animator, d> q7Var = G.get();
        if (q7Var == null) {
            q7<Animator, d> q7Var2 = new q7<>();
            G.set(q7Var2);
            return q7Var2;
        }
        return q7Var;
    }

    private void f(q7<View, z80> q7Var, q7<View, z80> q7Var2) {
        for (int i = 0; i < q7Var.size(); i++) {
            z80 r = q7Var.r(i);
            if (l0(r.b)) {
                this.u0.add(r);
                this.v0.add(null);
            }
        }
        for (int i2 = 0; i2 < q7Var2.size(); i2++) {
            z80 r2 = q7Var2.r(i2);
            if (l0(r2.b)) {
                this.v0.add(r2);
                this.u0.add(null);
            }
        }
    }

    private static void g(a90 a90Var, View view, z80 z80Var) {
        a90Var.a.put(view, z80Var);
        int id = view.getId();
        if (id >= 0) {
            if (a90Var.b.indexOfKey(id) >= 0) {
                a90Var.b.put(id, null);
            } else {
                a90Var.b.put(id, view);
            }
        }
        String w0 = sr.w0(view);
        if (w0 != null) {
            if (a90Var.d.containsKey(w0)) {
                a90Var.d.put(w0, null);
            } else {
                a90Var.d.put(w0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (a90Var.c.n(itemIdAtPosition) >= 0) {
                    View h2 = a90Var.c.h(itemIdAtPosition);
                    if (h2 != null) {
                        sr.P1(h2, false);
                        a90Var.c.u(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                sr.P1(view, true);
                a90Var.c.u(itemIdAtPosition, view);
            }
        }
    }

    private static boolean h(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean k0(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean m0(z80 z80Var, z80 z80Var2, String str) {
        Object obj = z80Var.a.get(str);
        Object obj2 = z80Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void n0(q7<View, z80> q7Var, q7<View, z80> q7Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && l0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && l0(view)) {
                z80 z80Var = q7Var.get(valueAt);
                z80 z80Var2 = q7Var2.get(view);
                if (z80Var != null && z80Var2 != null) {
                    this.u0.add(z80Var);
                    this.v0.add(z80Var2);
                    q7Var.remove(valueAt);
                    q7Var2.remove(view);
                }
            }
        }
    }

    private void o(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.P;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.Q;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.R;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.R.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    z80 z80Var = new z80(view);
                    if (z2) {
                        t(z80Var);
                    } else {
                        n(z80Var);
                    }
                    z80Var.c.add(this);
                    p(z80Var);
                    if (z2) {
                        g(this.W, view, z80Var);
                    } else {
                        g(this.X, view, z80Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.T;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.U;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.V;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.V.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                o(viewGroup.getChildAt(i3), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    private void o0(q7<View, z80> q7Var, q7<View, z80> q7Var2) {
        z80 remove;
        for (int size = q7Var.size() - 1; size >= 0; size--) {
            View n = q7Var.n(size);
            if (n != null && l0(n) && (remove = q7Var2.remove(n)) != null && l0(remove.b)) {
                this.u0.add(q7Var.p(size));
                this.v0.add(remove);
            }
        }
    }

    private void p0(q7<View, z80> q7Var, q7<View, z80> q7Var2, v7<View> v7Var, v7<View> v7Var2) {
        View h2;
        int H = v7Var.H();
        for (int i = 0; i < H; i++) {
            View I = v7Var.I(i);
            if (I != null && l0(I) && (h2 = v7Var2.h(v7Var.t(i))) != null && l0(h2)) {
                z80 z80Var = q7Var.get(I);
                z80 z80Var2 = q7Var2.get(h2);
                if (z80Var != null && z80Var2 != null) {
                    this.u0.add(z80Var);
                    this.v0.add(z80Var2);
                    q7Var.remove(I);
                    q7Var2.remove(h2);
                }
            }
        }
    }

    private void q0(q7<View, z80> q7Var, q7<View, z80> q7Var2, q7<String, View> q7Var3, q7<String, View> q7Var4) {
        View view;
        int size = q7Var3.size();
        for (int i = 0; i < size; i++) {
            View r = q7Var3.r(i);
            if (r != null && l0(r) && (view = q7Var4.get(q7Var3.n(i))) != null && l0(view)) {
                z80 z80Var = q7Var.get(r);
                z80 z80Var2 = q7Var2.get(view);
                if (z80Var != null && z80Var2 != null) {
                    this.u0.add(z80Var);
                    this.v0.add(z80Var2);
                    q7Var.remove(r);
                    q7Var2.remove(view);
                }
            }
        }
    }

    private void r0(a90 a90Var, a90 a90Var2) {
        q7<View, z80> q7Var = new q7<>(a90Var.a);
        q7<View, z80> q7Var2 = new q7<>(a90Var2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.Z;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    o0(q7Var, q7Var2);
                } else if (i2 == 2) {
                    q0(q7Var, q7Var2, a90Var.d, a90Var2.d);
                } else if (i2 == 3) {
                    n0(q7Var, q7Var2, a90Var.b, a90Var2.b);
                } else if (i2 == 4) {
                    p0(q7Var, q7Var2, a90Var.c, a90Var2.c);
                }
                i++;
            } else {
                f(q7Var, q7Var2);
                return;
            }
        }
    }

    private static int[] s0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (A.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (D.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException(wo1.u("Unknown match type in matchOrder: '", trim, "'"));
            }
            i++;
        }
        return iArr;
    }

    @z1
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        return null;
    }

    @x1
    public s80 A0(@x1 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.O;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void B(ViewGroup viewGroup, a90 a90Var, a90 a90Var2, ArrayList<z80> arrayList, ArrayList<z80> arrayList2) {
        Animator A2;
        int i;
        int i2;
        View view;
        Animator animator;
        z80 z80Var;
        Animator animator2;
        z80 z80Var2;
        q7<Animator, d> b0 = b0();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            z80 z80Var3 = arrayList.get(i3);
            z80 z80Var4 = arrayList2.get(i3);
            if (z80Var3 != null && !z80Var3.c.contains(this)) {
                z80Var3 = null;
            }
            if (z80Var4 != null && !z80Var4.c.contains(this)) {
                z80Var4 = null;
            }
            if (z80Var3 != null || z80Var4 != null) {
                if ((z80Var3 == null || z80Var4 == null || j0(z80Var3, z80Var4)) && (A2 = A(viewGroup, z80Var3, z80Var4)) != null) {
                    if (z80Var4 != null) {
                        view = z80Var4.b;
                        String[] h0 = h0();
                        if (h0 != null && h0.length > 0) {
                            z80Var2 = new z80(view);
                            i = size;
                            z80 z80Var5 = a90Var2.a.get(view);
                            if (z80Var5 != null) {
                                int i4 = 0;
                                while (i4 < h0.length) {
                                    z80Var2.a.put(h0[i4], z80Var5.a.get(h0[i4]));
                                    i4++;
                                    i3 = i3;
                                    z80Var5 = z80Var5;
                                }
                            }
                            i2 = i3;
                            int size2 = b0.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = A2;
                                    break;
                                }
                                d dVar = b0.get(b0.n(i5));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(X()) && dVar.c.equals(z80Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = A2;
                            z80Var2 = null;
                        }
                        animator = animator2;
                        z80Var = z80Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = z80Var3.b;
                        animator = A2;
                        z80Var = null;
                    }
                    if (animator != null) {
                        w80 w80Var = this.E0;
                        if (w80Var != null) {
                            long c2 = w80Var.c(viewGroup, this, z80Var3, z80Var4);
                            sparseIntArray.put(this.D0.size(), (int) c2);
                            j = Math.min(c2, j);
                        }
                        b0.put(animator, new d(view, X(), this, k90.d(viewGroup), z80Var));
                        this.D0.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.D0.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i6) - j));
            }
        }
    }

    @x1
    public s80 B0(@x1 String str) {
        ArrayList<String> arrayList = this.N;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void C() {
        int i = this.z0 - 1;
        this.z0 = i;
        if (i == 0) {
            ArrayList<h> arrayList = this.C0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((h) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < this.W.c.H(); i3++) {
                View I = this.W.c.I(i3);
                if (I != null) {
                    sr.P1(I, false);
                }
            }
            for (int i4 = 0; i4 < this.X.c.H(); i4++) {
                View I2 = this.X.c.I(i4);
                if (I2 != null) {
                    sr.P1(I2, false);
                }
            }
            this.B0 = true;
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void C0(View view) {
        if (this.A0) {
            if (!this.B0) {
                q7<Animator, d> b0 = b0();
                int size = b0.size();
                v90 d2 = k90.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d r = b0.r(i);
                    if (r.a != null && d2.equals(r.d)) {
                        m70.c(b0.n(i));
                    }
                }
                ArrayList<h> arrayList = this.C0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.C0.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((h) arrayList2.get(i2)).e(this);
                    }
                }
            }
            this.A0 = false;
        }
    }

    @x1
    public s80 D(@m1 int i, boolean z2) {
        this.T = H(this.T, i, z2);
        return this;
    }

    @x1
    public s80 E(@x1 View view, boolean z2) {
        this.U = P(this.U, view, z2);
        return this;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void E0() {
        O0();
        q7<Animator, d> b0 = b0();
        Iterator<Animator> it = this.D0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (b0.containsKey(next)) {
                O0();
                D0(next, b0);
            }
        }
        this.D0.clear();
        C();
    }

    public void F0(boolean z2) {
        this.x0 = z2;
    }

    @x1
    public s80 G(@x1 Class<?> cls, boolean z2) {
        this.V = O(this.V, cls, z2);
        return this;
    }

    @x1
    public s80 G0(long j) {
        this.J = j;
        return this;
    }

    public void H0(@z1 f fVar) {
        this.F0 = fVar;
    }

    @x1
    public s80 I0(@z1 TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        return this;
    }

    @x1
    public s80 J(@m1 int i, boolean z2) {
        this.P = H(this.P, i, z2);
        return this;
    }

    public void J0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (k0(iArr[i])) {
                    if (h(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.Z = (int[]) iArr.clone();
            return;
        }
        this.Z = E;
    }

    public void K0(@z1 i80 i80Var) {
        if (i80Var == null) {
            this.H0 = F;
        } else {
            this.H0 = i80Var;
        }
    }

    @x1
    public s80 L(@x1 View view, boolean z2) {
        this.Q = P(this.Q, view, z2);
        return this;
    }

    public void L0(@z1 w80 w80Var) {
        this.E0 = w80Var;
    }

    @x1
    public s80 M(@x1 Class<?> cls, boolean z2) {
        this.R = O(this.R, cls, z2);
        return this;
    }

    public s80 M0(ViewGroup viewGroup) {
        this.w0 = viewGroup;
        return this;
    }

    @x1
    public s80 N(@x1 String str, boolean z2) {
        this.S = I(this.S, str, z2);
        return this;
    }

    @x1
    public s80 N0(long j) {
        this.I = j;
        return this;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void O0() {
        if (this.z0 == 0) {
            ArrayList<h> arrayList = this.C0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.C0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((h) arrayList2.get(i)).a(this);
                }
            }
            this.B0 = false;
        }
        this.z0++;
    }

    public String P0(String str) {
        StringBuilder G2 = wo1.G(str);
        G2.append(getClass().getSimpleName());
        G2.append("@");
        G2.append(Integer.toHexString(hashCode()));
        G2.append(": ");
        String sb = G2.toString();
        if (this.J != -1) {
            StringBuilder L = wo1.L(sb, "dur(");
            L.append(this.J);
            L.append(") ");
            sb = L.toString();
        }
        if (this.I != -1) {
            StringBuilder L2 = wo1.L(sb, "dly(");
            L2.append(this.I);
            L2.append(") ");
            sb = L2.toString();
        }
        if (this.K != null) {
            StringBuilder L3 = wo1.L(sb, "interp(");
            L3.append(this.K);
            L3.append(") ");
            sb = L3.toString();
        }
        if (this.L.size() > 0 || this.M.size() > 0) {
            String t2 = wo1.t(sb, "tgts(");
            if (this.L.size() > 0) {
                for (int i = 0; i < this.L.size(); i++) {
                    if (i > 0) {
                        t2 = wo1.t(t2, ", ");
                    }
                    StringBuilder G3 = wo1.G(t2);
                    G3.append(this.L.get(i));
                    t2 = G3.toString();
                }
            }
            if (this.M.size() > 0) {
                for (int i2 = 0; i2 < this.M.size(); i2++) {
                    if (i2 > 0) {
                        t2 = wo1.t(t2, ", ");
                    }
                    StringBuilder G4 = wo1.G(t2);
                    G4.append(this.M.get(i2));
                    t2 = G4.toString();
                }
            }
            return wo1.t(t2, ")");
        }
        return sb;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void Q(ViewGroup viewGroup) {
        q7<Animator, d> b0 = b0();
        int size = b0.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        v90 d2 = k90.d(viewGroup);
        q7 q7Var = new q7(b0);
        b0.clear();
        for (int i = size - 1; i >= 0; i--) {
            d dVar = (d) q7Var.r(i);
            if (dVar.a != null && d2 != null && d2.equals(dVar.d)) {
                ((Animator) q7Var.n(i)).end();
            }
        }
    }

    public long R() {
        return this.J;
    }

    @z1
    public Rect S() {
        f fVar = this.F0;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @z1
    public f T() {
        return this.F0;
    }

    @z1
    public TimeInterpolator U() {
        return this.K;
    }

    public z80 V(View view, boolean z2) {
        x80 x80Var = this.Y;
        if (x80Var != null) {
            return x80Var.V(view, z2);
        }
        ArrayList<z80> arrayList = z2 ? this.u0 : this.v0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            z80 z80Var = arrayList.get(i2);
            if (z80Var == null) {
                return null;
            }
            if (z80Var.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z2 ? this.v0 : this.u0).get(i);
        }
        return null;
    }

    @x1
    public String X() {
        return this.H;
    }

    @x1
    public i80 Z() {
        return this.H0;
    }

    @x1
    public s80 a(@x1 h hVar) {
        if (this.C0 == null) {
            this.C0 = new ArrayList<>();
        }
        this.C0.add(hVar);
        return this;
    }

    @z1
    public w80 a0() {
        return this.E0;
    }

    @x1
    public s80 b(@m1 int i) {
        if (i != 0) {
            this.L.add(Integer.valueOf(i));
        }
        return this;
    }

    @x1
    public s80 c(@x1 View view) {
        this.M.add(view);
        return this;
    }

    public long c0() {
        return this.I;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.y0.size() - 1; size >= 0; size--) {
            this.y0.get(size).cancel();
        }
        ArrayList<h> arrayList = this.C0;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.C0.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((h) arrayList2.get(i)).d(this);
        }
    }

    @x1
    public s80 d(@x1 Class<?> cls) {
        if (this.O == null) {
            this.O = new ArrayList<>();
        }
        this.O.add(cls);
        return this;
    }

    @x1
    public List<Integer> d0() {
        return this.L;
    }

    @x1
    public s80 e(@x1 String str) {
        if (this.N == null) {
            this.N = new ArrayList<>();
        }
        this.N.add(str);
        return this;
    }

    @z1
    public List<String> e0() {
        return this.N;
    }

    @z1
    public List<Class<?>> f0() {
        return this.O;
    }

    @x1
    public List<View> g0() {
        return this.M;
    }

    @z1
    public String[] h0() {
        return null;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void i(Animator animator) {
        if (animator == null) {
            C();
            return;
        }
        if (R() >= 0) {
            animator.setDuration(R());
        }
        if (c0() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + c0());
        }
        if (U() != null) {
            animator.setInterpolator(U());
        }
        animator.addListener(new c());
        animator.start();
    }

    @z1
    public z80 i0(@x1 View view, boolean z2) {
        x80 x80Var = this.Y;
        if (x80Var != null) {
            return x80Var.i0(view, z2);
        }
        return (z2 ? this.W : this.X).a.get(view);
    }

    public boolean j0(@z1 z80 z80Var, @z1 z80 z80Var2) {
        if (z80Var == null || z80Var2 == null) {
            return false;
        }
        String[] h0 = h0();
        if (h0 != null) {
            for (String str : h0) {
                if (!m0(z80Var, z80Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : z80Var.a.keySet()) {
            if (m0(z80Var, z80Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean l0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.P;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.Q;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.R;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.R.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.S == null || sr.w0(view) == null || !this.S.contains(sr.w0(view))) {
                    if ((this.L.size() == 0 && this.M.size() == 0 && (((arrayList = this.O) == null || arrayList.isEmpty()) && ((arrayList2 = this.N) == null || arrayList2.isEmpty()))) || this.L.contains(Integer.valueOf(id)) || this.M.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.N;
                    if (arrayList6 == null || !arrayList6.contains(sr.w0(view))) {
                        if (this.O != null) {
                            for (int i2 = 0; i2 < this.O.size(); i2++) {
                                if (this.O.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public abstract void n(@x1 z80 z80Var);

    public void p(z80 z80Var) {
        String[] b2;
        if (this.E0 == null || z80Var.a.isEmpty() || (b2 = this.E0.b()) == null) {
            return;
        }
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= b2.length) {
                z2 = true;
                break;
            } else if (!z80Var.a.containsKey(b2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            return;
        }
        this.E0.a(z80Var);
    }

    public abstract void t(@x1 z80 z80Var);

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void t0(View view) {
        if (this.B0) {
            return;
        }
        q7<Animator, d> b0 = b0();
        int size = b0.size();
        v90 d2 = k90.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d r = b0.r(i);
            if (r.a != null && d2.equals(r.d)) {
                m70.b(b0.n(i));
            }
        }
        ArrayList<h> arrayList = this.C0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.C0.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((h) arrayList2.get(i2)).b(this);
            }
        }
        this.A0 = true;
    }

    public String toString() {
        return P0("");
    }

    public void u(ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        q7<String, String> q7Var;
        x(z2);
        if ((this.L.size() <= 0 && this.M.size() <= 0) || (((arrayList = this.N) != null && !arrayList.isEmpty()) || ((arrayList2 = this.O) != null && !arrayList2.isEmpty()))) {
            o(viewGroup, z2);
        } else {
            for (int i = 0; i < this.L.size(); i++) {
                View findViewById = viewGroup.findViewById(this.L.get(i).intValue());
                if (findViewById != null) {
                    z80 z80Var = new z80(findViewById);
                    if (z2) {
                        t(z80Var);
                    } else {
                        n(z80Var);
                    }
                    z80Var.c.add(this);
                    p(z80Var);
                    if (z2) {
                        g(this.W, findViewById, z80Var);
                    } else {
                        g(this.X, findViewById, z80Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.M.size(); i2++) {
                View view = this.M.get(i2);
                z80 z80Var2 = new z80(view);
                if (z2) {
                    t(z80Var2);
                } else {
                    n(z80Var2);
                }
                z80Var2.c.add(this);
                p(z80Var2);
                if (z2) {
                    g(this.W, view, z80Var2);
                } else {
                    g(this.X, view, z80Var2);
                }
            }
        }
        if (z2 || (q7Var = this.G0) == null) {
            return;
        }
        int size = q7Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.W.d.remove(this.G0.n(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.W.d.put(this.G0.r(i4), view2);
            }
        }
    }

    public void u0(ViewGroup viewGroup) {
        d dVar;
        this.u0 = new ArrayList<>();
        this.v0 = new ArrayList<>();
        r0(this.W, this.X);
        q7<Animator, d> b0 = b0();
        int size = b0.size();
        v90 d2 = k90.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator n = b0.n(i);
            if (n != null && (dVar = b0.get(n)) != null && dVar.a != null && d2.equals(dVar.d)) {
                z80 z80Var = dVar.c;
                View view = dVar.a;
                z80 i0 = i0(view, true);
                z80 V = V(view, true);
                if (i0 == null && V == null) {
                    V = this.X.a.get(view);
                }
                if (!(i0 == null && V == null) && dVar.e.j0(z80Var, V)) {
                    if (!n.isRunning() && !n.isStarted()) {
                        b0.remove(n);
                    } else {
                        n.cancel();
                    }
                }
            }
        }
        B(viewGroup, this.W, this.X, this.u0, this.v0);
        E0();
    }

    @x1
    public s80 v0(@x1 h hVar) {
        ArrayList<h> arrayList = this.C0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.C0.size() == 0) {
            this.C0 = null;
        }
        return this;
    }

    public void x(boolean z2) {
        if (z2) {
            this.W.a.clear();
            this.W.b.clear();
            this.W.c.b();
            return;
        }
        this.X.a.clear();
        this.X.b.clear();
        this.X.c.b();
    }

    @Override // 
    /* renamed from: y */
    public s80 clone() {
        try {
            s80 s80Var = (s80) super.clone();
            s80Var.D0 = new ArrayList<>();
            s80Var.W = new a90();
            s80Var.X = new a90();
            s80Var.u0 = null;
            s80Var.v0 = null;
            return s80Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @x1
    public s80 y0(@m1 int i) {
        if (i != 0) {
            this.L.remove(Integer.valueOf(i));
        }
        return this;
    }

    @x1
    public s80 z0(@x1 View view) {
        this.M.remove(view);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public s80(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = ri.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k >= 0) {
            G0(k);
        }
        long k2 = ri.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            N0(k2);
        }
        int l = ri.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            I0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = ri.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            J0(s0(m));
        }
        obtainStyledAttributes.recycle();
    }
}