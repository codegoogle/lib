package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.basead.b.a;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.w;
import com.p7700g.p99005.j20;
import com.p7700g.p99005.wo1;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends h implements com.anythink.expressad.e.b, Serializable {
    public static final int A = 1;
    public static final String B = "id";
    public static final String C = "unitId";
    public static final String D = "title";
    public static final String E = "desc";
    public static final String F = "package_name";
    public static final String G = "icon_url";
    public static final String H = "image_url";
    public static final String I = "image_size";
    public static final String J = "app_size";
    public static final String K = "impression_url";
    public static final String L = "click_url";
    public static final String M = "wtick";
    public static final String N = "deep_link";
    public static final String O = "user_activation";
    public static final String P = "notice_url";
    public static final String Q = "template";
    public static final String R = "ad_source_id";
    public static final String S = "fca";
    public static final String T = "fcb";
    public static final String U = "click_mode";
    public static final String V = "landing_type";
    public static final String W = "link_type";
    public static final String X = "rating";
    public static final String Y = "number_rating";
    public static final String Z = "ctatext";
    public static final String a = c.class.getSimpleName();
    public static final String aA = "vck_t";
    public static final String aB = "rs_ignc_r";
    public static final int aC = 1;
    public static final int aD = 2;
    public static final String aE = "rw_pl";
    public static final String aF = "jm_pd";
    public static final String aH = "oc_type";
    public static final String aI = "oc_time";
    public static final String aJ = "t_list";
    public static final String aK = "adchoice";
    public static final String aL = "omid";
    public static final String aM = "ia_icon";
    public static final String aN = "ia_rst";
    public static final String aO = "ia_url";
    public static final String aP = "ia_ori";
    public static final String aQ = "ad_type";
    public static final String aR = "ia_ext1";
    public static final String aS = "ia_ext2";
    public static final String aT = "is_download_zip";
    public static final String aU = "ia_cache";
    public static final String aV = "imp_ua";
    public static final String aW = "c_ua";
    public static final int aX = 1;
    public static final int aY = 1;
    public static final String aZ = "iex";
    public static final String aa = "c_ct";
    public static final String ab = "video_url";
    public static final String ac = "video_length";
    public static final String ad = "video_size";
    public static final String ae = "video_resolution";
    public static final String af = "watch_mile";
    public static final String ag = "endcard_click_result";
    public static final String ah = "ctype";
    public static final String ai = "adv_imp";
    public static final String aj = "t_imp";
    public static final String ak = "sec";
    public static final String al = "url";
    public static final String am = "guidelines";
    public static final String an = "offer_type";
    public static final String ao = "reward_amount";
    public static final String ap = "reward_name";
    public static final String aq = "md5_file";
    public static final String ar = "c_toi";
    public static final int as = 2;
    public static final String at = "5";
    public static final String au = "rtins_type";
    public static final String av = "ad_url_list";
    public static final String aw = "retarget_offer";
    public static final String ax = "flb";
    public static final String ay = "flb_skiptime";
    public static final String az = "vctn_t";
    public static final String b = "ad_tpl_url";
    public static final String bA = "video_end_type";
    public static final int bB = 1;
    public static final int bC = 2;
    public static final int bD = 3;
    public static final int bE = 4;
    public static final int bF = 5;
    public static final int bG = 100;
    public static final int bH = 2;
    public static final String bJ = "ready_rate";
    public static final String bK = "tmp_ids";
    public static final String bL = "ext_data";
    public static final String bM = "endcard_url";
    public static final String bN = "playable_ads_without_video";
    public static final int bO = 1;
    public static final int bP = 2;
    public static final String bQ = "impression";
    public static final String bR = "start";
    public static final String bS = "first_quartile";
    public static final String bT = "midpoint";
    public static final String bU = "third_quartile";
    public static final String bV = "complete";
    public static final String bW = "mute";
    public static final String bX = "unmute";
    public static final String bY = "click";
    public static final String bZ = "pause";
    public static final String ba = "ts";
    public static final String bb = "nv_t2";
    public static final String bc = "impression_t2";
    public static final String bd = "gif_url";
    public static final String be = "dropout_track";
    public static final String bf = "plycmpt_track";
    public static final String bg = "aks";
    public static final String bh = "k";
    public static final String bi = "q";
    public static final String bj = "r";
    public static final String bk = "al";
    public static final String bl = "mp";
    public static final String bm = "pv_urls";
    public static final int bn = 3;
    public static final int bo = 4;
    public static final int bp = 1;
    public static final int bq = 2;
    public static final int br = 3;
    public static final int bs = 1;
    public static final int bt = 2;
    public static final int bu = 1;
    public static final int bv = 2;
    public static final int bw = 3;
    public static final int bx = 4;
    public static final int by = 8;
    public static final int bz = 9;
    public static final String c = "ad_html";
    public static final String ca = "resume";
    public static final String cb = "error";
    public static final String cc = "endcard";
    public static final String cd = "close";
    public static final String ce = "video_click";
    public static final String cf = "endcard_show";
    public static final String cg = "play_percentage";
    public static final String ch = "ad_tracking";
    public static final String ci = "rv";
    public static final int cj = -1;
    public static final int ck = 1;
    public static final int cl = 0;
    public static final String d = "cmpt=1";
    private static final long dM = 1;
    public static final String e = "tp_offer";
    private static final int eP = 100;
    public static final String f = "fac";
    public static final String g = "plct";
    public static final String h = "plctb";
    public static final String i = "banner_url";
    public static final String j = "banner_html";
    public static final String k = "creative_id";
    public static final String l = "mraid";
    public static final String m = "mraid_src";
    public static final String n = "timestamp";
    public static final String o = "hb";
    public static final String p = "maitve";
    public static final String q = "maitve_src";
    public static final String r = "vcn";
    public static final String s = "token_r";
    public static final String t = "encrypt_p";
    public static final String u = "view_com_time";
    public static final String v = "adspace_t";
    public static final String w = "cbd";
    public static final String x = "vst";
    public static final int y = -2;
    public static final int z = -2;
    public p aG;
    private List<String> cX;
    private long cY;
    private int dA;
    private int dB;
    private String dC;
    private String dD;
    private int dE;
    private String dF;
    private a dG;
    private int dI;
    private String dJ;
    private String dO;
    private int dY;
    private int dZ;
    private int db;
    private boolean dj;
    private int dr;
    private int ds;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private String dx;
    private int dy;
    private String dz;
    private String eA;
    private HashMap<String, String> eB;
    private String eC;
    private String eD;
    private String eE;
    private String eF;
    private String eG;
    private boolean eH;
    private String eJ;
    private boolean eK;
    private boolean eL;
    private int eN;
    private String eQ;
    private String eS;
    private String eT;
    private int eU;
    private String eV;
    private String eY;
    private int ea;
    private String eb;
    private String ec;
    private String ed;
    private String ee;
    private int ef;
    private boolean eg;
    private boolean ei;
    private int ej;
    private int el;
    private String em;
    private int en;
    private int eo;
    private String ep;
    private int eq;
    private int er;
    private int es;
    private String et;
    private int eu;
    private String ev;
    private String ew;
    private int ex;
    private String ey;
    private int ez;
    private n fa;
    private String fb;
    private String fc;
    private int fd;
    private long fe;
    private String ff;
    private String fg;
    private int fh;
    private String fi;
    private int fj;
    private b fk;
    private C0061c fl;
    private c.b fm;
    private int fp;
    private ArrayList<Integer> fr;
    private int cT = 1;
    private String cU = "";
    private String cV = "";
    private boolean cW = false;
    private int cZ = 0;
    private int da = 0;
    private int dc = -2;
    private int dd = -2;

    /* renamed from: de  reason: collision with root package name */
    private long f16de = 0;
    private long df = 0;
    private String dg = "";
    private String dh = "";
    private long di = 0;
    private int dk = 0;
    private int dl = 0;
    private String dm = "";
    private boolean dn = false;

    /* renamed from: do  reason: not valid java name */
    private boolean f1do = false;
    private int dp = 0;
    private int dq = -1;
    private int dH = 0;
    private int dK = 1;
    private int dL = 1;
    private int dN = 6;
    private int dP = -1;
    private String dQ = "";
    private String dR = "";
    private String dS = "";
    private int dT = 0;
    private String dU = "";
    private boolean dV = false;
    private String dW = "";
    private String dX = "";
    private boolean eh = false;
    private String ek = "";
    private String eI = "";
    private int eM = 2;
    public String bI = "";
    private int eO = -1;
    private int eR = 1;
    private int eW = 0;
    private int eX = 2;
    private int eZ = 1;
    private boolean fn = false;
    private String fo = null;
    private String fq = "";
    private int fs = 2;
    private int ft = 1;
    private int fu = -1;
    private boolean fv = false;
    private boolean fw = false;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {
        public static final String a = "ad_logo_link";
        public static final String b = "adchoice_link";
        public static final String c = "adchoice_icon";
        public static final String d = "adchoice_size";
        public static final String e = "platform_name";
        public static final String f = "platform_logo";
        public static final String g = "adv_name";
        public static final String h = "adv_logo";
        private String i = "";
        private String j = "";
        private String k = "";
        private String l = "";
        private String m = "";
        private String n = "";
        private String o = "";
        private String p = "";
        private int q = 0;
        private int r = 0;
        private String s = "";

        private void a(int i) {
            this.q = i;
        }

        private void b(int i) {
            this.r = i;
        }

        private void c(String str) {
            this.i = str;
        }

        private void d(String str) {
            this.j = str;
        }

        private int e() {
            return this.q;
        }

        private int f() {
            return this.r;
        }

        private String g() {
            return this.i;
        }

        private String h() {
            return this.m;
        }

        private String i() {
            return this.n;
        }

        private String j() {
            return this.o;
        }

        private String k() {
            return this.p;
        }

        private boolean l() {
            return (TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.l) || TextUtils.isEmpty(this.k)) ? false : true;
        }

        private void b(String str) {
            this.s = str;
        }

        private void e(String str) {
            this.k = str;
        }

        private void f(String str) {
            this.l = str;
        }

        private void g(String str) {
            this.m = str;
        }

        private void h(String str) {
            this.n = str;
        }

        private void i(String str) {
            this.o = str;
        }

        private void j(String str) {
            this.p = str;
        }

        private static int k(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 1) {
                    return Integer.parseInt(split[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final String a() {
            return this.s;
        }

        public final String c() {
            return this.k;
        }

        public final String d() {
            return this.l;
        }

        public static a a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return a(new JSONObject(str));
            } catch (Exception e2) {
                if (com.anythink.expressad.a.a) {
                    e2.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        private static int l(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final String b() {
            return this.j;
        }

        private static a a(JSONObject jSONObject) {
            a aVar;
            a aVar2 = null;
            try {
                aVar = new a();
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
            }
            try {
                aVar.k = jSONObject.optString("adchoice_icon");
                aVar.j = jSONObject.optString("adchoice_link");
                String optString = jSONObject.optString("adchoice_size");
                aVar.l = optString;
                aVar.i = jSONObject.optString(a);
                aVar.p = jSONObject.optString(h);
                aVar.o = jSONObject.optString(g);
                aVar.n = jSONObject.optString("platform_logo");
                aVar.m = jSONObject.optString("platform_name");
                aVar.r = k(optString);
                aVar.q = l(optString);
                aVar.s = jSONObject.toString();
                return aVar;
            } catch (Exception e3) {
                e = e3;
                aVar2 = aVar;
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                }
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                if (com.anythink.expressad.a.a) {
                    th.printStackTrace();
                }
                return aVar2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public Map<Integer, String> l;
    }

    /* renamed from: com.anythink.expressad.foundation.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0061c implements Serializable {
        public static final String a = "video_template";
        public static final String b = "template_url";
        public static final String c = "orientation";
        public static final String d = "paused_url";
        public static final String e = "image";
        private static final int f = 1;
        private String g;
        private int h;
        private int i;
        private String j;
        private String k;
        private List<a> l;

        /* renamed from: com.anythink.expressad.foundation.d.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a implements Serializable {
            public String a;
            public List<String> b = new ArrayList();
        }

        private C0061c(String str) {
            this.g = str;
        }

        public final int b() {
            return this.h;
        }

        public final int c() {
            return this.i;
        }

        public final String d() {
            return this.j;
        }

        public final String e() {
            return this.k;
        }

        public final List<a> f() {
            return this.l;
        }

        private void b(int i) {
            this.i = i;
        }

        private void c(String str) {
            this.k = w.c(str);
        }

        private static C0061c d(String str) {
            try {
                if (v.b(str)) {
                    return a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final String a() {
            return this.g;
        }

        private void a(String str) {
            this.g = str;
        }

        private void b(String str) {
            this.j = str;
        }

        private void a(int i) {
            this.h = i;
        }

        private void a(List<a> list) {
            this.l = list;
        }

        public static C0061c a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (v.b(jSONObject.toString())) {
                        C0061c c0061c = new C0061c(jSONObject.toString());
                        c0061c.h = jSONObject.optInt(a, 1);
                        c0061c.k = w.c(jSONObject.optString("template_url"));
                        c0061c.i = jSONObject.optInt("orientation");
                        c0061c.j = jSONObject.optString(d);
                        JSONObject optJSONObject = jSONObject.optJSONObject("image");
                        if (optJSONObject != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys != null && keys.hasNext()) {
                                String next = keys.next();
                                List<String> a2 = s.a(optJSONObject.optJSONArray(next));
                                if (a2 != null && a2.size() > 0) {
                                    a aVar = new a();
                                    aVar.a = next;
                                    aVar.b.addAll(a2);
                                    arrayList.add(aVar);
                                }
                            }
                            c0061c.l = arrayList;
                        }
                        return c0061c;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    private void A(String str) {
        this.dJ = str;
    }

    private void B(String str) {
        this.dF = str;
    }

    private void C(int i2) {
        this.dt = i2;
    }

    private void D(int i2) {
        this.dN = i2;
    }

    private void E(String str) {
        this.eD = str;
    }

    private void F(String str) {
        this.eE = str;
    }

    private void G(String str) {
        this.eF = str;
    }

    private void H(String str) {
        this.eG = str;
    }

    private void I(String str) {
        this.eI = str;
    }

    private void J(String str) {
        this.bI = str;
    }

    private void K(String str) {
        C0061c c0061c;
        this.eY = str;
        if (TextUtils.isEmpty(this.eS) && (((c0061c = this.fl) == null || TextUtils.isEmpty(c0061c.k)) && !TextUtils.isEmpty(str) && str.contains(d))) {
            this.eT = str;
        }
        this.fw = s.d(str);
    }

    private void L(String str) {
        this.fb = str;
    }

    private void M(String str) {
        this.eA = str;
    }

    private void N(String str) {
        this.ff = str;
    }

    private void O(String str) {
        this.fg = str;
    }

    private void P(String str) {
        this.et = str;
    }

    private void Q(String str) {
        this.ey = str;
    }

    private void R(String str) {
        this.ep = str;
    }

    private void S(String str) {
        this.ek = str;
    }

    private String bA() {
        return this.dz;
    }

    private int bB() {
        return this.dA;
    }

    private int bC() {
        return this.dw;
    }

    private int bD() {
        return this.dt;
    }

    private int bE() {
        return this.du;
    }

    private int bF() {
        return this.dv;
    }

    private int bG() {
        return this.es;
    }

    private String bH() {
        return this.eC;
    }

    private String bI() {
        return this.eD;
    }

    private String bJ() {
        return this.eE;
    }

    private String bK() {
        return this.eF;
    }

    private String bL() {
        return this.eG;
    }

    private String bM() {
        return this.bI;
    }

    private String bN() {
        return this.fb;
    }

    private String bO() {
        return this.ff;
    }

    private String bP() {
        return this.fg;
    }

    private int bQ() {
        return this.fd;
    }

    private long bR() {
        return this.fe;
    }

    private b bS() {
        return this.fk;
    }

    private int bT() {
        return this.ez;
    }

    private String bU() {
        return this.et;
    }

    private String bV() {
        return this.ev;
    }

    private int bW() {
        return this.ex;
    }

    private String bX() {
        return this.ey;
    }

    private int bY() {
        return this.eo;
    }

    private String bZ() {
        return this.ep;
    }

    private int bj() {
        return this.cT;
    }

    private String bk() {
        return this.dm;
    }

    private int bl() {
        int i2 = this.dl;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    private int bm() {
        int i2 = this.dk;
        if (i2 > 0) {
            return i2;
        }
        return 1;
    }

    private void bn() {
        this.dn = true;
    }

    private long bo() {
        return this.df;
    }

    private int bp() {
        return this.dr;
    }

    private p bq() {
        return this.aG;
    }

    private int br() {
        return this.dH;
    }

    private int bs() {
        return this.dI;
    }

    private String bt() {
        return this.dJ;
    }

    private String bu() {
        return this.dF;
    }

    private int bv() {
        return this.dE;
    }

    private String bw() {
        return this.dC;
    }

    private String bx() {
        return this.dD;
    }

    private String by() {
        return this.dx;
    }

    private int bz() {
        return this.dy;
    }

    private int ca() {
        return this.eq;
    }

    private int cb() {
        return this.en;
    }

    private boolean cc() {
        return this.eh;
    }

    private int cd() {
        return this.ea;
    }

    private int ce() {
        return this.dP;
    }

    private boolean cf() {
        return this.dV;
    }

    private String cg() {
        return this.eQ;
    }

    private String ch() {
        return this.eS;
    }

    private int ci() {
        return this.eU;
    }

    private String cj() {
        return this.eV;
    }

    private int ck() {
        return this.fh;
    }

    private String cl() {
        return this.fi;
    }

    private String cm() {
        return this.fo;
    }

    private String cn() {
        return this.fq;
    }

    private long co() {
        return this.cY;
    }

    private String cp() {
        ArrayList<Integer> arrayList = this.fr;
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Integer> it = this.fr.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            return !TextUtils.isEmpty(sb) ? sb.toString() : "";
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.d(a, th.getMessage());
            return "";
        }
    }

    private int cq() {
        return this.fs;
    }

    private int cr() {
        return this.fu;
    }

    private boolean cs() {
        return this.fw;
    }

    private void p(int i2) {
        this.cZ = i2;
    }

    private void q(int i2) {
        this.da = i2;
    }

    private void r(int i2) {
        this.db = i2;
    }

    private void s(int i2) {
        this.dc = i2;
    }

    private void t(int i2) {
        this.dp = i2;
    }

    private void u(int i2) {
        this.dr = i2;
    }

    private void v(int i2) {
        this.ds = i2;
    }

    private void w(int i2) {
        this.dH = i2;
    }

    private void x(int i2) {
        this.dI = i2;
    }

    private void y(int i2) {
        this.dE = i2;
    }

    private void z(String str) {
        this.cU = str;
        if (s.e(str)) {
            this.dn = true;
        }
    }

    public final String T() {
        return this.em;
    }

    public final int U() {
        return this.ej;
    }

    public final boolean V() {
        return this.eg;
    }

    public final boolean W() {
        return this.ei;
    }

    public final void X() {
        this.ei = true;
    }

    public final int Y() {
        return this.ef;
    }

    public final int Z() {
        return this.eX;
    }

    public final int a() {
        return this.cZ;
    }

    public final boolean aA() {
        return (TextUtils.isEmpty(this.fo) || TextUtils.isEmpty(com.anythink.expressad.a.w)) ? false : true;
    }

    public final int aB() {
        return this.fp;
    }

    public final boolean aC() {
        return super.b(this);
    }

    public final ArrayList<Integer> aD() {
        return this.fr;
    }

    public final int aE() {
        return this.ft;
    }

    public final boolean aF() {
        return this.fv;
    }

    public final String aa() {
        try {
            if (!TextUtils.isEmpty(this.ed)) {
                return this.ed;
            }
            if (TextUtils.isEmpty(this.dW)) {
                return null;
            }
            Uri parse = Uri.parse(this.dW);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("k");
                this.ed = queryParameter;
                this.ed = queryParameter;
            }
            return this.ed;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String ab() {
        try {
            if (!TextUtils.isEmpty(this.ee)) {
                return this.ee;
            }
            if (TextUtils.isEmpty(this.dR)) {
                return "";
            }
            Uri parse = Uri.parse(this.dR);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("k");
                this.ee = queryParameter;
                this.ee = queryParameter;
            }
            return this.ee;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String ac() {
        return this.eb;
    }

    public final String ad() {
        return this.ec;
    }

    public final int ae() {
        return this.dZ;
    }

    public final String af() {
        return this.dS;
    }

    public final int ag() {
        return this.dT;
    }

    public final String ah() {
        return this.dU;
    }

    public final String ai() {
        return this.dQ;
    }

    public final String aj() {
        return this.dR;
    }

    public final String ak() {
        return this.dW;
    }

    @Override // com.anythink.expressad.foundation.d.h
    public final c.b al() {
        return this.fm;
    }

    public final int am() {
        return this.dY;
    }

    public final String an() {
        return this.dX;
    }

    public final String ao() {
        if (!TextUtils.isEmpty(this.dR)) {
            try {
                URL url = new URL(this.dR);
                return url.getProtocol() + "://" + url.getHost();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public final List<String> ap() {
        Exception e2;
        ArrayList arrayList;
        String str = this.eA;
        try {
        } catch (Exception e3) {
            e2 = e3;
            arrayList = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                arrayList.add(jSONArray.optString(i2));
            } catch (Exception e4) {
                e2 = e4;
                e2.printStackTrace();
                return arrayList;
            }
        }
        return arrayList;
    }

    public final boolean aq() {
        return this.eL;
    }

    public final void ar() {
        this.eL = true;
    }

    public final int as() {
        return this.eO;
    }

    public final int at() {
        return this.eR;
    }

    public final String au() {
        return this.eT;
    }

    public final boolean av() {
        return this.cW;
    }

    public final void aw() {
        this.cW = true;
    }

    public final int ax() {
        return this.eW;
    }

    public final boolean ay() {
        return this.fn;
    }

    public final void az() {
        this.fn = true;
    }

    public final int b() {
        return this.da;
    }

    public final String c() {
        return this.cU;
    }

    public final String d() {
        return this.cV;
    }

    public final List<String> e() {
        return this.cX;
    }

    public final int f() {
        return this.db;
    }

    public final int g() {
        return this.dc;
    }

    public final int h() {
        return this.dd;
    }

    public final int i() {
        return this.dp;
    }

    public final boolean j() {
        return this.dn;
    }

    public final boolean k() {
        return this.f1do;
    }

    public final void l() {
        this.f1do = true;
    }

    public final int m() {
        return this.dq;
    }

    public final long n() {
        return this.f16de;
    }

    public final String o() {
        return this.dg;
    }

    private void A(int i2) {
        this.du = i2;
    }

    private void B(int i2) {
        this.dv = i2;
    }

    private void C(String str) {
        this.dO = str;
    }

    private void D(String str) {
        this.eC = str;
    }

    private void E(int i2) {
        this.eN = i2;
    }

    private void F(int i2) {
        this.dK = i2;
    }

    private void G(int i2) {
        this.dL = i2;
    }

    private void H(int i2) {
        this.eM = i2;
    }

    private void I(int i2) {
        this.eZ = i2;
    }

    private void T(String str) {
        this.em = str;
    }

    private void U(int i2) {
        this.ef = i2;
    }

    private void V(int i2) {
        this.eX = i2;
    }

    private void W(String str) {
        this.eb = str;
    }

    private void X(String str) {
        this.ec = str;
    }

    private void Y(int i2) {
        this.dP = i2;
    }

    private void Z(int i2) {
        this.dT = i2;
    }

    private static n ac(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                n nVar = new n();
                nVar.r(a(jSONObject.optJSONArray(bQ)));
                nVar.g(a(jSONObject.optJSONArray(bR)));
                nVar.h(a(jSONObject.optJSONArray(bS)));
                nVar.i(a(jSONObject.optJSONArray(bT)));
                nVar.j(a(jSONObject.optJSONArray(bU)));
                nVar.k(a(jSONObject.optJSONArray(bV)));
                nVar.a(b(jSONObject.optJSONArray(cg)));
                nVar.l(a(jSONObject.optJSONArray("mute")));
                nVar.m(a(jSONObject.optJSONArray(bX)));
                nVar.n(a(jSONObject.optJSONArray(bY)));
                nVar.o(a(jSONObject.optJSONArray(bZ)));
                nVar.p(a(jSONObject.optJSONArray(ca)));
                nVar.q(a(jSONObject.optJSONArray("error")));
                nVar.s(a(jSONObject.optJSONArray(cc)));
                nVar.u(a(jSONObject.optJSONArray(cd)));
                nVar.t(a(jSONObject.optJSONArray(cf)));
                nVar.v(a(jSONObject.optJSONArray(ce)));
                nVar.f(a(jSONObject.optJSONArray(bc)));
                nVar.d(a(jSONObject.optJSONArray(be)));
                nVar.e(a(jSONObject.optJSONArray(bf)));
                nVar.a(a(jSONObject.optJSONArray(h.cI)));
                nVar.b(a(jSONObject.optJSONArray(h.cJ)));
                nVar.c(a(jSONObject.optJSONArray(h.cK)));
                return nVar;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static Map<Integer, String> ad(String str) {
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                HashMap hashMap2 = new HashMap();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        int optInt = optJSONObject.optInt(ak);
                        hashMap2.put(Integer.valueOf(optInt), optJSONObject.optString("url"));
                    } catch (Exception e2) {
                        e = e2;
                        hashMap = hashMap2;
                        e.printStackTrace();
                        return hashMap;
                    }
                }
                return hashMap2;
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void ae(String str) {
        this.eQ = str;
    }

    private void af(String str) {
        this.eT = str;
    }

    private void ag(String str) {
        this.fi = str;
    }

    private void ah(String str) {
        this.fo = str;
    }

    private void ai(String str) {
        this.fq = str;
    }

    private void aj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(",");
        if (split.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : split) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            this.fr = arrayList;
        }
    }

    public final n J() {
        return this.fa;
    }

    public final C0061c L() {
        return this.fl;
    }

    public final int M() {
        return this.fj;
    }

    public final int N() {
        return this.eu;
    }

    public final String O() {
        return this.ew;
    }

    public final int P() {
        return this.er;
    }

    public final Map<Integer, String> Q() {
        return ad(this.ep);
    }

    public final String R() {
        return this.ek;
    }

    public final int S() {
        return this.el;
    }

    public final void a(String str) {
        this.cV = str;
    }

    public final void b(String str) {
        this.dm = str;
    }

    public final void c(int i2) {
        this.dk = i2;
    }

    public final void d(int i2) {
        this.dq = i2;
    }

    public final void e(int i2) {
        this.dB = i2;
    }

    public final void f(String str) {
        this.dD = str;
    }

    public final void g(String str) {
        this.dx = str;
    }

    public final void h(String str) {
        this.dz = str;
    }

    public final void i(String str) {
        this.eJ = str;
    }

    public final void j(String str) {
        this.fc = str;
    }

    public final void k(String str) {
        this.ev = str;
    }

    public final void l(String str) {
        this.ew = w.c(str);
    }

    @Override // com.anythink.expressad.out.j
    public final void m(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.er != 2 ? "Learn more" : "Install";
        }
        super.m(str);
    }

    public final void n(String str) {
        this.dS = str;
    }

    public final void o(String str) {
        this.dR = str;
    }

    public final String p() {
        return this.dh;
    }

    public final long q() {
        return this.di;
    }

    public final boolean r() {
        return this.dj;
    }

    public final int s() {
        return this.ds;
    }

    public final a t() {
        return this.dG;
    }

    public final int u() {
        return this.dB;
    }

    public final int v() {
        return this.dN;
    }

    public final String w() {
        return this.dO;
    }

    public final HashMap<String, String> x() {
        return this.eB;
    }

    public final boolean y() {
        return this.eH;
    }

    private void J(int i2) {
        this.fd = i2;
    }

    private void L(int i2) {
        this.ez = i2;
    }

    private void M(int i2) {
        this.eu = i2;
    }

    private void N(int i2) {
        this.ex = i2;
    }

    private void O(int i2) {
        this.er = i2;
    }

    private void P(int i2) {
        this.eo = i2;
    }

    private void Q(int i2) {
        this.eq = i2;
    }

    private void R(int i2) {
        this.el = i2;
    }

    private void S(int i2) {
        this.en = i2;
    }

    private void T(int i2) {
        this.ej = i2;
    }

    private void U(String str) {
        this.ed = str;
    }

    private void V(String str) {
        this.ee = str;
    }

    private void W(int i2) {
        this.dZ = i2;
    }

    private void X(int i2) {
        this.ea = i2;
    }

    private void Y(String str) {
        this.dU = str;
    }

    private void Z(String str) {
        this.dQ = str;
    }

    private void ae(int i2) {
        if (i2 <= 2 && i2 > 0) {
            this.fs = i2;
        } else {
            this.fs = 2;
        }
    }

    private void af(int i2) {
        if (i2 <= 2 && i2 > 0) {
            this.ft = i2;
        } else {
            this.ft = 1;
        }
    }

    private void ag(int i2) {
        this.fu = i2;
    }

    private void c(long j2) {
        this.df = j2;
    }

    public final int A() {
        return this.eN;
    }

    public final int B() {
        return this.dK;
    }

    public final int C() {
        return this.dL;
    }

    public final int D() {
        return this.eM;
    }

    public final String E() {
        return this.eJ;
    }

    public final boolean F() {
        return this.eK;
    }

    public final String G() {
        if (!TextUtils.isEmpty(this.eY)) {
            return wo1.C(new StringBuilder(), this.eY, "&n_logo=0");
        }
        return this.eY;
    }

    public final int H() {
        return this.eZ;
    }

    public final String I() {
        return this.fc;
    }

    public final void a(List<String> list) {
        this.cX = list;
    }

    public final void b(int i2) {
        this.dl = i2;
    }

    public final void d(String str) {
        this.dh = str;
    }

    public final void e(String str) {
        this.dC = str;
    }

    public final void f(int i2) {
        this.dy = i2;
    }

    public final void g(int i2) {
        this.dA = i2;
    }

    public final void h(int i2) {
        this.es = i2;
    }

    public final void i(int i2) {
        this.eR = i2;
    }

    public final void j(int i2) {
        this.eU = i2;
    }

    public final void k(int i2) {
        this.eW = i2;
    }

    public final void l(int i2) {
        this.fp = i2;
    }

    public final void p(String str) {
        this.eS = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.eT = str;
        if (s.e(str)) {
            this.dn = true;
        }
        this.fv = s.d(str);
    }

    public final void q(String str) {
        this.eV = str;
    }

    private void b(long j2) {
        this.f16de = j2;
    }

    private void d(long j2) {
        this.di = j2;
    }

    private void e(long j2) {
        this.fe = j2;
    }

    private void f(boolean z2) {
        this.dV = z2;
    }

    private void g(long j2) {
        this.cY = j2;
    }

    private void h(boolean z2) {
        this.fw = z2;
    }

    private void z(int i2) {
        this.dw = i2;
    }

    public final void a(int i2) {
        this.dd = i2;
    }

    public final void c(String str) {
        this.dg = w.c(str);
    }

    private void d(boolean z2) {
        this.eH = z2;
    }

    private void e(boolean z2) {
        this.eh = z2;
    }

    private boolean f(long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f16de > 0) {
            return (this.f16de * 1000) + bg() >= currentTimeMillis;
        }
        return bg() + j2 >= currentTimeMillis;
    }

    private void g(boolean z2) {
        this.fv = z2;
    }

    public final void a(boolean z2) {
        this.dj = z2;
    }

    public final void b(boolean z2) {
        this.eK = z2;
    }

    public final void c(boolean z2) {
        this.eg = z2;
    }

    public final String z() {
        return this.eI;
    }

    private void a(a aVar) {
        this.dG = aVar;
    }

    public static c b(JSONObject jSONObject) {
        ArrayList arrayList;
        c cVar = null;
        if (jSONObject != null) {
            try {
                c cVar2 = new c();
                try {
                    cVar2.s(jSONObject.optString("id"));
                    cVar2.u(jSONObject.optString("title"));
                    cVar2.v(jSONObject.optString("desc"));
                    cVar2.t(jSONObject.optString("package_name"));
                    cVar2.es = jSONObject.optInt(au);
                    cVar2.w(jSONObject.optString("icon_url"));
                    cVar2.x(jSONObject.optString("image_url"));
                    cVar2.y(jSONObject.optString("app_size"));
                    cVar2.dX = jSONObject.optString("image_size");
                    cVar2.dQ = jSONObject.optString("impression_url");
                    cVar2.dS = jSONObject.optString("click_url");
                    cVar2.aG = p.a(jSONObject.optString(aE));
                    cVar2.dT = jSONObject.optInt(M);
                    cVar2.dU = jSONObject.optString(N);
                    cVar2.dV = jSONObject.optBoolean(O, false);
                    cVar2.dR = jSONObject.optString("notice_url");
                    cVar2.dY = jSONObject.optInt("template");
                    cVar2.n(jSONObject.optInt("ad_source_id", 1));
                    cVar2.dZ = jSONObject.optInt(S);
                    cVar2.ea = jSONObject.optInt(T);
                    cVar2.eN = jSONObject.optInt("endcard_click_result");
                    if (!TextUtils.isEmpty(jSONObject.optString(X))) {
                        cVar2.a(Double.parseDouble(jSONObject.optString(X, "0")));
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString(Y))) {
                        cVar2.m(jSONObject.optInt(Y, 333333));
                    }
                    cVar2.eb = jSONObject.optString("click_mode");
                    cVar2.ec = jSONObject.optString("landing_type");
                    cVar2.er = jSONObject.optInt("link_type", 4);
                    cVar2.ef = jSONObject.optInt(aa);
                    cVar2.m(jSONObject.optString(Z));
                    cVar2.eA = jSONObject.optString("ad_url_list");
                    cVar2.fj = jSONObject.optInt(aw, 2);
                    cVar2.ek = jSONObject.optString("video_url");
                    cVar2.o(jSONObject.optInt("video_length"));
                    cVar2.el = jSONObject.optInt("video_size");
                    cVar2.em = jSONObject.optString(ae);
                    cVar2.en = jSONObject.optInt(af);
                    cVar2.a(System.currentTimeMillis());
                    cVar2.eo = jSONObject.optInt("ctype");
                    cVar2.ep = jSONObject.optString(ai);
                    cVar2.eq = jSONObject.optInt(aj);
                    cVar2.ev = jSONObject.optString(d.f);
                    cVar2.l(jSONObject.optString(d.k));
                    cVar2.et = jSONObject.optString(am);
                    cVar2.eu = jSONObject.optInt("offer_type");
                    cVar2.ey = jSONObject.optString("reward_name");
                    cVar2.ex = jSONObject.optInt("reward_amount");
                    try {
                        if (jSONObject.has(ch)) {
                            String optString = jSONObject.optString(ch);
                            if (!TextUtils.isEmpty(optString)) {
                                cVar2.fb = optString;
                                cVar2.fa = ac(optString);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        cVar2.eO = jSONObject.optInt("ready_rate", -1);
                        JSONObject optJSONObject = jSONObject.optJSONObject(bL);
                        if (optJSONObject != null) {
                            cVar2.eQ = optJSONObject.toString();
                        }
                        cVar2.eU = jSONObject.optInt(d.G);
                        cVar2.p(jSONObject.optString(d.F));
                        cVar2.eR = jSONObject.optInt(d.E);
                        new JSONArray();
                        JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                        if (optJSONArray == null || optJSONArray.length() <= 0) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(optJSONArray.length());
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.add(optJSONArray.optString(i2));
                            }
                        }
                        cVar2.cX = arrayList;
                        JSONObject optJSONObject2 = jSONObject.optJSONObject(d.H);
                        if (optJSONObject2 != null) {
                            cVar2.eV = optJSONObject2.toString();
                        }
                    } catch (Exception unused2) {
                    }
                    cVar2.eM = jSONObject.optInt(bA, 2);
                    if (a(cVar2, jSONObject.optString("endcard_url"))) {
                        return null;
                    }
                    cVar2.eZ = jSONObject.optInt(bN, 1);
                    if (jSONObject.has(aq)) {
                        cVar2.bI = jSONObject.optString(aq);
                    }
                    if (jSONObject.has(bb)) {
                        cVar2.dN = jSONObject.optInt(bb);
                    }
                    if (jSONObject.has(bd)) {
                        cVar2.dO = jSONObject.optString(bd);
                    }
                    cVar2.a(C0061c.a(jSONObject.optJSONObject(ci)));
                    cVar2.eX = jSONObject.optInt(ar, 2);
                    cVar2.dK = jSONObject.optInt(aV, 1);
                    cVar2.dL = jSONObject.optInt(aW, 1);
                    cVar2.dt = jSONObject.optInt(aF);
                    cVar2.dx = jSONObject.optString("ia_icon");
                    cVar2.dy = jSONObject.optInt("ia_rst");
                    cVar2.dz = jSONObject.optString("ia_url");
                    cVar2.dA = jSONObject.optInt("ia_ori");
                    cVar2.dB = jSONObject.optInt("ad_type");
                    cVar2.cZ = jSONObject.optInt(e);
                    cVar2.da = jSONObject.optInt(f);
                    cVar2.dC = jSONObject.optString(aR);
                    cVar2.dD = jSONObject.optString(aS);
                    cVar2.dE = jSONObject.optInt(aT);
                    cVar2.dF = jSONObject.optString(aU);
                    cVar2.dI = jSONObject.optInt(aI);
                    cVar2.dH = jSONObject.optInt(aH);
                    cVar2.dJ = jSONObject.optString(aJ);
                    cVar2.dG = a.a(jSONObject.optString(aK, ""));
                    cVar2.f16de = jSONObject.optLong("plct");
                    cVar2.df = jSONObject.optLong("plctb");
                    JSONArray optJSONArray2 = jSONObject.optJSONArray(aL);
                    if (optJSONArray2 == null) {
                        if (!TextUtils.isEmpty(jSONObject.optString(aL))) {
                            cVar2.fo = jSONObject.optString(aL);
                        } else {
                            cVar2.fo = null;
                        }
                    } else {
                        cVar2.fo = optJSONArray2.toString();
                    }
                    cVar2.di = jSONObject.optInt("creative_id");
                    String optString2 = jSONObject.optString("cam_tpl_url");
                    Uri parse = Uri.parse(optString2);
                    if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(j20.w) || parse.getPath().endsWith(".ZIP"))) {
                        cVar2.z(optString2);
                    } else {
                        cVar2.c(optString2);
                    }
                    cVar2.dh = jSONObject.optString("cam_html");
                    cVar2.cV = jSONObject.optString("cam_html");
                    cVar2.fc = jSONObject.optString("unitId");
                    String optString3 = jSONObject.optString(l);
                    if (TextUtils.isEmpty(optString3)) {
                        optString3 = jSONObject.optString(m);
                    }
                    if (!TextUtils.isEmpty(optString3)) {
                        cVar2.eK = true;
                        cVar2.eJ = optString3;
                    } else if (!TextUtils.isEmpty(cVar2.cV) && !cVar2.cV.contains("<MBTPLMARK>")) {
                        cVar2.eK = true;
                    } else {
                        cVar2.eK = false;
                    }
                    try {
                        String optString4 = jSONObject.optString(d.g);
                        if (!TextUtils.isEmpty(optString4)) {
                            cVar2.dW = optString4;
                            Uri parse2 = Uri.parse(optString4);
                            if (parse2 != null) {
                                cVar2.ed = parse2.getQueryParameter("k");
                            }
                        }
                        String optString5 = jSONObject.optString("notice_url");
                        if (!TextUtils.isEmpty(optString5)) {
                            cVar2.dR = optString5;
                            Uri parse3 = Uri.parse(optString5);
                            if (parse3 != null) {
                                cVar2.ee = parse3.getQueryParameter("k");
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    cVar2.eH = jSONObject.optBoolean("hb", false);
                    cVar2.fh = jSONObject.optInt(p);
                    cVar2.fi = jSONObject.optString(q);
                    cVar2.dr = jSONObject.optInt(ax);
                    cVar2.ds = jSONObject.optInt(ay);
                    cVar2.dc = jSONObject.optInt(w, -2);
                    cVar2.dd = jSONObject.optInt(x, -2);
                    cVar2.db = jSONObject.optInt("adspace_t", 1);
                    c a2 = h.a(jSONObject, cVar2);
                    a2.dk = jSONObject.optInt("vcn");
                    a2.dl = jSONObject.optInt("token_r");
                    a2.dm = jSONObject.optString("encrypt_p");
                    a2.dp = jSONObject.optInt(u);
                    a2.ae(jSONObject.optInt(aA, 2));
                    a2.af(jSONObject.optInt(az, 1));
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(aB);
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i3)));
                        }
                        if (arrayList2.size() > 0) {
                            a2.fr = arrayList2;
                        }
                    }
                    return a2;
                } catch (Exception e2) {
                    e = e2;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return cVar;
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (!jSONObject.has(bK) || (optJSONArray = jSONObject.optJSONArray(bK)) == null || optJSONArray.length() <= 0) {
                return jSONObject;
            }
            jSONObject.remove(bK);
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject a2 = com.anythink.expressad.foundation.c.a.a.a().a(optJSONArray.getString(i2));
                if (a2 != null) {
                    Iterator<String> keys = a2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, a2.opt(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String K() {
        return this.eA;
    }

    private void K(int i2) {
        this.fj = i2;
    }

    private void a(p pVar) {
        this.aG = pVar;
    }

    private void a(HashMap<String, String> hashMap) {
        this.eB = hashMap;
    }

    private void aa(String str) {
        this.dW = str;
    }

    private void ab(String str) {
        this.dX = str;
    }

    private void a(n nVar) {
        this.fa = nVar;
    }

    private void aa(int i2) {
        this.dY = i2;
    }

    private void ab(int i2) {
        this.eO = i2;
    }

    private void a(b bVar) {
        this.fk = bVar;
    }

    private void a(C0061c c0061c) {
        this.fl = c0061c;
        if (c0061c == null || TextUtils.isEmpty(c0061c.e())) {
            return;
        }
        if (TextUtils.isEmpty(this.eS) && c0061c.e().contains(d)) {
            this.eT = c0061c.e();
        }
        if (s.e(c0061c.e())) {
            this.dn = true;
        }
    }

    private void ad(int i2) {
        this.fh = i2;
    }

    @Override // com.anythink.expressad.foundation.d.h
    public final void a(c.b bVar) {
        this.fm = bVar;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = new c();
        cVar.s(jSONObject.optString("campaignid"));
        cVar.t(jSONObject.optString("packageName"));
        cVar.u(jSONObject.optString("title"));
        cVar.m(jSONObject.optString(a.C0020a.k));
        cVar.v(jSONObject.optString("desc"));
        cVar.dQ = jSONObject.optString("impression_url");
        cVar.x(jSONObject.optString("image_url"));
        cVar.f16de = jSONObject.optLong("plct");
        cVar.df = jSONObject.optLong("plctb");
        cVar.cV = jSONObject.optString(c);
        cVar.z(jSONObject.optString(b));
        cVar.c(jSONObject.optString(i));
        cVar.dh = jSONObject.optString(j);
        cVar.di = jSONObject.optInt("creative_id");
        return cVar;
    }

    private static boolean a(c cVar, String str) {
        C0061c c0061c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.anythink.expressad.foundation.b.a.b().i() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        cVar.eY = str;
        if (TextUtils.isEmpty(cVar.eS) && (((c0061c = cVar.fl) == null || TextUtils.isEmpty(c0061c.k)) && !TextUtils.isEmpty(str) && str.contains(d))) {
            cVar.eT = str;
        }
        cVar.fw = s.d(str);
        return false;
    }

    private static c a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, d dVar) {
        return a(jSONObject, str, str2, str3, z2, dVar, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:61|(1:63)|64|(1:66)|67|(1:69)|70|(1:118)(1:76)|77|(1:79)(2:112|(9:117|81|(2:83|(1:85)(1:110))(1:111)|86|87|88|89|(5:93|(2:96|94)|97|98|(1:100))|102)(1:116))|80|81|(0)(0)|86|87|88|89|(6:91|93|(1:94)|97|98|(0))|102) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0494, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0495, code lost:
        com.anythink.expressad.foundation.h.n.d(com.p7700g.p99005.rs2.f.f, r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04de A[Catch: Exception -> 0x04e1, TRY_LEAVE, TryCatch #5 {Exception -> 0x04e1, blocks: (B:91:0x049e, B:93:0x04b9, B:95:0x04bf, B:96:0x04c4, B:98:0x04ca, B:99:0x04d8, B:101:0x04de, B:90:0x0495, B:87:0x047f), top: B:117:0x047f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0426 A[Catch: Exception -> 0x04e3, TryCatch #2 {Exception -> 0x04e3, blocks: (B:5:0x001f, B:7:0x002b, B:9:0x003b, B:11:0x0041, B:12:0x0055, B:13:0x0057, B:15:0x005e, B:31:0x00d2, B:33:0x01aa, B:34:0x01b7, B:36:0x01c1, B:37:0x01cb, B:40:0x0214, B:41:0x0217, B:42:0x021d, B:48:0x02b2, B:52:0x02c8, B:54:0x02d7, B:55:0x02dd, B:57:0x02e3, B:58:0x02e9, B:60:0x02ef, B:61:0x02f5, B:63:0x03c9, B:65:0x03d5, B:67:0x03e1, B:69:0x03e8, B:71:0x0400, B:79:0x0420, B:81:0x0426, B:83:0x0430, B:86:0x0441, B:84:0x0437, B:85:0x043b, B:73:0x0407, B:75:0x040f, B:77:0x0419, B:78:0x041d, B:68:0x03e5), top: B:119:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x043b A[Catch: Exception -> 0x04e3, TryCatch #2 {Exception -> 0x04e3, blocks: (B:5:0x001f, B:7:0x002b, B:9:0x003b, B:11:0x0041, B:12:0x0055, B:13:0x0057, B:15:0x005e, B:31:0x00d2, B:33:0x01aa, B:34:0x01b7, B:36:0x01c1, B:37:0x01cb, B:40:0x0214, B:41:0x0217, B:42:0x021d, B:48:0x02b2, B:52:0x02c8, B:54:0x02d7, B:55:0x02dd, B:57:0x02e3, B:58:0x02e9, B:60:0x02ef, B:61:0x02f5, B:63:0x03c9, B:65:0x03d5, B:67:0x03e1, B:69:0x03e8, B:71:0x0400, B:79:0x0420, B:81:0x0426, B:83:0x0430, B:86:0x0441, B:84:0x0437, B:85:0x043b, B:73:0x0407, B:75:0x040f, B:77:0x0419, B:78:0x041d, B:68:0x03e5), top: B:119:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04ca A[Catch: Exception -> 0x04e1, LOOP:2: B:96:0x04c4->B:98:0x04ca, LOOP_END, TryCatch #5 {Exception -> 0x04e1, blocks: (B:91:0x049e, B:93:0x04b9, B:95:0x04bf, B:96:0x04c4, B:98:0x04ca, B:99:0x04d8, B:101:0x04de, B:90:0x0495, B:87:0x047f), top: B:117:0x047f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, d dVar, String str4) {
        c cVar;
        int i2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        ArrayList<Integer> arrayList;
        ArrayList arrayList2;
        JSONObject c2 = c(jSONObject);
        if (c2 == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                String optString = c2.optString(bg);
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    HashMap<String, String> hashMap = new HashMap<>();
                    for (Iterator<String> keys = jSONObject2.keys(); keys != null && keys.hasNext(); keys = keys) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    cVar2.eB = hashMap;
                }
                if (!TextUtils.isEmpty(str4)) {
                    cVar2.eI = str4;
                    cVar2.eH = true;
                }
                try {
                    cVar2.eO = c2.optInt("ready_rate", -1);
                    JSONObject optJSONObject = c2.optJSONObject(bL);
                    if (optJSONObject != null) {
                        cVar2.eQ = optJSONObject.toString();
                    }
                    cVar2.eU = c2.optInt(d.G);
                    cVar2.p(c2.optString(d.F));
                    cVar2.eR = c2.optInt(d.E);
                    new JSONArray();
                    JSONArray optJSONArray3 = c2.optJSONArray("pv_urls");
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList(optJSONArray3.length());
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            arrayList2.add(optJSONArray3.optString(i3));
                        }
                    }
                    cVar2.cX = arrayList2;
                    JSONObject optJSONObject2 = c2.optJSONObject(d.H);
                    if (optJSONObject2 != null) {
                        cVar2.eV = optJSONObject2.toString();
                    }
                } catch (Exception unused) {
                }
                cVar2.s(c2.optString("id"));
                cVar2.u(c2.optString("title"));
                cVar2.fc = c2.optString("unitId", "");
                cVar2.v(c2.optString("desc"));
                cVar2.t(c2.optString("package_name"));
                cVar2.es = c2.optInt(au);
                cVar2.w(c2.optString("icon_url"));
                cVar2.x(c2.optString("image_url"));
                cVar2.y(c2.optString("app_size"));
                cVar2.dX = c2.optString("image_size");
                cVar2.dQ = h.a(dVar, cVar2, c2.optString("impression_url"));
                cVar2.dS = h.a(dVar, cVar2, c2.optString("click_url"));
                cVar2.aG = p.a(c2.optString(aE));
                cVar2.dT = c2.optInt(M);
                cVar2.dU = h.a(dVar, cVar2, c2.optString(N));
                cVar2.dV = c2.optBoolean(O, false);
                cVar2.dR = h.a(dVar, cVar2, c2.optString("notice_url"));
                cVar2.dY = c2.optInt("template");
                cVar2.n(c2.optInt("ad_source_id", 1));
                cVar2.dZ = c2.optInt(S);
                cVar2.ea = c2.optInt(T);
                cVar2.eN = c2.optInt("endcard_click_result");
                if (!TextUtils.isEmpty(c2.optString(X))) {
                    cVar2.a(Double.parseDouble(c2.optString(X, "0")));
                }
                if (!TextUtils.isEmpty(c2.optString(Y))) {
                    cVar2.m(c2.optInt(Y, 333333));
                }
                cVar2.eb = c2.optString("click_mode");
                cVar2.ec = c2.optString("landing_type");
                cVar2.er = c2.optInt("link_type", 4);
                cVar2.ef = c2.optInt(aa);
                cVar2.m(c2.optString(Z));
                cVar2.eA = c2.optString("ad_url_list");
                cVar2.fj = c2.optInt(aw, 2);
                String optString2 = c2.optString("video_url");
                if (!TextUtils.isEmpty(optString2)) {
                    if (z2) {
                        cVar2.ek = optString2;
                    } else {
                        cVar2.ek = com.anythink.expressad.foundation.h.i.b(optString2);
                    }
                }
                cVar2.dp = c2.optInt(u);
                cVar2.o(c2.optInt("video_length"));
                cVar2.el = c2.optInt("video_size");
                cVar2.em = c2.optString(ae);
                cVar2.en = c2.optInt(af);
                cVar2.a(System.currentTimeMillis());
                cVar2.dW = h.a(dVar, cVar2, str);
                cVar2.eo = c2.optInt("ctype");
                cVar2.ep = c2.optString(ai);
                cVar2.eq = c2.optInt(aj);
                cVar2.ev = str2;
                cVar2.l(str3);
                cVar2.et = c2.optString(am);
                cVar2.eu = c2.optInt("offer_type");
                cVar2.ey = c2.optString("reward_name");
                cVar2.ex = c2.optInt("reward_amount");
                try {
                    if (c2.has(ch)) {
                        String a2 = h.a(dVar, cVar2, c2.optString(ch));
                        if (!TextUtils.isEmpty(a2)) {
                            cVar2.fb = a2;
                            cVar2.fa = ac(a2);
                        }
                    }
                } catch (Exception unused2) {
                }
                cVar2.eM = c2.optInt(bA, 2);
                if (a(cVar2, c2.optString("endcard_url"))) {
                    return null;
                }
                cVar2.eZ = c2.optInt(bN, 1);
                if (c2.has(aq)) {
                    cVar2.bI = c2.optString(aq);
                }
                if (c2.has(bb)) {
                    cVar2.dN = c2.optInt(bb);
                }
                if (c2.has(bd)) {
                    cVar2.dO = c2.optString(bd);
                }
                cVar2.a(C0061c.a(c2.optJSONObject(ci)));
                cVar2.eX = c2.optInt(ar, 2);
                cVar2.dK = c2.optInt(aV, 1);
                cVar2.dL = c2.optInt(aW, 1);
                cVar2.dt = c2.optInt(aF);
                cVar2.dx = c2.optString("ia_icon");
                cVar2.dy = c2.optInt("ia_rst");
                cVar2.dz = c2.optString("ia_url");
                cVar2.dA = c2.optInt("ia_ori");
                cVar2.dB = dVar.d();
                cVar2.cZ = c2.optInt(e);
                cVar2.da = c2.optInt(f);
                cVar2.dC = c2.optString(aR);
                cVar2.dD = c2.optString(aS);
                cVar2.dE = c2.optInt(aT);
                cVar2.dF = c2.optString(aU);
                cVar2.dI = c2.optInt(aI);
                cVar2.dH = c2.optInt(aH);
                cVar2.dJ = c2.optString(aJ);
                cVar2.dG = a.a(c2.optString(aK, ""));
                cVar2.f16de = c2.optLong("plct");
                cVar2.df = c2.optLong("plctb");
                cVar2.di = c2.optLong("creative_id");
                String optString3 = c2.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString3);
                if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(j20.w) || parse.getPath().endsWith(".ZIP"))) {
                    cVar2.z(optString3);
                } else {
                    cVar2.c(optString3);
                }
                cVar2.dh = c2.optString("cam_html");
                cVar2.cV = c2.optString("cam_html");
                String optString4 = c2.optString(l);
                try {
                    if (!TextUtils.isEmpty(optString4)) {
                        cVar2.eK = true;
                        cVar2.eJ = optString4;
                    } else if (!TextUtils.isEmpty(cVar2.cV) && !cVar2.cV.contains("<MBTPLMARK>")) {
                        cVar2.eK = true;
                    } else {
                        i2 = 0;
                        cVar2.eK = false;
                        optJSONArray = c2.optJSONArray(aL);
                        if (optJSONArray != null) {
                            if (!TextUtils.isEmpty(c2.optString(aL))) {
                                cVar2.fo = c2.optString(aL);
                            } else {
                                cVar2.fo = null;
                            }
                        } else {
                            cVar2.fo = optJSONArray.toString();
                        }
                        cVar2.fh = c2.optInt(p);
                        cVar2.fi = c2.optString(q);
                        cVar2.dr = c2.optInt(ax);
                        cVar2.dc = c2.optInt(w, -2);
                        cVar2.dd = c2.optInt(x, -2);
                        cVar2.db = c2.optInt("adspace_t", 1);
                        cVar2.ds = c2.optInt(ay);
                        cVar = h.b(c2, cVar2);
                        cVar.dQ = s.a(com.anythink.core.common.b.m.a().e(), cVar.ba(), cVar.dQ);
                        cVar.ae(c2.optInt(aA, 2));
                        cVar.af(c2.optInt(az, 1));
                        optJSONArray2 = c2.optJSONArray(aB);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            arrayList = new ArrayList<>();
                            while (i2 < optJSONArray2.length()) {
                                arrayList.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                                i2++;
                            }
                            if (arrayList.size() > 0) {
                                cVar.fr = arrayList;
                            }
                        }
                        return cVar;
                    }
                    cVar.dQ = s.a(com.anythink.core.common.b.m.a().e(), cVar.ba(), cVar.dQ);
                    cVar.ae(c2.optInt(aA, 2));
                    cVar.af(c2.optInt(az, 1));
                    optJSONArray2 = c2.optJSONArray(aB);
                    if (optJSONArray2 != null) {
                        arrayList = new ArrayList<>();
                        while (i2 < optJSONArray2.length()) {
                        }
                        if (arrayList.size() > 0) {
                        }
                    }
                    return cVar;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return cVar;
                }
                i2 = 0;
                optJSONArray = c2.optJSONArray(aL);
                if (optJSONArray != null) {
                }
                cVar2.fh = c2.optInt(p);
                cVar2.fi = c2.optString(q);
                cVar2.dr = c2.optInt(ax);
                cVar2.dc = c2.optInt(w, -2);
                cVar2.dd = c2.optInt(x, -2);
                cVar2.db = c2.optInt("adspace_t", 1);
                cVar2.ds = c2.optInt(ay);
                cVar = h.b(c2, cVar2);
            } catch (Exception e3) {
                e = e3;
                cVar = cVar2;
            }
        } catch (Exception e4) {
            e = e4;
            cVar = null;
        }
    }

    private void ac(int i2) {
        this.cT = i2;
    }

    public static JSONArray b(List<c> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        for (c cVar : list) {
                            jSONArray2.put(a(cVar));
                        }
                        return jSONArray2;
                    } catch (Exception e2) {
                        e = e2;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return jSONArray;
    }

    private static List<Map<Integer, String>> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap hashMap = new HashMap();
                        int i3 = jSONObject.getInt("rate");
                        hashMap.put(Integer.valueOf(i3), jSONObject.getString("url"));
                        arrayList.add(hashMap);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    private static n a(JSONObject jSONObject, n nVar) {
        nVar.a(a(jSONObject.optJSONArray(h.cI)));
        nVar.b(a(jSONObject.optJSONArray(h.cJ)));
        nVar.c(a(jSONObject.optJSONArray(h.cK)));
        return nVar;
    }

    private static String[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            strArr[i2] = jSONArray.optString(i2);
        }
        return strArr;
    }

    public static JSONObject a(c cVar, boolean z2, boolean z3) {
        JSONObject a2 = a(cVar);
        a2.put("isReady", z2);
        a2.put("expired", z3);
        return a2;
    }

    public static JSONObject a(c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", cVar.aZ());
        jSONObject.put(ax, cVar.dr);
        jSONObject.put(ay, cVar.ds);
        jSONObject.put("adspace_t", cVar.db);
        jSONObject.put(x, cVar.dd);
        jSONObject.put(w, cVar.dc);
        if (!TextUtils.isEmpty(cVar.fc)) {
            jSONObject.put("unitId", cVar.fc);
        }
        if (!TextUtils.isEmpty(cVar.eQ)) {
            try {
                jSONObject.put(bL, new JSONObject(cVar.eQ));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(cVar.eV)) {
            try {
                jSONObject.put(d.H, new JSONObject(cVar.eV));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        List<String> list = cVar.cX;
        if (list != null && list.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : cVar.cX) {
                    jSONArray.put(str);
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(cVar.eS)) {
            jSONObject.put(d.G, cVar.eU);
            jSONObject.put(d.F, cVar.eS);
            jSONObject.put(d.E, cVar.eR);
        }
        jSONObject.put("ready_rate", cVar.eO);
        jSONObject.put("title", cVar.bb());
        jSONObject.put("desc", cVar.bc());
        jSONObject.put("package_name", cVar.ba());
        jSONObject.put(au, cVar.es);
        jSONObject.put("icon_url", cVar.bd());
        jSONObject.put("image_url", cVar.be());
        jSONObject.put("app_size", cVar.bh());
        jSONObject.put("image_size", cVar.dX);
        jSONObject.put("impression_url", cVar.dQ);
        jSONObject.put("click_url", cVar.dS);
        p pVar = cVar.aG;
        if (pVar != null) {
            jSONObject.put(aE, pVar.c());
        }
        jSONObject.put(M, cVar.dT);
        jSONObject.put(N, cVar.dU);
        jSONObject.put(O, cVar.dV);
        jSONObject.put("notice_url", cVar.dR);
        jSONObject.put("template", cVar.dY);
        jSONObject.put("ad_source_id", cVar.bf());
        jSONObject.put(S, cVar.dZ);
        jSONObject.put(T, cVar.ea);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.aX());
        jSONObject.put(X, sb.toString());
        jSONObject.put(Y, cVar.aY());
        jSONObject.put("click_mode", cVar.eb);
        jSONObject.put("landing_type", cVar.ec);
        jSONObject.put("link_type", cVar.er);
        jSONObject.put(aa, cVar.ef);
        jSONObject.put(Z, cVar.cS);
        jSONObject.put("endcard_click_result", cVar.eN);
        jSONObject.put(aw, cVar.fj);
        jSONObject.put("video_url", cVar.ek);
        jSONObject.put("video_length", cVar.bi());
        jSONObject.put("video_size", cVar.el);
        jSONObject.put(ae, cVar.em);
        jSONObject.put(af, cVar.en);
        jSONObject.put("ad_url_list", cVar.eA);
        jSONObject.put(d.g, cVar.dW);
        jSONObject.put("ctype", cVar.eo);
        jSONObject.put(aj, cVar.eq);
        jSONObject.put(ai, cVar.ep);
        jSONObject.put(d.f, cVar.ev);
        jSONObject.put(d.k, cVar.ew);
        jSONObject.put(am, cVar.et);
        jSONObject.put("offer_type", cVar.eu);
        jSONObject.put("reward_amount", cVar.ex);
        jSONObject.put("reward_name", cVar.ey);
        jSONObject.put(bd, cVar.dO);
        if (v.b(cVar.fb)) {
            jSONObject.put(ch, new JSONObject(cVar.fb));
        }
        jSONObject.put(bA, cVar.eM);
        jSONObject.put("endcard_url", cVar.G());
        jSONObject.put(bN, cVar.eZ);
        C0061c c0061c = cVar.fl;
        if (c0061c != null && v.b(c0061c.a())) {
            jSONObject.put(ci, new JSONObject(cVar.fl.a()));
        }
        jSONObject.put(aq, cVar.bI);
        jSONObject.put(ar, cVar.eX);
        jSONObject.put(aW, cVar.dL);
        jSONObject.put(aV, cVar.dK);
        jSONObject.put(aF, cVar.dt);
        jSONObject.put("ia_icon", cVar.dx);
        jSONObject.put("ia_rst", cVar.dy);
        jSONObject.put("ia_url", cVar.dz);
        jSONObject.put("ia_ori", cVar.dA);
        jSONObject.put("ad_type", cVar.dB);
        jSONObject.put(aR, cVar.dC);
        jSONObject.put(aS, cVar.dD);
        jSONObject.put(aT, cVar.dE);
        jSONObject.put(aU, cVar.dF);
        jSONObject.put(aH, cVar.dH);
        jSONObject.put(aI, cVar.dI);
        jSONObject.put(aJ, cVar.dJ);
        a aVar = cVar.dG;
        if (aVar != null) {
            jSONObject.put(aK, new JSONObject(aVar.a()));
        }
        jSONObject.put("plct", cVar.f16de);
        jSONObject.put("plctb", cVar.df);
        jSONObject.put(aL, cVar.fo);
        jSONObject.put("creative_id", cVar.di);
        jSONObject.put("cam_html", cVar.dh);
        String str2 = cVar.dg;
        if (str2 == null) {
            str2 = cVar.cU;
        }
        jSONObject.put("cam_tpl_url", str2);
        jSONObject.put(l, cVar.eJ);
        jSONObject.put(m, cVar.eJ);
        jSONObject.put("timestamp", cVar.bg());
        jSONObject.put("hb", cVar.eH);
        jSONObject.put(p, cVar.fh);
        jSONObject.put(q, cVar.fi);
        int i2 = cVar.dk;
        if (i2 <= 0) {
            i2 = 1;
        }
        jSONObject.put("vcn", i2);
        int i3 = cVar.dl;
        if (i3 != 1) {
            i3 = 0;
        }
        jSONObject.put("token_r", i3);
        jSONObject.put("encrypt_p", cVar.dm);
        jSONObject.put(u, cVar.dp);
        jSONObject.put(aB, cVar.fr);
        jSONObject.put(aA, cVar.fs);
        jSONObject.put(az, cVar.ft);
        jSONObject.put(e, cVar.cZ);
        jSONObject.put(f, cVar.da);
        try {
            jSONObject.put("misk_spt", com.anythink.core.common.o.a().c());
            com.anythink.core.common.o.a();
            jSONObject.put("misk_spt_det", com.anythink.core.common.o.b());
        } catch (JSONException unused) {
        }
        jSONObject.put(h.cu, cVar.aW());
        jSONObject.put(h.cv, cVar.aV());
        jSONObject.put(h.cy, cVar.aU());
        jSONObject.put("ttc_type", cVar.aT());
        jSONObject.put(h.cA, cVar.aS());
        jSONObject.put(h.cB, cVar.aN());
        jSONObject.put(h.cC, com.anythink.expressad.foundation.h.i.a(cVar.aO()));
        jSONObject.put(h.cD, cVar.aP());
        jSONObject.put(h.cn, cVar.aI());
        jSONObject.put(h.co, cVar.aH());
        if (cVar.aG() != null) {
            jSONObject.put(h.cp, cVar.aG().g());
        }
        jSONObject.put(h.cE, cVar.aQ());
        jSONObject.put(h.cF, cVar.aR());
        jSONObject.put(bb, cVar.dN);
        jSONObject.put(h.cr, cVar.aK());
        jSONObject.put(h.cq, cVar.aJ());
        jSONObject.put(h.cs, cVar.aL());
        jSONObject.put(h.ct, cVar.aM());
        return jSONObject;
    }

    private void a(ArrayList<Integer> arrayList) {
        this.fr = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (((r11.f16de * 1000) + bg()) >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if ((bg() + r12) >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j2, long j3) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f16de > 0) {
        }
        if (z2) {
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.df > 0) {
            return (this.df * 1000) + bg() >= currentTimeMillis2;
        }
        return bg() + j3 >= currentTimeMillis2;
    }
}