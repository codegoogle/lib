package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.ix;
import com.p7700g.p99005.ky;
import com.p7700g.p99005.nm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class fx extends ky {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            ky.e.c.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[ky.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ky.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ky.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ky.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ List s;
        public final /* synthetic */ ky.e t;

        public b(List list, ky.e eVar) {
            this.s = list;
            this.t = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s.contains(this.t)) {
                this.s.remove(this.t);
                fx.this.s(this.t);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ View t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ ky.e v;
        public final /* synthetic */ k w;

        public c(ViewGroup viewGroup, View view, boolean z, ky.e eVar, k kVar) {
            this.s = viewGroup;
            this.t = view;
            this.u = z;
            this.v = eVar;
            this.w = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.endViewTransition(this.t);
            if (this.u) {
                this.v.e().a(this.t);
            }
            this.w.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class d implements nm.b {
        public final /* synthetic */ Animator a;

        public d(Animator animator) {
            this.a = animator;
        }

        @Override // com.p7700g.p99005.nm.b
        public void onCancel() {
            this.a.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ k c;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class f implements nm.b {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ k c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        @Override // com.p7700g.p99005.nm.b
        public void onCancel() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public final /* synthetic */ ky.e s;
        public final /* synthetic */ ky.e t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ q7 v;

        public g(ky.e eVar, ky.e eVar2, boolean z, q7 q7Var) {
            this.s = eVar;
            this.t = eVar2;
            this.u = z;
            this.v = q7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ey.f(this.s.f(), this.t.f(), this.u, this.v, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        public final /* synthetic */ gy s;
        public final /* synthetic */ View t;
        public final /* synthetic */ Rect u;

        public h(gy gyVar, View view, Rect rect) {
            this.s = gyVar;
            this.t = view;
            this.u = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.k(this.t, this.u);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        public final /* synthetic */ ArrayList s;

        public i(ArrayList arrayList) {
            this.s = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ey.B(this.s, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        public final /* synthetic */ m s;

        public j(m mVar) {
            this.s = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class k extends l {
        private boolean c;
        private boolean d;
        @z1
        private ix.d e;

        public k(@x1 ky.e eVar, @x1 nm nmVar, boolean z) {
            super(eVar, nmVar);
            this.d = false;
            this.c = z;
        }

        @z1
        public ix.d e(@x1 Context context) {
            if (this.d) {
                return this.e;
            }
            ix.d c = ix.c(context, b().f(), b().e() == ky.e.c.VISIBLE, this.c);
            this.e = c;
            this.d = true;
            return c;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class l {
        @x1
        private final ky.e a;
        @x1
        private final nm b;

        public l(@x1 ky.e eVar, @x1 nm nmVar) {
            this.a = eVar;
            this.b = nmVar;
        }

        public void a() {
            this.a.d(this.b);
        }

        @x1
        public ky.e b() {
            return this.a;
        }

        @x1
        public nm c() {
            return this.b;
        }

        public boolean d() {
            ky.e.c cVar;
            ky.e.c c = ky.e.c.c(this.a.f().mView);
            ky.e.c e = this.a.e();
            return c == e || !(c == (cVar = ky.e.c.VISIBLE) || e == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class m extends l {
        @z1
        private final Object c;
        private final boolean d;
        @z1
        private final Object e;

        public m(@x1 ky.e eVar, @x1 nm nmVar, boolean z, boolean z2) {
            super(eVar, nmVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == ky.e.c.VISIBLE) {
                if (z) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.c = exitTransition;
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.e = eVar.f().getSharedElementEnterTransition();
            }
        }

        @z1
        private gy f(Object obj) {
            if (obj == null) {
                return null;
            }
            gy gyVar = ey.b;
            if (gyVar == null || !gyVar.e(obj)) {
                gy gyVar2 = ey.c;
                if (gyVar2 == null || !gyVar2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return gyVar2;
            }
            return gyVar;
        }

        @z1
        public gy e() {
            gy f = f(this.c);
            gy f2 = f(this.e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            StringBuilder G = wo1.G("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            G.append(b().f());
            G.append(" returned Transition ");
            G.append(this.c);
            G.append(" which uses a different Transition  type than its shared element transition ");
            G.append(this.e);
            throw new IllegalArgumentException(G.toString());
        }

        @z1
        public Object g() {
            return this.e;
        }

        @z1
        public Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        public boolean j() {
            return this.d;
        }
    }

    public fx(@x1 ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(@x1 List<k> list, @x1 List<ky.e> list2, boolean z, @x1 Map<ky.e, Boolean> map) {
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d()) {
                kVar.a();
            } else {
                ix.d e2 = kVar.e(context);
                if (e2 == null) {
                    kVar.a();
                } else {
                    Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        ky.e b2 = kVar.b();
                        Fragment f2 = b2.f();
                        if (Boolean.TRUE.equals(map.get(b2))) {
                            if (FragmentManager.T0(2)) {
                                String str = "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.";
                            }
                            kVar.a();
                        } else {
                            boolean z3 = b2.e() == ky.e.c.GONE;
                            if (z3) {
                                list2.remove(b2);
                            }
                            View view = f2.mView;
                            m2.startViewTransition(view);
                            animator.addListener(new c(m2, view, z3, b2, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().d(new d(animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            ky.e b3 = kVar2.b();
            Fragment f3 = b3.f();
            if (z) {
                if (FragmentManager.T0(2)) {
                    String str2 = "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Transitions.";
                }
                kVar2.a();
            } else if (z2) {
                if (FragmentManager.T0(2)) {
                    String str3 = "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Animators.";
                }
                kVar2.a();
            } else {
                View view2 = f3.mView;
                Animation animation = (Animation) jp.l(((ix.d) jp.l(kVar2.e(context))).a);
                if (b3.e() != ky.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m2.startViewTransition(view2);
                    ix.e eVar = new ix.e(animation, m2, view2);
                    eVar.setAnimationListener(new e(m2, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().d(new f(view2, m2, kVar2));
            }
        }
    }

    @x1
    private Map<ky.e, Boolean> x(@x1 List<m> list, @x1 List<ky.e> list2, boolean z, @z1 ky.e eVar, @z1 ky.e eVar2) {
        View view;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList<View> arrayList2;
        Rect rect;
        View view2;
        q7 q7Var;
        ArrayList<View> arrayList3;
        HashMap hashMap;
        ky.e eVar3;
        Object obj3;
        View view3;
        ArrayList arrayList4;
        Rect rect2;
        Object obj4;
        View view4;
        q7 q7Var2;
        View view5;
        gy gyVar;
        HashMap hashMap2;
        ArrayList<View> arrayList5;
        Rect rect3;
        ArrayList<View> arrayList6;
        yg enterTransitionCallback;
        yg exitTransitionCallback;
        ArrayList<String> arrayList7;
        int i2;
        View view6;
        View view7;
        String q;
        ArrayList<String> arrayList8;
        boolean z2 = z;
        HashMap hashMap3 = new HashMap();
        gy gyVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                gy e2 = mVar.e();
                if (gyVar2 == null) {
                    gyVar2 = e2;
                } else if (e2 != null && gyVar2 != e2) {
                    StringBuilder G = wo1.G("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    G.append(mVar.b().f());
                    G.append(" returned Transition ");
                    G.append(mVar.h());
                    G.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(G.toString());
                }
            }
        }
        if (gyVar2 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view8 = new View(m().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList9 = new ArrayList<>();
        ArrayList<View> arrayList10 = new ArrayList<>();
        q7 q7Var3 = new q7();
        Object obj5 = null;
        ky.e eVar4 = eVar;
        ky.e eVar5 = eVar2;
        View view9 = null;
        boolean z3 = false;
        fx fxVar = this;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar4 == null || eVar5 == null) {
                view4 = view9;
                q7Var2 = q7Var3;
                view5 = view8;
                gyVar = gyVar2;
                hashMap2 = hashMap3;
                arrayList5 = arrayList10;
            } else {
                Object B = gyVar2.B(gyVar2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                int i3 = 0;
                while (i3 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                    ArrayList<String> arrayList11 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i3));
                    }
                    i3++;
                    sharedElementTargetNames = arrayList11;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z2) {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                view4 = view9;
                int i4 = 0;
                while (i4 < size) {
                    q7Var3.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                    i4++;
                    size = size;
                    hashMap3 = hashMap3;
                }
                HashMap hashMap4 = hashMap3;
                q7<String, View> q7Var4 = new q7<>();
                fxVar.u(q7Var4, eVar.f().mView);
                q7Var4.v(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.d(sharedElementSourceNames, q7Var4);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view10 = q7Var4.get(str);
                        if (view10 == null) {
                            q7Var3.remove(str);
                            arrayList8 = sharedElementSourceNames;
                        } else {
                            arrayList8 = sharedElementSourceNames;
                            if (!str.equals(sr.w0(view10))) {
                                q7Var3.put(sr.w0(view10), (String) q7Var3.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList8;
                    }
                    arrayList7 = sharedElementSourceNames;
                } else {
                    arrayList7 = sharedElementSourceNames;
                    q7Var3.v(q7Var4.keySet());
                }
                q7<String, View> q7Var5 = new q7<>();
                fxVar.u(q7Var5, eVar2.f().mView);
                q7Var5.v(sharedElementTargetNames2);
                q7Var5.v(q7Var3.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.d(sharedElementTargetNames2, q7Var5);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view11 = q7Var5.get(str2);
                        if (view11 == null) {
                            String q2 = ey.q(q7Var3, str2);
                            if (q2 != null) {
                                q7Var3.remove(q2);
                            }
                        } else if (!str2.equals(sr.w0(view11)) && (q = ey.q(q7Var3, str2)) != null) {
                            q7Var3.put(q, sr.w0(view11));
                        }
                    }
                } else {
                    ey.y(q7Var3, q7Var5);
                }
                fxVar.v(q7Var4, q7Var3.keySet());
                fxVar.v(q7Var5, q7Var3.values());
                if (q7Var3.isEmpty()) {
                    arrayList9.clear();
                    arrayList10.clear();
                    obj5 = null;
                    eVar4 = eVar;
                    eVar5 = eVar2;
                    q7Var2 = q7Var3;
                    arrayList5 = arrayList10;
                    view5 = view8;
                    gyVar = gyVar2;
                    hashMap2 = hashMap4;
                } else {
                    ey.f(eVar2.f(), eVar.f(), z2, q7Var4, true);
                    ArrayList<String> arrayList12 = arrayList7;
                    q7 q7Var6 = q7Var3;
                    mr.a(m(), new g(eVar2, eVar, z, q7Var5));
                    arrayList9.addAll(q7Var4.values());
                    if (arrayList12.isEmpty()) {
                        i2 = 0;
                        view6 = view4;
                    } else {
                        i2 = 0;
                        view6 = q7Var4.get(arrayList12.get(0));
                        gyVar2.v(B, view6);
                    }
                    arrayList10.addAll(q7Var5.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view7 = q7Var5.get(sharedElementTargetNames2.get(i2))) != null) {
                        mr.a(m(), new h(gyVar2, view7, rect4));
                        z3 = true;
                    }
                    gyVar2.z(B, view8, arrayList9);
                    q7Var2 = q7Var6;
                    arrayList5 = arrayList10;
                    Rect rect5 = rect4;
                    View view12 = view8;
                    gyVar = gyVar2;
                    gyVar2.t(B, null, null, null, null, B, arrayList5);
                    Boolean bool = Boolean.TRUE;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar, bool);
                    hashMap2.put(eVar2, bool);
                    view4 = view6;
                    arrayList6 = arrayList9;
                    rect3 = rect5;
                    obj5 = B;
                    eVar4 = eVar;
                    fxVar = this;
                    view5 = view12;
                    eVar5 = eVar2;
                    q7Var3 = q7Var2;
                    arrayList10 = arrayList5;
                    arrayList9 = arrayList6;
                    rect4 = rect3;
                    hashMap3 = hashMap2;
                    view9 = view4;
                    z2 = z;
                    gyVar2 = gyVar;
                    view8 = view5;
                    fxVar = fxVar;
                }
            }
            rect3 = rect4;
            arrayList6 = arrayList9;
            q7Var3 = q7Var2;
            arrayList10 = arrayList5;
            arrayList9 = arrayList6;
            rect4 = rect3;
            hashMap3 = hashMap2;
            view9 = view4;
            z2 = z;
            gyVar2 = gyVar;
            view8 = view5;
            fxVar = fxVar;
        }
        View view13 = view9;
        q7 q7Var7 = q7Var3;
        View view14 = view8;
        gy gyVar3 = gyVar2;
        HashMap hashMap5 = hashMap3;
        ArrayList<View> arrayList13 = arrayList10;
        Rect rect6 = rect4;
        Collection<?> collection = arrayList9;
        ArrayList arrayList14 = new ArrayList();
        Object obj6 = null;
        Object obj7 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap5.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g2 = gyVar3.g(mVar4.h());
                ky.e b2 = mVar4.b();
                boolean z4 = obj5 != null && (b2 == eVar4 || b2 == eVar5);
                if (g2 == null) {
                    if (!z4) {
                        hashMap5.put(b2, Boolean.FALSE);
                        mVar4.a();
                    }
                    q7Var = q7Var7;
                    obj2 = obj6;
                    arrayList2 = collection;
                    rect2 = rect6;
                    obj4 = obj7;
                    arrayList4 = arrayList14;
                    view3 = view13;
                    view2 = view14;
                    hashMap = hashMap5;
                } else {
                    HashMap hashMap6 = hashMap5;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj8 = obj7;
                    fxVar.t(arrayList15, b2.f().mView);
                    if (z4) {
                        if (b2 == eVar4) {
                            arrayList15.removeAll(collection);
                        } else {
                            arrayList15.removeAll(arrayList13);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        gyVar3.a(g2, view14);
                        obj = obj8;
                        q7Var = q7Var7;
                        obj2 = obj6;
                        arrayList = arrayList14;
                        arrayList2 = collection;
                        rect = rect6;
                        arrayList3 = arrayList15;
                        view = view13;
                        view2 = view14;
                        obj3 = g2;
                        hashMap = hashMap6;
                        eVar3 = b2;
                    } else {
                        gyVar3.b(g2, arrayList15);
                        view = view13;
                        obj = obj8;
                        obj2 = obj6;
                        arrayList = arrayList14;
                        arrayList2 = collection;
                        rect = rect6;
                        view2 = view14;
                        q7Var = q7Var7;
                        arrayList3 = arrayList15;
                        hashMap = hashMap6;
                        gyVar3.t(g2, g2, arrayList15, null, null, null, null);
                        if (b2.e() == ky.e.c.GONE) {
                            eVar3 = b2;
                            list2.remove(eVar3);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList3);
                            arrayList16.remove(eVar3.f().mView);
                            obj3 = g2;
                            gyVar3.r(obj3, eVar3.f().mView, arrayList16);
                            mr.a(m(), new i(arrayList3));
                        } else {
                            eVar3 = b2;
                            obj3 = g2;
                        }
                    }
                    if (eVar3.e() == ky.e.c.VISIBLE) {
                        arrayList4 = arrayList;
                        arrayList4.addAll(arrayList3);
                        rect2 = rect;
                        if (z3) {
                            gyVar3.u(obj3, rect2);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        arrayList4 = arrayList;
                        rect2 = rect;
                        gyVar3.v(obj3, view3);
                    }
                    hashMap.put(eVar3, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj4 = gyVar3.n(obj, obj3, null);
                    } else {
                        obj4 = obj;
                        obj2 = gyVar3.n(obj2, obj3, null);
                    }
                }
                collection = arrayList2;
                hashMap5 = hashMap;
                arrayList14 = arrayList4;
                view14 = view2;
                rect6 = rect2;
                view13 = view3;
                obj7 = obj4;
                q7Var7 = q7Var;
                obj6 = obj2;
            }
        }
        q7 q7Var8 = q7Var7;
        ArrayList arrayList17 = arrayList14;
        ArrayList<View> arrayList18 = collection;
        HashMap hashMap7 = hashMap5;
        Object m2 = gyVar3.m(obj7, obj6, obj5);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h2 = mVar5.h();
                ky.e b3 = mVar5.b();
                boolean z5 = obj5 != null && (b3 == eVar4 || b3 == eVar5);
                if (h2 != null || z5) {
                    if (!sr.T0(m())) {
                        if (FragmentManager.T0(2)) {
                            StringBuilder G2 = wo1.G("SpecialEffectsController: Container ");
                            G2.append(m());
                            G2.append(" has not been laid out. Completing operation ");
                            G2.append(b3);
                            G2.toString();
                        }
                        mVar5.a();
                    } else {
                        gyVar3.w(mVar5.b().f(), m2, mVar5.c(), new j(mVar5));
                    }
                }
            }
        }
        if (sr.T0(m())) {
            ey.B(arrayList17, 4);
            ArrayList<String> o = gyVar3.o(arrayList13);
            gyVar3.c(m(), m2);
            gyVar3.y(m(), arrayList18, arrayList13, o, q7Var8);
            ey.B(arrayList17, 0);
            gyVar3.A(obj5, arrayList18, arrayList13);
            return hashMap7;
        }
        return hashMap7;
    }

    @Override // com.p7700g.p99005.ky
    public void f(@x1 List<ky.e> list, boolean z) {
        ky.e eVar = null;
        ky.e eVar2 = null;
        for (ky.e eVar3 : list) {
            ky.e.c c2 = ky.e.c.c(eVar3.f().mView);
            int ordinal = eVar3.e().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (c2 != ky.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            }
            if (c2 == ky.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (ky.e eVar4 : list) {
            nm nmVar = new nm();
            eVar4.j(nmVar);
            arrayList.add(new k(eVar4, nmVar, z));
            nm nmVar2 = new nm();
            eVar4.j(nmVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, nmVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, nmVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, nmVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, nmVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<ky.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            s((ky.e) it.next());
        }
        arrayList3.clear();
    }

    public void s(@x1 ky.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ur.c(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void u(Map<String, View> map, @x1 View view) {
        String w0 = sr.w0(view);
        if (w0 != null) {
            map.put(w0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(@x1 q7<String, View> q7Var, @x1 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = q7Var.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(sr.w0(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}