package com.p7700g.p99005;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: InspectableProperty.java */
@Target({ElementType.METHOD})
@Deprecated
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface n1 {

    /* compiled from: InspectableProperty.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
        String name();

        int value();
    }

    /* compiled from: InspectableProperty.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    /* compiled from: InspectableProperty.java */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.INFERRED;
}