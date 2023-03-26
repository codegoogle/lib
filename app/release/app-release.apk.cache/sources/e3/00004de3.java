package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.a52;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes2.dex */
public final class l42 extends a52 {
    private ol4<j72> A;
    private ol4<e82> B;
    private ol4<g82> C;
    private ol4<z42> D;
    private ol4<Executor> s;
    private ol4<Context> t;
    private ol4 u;
    private ol4 v;
    private ol4 w;
    private ol4<p92> x;
    private ol4<d82> y;
    private ol4<i82> z;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* loaded from: classes2.dex */
    public static final class b implements a52.a {
        private Context a;

        private b() {
        }

        @Override // com.p7700g.p99005.a52.a
        /* renamed from: b */
        public b a(Context context) {
            this.a = (Context) q62.b(context);
            return this;
        }

        @Override // com.p7700g.p99005.a52.a
        public a52 build() {
            q62.a(this.a, Context.class);
            return new l42(this.a);
        }
    }

    public static a52.a d() {
        return new b();
    }

    private void e(Context context) {
        this.s = g62.b(r42.a());
        h62 a2 = k62.a(context);
        this.t = a2;
        m52 a3 = m52.a(a2, z92.a(), aa2.a());
        this.u = a3;
        this.v = g62.b(o52.a(this.t, a3));
        this.w = s92.a(this.t, l92.a(), m92.a());
        this.x = g62.b(q92.a(z92.a(), aa2.a(), n92.a(), this.w));
        n72 b2 = n72.b(z92.a());
        this.y = b2;
        p72 a4 = p72.a(this.t, this.x, b2, aa2.a());
        this.z = a4;
        ol4<Executor> ol4Var = this.s;
        ol4 ol4Var2 = this.v;
        ol4<p92> ol4Var3 = this.x;
        this.A = k72.a(ol4Var, ol4Var2, a4, ol4Var3, ol4Var3);
        ol4<Context> ol4Var4 = this.t;
        ol4 ol4Var5 = this.v;
        ol4<p92> ol4Var6 = this.x;
        this.B = f82.a(ol4Var4, ol4Var5, ol4Var6, this.z, this.s, ol4Var6, z92.a());
        ol4<Executor> ol4Var7 = this.s;
        ol4<p92> ol4Var8 = this.x;
        this.C = h82.a(ol4Var7, ol4Var8, this.z, ol4Var8);
        this.D = g62.b(b52.a(z92.a(), aa2.a(), this.A, this.B, this.C));
    }

    @Override // com.p7700g.p99005.a52
    public i92 a() {
        return this.x.get();
    }

    @Override // com.p7700g.p99005.a52
    public z42 b() {
        return this.D.get();
    }

    private l42(Context context) {
        e(context);
    }
}