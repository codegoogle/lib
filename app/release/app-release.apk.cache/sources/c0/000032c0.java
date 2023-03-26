package com.greedygame.core;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.e25;
import com.p7700g.p99005.f05;
import com.p7700g.p99005.f13;
import com.p7700g.p99005.g13;
import com.p7700g.p99005.h13;
import com.p7700g.p99005.h73;
import com.p7700g.p99005.hb3;
import com.p7700g.p99005.j23;
import com.p7700g.p99005.jc3;
import com.p7700g.p99005.jz4;
import com.p7700g.p99005.ky2;
import com.p7700g.p99005.s13;
import com.p7700g.p99005.t13;
import com.p7700g.p99005.uz4;
import com.p7700g.p99005.v13;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.y15;
import com.p7700g.p99005.yq4;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GreedyGameAds {
    @NotNull
    public static final String b = "GreedyGameAds";
    @Nullable
    private static GreedyGameAds d;
    private AppConfig f;
    public h73 g;
    @Nullable
    private j23 h;
    @Nullable
    private SoftReference<g13> j;
    @NotNull
    public static final Companion a = new Companion(null);
    @NotNull
    private static final Object c = new Object();
    @Nullable
    private static CopyOnWriteArraySet<SoftReference<f13>> e = new CopyOnWriteArraySet<>();
    @NotNull
    private v13 i = v13.UNINITIALIZED;
    @NotNull
    private CopyOnWriteArraySet<SoftReference<f13>> k = new CopyOnWriteArraySet<>();
    @NotNull
    private CopyOnWriteArraySet<WeakReference<f13>> l = new CopyOnWriteArraySet<>();
    @NotNull
    private CopyOnWriteArraySet<g13> m = new CopyOnWriteArraySet<>();

    @Keep
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public /* synthetic */ class a extends y15 implements uz4<yq4> {
            public final /* synthetic */ g13 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g13 g13Var) {
                super(0, c25.a.class, "onPrepared", "initWith$onPrepared(Lcom/greedygame/core/interfaces/GreedyGameAdsEventsListener;)V", 0);
                this.B = g13Var;
            }

            public final void a() {
                Companion.initWith$onPrepared(this.B);
            }

            @Override // com.p7700g.p99005.uz4
            public /* synthetic */ yq4 x() {
                a();
                return yq4.a;
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class b extends y15 implements f05<s13, yq4> {
            public final /* synthetic */ g13 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g13 g13Var) {
                super(1, c25.a.class, "onPreparationFailed", "initWith$onPreparationFailed(Lcom/greedygame/core/interfaces/GreedyGameAdsEventsListener;Lcom/greedygame/core/models/general/InitErrors;)V", 0);
                this.B = g13Var;
            }

            public final void K4(@NotNull s13 s13Var) {
                c25.p(s13Var, "p0");
                Companion.initWith$onPreparationFailed(this.B, s13Var);
            }

            @Override // com.p7700g.p99005.f05
            public /* synthetic */ yq4 M(s13 s13Var) {
                K4(s13Var);
                return yq4.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void initWith$default(Companion companion, AppConfig appConfig, g13 g13Var, int i, Object obj) {
            if ((i & 2) != 0) {
                g13Var = null;
            }
            companion.initWith(appConfig, g13Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initWith$onPreparationFailed(g13 g13Var, s13 s13Var) {
            if (g13Var == null) {
                return;
            }
            g13Var.a(s13Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initWith$onPrepared(g13 g13Var) {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null) {
                CopyOnWriteArraySet copyOnWriteArraySet = GreedyGameAds.e;
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet();
                }
                iNSTANCE$com_greedygame_sdkx_core.l(copyOnWriteArraySet);
            }
            GreedyGameAds.e = null;
            if (g13Var == null) {
                return;
            }
            g13Var.onInitSuccess();
        }

        @jz4
        public static /* synthetic */ void isSdkInitialized$annotations() {
        }

        @jz4
        public final void addDestroyEventListener(@NotNull f13 f13Var) {
            c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core == null) {
                return;
            }
            iNSTANCE$com_greedygame_sdkx_core.n(f13Var);
        }

        public final void addInternalDestroyListener$com_greedygame_sdkx_core(@NotNull f13 f13Var) {
            c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (!isSdkInitialized()) {
                CopyOnWriteArraySet copyOnWriteArraySet = GreedyGameAds.e;
                if (copyOnWriteArraySet == null) {
                    return;
                }
                copyOnWriteArraySet.add(new SoftReference(f13Var));
                return;
            }
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core == null) {
                return;
            }
            iNSTANCE$com_greedygame_sdkx_core.o(f13Var);
        }

        @jz4
        public final void destroy() {
            if (isSdkInitialized()) {
                GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = getINSTANCE$com_greedygame_sdkx_core();
                if (iNSTANCE$com_greedygame_sdkx_core != null) {
                    iNSTANCE$com_greedygame_sdkx_core.x();
                }
                GreedyGameAds.d = null;
            }
        }

        @Nullable
        public final GreedyGameAds getINSTANCE$com_greedygame_sdkx_core() {
            return GreedyGameAds.d;
        }

        @jz4
        public final void initWith(@NotNull AppConfig appConfig) {
            c25.p(appConfig, "appConfig");
            initWith(appConfig, null);
        }

        public final boolean isSdkInitialized() {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core == null) {
                return false;
            }
            return iNSTANCE$com_greedygame_sdkx_core.z();
        }

        @jz4
        public final void prefetchAds(@NotNull h13 h13Var, @NotNull t13... t13VarArr) {
            c25.p(h13Var, "prefetchAdsListener");
            c25.p(t13VarArr, "units");
            jc3.a.c(h13Var, (t13[]) Arrays.copyOf(t13VarArr, t13VarArr.length));
        }

        @jz4
        public final void removeDestroyEventListener(@NotNull f13 f13Var) {
            c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core == null) {
                return;
            }
            iNSTANCE$com_greedygame_sdkx_core.E(f13Var);
        }

        @jz4
        public final void initWith(@NotNull AppConfig appConfig, @Nullable g13 g13Var) {
            c25.p(appConfig, "appConfig");
            synchronized (GreedyGameAds.c) {
                if (appConfig.x()) {
                    Companion companion = GreedyGameAds.a;
                    if (companion.isSdkInitialized()) {
                        xz2.c(GreedyGameAds.b, "SDK Already initialized");
                        if (g13Var != null) {
                            g13Var.onInitSuccess();
                        }
                        return;
                    }
                    xz2.c(GreedyGameAds.b, "Initializing SDK");
                    a aVar = a.a;
                    aVar.a().f = appConfig;
                    GreedyGameAds.d = aVar.a();
                    GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
                    if (iNSTANCE$com_greedygame_sdkx_core != null) {
                        iNSTANCE$com_greedygame_sdkx_core.j = new SoftReference(g13Var);
                    }
                    GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
                    if (iNSTANCE$com_greedygame_sdkx_core2 != null) {
                        iNSTANCE$com_greedygame_sdkx_core2.C(new a(g13Var), new b(g13Var));
                        yq4 yq4Var = yq4.a;
                    }
                } else if (g13Var != null) {
                    g13Var.a(s13.EMPTY_APP_ID);
                    yq4 yq4Var2 = yq4.a;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();
        @NotNull
        private static final GreedyGameAds b = new GreedyGameAds();

        private a() {
        }

        @NotNull
        public final GreedyGameAds a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<yq4> {
        public final /* synthetic */ uz4<yq4> u;
        public final /* synthetic */ f05<s13, yq4> v;

        /* loaded from: classes3.dex */
        public static final class a implements h73.c {
            private final long a = System.currentTimeMillis();
            public final /* synthetic */ GreedyGameAds b;
            public final /* synthetic */ uz4<yq4> c;
            public final /* synthetic */ f05<s13, yq4> d;

            /* renamed from: com.greedygame.core.GreedyGameAds$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class RunnableC0103a implements Runnable {
                public final /* synthetic */ Object s;
                public final /* synthetic */ GreedyGameAds t;
                public final /* synthetic */ f05 u;
                public final /* synthetic */ s13 v;

                public RunnableC0103a(Object obj, GreedyGameAds greedyGameAds, f05 f05Var, s13 s13Var) {
                    this.s = obj;
                    this.t = greedyGameAds;
                    this.u = f05Var;
                    this.v = s13Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = (a) this.s;
                    for (g13 g13Var : this.t.m) {
                        g13Var.a(this.v);
                    }
                    this.u.M(this.v);
                }
            }

            /* renamed from: com.greedygame.core.GreedyGameAds$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class RunnableC0104b implements Runnable {
                public final /* synthetic */ Object s;
                public final /* synthetic */ uz4 t;
                public final /* synthetic */ GreedyGameAds u;

                public RunnableC0104b(Object obj, uz4 uz4Var, GreedyGameAds greedyGameAds) {
                    this.s = obj;
                    this.t = uz4Var;
                    this.u = greedyGameAds;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = (a) this.s;
                    this.t.x();
                    for (g13 g13Var : this.u.m) {
                        g13Var.onInitSuccess();
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(GreedyGameAds greedyGameAds, uz4<yq4> uz4Var, f05<? super s13, yq4> f05Var) {
                this.b = greedyGameAds;
                this.c = uz4Var;
                this.d = f05Var;
            }

            @Override // com.p7700g.p99005.h73.c
            public void a(@NotNull s13 s13Var) {
                c25.p(s13Var, "cause");
                this.b.I(v13.UNINITIALIZED);
                GreedyGameAds greedyGameAds = this.b;
                f05<s13, yq4> f05Var = this.d;
                if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                    for (g13 g13Var : greedyGameAds.m) {
                        g13Var.a(s13Var);
                    }
                    f05Var.M(s13Var);
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0103a(this, greedyGameAds, f05Var, s13Var));
            }

            @Override // com.p7700g.p99005.h73.c
            public void b() {
                this.b.I(v13.INITIALIZED);
                AppConfig r = this.b.r();
                r.y();
                r.D(System.currentTimeMillis() - c());
                hb3.a.a();
                uz4<yq4> uz4Var = this.c;
                GreedyGameAds greedyGameAds = this.b;
                if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                    uz4Var.x();
                    for (g13 g13Var : greedyGameAds.m) {
                        g13Var.onInitSuccess();
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0104b(this, uz4Var, greedyGameAds));
            }

            public final long c() {
                return this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(uz4<yq4> uz4Var, f05<? super s13, yq4> f05Var) {
            super(0);
            this.u = uz4Var;
            this.v = f05Var;
        }

        public final void a() {
            if (GreedyGameAds.this.r().j()) {
                GreedyGameAds.this.G(new j23(GreedyGameAds.this.r().e(), GreedyGameAds.this.r().f()));
            }
            GreedyGameAds.this.H(new h73.a().a(GreedyGameAds.this.r().r()).b());
            GreedyGameAds.this.t().e(new a(GreedyGameAds.this, this.u, this.v));
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    public GreedyGameAds() {
        xz2.d = "0.0.94";
    }

    @jz4
    public static final void B(@NotNull h13 h13Var, @NotNull t13... t13VarArr) {
        a.prefetchAds(h13Var, t13VarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(uz4<yq4> uz4Var, f05<? super s13, yq4> f05Var) {
        GreedyGameAds greedyGameAds = d;
        if (greedyGameAds != null) {
            greedyGameAds.i = v13.INITIALIZING;
        }
        ky2.a.a().h(new b(uz4Var, f05Var));
    }

    @jz4
    public static final void D(@NotNull f13 f13Var) {
        a.removeDestroyEventListener(f13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(CopyOnWriteArraySet<SoftReference<f13>> copyOnWriteArraySet) {
        this.k.addAll(copyOnWriteArraySet);
    }

    @jz4
    public static final void m(@NotNull f13 f13Var) {
        a.addDestroyEventListener(f13Var);
    }

    @jz4
    public static final void q() {
        a.destroy();
    }

    @jz4
    public static final void v(@NotNull AppConfig appConfig) {
        a.initWith(appConfig);
    }

    @jz4
    public static final void w(@NotNull AppConfig appConfig, @Nullable g13 g13Var) {
        a.initWith(appConfig, g13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        this.i = v13.UNINITIALIZED;
        this.h = null;
        r().c();
        Iterator<T> it = this.k.iterator();
        while (it.hasNext()) {
            f13 f13Var = (f13) ((SoftReference) it.next()).get();
            if (f13Var != null) {
                f13Var.z();
            }
        }
        Iterator<T> it2 = this.l.iterator();
        while (it2.hasNext()) {
            f13 f13Var2 = (f13) ((WeakReference) it2.next()).get();
            if (f13Var2 != null) {
                f13Var2.z();
            }
        }
    }

    public static final boolean y() {
        return a.isSdkInitialized();
    }

    public final boolean A() {
        return this.i == v13.INITIALIZING;
    }

    public final void E(@NotNull f13 f13Var) {
        c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Iterator<WeakReference<f13>> it = this.l.iterator();
        while (it.hasNext()) {
            WeakReference<f13> next = it.next();
            f13 f13Var2 = next.get();
            if (f13Var2 != null && c25.g(f13Var2, f13Var)) {
                this.l.remove(next);
                return;
            }
        }
    }

    public final void F(@NotNull g13 g13Var) {
        c25.p(g13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.m.remove(g13Var);
    }

    public final void G(@Nullable j23 j23Var) {
        this.h = j23Var;
    }

    public final void H(@NotNull h73 h73Var) {
        c25.p(h73Var, "<set-?>");
        this.g = h73Var;
    }

    public final void I(@NotNull v13 v13Var) {
        c25.p(v13Var, "<set-?>");
        this.i = v13Var;
    }

    public final void n(@NotNull f13 f13Var) {
        c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.l.add(new WeakReference<>(f13Var));
    }

    public final void o(@NotNull f13 f13Var) {
        c25.p(f13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.k.add(new SoftReference<>(f13Var));
    }

    public final void p(@NotNull g13 g13Var) {
        c25.p(g13Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.m.add(g13Var);
    }

    @NotNull
    public final AppConfig r() {
        AppConfig appConfig = this.f;
        if (appConfig != null) {
            return appConfig;
        }
        c25.S("appConfig");
        throw null;
    }

    @Nullable
    public final j23 s() {
        return this.h;
    }

    @NotNull
    public final h73 t() {
        h73 h73Var = this.g;
        if (h73Var != null) {
            return h73Var;
        }
        c25.S("mSDKHelper");
        throw null;
    }

    @NotNull
    public final v13 u() {
        return this.i;
    }

    public final boolean z() {
        return this.i == v13.INITIALIZED;
    }
}