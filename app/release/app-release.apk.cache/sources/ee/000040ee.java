package com.p7700g.p99005;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Authenticator.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/p7700g/p99005/eq5;", "", "Lcom/p7700g/p99005/lr5;", "route", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/hr5;", "a", "(Lcom/p7700g/p99005/lr5;Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/hr5;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface eq5 {
    public static final a c = new a(null);
    @cz4
    @NotNull
    public static final eq5 a = new a.C0170a();
    @cz4
    @NotNull
    public static final eq5 b = new ur5(null, 1, null);

    /* compiled from: Authenticator.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t"}, d2 = {"com/p7700g/p99005/eq5$a", "", "Lcom/p7700g/p99005/eq5;", "JAVA_NET_AUTHENTICATOR", "Lcom/p7700g/p99005/eq5;", "NONE", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = null;

        /* compiled from: Authenticator.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"com/p7700g/p99005/eq5$a$a", "Lcom/p7700g/p99005/eq5;", "Lcom/p7700g/p99005/lr5;", "route", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/hr5;", "a", "(Lcom/p7700g/p99005/lr5;Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/hr5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.eq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0170a implements eq5 {
            @Override // com.p7700g.p99005.eq5
            @Nullable
            public hr5 a(@Nullable lr5 lr5Var, @NotNull jr5 jr5Var) {
                c25.p(jr5Var, "response");
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    hr5 a(@Nullable lr5 lr5Var, @NotNull jr5 jr5Var) throws IOException;
}