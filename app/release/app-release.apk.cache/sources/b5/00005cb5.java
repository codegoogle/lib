package com.p7700g.p99005;

import com.p7700g.p99005.ar5;
import com.p7700g.p99005.jr5;
import java.io.IOException;
import java.net.ProtocolException;
import org.jetbrains.annotations.NotNull;

/* compiled from: CallServerInterceptor.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/p7700g/p99005/ss5;", "Lcom/p7700g/p99005/ar5;", "Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;", "", "b", "Z", "forWebSocket", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ss5 implements ar5 {
    private final boolean b;

    public ss5(boolean z) {
        this.b = z;
    }

    @Override // com.p7700g.p99005.ar5
    @NotNull
    public jr5 a(@NotNull ar5.a aVar) throws IOException {
        boolean z;
        jr5.a aVar2;
        jr5 c;
        c25.p(aVar, "chain");
        xs5 xs5Var = (xs5) aVar;
        is5 m = xs5Var.m();
        c25.m(m);
        hr5 o = xs5Var.o();
        ir5 f = o.f();
        long currentTimeMillis = System.currentTimeMillis();
        m.w(o);
        if (ws5.b(o.m()) && f != null) {
            if (b95.K1("100-continue", o.i("Expect"), true)) {
                m.f();
                aVar2 = m.q(true);
                m.s();
                z = false;
            } else {
                z = true;
                aVar2 = null;
            }
            if (aVar2 == null) {
                if (f.p()) {
                    m.f();
                    f.r(jw5.c(m.c(o, true)));
                } else {
                    tv5 c2 = jw5.c(m.c(o, false));
                    f.r(c2);
                    c2.close();
                }
            } else {
                m.o();
                if (!m.h().C()) {
                    m.n();
                }
            }
        } else {
            m.o();
            z = true;
            aVar2 = null;
        }
        if (f == null || !f.p()) {
            m.e();
        }
        if (aVar2 == null) {
            aVar2 = m.q(false);
            c25.m(aVar2);
            if (z) {
                m.s();
                z = false;
            }
        }
        jr5 c3 = aVar2.E(o).u(m.h().c()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
        int E = c3.E();
        if (E == 100) {
            jr5.a q = m.q(false);
            c25.m(q);
            if (z) {
                m.s();
            }
            c3 = q.E(o).u(m.h().c()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
            E = c3.E();
        }
        m.r(c3);
        if (this.b && E == 101) {
            c = c3.c1().b(sr5.c).c();
        } else {
            c = c3.c1().b(m.p(c3)).c();
        }
        if (b95.K1(com.anythink.expressad.foundation.d.c.cd, c.T1().i("Connection"), true) || b95.K1(com.anythink.expressad.foundation.d.c.cd, jr5.W(c, "Connection", null, 2, null), true)) {
            m.n();
        }
        if (E == 204 || E == 205) {
            kr5 v = c.v();
            if ((v != null ? v.j() : -1L) > 0) {
                StringBuilder H = wo1.H("HTTP ", E, " had non-zero Content-Length: ");
                kr5 v2 = c.v();
                H.append(v2 != null ? Long.valueOf(v2.j()) : null);
                throw new ProtocolException(H.toString());
            }
        }
        return c;
    }
}