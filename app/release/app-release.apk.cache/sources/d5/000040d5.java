package com.p7700g.p99005;

import java.io.StringWriter;
import java.util.List;
import java.util.Locale;

/* compiled from: Variant.java */
/* loaded from: classes3.dex */
public class en4 {
    private Locale a;
    private tm4 b;
    private String c;

    /* compiled from: Variant.java */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public static a f() {
            return mn4.g().e();
        }

        public abstract a a();

        public abstract List<en4> b();

        public abstract a c(String... strArr);

        public abstract a d(Locale... localeArr);

        public abstract a e(tm4... tm4VarArr);
    }

    public en4(tm4 tm4Var, Locale locale, String str) {
        if (tm4Var == null && locale == null && str == null) {
            throw new IllegalArgumentException("mediaType, language, encoding all null");
        }
        this.c = str;
        this.a = locale;
        this.b = tm4Var;
    }

    public static a a(String... strArr) {
        a f = a.f();
        f.c(strArr);
        return f;
    }

    public static a e(Locale... localeArr) {
        a f = a.f();
        f.d(localeArr);
        return f;
    }

    public static a f(tm4... tm4VarArr) {
        a f = a.f();
        f.e(tm4VarArr);
        return f;
    }

    public String b() {
        return this.c;
    }

    public Locale c() {
        return this.a;
    }

    public tm4 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            en4 en4Var = (en4) obj;
            Locale locale = this.a;
            Locale locale2 = en4Var.a;
            if (locale == locale2 || (locale != null && locale.equals(locale2))) {
                tm4 tm4Var = this.b;
                tm4 tm4Var2 = en4Var.b;
                if (tm4Var == tm4Var2 || (tm4Var != null && tm4Var.equals(tm4Var2))) {
                    String str = this.c;
                    String str2 = en4Var.c;
                    if (str != str2) {
                        return str != null && str.equals(str2);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Locale locale = this.a;
        int hashCode = (203 + (locale != null ? locale.hashCode() : 0)) * 29;
        tm4 tm4Var = this.b;
        int hashCode2 = (hashCode + (tm4Var != null ? tm4Var.hashCode() : 0)) * 29;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append((CharSequence) "Variant[mediaType=");
        tm4 tm4Var = this.b;
        String str = pg1.d;
        stringWriter.append((CharSequence) (tm4Var == null ? pg1.d : tm4Var.toString()));
        stringWriter.append((CharSequence) ", language=");
        Locale locale = this.a;
        stringWriter.append((CharSequence) (locale == null ? pg1.d : locale.toString()));
        stringWriter.append((CharSequence) ", encoding=");
        String str2 = this.c;
        if (str2 != null) {
            str = str2;
        }
        stringWriter.append((CharSequence) str);
        stringWriter.append((CharSequence) "]");
        return stringWriter.toString();
    }
}