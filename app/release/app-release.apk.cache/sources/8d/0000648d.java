package com.p7700g.p99005;

/* compiled from: RequestCoordinator.java */
/* loaded from: classes2.dex */
public interface wy1 {

    /* compiled from: RequestCoordinator.java */
    /* loaded from: classes2.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean y;

        a(boolean z) {
            this.y = z;
        }

        public boolean f() {
            return this.y;
        }
    }

    void a(vy1 vy1Var);

    boolean b();

    wy1 c();

    boolean e(vy1 vy1Var);

    boolean g(vy1 vy1Var);

    void i(vy1 vy1Var);

    boolean k(vy1 vy1Var);
}