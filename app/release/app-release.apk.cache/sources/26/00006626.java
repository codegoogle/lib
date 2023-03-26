package com.p7700g.p99005;

/* compiled from: ExceptionUtils.java */
/* loaded from: classes.dex */
public class xt0 {
    public static String a(dr0 dr0Var, String str) {
        StringBuilder G = wo1.G("Error on request ");
        G.append(dr0Var.toString());
        G.append(" ");
        G.append(str);
        return G.toString();
    }

    public static String b(dr0 dr0Var, jr5 jr5Var) {
        StringBuilder G = wo1.G("Error on request ");
        G.append(dr0Var.toString());
        G.append(" with response:  ");
        G.append(jr5Var.toString());
        return G.toString();
    }
}