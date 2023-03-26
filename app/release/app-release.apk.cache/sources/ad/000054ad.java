package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Select.kt */
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u001f\b\u0004\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0017\u001aN\u0010\u0018\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"ALREADY_SELECTED", "", "getALREADY_SELECTED$annotations", "()V", "getALREADY_SELECTED", "()Ljava/lang/Object;", "NOT_SELECTED", "getNOT_SELECTED$annotations", "getNOT_SELECTED", "RESUMED", "getRESUMED$annotations", "UNDECIDED", "getUNDECIDED$annotations", "selectOpSequenceNumber", "Lkotlinx/coroutines/selects/SeqNumber;", "getSelectOpSequenceNumber$annotations", "select", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTimeout", "timeout", "Lkotlin/time/Duration;", "block", "Lkotlin/coroutines/Continuation;", "onTimeout-8Mi8wO0", "(Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class oo5 {
    @NotNull
    private static final Object a = new an5("NOT_SELECTED");
    @NotNull
    private static final Object b = new an5("ALREADY_SELECTED");
    @NotNull
    private static final Object c = new an5("UNDECIDED");
    @NotNull
    private static final Object d = new an5("RESUMED");
    @NotNull
    private static final qo5 e = new qo5();

    public static final /* synthetic */ Object a() {
        return d;
    }

    public static final /* synthetic */ qo5 b() {
        return e;
    }

    public static final /* synthetic */ Object c() {
        return c;
    }

    @NotNull
    public static final Object d() {
        return b;
    }

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final Object f() {
        return a;
    }

    public static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @td5
    public static final <R> void k(@NotNull io5<? super R> io5Var, long j, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        io5Var.z(wc5.e(j), f05Var);
    }

    @Nullable
    public static final <R> Object l(@NotNull f05<? super io5<? super R>, yq4> f05Var, @NotNull uv4<? super R> uv4Var) {
        jo5 jo5Var = new jo5(uv4Var);
        try {
            f05Var.M(jo5Var);
        } catch (Throwable th) {
            jo5Var.M0(th);
        }
        Object L0 = jo5Var.L0();
        if (L0 == gw4.h()) {
            ow4.c(uv4Var);
        }
        return L0;
    }

    private static final <R> Object m(f05<? super io5<? super R>, yq4> f05Var, uv4<? super R> uv4Var) {
        z15.e(0);
        jo5 jo5Var = new jo5(uv4Var);
        try {
            f05Var.M(jo5Var);
        } catch (Throwable th) {
            jo5Var.M0(th);
        }
        Object L0 = jo5Var.L0();
        if (L0 == gw4.h()) {
            ow4.c(uv4Var);
        }
        z15.e(1);
        return L0;
    }
}