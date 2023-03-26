package com.p7700g.p99005;

import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.qm3;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001c\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\tR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/Deprecated;", "", qm3.b.j, "", "replaceWith", "Lkotlin/ReplaceWith;", d.a.w, "Lkotlin/DeprecationLevel;", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/ReplaceWith;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@hr4
@kr4(allowedTargets = {gr4.CLASS, gr4.FUNCTION, gr4.PROPERTY, gr4.ANNOTATION_CLASS, gr4.CONSTRUCTOR, gr4.PROPERTY_SETTER, gr4.PROPERTY_GETTER, gr4.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface xn4 {
    zn4 level() default zn4.WARNING;

    String message();

    op4 replaceWith() default @op4(expression = "", imports = {});
}