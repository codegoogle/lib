package com.p7700g.p99005;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve.java */
/* loaded from: classes.dex */
public class u9 extends h9 {
    private static final boolean p = false;
    public o9 q;

    public u9(String str) {
        this.o = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.q = e(Arrays.copyOf(dArr, i + 1));
    }

    private static o9 d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return e(dArr);
    }

    private static o9 e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        o9 o9Var = new o9(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder G = wo1.G(" 0 ");
        G.append(o9Var.c(zg2.s, 0));
        printStream.println(G.toString());
        PrintStream printStream2 = System.out;
        StringBuilder G2 = wo1.G(" 1 ");
        G2.append(o9Var.c(1.0d, 0));
        printStream2.println(G2.toString());
        return o9Var;
    }

    @Override // com.p7700g.p99005.h9
    public double a(double d) {
        return this.q.c(d, 0);
    }

    @Override // com.p7700g.p99005.h9
    public double b(double d) {
        return this.q.f(d, 0);
    }
}