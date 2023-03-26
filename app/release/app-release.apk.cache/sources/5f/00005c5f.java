package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WhileSelect.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"whileSelect", "", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class so5 {

    /* compiled from: WhileSelect.kt */
    @mw4(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            return so5.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:25:0x0059). Please submit an issue!!! */
    @com.p7700g.p99005.td5
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull com.p7700g.p99005.f05<? super com.p7700g.p99005.io5<? super java.lang.Boolean>, com.p7700g.p99005.yq4> r4, @org.jetbrains.annotations.NotNull com.p7700g.p99005.uv4<? super com.p7700g.p99005.yq4> r5) {
        /*
            boolean r0 = r5 instanceof com.p7700g.p99005.so5.a
            if (r0 == 0) goto L13
            r0 = r5
            com.p7700g.p99005.so5$a r0 = (com.p7700g.p99005.so5.a) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            com.p7700g.p99005.so5$a r0 = new com.p7700g.p99005.so5$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.w
            java.lang.Object r1 = com.p7700g.p99005.gw4.h()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.v
            com.p7700g.p99005.f05 r4 = (com.p7700g.p99005.f05) r4
            com.p7700g.p99005.rp4.n(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.p7700g.p99005.rp4.n(r5)
        L38:
            r0.v = r4
            r0.x = r3
            com.p7700g.p99005.jo5 r5 = new com.p7700g.p99005.jo5
            r5.<init>(r0)
            r4.M(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.M0(r2)
        L49:
            java.lang.Object r5 = r5.L0()
            java.lang.Object r2 = com.p7700g.p99005.gw4.h()
            if (r5 != r2) goto L56
            com.p7700g.p99005.ow4.c(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L62
            goto L38
        L62:
            com.p7700g.p99005.yq4 r4 = com.p7700g.p99005.yq4.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p7700g.p99005.so5.a(com.p7700g.p99005.f05, com.p7700g.p99005.uv4):java.lang.Object");
    }

    @td5
    private static final Object b(f05<? super io5<? super Boolean>, yq4> f05Var, uv4<? super yq4> uv4Var) {
        Object L0;
        do {
            z15.e(0);
            jo5 jo5Var = new jo5(uv4Var);
            try {
                f05Var.M(jo5Var);
            } catch (Throwable th) {
                jo5Var.M0(th);
            }
            L0 = jo5Var.L0();
            if (L0 == gw4.h()) {
                ow4.c(uv4Var);
            }
            z15.e(1);
        } while (((Boolean) L0).booleanValue());
        return yq4.a;
    }
}