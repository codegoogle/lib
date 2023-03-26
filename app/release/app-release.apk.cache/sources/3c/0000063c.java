package com.anythink.core.common.e;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ae {
    public static final String N = "ofm_tid_key";
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 6;
    public static final int U = 7;
    public static final int V = 8;
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;
    public static final int aa = 4;
    public static final int ab = 5;
    public static final int ac = 8;
    public static final String ad = "0";
    public static final String ae = "1";
    public static final String af = "2";
    public static final String ag = "3";
    public static final String ah = "4";
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public String am;
    public int an;
    public int ao;
    public String ap;
    public int aq;
    public int ar;
    public int as;
    public int at = -1;

    private int a() {
        return this.as;
    }

    private int b() {
        return this.aq;
    }

    private String c() {
        return this.am;
    }

    private int d() {
        return this.an;
    }

    private int e() {
        return this.ao;
    }

    public JSONObject A(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i);
            jSONObject.put("pl_id", this.ai);
            jSONObject.put("req_id", this.aj);
            if (!TextUtils.isEmpty(this.ak)) {
                jSONObject.put("format", Integer.parseInt(this.ak));
            }
            jSONObject.put("ps_id", com.anythink.core.common.b.m.a().p());
            String e = com.anythink.core.common.b.m.a().e(this.ai);
            if (!TextUtils.isEmpty(e)) {
                jSONObject.put("sessionid", e);
            }
            int i2 = this.at;
            if (i2 != -1) {
                jSONObject.put("traffic_group_id", i2);
            }
            if (this.as == 1) {
                jSONObject.put("ofm_tid", this.ar);
                jSONObject.put("ofm_system", this.aq);
                jSONObject.put(com.anythink.core.common.g.c.J, this.as);
            }
            jSONObject.put("asid", this.al);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void B(int i) {
        this.as = i;
    }

    public final void C(int i) {
        this.ar = i;
    }

    public final void D(int i) {
        this.at = i;
    }

    public final void N() {
        this.aq = 1;
    }

    public final int O() {
        return this.ar;
    }

    public final String P() {
        return this.ap;
    }

    public final int Q() {
        return this.at;
    }

    public final String R() {
        return this.al;
    }

    public final String S() {
        return this.ai;
    }

    public final String T() {
        return this.aj;
    }

    public final String U() {
        return this.ak;
    }

    public final String V() {
        String str = this.ak;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 3;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return com.anythink.expressad.foundation.g.a.f.a;
            case 1:
                return "reward";
            case 2:
                return com.anythink.expressad.foundation.g.a.f.e;
            case 3:
                return "inter";
            case 4:
                return com.anythink.expressad.foundation.g.a.f.f;
            default:
                return "none";
        }
    }

    public final void t(String str) {
        this.ap = str;
    }

    public final void u(String str) {
        this.al = str;
    }

    public final void v(String str) {
        this.ai = str;
    }

    public final void w(String str) {
        this.aj = str;
    }

    public final void x(String str) {
        this.ak = str;
    }

    private void a(String str) {
        this.am = str;
    }

    private void b(int i) {
        this.ao = i;
    }

    private void a(int i) {
        this.an = i;
    }
}