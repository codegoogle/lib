package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.ie;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Carousel.java */
/* loaded from: classes.dex */
public class bd extends de {
    private static final boolean F = false;
    private static final String G = "Carousel";
    public static final int H = 1;
    public static final int I = 2;
    private b J;
    private final ArrayList<View> K;
    private int L;
    private int M;
    private ge N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private float U;
    private int V;
    private int W;
    private int u0;
    private float v0;
    private int w0;
    private int x0;
    public int y0;
    public Runnable z0;

    /* compiled from: Carousel.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* compiled from: Carousel.java */
        /* renamed from: com.p7700g.p99005.bd$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0150a implements Runnable {
            public final /* synthetic */ float s;

            public RunnableC0150a(final float val$v) {
                this.s = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                bd.this.N.V0(5, 1.0f, this.s);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bd.this.N.setProgress(0.0f);
            bd.this.a0();
            bd.this.J.a(bd.this.M);
            float velocity = bd.this.N.getVelocity();
            if (bd.this.u0 != 2 || velocity <= bd.this.v0 || bd.this.M >= bd.this.J.count() - 1) {
                return;
            }
            float f = bd.this.U * velocity;
            if (bd.this.M != 0 || bd.this.L <= bd.this.M) {
                if (bd.this.M != bd.this.J.count() - 1 || bd.this.L >= bd.this.M) {
                    bd.this.N.post(new RunnableC0150a(f));
                }
            }
        }
    }

    /* compiled from: Carousel.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(int index);

        void b(View view, int index);

        int count();
    }

    public bd(Context context) {
        super(context);
        this.J = null;
        this.K = new ArrayList<>();
        this.L = 0;
        this.M = 0;
        this.O = -1;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = 0.9f;
        this.V = 0;
        this.W = 4;
        this.u0 = 1;
        this.v0 = 2.0f;
        this.w0 = -1;
        this.x0 = 200;
        this.y0 = -1;
        this.z0 = new a();
    }

    private void S(boolean enable) {
        Iterator<ie.b> it = this.N.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().Q(enable);
        }
    }

    private boolean T(int transitionID, boolean enable) {
        ge geVar;
        ie.b z0;
        if (transitionID == -1 || (geVar = this.N) == null || (z0 = geVar.z0(transitionID)) == null || enable == z0.K()) {
            return false;
        }
        z0.Q(enable);
        return true;
    }

    private void U(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.G3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.J3) {
                    this.O = obtainStyledAttributes.getResourceId(index, this.O);
                } else if (index == ff.m.H3) {
                    this.Q = obtainStyledAttributes.getResourceId(index, this.Q);
                } else if (index == ff.m.K3) {
                    this.R = obtainStyledAttributes.getResourceId(index, this.R);
                } else if (index == ff.m.I3) {
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                } else if (index == ff.m.N3) {
                    this.S = obtainStyledAttributes.getResourceId(index, this.S);
                } else if (index == ff.m.M3) {
                    this.T = obtainStyledAttributes.getResourceId(index, this.T);
                } else if (index == ff.m.P3) {
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                } else if (index == ff.m.O3) {
                    this.u0 = obtainStyledAttributes.getInt(index, this.u0);
                } else if (index == ff.m.Q3) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == ff.m.L3) {
                    this.P = obtainStyledAttributes.getBoolean(index, this.P);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void X() {
        this.N.setTransitionDuration(this.x0);
        if (this.w0 < this.M) {
            this.N.b1(this.S, this.x0);
        } else {
            this.N.b1(this.T, this.x0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        b bVar = this.J;
        if (bVar == null || this.N == null || bVar.count() == 0) {
            return;
        }
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            View view = this.K.get(i);
            int i2 = (this.M + i) - this.V;
            if (this.P) {
                if (i2 < 0) {
                    int i3 = this.W;
                    if (i3 != 4) {
                        c0(view, i3);
                    } else {
                        c0(view, 0);
                    }
                    if (i2 % this.J.count() == 0) {
                        this.J.b(view, 0);
                    } else {
                        b bVar2 = this.J;
                        bVar2.b(view, (i2 % this.J.count()) + bVar2.count());
                    }
                } else if (i2 >= this.J.count()) {
                    if (i2 == this.J.count()) {
                        i2 = 0;
                    } else if (i2 > this.J.count()) {
                        i2 %= this.J.count();
                    }
                    int i4 = this.W;
                    if (i4 != 4) {
                        c0(view, i4);
                    } else {
                        c0(view, 0);
                    }
                    this.J.b(view, i2);
                } else {
                    c0(view, 0);
                    this.J.b(view, i2);
                }
            } else if (i2 < 0) {
                c0(view, this.W);
            } else if (i2 >= this.J.count()) {
                c0(view, this.W);
            } else {
                c0(view, 0);
                this.J.b(view, i2);
            }
        }
        int i5 = this.w0;
        if (i5 != -1 && i5 != this.M) {
            this.N.post(new Runnable() { // from class: com.p7700g.p99005.ad
                @Override // java.lang.Runnable
                public final void run() {
                    bd.this.X();
                }
            });
        } else if (i5 == this.M) {
            this.w0 = -1;
        }
        if (this.Q == -1 || this.R == -1 || this.P) {
            return;
        }
        int count = this.J.count();
        if (this.M == 0) {
            T(this.Q, false);
        } else {
            T(this.Q, true);
            this.N.setTransition(this.Q);
        }
        if (this.M == count - 1) {
            T(this.R, false);
            return;
        }
        T(this.R, true);
        this.N.setTransition(this.R);
    }

    private boolean b0(int constraintSetId, View view, int visibility) {
        af.a k0;
        af v0 = this.N.v0(constraintSetId);
        if (v0 == null || (k0 = v0.k0(view.getId())) == null) {
            return false;
        }
        k0.c.c = 1;
        view.setVisibility(visibility);
        return true;
    }

    private boolean c0(View view, int visibility) {
        ge geVar = this.N;
        if (geVar == null) {
            return false;
        }
        boolean z = false;
        for (int i : geVar.getConstraintSetIds()) {
            z |= b0(i, view, visibility);
        }
        return z;
    }

    public void V(int index) {
        this.M = Math.max(0, Math.min(getCount() - 1, index));
        Y();
    }

    public void Y() {
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            View view = this.K.get(i);
            if (this.J.count() == 0) {
                c0(view, this.W);
            } else {
                c0(view, 0);
            }
        }
        this.N.N0();
        a0();
    }

    public void Z(int index, int delay) {
        this.w0 = Math.max(0, Math.min(getCount() - 1, index));
        int max = Math.max(0, delay);
        this.x0 = max;
        this.N.setTransitionDuration(max);
        if (index < this.M) {
            this.N.b1(this.S, this.x0);
        } else {
            this.N.b1(this.T, this.x0);
        }
    }

    @Override // com.p7700g.p99005.de, com.p7700g.p99005.ge.l
    public void a(ge motionLayout, int startId, int endId, float progress) {
        this.y0 = startId;
    }

    public int getCount() {
        b bVar = this.J;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.M;
    }

    @Override // com.p7700g.p99005.de, com.p7700g.p99005.ge.l
    public void k(ge motionLayout, int currentId) {
        int i = this.M;
        this.L = i;
        if (currentId == this.T) {
            this.M = i + 1;
        } else if (currentId == this.S) {
            this.M = i - 1;
        }
        if (this.P) {
            if (this.M >= this.J.count()) {
                this.M = 0;
            }
            if (this.M < 0) {
                this.M = this.J.count() - 1;
            }
        } else {
            if (this.M >= this.J.count()) {
                this.M = this.J.count() - 1;
            }
            if (this.M < 0) {
                this.M = 0;
            }
        }
        if (this.L != this.M) {
            this.N.post(this.z0);
        }
    }

    @Override // com.p7700g.p99005.xe, android.view.View
    @e2(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof ge) {
            ge geVar = (ge) getParent();
            for (int i = 0; i < this.t; i++) {
                int i2 = this.s[i];
                View n = geVar.n(i2);
                if (this.O == i2) {
                    this.V = i;
                }
                this.K.add(n);
            }
            this.N = geVar;
            if (this.u0 == 2) {
                ie.b z0 = geVar.z0(this.R);
                if (z0 != null) {
                    z0.U(5);
                }
                ie.b z02 = this.N.z0(this.Q);
                if (z02 != null) {
                    z02.U(5);
                }
            }
            a0();
        }
    }

    public void setAdapter(b adapter) {
        this.J = adapter;
    }

    public bd(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.J = null;
        this.K = new ArrayList<>();
        this.L = 0;
        this.M = 0;
        this.O = -1;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = 0.9f;
        this.V = 0;
        this.W = 4;
        this.u0 = 1;
        this.v0 = 2.0f;
        this.w0 = -1;
        this.x0 = 200;
        this.y0 = -1;
        this.z0 = new a();
        U(context, attrs);
    }

    public bd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.J = null;
        this.K = new ArrayList<>();
        this.L = 0;
        this.M = 0;
        this.O = -1;
        this.P = false;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = 0.9f;
        this.V = 0;
        this.W = 4;
        this.u0 = 1;
        this.v0 = 2.0f;
        this.w0 = -1;
        this.x0 = 200;
        this.y0 = -1;
        this.z0 = new a();
        U(context, attrs);
    }
}