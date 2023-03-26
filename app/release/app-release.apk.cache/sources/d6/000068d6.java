package com.p7700g.p99005;

import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class za3 extends ua3 {
    @NotNull
    private final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za3(@NotNull Throwable th) {
        super(l23.STACK_TRACE);
        c25.p(th, "throwable");
        this.b = th;
    }

    private final String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            th2.printStackTrace(printWriter);
        }
        String stringWriter2 = stringWriter.toString();
        c25.o(stringWriter2, "result.toString()");
        printWriter.close();
        if (TextUtils.isEmpty(stringWriter2)) {
            c25.m(th);
            String localizedMessage = th.getLocalizedMessage();
            c25.o(localizedMessage, "th!!.localizedMessage");
            return localizedMessage;
        }
        return stringWriter2;
    }

    @Override // com.p7700g.p99005.ua3
    @NotNull
    public db3 a(@NotNull l23 l23Var) {
        c25.p(l23Var, "reportField");
        return new fb3(d(this.b));
    }
}