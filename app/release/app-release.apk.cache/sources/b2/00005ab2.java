package com.p7700g.p99005;

import com.p7700g.p99005.ar5;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.jr5;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: BridgeInterceptor.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/rs5;", "Lcom/p7700g/p99005/ar5;", "", "Lcom/p7700g/p99005/pq5;", "cookies", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;", "Lcom/p7700g/p99005/rq5;", "Lcom/p7700g/p99005/rq5;", "cookieJar", "<init>", "(Lcom/p7700g/p99005/rq5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class rs5 implements ar5 {
    private final rq5 b;

    public rs5(@NotNull rq5 rq5Var) {
        c25.p(rq5Var, "cookieJar");
        this.b = rq5Var;
    }

    private final String b(List<pq5> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                js4.X();
            }
            pq5 pq5Var = (pq5) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(pq5Var.s());
            sb.append('=');
            sb.append(pq5Var.z());
            i = i2;
        }
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // com.p7700g.p99005.ar5
    @NotNull
    public jr5 a(@NotNull ar5.a aVar) throws IOException {
        kr5 v;
        c25.p(aVar, "chain");
        hr5 x0 = aVar.x0();
        hr5.a n = x0.n();
        ir5 f = x0.f();
        if (f != null) {
            br5 b = f.b();
            if (b != null) {
                n.n("Content-Type", b.toString());
            }
            long a = f.a();
            if (a != -1) {
                n.n(sm4.i, String.valueOf(a));
                n.t("Transfer-Encoding");
            } else {
                n.n("Transfer-Encoding", "chunked");
                n.t(sm4.i);
            }
        }
        boolean z = false;
        if (x0.i(sm4.o) == null) {
            n.n(sm4.o, sr5.b0(x0.q(), false, 1, null));
        }
        if (x0.i("Connection") == null) {
            n.n("Connection", com.anythink.expressad.foundation.g.f.g.c.c);
        }
        if (x0.i(sm4.c) == null && x0.i("Range") == null) {
            n.n(sm4.c, "gzip");
            z = true;
        }
        List<pq5> b2 = this.b.b(x0.q());
        if (!b2.isEmpty()) {
            n.n(sm4.y, b(b2));
        }
        if (x0.i(sm4.v) == null) {
            n.n(sm4.v, sr5.j);
        }
        jr5 e = aVar.e(n.b());
        vs5.g(this.b, x0.q(), e.Y());
        jr5.a E = e.c1().E(x0);
        if (z && b95.K1("gzip", jr5.W(e, "Content-Encoding", null, 2, null), true) && vs5.c(e) && (v = e.v()) != null) {
            ew5 ew5Var = new ew5(v.A());
            E.w(e.Y().m().l("Content-Encoding").l(sm4.i).i());
            E.b(new ys5(jr5.W(e, "Content-Type", null, 2, null), -1L, jw5.d(ew5Var)));
        }
        return E.c();
    }
}