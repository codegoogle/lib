package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Date;

/* compiled from: DateProvider.java */
/* loaded from: classes3.dex */
public class iu3 implements yx3<Date> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public Date a(String str) {
        try {
            return kt3.A(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(wo1.u("Error parsing date '", str, "'"), e);
        }
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(Date date) {
        return ws3.d().format(date);
    }
}