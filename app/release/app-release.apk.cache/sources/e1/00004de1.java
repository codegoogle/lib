package com.p7700g.p99005;

import com.p7700g.p99005.m40;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Fts4.java */
@e2(16)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface l40 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    m40.a matchInfo() default m40.a.FTS4;

    String[] notIndexed() default {};

    m40.b order() default m40.b.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}