package com.p7700g.p99005;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dns.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/p7700g/p99005/uq5;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface uq5 {
    public static final a b = new a(null);
    @cz4
    @NotNull
    public static final uq5 a = new a.C0257a();

    /* compiled from: Dns.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"com/p7700g/p99005/uq5$a", "", "Lcom/p7700g/p99005/uq5;", "SYSTEM", "Lcom/p7700g/p99005/uq5;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = null;

        /* compiled from: Dns.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/p7700g/p99005/uq5$a$a", "Lcom/p7700g/p99005/uq5;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.uq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0257a implements uq5 {
            @Override // com.p7700g.p99005.uq5
            @NotNull
            public List<InetAddress> a(@NotNull String str) {
                c25.p(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    c25.o(allByName, "InetAddress.getAllByName(hostname)");
                    return as4.iz(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(wo1.t("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    List<InetAddress> a(@NotNull String str) throws UnknownHostException;
}