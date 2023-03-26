package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArraysJVM.kt */
@vo4(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a#\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0086\b¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0087\b\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\b¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"arrayOfNulls", "", "T", "reference", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRangeToIndexCheck", "", "toIndex", "contentDeepHashCodeImpl", "contentDeepHashCode", "([Ljava/lang/Object;)I", "orEmpty", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "", "charset", "Ljava/nio/charset/Charset;", "toTypedArray", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes3.dex */
public class xr4 {
    @NotNull
    public static final <T> T[] a(@NotNull T[] tArr, int i) {
        c25.p(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        c25.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @np4
    @fz4(name = "contentDeepHashCode")
    @tp4(version = "1.3")
    public static final <T> int b(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @tp4(version = "1.3")
    public static final void c(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr == null) {
            c25.y(0, "T?");
            return (T[]) new Object[0];
        }
        return tArr;
    }

    @dx4
    private static final String e(byte[] bArr, Charset charset) {
        c25.p(bArr, "<this>");
        c25.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        c25.p(collection, "<this>");
        c25.y(0, "T?");
        T[] tArr = (T[]) collection.toArray(new Object[0]);
        c25.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return tArr;
    }
}