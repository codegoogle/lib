package com.p7700g.p99005;

import java.io.PrintStream;

/* compiled from: KeyParser.java */
/* loaded from: classes.dex */
public class d9 {

    /* compiled from: KeyParser.java */
    /* loaded from: classes.dex */
    public interface a {
        int get(int i);
    }

    /* compiled from: KeyParser.java */
    /* loaded from: classes.dex */
    public interface b {
        int get(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static y9 b(String str, b bVar, a aVar) {
        y9 y9Var = new y9();
        try {
            qa d = ra.d(str);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                oa oaVar = (oa) d.E(i);
                String b2 = oaVar.b();
                na k0 = oaVar.k0();
                int i2 = bVar.get(b2);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + b2);
                } else {
                    int i3 = aVar.get(i2);
                    if (i3 == 1) {
                        y9Var.d(i2, d.L(i));
                    } else if (i3 == 2) {
                        y9Var.b(i2, k0.g());
                        PrintStream printStream2 = System.out;
                        printStream2.println("parse " + b2 + " INT_MASK > " + k0.g());
                    } else if (i3 == 4) {
                        y9Var.a(i2, k0.f());
                        PrintStream printStream3 = System.out;
                        printStream3.println("parse " + b2 + " FLOAT_MASK > " + k0.f());
                    } else if (i3 == 8) {
                        y9Var.c(i2, k0.b());
                        PrintStream printStream4 = System.out;
                        printStream4.println("parse " + b2 + " STRING_MASK > " + k0.b());
                    }
                }
            }
        } catch (sa e) {
            e.printStackTrace();
        }
        return y9Var;
    }

    public static y9 c(String str) {
        return b(str, c9.a, b9.a);
    }
}