package com.p7700g.p99005;

import java.io.File;

/* compiled from: LottieConfig.java */
/* loaded from: classes.dex */
public class gi0 {
    @z1
    public final wm0 a;
    @z1
    public final vm0 b;
    public final boolean c;

    /* compiled from: LottieConfig.java */
    /* loaded from: classes.dex */
    public static final class b {
        @z1
        private wm0 a;
        @z1
        private vm0 b;
        private boolean c = false;

        /* compiled from: LottieConfig.java */
        /* loaded from: classes.dex */
        public class a implements vm0 {
            public final /* synthetic */ File a;

            public a(File file) {
                this.a = file;
            }

            @Override // com.p7700g.p99005.vm0
            @x1
            public File a() {
                if (this.a.isDirectory()) {
                    return this.a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* compiled from: LottieConfig.java */
        /* renamed from: com.p7700g.p99005.gi0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0180b implements vm0 {
            public final /* synthetic */ vm0 a;

            public C0180b(vm0 vm0Var) {
                this.a = vm0Var;
            }

            @Override // com.p7700g.p99005.vm0
            @x1
            public File a() {
                File a = this.a.a();
                if (a.isDirectory()) {
                    return a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @x1
        public gi0 a() {
            return new gi0(this.a, this.b, this.c);
        }

        @x1
        public b b(boolean z) {
            this.c = z;
            return this;
        }

        @x1
        public b c(@x1 File file) {
            if (this.b == null) {
                this.b = new a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @x1
        public b d(@x1 vm0 vm0Var) {
            if (this.b == null) {
                this.b = new C0180b(vm0Var);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @x1
        public b e(@x1 wm0 wm0Var) {
            this.a = wm0Var;
            return this;
        }
    }

    private gi0(@z1 wm0 wm0Var, @z1 vm0 vm0Var, boolean z) {
        this.a = wm0Var;
        this.b = vm0Var;
        this.c = z;
    }
}