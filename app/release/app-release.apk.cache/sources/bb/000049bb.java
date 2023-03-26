package com.p7700g.p99005;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ForeignKey.java */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface j40 {
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;

    /* compiled from: ForeignKey.java */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface a {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @a
    int onDelete() default 1;

    @a
    int onUpdate() default 1;

    String[] parentColumns();
}