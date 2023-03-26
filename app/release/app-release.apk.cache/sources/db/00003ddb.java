package com.p7700g.p99005;

/* compiled from: StateVerifier.java */
/* loaded from: classes2.dex */
public abstract class d12 {
    private static final boolean a = false;

    /* compiled from: StateVerifier.java */
    /* loaded from: classes2.dex */
    public static class b extends d12 {
        private volatile RuntimeException b;

        public b() {
            super();
        }

        @Override // com.p7700g.p99005.d12
        public void b(boolean z) {
            if (z) {
                this.b = new RuntimeException("Released");
            } else {
                this.b = null;
            }
        }

        @Override // com.p7700g.p99005.d12
        public void c() {
            if (this.b != null) {
                throw new IllegalStateException("Already released", this.b);
            }
        }
    }

    /* compiled from: StateVerifier.java */
    /* loaded from: classes2.dex */
    public static class c extends d12 {
        private volatile boolean b;

        public c() {
            super();
        }

        @Override // com.p7700g.p99005.d12
        public void b(boolean z) {
            this.b = z;
        }

        @Override // com.p7700g.p99005.d12
        public void c() {
            if (this.b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @x1
    public static d12 a() {
        return new c();
    }

    public abstract void b(boolean z);

    public abstract void c();

    private d12() {
    }
}