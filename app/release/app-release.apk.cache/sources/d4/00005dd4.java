package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuationImpl.kt */
@vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J&\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u001a\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0007J\t\u0010 \u001a\u00020!HÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "idempotentResume", "cancelCause", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelled", "", "getCancelled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class tb5 {
    @cz4
    @Nullable
    public final Object a;
    @cz4
    @Nullable
    public final eb5 b;
    @cz4
    @Nullable
    public final f05<Throwable, yq4> c;
    @cz4
    @Nullable
    public final Object d;
    @cz4
    @Nullable
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public tb5(@Nullable Object obj, @Nullable eb5 eb5Var, @Nullable f05<? super Throwable, yq4> f05Var, @Nullable Object obj2, @Nullable Throwable th) {
        this.a = obj;
        this.b = eb5Var;
        this.c = f05Var;
        this.d = obj2;
        this.e = th;
    }

    public static /* synthetic */ tb5 g(tb5 tb5Var, Object obj, eb5 eb5Var, f05 f05Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = tb5Var.a;
        }
        if ((i & 2) != 0) {
            eb5Var = tb5Var.b;
        }
        eb5 eb5Var2 = eb5Var;
        f05<Throwable, yq4> f05Var2 = f05Var;
        if ((i & 4) != 0) {
            f05Var2 = tb5Var.c;
        }
        f05 f05Var3 = f05Var2;
        if ((i & 8) != 0) {
            obj2 = tb5Var.d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = tb5Var.e;
        }
        return tb5Var.f(obj, eb5Var2, f05Var3, obj4, th);
    }

    @Nullable
    public final Object a() {
        return this.a;
    }

    @Nullable
    public final eb5 b() {
        return this.b;
    }

    @Nullable
    public final f05<Throwable, yq4> c() {
        return this.c;
    }

    @Nullable
    public final Object d() {
        return this.d;
    }

    @Nullable
    public final Throwable e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tb5) {
            tb5 tb5Var = (tb5) obj;
            return c25.g(this.a, tb5Var.a) && c25.g(this.b, tb5Var.b) && c25.g(this.c, tb5Var.c) && c25.g(this.d, tb5Var.d) && c25.g(this.e, tb5Var.e);
        }
        return false;
    }

    @NotNull
    public final tb5 f(@Nullable Object obj, @Nullable eb5 eb5Var, @Nullable f05<? super Throwable, yq4> f05Var, @Nullable Object obj2, @Nullable Throwable th) {
        return new tb5(obj, eb5Var, f05Var, obj2, th);
    }

    public final boolean h() {
        return this.e != null;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        eb5 eb5Var = this.b;
        int hashCode2 = (hashCode + (eb5Var == null ? 0 : eb5Var.hashCode())) * 31;
        f05<Throwable, yq4> f05Var = this.c;
        int hashCode3 = (hashCode2 + (f05Var == null ? 0 : f05Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@NotNull hb5<?> hb5Var, @NotNull Throwable th) {
        eb5 eb5Var = this.b;
        if (eb5Var != null) {
            hb5Var.l(eb5Var, th);
        }
        f05<Throwable, yq4> f05Var = this.c;
        if (f05Var == null) {
            return;
        }
        hb5Var.q(f05Var, th);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("CompletedContinuation(result=");
        G.append(this.a);
        G.append(", cancelHandler=");
        G.append(this.b);
        G.append(", onCancellation=");
        G.append(this.c);
        G.append(", idempotentResume=");
        G.append(this.d);
        G.append(", cancelCause=");
        G.append(this.e);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ tb5(Object obj, eb5 eb5Var, f05 f05Var, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : eb5Var, (i & 4) != 0 ? null : f05Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}