package com.anythink.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.a.a;
import com.anythink.basead.a.c;
import com.anythink.basead.f.a.b;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.x;
import com.anythink.core.common.j.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class BaseAdView extends RelativeLayout {
    private com.anythink.basead.a.a a;
    public String d;
    public j e;
    public i f;
    public c g;
    public com.anythink.basead.a.c h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public List<View> t;
    public View u;

    public BaseAdView(Context context, j jVar, i iVar, String str) {
        super(context);
        this.d = "BaseAdView";
        this.e = jVar;
        this.f = iVar;
        this.s = str;
        this.t = new ArrayList();
        if (!this.f.I()) {
            j jVar2 = this.e;
            if (jVar2.j != 2 && jVar2.m.C() != 1) {
                this.a = new com.anythink.basead.a.a(this, this.e, new a.InterfaceC0016a() { // from class: com.anythink.basead.ui.BaseAdView.1
                    @Override // com.anythink.basead.a.a.InterfaceC0016a
                    public final void a(int i) {
                        BaseAdView baseAdView = BaseAdView.this;
                        View view = baseAdView.u;
                        if (view != null) {
                            baseAdView.a(view);
                        } else {
                            baseAdView.a(baseAdView);
                        }
                        BaseAdView.this.b(i);
                    }
                });
            }
        }
        e();
        a();
        setFocusable(true);
        setClickable(true);
    }

    private void c() {
        if (this.i) {
            return;
        }
        this.i = true;
        i iVar = this.f;
        if (iVar instanceof q) {
            b.a(getContext()).a((q) this.f);
        } else if (iVar instanceof x) {
            com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
            Context context = getContext();
            j jVar = this.e;
            a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), this.f, this.e.m);
        }
        i iVar2 = this.f;
        if ((iVar2 instanceof x) && this.e.f == 67) {
            if (((x) iVar2).a(true, true)) {
                com.anythink.core.common.d.c.a(getContext()).a(this.f.k(), 0, 1);
            }
            if (((x) this.f).a(false, true)) {
                com.anythink.core.common.d.b.a(getContext()).a(this.f.l(), 0, 1);
            }
        }
        b();
        com.anythink.basead.a.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d() {
        i iVar = this.f;
        if ((iVar instanceof x) && this.e.f == 67) {
            if (((x) iVar).a(true, false)) {
                com.anythink.core.common.d.c.a(getContext()).a(this.f.k(), 1, 0);
            }
            if (((x) this.f).a(false, false)) {
                com.anythink.core.common.d.b.a(getContext()).a(this.f.l(), 1, 0);
            }
        }
    }

    private void m() {
        com.anythink.basead.a.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract void a();

    public abstract void a(int i);

    public final void a(final Runnable runnable) {
        getContext();
        c cVar = new c(100);
        this.g = cVar;
        cVar.a(this, new com.anythink.core.common.j.a.a() { // from class: com.anythink.basead.ui.BaseAdView.3
            public final /* synthetic */ int b = 100;

            @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
            public final int getImpressionMinTimeViewed() {
                int i = this.b;
                if (i > 0) {
                    return i;
                }
                return 50;
            }

            @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
            public final void recordImpression(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public abstract void a(boolean z);

    public abstract void b();

    public void b(final int i) {
        k();
        if (this.h == null) {
            com.anythink.basead.a.c cVar = new com.anythink.basead.a.c(getContext(), this.e, this.f);
            this.h = cVar;
            cVar.a(new c.a() { // from class: com.anythink.basead.ui.BaseAdView.2
                @Override // com.anythink.basead.a.c.a
                public final void a() {
                    BaseAdView.this.a(i);
                    BaseAdView.this.f();
                    BaseAdView baseAdView = BaseAdView.this;
                    i iVar = baseAdView.f;
                    if ((iVar instanceof x) && baseAdView.e.f == 67) {
                        if (((x) iVar).a(true, false)) {
                            com.anythink.core.common.d.c.a(baseAdView.getContext()).a(baseAdView.f.k(), 1, 0);
                        }
                        if (((x) baseAdView.f).a(false, false)) {
                            com.anythink.core.common.d.b.a(baseAdView.getContext()).a(baseAdView.f.l(), 1, 0);
                        }
                    }
                }

                @Override // com.anythink.basead.a.c.a
                public final void b() {
                    BaseAdView.this.g();
                }

                @Override // com.anythink.basead.a.c.a
                public final void a(boolean z) {
                    BaseAdView.this.a(z);
                }
            });
        }
        com.anythink.basead.c.i i2 = i();
        i2.g = j();
        this.h.a(i2);
    }

    public void destroy() {
        k();
        com.anythink.basead.a.c cVar = this.h;
        if (cVar != null) {
            cVar.c();
        }
        com.anythink.core.common.j.a.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = (int) motionEvent.getRawX();
            this.l = (int) motionEvent.getRawY();
            this.o = (int) motionEvent.getX();
            this.p = (int) motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.m = (int) motionEvent.getRawX();
            this.n = (int) motionEvent.getRawY();
            this.q = (int) motionEvent.getX();
            this.r = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public final synchronized void h() {
        if (!this.i) {
            this.i = true;
            i iVar = this.f;
            if (iVar instanceof q) {
                b.a(getContext()).a((q) this.f);
            } else if (iVar instanceof x) {
                com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
                Context context = getContext();
                j jVar = this.e;
                a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), this.f, this.e.m);
            }
            i iVar2 = this.f;
            if ((iVar2 instanceof x) && this.e.f == 67) {
                if (((x) iVar2).a(true, true)) {
                    com.anythink.core.common.d.c.a(getContext()).a(this.f.k(), 0, 1);
                }
                if (((x) this.f).a(false, true)) {
                    com.anythink.core.common.d.b.a(getContext()).a(this.f.l(), 0, 1);
                }
            }
            b();
            com.anythink.basead.a.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public com.anythink.basead.c.i i() {
        com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.e.d, "");
        iVar.e = getWidth();
        iVar.f = getHeight();
        return iVar;
    }

    public final com.anythink.basead.c.a j() {
        com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
        aVar.a = this.k;
        aVar.b = this.l;
        aVar.c = this.m;
        aVar.d = this.n;
        aVar.e = this.o;
        aVar.f = this.p;
        aVar.g = this.q;
        aVar.h = this.r;
        return aVar;
    }

    public final void k() {
        com.anythink.basead.a.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
            this.a = null;
        }
    }

    public final void l() {
        com.anythink.basead.a.a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    public final void a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int c = c(width);
        int c2 = c(height);
        int i3 = i + c;
        this.k = i3;
        int i4 = i2 + c2;
        this.l = i4;
        this.o = c;
        this.p = c2;
        this.m = i3;
        this.n = i4;
        this.q = c;
        this.r = c2;
    }

    public final void b(Runnable runnable) {
        a(runnable);
    }

    private void b(View view) {
        this.u = view;
    }

    public BaseAdView(Context context, j jVar, i iVar) {
        this(context, jVar, iVar, "");
    }

    public BaseAdView(Context context) {
        super(context);
        this.d = "BaseAdView";
    }

    private static int c(int i) {
        Random random = new Random();
        if (i > 0) {
            double d = i;
            int i2 = (int) (0.1d * d);
            return random.nextInt((((int) (d * 0.9d)) - i2) + 1) + i2;
        }
        return 0;
    }
}