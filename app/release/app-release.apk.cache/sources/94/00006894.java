package com.p7700g.p99005;

import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.p7700g.p99005.xu0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: SessionConfigV2.java */
/* loaded from: classes.dex */
public class z51 {
    @x1
    public static final String a = "";
    @x1
    public static final String b = "bypass";
    @x1
    public static final String c = "vpn";
    @x1
    public static final String d = "block_dns";
    @x1
    public static final String e = "block_alert_page";
    @x1
    public static final String f = "proxy_peer";
    @z1
    private String g;
    @z1
    private String h;
    @z1
    private FireshieldConfig i;
    @z1
    private List<y51> j;
    @z1
    private co1 k;
    @z1
    private Map<String, String> l;
    @z1
    private String m;
    @z1
    private String n;
    @z1
    private String o;

    @x1
    public co1 a() {
        co1 co1Var = this.k;
        return co1Var == null ? co1.c() : co1Var;
    }

    @x1
    public FireshieldConfig b() {
        FireshieldConfig fireshieldConfig = this.i;
        return fireshieldConfig == null ? new FireshieldConfig.Builder().enabled(false).build() : fireshieldConfig;
    }

    @z1
    public List<y51> c() {
        return Collections.unmodifiableList(this.j);
    }

    @z1
    public Map<String, String> d() {
        return this.l;
    }

    @x1
    public String e() {
        String str = this.h;
        return str == null ? "" : str;
    }

    @x1
    public String f() {
        String str = this.n;
        return str == null ? xu0.e.a : str;
    }

    @z1
    public String g() {
        return this.o;
    }

    @x1
    public String h() {
        String str = this.m;
        return str == null ? "" : str;
    }

    @x1
    public String i() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("SessionConfig{");
        stringBuffer.append("virtualLocation='");
        stringBuffer.append(this.g);
        stringBuffer.append('\'');
        stringBuffer.append(", config=");
        stringBuffer.append(this.i);
        stringBuffer.append(", dnsConfig=");
        stringBuffer.append(this.j);
        stringBuffer.append(", appPolicy=");
        stringBuffer.append(this.k);
        stringBuffer.append(", extras=");
        stringBuffer.append(this.l);
        stringBuffer.append(", transport='");
        stringBuffer.append(this.m);
        stringBuffer.append('\'');
        stringBuffer.append(", reason='");
        stringBuffer.append(this.n);
        stringBuffer.append('\'');
        stringBuffer.append(", sessionId='");
        stringBuffer.append(this.o);
        stringBuffer.append('\'');
        stringBuffer.append(", privateGroup='");
        stringBuffer.append(this.h);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}