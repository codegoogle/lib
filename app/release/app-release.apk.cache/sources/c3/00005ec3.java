package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/* compiled from: ContentDisposition.java */
/* loaded from: classes3.dex */
public class ts3 {
    private String a;
    private Map<String, String> b;
    private String c;
    private Date d;
    private Date e;
    private Date f;
    private long g;

    /* compiled from: ContentDisposition.java */
    /* loaded from: classes3.dex */
    public static class a<T extends a<T, V>, V extends ts3> {
        public String a;
        public String b;
        public Date c;
        public Date d;
        public Date e;
        public long f = -1;

        public a(String str) {
            this.a = str;
        }

        public V a() {
            return (V) new ts3(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public T b(Date date) {
            this.c = date;
            return this;
        }

        public T c(String str) {
            this.b = str;
            return this;
        }

        public T d(Date date) {
            this.d = date;
            return this;
        }

        public T e(Date date) {
            this.e = date;
            return this;
        }

        public T f(long j) {
            this.f = j;
            return this;
        }
    }

    public ts3(String str, String str2, Date date, Date date2, Date date3, long j) {
        this.a = str;
        this.c = str2;
        this.d = date;
        this.e = date2;
        this.f = date3;
        this.g = j;
    }

    private Date d(String str) throws ParseException {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return null;
        }
        return ws3.d().parse(str2);
    }

    private long e(String str) throws ParseException {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.valueOf(str2).longValue();
        } catch (NumberFormatException unused) {
            throw new ParseException(wo1.t("Error parsing size parameter of value, ", str2), 0);
        }
    }

    private void f() throws ParseException {
        this.c = this.b.get("filename");
        this.d = d("creation-date");
        this.e = d("modification-date");
        this.f = d("read-date");
        this.g = e(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
    }

    public static a o(String str) {
        return new a(str);
    }

    public void a(StringBuilder sb, String str, Date date) {
        if (date != null) {
            sb.append("; ");
            sb.append(str);
            sb.append("=\"");
            sb.append(ws3.d().format(date));
            sb.append("\"");
        }
    }

    public void b(StringBuilder sb, String str, Long l) {
        if (l.longValue() != -1) {
            sb.append("; ");
            sb.append(str);
            sb.append('=');
            sb.append(Long.toString(l.longValue()));
        }
    }

    public void c(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            wo1.h0(sb, "; ", str, "=\"", str2);
            sb.append("\"");
        }
    }

    public Date g() {
        return this.d;
    }

    public String h() {
        return this.c;
    }

    public Date i() {
        return this.e;
    }

    public Map<String, String> j() {
        return this.b;
    }

    public Date k() {
        return this.f;
    }

    public long l() {
        return this.g;
    }

    public String m() {
        return this.a;
    }

    public StringBuilder n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        c(sb, "filename", this.c);
        a(sb, "creation-date", this.d);
        a(sb, "modification-date", this.e);
        a(sb, "read-date", this.f);
        b(sb, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, Long.valueOf(this.g));
        return sb;
    }

    public String toString() {
        return n().toString();
    }

    public ts3(String str) throws ParseException {
        this(str, false);
    }

    public ts3(String str, boolean z) throws ParseException {
        this(kt3.g(str), z);
    }

    public ts3(kt3 kt3Var) throws ParseException {
        this(kt3Var, false);
    }

    public ts3(kt3 kt3Var, boolean z) throws ParseException {
        kt3Var.e();
        this.a = kt3Var.p();
        if (kt3Var.e()) {
            this.b = kt3.H(kt3Var, z);
        }
        Map<String, String> map = this.b;
        this.b = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
        f();
    }
}