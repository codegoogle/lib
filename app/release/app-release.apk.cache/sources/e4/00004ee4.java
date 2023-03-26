package com.p7700g.p99005;

import java.nio.CharBuffer;
import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class lo {
    public static final ko a = new e(null, false);
    public static final ko b = new e(null, true);
    public static final ko c;
    public static final ko d;
    public static final ko e;
    public static final ko f;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        public static final a a = new a(true);
        private final boolean b;

        private a(boolean z) {
            this.b = z;
        }

        @Override // com.p7700g.p99005.lo.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = lo.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.b) {
                        return 1;
                    }
                } else if (this.b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.b ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class b implements c {
        public static final b a = new b();

        private b() {
        }

        @Override // com.p7700g.p99005.lo.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = lo.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d implements ko {
        private final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        private boolean d(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a != 0) {
                if (a != 1) {
                    return c();
                }
                return false;
            }
            return true;
        }

        @Override // com.p7700g.p99005.ko
        public boolean a(char[] cArr, int i, int i2) {
            return b(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // com.p7700g.p99005.ko
        public boolean b(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.a == null) {
                    return c();
                }
                return d(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        public abstract boolean c();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        private final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // com.p7700g.p99005.lo.d
        public boolean c() {
            return this.b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // com.p7700g.p99005.lo.d
        public boolean c() {
            return mo.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.a, false);
        f = f.b;
    }

    private lo() {
    }

    public static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}