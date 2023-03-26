package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Locale;

/* compiled from: LocaleProvider.java */
/* loaded from: classes3.dex */
public class lu3 implements yx3<Locale> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return Locale.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public Locale a(String str) {
        try {
            return new ys3(str).b();
        } catch (ParseException e) {
            throw new IllegalArgumentException(wo1.u("Error parsing date '", str, "'"), e);
        }
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(Locale locale) {
        if (locale.getCountry().length() == 0) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + '-' + locale.getCountry();
    }
}