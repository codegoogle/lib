package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.p7700g.p99005.eu;

/* compiled from: DraggableRelativeLayout.java */
/* loaded from: classes3.dex */
public class ri3 extends RelativeLayout {
    private static final int s = gm3.b(28);
    private static final int t = gm3.b(64);
    private b u;
    private eu v;
    private boolean w;
    private boolean x;
    private c y;

    /* compiled from: DraggableRelativeLayout.java */
    /* loaded from: classes3.dex */
    public class a extends eu.c {
        private int a;

        public a() {
        }

        @Override // com.p7700g.p99005.eu.c
        public int a(@x1 View view, int i, int i2) {
            return ri3.this.y.f;
        }

        @Override // com.p7700g.p99005.eu.c
        public int b(@x1 View view, int i, int i2) {
            if (ri3.this.y.j) {
                return ri3.this.y.d;
            }
            this.a = i;
            if (ri3.this.y.i == 1) {
                if (i >= ri3.this.y.e && ri3.this.u != null) {
                    ri3.this.u.a();
                }
                if (i < ri3.this.y.d) {
                    return ri3.this.y.d;
                }
            } else {
                if (i <= ri3.this.y.e && ri3.this.u != null) {
                    ri3.this.u.a();
                }
                if (i > ri3.this.y.d) {
                    return ri3.this.y.d;
                }
            }
            return i;
        }

        @Override // com.p7700g.p99005.eu.c
        public void l(@x1 View view, float f, float f2) {
            int i = ri3.this.y.d;
            if (!ri3.this.w) {
                if (ri3.this.y.i == 1) {
                    if (this.a > ri3.this.y.m || f2 > ri3.this.y.k) {
                        i = ri3.this.y.l;
                        ri3.this.w = true;
                        if (ri3.this.u != null) {
                            ri3.this.u.onDismiss();
                        }
                    }
                } else if (this.a < ri3.this.y.m || f2 < ri3.this.y.k) {
                    i = ri3.this.y.l;
                    ri3.this.w = true;
                    if (ri3.this.u != null) {
                        ri3.this.u.onDismiss();
                    }
                }
            }
            if (ri3.this.v.V(ri3.this.y.f, i)) {
                sr.m1(ri3.this);
            }
        }

        @Override // com.p7700g.p99005.eu.c
        public boolean m(@x1 View view, int i) {
            return true;
        }
    }

    /* compiled from: DraggableRelativeLayout.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b();

        void onDismiss();
    }

    /* compiled from: DraggableRelativeLayout.java */
    /* loaded from: classes3.dex */
    public static class c {
        public static final int a = 0;
        public static final int b = 1;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;
        private int k;
        private int l;
        private int m;
    }

    public ri3(Context context) {
        super(context);
        setClipChildren(false);
        f();
    }

    private void f() {
        this.v = eu.p(this, 1.0f, new a());
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.v.o(true)) {
            sr.m1(this);
        }
    }

    public void g() {
        this.w = true;
        this.v.X(this, getLeft(), this.y.l);
        sr.m1(this);
    }

    public void h(b bVar) {
        this.u = bVar;
    }

    public void i(c cVar) {
        this.y = cVar;
        cVar.l = ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.h) - cVar.c) + cVar.h + cVar.c + t;
        cVar.k = gm3.b(3000);
        if (cVar.i == 0) {
            cVar.l = (-cVar.h) - s;
            cVar.k = -cVar.k;
            cVar.m = cVar.l / 3;
            return;
        }
        cVar.m = (cVar.d * 2) + (cVar.h / 3);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.w) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.u) != null) {
            bVar.b();
        }
        this.v.M(motionEvent);
        return false;
    }
}