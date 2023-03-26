package com.p7700g.p99005;

import com.anythink.expressad.foundation.c.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.qm3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@kr4(allowedTargets = {gr4.CLASS, gr4.FUNCTION, gr4.PROPERTY, gr4.CONSTRUCTOR, gr4.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@ir4
@jr4(fr4.SOURCE)
@vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nR\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\rR\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/internal/RequireKotlin;", "", com.anythink.expressad.foundation.g.a.h, "", qm3.b.j, d.a.w, "Lkotlin/DeprecationLevel;", "versionKind", "Lkotlin/internal/RequireKotlinVersionKind;", IronSourceConstants.EVENTS_ERROR_CODE, "", "()I", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/internal/RequireKotlinVersionKind;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Repeatable(a.class)
@tp4(version = "1.2")
/* loaded from: classes3.dex */
public @interface nx4 {

    /* compiled from: Annotations.kt */
    @e35
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    @kr4(allowedTargets = {gr4.CLASS, gr4.FUNCTION, gr4.PROPERTY, gr4.CONSTRUCTOR, gr4.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    @jr4(fr4.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
        nx4[] value();
    }

    int errorCode() default -1;

    zn4 level() default zn4.ERROR;

    String message() default "";

    String version();

    ox4 versionKind() default ox4.LANGUAGE_VERSION;
}