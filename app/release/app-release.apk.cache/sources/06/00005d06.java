package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkStatusObserver.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0005-./\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\tJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tJ\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR'\u0010!\u001a\u00060\u001cR\u00020\u00008F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010\t\u001a\u0004\b\u001d\u0010\u001fR'\u0010'\u001a\u00060\"R\u00020\u00008F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b&\u0010\t\u001a\u0004\b$\u0010%R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u00060"}, d2 = {"Lcom/p7700g/p99005/sz2;", "", "Lcom/p7700g/p99005/sz2$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/p7700g/p99005/yq4;", "e", "(Lcom/p7700g/p99005/sz2$b;)V", "q", "l", "()V", "", com.anythink.basead.d.g.i, "()Z", "r", "p", "f", "d", "n", ij3.b, "Landroid/content/Context;", "context", com.anythink.expressad.d.a.b.dH, "(Landroid/content/Context;)Z", "Lcom/p7700g/p99005/sz2$d;", "Lcom/p7700g/p99005/sz2$d;", "networkState", "Landroid/content/Context;", "mContext", "Lcom/p7700g/p99005/sz2$c;", "h", "Lcom/p7700g/p99005/qo4;", "()Lcom/p7700g/p99005/sz2$c;", "getMNetworkObserver$annotations", "mNetworkObserver", "Lcom/p7700g/p99005/sz2$e;", "i", "j", "()Lcom/p7700g/p99005/sz2$e;", "getMNetworkStatsBroadcastReceiver$annotations", "mNetworkStatsBroadcastReceiver", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listenersList", "<init>", "(Landroid/content/Context;)V", "a", "b", "c", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class sz2 {
    @NotNull
    public static final String b = "NetworkStatusObserver";
    @Nullable
    private static sz2 c;
    @NotNull
    private final Context e;
    @NotNull
    private d f;
    @NotNull
    private final CopyOnWriteArraySet<b> g;
    @NotNull
    private final qo4 h;
    @NotNull
    private final qo4 i;
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final Object d = new Object();

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/sz2$a", "", "Lcom/p7700g/p99005/sz2;", "a", "()Lcom/p7700g/p99005/sz2;", "Landroid/content/Context;", "context", "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "mLock", "Ljava/lang/Object;", "networkStatusObserver", "Lcom/p7700g/p99005/sz2;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final sz2 a() {
            return sz2.c;
        }

        public final void b(@NotNull Context context) {
            c25.p(context, "context");
            synchronized (sz2.d) {
                if (sz2.c == null) {
                    a aVar = sz2.a;
                    sz2.c = new sz2(context, null);
                }
                yq4 yq4Var = yq4.a;
            }
        }
    }

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p7700g/p99005/sz2$b", "", "Lcom/p7700g/p99005/yq4;", "x", "()V", "u", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface b {
        void u();

        void x();
    }

    /* compiled from: NetworkStatusObserver.kt */
    @e2(21)
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"com/p7700g/p99005/sz2$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lcom/p7700g/p99005/yq4;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "<init>", "(Lcom/p7700g/p99005/sz2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public final class c extends ConnectivityManager.NetworkCallback {
        public final /* synthetic */ sz2 a;

        public c(sz2 sz2Var) {
            c25.p(sz2Var, "this$0");
            this.a = sz2Var;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            c25.p(network, "network");
            this.a.n();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            c25.p(network, "network");
            this.a.o();
        }
    }

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/sz2$d", "", "Lcom/p7700g/p99005/sz2$d;", "<init>", "(Ljava/lang/String;I)V", qh3.u, "DISCONNECTED", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public enum d {
        CONNECTED,
        DISCONNECTED
    }

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"com/p7700g/p99005/sz2$e", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/p7700g/p99005/yq4;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lcom/p7700g/p99005/sz2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public final class e extends BroadcastReceiver {
        public final /* synthetic */ sz2 a;

        public e(sz2 sz2Var) {
            c25.p(sz2Var, "this$0");
            this.a = sz2Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (context == null) {
                return;
            }
            sz2 sz2Var = this.a;
            if (sz2Var.m(context)) {
                sz2Var.n();
            } else {
                sz2Var.o();
            }
        }
    }

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/p7700g/p99005/sz2$c;", "Lcom/p7700g/p99005/sz2;", "<anonymous>", "()Lcom/p7700g/p99005/sz2$c;"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class f extends e25 implements uz4<c> {
        public f() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final c x() {
            return new c(sz2.this);
        }
    }

    /* compiled from: NetworkStatusObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/p7700g/p99005/sz2$e;", "Lcom/p7700g/p99005/sz2;", "<anonymous>", "()Lcom/p7700g/p99005/sz2$e;"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class g extends e25 implements uz4<e> {
        public g() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final e x() {
            return new e(sz2.this);
        }
    }

    private sz2(Context context) {
        this.e = context;
        this.f = d.DISCONNECTED;
        this.g = new CopyOnWriteArraySet<>();
        this.h = so4.c(new f());
        this.i = so4.c(new g());
        l();
    }

    public /* synthetic */ sz2(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @r2(otherwise = 2)
    public static /* synthetic */ void i() {
    }

    @r2(otherwise = 2)
    public static /* synthetic */ void k() {
    }

    @r2(otherwise = 2)
    public final void d() {
        IntentFilter intentFilter = new IntentFilter(b91.a);
        xz2.c(b, "Registering Network status broadcast receiver");
        this.e.registerReceiver(j(), intentFilter);
    }

    public final void e(@NotNull b bVar) {
        c25.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.g.add(bVar);
        if (this.f == d.CONNECTED) {
            bVar.x();
        } else {
            bVar.u();
        }
    }

    @e2(24)
    @r2(otherwise = 2)
    public final void f() {
        Object systemService = this.e.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(h());
    }

    @r2(otherwise = 2)
    public final boolean g() {
        c = null;
        if (Build.VERSION.SDK_INT >= 24) {
            return r();
        }
        return p();
    }

    @NotNull
    public final c h() {
        return (c) this.h.getValue();
    }

    @NotNull
    public final e j() {
        return (e) this.i.getValue();
    }

    @r2(otherwise = 2)
    public final void l() {
        if (Build.VERSION.SDK_INT >= 24) {
            f();
        } else {
            d();
        }
    }

    @r2(otherwise = 2)
    public final boolean m(@NotNull Context context) {
        c25.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void n() {
        this.f = d.CONNECTED;
        for (b bVar : this.g) {
            bVar.x();
        }
    }

    public final void o() {
        this.f = d.DISCONNECTED;
        for (b bVar : this.g) {
            bVar.u();
        }
    }

    @r2(otherwise = 2)
    public final boolean p() {
        xz2.c(b, "Registering Network status broadcast receiver");
        try {
            this.e.unregisterReceiver(j());
            return true;
        } catch (Exception unused) {
            xz2.c(b, "Failed to remove network broadcast receiver");
            return false;
        }
    }

    public final void q(@NotNull b bVar) {
        c25.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.g.remove(bVar);
    }

    @e2(24)
    @r2(otherwise = 2)
    public final boolean r() {
        try {
            Object systemService = this.e.getSystemService("connectivity");
            if (systemService != null) {
                ((ConnectivityManager) systemService).unregisterNetworkCallback(h());
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception e2) {
            xz2.c(b, c25.C("Exception while removing network observer ", e2));
            return false;
        }
    }
}