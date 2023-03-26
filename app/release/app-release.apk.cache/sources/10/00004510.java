package com.p7700g.p99005;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes2.dex */
public interface gq1 {
    public static final String a = "UTF-8";
    public static final Charset b = Charset.forName("UTF-8");

    void a(@x1 MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}