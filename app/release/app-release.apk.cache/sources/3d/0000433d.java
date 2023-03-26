package com.p7700g.p99005;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* compiled from: utf8.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/p7700g/p99005/sv5;", "", "a", "(Lcom/p7700g/p99005/sv5;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class fv5 {
    public static final boolean a(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$isProbablyUtf8");
        try {
            sv5 sv5Var2 = new sv5();
            sv5Var.X(sv5Var2, 0L, i55.v(sv5Var.z2(), 64L));
            for (int i = 0; i < 16; i++) {
                if (sv5Var2.f0()) {
                    return true;
                }
                int Y0 = sv5Var2.Y0();
                if (Character.isISOControl(Y0) && !Character.isWhitespace(Y0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}