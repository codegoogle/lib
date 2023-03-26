package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KClasses.kt */
@fz4(name = "KClasses")
@vo4(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"cast", "T", "", "Lkotlin/reflect/KClass;", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v55 {
    /* JADX WARN: Multi-variable type inference failed */
    @dr4(markerClass = {fo4.class})
    @NotNull
    @fx4
    @tp4(version = "1.4")
    public static final <T> T a(@NotNull u55<T> u55Var, @Nullable Object obj) {
        c25.p(u55Var, "<this>");
        if (u55Var.G3(obj)) {
            c25.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        StringBuilder G = wo1.G("Value cannot be cast to ");
        G.append(u55Var.y());
        throw new ClassCastException(G.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dr4(markerClass = {fo4.class})
    @Nullable
    @fx4
    @tp4(version = "1.4")
    public static final <T> T b(@NotNull u55<T> u55Var, @Nullable Object obj) {
        c25.p(u55Var, "<this>");
        if (u55Var.G3(obj)) {
            c25.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}