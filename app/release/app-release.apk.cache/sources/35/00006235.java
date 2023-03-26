package com.p7700g.p99005;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Metadata.kt */
@Target({ElementType.TYPE})
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003R\u0018\u0010\u0006\u001a\u00020\u0005X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\r\u001a\u00020\u0003X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\f\u001a\u00020\tX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lkotlin/Metadata;", "", "kind", "", "metadataVersion", "", "bytecodeVersion", "data1", "", "", "data2", "extraString", "packageName", "extraInt", "bv$annotations", "()V", "bv", "()[I", com.anythink.expressad.foundation.g.a.N, "()[Ljava/lang/String;", com.anythink.expressad.foundation.g.a.O, "xi$annotations", "xi", "()I", "xs", "()Ljava/lang/String;", "k", "mv", "pn$annotations", "pn", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kr4(allowedTargets = {gr4.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@jr4(fr4.RUNTIME)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public @interface vo4 {

    /* compiled from: Metadata.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @xn4(level = zn4.s, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @tp4(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @tp4(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @fz4(name = "bv")
    int[] bv() default {1, 0, 3};

    @fz4(name = com.anythink.expressad.foundation.g.a.N)
    String[] d1() default {};

    @fz4(name = com.anythink.expressad.foundation.g.a.O)
    String[] d2() default {};

    @fz4(name = "k")
    int k() default 1;

    @fz4(name = "mv")
    int[] mv() default {};

    @fz4(name = "pn")
    String pn() default "";

    @fz4(name = "xi")
    int xi() default 0;

    @fz4(name = "xs")
    String xs() default "";
}