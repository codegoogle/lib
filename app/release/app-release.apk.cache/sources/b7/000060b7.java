package com.p7700g.p99005;

import com.p7700g.p99005.kg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Inflector.java */
/* loaded from: classes3.dex */
public class ut3 {
    private static transient ut3 a;
    private List<a> b = new LinkedList();
    private List<a> c = new ArrayList();
    private List d = new LinkedList();

    /* compiled from: Inflector.java */
    /* loaded from: classes3.dex */
    public class a {
        private Pattern a;
        private String b;

        public a(String str, String str2, boolean z) {
            this.a = null;
            this.b = null;
            this.a = Pattern.compile(str, z ? 2 : 0);
            this.b = str2;
        }

        public String a(String str) {
            Matcher matcher = this.a.matcher(str);
            if (matcher.matches()) {
                StringBuffer stringBuffer = new StringBuffer();
                boolean z = false;
                for (int i = 0; i < this.b.length(); i++) {
                    char charAt = this.b.charAt(i);
                    if (z) {
                        stringBuffer.append(matcher.group(Character.digit(charAt, 10)));
                        z = false;
                    } else if (charAt == '\\') {
                        z = true;
                    } else {
                        stringBuffer.append(charAt);
                    }
                }
                return stringBuffer.toString();
            }
            return null;
        }
    }

    private ut3() {
        c("$", "s", false);
        b("(.*)$", "\\1s");
        b("(.*)(ax|test)is$", "\\1\\2es");
        b("(.*)(octop|vir)us$", "\\1\\2i");
        b("(.*)(alias|status)$", "\\1\\2es");
        b("(.*)(bu)s$", "\\1\\2ses");
        b("(.*)(buffal|tomat)o$", "\\1\\2oes");
        b("(.*)([ti])um$", "\\1\\2a");
        b("(.*)sis$", "\\1ses");
        b("(.*)(?:([^f])fe|([lr])f)$", "\\1\\3ves");
        b("(.*)(hive)$", "\\1\\2s");
        b("(.*)(tive)$", "\\1\\2s");
        b("(.*)([^aeiouy]|qu)y$", "\\1\\2ies");
        b("(.*)(series)$", "\\1\\2");
        b("(.*)(movie)$", "\\1\\2s");
        b("(.*)(x|ch|ss|sh)$", "\\1\\2es");
        b("(.*)(matr|vert|ind)ix|ex$", "\\1\\2ices");
        b("(.*)(o)$", "\\1\\2es");
        b("(.*)(shoe)$", "\\1\\2s");
        b("(.*)([m|l])ouse$", "\\1\\2ice");
        b("^(ox)$", "\\1en");
        b("(.*)(vert|ind)ex$", "\\1\\2ices");
        b("(.*)(matr)ix$", "\\1\\2ices");
        b("(.*)(quiz)$", "\\1\\2zes");
        d("(.*)s$", "\\1");
        d("(.*)(n)ews$", "\\1\\2ews");
        d("(.*)([ti])a$", "\\1\\2um");
        d("(.*)((a)naly|(b)a|(d)iagno|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$", "\\1\\2sis");
        d("(.*)(^analy)ses$", "\\1\\2sis");
        d("(.*)([^f])ves$", "\\1\\2fe");
        d("(.*)(hive)s$", "\\1\\2");
        d("(.*)(tive)s$", "\\1\\2");
        d("(.*)([lr])ves$", "\\1\\2f");
        d("(.*)([^aeiouy]|qu)ies$", "\\1\\2y");
        d("(.*)(s)eries$", "\\1\\2eries");
        d("(.*)(m)ovies$", "\\1\\2ovie");
        d("(.*)(x|ch|ss|sh)es$", "\\1\\2");
        d("(.*)([m|l])ice$", "\\1\\2ouse");
        d("(.*)(bus)es$", "\\1\\2");
        d("(.*)(o)es$", "\\1\\2");
        d("(.*)(shoe)s$", "\\1\\2");
        d("(.*)(cris|ax|test)es$", "\\1\\2is");
        d("(.*)(octop|vir)i$", "\\1\\2us");
        d("(.*)(alias|status)es$", "\\1\\2");
        d("^(ox)en", "\\1");
        d("(.*)(vert|ind)ices$", "\\1\\2ex");
        d("(.*)(matr)ices$", "\\1\\2ix");
        d("(.*)(quiz)zes$", "\\1\\2");
        a("child", "children");
        a("man", "men");
        a("move", "moves");
        a(kg.m.a.g, "people");
        a("sex", "sexes");
        f("equipment");
        f("fish");
        f("information");
        f("money");
        f("rice");
        f("series");
        f("sheep");
        f("species");
    }

