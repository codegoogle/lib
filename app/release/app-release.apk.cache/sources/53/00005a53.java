package com.p7700g.p99005;

import android.util.Base64;
import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class rn {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;

    public rn(@x1 String str, @x1 String str2, @x1 String str3, @x1 List<List<byte[]>> list) {
        this.a = (String) jp.l(str);
        this.b = (String) jp.l(str2);
        this.c = (String) jp.l(str3);
        this.d = (List) jp.l(list);
        this.e = 0;
        this.f = a(str, str2, str3);
    }

    private String a(@x1 String str, @x1 String str2, @x1 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @z1
    public List<List<byte[]>> b() {
        return this.d;
    }

    @p0
    public int c() {
        return this.e;
    }

    @i2({i2.a.LIBRARY})
    @x1
    public String d() {
        return this.f;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f;
    }

    @x1
    public String f() {
        return this.a;
    }

    @x1
    public String g() {
        return this.b;
    }

    @x1
    public String h() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder G = wo1.G("FontRequest {mProviderAuthority: ");
        G.append(this.a);
        G.append(", mProviderPackage: ");
        G.append(this.b);
        G.append(", mQuery: ");
        G.append(this.c);
        G.append(", mCertificates:");
        sb.append(G.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }

    public rn(@x1 String str, @x1 String str2, @x1 String str3, @p0 int i) {
        this.a = (String) jp.l(str);
        this.b = (String) jp.l(str2);
        this.c = (String) jp.l(str3);
        this.d = null;
        jp.a(i != 0);
        this.e = i;
        this.f = a(str, str2, str3);
    }
}