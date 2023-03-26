package com.p7700g.p99005;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: VisibleForTesting.java */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface r2 {
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;

    int otherwise() default 2;
}