    public static ut3 o() {
        if (a == null) {
            a = new ut3();
        }
        return a;
    }

    public void a(String str, String str2) {
        StringBuilder G = wo1.G("(.*)(");
        G.append(str.substring(0, 1));
        G.append(")");
        G.append(str.substring(1));
        G.append("$");
        String sb = G.toString();
        StringBuilder G2 = wo1.G("\\1\\2");
        G2.append(str2.substring(1));
        b(sb, G2.toString());
        StringBuilder G3 = wo1.G("\\1\\2");
        G3.append(str.substring(1));
        d("(.*)(" + str2.substring(0, 1) + ")" + str2.substring(1) + "$", G3.toString());
    }

    public void b(String str, String str2) {
        c(str, str2, true);
    }

    public void c(String str, String str2, boolean z) {
        this.b.add(0, new a(str, str2, z));
    }

    public void d(String str, String str2) {
        e(str, str2, true);
    }

    public void e(String str, String str2, boolean z) {
        this.c.add(0, new a(str, str2, z));
    }

    public void f(String str) {
        this.d.add(0, str.toLowerCase());
    }

    public String g(String str) {
        return h(str, false);
    }

    public String h(String str, boolean z) {
        if (str.length() == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (z) {
            stringBuffer.append(Character.toLowerCase(str.charAt(0)));
        } else {
            stringBuffer.append(Character.toUpperCase(str.charAt(0)));
        }
        boolean z2 = false;
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z2) {
                stringBuffer.append(Character.toUpperCase(charAt));
                z2 = false;
            } else {
                if (charAt != '_') {
                    if (charAt == '/') {
                        stringBuffer.append('.');
                    } else {
                        stringBuffer.append(charAt);
                    }
                }
                z2 = true;
            }
        }
        return stringBuffer.toString();
    }

    public String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        return g(s(str));
    }

    public String j(String str) {
        return str.replace(n04.E, '-');
    }

    public String k(String str) {
        if (str == null || str.length() < 1) {
            return str;
        }
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toLowerCase(charAt));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public String l(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    public String m(String str) {
        return n(str, true);
    }

    public String n(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(l(str));
        sb.append(z ? "_id" : "id");
        return v(sb.toString());
    }

    public String p(String str) {
        if (str.endsWith("_id")) {
            str = str.substring(0, str.length() - 3);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '_') {
                stringBuffer.append(gl4.R);
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public String q(int i) {
        int i2 = i % 100;
        if (i2 >= 11 && i2 <= 13) {
            return wo1.n("", i, "th");
        }
        int i3 = i % 10;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return wo1.n("", i, "th");
                }
                return wo1.n("", i, "rd");
            }
            return wo1.n("", i, "nd");
        }
        return wo1.n("", i, "st");
    }

    public String r(String str) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).equals(str)) {
                return str;
            }
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            String a2 = this.b.get(i2).a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return str;
    }

    public String s(String str) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).equals(str)) {
                return str;
            }
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            String a2 = this.c.get(i2).a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return str;
    }

    public String t(String str) {
        return r(v(str));
    }

    public String u(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        boolean z = true;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isWhitespace(charAt)) {
                stringBuffer.append(gl4.R);
            } else if (charAt == '-') {
                stringBuffer.append(gl4.R);
            } else {
                if (z) {
                    stringBuffer.append(Character.toUpperCase(charAt));
                    z = false;
                } else {
                    stringBuffer.append(charAt);
                }
            }
            z = true;
        }
        return stringBuffer.toString();
    }

    public String v(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() + 5);
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z) {
                stringBuffer.append(Character.toLowerCase(charAt));
                z = false;
            } else if (charAt == '.') {
                stringBuffer.append(j14.P);
                z = true;
            } else if (Character.isUpperCase(charAt)) {
                if (i > 0) {
                    stringBuffer.append(n04.E);
                }
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}