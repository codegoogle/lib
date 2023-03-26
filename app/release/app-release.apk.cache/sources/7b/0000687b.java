package com.p7700g.p99005;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ColumnInfo.java */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface z30 {
    public static final String h = "[field-name]";
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    @e2(21)
    public static final int r = 5;
    @e2(21)
    public static final int s = 6;
    public static final String t = "[value-unspecified]";

    /* compiled from: ColumnInfo.java */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* compiled from: ColumnInfo.java */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @b
    int typeAffinity() default 1;
}