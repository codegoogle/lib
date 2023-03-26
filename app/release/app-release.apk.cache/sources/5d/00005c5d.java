package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJVM.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes3.dex */
public class so4 {

    /* compiled from: LazyJVM.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            uo4.values();
            int[] iArr = new int[3];
            iArr[uo4.SYNCHRONIZED.ordinal()] = 1;
            iArr[uo4.PUBLICATION.ordinal()] = 2;
            iArr[uo4.NONE.ordinal()] = 3;
            a = iArr;
        }
    }

    @NotNull
    public static final <T> qo4<T> a(@Nullable Object obj, @NotNull uz4<? extends T> uz4Var) {
        c25.p(uz4Var, "initializer");
        return new zp4(uz4Var, obj);
    }

    @NotNull
    public static final <T> qo4<T> b(@NotNull uo4 uo4Var, @NotNull uz4<? extends T> uz4Var) {
        c25.p(uo4Var, "mode");
        c25.p(uz4Var, "initializer");
        int ordinal = uo4Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new zq4(uz4Var);
                }
                throw new wo4();
            }
            return new sp4(uz4Var);
        }
        return new zp4(uz4Var, null, 2, null);
    }

    @NotNull
    public static final <T> qo4<T> c(@NotNull uz4<? extends T> uz4Var) {
        c25.p(uz4Var, "initializer");
        return new zp4(uz4Var, null, 2, null);
    }
}