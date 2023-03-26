package com.p7700g.p99005;

import java.util.regex.Pattern;

/* compiled from: SupportSQLiteQueryBuilder.java */
/* loaded from: classes.dex */
public final class r60 {
    private static final Pattern a = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private final String c;
    private String e;
    private Object[] f;
    private boolean b = false;
    private String[] d = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private String j = null;

    private r60(String str) {
        this.c = str;
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (i(str2)) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    private static void b(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(gl4.R);
    }

    public static r60 c(String str) {
        return new r60(str);
    }

    private static boolean i(String str) {
        return str == null || str.length() == 0;
    }

    public r60 d(String[] strArr) {
        this.d = strArr;
        return this;
    }

    public q60 e() {
        if (i(this.g) && !i(this.h)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.b) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.d;
        if (strArr != null && strArr.length != 0) {
            b(sb, strArr);
        } else {
            sb.append(" * ");
        }
        sb.append(" FROM ");
        sb.append(this.c);
        a(sb, " WHERE ", this.e);
        a(sb, " GROUP BY ", this.g);
        a(sb, " HAVING ", this.h);
        a(sb, " ORDER BY ", this.i);
        a(sb, " LIMIT ", this.j);
        return new m60(sb.toString(), this.f);
    }

    public r60 f() {
        this.b = true;
        return this;
    }

    public r60 g(String str) {
        this.g = str;
        return this;
    }

    public r60 h(String str) {
        this.h = str;
        return this;
    }

    public r60 j(String str) {
        if (!i(str) && !a.matcher(str).matches()) {
            throw new IllegalArgumentException(wo1.t("invalid LIMIT clauses:", str));
        }
        this.j = str;
        return this;
    }

    public r60 k(String str) {
        this.i = str;
        return this;
    }

    public r60 l(String str, Object[] objArr) {
        this.e = str;
        this.f = objArr;
        return this;
    }
}