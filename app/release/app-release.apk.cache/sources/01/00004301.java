package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;

/* compiled from: WindowInsetsAnimationControllerCompat.java */
/* loaded from: classes.dex */
public final class fs {
    private final b a;

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class a extends b {
        private final WindowInsetsAnimationController a;

        public a(@x1 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.a = windowInsetsAnimationController;
        }

        @Override // com.p7700g.p99005.fs.b
        public void a(boolean z) {
            this.a.finish(z);
        }

        @Override // com.p7700g.p99005.fs.b
        public float b() {
            return this.a.getCurrentAlpha();
        }

        @Override // com.p7700g.p99005.fs.b
        public float c() {
            return this.a.getCurrentFraction();
        }

        @Override // com.p7700g.p99005.fs.b
        @x1
        public hj d() {
            return hj.g(this.a.getCurrentInsets());
        }

        @Override // com.p7700g.p99005.fs.b
        @x1
        public hj e() {
            return hj.g(this.a.getHiddenStateInsets());
        }

        @Override // com.p7700g.p99005.fs.b
        @x1
        public hj f() {
            return hj.g(this.a.getShownStateInsets());
        }

        @Override // com.p7700g.p99005.fs.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            return this.a.getTypes();
        }

        @Override // com.p7700g.p99005.fs.b
        public boolean h() {
            return this.a.isCancelled();
        }

        @Override // com.p7700g.p99005.fs.b
        public boolean i() {
            return this.a.isFinished();
        }

        @Override // com.p7700g.p99005.fs.b
        public boolean j() {
            return this.a.isReady();
        }

        @Override // com.p7700g.p99005.fs.b
        public void k(@z1 hj hjVar, float f, float f2) {
            this.a.setInsetsAndAlpha(hjVar == null ? null : hjVar.h(), f, f2);
        }
    }

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public void a(boolean z) {
        }

        public float b() {
            return 0.0f;
        }

        @g1(from = zg2.s, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @x1
        public hj d() {
            return hj.a;
        }

        @x1
        public hj e() {
            return hj.a;
        }

        @x1
        public hj f() {
            return hj.a;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(@z1 hj hjVar, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
        }
    }

    @e2(30)
    public fs(@x1 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public float b() {
        return this.a.b();
    }

    @g1(from = zg2.s, to = 1.0d)
    public float c() {
        return this.a.c();
    }

    @x1
    public hj d() {
        return this.a.d();
    }

    @x1
    public hj e() {
        return this.a.e();
    }

    @x1
    public hj f() {
        return this.a.f();
    }

    public int g() {
        return this.a.g();
    }

    public boolean h() {
        return this.a.h();
    }

    public boolean i() {
        return this.a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@z1 hj hjVar, @g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
        this.a.k(hjVar, f, f2);
    }
}