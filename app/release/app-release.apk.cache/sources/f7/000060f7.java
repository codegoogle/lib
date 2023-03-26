package com.p7700g.p99005;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ChecksSdkIntAtLeast.java */
@Target({ElementType.METHOD, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface v0 {
    int api() default -1;

    String codename() default "";

    int lambda() default -1;

    int parameter() default -1;
}