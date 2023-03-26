package com.p7700g.p99005;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Attribute.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface y30 {

    /* compiled from: Attribute.java */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
        int mask() default 0;

        @x1
        String name();

        int value();
    }

    @x1
    a[] intMapping() default {};

    @x1
    String value();
}