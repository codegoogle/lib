package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import com.greedygame.core.adview.core.GGAdViewImpl;
import com.greedygame.core.app_open_ads.core.GGAppOpenAdsImpl;
import com.p7700g.p99005.t13;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jc3 {
    @NotNull
    public static final jc3 a = new jc3();

    /* loaded from: classes3.dex */
    public interface a {
        void a(@NotNull t13 t13Var);

        void b(@NotNull t13 t13Var, @NotNull r13 r13Var);
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            t13.a.values();
            int[] iArr = new int[4];
            iArr[t13.a.INTERSTITIAL.ordinal()] = 1;
            iArr[t13.a.NATIVE_OR_BANNER.ordinal()] = 2;
            iArr[t13.a.APP_OPEN.ordinal()] = 3;
            iArr[t13.a.REWARDED.ordinal()] = 4;
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ h13 t;
        public final /* synthetic */ t13 u;
        public final /* synthetic */ r13 v;

        public c(Object obj, h13 h13Var, t13 t13Var, r13 r13Var) {
            this.s = obj;
            this.t = h13Var;
            this.u = t13Var;
            this.v = r13Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jc3 jc3Var = (jc3) this.s;
            h13 h13Var = this.t;
            if (h13Var == null) {
                return;
            }
            h13Var.b(this.u.f(), this.v);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ h13 t;
        public final /* synthetic */ t13 u;

        public d(Object obj, h13 h13Var, t13 t13Var) {
            this.s = obj;
            this.t = h13Var;
            this.u = t13Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jc3 jc3Var = (jc3) this.s;
            h13 h13Var = this.t;
            if (h13Var == null) {
                return;
            }
            h13Var.c(this.u.f());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends e25 implements uz4<yq4> {
        public final /* synthetic */ h13 t;
        public final /* synthetic */ Set<t13> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h13 h13Var, Set<t13> set) {
            super(0);
            this.t = h13Var;
            this.u = set;
        }

        public final void a() {
            jc3.a.b(this.t, this.u);
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ h13 t;

        public f(Object obj, h13 h13Var) {
            this.s = obj;
            this.t = h13Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jc3 jc3Var = (jc3) this.s;
            h13 h13Var = this.t;
            if (h13Var == null) {
                return;
            }
            h13Var.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements a {
        public final /* synthetic */ h13 a;
        public final /* synthetic */ ArrayDeque<t13> b;

        public g(h13 h13Var, ArrayDeque<t13> arrayDeque) {
            this.a = h13Var;
            this.b = arrayDeque;
        }

        @Override // com.p7700g.p99005.jc3.a
        public void a(@NotNull t13 t13Var) {
            c25.p(t13Var, "unitId");
            jc3.a.e(t13Var, this.a);
            jc3.k(this.b, this.a);
        }

        @Override // com.p7700g.p99005.jc3.a
        public void b(@NotNull t13 t13Var, @NotNull r13 r13Var) {
            c25.p(t13Var, "unitId");
            c25.p(r13Var, "cause");
            jc3.a.d(r13Var, t13Var, this.a);
            jc3.k(this.b, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements a {
        public final /* synthetic */ h13 a;
        public final /* synthetic */ ArrayDeque<t13> b;

        public h(h13 h13Var, ArrayDeque<t13> arrayDeque) {
            this.a = h13Var;
            this.b = arrayDeque;
        }

        @Override // com.p7700g.p99005.jc3.a
        public void a(@NotNull t13 t13Var) {
            c25.p(t13Var, "unitId");
            jc3.a.e(t13Var, this.a);
            jc3.k(this.b, this.a);
        }

        @Override // com.p7700g.p99005.jc3.a
        public void b(@NotNull t13 t13Var, @NotNull r13 r13Var) {
            c25.p(t13Var, "unitId");
            c25.p(r13Var, "cause");
            jc3.a.d(r13Var, t13Var, this.a);
            jc3.k(this.b, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements a {
        public final /* synthetic */ h13 a;
        public final /* synthetic */ ArrayDeque<t13> b;

        public i(h13 h13Var, ArrayDeque<t13> arrayDeque) {
            this.a = h13Var;
            this.b = arrayDeque;
        }

        @Override // com.p7700g.p99005.jc3.a
        public void a(@NotNull t13 t13Var) {
            c25.p(t13Var, "unitId");
            jc3.a.e(t13Var, this.a);
            jc3.k(this.b, this.a);
        }

        @Override // com.p7700g.p99005.jc3.a
        public void b(@NotNull t13 t13Var, @NotNull r13 r13Var) {
            c25.p(t13Var, "unitId");
            c25.p(r13Var, "cause");
            jc3.a.d(r13Var, t13Var, this.a);
            jc3.k(this.b, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements a {
        public final /* synthetic */ h13 a;
        public final /* synthetic */ ArrayDeque<t13> b;

        public j(h13 h13Var, ArrayDeque<t13> arrayDeque) {
            this.a = h13Var;
            this.b = arrayDeque;
        }

        @Override // com.p7700g.p99005.jc3.a
        public void a(@NotNull t13 t13Var) {
            c25.p(t13Var, "unitId");
            jc3.a.e(t13Var, this.a);
            jc3.k(this.b, this.a);
        }

        @Override // com.p7700g.p99005.jc3.a
        public void b(@NotNull t13 t13Var, @NotNull r13 r13Var) {
            c25.p(t13Var, "unitId");
            c25.p(r13Var, "cause");
            jc3.a.d(r13Var, t13Var, this.a);
            jc3.k(this.b, this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k implements d13 {
        public final /* synthetic */ GGAppOpenAdsImpl a;
        public final /* synthetic */ a b;
        public final /* synthetic */ t13 c;

        public k(GGAppOpenAdsImpl gGAppOpenAdsImpl, a aVar, t13 t13Var) {
            this.a = gGAppOpenAdsImpl;
            this.b = aVar;
            this.c = t13Var;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(@NotNull r13 r13Var) {
            c25.p(r13Var, "cause");
            this.a.e(null);
            this.b.b(this.c, r13Var);
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            this.a.e(null);
            this.b.a(this.c);
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class l implements i13 {
        public final /* synthetic */ n73 a;
        public final /* synthetic */ a b;
        public final /* synthetic */ t13 c;

        public l(n73 n73Var, a aVar, t13 t13Var) {
            this.a = n73Var;
            this.b = aVar;
            this.c = t13Var;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(@NotNull r13 r13Var) {
            c25.p(r13Var, "cause");
            this.a.l();
            this.b.b(this.c, r13Var);
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            this.a.l();
            this.b.a(this.c);
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class m implements v03 {
        public final /* synthetic */ t13 a;
        public final /* synthetic */ GGAdViewImpl b;
        public final /* synthetic */ a c;

        public m(t13 t13Var, GGAdViewImpl gGAdViewImpl, a aVar) {
            this.a = t13Var;
            this.b = gGAdViewImpl;
            this.c = aVar;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void a(@NotNull r13 r13Var) {
            c25.p(r13Var, "cause");
            xz2.c("PrefetchHelper", c25.C("Ad prefetch failed ", r13Var));
            this.b.c0();
            this.c.b(this.a, r13Var);
        }

        @Override // com.p7700g.p99005.v03
        public void b() {
        }

        @Override // com.p7700g.p99005.v03
        public void c() {
        }

        @Override // com.p7700g.p99005.v03
        public void d() {
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            xz2.c("PrefetchHelper", c25.C("Ad prefetched ", this.a));
            this.b.c0();
            this.c.a(this.a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class n implements m23 {
        public final /* synthetic */ vb3 a;
        public final /* synthetic */ a b;
        public final /* synthetic */ t13 c;

        public n(vb3 vb3Var, a aVar, t13 t13Var) {
            this.a = vb3Var;
            this.b = aVar;
            this.c = t13Var;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(@NotNull r13 r13Var) {
            c25.p(r13Var, "cause");
            this.a.k();
            this.b.b(this.c, r13Var);
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            this.a.k();
            this.b.a(this.c);
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }

        @Override // com.p7700g.p99005.m23
        public void onReward() {
        }
    }

    private jc3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(r13 r13Var, t13 t13Var, h13 h13Var) {
        if (!c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new c(this, h13Var, t13Var, r13Var));
        } else if (h13Var == null) {
        } else {
            h13Var.b(t13Var.f(), r13Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(t13 t13Var, h13 h13Var) {
        if (!c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new d(this, h13Var, t13Var));
        } else if (h13Var == null) {
        } else {
            h13Var.c(t13Var.f());
        }
    }

    private final void f(t13 t13Var, a aVar) {
        n73 a2 = o73.a.a(t13Var.f());
        xz2.c("PrefetchHelper", c25.C("Preping to prefetch ", t13Var));
        a2.M(new n03(t13Var.f(), k03.INTERSTITIAL));
        a2.j(new l(a2, aVar, t13Var));
        a2.k();
    }

    private final void j(t13 t13Var, a aVar) {
        GGAdViewImpl gGAdViewImpl = new GGAdViewImpl(true);
        n03 n03Var = new n03(t13Var.f(), k03.NATIVE_OR_BANNER);
        xz2.c("PrefetchHelper", c25.C("Preping to prefetch ", t13Var));
        gGAdViewImpl.f(n03Var);
        gGAdViewImpl.r(new m(t13Var, gGAdViewImpl, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ArrayDeque<t13> arrayDeque, h13 h13Var) {
        t13 poll = arrayDeque.poll();
        if (poll == null) {
            xz2.c("PrefetchHelper", "Prefetch Queue is empty.Stopping");
            jc3 jc3Var = a;
            if (!c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new f(jc3Var, h13Var));
                return;
            } else if (h13Var == null) {
                return;
            } else {
                h13Var.a();
                return;
            }
        }
        xz2.c("PrefetchHelper", c25.C("Prefetching unit  ", poll));
        int i2 = b.a[poll.e().ordinal()];
        if (i2 == 1) {
            a.f(poll, new g(h13Var, arrayDeque));
        } else if (i2 == 2) {
            a.j(poll, new h(h13Var, arrayDeque));
        } else if (i2 == 3) {
            a.l(poll, new i(h13Var, arrayDeque));
        } else if (i2 != 4) {
        } else {
            a.m(poll, new j(h13Var, arrayDeque));
        }
    }

    private final void l(t13 t13Var, a aVar) {
        GGAppOpenAdsImpl a2 = z03.a.a();
        xz2.c("PrefetchHelper", c25.C("Preping to prefetch ", t13Var));
        a2.e(new k(a2, aVar, t13Var));
        a2.a(t13Var.f());
    }

    private final void m(t13 t13Var, a aVar) {
        vb3 a2 = wb3.a.a(t13Var.f());
        xz2.c("PrefetchHelper", c25.C("Preping to prefetch ", t13Var));
        a2.M(new n03(t13Var.f(), k03.REWARDED));
        a2.k(new n(a2, aVar, t13Var));
        a2.j();
    }

    @NotNull
    public final Set<t13> a(@NotNull t13... t13VarArr) {
        c25.p(t13VarArr, "unitIds");
        HashMap hashMap = new HashMap();
        for (t13 t13Var : as4.iz(t13VarArr)) {
            if (!hashMap.containsKey(t13Var.f())) {
                hashMap.put(t13Var.f(), t13Var);
            }
        }
        Collection values = hashMap.values();
        c25.o(values, "uniqueMap.values");
        return rs4.V5(values);
    }

    @r2(otherwise = 2)
    public final void b(@Nullable h13 h13Var, @NotNull Set<t13> set) {
        c25.p(set, "units");
        if (!set.isEmpty()) {
            ArrayDeque arrayDeque = new ArrayDeque(set);
            xz2.c("PrefetchHelper", c25.C("Ads in Queue ", rs4.Q5(arrayDeque)));
            k(arrayDeque, h13Var);
            return;
        }
        throw new IllegalArgumentException("Units to prefetch cannot be empty");
    }

    public final synchronized void c(@Nullable h13 h13Var, @NotNull t13... t13VarArr) {
        c25.p(t13VarArr, "unitIds");
        try {
        } catch (Exception e2) {
            xz2.e("PrefetchHelper", "Failed to prefetch ads", e2);
            if (h13Var != null) {
                h13Var.a();
            }
        }
        if (!(t13VarArr.length == 0)) {
            Set<t13> a2 = a((t13[]) Arrays.copyOf(t13VarArr, t13VarArr.length));
            if (!a2.isEmpty()) {
                ky2.a.a().h(new e(h13Var, a2));
            } else {
                throw new Exception("Empty unique list");
            }
        } else {
            throw new Exception("Empty adunit list");
        }
    }
}