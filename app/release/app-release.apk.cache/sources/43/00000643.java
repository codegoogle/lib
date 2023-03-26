package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.c.d;
import com.p7700g.p99005.zq5;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e extends ae implements Cloneable {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public int A;
    public int B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public String J;
    public long K;
    public long L;
    public String M;
    private int aA;
    private int aC;
    private int aD;
    private boolean aE;
    private long aF;
    private long aG;
    private String aH;
    private String aI;
    private String aJ;
    private int aK;
    private String aM;
    private String aN;
    private double aO;
    private String aP;
    private double aQ;
    private double aR;
    private ATRewardInfo aS;
    private Map<String, ATRewardInfo> aT;
    private Map<String, Object> aU;
    private String aV;
    private long aW;
    private String aX;
    private String aY;
    private int aZ;
    private int au;
    private String av;
    private String aw;
    private int ax;
    private int ay;
    private String az;
    private int ba;
    private String bb;
    private long bc;
    private int bd;
    private int be;
    private int bf;
    private int bg;
    private long bh;
    private int bj;
    private int bk;
    private int bm;
    private String bn;
    public int o;
    public int t;
    public String u;
    public String v;
    public int w;
    public double x;
    public String y;
    public int z;
    private int aB = -1;
    public String p = "";
    public int q = 0;
    public int r = 0;
    public int s = 0;
    private String aL = "unknow";
    private int bi = -1;
    private int bl = 1;

    private int W() {
        return this.bf;
    }

    private int X() {
        return this.be;
    }

    private String Y() {
        return this.C;
    }

    private int Z() {
        return this.z;
    }

    private void aa() {
        this.z = 1;
    }

    private String ab() {
        return this.u;
    }

    private boolean ac() {
        return this.bg == 9;
    }

    private String ad() {
        return this.av;
    }

    private String ae() {
        return this.p;
    }

    private int af() {
        return this.q;
    }

    private int ag() {
        return this.r;
    }

    private int ah() {
        return this.t;
    }

    private boolean ai() {
        return this.H;
    }

    private int aj() {
        return this.I;
    }

    private String ak() {
        return this.J;
    }

    private long al() {
        return this.K;
    }

    private long am() {
        return this.L;
    }

    private String an() {
        return this.M;
    }

    private void y(String str) {
        this.C = str;
    }

    private void z(String str) {
        this.u = str;
    }

    public final int A() {
        return this.ax;
    }

    public final int B() {
        return this.ay;
    }

    public final String C() {
        return this.az;
    }

    public final int D() {
        return this.aA;
    }

    public final int E() {
        return this.aB;
    }

    public final String F() {
        return this.aw;
    }

    public final int G() {
        return this.o;
    }

    public final int H() {
        return this.au;
    }

    public final long I() {
        return this.aF;
    }

    public final long J() {
        return this.aG;
    }

    public final int K() {
        return this.bi;
    }

    public final int L() {
        return this.bm;
    }

    public final e M() {
        try {
            return (e) clone();
        } catch (Throwable unused) {
            return this;
        }
    }

    public final void a(String str) {
        this.bn = str;
    }

    public final void b(int i2) {
        this.bk = i2;
    }

    public final void c(int i2) {
        this.bg = i2;
    }

    public final void d(int i2) {
        this.bf = i2;
    }

    public final void e(int i2) {
        this.be = i2;
    }

    public final void f(int i2) {
        this.bd = i2;
    }

    public final String g() {
        return this.aP;
    }

    public final String h() {
        return this.aV;
    }

    public final String i() {
        return this.y;
    }

    public final void j(int i2) {
        this.G = i2;
    }

    public final String k() {
        return this.aJ;
    }

    public final int l() {
        return this.aK;
    }

    public final String m() {
        return this.aL;
    }

    public final String n() {
        return this.aM;
    }

    public final String o() {
        return this.aN;
    }

    public final Map<String, ATRewardInfo> p() {
        return this.aT;
    }

    public final ATRewardInfo q() {
        return this.aS;
    }

    public final Map<String, Object> r() {
        return this.aU;
    }

    public final int s() {
        return this.A;
    }

    public final int t() {
        return this.B;
    }

    public final int u() {
        return this.w;
    }

    public final double v() {
        return this.x;
    }

    public final String w() {
        return this.aH;
    }

    public final int x() {
        int i2 = this.bg;
        if (i2 != 8) {
            return i2 != 9 ? 0 : 1;
        }
        return 2;
    }

    private void A(String str) {
        this.v = str;
    }

    private void E(int i2) {
        this.q = i2;
    }

    private void F(int i2) {
        this.r = i2;
    }

    private void G(int i2) {
        this.s = i2;
    }

    private void H(int i2) {
        this.t = i2;
    }

    private JSONObject I(int i2) {
        return super.A(i2);
    }

    public final void a(int i2) {
        this.bj = i2;
    }

    public final void b(String str) {
        this.bb = str;
    }

    public final void c() {
        if (this.ba != 1) {
            this.aZ = 1;
        }
    }

    public final String d() {
        return this.aY;
    }

    public final double e() {
        return this.aR;
    }

    public final double f() {
        return this.aO;
    }

    public final void g(int i2) {
        this.D = i2;
    }

    public final void h(int i2) {
        this.E = i2;
    }

    public final void i(int i2) {
        this.F = i2;
    }

    public final String j() {
        return this.aI;
    }

    public final void k(int i2) {
        this.aK = i2;
    }

    public final void l(int i2) {
        this.A = i2;
    }

    public final void m(int i2) {
        this.B = i2;
    }

    public final void n(int i2) {
        this.w = i2;
    }

    public final void o(int i2) {
        this.aC = i2;
    }

    public final void p(int i2) {
        this.aD = i2;
    }

    public final void q(int i2) {
        this.ax = i2;
    }

    public final void r(int i2) {
        this.ay = i2;
    }

    public final void s(int i2) {
        this.aA = i2;
    }

    public final void t(int i2) {
        this.aB = i2;
    }

    public final void u(int i2) {
        this.o = i2;
    }

    public final void v(int i2) {
        this.au = i2;
    }

    public final void w(int i2) {
        this.bi = i2;
    }

    public final void x(int i2) {
        this.bl = i2;
    }

    public final int y() {
        return this.aC;
    }

    public final int z() {
        return this.aD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: Exception -> 0x0351, TryCatch #0 {Exception -> 0x0351, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:26:0x0084, B:27:0x008b, B:28:0x009e, B:29:0x00a6, B:33:0x00bd, B:32:0x00b6, B:34:0x00c2, B:38:0x00f3, B:41:0x0108, B:43:0x010c, B:44:0x0110, B:46:0x0114, B:48:0x0118, B:50:0x011e, B:53:0x012c, B:55:0x0139, B:56:0x013e, B:51:0x0123, B:52:0x0128, B:37:0x00ec, B:57:0x0154, B:63:0x016f, B:62:0x016a, B:64:0x017f, B:68:0x01a9, B:67:0x01a2, B:69:0x01ae, B:72:0x01bd, B:73:0x01d6, B:75:0x0209, B:76:0x0210, B:81:0x0277, B:83:0x02ad, B:84:0x02b2, B:86:0x02cd, B:78:0x0249, B:80:0x0270, B:87:0x02d6, B:88:0x031e, B:22:0x004a), top: B:93:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139 A[Catch: Exception -> 0x0351, TryCatch #0 {Exception -> 0x0351, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:26:0x0084, B:27:0x008b, B:28:0x009e, B:29:0x00a6, B:33:0x00bd, B:32:0x00b6, B:34:0x00c2, B:38:0x00f3, B:41:0x0108, B:43:0x010c, B:44:0x0110, B:46:0x0114, B:48:0x0118, B:50:0x011e, B:53:0x012c, B:55:0x0139, B:56:0x013e, B:51:0x0123, B:52:0x0128, B:37:0x00ec, B:57:0x0154, B:63:0x016f, B:62:0x016a, B:64:0x017f, B:68:0x01a9, B:67:0x01a2, B:69:0x01ae, B:72:0x01bd, B:73:0x01d6, B:75:0x0209, B:76:0x0210, B:81:0x0277, B:83:0x02ad, B:84:0x02b2, B:86:0x02cd, B:78:0x0249, B:80:0x0270, B:87:0x02d6, B:88:0x031e, B:22:0x004a), top: B:93:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad A[Catch: Exception -> 0x0351, TryCatch #0 {Exception -> 0x0351, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:26:0x0084, B:27:0x008b, B:28:0x009e, B:29:0x00a6, B:33:0x00bd, B:32:0x00b6, B:34:0x00c2, B:38:0x00f3, B:41:0x0108, B:43:0x010c, B:44:0x0110, B:46:0x0114, B:48:0x0118, B:50:0x011e, B:53:0x012c, B:55:0x0139, B:56:0x013e, B:51:0x0123, B:52:0x0128, B:37:0x00ec, B:57:0x0154, B:63:0x016f, B:62:0x016a, B:64:0x017f, B:68:0x01a9, B:67:0x01a2, B:69:0x01ae, B:72:0x01bd, B:73:0x01d6, B:75:0x0209, B:76:0x0210, B:81:0x0277, B:83:0x02ad, B:84:0x02b2, B:86:0x02cd, B:78:0x0249, B:80:0x0270, B:87:0x02d6, B:88:0x031e, B:22:0x004a), top: B:93:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cd A[Catch: Exception -> 0x0351, TryCatch #0 {Exception -> 0x0351, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:26:0x0084, B:27:0x008b, B:28:0x009e, B:29:0x00a6, B:33:0x00bd, B:32:0x00b6, B:34:0x00c2, B:38:0x00f3, B:41:0x0108, B:43:0x010c, B:44:0x0110, B:46:0x0114, B:48:0x0118, B:50:0x011e, B:53:0x012c, B:55:0x0139, B:56:0x013e, B:51:0x0123, B:52:0x0128, B:37:0x00ec, B:57:0x0154, B:63:0x016f, B:62:0x016a, B:64:0x017f, B:68:0x01a9, B:67:0x01a2, B:69:0x01ae, B:72:0x01bd, B:73:0x01d6, B:75:0x0209, B:76:0x0210, B:81:0x0277, B:83:0x02ad, B:84:0x02b2, B:86:0x02cd, B:78:0x0249, B:80:0x0270, B:87:0x02d6, B:88:0x031e, B:22:0x004a), top: B:93:0x0008 }] */
    @Override // com.anythink.core.common.e.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject A(int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject A = super.A(i2);
        try {
            A.put("nw_ver", this.u);
            int i3 = this.aB;
            if (i3 != -1) {
                A.put("refresh", i3);
            }
            if (!TextUtils.isEmpty(this.aY)) {
                A.put("tp_bid_id", this.aY);
            }
            if ("4".equals(this.ak)) {
                A.put("ad_type", this.bi);
            }
            if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 13) {
                A.put("extra", this.aX);
            }
            switch (i2) {
                case 1:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put("aprn_auto_req", x());
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("ad_reqt", this.bh);
                    break;
                case 2:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put("aprn_auto_req", x());
                    A.put("status", this.r);
                    A.put("filledtime", this.aG);
                    A.put("flag", this.s);
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("data_ft", this.aF);
                    break;
                case 4:
                    str = "aprn_auto_req";
                    A.put(com.anythink.expressad.foundation.d.d.h, this.D);
                    A.put("ahs", this.E);
                    A.put("pds", this.F);
                    A.put("phs", this.G);
                    str2 = "phs";
                    A.put("cl_imp", this.aZ);
                    if (!TextUtils.isEmpty(this.bn)) {
                        A.put(d.a.i, this.bn);
                    }
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put(str, x());
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("myoffer_showtype", this.z);
                    if (!TextUtils.isEmpty(this.C)) {
                        A.put("scenario", this.C);
                    }
                    A.put(com.anythink.expressad.foundation.d.d.h, this.D);
                    A.put("ahs", this.E);
                    A.put("pds", this.F);
                    A.put(str2, this.G);
                    if (i2 == 6) {
                        A.put("cl_s_type", this.bl);
                        break;
                    }
                    break;
                case 6:
                    str = "aprn_auto_req";
                    str2 = "phs";
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put(str, x());
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("myoffer_showtype", this.z);
                    if (!TextUtils.isEmpty(this.C)) {
                    }
                    A.put(com.anythink.expressad.foundation.d.d.h, this.D);
                    A.put("ahs", this.E);
                    A.put("pds", this.F);
                    A.put(str2, this.G);
                    if (i2 == 6) {
                    }
                    break;
                case 7:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put("aprn_auto_req", x());
                    A.put("progress", this.t);
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    break;
                case 8:
                case 9:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("auto_req", this.q);
                    A.put("aprn_auto_req", x());
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    if (!TextUtils.isEmpty(this.C)) {
                        A.put("scenario", this.C);
                        break;
                    }
                    break;
                case 10:
                    A.put("isload", this.H ? 1 : 0);
                    A.put("reason", this.I);
                    A.put("gro_id", this.au);
                    A.put("req_par", this.bj);
                    A.put("req_par_num", this.bk);
                    break;
                case 11:
                    A.put("auto_req", this.q);
                    A.put("gro_id", this.au);
                    A.put("bidrequesttime", this.K);
                    A.put("bidresponsetime", this.L);
                    A.put("bidresponselist", TextUtils.isEmpty(this.M) ? zq5.e : new JSONArray(this.M));
                    break;
                case 12:
                    A.put("loadtime", this.aG);
                    A.put("gro_id", this.au);
                    int i4 = this.I;
                    if (i4 == 5 || i4 == 9) {
                        A.put("reason", i4);
                    }
                    A.put("req_par", this.bj);
                    A.put("req_par_num", this.bk);
                    break;
                case 13:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("as_result", !TextUtils.isEmpty(this.J) ? zq5.e : new JSONArray(this.J));
                    A.put("new_req_id", this.v);
                    A.put("auto_req", this.q);
                    if (this.v == null && this.aj == null) {
                        A.put("req_id_match", 0);
                    }
                    str3 = this.v;
                    if (str3 == null && (str4 = this.aj) != null) {
                        if (str3.equals(str4)) {
                            A.put("req_id_match", 0);
                        } else {
                            A.put("req_id_match", 1);
                        }
                    } else {
                        A.put("req_id_match", 1);
                    }
                    A.put("myoffer_showtype", this.z);
                    if (!TextUtils.isEmpty(this.C)) {
                        A.put("scenario", this.C);
                    }
                    A.put(com.anythink.expressad.foundation.d.d.h, this.D);
                    A.put("ahs", this.E);
                    A.put("pds", this.F);
                    A.put("phs", this.G);
                    break;
                case 15:
                    A.put("gro_id", this.au);
                    A.put("bidresponselist", TextUtils.isEmpty(this.M) ? zq5.e : new JSONArray(this.M));
                    break;
                case 16:
                    A.put("ad_ch_st", this.bf);
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("gro_id", this.au);
                    A.put("bidtype", this.w);
                    A.put("bidprice", String.valueOf(this.x));
                    A.put("as_result", !TextUtils.isEmpty(this.J) ? zq5.e : new JSONArray(this.J));
                    A.put("new_req_id", this.v);
                    A.put("auto_req", this.q);
                    if (this.v == null) {
                        A.put("req_id_match", 0);
                        break;
                    }
                    str3 = this.v;
                    if (str3 == null) {
                        break;
                    }
                    A.put("req_id_match", 1);
                    A.put("myoffer_showtype", this.z);
                    if (!TextUtils.isEmpty(this.C)) {
                    }
                    A.put(com.anythink.expressad.foundation.d.d.h, this.D);
                    A.put("ahs", this.E);
                    A.put("pds", this.F);
                    A.put("phs", this.G);
                    break;
                case 18:
                case 20:
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("app_nm", this.bb);
                    break;
                case 19:
                    A.put("dl_ts", this.bc);
                    A.put("unit_id", this.aH);
                    A.put("nw_firm_id", this.o);
                    A.put("app_nm", this.bb);
                    break;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return A;
    }

    public final void a(long j2) {
        this.bh = j2;
    }

    public final void b(long j2) {
        this.bc = j2;
    }

    public final void d(String str) {
        this.aP = str;
    }

    public final void e(String str) {
        this.aV = str;
    }

    public final void f(String str) {
        this.y = str;
    }

    public final void g(String str) {
        this.aI = str;
    }

    public final void h(String str) {
        this.aJ = str;
    }

    public final void i(String str) {
        this.aL = str;
    }

    public final void j(String str) {
        this.aM = str;
    }

    public final void k(String str) {
        this.aN = str;
    }

    public final void l(String str) {
        this.aH = str;
    }

    public final void m(String str) {
        this.az = str;
    }

    public final void n(String str) {
        this.aw = str;
    }

    public final void o(String str) {
        this.av = str;
    }

    public final void p(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.p = str;
    }

    public final void q(String str) {
        this.aX = str;
    }

    public final void r(String str) {
        this.J = str;
    }

    public final void s(String str) {
        this.M = str;
    }

    public final void y(int i2) {
        this.bm = i2;
    }

    public final void z(int i2) {
        this.I = i2;
    }

    public final int a() {
        return this.bd;
    }

    public final void b() {
        this.ba = 1;
    }

    public final void c(String str) {
        this.aY = str;
    }

    public final void d(long j2) {
        this.aG = j2;
    }

    public final void e(long j2) {
        this.K = j2;
    }

    public final void f(long j2) {
        this.L = j2;
    }

    public final void a(double d2) {
        this.aR = d2;
    }

    public final void b(double d2) {
        this.aO = d2;
    }

    public final void c(double d2) {
        this.x = d2;
    }

    public final void a(Map<String, ATRewardInfo> map) {
        this.aT = map;
    }

    public final void b(Map<String, Object> map) {
        this.aU = map;
    }

    public final void c(long j2) {
        this.aF = j2;
    }

    private void b(boolean z) {
        this.aE = z;
    }

    public final void a(ATRewardInfo aTRewardInfo) {
        this.aS = aTRewardInfo;
    }

    public final void a(boolean z) {
        this.H = z;
    }

    private void a(int i2, JSONObject jSONObject) {
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 13) {
            jSONObject.put("extra", this.aX);
        }
    }
}