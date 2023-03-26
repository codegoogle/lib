package com.p7700g.p99005;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: MessageInflater.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/p7700g/p99005/wu5;", "Ljava/io/Closeable;", "Lcom/p7700g/p99005/sv5;", "buffer", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/sv5;)V", com.anythink.expressad.foundation.d.c.cd, "()V", "Lcom/p7700g/p99005/hw5;", "u", "Lcom/p7700g/p99005/hw5;", "inflaterSource", "Ljava/util/zip/Inflater;", "t", "Ljava/util/zip/Inflater;", "inflater", "s", "Lcom/p7700g/p99005/sv5;", "deflatedBytes", "", com.ironsource.sdk.controller.v.a, "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class wu5 implements Closeable {
    private final sv5 s;
    private final Inflater t;
    private final hw5 u;
    private final boolean v;

    public wu5(boolean z) {
        this.v = z;
        sv5 sv5Var = new sv5();
        this.s = sv5Var;
        Inflater inflater = new Inflater(true);
        this.t = inflater;
        this.u = new hw5((xw5) sv5Var, inflater);
    }

    public final void a(@NotNull sv5 sv5Var) throws IOException {
        c25.p(sv5Var, "buffer");
        if (this.s.z2() == 0) {
            if (this.v) {
                this.t.reset();
            }
            this.s.b1(sv5Var);
            this.s.S(65535);
            long z2 = this.s.z2() + this.t.getBytesRead();
            do {
                this.u.a(sv5Var, Long.MAX_VALUE);
            } while (this.t.getBytesRead() < z2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.u.close();
    }
}