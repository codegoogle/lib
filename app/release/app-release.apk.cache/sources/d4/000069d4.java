package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: FaultHidingSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/zr5;", "Lcom/p7700g/p99005/aw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "Lkotlin/Function1;", "Ljava/io/IOException;", "t", "Lcom/p7700g/p99005/f05;", "a", "()Lcom/p7700g/p99005/f05;", "onException", "", "s", "Z", "hasErrors", "Lcom/p7700g/p99005/vw5;", "delegate", "<init>", "(Lcom/p7700g/p99005/vw5;Lcom/p7700g/p99005/f05;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class zr5 extends aw5 {
    private boolean s;
    @NotNull
    private final f05<IOException, yq4> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zr5(@NotNull vw5 vw5Var, @NotNull f05<? super IOException, yq4> f05Var) {
        super(vw5Var);
        c25.p(vw5Var, "delegate");
        c25.p(f05Var, "onException");
        this.t = f05Var;
    }

    @NotNull
    public final f05<IOException, yq4> a() {
        return this.t;
    }

    @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.s) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.s = true;
            this.t.M(e);
        }
    }

    @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
        if (this.s) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.s = true;
            this.t.M(e);
        }
    }

    @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, rs2.f.b);
        if (this.s) {
            sv5Var.skip(j);
            return;
        }
        try {
            super.write(sv5Var, j);
        } catch (IOException e) {
            this.s = true;
            this.t.M(e);
        }
    }
}