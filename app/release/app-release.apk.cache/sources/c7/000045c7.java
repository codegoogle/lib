package com.p7700g.p99005;

import android.view.View;
import android.view.animation.Interpolator;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h4 {
    private Interpolator c;
    public zr d;
    private boolean e;
    private long b = -1;
    private final as f = new a();
    public final ArrayList<yr> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends as {
        private boolean a = false;
        private int b = 0;

        public a() {
        }

        public void a() {
            this.b = 0;
            this.a = false;
            h4.this.b();
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationEnd(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == h4.this.a.size()) {
                zr zrVar = h4.this.d;
                if (zrVar != null) {
                    zrVar.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override // com.p7700g.p99005.as, com.p7700g.p99005.zr
        public void onAnimationStart(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            zr zrVar = h4.this.d;
            if (zrVar != null) {
                zrVar.onAnimationStart(null);
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<yr> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public h4 c(yr yrVar) {
        if (!this.e) {
            this.a.add(yrVar);
        }
        return this;
    }

    public h4 d(yr yrVar, yr yrVar2) {
        this.a.add(yrVar);
        yrVar2.v(yrVar.d());
        this.a.add(yrVar2);
        return this;
    }

    public h4 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public h4 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h4 g(zr zrVar) {
        if (!this.e) {
            this.d = zrVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<yr> it = this.a.iterator();
        while (it.hasNext()) {
            yr next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.r(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.s(interpolator);
            }
            if (this.d != null) {
                next.t(this.f);
            }
            next.x();
        }
        this.e = true;
    }
}