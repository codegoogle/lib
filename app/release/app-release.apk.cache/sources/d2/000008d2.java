package com.anythink.expressad.out;

/* loaded from: classes2.dex */
public final class p {

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);

        void a(com.anythink.expressad.foundation.d.c cVar, String str);

        void a(j jVar);

        void a(j jVar, String str);

        boolean a();

        void b(j jVar);

        void b(j jVar, String str);

        void c(j jVar);

        void d(j jVar);
    }

    /* loaded from: classes2.dex */
    public static class d {
        private int a;
        private int b;

        private d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        private int a() {
            return this.a;
        }

        private int b() {
            return this.b;
        }

        private void a(int i) {
            this.a = i;
        }

        private void b(int i) {
            this.b = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface e extends c {
        void b();
    }
}