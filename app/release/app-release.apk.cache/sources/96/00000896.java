package com.anythink.expressad.mbbanner.a.b;

import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.j;

/* loaded from: classes2.dex */
public final class c {
    public static final String a = "2000067";
    public static final String b = "2000068";
    public static final String c = "2000069";
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l;
    private boolean m;

    private c() {
    }

    private c a(boolean z) {
        this.m = z;
        return this;
    }

    private String b() {
        return this.d;
    }

    private String c() {
        return this.e;
    }

    private String d() {
        return this.f;
    }

    private String e() {
        return this.g;
    }

    private String f() {
        return this.h;
    }

    private String g() {
        return this.i;
    }

    private String h() {
        return this.j;
    }

    private String i() {
        return this.k;
    }

    private int j() {
        return this.l;
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            sb.append("unit_id=");
            sb.append(this.e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.g)) {
            sb.append("cid=");
            sb.append(this.g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append("rid=");
            sb.append(this.h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.i)) {
            sb.append("rid_n=");
            sb.append(this.i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.j)) {
            sb.append("creative_id=");
            sb.append(this.j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.k)) {
            sb.append("reason=");
            sb.append(this.k);
            sb.append("&");
        }
        if (this.l != 0) {
            sb.append("result=");
            sb.append(this.l);
            sb.append("&");
        }
        if (this.m) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        m.a();
        sb.append(j.a());
        sb.append("&");
        if (!TextUtils.isEmpty(this.d)) {
            sb.append("key=");
            sb.append(this.d);
        }
        return sb.toString();
    }

    private static c a() {
        return new c();
    }

    private c b(String str) {
        this.e = str;
        return this;
    }

    private c c(String str) {
        this.f = str;
        return this;
    }

    private c d(String str) {
        this.g = str;
        return this;
    }

    private c e(String str) {
        this.h = str;
        return this;
    }

    private c f(String str) {
        this.i = str;
        return this;
    }

    private c g(String str) {
        this.j = str;
        return this;
    }

    private c h(String str) {
        this.k = str;
        return this;
    }

    private c a(String str) {
        this.d = str;
        return this;
    }

    private c a(int i) {
        this.l = i;
        return this;
    }
}