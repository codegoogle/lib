package com.p7700g.p99005;

import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: KeyFrameArray.java */
/* loaded from: classes.dex */
public class m9 {

    /* compiled from: KeyFrameArray.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = 999;
        public int[] b = new int[101];
        public o8[] c = new o8[101];
        public int d;

        public a() {
            b();
        }

        public void a(int i, o8 o8Var) {
            if (this.c[i] != null) {
                e(i);
            }
            this.c[i] = o8Var;
            int[] iArr = this.b;
            int i2 = this.d;
            this.d = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.b, 999);
            Arrays.fill(this.c, (Object) null);
            this.d = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            StringBuilder G = wo1.G("V: ");
            G.append(Arrays.toString(Arrays.copyOf(this.b, this.d)));
            printStream.println(G.toString());
            System.out.print("K: [");
            int i = 0;
            while (i < this.d) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(g(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int d(int i) {
            return this.b[i];
        }

        public void e(int i) {
            this.c[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.d;
                if (i2 < i4) {
                    int[] iArr = this.b;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.d = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.d;
        }

        public o8 g(int i) {
            return this.c[this.b[i]];
        }
    }

    /* compiled from: KeyFrameArray.java */
    /* loaded from: classes.dex */
    public static class b {
        private static final int a = 999;
        public int[] b = new int[101];
        public p8[] c = new p8[101];
        public int d;

        public b() {
            b();
        }

        public void a(int i, p8 p8Var) {
            if (this.c[i] != null) {
                e(i);
            }
            this.c[i] = p8Var;
            int[] iArr = this.b;
            int i2 = this.d;
            this.d = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.b, 999);
            Arrays.fill(this.c, (Object) null);
            this.d = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            StringBuilder G = wo1.G("V: ");
            G.append(Arrays.toString(Arrays.copyOf(this.b, this.d)));
            printStream.println(G.toString());
            System.out.print("K: [");
            int i = 0;
            while (i < this.d) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(g(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int d(int i) {
            return this.b[i];
        }

        public void e(int i) {
            this.c[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.d;
                if (i2 < i4) {
                    int[] iArr = this.b;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.d = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.d;
        }

        public p8 g(int i) {
            return this.c[this.b[i]];
        }
    }

    /* compiled from: KeyFrameArray.java */
    /* loaded from: classes.dex */
    public static class c {
        private static final int a = 999;
        public int[] b = new int[101];
        public float[][] c = new float[101];
        public int d;

        public c() {
            b();
        }

        public void a(int i, float[] fArr) {
            if (this.c[i] != null) {
                e(i);
            }
            this.c[i] = fArr;
            int[] iArr = this.b;
            int i2 = this.d;
            this.d = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.b, 999);
            Arrays.fill(this.c, (Object) null);
            this.d = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            StringBuilder G = wo1.G("V: ");
            G.append(Arrays.toString(Arrays.copyOf(this.b, this.d)));
            printStream.println(G.toString());
            System.out.print("K: [");
            int i = 0;
            while (i < this.d) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(Arrays.toString(g(i)));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int d(int i) {
            return this.b[i];
        }

        public void e(int i) {
            this.c[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.d;
                if (i2 < i4) {
                    int[] iArr = this.b;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.d = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.d;
        }

        public float[] g(int i) {
            return this.c[this.b[i]];
        }
    }
}