package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Map;

/* compiled from: MediaTypeProvider.java */
/* loaded from: classes3.dex */
public class mu3 implements yx3<tm4> {
    public static tm4 f(kt3 kt3Var) throws ParseException {
        kt3Var.e();
        String p = kt3Var.p();
        kt3Var.o(j14.P);
        return new tm4(p, kt3Var.p(), kt3Var.e() ? kt3.G(kt3Var) : null);
    }

    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return tm4.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public tm4 a(String str) {
        if (str != null) {
            try {
                return f(kt3.g(str));
            } catch (ParseException e) {
                throw new IllegalArgumentException(wo1.u("Error parsing media type '", str, "'"), e);
            }
        }
        throw new IllegalArgumentException("Media type is null");
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(tm4 tm4Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(tm4Var.d());
        sb.append(j14.P);
        sb.append(tm4Var.c());
        for (Map.Entry<String, String> entry : tm4Var.b().entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append('=');
            qu3.c(sb, entry.getValue());
        }
        return sb.toString();
    }
}