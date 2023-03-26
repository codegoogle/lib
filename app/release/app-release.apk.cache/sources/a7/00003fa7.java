package com.p7700g.p99005;

import com.p7700g.p99005.t43;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CacheReqModel.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/p7700g/p99005/dz2;", "", "Lcom/p7700g/p99005/t43$d;", "c", "Lcom/p7700g/p99005/t43$d;", "b", "()Lcom/p7700g/p99005/t43$d;", "priority", "", "Ljava/lang/String;", "()Ljava/lang/String;", "subPath", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "assetUrls", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/p7700g/p99005/t43$d;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class dz2 {
    @NotNull
    private final List<String> a;
    @NotNull
    private final String b;
    @NotNull
    private final t43.d c;

    public dz2(@NotNull List<String> list, @NotNull String str, @NotNull t43.d dVar) {
        c25.p(list, "assetUrls");
        c25.p(str, "subPath");
        c25.p(dVar, "priority");
        this.a = list;
        this.b = str;
        this.c = dVar;
    }

    @NotNull
    public final List<String> a() {
        return this.a;
    }

    @NotNull
    public final t43.d b() {
        return this.c;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public /* synthetic */ dz2(List list, String str, t43.d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? t43.d.HIGH : dVar);
    }
}