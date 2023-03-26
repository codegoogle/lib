package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugMetadata.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class nw4 {
    private static final int a = 1;

    private static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    private static final mw4 b(hw4 hw4Var) {
        return (mw4) hw4Var.getClass().getAnnotation(mw4.class);
    }

    private static final int c(hw4 hw4Var) {
        try {
            Field declaredField = hw4Var.getClass().getDeclaredField(rs2.f.d);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(hw4Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @fz4(name = "getSpilledVariableFieldMapping")
    @tp4(version = "1.3")
    @Nullable
    public static final String[] d(@NotNull hw4 hw4Var) {
        c25.p(hw4Var, "<this>");
        mw4 b = b(hw4Var);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        ArrayList arrayList = new ArrayList();
        int c = c(hw4Var);
        int[] i = b.i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == c) {
                arrayList.add(b.s()[i2]);
                arrayList.add(b.n()[i2]);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        c25.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    @fz4(name = "getStackTraceElement")
    @tp4(version = "1.3")
    @Nullable
    public static final StackTraceElement e(@NotNull hw4 hw4Var) {
        String str;
        c25.p(hw4Var, "<this>");
        mw4 b = b(hw4Var);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(hw4Var);
        int i = c < 0 ? -1 : b.l()[c];
        String b2 = pw4.a.b(hw4Var);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + j14.P + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}