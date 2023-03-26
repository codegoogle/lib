package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.dy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class ey {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final gy b = new fy();
    public static final gy c = x();

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ g s;
        public final /* synthetic */ Fragment t;
        public final /* synthetic */ nm u;

        public a(g gVar, Fragment fragment, nm nmVar) {
            this.s = gVar;
            this.t = fragment;
            this.u = nmVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a(this.t, this.u);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList s;

        public b(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ey.B(this.s, 4);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ g s;
        public final /* synthetic */ Fragment t;
        public final /* synthetic */ nm u;

        public c(g gVar, Fragment fragment, nm nmVar) {
            this.s = gVar;
            this.t = fragment;
            this.u = nmVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a(this.t, this.u);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ gy t;
        public final /* synthetic */ View u;
        public final /* synthetic */ Fragment v;
        public final /* synthetic */ ArrayList w;
        public final /* synthetic */ ArrayList x;
        public final /* synthetic */ ArrayList y;
        public final /* synthetic */ Object z;

        public d(Object obj, gy gyVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.s = obj;
            this.t = gyVar;
            this.u = view;
            this.v = fragment;
            this.w = arrayList;
            this.x = arrayList2;
            this.y = arrayList3;
            this.z = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.s;
            if (obj != null) {
                this.t.p(obj, this.u);
                this.x.addAll(ey.k(this.t, this.s, this.v, this.w, this.u));
            }
            if (this.y != null) {
                if (this.z != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.u);
                    this.t.q(this.z, this.y, arrayList);
                }
                this.y.clear();
                this.y.add(this.u);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ Fragment s;
        public final /* synthetic */ Fragment t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ q7 v;
        public final /* synthetic */ View w;
        public final /* synthetic */ gy x;
        public final /* synthetic */ Rect y;

        public e(Fragment fragment, Fragment fragment2, boolean z, q7 q7Var, View view, gy gyVar, Rect rect) {
            this.s = fragment;
            this.t = fragment2;
            this.u = z;
            this.v = q7Var;
            this.w = view;
            this.x = gyVar;
            this.y = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            ey.f(this.s, this.t, this.u, this.v, false);
            View view = this.w;
            if (view != null) {
                this.x.k(view, this.y);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ ArrayList B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ Rect D;
        public final /* synthetic */ gy s;
        public final /* synthetic */ q7 t;
        public final /* synthetic */ Object u;
        public final /* synthetic */ h v;
        public final /* synthetic */ ArrayList w;
        public final /* synthetic */ View x;
        public final /* synthetic */ Fragment y;
        public final /* synthetic */ Fragment z;

        public f(gy gyVar, q7 q7Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.s = gyVar;
            this.t = q7Var;
            this.u = obj;
            this.v = hVar;
            this.w = arrayList;
            this.x = view;
            this.y = fragment;
            this.z = fragment2;
            this.A = z;
            this.B = arrayList2;
            this.C = obj2;
            this.D = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            q7<String, View> h = ey.h(this.s, this.t, this.u, this.v);
            if (h != null) {
                this.w.addAll(h.values());
                this.w.add(this.x);
            }
            ey.f(this.y, this.z, this.A, h, false);
            Object obj = this.u;
            if (obj != null) {
                this.s.A(obj, this.B, this.w);
                View t = ey.t(h, this.v, this.C, this.A);
                if (t != null) {
                    this.s.k(t, this.D);
                }
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(@x1 Fragment fragment, @x1 nm nmVar);

        void b(@x1 Fragment fragment, @x1 nm nmVar);
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class h {
        public Fragment a;
        public boolean b;
        public dx c;
        public Fragment d;
        public boolean e;
        public dx f;
    }

    private ey() {
    }

    private static void A(gy gyVar, Object obj, Object obj2, q7<String, View> q7Var, boolean z, dx dxVar) {
        String str;
        ArrayList<String> arrayList = dxVar.H;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = dxVar.I.get(0);
        } else {
            str = dxVar.H.get(0);
        }
        View view = q7Var.get(str);
        gyVar.v(obj, view);
        if (obj2 != null) {
            gyVar.v(obj2, view);
        }
    }

    public static void B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static void C(@x1 Context context, @x1 jx jxVar, ArrayList<dx> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            dx dxVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(dxVar, sparseArray, z);
            } else {
                c(dxVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                q7<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (jxVar.e() && (viewGroup = (ViewGroup) jxVar.d(keyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, d2, gVar);
                    } else {
                        n(viewGroup, hVar, view, d2, gVar);
                    }
                }
            }
        }
    }

    public static boolean D() {
        return (b == null && c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, q7<String, View> q7Var, Collection<String> collection) {
        for (int size = q7Var.size() - 1; size >= 0; size--) {
            View r = q7Var.r(size);
            if (collection.contains(sr.w0(r))) {
                arrayList.add(r);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.mAdded != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (r0.mHidden == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(dx dxVar, dy.a aVar, SparseArray<h> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        h hVar;
        Fragment fragment = aVar.b;
        if (fragment == null || (i = fragment.mContainerId) == 0) {
            return;
        }
        int i2 = z ? a[aVar.a] : aVar.a;
        boolean z6 = false;
        boolean z7 = true;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    boolean z8 = !z2 ? false : false;
                    z5 = z8;
                    z4 = true;
                    z7 = false;
                    hVar = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                    }
                    if (z5) {
                    }
                    if (z2) {
                    }
                } else if (i2 != 5) {
                    if (i2 != 6) {
                        if (i2 != 7) {
                            z4 = false;
                            z7 = false;
                            z5 = false;
                            hVar = sparseArray.get(i);
                            if (z6) {
                                hVar = p(hVar, sparseArray, i);
                                hVar.a = fragment;
                                hVar.b = z;
                                hVar.c = dxVar;
                            }
                            if (!z2 && z7) {
                                if (hVar != null && hVar.d == fragment) {
                                    hVar.d = null;
                                }
                                if (!dxVar.J) {
                                    FragmentManager fragmentManager = dxVar.M;
                                    fragmentManager.F0().q(fragmentManager.A(fragment));
                                    fragmentManager.f1(fragment);
                                }
                            }
                            if (z5 && (hVar == null || hVar.d == null)) {
                                hVar = p(hVar, sparseArray, i);
                                hVar.d = fragment;
                                hVar.e = z;
                                hVar.f = dxVar;
                            }
                            if (z2 || !z4 || hVar == null || hVar.a != fragment) {
                                return;
                            }
                            hVar.a = null;
                            return;
                        }
                    }
                } else if (z2) {
                    if (fragment.mHiddenChanged) {
                        if (!fragment.mHidden) {
                        }
                    }
                    z3 = false;
                    z6 = z3;
                    z4 = false;
                    z5 = false;
                    hVar = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                        if (hVar != null) {
                            hVar.d = null;
                        }
                        if (!dxVar.J) {
                        }
                    }
                    if (z5) {
                        hVar = p(hVar, sparseArray, i);
                        hVar.d = fragment;
                        hVar.e = z;
                        hVar.f = dxVar;
                    }
                    if (z2) {
                        return;
                    }
                    return;
                } else {
                    z3 = fragment.mHidden;
                    z6 = z3;
                    z4 = false;
                    z5 = false;
                    hVar = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                    }
                    if (z5) {
                    }
                    if (z2) {
                    }
                }
            }
            if (!z2) {
            }
            z5 = z8;
            z4 = true;
            z7 = false;
            hVar = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        }
        if (z2) {
            z3 = fragment.mIsNewlyAdded;
            z6 = z3;
            z4 = false;
            z5 = false;
            hVar = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        } else {
            if (!fragment.mAdded) {
            }
            z3 = false;
            z6 = z3;
            z4 = false;
            z5 = false;
            hVar = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        }
    }

    public static void c(dx dxVar, SparseArray<h> sparseArray, boolean z) {
        int size = dxVar.u.size();
        for (int i = 0; i < size; i++) {
            b(dxVar, dxVar.u.get(i), sparseArray, false, z);
        }
    }

    private static q7<String, String> d(int i, ArrayList<dx> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        q7<String, String> q7Var = new q7<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            dx dxVar = arrayList.get(i4);
            if (dxVar.b0(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = dxVar.H;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = dxVar.H;
                        arrayList4 = dxVar.I;
                    } else {
                        ArrayList<String> arrayList6 = dxVar.H;
                        arrayList3 = dxVar.I;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = q7Var.remove(str2);
                        if (remove != null) {
                            q7Var.put(str, remove);
                        } else {
                            q7Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return q7Var;
    }

    public static void e(dx dxVar, SparseArray<h> sparseArray, boolean z) {
        if (dxVar.M.B0().e()) {
            for (int size = dxVar.u.size() - 1; size >= 0; size--) {
                b(dxVar, dxVar.u.get(size), sparseArray, true, z);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z, q7<String, View> q7Var, boolean z2) {
        yg enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = q7Var == null ? 0 : q7Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(q7Var.n(i));
                arrayList.add(q7Var.r(i));
            }
            if (z2) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(gy gyVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!gyVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static q7<String, View> h(gy gyVar, q7<String, String> q7Var, Object obj, h hVar) {
        yg enterTransitionCallback;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.a;
        View view = fragment.getView();
        if (!q7Var.isEmpty() && obj != null && view != null) {
            q7<String, View> q7Var2 = new q7<>();
            gyVar.j(q7Var2, view);
            dx dxVar = hVar.c;
            if (hVar.b) {
                enterTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = dxVar.H;
            } else {
                enterTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = dxVar.I;
            }
            if (arrayList != null) {
                q7Var2.v(arrayList);
                q7Var2.v(q7Var.values());
            }
            if (enterTransitionCallback != null) {
                enterTransitionCallback.d(arrayList, q7Var2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view2 = q7Var2.get(str);
                    if (view2 == null) {
                        String q2 = q(q7Var, str);
                        if (q2 != null) {
                            q7Var.remove(q2);
                        }
                    } else if (!str.equals(sr.w0(view2)) && (q = q(q7Var, str)) != null) {
                        q7Var.put(q, sr.w0(view2));
                    }
                }
            } else {
                y(q7Var, q7Var2);
            }
            return q7Var2;
        }
        q7Var.clear();
        return null;
    }

    private static q7<String, View> i(gy gyVar, q7<String, String> q7Var, Object obj, h hVar) {
        yg exitTransitionCallback;
        ArrayList<String> arrayList;
        if (!q7Var.isEmpty() && obj != null) {
            Fragment fragment = hVar.d;
            q7<String, View> q7Var2 = new q7<>();
            gyVar.j(q7Var2, fragment.requireView());
            dx dxVar = hVar.f;
            if (hVar.e) {
                exitTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = dxVar.I;
            } else {
                exitTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = dxVar.H;
            }
            if (arrayList != null) {
                q7Var2.v(arrayList);
            }
            if (exitTransitionCallback != null) {
                exitTransitionCallback.d(arrayList, q7Var2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view = q7Var2.get(str);
                    if (view == null) {
                        q7Var.remove(str);
                    } else if (!str.equals(sr.w0(view))) {
                        q7Var.put(sr.w0(view), q7Var.remove(str));
                    }
                }
            } else {
                q7Var.v(q7Var2.keySet());
            }
            return q7Var2;
        }
        q7Var.clear();
        return null;
    }

    private static gy j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        gy gyVar = b;
        if (gyVar == null || !g(gyVar, arrayList)) {
            gy gyVar2 = c;
            if (gyVar2 == null || !g(gyVar2, arrayList)) {
                if (gyVar == null && gyVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return gyVar2;
        }
        return gyVar;
    }

    public static ArrayList<View> k(gy gyVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                gyVar.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            gyVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(gy gyVar, ViewGroup viewGroup, View view, q7<String, String> q7Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object u;
        q7<String, String> q7Var2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        if (q7Var.isEmpty()) {
            q7Var2 = q7Var;
            u = null;
        } else {
            u = u(gyVar, fragment, fragment2, z);
            q7Var2 = q7Var;
        }
        q7<String, View> i = i(gyVar, q7Var2, u, hVar);
        if (q7Var.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            rect = new Rect();
            gyVar.z(obj3, view, arrayList);
            A(gyVar, obj3, obj2, i, hVar.e, hVar.f);
            if (obj != null) {
                gyVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        mr.a(viewGroup, new f(gyVar, q7Var, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(gy gyVar, ViewGroup viewGroup, View view, q7<String, String> q7Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object u = q7Var.isEmpty() ? null : u(gyVar, fragment, fragment2, z);
        q7<String, View> i = i(gyVar, q7Var, u, hVar);
        q7<String, View> h2 = h(gyVar, q7Var, u, hVar);
        if (q7Var.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i, q7Var.keySet());
            a(arrayList2, h2, q7Var.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            gyVar.z(obj3, view, arrayList);
            A(gyVar, obj3, obj2, i, hVar.e, hVar.f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar, obj, z);
            if (t != null) {
                gyVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        mr.a(viewGroup, new e(fragment, fragment2, z, h2, view2, gyVar, rect));
        return obj3;
    }

    private static void n(@x1 ViewGroup viewGroup, h hVar, View view, q7<String, String> q7Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        gy j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j, viewGroup, view, q7Var, hVar, arrayList, arrayList2, r, s);
        if (r == null && l == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
        Object obj2 = (k == null || k.isEmpty()) ? null : null;
        j.a(r, view);
        Object v = v(j, r, obj2, l, fragment, hVar.b);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList.size() > 0)) {
            nm nmVar = new nm();
            gVar.b(fragment2, nmVar);
            j.w(fragment2, v, nmVar, new c(gVar, fragment2, nmVar));
        }
        if (v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j.t(v, r, arrayList3, obj2, k, l, arrayList2);
            z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k);
            j.x(viewGroup, arrayList2, q7Var);
            j.c(viewGroup, v);
            j.s(viewGroup, arrayList2, q7Var);
        }
    }

    private static void o(@x1 ViewGroup viewGroup, h hVar, View view, q7<String, String> q7Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        gy j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        Object m = m(j, viewGroup, view, q7Var, hVar, arrayList2, arrayList, r, s);
        if (r == null && m == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
        ArrayList<View> k2 = k(j, r, fragment, arrayList, view);
        B(k2, 4);
        Object v = v(j, r, obj, m, fragment, z);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList2.size() > 0)) {
            nm nmVar = new nm();
            gVar.b(fragment2, nmVar);
            j.w(fragment2, v, nmVar, new a(gVar, fragment2, nmVar));
        }
        if (v != null) {
            w(j, obj, fragment2, k);
            ArrayList<String> o = j.o(arrayList);
            j.t(v, r, k2, obj, k, m, arrayList);
            j.c(viewGroup, v);
            j.y(viewGroup, arrayList2, arrayList, o, q7Var);
            B(k2, 0);
            j.A(m, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public static String q(q7<String, String> q7Var, String str) {
        int size = q7Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(q7Var.r(i))) {
                return q7Var.n(i);
            }
        }
        return null;
    }

    private static Object r(gy gyVar, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return gyVar.g(enterTransition);
    }

    private static Object s(gy gyVar, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return gyVar.g(exitTransition);
    }

    public static View t(q7<String, View> q7Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        dx dxVar = hVar.c;
        if (obj == null || q7Var == null || (arrayList = dxVar.H) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = dxVar.H.get(0);
        } else {
            str = dxVar.I.get(0);
        }
        return q7Var.get(str);
    }

    private static Object u(gy gyVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return gyVar.B(gyVar.g(sharedElementEnterTransition));
    }

    private static Object v(gy gyVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z2 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return gyVar.n(obj2, obj, obj3);
        }
        return gyVar.m(obj2, obj, obj3);
    }

    private static void w(gy gyVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            gyVar.r(obj, fragment.getView(), arrayList);
            mr.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static gy x() {
        try {
            return (gy) Class.forName("com.p7700g.p99005.z70").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void y(@x1 q7<String, String> q7Var, @x1 q7<String, View> q7Var2) {
        for (int size = q7Var.size() - 1; size >= 0; size--) {
            if (!q7Var2.containsKey(q7Var.r(size))) {
                q7Var.p(size);
            }
        }
    }

    private static void z(gy gyVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        mr.a(viewGroup, new d(obj, gyVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}