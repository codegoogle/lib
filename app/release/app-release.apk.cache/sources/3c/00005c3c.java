package com.p7700g.p99005;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: HttpHeaders.java */
/* loaded from: classes3.dex */
public interface sm4 {
    public static final String a = "Accept";
    public static final String b = "Accept-Charset";
    public static final String c = "Accept-Encoding";
    public static final String d = "Accept-Language";
    public static final String e = "Authorization";
    public static final String f = "Cache-Control";
    public static final String g = "Content-Encoding";
    public static final String h = "Content-Language";
    public static final String i = "Content-Length";
    public static final String j = "Content-Location";
    public static final String k = "Content-Type";
    public static final String l = "Date";
    public static final String m = "ETag";
    public static final String n = "Expires";
    public static final String o = "Host";
    public static final String p = "If-Match";
    public static final String q = "If-Modified-Since";
    public static final String r = "If-None-Match";
    public static final String s = "If-Unmodified-Since";
    public static final String t = "Last-Modified";
    public static final String u = "Location";
    public static final String v = "User-Agent";
    public static final String w = "Vary";
    public static final String x = "WWW-Authenticate";
    public static final String y = "Cookie";
    public static final String z = "Set-Cookie";

    Locale a();

    Map<String, pm4> b();

    um4<String, String> c();

    tm4 d();

    List<tm4> e();

    List<Locale> f();

    List<String> g(String str);
}