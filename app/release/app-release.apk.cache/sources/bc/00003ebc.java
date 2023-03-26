package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.rs2;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebuggerInfo.kt */
@np4
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", rs2.f.b, "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "coroutineId", "", "getCoroutineId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "dispatcher", "", "getDispatcher", "()Ljava/lang/String;", "lastObservedStackTrace", "", "Ljava/lang/StackTraceElement;", "getLastObservedStackTrace", "()Ljava/util/List;", "lastObservedThreadName", "getLastObservedThreadName", "lastObservedThreadState", "getLastObservedThreadState", "name", "getName", "sequenceNumber", "getSequenceNumber", "()J", CallMraidJS.b, "getState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class di5 implements Serializable {
    @Nullable
    private final Long s;
    @Nullable
    private final String t;
    @Nullable
    private final String u;
    @NotNull
    private final String v;
    @Nullable
    private final String w;
    @Nullable
    private final String x;
    @NotNull
    private final List<StackTraceElement> y;
    private final long z;

    public di5(@NotNull yh5 yh5Var, @NotNull xv4 xv4Var) {
        Thread.State state;
        ic5 ic5Var = (ic5) xv4Var.get(ic5.s);
        this.s = ic5Var == null ? null : Long.valueOf(ic5Var.z());
        vv4 vv4Var = (vv4) xv4Var.get(vv4.k0);
        this.t = vv4Var == null ? null : vv4Var.toString();
        kc5 kc5Var = (kc5) xv4Var.get(kc5.s);
        this.u = kc5Var == null ? null : kc5Var.z();
        this.v = yh5Var.g();
        Thread thread = yh5Var.e;
        this.w = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = yh5Var.e;
        this.x = thread2 != null ? thread2.getName() : null;
        this.y = yh5Var.h();
        this.z = yh5Var.b;
    }

    @Nullable
    public final Long f() {
        return this.s;
    }

    @Nullable
    public final String g() {
        return this.t;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        return this.y;
    }

    @Nullable
    public final String i() {
        return this.x;
    }

    @Nullable
    public final String m() {
        return this.w;
    }

    @Nullable
    public final String n() {
        return this.u;
    }

    public final long o() {
        return this.z;
    }

    @NotNull
    public final String p() {
        return this.v;
    }
}