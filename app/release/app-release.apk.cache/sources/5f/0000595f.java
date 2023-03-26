package com.p7700g.p99005;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Update.java */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface r50 {
    Class<?> entity() default Object.class;

    @w40
    int onConflict() default 3;
}