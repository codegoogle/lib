package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: CacheControlProvider.java */
/* loaded from: classes3.dex */
public final class gu3 implements yx3<nm4> {
    private static final Pattern a = Pattern.compile("\\s");
    private static final Pattern b = Pattern.compile("[\\s]*,[\\s]*");

    private void d(StringBuffer stringBuffer, String str, String str2) {
        e(stringBuffer, str);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        stringBuffer.append("=\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
    }

    private void e(StringBuffer stringBuffer, String str) {
        if (stringBuffer.length() > 0) {
            stringBuffer.append(", ");
        }
        stringBuffer.append(str);
    }

    private void f(StringBuffer stringBuffer, String str, int i) {
        e(stringBuffer, str);
        stringBuffer.append(AppCenter.KEY_VALUE_DELIMITER);
        stringBuffer.append(i);
    }

    private void g(StringBuffer stringBuffer, String str, String str2) {
        e(stringBuffer, str);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        stringBuffer.append(AppCenter.KEY_VALUE_DELIMITER);
        stringBuffer.append(str2);
    }

    private String h(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            e(stringBuffer, str);
        }
        return stringBuffer.toString();
    }

    private String j(String str) {
        if (str == null) {
            return null;
        }
        return a.matcher(str).find() ? wo1.u("\"", str, "\"") : str;
    }

    private void k(nm4 nm4Var, kt3 kt3Var) throws ParseException {
        String p = kt3Var.p();
        if (p.equalsIgnoreCase("private")) {
            nm4Var.q(true);
            l(nm4Var.d(), kt3Var, p);
            return;
        }
        String str = null;
        if (p.equalsIgnoreCase("public")) {
            nm4Var.a().put(p, null);
        } else if (p.equalsIgnoreCase("no-cache")) {
            nm4Var.n(true);
            l(nm4Var.c(), kt3Var, p);
        } else if (p.equalsIgnoreCase("no-store")) {
            nm4Var.o(true);
        } else if (p.equalsIgnoreCase("no-transform")) {
            nm4Var.p(true);
        } else if (p.equalsIgnoreCase("must-revalidate")) {
            nm4Var.m(true);
        } else if (p.equalsIgnoreCase("proxy-revalidate")) {
            nm4Var.r(true);
        } else if (p.equalsIgnoreCase("max-age")) {
            nm4Var.l(m(kt3Var, p));
        } else if (p.equalsIgnoreCase("s-maxage")) {
            nm4Var.s(m(kt3Var, p));
        } else {
            if (kt3Var.f('=', false)) {
                kt3Var.o('=');
                str = kt3Var.q();
            }
            nm4Var.a().put(p, str);
        }
    }

    private void l(List<String> list, kt3 kt3Var, String str) throws ParseException {
        if (kt3Var.f('=', false)) {
            kt3Var.o('=');
            list.addAll(Arrays.asList(b.split(kt3Var.l())));
        }
    }

    private int m(kt3 kt3Var, String str) throws ParseException {
        kt3Var.o('=');
        int c = kt3Var.c();
        try {
            return Integer.parseInt(kt3Var.p());
        } catch (NumberFormatException e) {
            ParseException parseException = new ParseException(wo1.u("Error parsing integer value for ", str, " directive"), c);
            parseException.initCause(e);
            throw parseException;
        }
    }

    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return cls == nm4.class;
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: i */
    public nm4 a(String str) {
        if (str != null) {
            try {
                kt3 g = kt3.g(str);
                nm4 nm4Var = new nm4();
                nm4Var.p(false);
                while (g.e()) {
                    k(nm4Var, g);
                    if (g.f(e14.f0, true)) {
                        g.o(e14.f0);
                    }
                }
                return nm4Var;
            } catch (ParseException e) {
                throw new IllegalArgumentException(wo1.u("Error parsing cache control '", str, "'"), e);
            }
        }
        throw new IllegalArgumentException("Cache control is null");
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: n */
    public String b(nm4 nm4Var) {
        StringBuffer stringBuffer = new StringBuffer();
        if (nm4Var.j()) {
            d(stringBuffer, "private", h(nm4Var.d()));
        }
        if (nm4Var.g()) {
            d(stringBuffer, "no-cache", h(nm4Var.c()));
        }
        if (nm4Var.h()) {
            e(stringBuffer, "no-store");
        }
        if (nm4Var.i()) {
            e(stringBuffer, "no-transform");
        }
        if (nm4Var.f()) {
            e(stringBuffer, "must-revalidate");
        }
        if (nm4Var.k()) {
            e(stringBuffer, "proxy-revalidate");
        }
        if (nm4Var.b() != -1) {
            f(stringBuffer, "max-age", nm4Var.b());
        }
        if (nm4Var.e() != -1) {
            f(stringBuffer, "s-maxage", nm4Var.e());
        }
        for (Map.Entry<String, String> entry : nm4Var.a().entrySet()) {
            g(stringBuffer, entry.getKey(), j(entry.getValue()));
        }
        return stringBuffer.toString();
    }
}