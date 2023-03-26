package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Task.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\tR\"\u0010\u0017\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u0019\u0010\u001d\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/p7700g/p99005/cs5;", "", "", "f", "()J", "Lcom/p7700g/p99005/es5;", "queue", "Lcom/p7700g/p99005/yq4;", "e", "(Lcom/p7700g/p99005/es5;)V", "", "toString", "()Ljava/lang/String;", "a", "Lcom/p7700g/p99005/es5;", "d", "()Lcom/p7700g/p99005/es5;", "h", "b", "J", "c", com.anythink.basead.d.g.i, "(J)V", "nextExecuteNanoTime", "", "Z", "()Z", "cancelable", "Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class cs5 {
    @Nullable
    private es5 a;
    private long b;
    @NotNull
    private final String c;
    private final boolean d;

    public cs5(@NotNull String str, boolean z) {
        c25.p(str, "name");
        this.c = str;
        this.d = z;
        this.b = -1L;
    }

    public final boolean a() {
        return this.d;
    }

    @NotNull
    public final String b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    @Nullable
    public final es5 d() {
        return this.a;
    }

    public final void e(@NotNull es5 es5Var) {
        c25.p(es5Var, "queue");
        es5 es5Var2 = this.a;
        if (es5Var2 == es5Var) {
            return;
        }
        if (es5Var2 == null) {
            this.a = es5Var;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long f();

    public final void g(long j) {
        this.b = j;
    }

    public final void h(@Nullable es5 es5Var) {
        this.a = es5Var;
    }

    @NotNull
    public String toString() {
        return this.c;
    }

    public /* synthetic */ cs5(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}