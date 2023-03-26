package com.p7700g.p99005;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLog.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/p7700g/p99005/eu5;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lcom/p7700g/p99005/yq4;", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "<init>", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class eu5 extends Handler {
    public static final eu5 a = new eu5();

    private eu5() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord logRecord) {
        int b;
        c25.p(logRecord, "record");
        du5 du5Var = du5.d;
        String loggerName = logRecord.getLoggerName();
        c25.o(loggerName, "record.loggerName");
        b = fu5.b(logRecord);
        String message = logRecord.getMessage();
        c25.o(message, "record.message");
        du5Var.a(loggerName, b, message, logRecord.getThrown());
    }
}