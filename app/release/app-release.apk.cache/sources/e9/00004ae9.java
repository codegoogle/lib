package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Trace.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class jn {
    @xn4(message = "Use androidx.tracing.Trace instead", replaceWith = @op4(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@NotNull String str, @NotNull uz4<? extends T> uz4Var) {
        c25.p(str, "sectionName");
        c25.p(uz4Var, "block");
        in.b(str);
        try {
            return uz4Var.x();
        } finally {
            z15.d(1);
            in.d();
            z15.c(1);
        }
    }
}