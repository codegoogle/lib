package com.p7700g.p99005;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class ia {
    public static a a;

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    private static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String methodName = stackTraceElement.getMethodName();
        String substring = (methodName + "                  ").substring(0, 17);
        String substring2 = "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length());
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(")");
        G.append(substring2);
        G.append(substring);
        String sb = G.toString();
        PrintStream printStream = System.out;
        printStream.println(sb + " " + str);
        a aVar = a;
        if (aVar != null) {
            aVar.a(sb + " " + str);
        }
    }

    public static void d(String str, String str2) {
        PrintStream printStream = System.out;
        printStream.println(str + " : " + str2);
    }

    public static void e(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder G = wo1.G(".(");
            G.append(stackTrace[i2].getFileName());
            G.append(":");
            G.append(stackTrace[i2].getLineNumber());
            G.append(") ");
            G.append(stackTrace[i2].getMethodName());
            String sb = G.toString();
            str2 = wo1.t(str2, " ");
            PrintStream printStream = System.out;
            printStream.println(str + str2 + sb + str2);
        }
    }

    public static void f(String str, String str2) {
        PrintStream printStream = System.err;
        printStream.println(str + " : " + str2);
    }

    public static int g(float f, float f2, float f3, float f4) {
        int a2 = a((int) (f * 255.0f));
        int a3 = a((int) (f2 * 255.0f));
        return (a2 << 16) | (a((int) (f4 * 255.0f)) << 24) | (a3 << 8) | a((int) (f3 * 255.0f));
    }

    public static void h(a aVar) {
        a = aVar;
    }

    public static void i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int b(float[] fArr) {
        int a2 = a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int a3 = a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a2 << 16) | (a3 << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}