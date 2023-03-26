package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealResponseBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/p7700g/p99005/ys5;", "Lcom/p7700g/p99005/kr5;", "", "j", "()J", "Lcom/p7700g/p99005/br5;", "k", "()Lcom/p7700g/p99005/br5;", "Lcom/p7700g/p99005/uv5;", bx.B4, "()Lcom/p7700g/p99005/uv5;", "w", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", "u", "Ljava/lang/String;", "contentTypeString", com.ironsource.sdk.controller.v.a, "J", "contentLength", "<init>", "(Ljava/lang/String;JLcom/p7700g/p99005/uv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ys5 extends kr5 {
    private final String u;
    private final long v;
    private final uv5 w;

    public ys5(@Nullable String str, long j, @NotNull uv5 uv5Var) {
        c25.p(uv5Var, rs2.f.b);
        this.u = str;
        this.v = j;
        this.w = uv5Var;
    }

    @Override // com.p7700g.p99005.kr5
    @NotNull
    public uv5 A() {
        return this.w;
    }

    @Override // com.p7700g.p99005.kr5
    public long j() {
        return this.v;
    }

    @Override // com.p7700g.p99005.kr5
    @Nullable
    public br5 k() {
        String str = this.u;
        if (str != null) {
            return br5.e.d(str);
        }
        return null;
    }
}