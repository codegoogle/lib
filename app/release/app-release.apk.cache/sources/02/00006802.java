package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Locale;

/* compiled from: LanguageTag.java */
/* loaded from: classes3.dex */
public class ys3 {
    public String e;
    public String f;
    public String g;

    public ys3() {
    }

    private boolean g(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '-') {
                if (i == 0) {
                    return false;
                }
                i = 0;
            } else if ((('A' > charAt || charAt > 'Z') && ('a' > charAt || charAt > 'z')) || (i = i + 1) > 8) {
                return false;
            }
        }
        return i != 0;
    }

    public static ys3 i(String str) throws IllegalArgumentException {
        ys3 ys3Var = new ys3();
        try {
            ys3Var.h(str);
            return ys3Var;
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final Locale b() {
        return this.g == null ? new Locale(this.f) : new Locale(this.f, this.g);
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ys3) {
            ys3 ys3Var = (ys3) obj;
            String str = this.e;
            if (str == null || (str.equals(ys3Var.e()) && ys3Var.e() == null)) {
                String str2 = this.f;
                if (str2 == null || (str2.equals(ys3Var.c()) && ys3Var.c() == null)) {
                    String str3 = this.g;
                    if (str3 != null) {
                        return str3.equals(ys3Var.d()) && ys3Var.d() == null;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f(Locale locale) {
        if (this.e.equals(tm4.g)) {
            return true;
        }
        if (this.g == null) {
            return this.f.equalsIgnoreCase(locale.getLanguage());
        }
        return this.f.equalsIgnoreCase(locale.getLanguage()) && this.g.equalsIgnoreCase(locale.getCountry());
    }

    public final void h(String str) throws ParseException {
        if (g(str)) {
            int indexOf = str.indexOf(45);
            if (indexOf == -1) {
                this.f = str;
                this.g = null;
                return;
            }
            this.f = str.substring(0, indexOf);
            this.g = str.substring(indexOf + 1, str.length());
            return;
        }
        throw new ParseException(wo1.u("String, ", str, ", is not a valid language tag"), 0);
    }

    public int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        return hashCode + (str2 == null ? 0 : str2.hashCode()) + (this.g != null ? this.f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        String str = this.g;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public ys3(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.e = wo1.u(str, "-", str2);
        } else {
            this.e = str;
        }
        this.f = str;
        this.g = str2;
    }

    public ys3(String str) throws ParseException {
        this(kt3.g(str));
    }

    public ys3(kt3 kt3Var) throws ParseException {
        kt3Var.e();
        this.e = kt3Var.p();
        if (!kt3Var.e()) {
            h(this.e);
            return;
        }
        throw new ParseException("Invalid Language tag", kt3Var.c());
    }
}