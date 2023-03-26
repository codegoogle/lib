package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.C8B;
import com.facebook.ads.redexgen.X.C8C;
import com.facebook.ads.redexgen.X.EnumC04757x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C8B.A0I, C8B.A0C, C8B.A04, C8B.A06, C8B.A08, C8B.A0B, C8B.A0E, C8B.A0J, C8B.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC04757x.A0B})
@DefaultFor({C8C.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C8C.A0E, C8C.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}