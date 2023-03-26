package com.squareup.moshi;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.fo4;
import com.p7700g.p99005.j65;
import com.p7700g.p99005.s65;
import com.p7700g.p99005.u55;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.yy4;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: -MoshiKotlinTypesExtensions.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010\"\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011*\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "T", "", "nextAnnotations", "(Ljava/util/Set;)Ljava/util/Set;", "Ljava/lang/reflect/WildcardType;", "subtypeOf", "()Ljava/lang/reflect/WildcardType;", "supertypeOf", "Lcom/p7700g/p99005/j65;", "Ljava/lang/reflect/GenericArrayType;", "asArrayType", "(Lcom/p7700g/p99005/j65;)Ljava/lang/reflect/GenericArrayType;", "Lcom/p7700g/p99005/u55;", "(Lcom/p7700g/p99005/u55;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/Class;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    @fo4
    @NotNull
    public static final GenericArrayType asArrayType(@NotNull j65 j65Var) {
        c25.p(j65Var, "$this$asArrayType");
        return asArrayType(s65.f(j65Var));
    }

    @NotNull
    public static final Class<?> getRawType(@NotNull Type type) {
        c25.p(type, "$this$rawType");
        Class<?> rawType = Types.getRawType(type);
        c25.o(rawType, "Types.getRawType(this)");
        return rawType;
    }

    public static final /* synthetic */ <T extends Annotation> Set<Annotation> nextAnnotations(Set<? extends Annotation> set) {
        c25.p(set, "$this$nextAnnotations");
        c25.y(4, "T");
        return Types.nextAnnotations(set, Annotation.class);
    }

    @fo4
    public static final /* synthetic */ <T> WildcardType subtypeOf() {
        c25.y(6, "T");
        Type f = s65.f(null);
        if (f instanceof Class) {
            f = Util.boxIfPrimitive((Class) f);
            c25.o(f, "Util.boxIfPrimitive(type)");
        }
        WildcardType subtypeOf = Types.subtypeOf(f);
        c25.o(subtypeOf, "Types.subtypeOf(type)");
        return subtypeOf;
    }

    @fo4
    public static final /* synthetic */ <T> WildcardType supertypeOf() {
        c25.y(6, "T");
        Type f = s65.f(null);
        if (f instanceof Class) {
            f = Util.boxIfPrimitive((Class) f);
            c25.o(f, "Util.boxIfPrimitive(type)");
        }
        WildcardType supertypeOf = Types.supertypeOf(f);
        c25.o(supertypeOf, "Types.supertypeOf(type)");
        return supertypeOf;
    }

    @NotNull
    public static final GenericArrayType asArrayType(@NotNull u55<?> u55Var) {
        c25.p(u55Var, "$this$asArrayType");
        return asArrayType(yy4.e(u55Var));
    }

    @NotNull
    public static final GenericArrayType asArrayType(@NotNull Type type) {
        c25.p(type, "$this$asArrayType");
        GenericArrayType arrayOf = Types.arrayOf(type);
        c25.o(arrayOf, "Types.arrayOf(this)");
        return arrayOf;
    }
}