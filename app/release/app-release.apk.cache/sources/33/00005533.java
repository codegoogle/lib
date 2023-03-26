package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import org.jetbrains.annotations.NotNull;

/* compiled from: PeekSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/p7700g/p99005/ow5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "w", "J", "pos", "Lcom/p7700g/p99005/sw5;", "t", "Lcom/p7700g/p99005/sw5;", "expectedSegment", "Lcom/p7700g/p99005/uv5;", "x", "Lcom/p7700g/p99005/uv5;", "upstream", "", com.ironsource.sdk.controller.v.a, "Z", "closed", "s", "Lcom/p7700g/p99005/sv5;", "buffer", "", "u", AFHydra.STATUS_IDLE, "expectedPos", "<init>", "(Lcom/p7700g/p99005/uv5;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ow5 implements xw5 {
    private final sv5 s;
    private sw5 t;
    private int u;
    private boolean v;
    private long w;
    private final uv5 x;

    public ow5(@NotNull uv5 uv5Var) {
        c25.p(uv5Var, "upstream");
        this.x = uv5Var;
        sv5 o = uv5Var.o();
        this.s = o;
        sw5 sw5Var = o.s;
        this.t = sw5Var;
        this.u = sw5Var != null ? sw5Var.e : -1;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r4 == r5.e) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // com.p7700g.p99005.xw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(@NotNull sv5 sv5Var, long j) {
        sw5 sw5Var;
        c25.p(sv5Var, "sink");
        boolean z = false;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.v) {
                sw5 sw5Var2 = this.t;
                if (sw5Var2 != null) {
                    sw5 sw5Var3 = this.s.s;
                    if (sw5Var2 == sw5Var3) {
                        int i2 = this.u;
                        c25.m(sw5Var3);
                    }
                    if (z) {
                        throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
                    }
                    if (i == 0) {
                        return 0L;
                    }
                    if (this.x.i1(this.w + 1)) {
                        if (this.t == null && (sw5Var = this.s.s) != null) {
                            this.t = sw5Var;
                            c25.m(sw5Var);
                            this.u = sw5Var.e;
                        }
                        long min = Math.min(j, this.s.z2() - this.w);
                        this.s.X(sv5Var, this.w, min);
                        this.w += min;
                        return min;
                    }
                    return -1L;
                }
                z = true;
                if (z) {
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        } else {
            throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
        }
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return this.x.timeout();
    }
}