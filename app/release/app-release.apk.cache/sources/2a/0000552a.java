package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public abstract class ow {
    private static ow a;

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (!f(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !f(b3) && !f(b4)) {
                    int k = ((b & 7) << 18) | (k(b2) << 12) | (k(b3) << 6) | k(b4);
                    cArr[i] = e(k);
                    cArr[i + 1] = j(k);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (!f(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !f(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (k(b2) << 6) | k(b3));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b >= -62) {
                if (!f(b2)) {
                    cArr[i] = (char) (((b & 31) << 6) | k(b2));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char e(int i) {
            return (char) ((i >>> 10) + ax5.d);
        }

        private static boolean f(byte b) {
            return b > -65;
        }

        public static boolean g(byte b) {
            return b >= 0;
        }

        public static boolean h(byte b) {
            return b < -16;
        }

        public static boolean i(byte b) {
            return b < -32;
        }

        private static char j(int i) {
            return (char) ((i & 1023) + ax5.e);
        }

        private static int k(byte b) {
            return b & ax5.a;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class b extends IllegalArgumentException {
        public b(int i, int i2) {
            super(wo1.o("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    public static ow d() {
        if (a == null) {
            a = new qw();
        }
        return a;
    }

    public static void e(ow owVar) {
        a = owVar;
    }

    public abstract String a(ByteBuffer byteBuffer, int i, int i2);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}