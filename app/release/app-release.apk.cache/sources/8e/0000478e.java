package com.p7700g.p99005;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Inject.java */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface hy3 {
    String value() default "";
}