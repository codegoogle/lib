package com.p7700g.p99005;

import java.util.Map;

/* compiled from: SdkConnectionInfo.java */
/* loaded from: classes.dex */
public class y41 {
    @x1
    private final String a;
    @x1
    private final String b;
    @x1
    private final String c;
    @x1
    private final Map<String, String> d;
    private String e;

    public y41(@x1 String str, @x1 String str2, @x1 String str3, @x1 String str4, @x1 Map<String, String> map) {
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.e = str4;
        this.d = map;
    }

    public String a() {
        return this.e;
    }

    @x1
    public String b() {
        return this.a;
    }

    @x1
    public Map<String, String> c() {
        return this.d;
    }

    @x1
    public String d() {
        return this.b;
    }

    @x1
    public String e() {
        return this.c;
    }
}