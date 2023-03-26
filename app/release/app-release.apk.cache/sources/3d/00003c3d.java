package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: BaseConfigReader.java */
/* loaded from: classes.dex */
public abstract class c61 {
    @x1
    public static final String a = "bypass";
    @x1
    public static final String b = "proxy_peer";
    @x1
    public static final String c = "%AUTH_STRING%";
    @x1
    public static final String d = "%PWD%";
    @x1
    public static final String e = "%TYPE%";
    @x1
    private final c81 f;

    public c61(@x1 c81 c81Var) {
        this.f = c81Var;
    }

    @x1
    public abstract String a(@x1 e61 e61Var, @x1 ft0 ft0Var) throws Exception;

    @x1
    public String b(@d2 int i) throws IOException {
        return this.f.b(i);
    }
}