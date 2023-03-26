package com.p7700g.p99005;

import java.security.Principal;

/* compiled from: SecurityContext.java */
/* loaded from: classes3.dex */
public interface zm4 {
    public static final String a = "BASIC";
    public static final String b = "CLIENT_CERT";
    public static final String c = "DIGEST";
    public static final String d = "FORM";

    boolean a();

    boolean b(String str);

    Principal c();

    String d();
}