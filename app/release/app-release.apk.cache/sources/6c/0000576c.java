package com.p7700g.p99005;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Index.java */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface q40 {
    String name() default "";

    boolean unique() default false;

    String[] value();
}