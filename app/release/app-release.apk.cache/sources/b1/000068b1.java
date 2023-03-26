package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.s80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class z70 extends gy {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class a extends s80.f {
        public final /* synthetic */ Rect a;

        public a(Rect rect) {
            this.a = rect;
        }

        @Override // com.p7700g.p99005.s80.f
        public Rect a(@x1 s80 s80Var) {
            return this.a;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class b implements s80.h {
        public final /* synthetic */ View s;
        public final /* synthetic */ ArrayList t;

        public b(View view, ArrayList arrayList) {
            this.s = view;
            this.t = arrayList;
        }

        @Override // com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            s80Var.v0(this);
            this.s.setVisibility(8);
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                ((View) this.t.get(i)).setVisibility(0);
            }
        }

        @Override // com.p7700g.p99005.s80.h
        public void d(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class c extends u80 {
        public final /* synthetic */ Object s;
        public final /* synthetic */ ArrayList t;
        public final /* synthetic */ Object u;
        public final /* synthetic */ ArrayList v;
        public final /* synthetic */ Object w;
        public final /* synthetic */ ArrayList x;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.s = obj;
            this.t = arrayList;
            this.u = obj2;
            this.v = arrayList2;
            this.w = obj3;
            this.x = arrayList3;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
            Object obj = this.s;
            if (obj != null) {
                z70.this.q(obj, this.t, null);
            }
            Object obj2 = this.u;
            if (obj2 != null) {
                z70.this.q(obj2, this.v, null);
            }
            Object obj3 = this.w;
            if (obj3 != null) {
                z70.this.q(obj3, this.x, null);
            }
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            s80Var.v0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class d extends s80.f {
        public final /* synthetic */ Rect a;

        public d(Rect rect) {
            this.a = rect;
        }

        @Override // com.p7700g.p99005.s80.f
        public Rect a(@x1 s80 s80Var) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    private static boolean C(s80 s80Var) {
        return (gy.l(s80Var.d0()) && gy.l(s80Var.e0()) && gy.l(s80Var.f0())) ? false : true;
    }

    @Override // com.p7700g.p99005.gy
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        x80 x80Var = (x80) obj;
        if (x80Var != null) {
            x80Var.g0().clear();
            x80Var.g0().addAll(arrayList2);
            q(x80Var, arrayList, arrayList2);
        }
    }

    @Override // com.p7700g.p99005.gy
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        x80 x80Var = new x80();
        x80Var.V0((s80) obj);
        return x80Var;
    }

    @Override // com.p7700g.p99005.gy
    public void a(Object obj, View view) {
        if (obj != null) {
            ((s80) obj).c(view);
        }
    }

    @Override // com.p7700g.p99005.gy
    public void b(Object obj, ArrayList<View> arrayList) {
        s80 s80Var = (s80) obj;
        if (s80Var == null) {
            return;
        }
        int i = 0;
        if (s80Var instanceof x80) {
            x80 x80Var = (x80) s80Var;
            int a1 = x80Var.a1();
            while (i < a1) {
                b(x80Var.Z0(i), arrayList);
                i++;
            }
        } else if (C(s80Var) || !gy.l(s80Var.g0())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                s80Var.c(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.p7700g.p99005.gy
    public void c(ViewGroup viewGroup, Object obj) {
        v80.b(viewGroup, (s80) obj);
    }

    @Override // com.p7700g.p99005.gy
    public boolean e(Object obj) {
        return obj instanceof s80;
    }

    @Override // com.p7700g.p99005.gy
    public Object g(Object obj) {
        if (obj != null) {
            return ((s80) obj).clone();
        }
        return null;
    }

    @Override // com.p7700g.p99005.gy
    public Object m(Object obj, Object obj2, Object obj3) {
        s80 s80Var = (s80) obj;
        s80 s80Var2 = (s80) obj2;
        s80 s80Var3 = (s80) obj3;
        if (s80Var != null && s80Var2 != null) {
            s80Var = new x80().V0(s80Var).V0(s80Var2).l1(1);
        } else if (s80Var == null) {
            s80Var = s80Var2 != null ? s80Var2 : null;
        }
        if (s80Var3 != null) {
            x80 x80Var = new x80();
            if (s80Var != null) {
                x80Var.V0(s80Var);
            }
            x80Var.V0(s80Var3);
            return x80Var;
        }
        return s80Var;
    }

    @Override // com.p7700g.p99005.gy
    public Object n(Object obj, Object obj2, Object obj3) {
        x80 x80Var = new x80();
        if (obj != null) {
            x80Var.V0((s80) obj);
        }
        if (obj2 != null) {
            x80Var.V0((s80) obj2);
        }
        if (obj3 != null) {
            x80Var.V0((s80) obj3);
        }
        return x80Var;
    }

    @Override // com.p7700g.p99005.gy
    public void p(Object obj, View view) {
        if (obj != null) {
            ((s80) obj).z0(view);
        }
    }

    @Override // com.p7700g.p99005.gy
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        s80 s80Var = (s80) obj;
        int i = 0;
        if (s80Var instanceof x80) {
            x80 x80Var = (x80) s80Var;
            int a1 = x80Var.a1();
            while (i < a1) {
                q(x80Var.Z0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(s80Var)) {
            List<View> g0 = s80Var.g0();
            if (g0.size() == arrayList.size() && g0.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    s80Var.c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    s80Var.z0(arrayList.get(size2));
                }
            }
        }
    }

    @Override // com.p7700g.p99005.gy
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((s80) obj).a(new b(view, arrayList));
    }

    @Override // com.p7700g.p99005.gy
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((s80) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.p7700g.p99005.gy
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((s80) obj).H0(new d(rect));
        }
    }

    @Override // com.p7700g.p99005.gy
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((s80) obj).H0(new a(rect));
        }
    }

    @Override // com.p7700g.p99005.gy
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        x80 x80Var = (x80) obj;
        List<View> g0 = x80Var.g0();
        g0.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gy.d(g0, arrayList.get(i));
        }
        g0.add(view);
        arrayList.add(view);
        b(x80Var, arrayList);
    }
}