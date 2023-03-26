package com.p7700g.p99005;

import android.text.TextUtils;

/* compiled from: AccessTokenRepository.java */
/* loaded from: classes.dex */
public class w11 implements vs0 {
    @x1
    public static final String a = "com.anchorfree.hydrasdk.KEY_ACCESS_TOKEN";
    @x1
    private final x31 b;
    @x1
    private final String c;

    public w11(@x1 x31 x31Var, @x1 String str) {
        this.b = x31Var;
        this.c = str;
    }

    @x1
    private String d() {
        return TextUtils.isEmpty(this.c) ? a : String.format("%s.%s", a, this.c);
    }

    @x1
    public static String e(@x1 String str) {
        return TextUtils.isEmpty(str) ? a : String.format("%s.%s", a, str);
    }

    @Override // com.p7700g.p99005.vs0
    @x1
    public String a() {
        String e = this.b.e(d(), "");
        return TextUtils.isEmpty(e) ? this.b.e(a, "") : e;
    }

    @Override // com.p7700g.p99005.vs0
    public boolean b() {
        return !TextUtils.isEmpty(a());
    }

    @Override // com.p7700g.p99005.vs0
    public void c(@x1 String str) {
        this.b.c().b(e(this.c), str).a();
    }

    @Override // com.p7700g.p99005.vs0
    public void reset() {
        this.b.c().remove(d()).remove(a).a();
    }
}