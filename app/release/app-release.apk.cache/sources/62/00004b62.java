package com.p7700g.p99005;

import com.p7700g.p99005.kt3;
import java.text.ParseException;

/* compiled from: EntityTagProvider.java */
/* loaded from: classes3.dex */
public class ju3 implements yx3<qm4> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return cls == qm4.class;
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public qm4 a(String str) {
        if (str != null) {
            try {
                kt3 g = kt3.g(str);
                kt3.j j = g.j(false);
                if (j == kt3.j.QuotedString) {
                    return new qm4(g.b());
                }
                if (j == kt3.j.Token && g.b().equals(bx.y4)) {
                    g.o(j14.P);
                    return new qm4(g.l(), true);
                }
                throw new IllegalArgumentException(wo1.u("Error parsing entity tag '", str, "'"));
            } catch (ParseException e) {
                throw new IllegalArgumentException(wo1.u("Error parsing entity tag '", str, "'"), e);
            }
        }
        throw new IllegalArgumentException("Entity tag is null");
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(qm4 qm4Var) {
        StringBuilder sb = new StringBuilder();
        if (qm4Var.b()) {
            sb.append("W/");
        }
        qu3.b(sb, qm4Var.a());
        return sb.toString();
    }
}