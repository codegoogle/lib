package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.jr5;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExchangeCodec.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rR\u0016\u0010\"\u001a\u00020\u001f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/us5;", "", "Lcom/p7700g/p99005/hr5;", "request", "", "contentLength", "Lcom/p7700g/p99005/vw5;", "i", "(Lcom/p7700g/p99005/hr5;J)Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/hr5;)V", "f", "()V", "a", "", "expectContinue", "Lcom/p7700g/p99005/jr5$a;", "d", "(Z)Lcom/p7700g/p99005/jr5$a;", "Lcom/p7700g/p99005/jr5;", "response", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/jr5;)J", "Lcom/p7700g/p99005/xw5;", "c", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq5;", "h", "()Lcom/p7700g/p99005/yq5;", com.anythink.expressad.d.a.b.dO, "Lcom/p7700g/p99005/ls5;", "e", "()Lcom/p7700g/p99005/ls5;", "connection", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface us5 {
    public static final a a = a.b;
    public static final int b = 100;

    /* compiled from: ExchangeCodec.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/p7700g/p99005/us5$a", "", "", "a", AFHydra.STATUS_IDLE, "DISCARD_STREAM_TIMEOUT_MILLIS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final int a = 100;
        public static final /* synthetic */ a b = new a();

        private a() {
        }
    }

    void a() throws IOException;

    void b(@NotNull hr5 hr5Var) throws IOException;

    @NotNull
    xw5 c(@NotNull jr5 jr5Var) throws IOException;

    void cancel();

    @Nullable
    jr5.a d(boolean z) throws IOException;

    @NotNull
    ls5 e();

    void f() throws IOException;

    long g(@NotNull jr5 jr5Var) throws IOException;

    @NotNull
    yq5 h() throws IOException;

    @NotNull
    vw5 i(@NotNull hr5 hr5Var, long j) throws IOException;
}