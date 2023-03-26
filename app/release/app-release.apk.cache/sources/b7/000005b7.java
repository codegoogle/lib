package com.anythink.core.c;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.b.o;
import com.anythink.core.common.e.ad;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.y;
import com.anythink.core.common.g.i;
import com.anythink.core.common.j.g;
import com.anythink.core.common.j.h;
import com.anythink.core.common.l;
import com.anythink.core.common.t;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yb0;
import com.p7700g.p99005.zg2;
import com.p7700g.p99005.zq5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    private String A;
    private ad B;
    private int C;
    private String D;
    private int E;
    private int F;
    private String G;
    private Map<String, Object> H;
    private Map<String, ATRewardInfo> I;
    private ATRewardInfo J;
    private String K;
    private String L;
    private long M;
    private String N;
    private long O;
    private int P;
    private long Q;
    private int R;
    private List<q> S;
    private s T;
    private long U;
    private double V;
    private String W;
    private List<String> X;
    private String Y;
    private String Z;
    private final String a = "Placement";
    private String aA;
    private double aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private String aa;
    private String ab;
    private long ac;
    private String ad;
    private String ae;
    private String af;
    private double ag;
    private String ah;
    private long ai;
    private List<af> aj;
    private long ak;
    private long al;
    private long am;
    private int an;
    private int ao;
    private int ap;
    private long aq;
    private JSONObject ar;
    private String as;
    private JSONObject at;
    private int au;
    private String av;
    private String aw;
    private String ax;
    private long ay;
    private String az;
    private long b;
    private long c;
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private long i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private List<af> s;
    private List<af> t;
    private int u;
    private int v;
    private long w;
    private long x;
    private long y;
    private int z;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String A = "req_w_time";
        public static final String B = "wf_loadts";
        public static final String C = "req_ug_type";
        public static final String D = "req_ug_numsp";
        public static final String E = "bf_ldf_rf_sw";
        public static final String F = "hb_start_time";
        public static final String G = "dsp_list";
        public static final String H = "bid_floor";
        public static final String I = "max_unit_ids";
        public static final String J = "xdb_list";
        public static final String K = "s2s_bd_max";
        public static final String L = "req_merge";
        public static final String M = "exclude_id_max";
        public static final String N = "install_id_max";
        public static final String O = "install_ids";
        public static final String P = "exclude_ids";
        public static final String Q = "is_test";
        public static final String R = "gsp_rates";
        private static final String S = "ps_id_timeout";
        private static final String T = "ps_ct";
        private static final String U = "ps_ct_out";
        private static final String V = "pucs";
        private static final String W = "ad_delivery_sw";
        private static final String X = "req_ug_num";
        private static final String Y = "unit_caps_d";
        private static final String Z = "unit_caps_h";
        public static final String a = "hb_bid_timeout";
        private static final String aA = "rw_n";
        private static final String aB = "rw_num";
        private static final String aC = "reward";
        private static final String aD = "currency";
        private static final String aE = "cc";
        private static final String aF = "exch_r";
        private static final String aG = "acct_cy";
        private static final String aa = "unit_pacing";
        private static final String ab = "wifi_auto_sw";
        private static final String ac = "show_type";
        private static final String ad = "refresh";
        private static final String ae = "ug_list";
        private static final String af = "ol_list";
        private static final String ag = "gro_id";
        private static final String ah = "hb_list";
        private static final String ai = "s2shb_list";
        private static final String aj = "format";
        private static final String ak = "auto_refresh";
        private static final String al = "auto_refresh_time";
        private static final String am = "s_t";
        private static final String an = "l_s_t";
        private static final String ao = "ra";
        private static final String ap = "asid";
        private static final String aq = "tp_ps";
        private static final String ar = "t_g_id";
        private static final String as = "s_id";
        private static final String at = "u_n_f_sw";
        private static final String au = "m_o";
        private static final String av = "m_o_s";
        private static final String aw = "m_o_ks";
        private static final String ax = "p_m_o";
        private static final String ay = "callback";
        private static final String az = "sc_list";
        public static final String b = "addr_bid";
        public static final String c = "load_fail_wtime";
        public static final String d = "load_cap";
        public static final String e = "load_cap_time";
        public static final String f = "cached_offers_num";
        public static final String g = "adx_list";
        public static final String h = "adx_st";
        public static final String i = "ilrd";
        public static final String j = "hb_list";
        public static final String k = "inh_list";
        public static final String l = "fbhb_bid_wtime";
        public static final String m = "burl_nt_firm";
        public static final String n = "wf_bid_addr";
        public static final String o = "ss_data";
        public static final String p = "cn_addr_bid";
        public static final String q = "cn_wf_bid_addr";
        public static final String r = "byuid_wt";
        public static final String s = "addr_bks";
        public static final String t = "addr_subbks";
        public static final String u = "s2sbks_list";
        public static final String v = "exch_rate_c2u";
        public static final String w = "doffer_list";
        public static final String x = "bottom_list";
        public static final String y = "bottom_reqts";
        public static final String z = "cb_w_time";
    }

    private int aA() {
        return this.l;
    }

    private ad aB() {
        return this.B;
    }

    private long aC() {
        return this.ay;
    }

    private String aD() {
        return this.aa;
    }

    private long aE() {
        return this.ak;
    }

    private long aF() {
        return this.al;
    }

    private JSONObject as() {
        return this.ar;
    }

    private int at() {
        return this.ao;
    }

    private List<af> au() {
        return this.aj;
    }

    private String av() {
        return this.ax;
    }

    private String aw() {
        return this.N;
    }

    private int ax() {
        return this.e;
    }

    private int ay() {
        return this.j;
    }

    private int az() {
        return this.k;
    }

    private void b(JSONObject jSONObject) {
        this.ar = jSONObject;
    }

    private void f(String str) {
        this.as = str;
    }

    public final List<af> A() {
        return this.s;
    }

    public final List<af> B() {
        return this.t;
    }

    public final long C() {
        return this.M;
    }

    public final Map<String, ATRewardInfo> D() {
        return this.I;
    }

    public final String E() {
        return this.K;
    }

    public final String F() {
        return this.L;
    }

    public final ATRewardInfo G() {
        return this.J;
    }

    public final Map<String, Object> H() {
        return this.H;
    }

    public final int I() {
        return this.F;
    }

    public final int J() {
        return this.C;
    }

    public final String K() {
        return this.D;
    }

    public final int L() {
        return this.E;
    }

    public final long M() {
        return this.x;
    }

    public final long N() {
        return this.y;
    }

    public final int O() {
        return this.z;
    }

    public final String P() {
        return this.A;
    }

    public final int Q() {
        return this.v;
    }

    public final long R() {
        return this.w;
    }

    public final int S() {
        return this.u;
    }

    public final long T() {
        return this.c;
    }

    public final int U() {
        return this.d;
    }

    public final int V() {
        return this.f;
    }

    public final long W() {
        return this.g;
    }

    public final long X() {
        return this.h;
    }

    public final long Y() {
        return this.i;
    }

    public final int Z() {
        return this.m;
    }

    public final JSONObject a() {
        return this.at;
    }

    public final String aa() {
        return this.n;
    }

    public final String ab() {
        return this.o;
    }

    public final String ac() {
        return this.p;
    }

    public final String ad() {
        return this.q;
    }

    public final long ae() {
        return this.O;
    }

    public final int af() {
        return this.P;
    }

    public final long ag() {
        return this.Q;
    }

    public final int ah() {
        return this.R;
    }

    public final String ai() {
        return this.ab;
    }

    public final String aj() {
        return this.az;
    }

    public final String ak() {
        return this.aA;
    }

    public final int al() {
        return this.aD;
    }

    public final int am() {
        return this.aC;
    }

    public final double an() {
        return this.aB;
    }

    public final int ao() {
        return this.aE;
    }

    public final int ap() {
        return this.aF;
    }

    public final boolean aq() {
        return this.e == 1;
    }

    public final boolean ar() {
        com.anythink.core.common.j.e.a("Placement", "Already cache time -- > " + (System.currentTimeMillis() - this.ay));
        return System.currentTimeMillis() - this.ay > this.b;
    }

    public final int c() {
        return this.au;
    }

    public final long d() {
        return this.aq;
    }

    public final int e() {
        return this.ap;
    }

    public final int g() {
        int i = this.an;
        if (i != 1) {
            if (i != 2) {
                return 1;
            }
            return this.ao;
        }
        return this.f;
    }

    public final long h() {
        return this.am;
    }

    public final String i() {
        return this.ah;
    }

    public final long j() {
        return this.ai;
    }

    public final double k() {
        return this.ag;
    }

    public final String l() {
        return this.ad;
    }

    public final String m() {
        return this.ae;
    }

    public final String n() {
        return this.af;
    }

    public final long o() {
        return this.ac;
    }

    public final String p() {
        return this.Z;
    }

    public final String q() {
        return this.Y;
    }

    public final List<String> r() {
        return this.X;
    }

    public final double s() {
        return this.V;
    }

    public final String t() {
        return this.W;
    }

    public final long u() {
        return this.U;
    }

    public final String v() {
        return this.r;
    }

    public final String w() {
        return this.av;
    }

    public final String x() {
        return this.aw;
    }

    public final s y() {
        return this.T;
    }

    public final List<q> z() {
        return this.S;
    }

    private void A(String str) {
        this.aa = str;
    }

    private void B(String str) {
        this.ab = str;
    }

    private void C(String str) {
        this.az = str;
    }

    private void D(String str) {
        this.aA = str;
    }

    private void a(JSONObject jSONObject) {
        this.at = jSONObject;
    }

    private void c(int i) {
        this.an = i;
    }

    private void d(int i) {
        this.ao = i;
    }

    private void e(long j) {
        this.U = j;
    }

    private void h(String str) {
        this.ad = str;
    }

    private void i(String str) {
        this.ae = str;
    }

    private void j(String str) {
        this.af = str;
    }

    private void k(String str) {
        this.Z = str;
    }

    private void l(String str) {
        this.Y = str;
    }

    private void m(String str) {
        this.W = str;
    }

    private void n(String str) {
        this.r = str;
    }

    private void o(String str) {
        this.av = str;
    }

    private void p(String str) {
        this.ax = str;
    }

    private void q(String str) {
        this.aw = str;
    }

    private void r(String str) {
        this.N = str;
    }

    private void s(String str) {
        this.K = str;
    }

    private void t(String str) {
        this.L = str;
    }

    private void u(String str) {
        this.D = str;
    }

    private void v(String str) {
        this.A = str;
    }

    private void w(String str) {
        this.n = str;
    }

    private void x(String str) {
        this.o = str;
    }

    private void y(String str) {
        this.p = str;
    }

    private void z(String str) {
        this.q = str;
    }

    public final String b() {
        return this.as;
    }

    public final int f() {
        return this.an;
    }

    private void a(int i) {
        this.au = i;
    }

    private void b(int i) {
        this.ap = i;
    }

    private void c(long j) {
        this.ai = j;
    }

    private void d(long j) {
        this.ac = j;
    }

    private void e(List<af> list) {
        this.t = list;
    }

    private void f(long j) {
        this.M = j;
    }

    private void h(long j) {
        this.y = j;
    }

    private void i(int i) {
        this.v = i;
    }

    private void j(int i) {
        this.u = i;
    }

    private void k(long j) {
        this.c = j;
    }

    private void l(int i) {
        this.e = i;
    }

    private void m(int i) {
        this.f = i;
    }

    private void n(long j) {
        this.i = j;
    }

    private void o(int i) {
        this.k = i;
    }

    private void p(int i) {
        this.l = i;
    }

    private void q(int i) {
        this.m = i;
    }

    private void r(int i) {
        this.P = i;
    }

    private void s(int i) {
        this.R = i;
    }

    private void t(int i) {
        this.aD = i;
    }

    private void u(int i) {
        this.aC = i;
    }

    private void v(int i) {
        this.aE = i;
    }

    private void w(int i) {
        this.aF = i;
    }

    private void a(long j) {
        this.aq = j;
    }

    private void b(long j) {
        this.am = j;
    }

    private void c(List<q> list) {
        this.S = list;
    }

    private void d(List<af> list) {
        this.s = list;
    }

    private void e(int i) {
        this.F = i;
    }

    private void f(int i) {
        this.C = i;
    }

    private void g(String str) {
        this.ah = str;
    }

    private void h(int i) {
        this.z = i;
    }

    private void i(long j) {
        this.w = j;
    }

    private void j(long j) {
        this.b = j;
    }

    private void k(int i) {
        this.d = i;
    }

    private void l(long j) {
        this.g = j;
    }

    private void m(long j) {
        this.h = j;
    }

    private void n(int i) {
        this.j = i;
    }

    private void o(long j) {
        this.ay = j;
    }

    private void p(long j) {
        this.O = j;
    }

    private void q(long j) {
        this.Q = j;
    }

    private void r(long j) {
        this.ak = j;
    }

    private void s(long j) {
        this.al = j;
    }

    private void a(List<af> list) {
        this.aj = list;
    }

    private void b(List<String> list) {
        this.X = list;
    }

    private void c(double d) {
        this.aB = d;
    }

    public static List<af> d(String str) {
        return a(str, 2);
    }

    private void g(int i) {
        this.E = i;
    }

    public final q e(String str) {
        List<q> list = this.S;
        if (list != null) {
            for (q qVar : list) {
                if (qVar.g() == null) {
                    qVar.a((k) this.T);
                }
                if (TextUtils.equals(str, qVar.k()) && !qVar.a(this.T)) {
                    return qVar;
                }
            }
            return null;
        }
        return null;
    }

    private void a(double d) {
        this.ag = d;
    }

    private void b(double d) {
        this.V = d;
    }

    public static List<af> c(String str) {
        return a(str, 8);
    }

    private void g(long j) {
        this.x = j;
    }

    private void a(s sVar) {
        this.T = sVar;
    }

    private void b(Map<String, Object> map) {
        this.H = map;
    }

    public static d b(String str) {
        long optLong;
        if (str == null) {
            return null;
        }
        try {
            d dVar = new d();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("ps_ct")) {
                dVar.b = 0L;
            } else {
                dVar.b = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                dVar.c = 0L;
            } else {
                dVar.c = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                dVar.d = 1;
            } else {
                dVar.d = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                dVar.e = 1;
            } else {
                dVar.e = jSONObject.optInt("ad_delivery_sw");
            }
            if (jSONObject.isNull("req_ug_num")) {
                dVar.f = -1;
            } else {
                dVar.f = jSONObject.optInt("req_ug_num");
            }
            if (jSONObject.isNull("unit_caps_d")) {
                dVar.g = -1L;
            } else {
                dVar.g = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                dVar.h = -1L;
            } else {
                dVar.h = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                dVar.i = -1L;
            } else {
                dVar.i = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                dVar.j = 0;
            } else {
                dVar.j = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull("show_type")) {
                dVar.k = 0;
            } else {
                dVar.k = jSONObject.optInt("show_type");
            }
            if (jSONObject.isNull("refresh")) {
                dVar.l = 0;
            } else {
                dVar.l = jSONObject.optInt("refresh");
            }
            if (jSONObject.isNull("gro_id")) {
                dVar.m = 0;
            } else {
                dVar.m = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                dVar.u = 0;
            } else {
                dVar.u = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                dVar.v = 0;
            } else {
                dVar.v = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                dVar.w = 0L;
            } else {
                dVar.w = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                dVar.x = yb0.g;
            } else {
                dVar.x = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(l.J)) {
                dVar.y = 1800000L;
            } else {
                dVar.y = jSONObject.optLong(l.J);
            }
            if (jSONObject.isNull("ra")) {
                dVar.z = -1;
            } else {
                dVar.z = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                dVar.A = "";
            } else {
                dVar.A = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                dVar.B = null;
            } else {
                try {
                    ad adVar = new ad();
                    JSONObject optJSONObject = jSONObject.optJSONObject("tp_ps");
                    adVar.a = optJSONObject.optInt("pucs") == 1;
                    adVar.b = optJSONObject.optLong("apdt");
                    adVar.c = optJSONObject.optInt("aprn");
                    adVar.d = optJSONObject.optInt("puas") == 1;
                    adVar.e = optJSONObject.optLong("cdt");
                    adVar.f = optJSONObject.optInt("ski_swt") == 1;
                    adVar.g = optJSONObject.optInt("aut_swt") == 1;
                    dVar.B = adVar;
                } catch (Exception unused) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                dVar.n = zq5.e;
            } else {
                dVar.n = jSONObject.optString("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                dVar.o = zq5.e;
            } else {
                dVar.o = jSONObject.optString("ol_list");
            }
            dVar.s = a(dVar.n, dVar.o);
            if (jSONObject.isNull("s2shb_list")) {
                dVar.p = zq5.e;
            } else {
                dVar.p = jSONObject.optString("s2shb_list");
            }
            if (jSONObject.isNull(a.g)) {
                dVar.aw = zq5.e;
            } else {
                dVar.aw = jSONObject.optString(a.g);
            }
            if (jSONObject.isNull(a.j)) {
                dVar.q = zq5.e;
            } else {
                dVar.q = jSONObject.optString(a.j);
            }
            if (jSONObject.isNull(a.k)) {
                dVar.r = zq5.e;
            } else {
                dVar.r = jSONObject.optString(a.k);
            }
            if (jSONObject.isNull(a.u)) {
                dVar.af = "";
            } else {
                dVar.af = jSONObject.optString(a.u);
            }
            if (jSONObject.isNull(a.w)) {
                dVar.az = zq5.e;
            } else {
                dVar.az = jSONObject.optString(a.w);
            }
            if (jSONObject.isNull("updateTime")) {
                dVar.ay = 0L;
                optLong = 0;
            } else {
                optLong = jSONObject.optLong("updateTime");
                dVar.ay = optLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                dVar.C = -1;
            } else {
                dVar.C = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull("s_id")) {
                dVar.D = "";
            } else {
                dVar.D = jSONObject.optString("s_id");
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                dVar.E = 0;
            } else {
                dVar.E = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                dVar.T = s.c(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                dVar.S = null;
            } else {
                dVar.S = a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), optLong, dVar.T);
            }
            if (jSONObject.isNull("p_m_o")) {
                dVar.F = 0;
            } else {
                dVar.F = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(i.a)) {
                dVar.H = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(i.a));
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.opt(next));
                }
                dVar.H = hashMap;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap hashMap2 = new HashMap();
                    Iterator<String> keys2 = jSONObject4.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        ATRewardInfo aTRewardInfo = new ATRewardInfo();
                        aTRewardInfo.rewardName = jSONObject5.optString("rw_n");
                        aTRewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        hashMap2.put(next2, aTRewardInfo);
                    }
                    dVar.I = hashMap2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    ATRewardInfo aTRewardInfo2 = new ATRewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        aTRewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        aTRewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    dVar.J = aTRewardInfo2;
                }
                if (!jSONObject3.isNull("currency")) {
                    dVar.K = jSONObject3.optString("currency");
                }
                if (!jSONObject3.isNull(com.anythink.expressad.d.a.b.h)) {
                    dVar.L = jSONObject3.optString(com.anythink.expressad.d.a.b.h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    dVar.V = jSONObject3.optDouble("exch_r", zg2.s);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    dVar.W = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(a.a)) {
                dVar.M = gc0.c;
            } else {
                dVar.M = jSONObject.optLong(a.a);
            }
            if (jSONObject.isNull(a.b)) {
                dVar.N = "";
            } else {
                dVar.N = jSONObject.optString(a.b);
            }
            if (jSONObject.isNull(a.c)) {
                dVar.O = gc0.c;
            } else {
                dVar.O = jSONObject.optLong(a.c);
            }
            if (jSONObject.isNull(a.d)) {
                dVar.P = -1;
            } else {
                dVar.P = jSONObject.optInt(a.d);
            }
            if (jSONObject.isNull(a.e)) {
                dVar.Q = yb0.g;
            } else {
                dVar.Q = jSONObject.optLong(a.e);
            }
            if (jSONObject.isNull(a.f)) {
                dVar.R = 2;
            } else {
                dVar.R = jSONObject.optInt(a.f);
            }
            if (jSONObject.isNull(a.i)) {
                dVar.av = null;
            } else {
                dVar.av = jSONObject.optString(a.i);
            }
            if (jSONObject.isNull(a.h)) {
                dVar.ax = "";
            } else {
                dVar.ax = jSONObject.optString(a.h);
            }
            if (jSONObject.isNull(a.l)) {
                dVar.U = 4000L;
            } else {
                dVar.U = jSONObject.optLong(a.l);
            }
            if (jSONObject.isNull(a.m)) {
                dVar.X = null;
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray(a.m);
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
                dVar.X = arrayList;
            }
            if (jSONObject.isNull(a.n)) {
                dVar.Y = "";
            } else {
                dVar.Y = jSONObject.optString(a.n);
            }
            if (jSONObject.isNull(a.o)) {
                dVar.Z = "";
            } else {
                dVar.Z = jSONObject.optString(a.o);
            }
            if (jSONObject.isNull(a.p)) {
                dVar.aa = "";
            } else {
                dVar.aa = jSONObject.optString(a.p);
            }
            if (jSONObject.isNull(a.q)) {
                dVar.ab = "";
            } else {
                dVar.ab = jSONObject.optString(a.q);
            }
            if (jSONObject.isNull(a.r)) {
                dVar.ac = 500L;
            } else {
                dVar.ac = jSONObject.optLong(a.r);
            }
            if (jSONObject.isNull(a.s)) {
                dVar.ad = "";
            } else {
                dVar.ad = jSONObject.optString(a.s);
            }
            if (jSONObject.isNull(a.t)) {
                dVar.ae = "";
            } else {
                dVar.ae = jSONObject.optString(a.t);
            }
            if (jSONObject.isNull(a.v)) {
                dVar.ag = 0.1614d;
            } else {
                dVar.ag = jSONObject.optDouble(a.v);
            }
            if (jSONObject.isNull(a.x)) {
                dVar.ah = zq5.e;
            } else {
                String optString = jSONObject.optString(a.x);
                dVar.ah = optString;
                dVar.aj = a(optString, 8);
            }
            if (jSONObject.isNull(a.y)) {
                dVar.ai = 1000L;
            } else {
                dVar.ai = jSONObject.optLong(a.y);
            }
            if (jSONObject.isNull(a.z)) {
                dVar.ak = 0L;
            } else {
                dVar.ak = jSONObject.optLong(a.z);
            }
            if (jSONObject.isNull(a.A)) {
                dVar.al = 2000L;
            } else {
                dVar.al = jSONObject.optLong(a.A);
            }
            if (jSONObject.isNull(a.B)) {
                dVar.am = -1L;
            } else {
                dVar.am = jSONObject.optLong(a.B);
            }
            if (jSONObject.isNull(a.C)) {
                dVar.an = 1;
            } else {
                dVar.an = jSONObject.optInt(a.C);
            }
            if (jSONObject.isNull(a.D)) {
                dVar.ao = 1;
            } else {
                dVar.ao = jSONObject.optInt(a.D);
            }
            if (jSONObject.isNull(a.E)) {
                dVar.ap = 2;
            } else {
                dVar.ap = jSONObject.optInt(a.E);
            }
            if (jSONObject.isNull(a.F)) {
                dVar.aq = 2000L;
            } else {
                dVar.aq = jSONObject.optLong(a.F);
            }
            if (jSONObject.isNull(a.G)) {
                dVar.aA = zq5.e;
            } else {
                dVar.aA = jSONObject.optString(a.G);
            }
            if (jSONObject.isNull("bid_floor")) {
                dVar.aB = zg2.s;
            } else {
                dVar.aB = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(a.I)) {
                dVar.ar = null;
            } else {
                dVar.ar = jSONObject.optJSONObject(a.I);
            }
            if (jSONObject.isNull(a.J)) {
                dVar.as = "";
            } else {
                dVar.as = jSONObject.optString(a.J);
            }
            if (jSONObject.isNull(a.K)) {
                dVar.aC = 0;
            } else {
                dVar.aC = jSONObject.optInt(a.K);
            }
            if (jSONObject.isNull(a.L)) {
                dVar.aD = 2;
            } else {
                dVar.aD = jSONObject.optInt(a.L);
            }
            try {
                dVar.t = a(dVar.p, dVar.aw, dVar.q, dVar.r, dVar.af, dVar.az, dVar.aA);
            } catch (Exception unused2) {
            }
            if (jSONObject.isNull(a.M)) {
                dVar.aF = 0;
            } else {
                dVar.aF = jSONObject.optInt(a.M);
            }
            if (jSONObject.isNull(a.N)) {
                dVar.aE = 0;
            } else {
                dVar.aE = jSONObject.optInt(a.N);
            }
            if (jSONObject.isNull("is_test")) {
                dVar.au = 2;
            } else {
                dVar.au = jSONObject.optInt("is_test");
            }
            dVar.at = jSONObject.optJSONObject(a.R);
            return dVar;
        } catch (Exception unused3) {
            return null;
        }
    }

    public final boolean a(String str) {
        List<af> list = this.t;
        if (list == null) {
            return false;
        }
        for (af afVar : list) {
            if (TextUtils.equals(str, afVar.t())) {
                return true;
            }
        }
        return false;
    }

    private void a(Map<String, ATRewardInfo> map) {
        this.I = map;
    }

    private void a(ATRewardInfo aTRewardInfo) {
        this.J = aTRewardInfo;
    }

    private void a(ad adVar) {
        this.B = adVar;
    }

    public static List<af> a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        List<af> a2 = a(str, 1);
        List<af> a3 = a(str2, 3);
        List<af> a4 = a(str3, 2);
        List<af> a5 = a(str4, 5);
        List<af> a6 = a(str5, 6);
        List<af> a7 = a(str6, 7);
        List<af> a8 = a(str7, 3);
        a2.addAll(a3);
        a2.addAll(a4);
        a2.addAll(a5);
        a2.addAll(a6);
        a2.addAll(a7);
        a2.addAll(a8);
        return a2;
    }

    public static List<af> a(String str, String str2) {
        List<af> a2 = a(str, 0);
        a2.addAll(a(str2, 4));
        Collections.sort(a2);
        return a2;
    }

    private static List<af> a(String str, int i) {
        String str2;
        boolean z;
        JSONArray jSONArray;
        int i2;
        String str3;
        String str4;
        boolean z2;
        ArrayList arrayList;
        String str5;
        String str6;
        int i3;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4 = i;
        String str11 = "pacing";
        String str12 = l.s;
        String str13 = l.r;
        String str14 = l.t;
        String str15 = l.z;
        if (i4 == 0 || i4 == 4 || i4 == 8) {
            str2 = l.E;
            z = false;
        } else {
            str2 = l.E;
            z = true;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            String str16 = l.D;
            JSONArray jSONArray2 = new JSONArray(str);
            String str17 = "unit_id";
            int i5 = 0;
            while (i5 < jSONArray2.length()) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i5);
                if (jSONObject != null) {
                    jSONArray = jSONArray2;
                    af afVar = new af();
                    afVar.e(i4);
                    i2 = i5;
                    afVar.d(z ? 1 : 0);
                    if (jSONObject.isNull(str15)) {
                        afVar.c("");
                    } else {
                        afVar.c(jSONObject.optString(str15));
                    }
                    str4 = str15;
                    if (jSONObject.isNull(l.w)) {
                        afVar.b(-1);
                    } else {
                        afVar.b(jSONObject.optInt(l.w));
                    }
                    if (jSONObject.isNull(l.x)) {
                        afVar.c(-1);
                    } else {
                        afVar.c(jSONObject.optInt(l.x));
                    }
                    if (jSONObject.isNull("content")) {
                        afVar.b("");
                    } else {
                        afVar.b(jSONObject.optString("content"));
                    }
                    if (jSONObject.isNull("nw_firm_id")) {
                        afVar.a(-1);
                    } else {
                        afVar.a(jSONObject.optInt("nw_firm_id"));
                    }
                    if (jSONObject.isNull(l.v)) {
                        afVar.a("");
                    } else {
                        afVar.a(jSONObject.optString(l.v));
                    }
                    if (jSONObject.isNull(l.A)) {
                        afVar.d("unknown");
                    } else {
                        afVar.d(jSONObject.optString(l.A));
                    }
                    z2 = z;
                    if (jSONObject.isNull(str14)) {
                        afVar.c(0L);
                    } else {
                        afVar.c(jSONObject.optInt(str14));
                    }
                    if (jSONObject.isNull(str13)) {
                        afVar.d(0L);
                    } else {
                        afVar.d(jSONObject.optInt(str13));
                    }
                    if (jSONObject.isNull(str12)) {
                        afVar.h(1);
                    } else {
                        afVar.h(jSONObject.optInt(str12));
                    }
                    if (jSONObject.isNull(str11)) {
                        afVar.e(-1L);
                    } else {
                        afVar.e(jSONObject.optLong(str11));
                    }
                    str6 = str17;
                    if (jSONObject.isNull(str6)) {
                        afVar.e("");
                    } else {
                        afVar.e(jSONObject.optString(str6));
                    }
                    str5 = str16;
                    str7 = str11;
                    str8 = str12;
                    if (jSONObject.isNull(str5)) {
                        afVar.a(zg2.s);
                        str9 = str13;
                        str3 = str14;
                    } else {
                        str9 = str13;
                        str3 = str14;
                        afVar.a(jSONObject.optDouble(str5, zg2.s));
                    }
                    str10 = str2;
                    if (jSONObject.isNull(str10)) {
                        afVar.f(2000L);
                    } else {
                        afVar.f(jSONObject.optInt(str10));
                    }
                    if (jSONObject.isNull(l.G)) {
                        afVar.f("");
                    } else {
                        afVar.f(jSONObject.optString(l.G));
                    }
                    if (jSONObject.isNull(l.H)) {
                        afVar.i(0);
                    } else {
                        afVar.i(jSONObject.optInt(l.H));
                    }
                    if (jSONObject.isNull(l.I)) {
                        afVar.j(3000);
                    } else {
                        afVar.j(jSONObject.optInt(l.I));
                    }
                    if (jSONObject.isNull("payload")) {
                        afVar.g("");
                    } else {
                        afVar.g(jSONObject.optString("payload"));
                    }
                    if (jSONObject.isNull("error")) {
                        afVar.h("");
                    } else {
                        afVar.h(jSONObject.optString("error"));
                    }
                    if (jSONObject.isNull(l.J)) {
                        afVar.g(1800000L);
                    } else {
                        afVar.g(jSONObject.optLong(l.J));
                    }
                    if (jSONObject.isNull(l.K)) {
                        afVar.h(-1L);
                    } else {
                        afVar.h(jSONObject.optLong(l.K));
                    }
                    if (jSONObject.isNull(l.L)) {
                        afVar.b(1800000L);
                    } else {
                        afVar.b(jSONObject.optLong(l.L));
                    }
                    if (jSONObject.isNull(l.ai)) {
                        afVar.g(z2 ? 0 : 1);
                    } else {
                        afVar.g(jSONObject.optInt(l.ai));
                    }
                    if (jSONObject.isNull(l.M)) {
                        afVar.k(1);
                    } else {
                        afVar.k(jSONObject.optInt(l.M));
                    }
                    if (jSONObject.isNull(l.N)) {
                        afVar.l(1);
                    } else {
                        afVar.l(jSONObject.optInt(l.N));
                    }
                    if (jSONObject.isNull(l.O)) {
                        afVar.n(-1);
                    } else {
                        afVar.n(jSONObject.optInt(l.O));
                    }
                    if (jSONObject.isNull("precision")) {
                        afVar.i("publisher_defined");
                    } else {
                        afVar.i(jSONObject.optString("precision"));
                    }
                    if (jSONObject.isNull(l.Q)) {
                        afVar.i(0L);
                    } else {
                        afVar.i(jSONObject.optLong(l.Q));
                    }
                    if (jSONObject.isNull(l.R)) {
                        afVar.j(0L);
                    } else {
                        afVar.j(jSONObject.optLong(l.R));
                    }
                    if (jSONObject.isNull(l.S)) {
                        afVar.b(zg2.s);
                    } else {
                        afVar.b(jSONObject.optDouble(l.S, zg2.s));
                    }
                    if (jSONObject.isNull(l.T)) {
                        afVar.o(1);
                    } else {
                        afVar.o(jSONObject.optInt(l.T));
                    }
                    if (jSONObject.isNull(l.U)) {
                        afVar.p(1);
                    } else {
                        afVar.p(jSONObject.optInt(l.U));
                    }
                    if (jSONObject.isNull(l.V)) {
                        afVar.q(2);
                    } else {
                        afVar.q(jSONObject.optInt(l.V));
                    }
                    if (jSONObject.isNull(l.W)) {
                        afVar.f(1);
                    } else {
                        afVar.f(jSONObject.optInt(l.W));
                    }
                    if (jSONObject.isNull(l.Z)) {
                        afVar.r(2);
                    } else {
                        afVar.r(jSONObject.optInt(l.Z));
                    }
                    if (jSONObject.isNull(l.X)) {
                        afVar.t(2);
                    } else {
                        afVar.t(jSONObject.optInt(l.X));
                    }
                    if (jSONObject.isNull(l.Y)) {
                        afVar.s(0);
                    } else {
                        afVar.s(jSONObject.optInt(l.Y));
                    }
                    if (jSONObject.isNull(l.aa)) {
                        afVar.u(1);
                    } else {
                        afVar.u(jSONObject.optInt(l.aa));
                    }
                    if (jSONObject.isNull("oid")) {
                        afVar.j("");
                    } else {
                        afVar.j(jSONObject.optString("oid"));
                    }
                    i3 = i;
                    if (i3 == 7) {
                        com.anythink.core.common.d.c.a(m.a().e()).a(afVar.t(), afVar.W());
                    }
                    if (jSONObject.isNull(l.ab)) {
                        afVar.v(2);
                    } else {
                        afVar.v(jSONObject.optInt(l.ab));
                    }
                    if (jSONObject.isNull("ad_type")) {
                        afVar.w(-1);
                    } else {
                        afVar.w(jSONObject.optInt("ad_type", -1));
                    }
                    if (jSONObject.isNull(l.ae)) {
                        afVar.x(-1);
                    } else {
                        afVar.x(jSONObject.optInt(l.ae, -1));
                    }
                    if (afVar.l() == 2) {
                        if (afVar.c() == 22) {
                            afVar.a(ATAdConst.CURRENCY.RMB_CENT);
                        } else {
                            afVar.a(ATAdConst.CURRENCY.USD);
                        }
                    } else {
                        afVar.a(ATAdConst.CURRENCY.USD);
                    }
                    if (jSONObject.isNull(l.af)) {
                        afVar.z(0);
                    } else {
                        afVar.z(jSONObject.optInt(l.af, 0));
                    }
                    arrayList = arrayList2;
                    try {
                        arrayList.add(afVar);
                    } catch (Exception unused) {
                        return arrayList;
                    }
                } else {
                    jSONArray = jSONArray2;
                    i2 = i5;
                    str3 = str14;
                    str4 = str15;
                    z2 = z;
                    arrayList = arrayList2;
                    str5 = str16;
                    str6 = str17;
                    i3 = i4;
                    str7 = str11;
                    str8 = str12;
                    str9 = str13;
                    str10 = str2;
                }
                arrayList2 = arrayList;
                str2 = str10;
                i4 = i3;
                str13 = str9;
                str11 = str7;
                str12 = str8;
                z = z2;
                str14 = str3;
                str17 = str6;
                str16 = str5;
                str15 = str4;
                i5 = i2 + 1;
                jSONArray2 = jSONArray;
            }
        } catch (Exception unused2) {
        }
        return arrayList2;
    }

    private static List<q> a(String str, String str2, long j, s sVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                q qVar = new q();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                qVar.f(optJSONObject.optString("o_id"));
                qVar.g(optJSONObject.optString("c_id"));
                qVar.h(optJSONObject.optString("t"));
                qVar.s(optJSONObject.optString("p_g"));
                qVar.i(optJSONObject.optString("d"));
                qVar.j(optJSONObject.optString("ic_u"));
                qVar.k(optJSONObject.optString("im_u"));
                qVar.l(optJSONObject.optString("f_i_u"));
                qVar.m(optJSONObject.optString("a_c_u"));
                qVar.n(optJSONObject.optString("c_t"));
                qVar.o(optJSONObject.optString("v_u"));
                qVar.d(optJSONObject.optInt("l_t"));
                qVar.p(optJSONObject.optString("p_u"));
                qVar.q(optJSONObject.optString("dl"));
                qVar.r(optJSONObject.optString("c_u"));
                qVar.B(optJSONObject.optString("ip_u"));
                qVar.C(optJSONObject.optString("t_u"));
                qVar.D(optJSONObject.optString("t_u_25"));
                qVar.E(optJSONObject.optString("t_u_50"));
                qVar.F(optJSONObject.optString("t_u_75"));
                qVar.G(optJSONObject.optString("t_u_100"));
                qVar.H(optJSONObject.optString("s_e_c_t_u"));
                qVar.I(optJSONObject.optString("c_t_u"));
                qVar.J(optJSONObject.optString("ip_n_u"));
                qVar.K(optJSONObject.optString("c_n_u"));
                qVar.L = optJSONObject.optInt("o_a_d_c");
                qVar.M = optJSONObject.optLong("o_a_p");
                qVar.a(j);
                qVar.c(optJSONObject.optInt("unit_type"));
                qVar.a(optJSONObject.optInt("c_m"));
                qVar.b(optJSONObject.optString("ext_h_pic"));
                qVar.y(optJSONObject.optString("ext_big_h_pic"));
                qVar.z(optJSONObject.optString("ext_rect_h_pic"));
                qVar.A(optJSONObject.optString("ext_home_h_pic"));
                qVar.a(str2);
                qVar.u(optJSONObject.optString("pub"));
                qVar.v(optJSONObject.optString("app_vc"));
                qVar.w(optJSONObject.optString("pvc"));
                qVar.x(optJSONObject.optString("pms"));
                qVar.a((k) sVar);
                arrayList.add(qVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final Map<String, Object> a(String str, String str2, af afVar) {
        Object obj;
        com.anythink.core.common.e.m N;
        Map<String, Object> c = h.c(afVar.g());
        boolean b = g.b();
        com.anythink.core.c.a l0 = wo1.l0(b.a(m.a().e()));
        if (!TextUtils.isEmpty(afVar.y())) {
            c.put("payload", afVar.y());
        }
        if (!TextUtils.isEmpty(afVar.R())) {
            c.put("custom_inhouse_bid_result", afVar.R());
        }
        boolean z = true;
        c.put(g.k.c, Boolean.valueOf(l0.h() == 3));
        c.put(g.k.d, Boolean.valueOf((l0.i() == 2 && b) ? false : false));
        c.put(g.k.e, Boolean.valueOf(o.a(m.a().e()).c()));
        c.put("ad_type", Integer.valueOf(afVar.Y()));
        c.put(g.k.m, str + "_" + this.C + "_" + this.m);
        c.put(g.k.n, t.a().g(str));
        if (afVar.c() == 28 && (N = afVar.N()) != null) {
            c.put(g.k.o, Double.valueOf(com.anythink.core.common.j.g.a(afVar) * N.l));
        }
        Map<String, Object> k = m.a().k();
        if (k != null && k.containsKey(ATAdConst.KEY.WECHAT_APPID) && (obj = k.get(ATAdConst.KEY.WECHAT_APPID)) != null) {
            c.put(ATAdConst.KEY.WECHAT_APPID, obj);
        }
        if (afVar.c() == 35 || afVar.l() == 3 || afVar.l() == 4 || afVar.l() == 7) {
            j jVar = new j();
            jVar.a = afVar.y();
            jVar.f = afVar.c();
            jVar.c = afVar.t();
            jVar.d = str2;
            jVar.b = str;
            jVar.h = this.C;
            jVar.i = this.m;
            jVar.j = this.u;
            jVar.g = afVar.d();
            com.anythink.core.common.e.m N2 = afVar.N();
            jVar.k = N2 != null ? N2.g : "";
            jVar.l = N2 != null ? N2.h : "";
            if (afVar.c() == 35) {
                jVar.m = this.T;
            } else {
                jVar.m = y.c(this.ax);
            }
            k kVar = jVar.m;
            if (kVar != null) {
                kVar.o(this.u);
            }
            c.put(g.k.a, jVar);
        }
        if (afVar.c() == 47) {
            c.put(g.k.i, this.ar);
        }
        return c;
    }
}