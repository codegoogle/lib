package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.yq5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HeadersReader.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/p7700g/p99005/ct5;", "", "", "c", "()Ljava/lang/String;", "Lcom/p7700g/p99005/yq5;", "b", "()Lcom/p7700g/p99005/yq5;", "", "J", "headerLimit", "Lcom/p7700g/p99005/uv5;", "d", "Lcom/p7700g/p99005/uv5;", "a", "()Lcom/p7700g/p99005/uv5;", rs2.f.b, "<init>", "(Lcom/p7700g/p99005/uv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ct5 {
    private static final int a = 262144;
    public static final a b = new a(null);
    private long c;
    @NotNull
    private final uv5 d;

    /* compiled from: HeadersReader.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/ct5$a", "", "", "HEADER_LIMIT", AFHydra.STATUS_IDLE, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ct5(@NotNull uv5 uv5Var) {
        c25.p(uv5Var, rs2.f.b);
        this.d = uv5Var;
        this.c = 262144;
    }

    @NotNull
    public final uv5 a() {
        return this.d;
    }

    @NotNull
    public final yq5 b() {
        yq5.a aVar = new yq5.a();
        while (true) {
            String c = c();
            if (c.length() == 0) {
                return aVar.i();
            }
            aVar.f(c);
        }
    }

    @NotNull
    public final String c() {
        String t0 = this.d.t0(this.c);
        this.c -= t0.length();
        return t0;
    }
}