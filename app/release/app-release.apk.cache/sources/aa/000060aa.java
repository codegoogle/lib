package com.p7700g.p99005;

import com.p7700g.p99005.ts3;
import java.text.ParseException;
import java.util.Date;

/* compiled from: FormDataContentDisposition.java */
/* loaded from: classes3.dex */
public class us3 extends ts3 {
    private String h;

    /* compiled from: FormDataContentDisposition.java */
    /* loaded from: classes3.dex */
    public static class a extends ts3.a<a, us3> {
        private String g;

        public a(String str) {
            super("form-data");
            this.g = str;
        }

        @Override // com.p7700g.p99005.ts3.a
        /* renamed from: g */
        public us3 a() {
            return new us3(this.a, this.g, this.b, this.c, this.d, this.e, this.f);
        }
    }

    public us3(String str, String str2, String str3, Date date, Date date2, Date date3, long j) {
        super(str, str3, date, date2, date3, j);
        this.h = str2;
        if (!m().equalsIgnoreCase("form-data")) {
            throw new IllegalArgumentException("The content dispostion type is not equal to form-data");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("The name parameter is not present");
        }
    }

    public static a q(String str) {
        return new a(str);
    }

    @Override // com.p7700g.p99005.ts3
    public StringBuilder n() {
        StringBuilder n = super.n();
        c(n, "name", this.h);
        return n;
    }

    public String p() {
        return this.h;
    }

    public us3(String str) throws ParseException {
        this(str, false);
    }

    public us3(String str, boolean z) throws ParseException {
        this(kt3.g(str), z);
    }

    public us3(kt3 kt3Var) throws ParseException {
        this(kt3Var, false);
    }

    public us3(kt3 kt3Var, boolean z) throws ParseException {
        super(kt3Var, z);
        if (m().equalsIgnoreCase("form-data")) {
            String str = j().get("name");
            this.h = str;
            if (str == null) {
                throw new IllegalArgumentException("The name parameter is not present");
            }
            return;
        }
        throw new IllegalArgumentException("The content dispostion type is not equal to form-data");
    }
}