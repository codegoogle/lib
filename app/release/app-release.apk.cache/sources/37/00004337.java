package com.p7700g.p99005;

import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes3.dex */
public class fv2 implements kv2 {
    private final String a;
    private final gv2 b;

    public fv2(Set<iv2> set, gv2 gv2Var) {
        this.a = d(set);
        this.b = gv2Var;
    }

    public static so2<kv2> b() {
        return so2.a(kv2.class).b(zo2.l(iv2.class)).f(cv2.a).d();
    }

    public static /* synthetic */ kv2 c(to2 to2Var) {
        return new fv2(to2Var.e(iv2.class), gv2.a());
    }

    private static String d(Set<iv2> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<iv2> it = set.iterator();
        while (it.hasNext()) {
            iv2 next = it.next();
            sb.append(next.b());
            sb.append(j14.P);
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(gl4.R);
            }
        }
        return sb.toString();
    }

    @Override // com.p7700g.p99005.kv2
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + gl4.R + d(this.b.b());
    }
}