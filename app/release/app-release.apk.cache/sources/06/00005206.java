package com.p7700g.p99005;

import android.content.Context;
import com.google.android.gms.security.ProviderInstaller;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class na3 implements m73 {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final na3 t = b.a.a();
    @Nullable
    private u43 u;
    @Nullable
    private Context v;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final na3 a() {
            return na3.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final na3 b = new na3(null);

        private b() {
        }

        @NotNull
        public final na3 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends n53 {
        public c(z43 z43Var) {
            super(null, z43Var);
        }

        @Override // com.p7700g.p99005.n53
        @NotNull
        public HttpURLConnection g(@NotNull URL url) throws IOException {
            c25.p(url, "url");
            HttpURLConnection g = super.g(url);
            g.setInstanceFollowRedirects(true);
            c25.o(g, "connection");
            return g;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends n53 {
        @Override // com.p7700g.p99005.n53
        @NotNull
        public HttpURLConnection g(@NotNull URL url) throws IOException {
            c25.p(url, "url");
            HttpURLConnection g = super.g(url);
            g.setInstanceFollowRedirects(true);
            c25.o(g, "connection");
            return g;
        }
    }

    private na3() {
        GreedyGameAds.a.addInternalDestroyListener$com_greedygame_sdkx_core(this);
    }

    public /* synthetic */ na3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(t43 t43Var) {
        return true;
    }

    private final boolean f() {
        try {
            Class.forName("com.google.android.gms.security.ProviderInstaller");
            ProviderInstaller.installIfNeeded(this.v);
            xz2.c("NetworkManager", "Auth provider found");
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private final void g() {
        Context context;
        if (this.u != null || (context = this.v) == null) {
            return;
        }
        if (0 == 0) {
            this.u = q53.c(context, new d());
        } else {
            this.u = q53.c(context, null);
        }
    }

    public final void a() {
        AppConfig r;
        if (this.v == null) {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            Context context = null;
            if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
                context = r.e();
            }
            this.v = context;
            g();
        }
    }

    public final void b(@NotNull Context context) {
        c25.p(context, "context");
        this.u = null;
        this.v = context;
        g();
    }

    public final void c(@NotNull t43<?> t43Var) {
        c25.p(t43Var, "request");
        u43 u43Var = this.u;
        if (u43Var == null) {
            xz2.c("NetworkManager", "Network Queue is not initialized yet");
            return;
        }
        if (u43Var != null) {
            u43Var.a(t43Var);
        }
        xz2.c("NetworkManager", "Network Request added to queue");
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        u43 u43Var = this.u;
        if (u43Var == null) {
            return;
        }
        u43Var.c(c73.a);
    }
}