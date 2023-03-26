package com.p7700g.p99005;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: Source.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/xw5;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public interface xw5 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@NotNull sv5 sv5Var, long j) throws IOException;

    @NotNull
    zw5 timeout();
}