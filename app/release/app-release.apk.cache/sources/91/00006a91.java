package com.squareup.moshi;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.fo4;
import com.p7700g.p99005.j65;
import com.p7700g.p99005.s65;
import com.p7700g.p99005.vo4;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import org.jetbrains.annotations.NotNull;

/* compiled from: -MoshiKotlinExtensions.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "(Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/Moshi$Builder;", "addAdapter", "(Lcom/squareup/moshi/Moshi$Builder;Lcom/squareup/moshi/JsonAdapter;)Lcom/squareup/moshi/Moshi$Builder;", "Lcom/p7700g/p99005/j65;", "ktype", "(Lcom/squareup/moshi/Moshi;Lcom/p7700g/p99005/j65;)Lcom/squareup/moshi/JsonAdapter;", "moshi"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class _MoshiKotlinExtensionsKt {
    @fo4
    public static final /* synthetic */ <T> JsonAdapter<T> adapter(Moshi moshi) {
        c25.p(moshi, "$this$adapter");
        c25.y(6, "T");
        return adapter(moshi, null);
    }

    @fo4
    public static final /* synthetic */ <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> jsonAdapter) {
        c25.p(builder, "$this$addAdapter");
        c25.p(jsonAdapter, "adapter");
        c25.y(6, "T");
        Moshi.Builder add = builder.add(s65.f(null), jsonAdapter);
        c25.o(add, "add(typeOf<T>().javaType, adapter)");
        return add;
    }

    @fo4
    @NotNull
    public static final <T> JsonAdapter<T> adapter(@NotNull Moshi moshi, @NotNull j65 j65Var) {
        c25.p(moshi, "$this$adapter");
        c25.p(j65Var, "ktype");
        JsonAdapter<T> adapter = moshi.adapter(s65.f(j65Var));
        if (!(adapter instanceof NullSafeJsonAdapter) && !(adapter instanceof NonNullJsonAdapter)) {
            if (j65Var.J()) {
                adapter = adapter.nullSafe();
            } else {
                adapter = adapter.nonNull();
            }
            c25.o(adapter, "if (ktype.isMarkedNullab…    adapter.nonNull()\n  }");
        }
        return adapter;
    }
}