package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.hf;
import com.p7700g.p99005.oe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ViewTransitionController.java */
/* loaded from: classes.dex */
public class pe {
    private final ge a;
    private HashSet<View> c;
    public ArrayList<oe.b> e;
    private ArrayList<oe> b = new ArrayList<>();
    private String d = "ViewTransitionController";
    public ArrayList<oe.b> f = new ArrayList<>();

    /* compiled from: ViewTransitionController.java */
    /* loaded from: classes.dex */
    public class a implements hf.a {
        public final /* synthetic */ oe s;
        public final /* synthetic */ int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ int v;

        public a(final oe val$viewTransition, final int val$listen_for_id, final boolean val$isSet, final int val$listen_for_value) {
            this.s = val$viewTransition;
            this.t = val$listen_for_id;
            this.u = val$isSet;
            this.v = val$listen_for_value;
        }

        @Override // com.p7700g.p99005.hf.a
        public void a(int id, int value, int oldValue) {
            int g = this.s.g();
            this.s.r(value);
            if (this.t != id || g == value) {
                return;
            }
            if (this.u) {
                if (this.v == value) {
                    int childCount = pe.this.a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = pe.this.a.getChildAt(i);
                        if (this.s.m(childAt)) {
                            int currentState = pe.this.a.getCurrentState();
                            af v0 = pe.this.a.v0(currentState);
                            oe oeVar = this.s;
                            pe peVar = pe.this;
                            oeVar.b(peVar, peVar.a, currentState, v0, childAt);
                        }
                    }
                }
            } else if (this.v != value) {
                int childCount2 = pe.this.a.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = pe.this.a.getChildAt(i2);
                    if (this.s.m(childAt2)) {
                        int currentState2 = pe.this.a.getCurrentState();
                        af v02 = pe.this.a.v0(currentState2);
                        oe oeVar2 = this.s;
                        pe peVar2 = pe.this;
                        oeVar2.b(peVar2, peVar2.a, currentState2, v02, childAt2);
                    }
                }
            }
        }
    }

    public pe(ge layout) {
        this.a = layout;
    }

    private void i(oe viewTransition, boolean isSet) {
        ConstraintLayout.getSharedValues().a(viewTransition.h(), new a(viewTransition, viewTransition.h(), isSet, viewTransition.f()));
    }

    private void n(oe vt, View... view) {
        int currentState = this.a.getCurrentState();
        if (vt.D == 2) {
            vt.b(this, this.a, currentState, null, view);
        } else if (currentState == -1) {
            this.a.toString();
        } else {
            af v0 = this.a.v0(currentState);
            if (v0 == null) {
                return;
            }
            vt.b(this, this.a, currentState, v0, view);
        }
    }

    public void b(oe viewTransition) {
        this.b.add(viewTransition);
        this.c = null;
        if (viewTransition.i() == 4) {
            i(viewTransition, true);
        } else if (viewTransition.i() == 5) {
            i(viewTransition, false);
        }
    }

    public void c(oe.b animation) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(animation);
    }

    public void d() {
        ArrayList<oe.b> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        Iterator<oe.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if (this.e.isEmpty()) {
            this.e = null;
        }
    }

    public boolean e(int viewTransitionId, ce motionController) {
        Iterator<oe> it = this.b.iterator();
        while (it.hasNext()) {
            oe next = it.next();
            if (next.d() == viewTransitionId) {
                next.E.a(motionController);
                return true;
            }
        }
        return false;
    }

    public void f(int id, boolean enable) {
        Iterator<oe> it = this.b.iterator();
        while (it.hasNext()) {
            oe next = it.next();
            if (next.d() == id) {
                next.o(enable);
                return;
            }
        }
    }

    public void g() {
        this.a.invalidate();
    }

    public boolean h(int id) {
        Iterator<oe> it = this.b.iterator();
        while (it.hasNext()) {
            oe next = it.next();
            if (next.d() == id) {
                return next.j();
            }
        }
        return false;
    }

    public void j(int id) {
        oe oeVar;
        Iterator<oe> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                oeVar = null;
                break;
            }
            oeVar = it.next();
            if (oeVar.d() == id) {
                break;
            }
        }
        if (oeVar != null) {
            this.c = null;
            this.b.remove(oeVar);
        }
    }

    public void k(oe.b animation) {
        this.f.add(animation);
    }

    public void l(MotionEvent event) {
        oe oeVar;
        int currentState = this.a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.c == null) {
            this.c = new HashSet<>();
            Iterator<oe> it = this.b.iterator();
            while (it.hasNext()) {
                oe next = it.next();
                int childCount = this.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.a.getChildAt(i);
                    if (next.m(childAt)) {
                        childAt.getId();
                        this.c.add(childAt);
                    }
                }
            }
        }
        float x = event.getX();
        float y = event.getY();
        Rect rect = new Rect();
        int action = event.getAction();
        ArrayList<oe.b> arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<oe.b> it2 = this.e.iterator();
            while (it2.hasNext()) {
                it2.next().d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            af v0 = this.a.v0(currentState);
            Iterator<oe> it3 = this.b.iterator();
            while (it3.hasNext()) {
                oe next2 = it3.next();
                if (next2.u(action)) {
                    Iterator<View> it4 = this.c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.m(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                oeVar = next2;
                                next2.b(this, this.a, currentState, v0, next3);
                            } else {
                                oeVar = next2;
                            }
                            next2 = oeVar;
                        }
                    }
                }
            }
        }
    }

    public void m(int id, View... views) {
        ArrayList arrayList = new ArrayList();
        Iterator<oe> it = this.b.iterator();
        oe oeVar = null;
        while (it.hasNext()) {
            oe next = it.next();
            if (next.d() == id) {
                for (View view : views) {
                    if (next.c(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                oeVar = next;
            }
        }
        if (oeVar == null) {
        }
    }
}