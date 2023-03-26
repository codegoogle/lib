package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: PartnerRequestException.java */
/* loaded from: classes.dex */
public class au0 extends IOException {
    @x1
    public static final String A = "INTERNAL_SERVER_ERROR";
    @x1
    public static final String B = "USER_SUSPENDED";
    @x1
    public static final String C = "UNAUTHORIZED";
    @x1
    public static final String s = "PARSE_EXCEPTION";
    @x1
    public static final String t = "SESSIONS_EXCEED";
    @x1
    public static final String u = "DEVICES_EXCEED";
    @x1
    public static final String v = "INVALID";
    @x1
    public static final String w = "OAUTH_ERROR";
    @x1
    public static final String x = "TRAFFIC_EXCEED";
    @x1
    public static final String y = "NOT_AUTHORIZED";
    @x1
    public static final String z = "SERVER_UNAVAILABLE";

    public au0() {
    }

    @x1
    public static au0 a(@x1 dr0 dr0Var, int i, @x1 et0 et0Var) {
        String e = et0Var.e();
        if (!C.equals(e) && !"NOT_AUTHORIZED".equals(e)) {
            return new bu0(dr0Var, i, et0Var.e(), et0Var.c());
        }
        return d(dr0Var);
    }

    @x1
    public static au0 b(@x1 dr0 dr0Var, @x1 Exception exc, @x1 String str) {
        return new bu0(dr0Var, 0, "PARSE_EXCEPTION", wo1.t("Unable to parse: ", str));
    }

    @x1
    public static au0 c(@x1 Exception exc) {
        return new yt0(exc);
    }

    @x1
    public static au0 d(@x1 dr0 dr0Var) {
        return new zt0(dr0Var, "NOT_AUTHORIZED", "");
    }

    @x1
    public static au0 e(@x1 Throwable th) {
        return new au0(th);
    }

    public au0(@x1 String str) {
        super(str);
    }

    public au0(@x1 String str, @x1 Throwable th) {
        super(str, th);
    }

    public au0(@x1 Throwable th) {
        super(th);
    }
}