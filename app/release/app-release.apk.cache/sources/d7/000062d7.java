package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: UseExperimental.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@xn4(message = "This annotation has been replaced by `@OptIn`", replaceWith = @op4(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/p7700g/p99005/w2;", "", "", "Lcom/p7700g/p99005/u55;", "markerClass", "()[Ljava/lang/Class;", "<init>", "(Lkotlin/Array;)V", "annotation-experimental_release"}, k = 1, mv = {1, 4, 2})
@kr4(allowedTargets = {gr4.CLASS, gr4.PROPERTY, gr4.LOCAL_VARIABLE, gr4.VALUE_PARAMETER, gr4.CONSTRUCTOR, gr4.FUNCTION, gr4.PROPERTY_GETTER, gr4.PROPERTY_SETTER, gr4.FILE, gr4.TYPEALIAS})
@Retention(RetentionPolicy.CLASS)
@jr4(fr4.BINARY)
/* loaded from: classes.dex */
public @interface w2 {
    Class<? extends Annotation>[] markerClass();
}