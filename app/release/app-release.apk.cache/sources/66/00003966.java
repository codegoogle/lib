package com.p7700g.p99005;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interceptor.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/p7700g/p99005/ar5;", "", "Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface ar5 {
    public static final b a = b.a;

    /* compiled from: Interceptor.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH&¢\u0006\u0004\b\u0018\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\b\u001a\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"com/p7700g/p99005/ar5$a", "", "Lcom/p7700g/p99005/hr5;", "x0", "()Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/jr5;", "e", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/mq5;", "f", "()Lcom/p7700g/p99005/mq5;", "Lcom/p7700g/p99005/hq5;", kg.p0, "()Lcom/p7700g/p99005/hq5;", "", "h", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "Lcom/p7700g/p99005/ar5$a;", "d", "(ILjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/ar5$a;", "b", com.anythink.basead.d.g.i, "c", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        @NotNull
        a a(int i, @NotNull TimeUnit timeUnit);

        int b();

        int c();

        @NotNull
        hq5 call();

        @NotNull
        a d(int i, @NotNull TimeUnit timeUnit);

        @NotNull
        jr5 e(@NotNull hr5 hr5Var) throws IOException;

        @Nullable
        mq5 f();

        @NotNull
        a g(int i, @NotNull TimeUnit timeUnit);

        int h();

        @NotNull
        hr5 x0();
    }

    /* compiled from: Interceptor.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ8\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\nø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/ar5$b", "", "Lkotlin/Function1;", "Lcom/p7700g/p99005/ar5$a;", "Lcom/p7700g/p99005/ip4;", "name", "chain", "Lcom/p7700g/p99005/jr5;", "block", "Lcom/p7700g/p99005/ar5;", "a", "(Lcom/p7700g/p99005/f05;)Lcom/p7700g/p99005/ar5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        public static final /* synthetic */ b a = new b();

        /* compiled from: Interceptor.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/p7700g/p99005/ar5$a;", "it", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a implements ar5 {
            public final /* synthetic */ f05 b;

            public a(f05 f05Var) {
                this.b = f05Var;
            }

            @Override // com.p7700g.p99005.ar5
            @NotNull
            public final jr5 a(@NotNull a aVar) {
                c25.p(aVar, "it");
                return (jr5) this.b.M(aVar);
            }
        }

        private b() {
        }

        @NotNull
        public final ar5 a(@NotNull f05<? super a, jr5> f05Var) {
            c25.p(f05Var, "block");
            return new a(f05Var);
        }
    }

    @NotNull
    jr5 a(@NotNull a aVar) throws IOException;
}