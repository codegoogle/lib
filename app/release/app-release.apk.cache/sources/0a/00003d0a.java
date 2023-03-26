package com.p7700g.p99005;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: HttpMethod.java */
@Target({ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface cm4 {
    public static final String A0 = "HEAD";
    public static final String B0 = "OPTIONS";
    public static final String w0 = "GET";
    public static final String x0 = "POST";
    public static final String y0 = "PUT";
    public static final String z0 = "DELETE";

    String value();
}