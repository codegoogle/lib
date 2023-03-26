package com.p7700g.p99005;

import android.text.TextUtils;
import com.google.gson.Gson;

/* compiled from: CredentialsStorage.java */
/* loaded from: classes.dex */
public class a31 implements ss0 {
    @x1
    private static final kj1 a = kj1.b("CredentialsStorage");
    @x1
    private static final String b = "com.anchorfree.hydrasdk.credentials.CREDENTIALS";
    @x1
    private static final String c = "com.anchorfree.hydrasdk.credentials.EXP_DATE";
    @x1
    private static final String d = "com.anchorfree.hydrasdk.credentials.VERSION";
    @x1
    private static final String e = "com.anchorfree.hydrasdk.credentials.COUNTRY";
    @x1
    private static final String f = "com.anchorfree.hydrasdk.credentials.REQ_COUNTRY";
    @x1
    private static final String g = "com.anchorfree.hydrasdk.credentials.CONNECTION_TYPE";
    private static final int h = 3;
    @x1
    private final x31 i;
    @x1
    private final String k;
    @x1
    private final Gson j = new Gson();
    @x1
    private String l = "";

    public a31(@x1 x31 x31Var, @x1 String str) {
        this.i = x31Var;
        this.k = str;
    }

    @x1
    private String e(@x1 String str) {
        return wo1.D(new StringBuilder(), this.k, "_", str);
    }

    private boolean f() {
        return this.i.a(e(c), 0L) >= System.currentTimeMillis();
    }

    private boolean g(@x1 String str, @x1 String str2, @x1 nr0 nr0Var, @x1 String str3) {
        String e2 = this.i.e(e(f), "");
        String concat = str.concat(str2.concat(str3));
        boolean j = j();
        boolean z = concat.equals(e2) && i(nr0Var) && f() && j;
        a.c("Load creds connection_type: %s stored country: %s reqCountry: %s version: %s valid: %s", nr0Var, e2, concat, Boolean.valueOf(j), Boolean.valueOf(z));
        return z;
    }

    @z1
    private ft0 h() {
        String e2 = this.i.e(e(b), "");
        if (!TextUtils.isEmpty(e2)) {
            try {
                return (ft0) this.j.n(e2, ft0.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private boolean i(@x1 nr0 nr0Var) {
        String e2 = this.i.e(e(g), "");
        if (TextUtils.isEmpty(e2)) {
            return false;
        }
        return nr0Var.equals(nr0.a(e2));
    }

    private boolean j() {
        return this.i.a(e(d), 3L) == 3;
    }

    @Override // com.p7700g.p99005.ss0
    @z1
    public ft0 a(@x1 String str, @x1 String str2, @x1 nr0 nr0Var, @x1 String str3) {
        if (g(str, str2, nr0Var, str3)) {
            return h();
        }
        reset();
        return null;
    }

    @Override // com.p7700g.p99005.ss0
    @z1
    public ft0 b() {
        if (f()) {
            return h();
        }
        reset();
        return null;
    }

    @Override // com.p7700g.p99005.ss0
    public void c(@x1 ft0 ft0Var, @x1 nr0 nr0Var, @x1 String str) {
        a.c("Store creds connection_type: %s reqCountry: %s privateGroup: %s", nr0Var, this.l, str);
        this.i.c().c(e(c), ft0Var.i()).b(e(b), this.j.z(ft0Var)).b(e(f), this.l).e(e(d), 3L).b(e(g), nr0Var.toString()).a();
    }

    @Override // com.p7700g.p99005.ss0
    public void d(@x1 String str, @x1 String str2, @x1 String str3) {
        String concat = str.concat(str2.concat(str3));
        this.l = concat;
        a.c("Will load for %s", concat);
    }

    @Override // com.p7700g.p99005.ss0
    public void reset() {
        a.c("Reset creds", new Object[0]);
        this.i.c().remove(e(b)).remove(e(c)).remove(e(g)).remove(e(f)).a();
    }
}