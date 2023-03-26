package com.anythink.core.c;

import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.b.o;
import com.anythink.core.common.e.n;
import com.anythink.core.common.e.t;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String a = "a";
    private Map A;
    private String B;
    private String C;
    private String D;
    private String E;
    private ConcurrentHashMap<String, t> F;
    private int G;
    private int H;
    private Map<String, String> I;
    private Map<String, String> J;
    private Map<String, String> K;
    private int L;
    private String M;
    private int N;
    private String O;
    private int P;
    private String Q;
    private String R;
    private String S;
    private c T;
    private n U;
    private int V;
    private int W;
    private String X;
    private String Y;
    private String Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private int af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private String ak;
    public boolean b;
    public Map<String, Object> c;
    private long d;
    private String e;
    private long f;
    private int g;
    private int h;
    private String i;
    private String j;
    private int k;
    private long l;
    private String m;
    private String n;
    private String o;
    private int p;
    private long q;
    private int[] r;
    private String s;
    private int t;
    private long u;
    private String v;
    private String w;
    private long x;
    private long y;
    private int z;

    /* renamed from: com.anythink.core.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0038a {
        private static String A = "da_rt_keys_ft";
        private static String B = "tk_no_t_ft";
        private static String C = "da_not_keys_ft";
        private static String D = "abtest_id";
        private static String E = "crash_sw";
        private static String F = "crash_list";
        private static String G = "tcp_domain";
        private static String H = "tcp_port";
        private static String I = "tcp_tk_da_type";
        private static String J = "tcp_rate";
        private static String K = "sy_id";
        private static String L = "adx";
        private static String M = "req_addr";
        private static String N = "bid_addr";
        private static String O = "tk_addr";
        private static String P = "ol_req_addr";
        private static String Q = "ofm_data";
        private static String R = "ccpa_sw";
        private static String S = "coppa_sw";
        private static String T = "tk_no_nt_t";
        private static String U = "da_no_nt_k";
        private static String V = "s2s_addr";
        private static String W = "cn_gdpr_nu";
        private static String X = "cn_s2s_addr";
        private static String Y = "cn_req_addr";
        private static String Z = "cn_bid_addr";
        private static String a = "scet";
        private static String aa = "cn_tk_addr";
        private static String ab = "cn_ol_req_addr";
        private static String ac = "cn_tk_address";
        private static String ad = "cn_da_address";
        private static String ae = "cn_tcp_domain";
        private static String af = "cn_tcp_port";
        private static String ag = "oid";
        private static String ah = "rak";
        private static String ai = "show_delay_url";
        private static String aj = "show_delay_text";
        private static String ak = "store_wakup";
        private static String b = "req_ver";
        private static String c = "gdpr_sdcs";
        private static String d = "gdpr_so";
        private static String e = "gdpr_nu";
        private static String f = "gdpr_a";
        private static String g = "gdpr_ia";
        private static String h = "pl_n";
        private static String i = "upid";
        private static String j = "logger";
        private static String k = "tk_address";
        private static String l = "tk_max_amount";
        private static String m = "tk_interval";
        private static String n = "da_address";
        private static String o = "da_max_amount";
        private static String p = "da_interval";
        private static String q = "n_psid_tm";
        private static String r = "c_a";
        private static String s = "tk_firm";
        private static String t = "n_l";
        private static String u = "preinit";
        private static String v = "nw_eu_def";
        private static String w = "t_c";
        private static String x = "data_level";
        private static String y = "psid_hl";
        private static String z = "la_sw";
    }

    public static boolean ag() {
        a l0 = wo1.l0(b.a(m.a().e()));
        boolean z = l0 != null && l0.z == 1;
        o a2 = o.a(m.a().e());
        if (l0.b) {
            if (a2.a() == 2) {
                return false;
            }
        } else if (a2.a() == 2 && (l0.k == 0 || z)) {
            return false;
        }
        return true;
    }

    private String ah() {
        return this.S;
    }

    private ConcurrentHashMap<String, t> ai() {
        return this.F;
    }

    private String aj() {
        return this.B;
    }

    private String ak() {
        return this.aa;
    }

    private String al() {
        return this.ab;
    }

    private String am() {
        return this.ac;
    }

    private String an() {
        return this.ad;
    }

    private String ao() {
        return this.e;
    }

    private String ap() {
        return this.j;
    }

    private String aq() {
        return this.n;
    }

    private Map<String, Object> ar() {
        return this.c;
    }

    private void f(String str) {
        this.ak = str;
    }

    private void g(String str) {
        this.aj = str;
    }

    private void h(String str) {
        this.ai = str;
    }

    private void i(String str) {
        this.ag = str;
    }

    private void j(String str) {
        this.ah = str;
    }

    private void k(String str) {
        this.Z = str;
    }

    private void l(String str) {
        this.R = str;
    }

    private void m(String str) {
        this.S = str;
    }

    private void n(String str) {
        this.Q = str;
    }

    private void o(String str) {
        this.O = str;
    }

    public final int A() {
        return this.z;
    }

    public final long B() {
        return this.y;
    }

    public final void C() {
        this.y = 51200L;
    }

    public final long D() {
        return this.f;
    }

    public final Map<String, String> E() {
        return this.A;
    }

    public final String F() {
        return this.ae;
    }

    public final int G() {
        return this.af;
    }

    public final long H() {
        return this.x;
    }

    public final void I() {
        this.x = 30000L;
    }

    public final long J() {
        return this.d;
    }

    public final void K() {
        this.d = g.e.a;
    }

    public final int L() {
        return this.g;
    }

    public final int M() {
        return this.h;
    }

    public final String N() {
        return this.i;
    }

    public final int O() {
        return this.k;
    }

    public final long P() {
        return this.l;
    }

    public final void Q() {
        this.l = 5000L;
    }

    public final String R() {
        return this.o;
    }

    public final int S() {
        return this.p;
    }

    public final void T() {
        this.p = 1;
    }

    public final long U() {
        return this.q;
    }

    public final void V() {
        this.q = 0L;
    }

    public final String W() {
        return this.s;
    }

    public final int X() {
        return this.t;
    }

    public final void Y() {
        this.t = 1;
    }

    public final long Z() {
        return this.u;
    }

    public final c a() {
        return this.T;
    }

    public final void aa() {
        this.u = 0L;
    }

    public final Map<String, String> ab() {
        return this.I;
    }

    public final Map<String, String> ac() {
        return this.J;
    }

    public final Map<String, String> ad() {
        return this.K;
    }

    public final String ae() {
        return this.X;
    }

    public final String af() {
        return this.Y;
    }

    public final String b() {
        return this.ak;
    }

    public final String c() {
        return this.aj;
    }

    public final String d() {
        return this.ai;
    }

    public final String e() {
        return this.ag;
    }

    public final int p() {
        return this.L;
    }

    public final void q() {
        this.L = 1;
    }

    public final String r() {
        return this.M;
    }

    public final String s() {
        return this.E;
    }

    public final int t() {
        return this.G;
    }

    public final void u() {
        this.G = 30000;
    }

    public final int v() {
        return this.H;
    }

    public final void w() {
        this.H = 0;
    }

    public final String x() {
        return this.D;
    }

    public final boolean y() {
        return this.b;
    }

    public final String z() {
        return this.C;
    }

    private void A(String str) {
        this.n = str;
    }

    private void B(String str) {
        this.X = str;
    }

    private void C(String str) {
        this.Y = str;
    }

    private void a(c cVar) {
        this.T = cVar;
    }

    private void b(int i) {
        this.W = i;
    }

    private void c(int i) {
        this.N = i;
    }

    private void d(int i) {
        this.P = i;
    }

    private void e(int i) {
        this.z = i;
    }

    private void p(String str) {
        this.E = str;
    }

    private void q(String str) {
        this.D = str;
    }

    private void r(String str) {
        this.C = str;
    }

    private void s(String str) {
        this.B = str;
    }

    private void t(String str) {
        this.aa = str;
    }

    private void u(String str) {
        this.ab = str;
    }

    private void v(String str) {
        this.ac = str;
    }

    private void w(String str) {
        this.ad = str;
    }

    private void x(String str) {
        this.ae = str;
    }

    private void y(String str) {
        this.i = str;
    }

    private void z(String str) {
        this.j = str;
    }

    public final String f() {
        return this.ah;
    }

    public final String g() {
        return this.Z;
    }

    public final int h() {
        return this.V;
    }

    public final int i() {
        return this.W;
    }

    public final n j() {
        return this.U;
    }

    public final String k() {
        return this.R;
    }

    public final String l() {
        return this.Q;
    }

    public final int m() {
        return this.N;
    }

    public final String n() {
        return this.O;
    }

    public final int o() {
        return this.P;
    }

    private void a(int i) {
        this.V = i;
    }

    private void e(Map<String, Object> map) {
        this.c = map;
    }

    private void f(int i) {
        this.af = i;
    }

    private void g(int i) {
        this.g = i;
    }

    private void h(int i) {
        this.h = i;
    }

    private void i(int i) {
        this.k = i;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c(String str) {
        this.o = str;
    }

    public final void d(String str) {
        this.s = str;
    }

    private void a(n nVar) {
        this.U = nVar;
    }

    private void b(Map<String, String> map) {
        this.I = map;
    }

    private void c(Map<String, String> map) {
        this.J = map;
    }

    private void d(Map<String, String> map) {
        this.K = map;
    }

    public static a e(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        com.anythink.core.common.j.e.b(a, str);
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull(C0038a.b)) {
                aVar.e = "unkown";
            } else {
                aVar.e = jSONObject.optString(C0038a.b);
            }
            if (jSONObject.isNull(C0038a.a)) {
                aVar.d = g.e.a;
            } else {
                aVar.d = jSONObject.optLong(C0038a.a);
            }
            if (jSONObject.isNull(C0038a.c)) {
                aVar.g = 0;
            } else {
                aVar.g = jSONObject.optInt(C0038a.c);
            }
            if (jSONObject.isNull(C0038a.d)) {
                aVar.h = 0;
            } else {
                aVar.h = jSONObject.optInt(C0038a.d);
            }
            if (jSONObject.isNull(C0038a.e)) {
                aVar.i = "";
            } else {
                aVar.i = jSONObject.optString(C0038a.e);
            }
            if (jSONObject.isNull(C0038a.f)) {
                aVar.j = "[\"AT\",\"BE\",\"BG\",\"HR\",\"CY\",\"CZ\",\"DK\",\"EE\",\"FI\",\"FR\",\"DE\",\"GR\",\"HU\",\"IS\",\"IE\",\"IT\",\"LV\",\"LI\",\"LT\",\"LU\",\"MT\",\"NL\",\"NO\",\"PL\",\"PT\",\"RO\",\"SK\",\"SI\",\"ES\",\"SE\",\"GB\",\"UK\"]";
            } else {
                aVar.j = jSONObject.optString(C0038a.f);
            }
            if (jSONObject.isNull(C0038a.g)) {
                aVar.k = 0;
            } else {
                aVar.k = jSONObject.optInt(C0038a.g);
            }
            if (jSONObject.isNull(C0038a.h)) {
                aVar.l = 5000L;
            } else {
                aVar.l = jSONObject.optLong(C0038a.h);
            }
            if (!jSONObject.isNull(C0038a.j)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(C0038a.j);
                aVar.n = optJSONObject.toString();
                aVar.o = optJSONObject.optString(C0038a.k);
                aVar.p = optJSONObject.optInt(C0038a.l);
                aVar.q = optJSONObject.optLong(C0038a.m);
                aVar.s = optJSONObject.optString(C0038a.n);
                aVar.t = optJSONObject.optInt(C0038a.o);
                aVar.u = optJSONObject.optLong(C0038a.p);
                ConcurrentHashMap<String, t> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    if (!optJSONObject.isNull(C0038a.s)) {
                        JSONObject jSONObject2 = new JSONObject(optJSONObject.optString(C0038a.s));
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            t tVar = new t();
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(next);
                            tVar.a = optJSONObject2.optInt("tk_fi_re_sw");
                            tVar.b = optJSONObject2.optInt("tk_im_sw");
                            tVar.c = optJSONObject2.optInt("tk_sh_sw");
                            tVar.d = optJSONObject2.optInt("tk_ck_sw");
                            tVar.e = optJSONObject2.optString("pg_m_li");
                            concurrentHashMap.put(next, tVar);
                        }
                    }
                } catch (Exception unused) {
                }
                aVar.F = concurrentHashMap;
                if (optJSONObject.isNull(C0038a.A)) {
                    aVar.I = null;
                } else {
                    JSONObject jSONObject3 = new JSONObject(optJSONObject.optString(C0038a.A));
                    Iterator<String> keys2 = jSONObject3.keys();
                    HashMap hashMap = new HashMap();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        hashMap.put(next2, jSONObject3.optString(next2));
                    }
                    aVar.I = hashMap;
                }
                if (optJSONObject.isNull(C0038a.C)) {
                    aVar.K = null;
                } else {
                    JSONObject jSONObject4 = new JSONObject(optJSONObject.optString(C0038a.C));
                    Iterator<String> keys3 = jSONObject4.keys();
                    HashMap hashMap2 = new HashMap();
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        hashMap2.put(next3, jSONObject4.optString(next3));
                    }
                    aVar.K = hashMap2;
                }
                if (optJSONObject.isNull(C0038a.B)) {
                    aVar.J = null;
                } else {
                    JSONObject jSONObject5 = new JSONObject(optJSONObject.optString(C0038a.B));
                    Iterator<String> keys4 = jSONObject5.keys();
                    HashMap hashMap3 = new HashMap();
                    while (keys4.hasNext()) {
                        String next4 = keys4.next();
                        hashMap3.put(next4, jSONObject5.optString(next4));
                    }
                    aVar.J = hashMap3;
                }
                aVar.O = optJSONObject.optString(C0038a.G);
                aVar.P = optJSONObject.optInt(C0038a.H);
                aVar.N = optJSONObject.optInt(C0038a.I);
                aVar.Q = optJSONObject.optString(C0038a.J);
                if (optJSONObject.isNull(C0038a.T)) {
                    aVar.X = null;
                } else {
                    aVar.X = optJSONObject.optString(C0038a.T);
                }
                if (optJSONObject.isNull(C0038a.U)) {
                    aVar.Y = null;
                } else {
                    aVar.Y = optJSONObject.optString(C0038a.U);
                }
                if (!optJSONObject.isNull(C0038a.ac)) {
                    aVar.ac = optJSONObject.optString(C0038a.ac);
                }
                if (!optJSONObject.isNull(C0038a.ad)) {
                    aVar.ad = optJSONObject.optString(C0038a.ad);
                }
                if (!optJSONObject.isNull(C0038a.ae)) {
                    aVar.ae = optJSONObject.optString(C0038a.ae);
                }
                if (!optJSONObject.isNull(C0038a.af)) {
                    aVar.af = optJSONObject.optInt(C0038a.af);
                }
            }
            if (!jSONObject.isNull(C0038a.q)) {
                aVar.x = jSONObject.optLong(C0038a.q);
            }
            if (!jSONObject.isNull(C0038a.r)) {
                aVar.y = jSONObject.optLong(C0038a.r);
            }
            if (!jSONObject.isNull(C0038a.t)) {
                JSONObject jSONObject6 = new JSONObject(jSONObject.optString(C0038a.t));
                Iterator<String> keys5 = jSONObject6.keys();
                HashMap hashMap4 = new HashMap();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    hashMap4.put(next5, jSONObject6.optString(next5));
                }
                aVar.A = hashMap4;
            }
            if (!jSONObject.isNull(C0038a.w)) {
                aVar.C = jSONObject.optString(C0038a.w);
            }
            if (!jSONObject.isNull(C0038a.v)) {
                aVar.z = jSONObject.optInt(C0038a.v);
            }
            if (!jSONObject.isNull(C0038a.x)) {
                aVar.D = jSONObject.optString(C0038a.x);
            }
            if (jSONObject.isNull(C0038a.y)) {
                aVar.G = 60000;
            } else {
                aVar.G = jSONObject.optInt(C0038a.y);
            }
            if (jSONObject.isNull(C0038a.z)) {
                aVar.H = 0;
            } else {
                aVar.H = jSONObject.optInt(C0038a.z);
            }
            if (jSONObject.isNull(C0038a.D)) {
                aVar.E = "";
            } else {
                aVar.E = jSONObject.optString(C0038a.D);
            }
            if (jSONObject.isNull(C0038a.E)) {
                aVar.L = 1;
            } else {
                aVar.L = jSONObject.optInt(C0038a.E);
            }
            if (jSONObject.isNull(C0038a.F)) {
                aVar.M = "";
            } else {
                aVar.M = jSONObject.optString(C0038a.F);
            }
            if (jSONObject.isNull(C0038a.K)) {
                aVar.R = "";
            } else {
                aVar.R = jSONObject.optString(C0038a.K);
            }
            if (jSONObject.isNull(C0038a.L)) {
                aVar.U = null;
            } else {
                n nVar = new n();
                JSONObject optJSONObject3 = jSONObject.optJSONObject(C0038a.L);
                nVar.b(optJSONObject3.optString(C0038a.M));
                nVar.c(optJSONObject3.optString(C0038a.N));
                nVar.d(optJSONObject3.optString(C0038a.O));
                nVar.a(optJSONObject3.optString(C0038a.P));
                if (!jSONObject.isNull(C0038a.Y)) {
                    nVar.e(optJSONObject3.optString(C0038a.Y));
                }
                if (!jSONObject.isNull(C0038a.Z)) {
                    nVar.f(optJSONObject3.optString(C0038a.Z));
                }
                if (!jSONObject.isNull(C0038a.aa)) {
                    nVar.g(optJSONObject3.optString(C0038a.aa));
                }
                if (!jSONObject.isNull(C0038a.ab)) {
                    nVar.h(optJSONObject3.optString(C0038a.ab));
                }
                aVar.U = nVar;
            }
            aVar.T = c.a(jSONObject.optString(C0038a.Q));
            if (jSONObject.isNull("custom")) {
                aVar.c = null;
            } else {
                JSONObject jSONObject7 = new JSONObject(jSONObject.optString("custom"));
                HashMap hashMap5 = new HashMap();
                Iterator<String> keys6 = jSONObject7.keys();
                while (keys6.hasNext()) {
                    String next6 = keys6.next();
                    hashMap5.put(next6, jSONObject7.opt(next6));
                }
                aVar.c = hashMap5;
            }
            aVar.V = jSONObject.optInt(C0038a.R);
            aVar.W = jSONObject.optInt(C0038a.S);
            aVar.Z = jSONObject.optString(C0038a.V);
            if (!jSONObject.isNull(C0038a.W)) {
                aVar.aa = jSONObject.optString(C0038a.W);
            }
            if (!jSONObject.isNull(C0038a.X)) {
                aVar.ab = jSONObject.optString(C0038a.X);
            }
            if (!jSONObject.isNull(C0038a.ag)) {
                aVar.ag = jSONObject.optString(C0038a.ag);
            }
            if (!jSONObject.isNull(C0038a.ah)) {
                aVar.ah = jSONObject.optString(C0038a.ah);
            }
            if (!jSONObject.isNull(C0038a.ai)) {
                aVar.ai = jSONObject.optString(C0038a.ai);
            }
            if (!jSONObject.isNull(C0038a.aj)) {
                aVar.aj = jSONObject.optString(C0038a.aj);
            }
            if (!jSONObject.isNull(C0038a.ak)) {
                aVar.ak = jSONObject.optString(C0038a.ak);
            } else {
                aVar.ak = "1";
            }
        } catch (Exception unused2) {
        }
        return aVar;
    }

    private static void f(Map<String, Object> map) {
        a l0 = wo1.l0(b.a(m.a().e()));
        boolean z = false;
        boolean z2 = l0 != null && l0.k == 1;
        boolean z3 = l0 != null && l0.z == 1;
        o a2 = o.a(m.a().e());
        map.put(g.k.e, Boolean.valueOf(a2.c()));
        map.put("is_eu", Boolean.valueOf(z2));
        if (!l0.b ? a2.a() != 2 || (l0.k != 0 && !z3) : a2.a() != 2) {
            z = true;
        }
        map.put("need_set_gdpr", Boolean.valueOf(z));
    }

    public final void a(String str) {
        this.M = str;
    }

    private void a(ConcurrentHashMap<String, t> concurrentHashMap) {
        this.F = concurrentHashMap;
    }

    public final void a(long j) {
        this.f = j;
    }

    private void a(Map map) {
        this.A = map;
    }
}