package com.p7700g.p99005;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CookieJar.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/p7700g/p99005/rq5;", "", "Lcom/p7700g/p99005/zq5;", "url", "", "Lcom/p7700g/p99005/pq5;", "cookies", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/zq5;Ljava/util/List;)V", "b", "(Lcom/p7700g/p99005/zq5;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface rq5 {
    public static final a b = new a(null);
    @cz4
    @NotNull
    public static final rq5 a = new a.C0237a();

    /* compiled from: CookieJar.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"com/p7700g/p99005/rq5$a", "", "Lcom/p7700g/p99005/rq5;", "NO_COOKIES", "Lcom/p7700g/p99005/rq5;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = null;

        /* compiled from: CookieJar.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/rq5$a$a", "Lcom/p7700g/p99005/rq5;", "Lcom/p7700g/p99005/zq5;", "url", "", "Lcom/p7700g/p99005/pq5;", "cookies", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/zq5;Ljava/util/List;)V", "b", "(Lcom/p7700g/p99005/zq5;)Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.rq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0237a implements rq5 {
            @Override // com.p7700g.p99005.rq5
            public void a(@NotNull zq5 zq5Var, @NotNull List<pq5> list) {
                c25.p(zq5Var, "url");
                c25.p(list, "cookies");
            }

            @Override // com.p7700g.p99005.rq5
            @NotNull
            public List<pq5> b(@NotNull zq5 zq5Var) {
                c25.p(zq5Var, "url");
                return js4.F();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(@NotNull zq5 zq5Var, @NotNull List<pq5> list);

    @NotNull
    List<pq5> b(@NotNull zq5 zq5Var);
}