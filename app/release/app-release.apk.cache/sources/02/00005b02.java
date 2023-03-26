package com.p7700g.p99005;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: MoshiProvider.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/p7700g/p99005/rz2;", "", "<init>", "()V", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class rz2 {
    @NotNull
    public static final a a = new a(null);

    /* compiled from: MoshiProvider.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/rz2$a", "", "", "any", "Lcom/squareup/moshi/Moshi;", "a", "([Ljava/lang/Object;)Lcom/squareup/moshi/Moshi;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Moshi a(@NotNull Object... objArr) {
            c25.p(objArr, "any");
            Moshi.Builder builder = new Moshi.Builder();
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                builder.add(obj);
            }
            Moshi build = builder.build();
            c25.o(build, "moshiBuilder.build()");
            return build;
        }
    }
}