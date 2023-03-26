package com.p7700g.p99005;

import com.p7700g.p99005.x31;

/* compiled from: SharedPrefsStorageProvider.java */
/* loaded from: classes2.dex */
public class d91 implements a91 {
    @x1
    private static final String a = "anchorfree:ucr:pref:upload-time";
    @x1
    private static final String b = "anchorfree:ucr:pref:cache-record";
    @x1
    private static final String c = "anchorfree:ucr:pref:tracking-did";
    @x1
    private final x31 d;

    public d91(@x1 x31 x31Var) {
        this.d = x31Var;
    }

    @x1
    private String g(@x1 String str) {
        return String.format("%s_%s", b, str);
    }

    @Override // com.p7700g.p99005.a91
    public void a(@x1 String str, @x1 String str2, @x1 String str3) {
        this.d.c().b(g(str), str3).a();
    }

    @Override // com.p7700g.p99005.a91
    public void b(@x1 String str) {
        this.d.c().b(c, str).a();
    }

    @Override // com.p7700g.p99005.a91
    public long c(@x1 String str) {
        x31 x31Var = this.d;
        return x31Var.a(a + str, 0L);
    }

    @Override // com.p7700g.p99005.a91
    public void d(@x1 String str, long j) {
        x31.a c2 = this.d.c();
        c2.c(a + str, j).a();
    }

    @Override // com.p7700g.p99005.a91
    @x1
    public String e(@x1 String str, @x1 String str2) {
        return this.d.e(g(str), "");
    }

    @Override // com.p7700g.p99005.a91
    @x1
    public String f() {
        return this.d.e(c, "");
    }
}