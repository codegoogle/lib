package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineStart.kt */
@vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\\\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum nc5 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            nc5.values();
            int[] iArr = new int[4];
            iArr[nc5.DEFAULT.ordinal()] = 1;
            iArr[nc5.ATOMIC.ordinal()] = 2;
            iArr[nc5.UNDISPATCHED.ordinal()] = 3;
            iArr[nc5.LAZY.ordinal()] = 4;
            a = iArr;
        }
    }

    @zd5
    public static /* synthetic */ void m() {
    }

    @zd5
    public final <T> void g(@NotNull f05<? super uv4<? super T>, ? extends Object> f05Var, @NotNull uv4<? super T> uv4Var) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            on5.d(f05Var, uv4Var);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                wv4.h(f05Var, uv4Var);
            } else if (ordinal == 3) {
                pn5.a(f05Var, uv4Var);
            } else {
                throw new wo4();
            }
        }
    }

    @zd5
    public final <R, T> void h(@NotNull j05<? super R, ? super uv4<? super T>, ? extends Object> j05Var, R r, @NotNull uv4<? super T> uv4Var) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            on5.f(j05Var, r, uv4Var, null, 4, null);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                wv4.i(j05Var, r, uv4Var);
            } else if (ordinal == 3) {
                pn5.b(j05Var, r, uv4Var);
            } else {
                throw new wo4();
            }
        }
    }

    public final boolean i() {
        return this == LAZY;
    }
}