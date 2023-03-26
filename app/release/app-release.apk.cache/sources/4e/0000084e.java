package com.anythink.expressad.foundation.g.g;

/* loaded from: classes2.dex */
public abstract class a implements Runnable {
    public static long b;
    public int c = EnumC0065a.a;
    public b d;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.anythink.expressad.foundation.g.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0065a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {1, 2, 3, 4, 5};

        private EnumC0065a(String str, int i) {
        }

        private static int[] a() {
            return (int[]) f.clone();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i);
    }

    public a() {
        b++;
    }

    private void a(int i) {
        this.c = i;
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    private int d() {
        return this.c;
    }

    public static long e() {
        return b;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void f() {
        int i = this.c;
        int i2 = EnumC0065a.d;
        if (i != i2) {
            a(i2);
        }
    }

    public final void g() {
        int i = this.c;
        if (i == EnumC0065a.c || i == EnumC0065a.d || i == EnumC0065a.e) {
            return;
        }
        a(EnumC0065a.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.c == EnumC0065a.a) {
                a(EnumC0065a.b);
                a();
                a(EnumC0065a.e);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(b bVar) {
        this.d = bVar;
    }
}