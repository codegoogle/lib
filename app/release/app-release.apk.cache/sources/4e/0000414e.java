package com.p7700g.p99005;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CacheResModel.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0012\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/ez2;", "", "Lcom/p7700g/p99005/fz2;", "a", "Lcom/p7700g/p99005/fz2;", "c", "()Lcom/p7700g/p99005/fz2;", "status", "", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "failedUrls", "d", "successUrls", "Ljava/lang/String;", "()Ljava/lang/String;", "error", "<init>", "(Lcom/p7700g/p99005/fz2;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ez2 {
    @NotNull
    private final fz2 a;
    @NotNull
    private final List<String> b;
    @NotNull
    private final List<String> c;
    @NotNull
    private final String d;

    public ez2(@NotNull fz2 fz2Var, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str) {
        c25.p(fz2Var, "status");
        c25.p(list, "successUrls");
        c25.p(list2, "failedUrls");
        c25.p(str, "error");
        this.a = fz2Var;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @NotNull
    public final String a() {
        return this.d;
    }

    @NotNull
    public final List<String> b() {
        return this.c;
    }

    @NotNull
    public final fz2 c() {
        return this.a;
    }

    @NotNull
    public final List<String> d() {
        return this.b;
    }

    public /* synthetic */ ez2(fz2 fz2Var, List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fz2Var, list, list2, (i & 8) != 0 ? "" : str);
    }
}