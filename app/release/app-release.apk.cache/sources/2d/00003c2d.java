package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.bt0;
import com.p7700g.p99005.c51;
import com.p7700g.p99005.fr5;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: SdkNetworkLayerSource.java */
/* loaded from: classes.dex */
public class c51 {
    private static final int a = 10;
    @x1
    private final at0 b;

    /* compiled from: SdkNetworkLayerSource.java */
    /* loaded from: classes.dex */
    public static class b implements at0, bt0.e {
        @x1
        private final Context c;
        @x1
        private final v41 d;
        @z1
        private final bt0.e e;
        @x1
        private dq0<c> f = j();
        @x1
        private dq0<at0> b = i();

        public b(@x1 Context context, @x1 v41 v41Var, @z1 bt0.e eVar) {
            this.c = context;
            this.d = v41Var;
            this.e = eVar;
        }

        /* renamed from: l */
        public /* synthetic */ c m(dq0 dq0Var) throws Exception {
            return new c(this.c, (td1) dq0Var.F(), this.e);
        }

        public static /* synthetic */ Object n(String str, String str2, Map map, hr0 hr0Var, dq0 dq0Var) throws Exception {
            ((at0) r81.f((at0) dq0Var.F())).a(str, str2, map, hr0Var);
            return null;
        }

        public static /* synthetic */ Object o(String str, Map map, hr0 hr0Var, dq0 dq0Var) throws Exception {
            ((at0) r81.f((at0) dq0Var.F())).c(str, map, hr0Var);
            return null;
        }

        public static /* synthetic */ Object p(String str, String str2, Map map, hr0 hr0Var, dq0 dq0Var) throws Exception {
            ((at0) r81.f((at0) dq0Var.F())).h(str, str2, map, hr0Var);
            return null;
        }

        public static /* synthetic */ Object q(String str, String str2, Map map, hr0 hr0Var, dq0 dq0Var) throws Exception {
            ((at0) r81.f((at0) dq0Var.F())).f(str, str2, map, hr0Var);
            return null;
        }

        public static /* synthetic */ Object r(String str, String str2, Map map, hr0 hr0Var, dq0 dq0Var) throws Exception {
            ((at0) r81.f((at0) dq0Var.F())).e(str, str2, map, hr0Var);
            return null;
        }

        @Override // com.p7700g.p99005.at0
        public void a(@x1 final String str, @x1 final String str2, @x1 final Map<String, String> map, @x1 final hr0<mr0> hr0Var) {
            this.b.q(new aq0() { // from class: com.p7700g.p99005.nz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    c51.b.n(str, str2, map, hr0Var, dq0Var);
                    return null;
                }
            });
        }

        @Override // com.p7700g.p99005.bt0.e
        public void b(@x1 fr5.a aVar) {
        }

        @Override // com.p7700g.p99005.at0
        public void c(@x1 final String str, @x1 final Map<String, String> map, @x1 final hr0<mr0> hr0Var) {
            this.b.q(new aq0() { // from class: com.p7700g.p99005.lz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    c51.b.o(str, map, hr0Var, dq0Var);
                    return null;
                }
            });
        }

        @Override // com.p7700g.p99005.at0
        public void d() {
            g();
        }

        @Override // com.p7700g.p99005.at0
        public void e(@x1 final String str, @x1 final String str2, @x1 final Map<String, String> map, @x1 final hr0<mr0> hr0Var) {
            this.b.q(new aq0() { // from class: com.p7700g.p99005.kz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    c51.b.r(str, str2, map, hr0Var, dq0Var);
                    return null;
                }
            });
        }

        @Override // com.p7700g.p99005.at0
        public void f(@x1 final String str, @x1 final String str2, @x1 final Map<String, String> map, @x1 final hr0<mr0> hr0Var) {
            this.b.q(new aq0() { // from class: com.p7700g.p99005.mz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    c51.b.q(str, str2, map, hr0Var, dq0Var);
                    return null;
                }
            });
        }

        @Override // com.p7700g.p99005.at0
        public void g() {
            c F = this.f.F();
            if (F != null) {
                F.a();
            }
            this.f = j();
            this.b = i();
        }

        @Override // com.p7700g.p99005.at0
        public void h(@x1 final String str, @x1 final String str2, @x1 final Map<String, String> map, @x1 final hr0<mr0> hr0Var) {
            this.b.q(new aq0() { // from class: com.p7700g.p99005.jz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    c51.b.p(str, str2, map, hr0Var, dq0Var);
                    return null;
                }
            });
        }

        @x1
        public dq0<at0> i() {
            return this.f.q(iz0.a);
        }

        @x1
        public dq0<c> j() {
            return this.d.e().q(new aq0() { // from class: com.p7700g.p99005.hz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    return c51.b.this.m(dq0Var);
                }
            });
        }
    }

    /* compiled from: SdkNetworkLayerSource.java */
    /* loaded from: classes.dex */
    public static class c implements bt0.e {
        @x1
        private final Context b;
        @z1
        public final td1 c;
        @z1
        private final bt0.e d;
        @z1
        private sd1 e;
        private nq5 f;

        public void a() {
            sd1 sd1Var = this.e;
            if (sd1Var != null) {
                sd1Var.a();
            }
        }

        @Override // com.p7700g.p99005.bt0.e
        public void b(@x1 fr5.a aVar) {
            aa1.a(aVar);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.k(10L, timeUnit);
            aVar.j0(10L, timeUnit);
            aVar.h(20L, timeUnit);
            aVar.f0(Collections.singletonList(gr5.HTTP_1_1));
            aVar.l0(true);
            this.f.b();
            aVar.m(this.f);
            td1 td1Var = this.c;
            if (td1Var != null) {
                uq5 e = rd1.e(this.b, td1Var);
                if (e != null) {
                    aVar.q(e);
                }
                sd1 sd1Var = new sd1(td1Var);
                this.e = sd1Var;
                aVar.O0(sd1Var);
            }
            a61.a(aVar);
            bt0.e eVar = this.d;
            if (eVar != null) {
                eVar.b(aVar);
            }
        }

        private c(@x1 Context context, @z1 td1 td1Var, @z1 bt0.e eVar) {
            this.b = context;
            this.c = td1Var;
            this.d = eVar;
            this.f = new nq5(0, 1L, TimeUnit.NANOSECONDS);
        }
    }

    public c51(@x1 Context context, @x1 v41 v41Var, @z1 bt0.e eVar) {
        this.b = new b(context, v41Var, eVar);
    }

    @x1
    public at0 a() {
        return this.b;
    }
}