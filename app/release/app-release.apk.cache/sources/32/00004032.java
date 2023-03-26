package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CredentialsCompat.java */
/* loaded from: classes2.dex */
public final class eb1 {
    @x1
    public static String a(@z1 ft0 ft0Var) {
        if (ft0Var == null) {
            return "";
        }
        if (TextUtils.isEmpty(ft0Var.l())) {
            String d = ft0Var.d();
            return d == null ? "" : d;
        }
        String l = ft0Var.l();
        return l == null ? "" : l;
    }

    @x1
    public static String b(@z1 ft0 ft0Var) {
        String d;
        if (ft0Var != null) {
            if (TextUtils.isEmpty(ft0Var.e())) {
                return (ft0Var.r() == null || ft0Var.r().size() <= 0 || (d = ft0Var.r().get(0).d()) == null) ? "" : d;
            }
            String e = ft0Var.e();
            return e == null ? "" : e;
        }
        return "";
    }

    @x1
    public static String c(@z1 ft0 ft0Var) {
        String c;
        if (ft0Var != null) {
            if (TextUtils.isEmpty(ft0Var.k())) {
                return (ft0Var.r() == null || ft0Var.r().size() <= 0 || (c = ft0Var.r().get(0).c()) == null) ? "" : c;
            }
            String k = ft0Var.k();
            return k == null ? "" : k;
        }
        return "";
    }

    @x1
    public static List<String> d(@z1 ft0 ft0Var) {
        ArrayList arrayList = new ArrayList();
        if (ft0Var != null) {
            if (ft0Var.r() != null && ft0Var.r().size() > 0) {
                for (gt0 gt0Var : ft0Var.r()) {
                    arrayList.add(gt0Var.c());
                }
            } else {
                arrayList.add(ft0Var.k());
            }
        }
        return arrayList;
    }

    @x1
    public static String e(@z1 ft0 ft0Var) {
        if (ft0Var != null) {
            if (TextUtils.isEmpty(ft0Var.p())) {
                return (ft0Var.r() == null || ft0Var.r().size() <= 0) ? "" : String.valueOf(ft0Var.r().get(0).g());
            }
            String p = ft0Var.p();
            return p == null ? "" : p;
        }
        return "";
    }
}