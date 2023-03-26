package com.p7700g.p99005;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Junction.java */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface u40 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}