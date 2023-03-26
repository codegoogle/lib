package com.p7700g.p99005;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.t23;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class oc3 implements h03, m73, zb3 {
    @NotNull
    private mz2<sc3> A;
    @NotNull
    private mz2<l03> B;
    @NotNull
    private mz2<m03> C;
    @NotNull
    private mz2<j03> D;
    private long E;
    @NotNull
    private final n03 s;
    @NotNull
    private final String t;
    @Nullable
    private gc3 u;
    private long v;
    @NotNull
    private a w;
    @NotNull
    private u13 x;
    @NotNull
    private mz2<ia3> y;
    @NotNull
    private mz2<r13> z;

    /* loaded from: classes3.dex */
    public enum a {
        LOADING,
        SUCCESS,
        FAILED,
        NONE
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.S2S.ordinal()] = 1;
            a = iArr;
        }
    }

    public oc3(@NotNull n03 n03Var) {
        c25.p(n03Var, "mUnitConfig");
        this.s = n03Var;
        this.t = "BaseAdUnitController";
        this.w = a.NONE;
        this.x = u13.AUTO;
        this.y = new mz2<>();
        this.z = new mz2<>();
        this.A = new mz2<>();
        this.B = new mz2<>();
        this.C = new mz2<>();
        this.D = new mz2<>();
        this.E = -1L;
        GreedyGameAds.a.addInternalDestroyListener$com_greedygame_sdkx_core(this);
        c();
    }

    private final void c() {
        gc3 a2 = gc3.s.a();
        this.u = a2;
        if (a2 == null) {
            return;
        }
        a2.e(this.s, this);
    }

    public static /* synthetic */ void l(oc3 oc3Var, t23.b bVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showUii");
        }
        if ((i & 1) != 0) {
            bVar = t23.b.NATIVE;
        }
        oc3Var.p(bVar);
    }

    private final boolean m() {
        ia3 w = w();
        Ad c = w == null ? null : w.c();
        if (b.a[lc3.s.b(c != null ? c.w() : null).ordinal()] == 1) {
            if (c == null) {
                return false;
            }
            return c.t();
        }
        return true;
    }

    private final boolean o() {
        return System.currentTimeMillis() - this.v < ((long) 25000);
    }

    @NotNull
    public final mz2<l03> A() {
        return this.B;
    }

    @NotNull
    public final mz2<l03> B() {
        return this.B;
    }

    @NotNull
    public final mz2<m03> C() {
        return this.C;
    }

    @NotNull
    public final mz2<j03> D() {
        return this.D;
    }

    @NotNull
    public final mz2<j03> E() {
        return this.D;
    }

    public final boolean F() {
        ia3 w = w();
        return w != null && w.i();
    }

    @Nullable
    public final f83 G() {
        gc3 r;
        ia3 w = w();
        Ad c = w == null ? null : w.c();
        if (c == null || (r = r()) == null) {
            return null;
        }
        return r.a(c);
    }

    public final void H() {
        xz2.c(this.t, c25.C("Ad Loaded Succesfully ", this.s.c()));
        this.w = a.SUCCESS;
        this.y.notifyObservers();
    }

    public final void I() {
        AtomicBoolean l;
        Ad c;
        Ad c2;
        Ad c3;
        mz2<j03> mz2Var = this.D;
        mz2Var.b(j03.CLICKED);
        mz2Var.notifyObservers();
        ia3 w = w();
        if ((w == null || (l = w.l()) == null || !l.get()) ? false : true) {
            ia3 w2 = w();
            if (w2 == null || (c3 = w2.c()) == null) {
                return;
            }
            c3.k();
            return;
        }
        ia3 w3 = w();
        if (w3 != null && (c2 = w3.c()) != null) {
            c2.o(m(), Long.valueOf(this.E));
        }
        ia3 w4 = w();
        if (w4 == null || (c = w4.c()) == null) {
            return;
        }
        c.q();
    }

    @t0
    public void J() {
        Ad c;
        Ad c2;
        ia3 w = w();
        String str = null;
        if ((w == null || w.j()) ? false : true) {
            String str2 = this.t;
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("GG Impression Fired for ");
            ia3 w2 = w();
            if (w2 != null && (c2 = w2.c()) != null) {
                str = c2.B();
            }
            G.append((Object) str);
            G.append(" for ");
            G.append(this.s.c());
            strArr[0] = G.toString();
            xz2.c(str2, strArr);
            this.s.l().n(Long.valueOf(System.currentTimeMillis() - this.E));
            ia3 w3 = w();
            if (w3 == null) {
                return;
            }
            w3.e(this.s.l());
            return;
        }
        String str3 = this.t;
        String[] strArr2 = new String[1];
        StringBuilder G2 = wo1.G("GG Impression already recorded for ");
        ia3 w4 = w();
        if (w4 != null && (c = w4.c()) != null) {
            str = c.B();
        }
        G2.append((Object) str);
        G2.append(" for ");
        G2.append(this.s.c());
        strArr2[0] = G2.toString();
        xz2.c(str3, strArr2);
    }

    @Override // com.p7700g.p99005.h03
    public void d(@NotNull ia3 ia3Var) {
        c25.p(ia3Var, "adContainer");
        this.y.b(ia3Var);
        H();
    }

    @Override // com.p7700g.p99005.zb3
    public void e(@NotNull t23.b bVar) {
        Ad c;
        c25.p(bVar, "launchMode");
        ia3 w = w();
        if (w != null) {
            w.g(false);
        }
        ia3 w2 = w();
        if (w2 != null && (c = w2.c()) != null) {
            c.m();
        }
        mz2<m03> mz2Var = this.C;
        mz2Var.b(m03.CLOSE);
        mz2Var.notifyObservers();
    }

    @Override // com.p7700g.p99005.zb3
    public void g(@NotNull t23.b bVar) {
        Ad c;
        c25.p(bVar, "launchMode");
        ia3 w = w();
        if (w != null && (c = w.c()) != null) {
            c.n();
        }
        mz2<m03> mz2Var = this.C;
        mz2Var.b(m03.OPEN);
        mz2Var.notifyObservers();
    }

    @Override // com.p7700g.p99005.h03
    public void i(@NotNull r13 r13Var) {
        c25.p(r13Var, "adError");
        this.y.b(null);
        this.v = System.currentTimeMillis();
        n(r13Var);
    }

    public void j(@NotNull u13 u13Var) {
        c25.p(u13Var, "<set-?>");
        this.x = u13Var;
    }

    public final void k(@NotNull x83 x83Var) {
        AppConfig r;
        Context e;
        c25.p(x83Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (o()) {
            zc3.a.a(c25.C(this.s.c(), " - Too Frequent Ad Request"), "You are refreshing ads too frequently. Please refresh them in a time interval of 30s", this.s.c());
            xz2.c(this.t, this.s.c(), c25.C(this.s.c(), " - Too Frequent Ad Request"), "You are refreshing ads too frequently. Please refresh them in a time interval of 30s");
            i(r13.REQUEST_TOO_FREQUENT);
        } else if (s()) {
            xz2.c(this.t, c25.C("Already loading ad. Rejecting Request ", this.s.c()));
        } else {
            if (this.u == null) {
                c();
            }
            if (F()) {
                xz2.c(this.t, c25.C("Current ad is valid for ", this.s.c()));
                H();
                return;
            }
            if (this.s.c().length() == 0) {
                n(r13.EMPTY_UNIT_ID);
                return;
            }
            GreedyGameAds.Companion companion = GreedyGameAds.a;
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (e = r.e()) == null) {
                return;
            }
            if (!oa3.a.c(e)) {
                gc3 gc3Var = this.u;
                if ((gc3Var == null || gc3Var.n(q().c())) ? false : true) {
                    n(r13.NO_INTERNET);
                    return;
                }
            }
            this.E = System.currentTimeMillis();
            this.w = a.LOADING;
            gc3 gc3Var2 = this.u;
            if (gc3Var2 == null) {
                return;
            }
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
            AppConfig r2 = iNSTANCE$com_greedygame_sdkx_core2 == null ? null : iNSTANCE$com_greedygame_sdkx_core2.r();
            c25.m(r2);
            gc3Var2.d(r2, q(), x83Var, u());
        }
    }

    public final void n(@NotNull r13 r13Var) {
        c25.p(r13Var, "adError");
        xz2.c(this.t, c25.C("Ad Loaded Failed ", this.s.c()));
        this.w = a.FAILED;
        mz2<r13> mz2Var = this.z;
        mz2Var.b(r13Var);
        mz2Var.notifyObservers();
    }

    public final void p(@NotNull t23.b bVar) {
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core;
        AppConfig r;
        t23 s;
        c25.p(bVar, "launchMode");
        ia3 w = w();
        if (w == null || (iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core()) == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (s = r.s()) == null) {
            return;
        }
        s.g(w, q(), bVar, this);
    }

    @NotNull
    public final n03 q() {
        return this.s;
    }

    @Nullable
    public final gc3 r() {
        return this.u;
    }

    public final boolean s() {
        return this.w == a.LOADING;
    }

    public final boolean t() {
        return this.w == a.SUCCESS;
    }

    @NotNull
    public u13 u() {
        return this.x;
    }

    @NotNull
    public final mz2<ia3> v() {
        return this.y;
    }

    @Nullable
    public final ia3 w() {
        return this.y.a();
    }

    @NotNull
    public final mz2<r13> x() {
        return this.z;
    }

    @NotNull
    public final mz2<sc3> y() {
        return this.A;
    }

    @Override // com.p7700g.p99005.f13
    public void z() {
        this.v = 0L;
        this.y.b(null);
        this.u = null;
        mz2<sc3> mz2Var = this.A;
        this.w = a.NONE;
        mz2Var.b(new sc3());
        mz2Var.notifyObservers();
        mz2Var.b(null);
    }
}