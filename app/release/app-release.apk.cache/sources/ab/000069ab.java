package com.p7700g.p99005;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJVM.kt */
@vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", b31.u, "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class zp4<T> implements qo4<T>, Serializable {
    @Nullable
    private uz4<? extends T> s;
    @Nullable
    private volatile Object t;
    @NotNull
    private final Object u;

    public zp4(@NotNull uz4<? extends T> uz4Var, @Nullable Object obj) {
        c25.p(uz4Var, "initializer");
        this.s = uz4Var;
        this.t = rq4.a;
        this.u = obj == null ? this : obj;
    }

    private final Object f() {
        return new ko4(getValue());
    }

    @Override // com.p7700g.p99005.qo4
    public T getValue() {
        T t;
        T t2 = (T) this.t;
        rq4 rq4Var = rq4.a;
        if (t2 != rq4Var) {
            return t2;
        }
        synchronized (this.u) {
            t = (T) this.t;
            if (t == rq4Var) {
                uz4<? extends T> uz4Var = this.s;
                c25.m(uz4Var);
                t = uz4Var.x();
                this.t = t;
                this.s = null;
            }
        }
        return t;
    }

    @Override // com.p7700g.p99005.qo4
    public boolean isInitialized() {
        return this.t != rq4.a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ zp4(uz4 uz4Var, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uz4Var, (i & 2) != 0 ? null : obj);
    }
}