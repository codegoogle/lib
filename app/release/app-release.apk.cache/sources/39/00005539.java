package com.p7700g.p99005;

/* compiled from: ThrowHelper.java */
/* loaded from: classes3.dex */
public class ox3 {
    public static <T extends Exception> T a(Exception exc, T t) {
        t.initCause(exc);
        return t;
    }
}