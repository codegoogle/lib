package com.p7700g.p99005;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: classes2.dex */
public class wt1 implements gq1 {
    private static final String c = "@#&=*+-_.,:!?()/~'%;$";
    private final xt1 d;
    @z1
    private final URL e;
    @z1
    private final String f;
    @z1
    private String g;
    @z1
    private URL h;
    @z1
    private volatile byte[] i;
    private int j;

    public wt1(URL url) {
        this(url, xt1.b);
    }

    private byte[] d() {
        if (this.i == null) {
            this.i = c().getBytes(gq1.b);
        }
        return this.i;
    }

    private String f() {
        if (TextUtils.isEmpty(this.g)) {
            String str = this.f;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) x02.d(this.e)).toString();
            }
            this.g = Uri.encode(str, c);
        }
        return this.g;
    }

    private URL g() throws MalformedURLException {
        if (this.h == null) {
            this.h = new URL(f());
        }
        return this.h;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f;
        return str != null ? str : ((URL) x02.d(this.e)).toString();
    }

    public Map<String, String> e() {
        return this.d.a();
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof wt1) {
            wt1 wt1Var = (wt1) obj;
            return c().equals(wt1Var.c()) && this.d.equals(wt1Var.d);
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = c().hashCode();
            this.j = hashCode;
            this.j = this.d.hashCode() + (hashCode * 31);
        }
        return this.j;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public wt1(String str) {
        this(str, xt1.b);
    }

    public wt1(URL url, xt1 xt1Var) {
        this.e = (URL) x02.d(url);
        this.f = null;
        this.d = (xt1) x02.d(xt1Var);
    }

    public wt1(String str, xt1 xt1Var) {
        this.e = null;
        this.f = x02.b(str);
        this.d = (xt1) x02.d(xt1Var);
    }
}