package com.anythink.expressad.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.h.g;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private int A;
    private String B;
    private long C;
    private int D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int I;
    private String J;
    private String K;
    private int L;
    private List<com.anythink.expressad.foundation.d.c> M;
    private List<com.anythink.expressad.foundation.d.b> N;
    private int R;
    private LinkedList<String> S;
    private int Y;
    private List<String> Z;
    private int aE;
    private long aG;
    private long aH;
    private int aI;
    private int aJ;
    private long aK;
    private int aM;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private String ae;
    private String af;
    private String ao;
    private String b;
    private Map<String, C0059a> be;
    private b bg;
    private String bl;
    private String bm;
    private long c;
    private int d;
    private int f;
    private boolean g;
    private Map<String, String> h;
    private boolean i;
    private long j;
    private List<c> l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private long u;
    private List<String> v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int a = 0;
    private long e = com.anythink.expressad.d.a.b.aT;
    private String k = "";
    private boolean O = false;
    private int P = 3;
    private boolean Q = true;
    private int T = 0;
    private int U = com.anythink.expressad.d.a.b.ck;
    private int V = 10;
    private int W = 120;
    private String X = "";
    private int ag = 1;
    private int ah = 1;
    private int ai = 1;
    private int aj = 0;
    private int ak = 1;
    private String al = "";
    private int am = 0;
    private int an = 2;
    private int ap = 86400;
    private String aq = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";
    private String ar = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";
    private int as = 1;
    private int at = 30;
    private int au = 5;
    private int av = 0;
    private int aw = 0;
    private int ax = 9377;
    private int ay = 0;
    private int az = 0;
    private int aA = 0;
    private int aB = 2;
    private int aC = 10;
    private List<Integer> aD = new ArrayList();
    private int aF = 1;
    private int aL = 3;
    private String aN = "";
    private String aO = "";
    private String aP = "";
    private String aQ = "";
    private String aR = "";
    private int aS = 0;
    private int aT = 21600;
    private int aU = 2;
    private int aV = 0;
    private int aW = 0;
    private int aX = 604800;
    private int aY = 0;
    private String aZ = "";
    private String ba = "";
    private String bb = "";
    private String bc = "";
    private String bd = "";
    private int bf = 0;
    private int bh = 0;
    private String bi = "";
    private int bj = 2;
    private int bk = 7200;
    private int bn = 0;
    private boolean bo = false;
    private int bp = 0;
    private int bq = 0;
    private int br = 0;
    private int bs = 0;
    private int bt = 3;
    private int bu = 600;
    private int bv = 10;

    /* renamed from: com.anythink.expressad.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0059a {
        private List<String> a;
        private List<String> b;
        private List<String> c;
        private List<String> d;

        private List<String> a() {
            return this.a;
        }

        private List<String> b() {
            return this.b;
        }

        private List<String> c() {
            return this.c;
        }

        private List<String> d() {
            return this.d;
        }

        private void a(List<String> list) {
            this.a = list;
        }

        private void b(List<String> list) {
            this.b = list;
        }

        private void c(List<String> list) {
            this.c = list;
        }

        private void d(List<String> list) {
            this.d = list;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.a = g.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.b = g.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.c = g.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.d = g.a(optJSONArray4);
                }
            } catch (Exception e) {
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        private String a;
        private String b;
        private String c;
        private JSONArray d;

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context e = m.a().e();
            bVar.a = jSONObject.optString("title", e.getString(h.a(e, "anythink_cm_feedback_dialog_title", "string")));
            bVar.b = jSONObject.optString(com.anythink.expressad.d.a.b.dO, e.getString(h.a(e, "anythink_cm_feedback_dialog_close_close", "string")));
            bVar.c = jSONObject.optString(com.anythink.expressad.d.a.b.dP, e.getString(h.a(e, "anythink_cm_feedback_dialog_close_submit", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.d = jSONArray;
                jSONArray.put(e.getString(h.a(e, "anythink_cm_feedback_dialog_content_stuck", "string")));
                bVar.d.put(e.getString(h.a(e, "anythink_cm_feedback_dialog_content_cnr", "string")));
                bVar.d.put(e.getString(h.a(e, "anythink_cm_feedback_dialog_content_balck_screen", "string")));
                bVar.d.put(e.getString(h.a(e, "anythink_cm_feedback_dialog_content_other", "string")));
            }
            return bVar;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final JSONArray d() {
            return this.d;
        }

        private void b(String str) {
            this.b = str;
        }

        private void c(String str) {
            this.c = str;
        }

        public final String a() {
            return this.a;
        }

        private void a(String str) {
            this.a = str;
        }

        private void a(JSONArray jSONArray) {
            this.d = jSONArray;
        }
    }

    private void A(int i) {
        this.t = i;
    }

    private void B(int i) {
        this.A = i;
    }

    private void C(int i) {
        this.x = i;
    }

    private void D(int i) {
        this.y = i;
    }

    private void E(int i) {
        this.z = i;
    }

    private void F(int i) {
        this.aL = i;
    }

    private void G(int i) {
        this.aI = i;
    }

    private void H(int i) {
        this.aJ = i;
    }

    private void I(int i) {
        this.f = i;
    }

    private void J(int i) {
        this.r = i;
    }

    private void K(int i) {
        this.s = i;
    }

    private void L(int i) {
        this.aY = i;
    }

    private void M(int i) {
        this.aS = i;
    }

    private void N(int i) {
        this.aT = i;
    }

    private void O(int i) {
        this.aU = i;
    }

    private void P(int i) {
        this.aV = i;
    }

    private void Q(int i) {
        this.aW = i;
    }

    private void R(int i) {
        this.aX = i;
    }

    private void S(int i) {
        this.at = i;
    }

    private void T(int i) {
        this.au = i;
    }

    private void U(int i) {
        this.av = i;
    }

    private void V(int i) {
        this.aw = i;
    }

    private void W(int i) {
        this.ax = i;
    }

    private void X(int i) {
        this.P = i;
    }

    private void Y(int i) {
        this.bf = i;
    }

    private int Z() {
        return this.R;
    }

    private String aA() {
        return this.K;
    }

    private int aB() {
        return this.aF;
    }

    private int aC() {
        return this.aE;
    }

    private int aD() {
        return this.Y;
    }

    private List<String> aE() {
        return this.Z;
    }

    private int aF() {
        return this.aa;
    }

    private int aG() {
        return this.ab;
    }

    private int aH() {
        return this.ac;
    }

    private int aI() {
        return this.ad;
    }

    private String aJ() {
        return this.ae;
    }

    private int aK() {
        return this.G;
    }

    private int aL() {
        return this.H;
    }

    private List<com.anythink.expressad.foundation.d.c> aM() {
        return this.M;
    }

    private int aN() {
        return this.I;
    }

    private String aO() {
        return this.J;
    }

    private int aP() {
        return this.D;
    }

    private long aQ() {
        return this.E;
    }

    private long aR() {
        return this.F;
    }

    private long aS() {
        return this.C * 1000;
    }

    private int aT() {
        return this.t;
    }

    private String aU() {
        return this.B;
    }

    private int aV() {
        return this.y;
    }

    private int aW() {
        return this.z;
    }

    private int aX() {
        return this.aL;
    }

    private long aY() {
        return this.aK;
    }

    private int aZ() {
        return this.aI;
    }

    private List<com.anythink.expressad.foundation.d.b> aa() {
        return this.N;
    }

    private String ab() {
        return this.X;
    }

    private int ac() {
        return this.V;
    }

    private LinkedList<String> ad() {
        return this.S;
    }

    private int ae() {
        return this.a;
    }

    private int af() {
        return this.T;
    }

    private int ag() {
        return this.U * 1000;
    }

    private int ah() {
        return this.aC;
    }

    private int ai() {
        return this.ay;
    }

    private int aj() {
        return this.az;
    }

    private int ak() {
        return this.aA;
    }

    private int al() {
        return this.aB;
    }

    private int am() {
        return this.as;
    }

    private String an() {
        return this.aq;
    }

    private String ao() {
        return this.ar;
    }

    private int ap() {
        return this.ap;
    }

    private int aq() {
        return this.an;
    }

    private String ar() {
        return this.ao;
    }

    private int as() {
        return this.ag;
    }

    private int at() {
        return this.ah;
    }

    private int au() {
        return this.ai;
    }

    private int av() {
        return this.aj;
    }

    private int aw() {
        return this.ak;
    }

    private String ax() {
        return this.al;
    }

    private int ay() {
        return this.am;
    }

    private int az() {
        return this.L;
    }

    private int bA() {
        return this.aW;
    }

    private int bB() {
        return this.aX;
    }

    private String bC() {
        return this.bc;
    }

    private String bD() {
        return this.bd;
    }

    private Map<String, C0059a> bE() {
        return this.be;
    }

    private boolean bF() {
        return (TextUtils.isEmpty(this.aZ) || TextUtils.isEmpty(this.bb) || TextUtils.isEmpty(this.ba)) ? false : true;
    }

    private int bG() {
        return this.at;
    }

    private int bH() {
        return this.au;
    }

    private int bI() {
        return this.av;
    }

    private int bJ() {
        return this.aw;
    }

    private int bK() {
        return this.ax;
    }

    private boolean bL() {
        return this.O;
    }

    private int bM() {
        return this.P;
    }

    private boolean bN() {
        return this.Q;
    }

    private int bO() {
        return this.bh;
    }

    private String bP() {
        return this.bi;
    }

    private int bQ() {
        return this.bj;
    }

    private int bR() {
        return this.bk;
    }

    private int bS() {
        return this.bn;
    }

    private boolean bT() {
        return this.bo;
    }

    private int bU() {
        return this.bq;
    }

    private int ba() {
        return this.aJ;
    }

    private long bb() {
        return this.p;
    }

    private long bc() {
        return this.o;
    }

    private String bd() {
        return this.b;
    }

    private long be() {
        return this.c;
    }

    private int bf() {
        return this.d;
    }

    private long bg() {
        return this.e;
    }

    private int bh() {
        return this.f;
    }

    private List<c> bi() {
        return this.l;
    }

    private String bj() {
        return this.af;
    }

    private String bk() {
        return this.k;
    }

    private long bl() {
        return this.j;
    }

    private Map<String, String> bm() {
        return this.h;
    }

    private boolean bn() {
        return this.g;
    }

    private boolean bo() {
        return this.i;
    }

    private int bp() {
        return this.r;
    }

    private int bq() {
        return this.s;
    }

    private static boolean br() {
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            a b2 = com.anythink.expressad.d.b.b();
            if (b2 != null) {
                return b2.g;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private String bs() {
        return this.aQ;
    }

    private boolean bt() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) ? false : true;
    }

    private boolean bu() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) ? false : true;
    }

    private int bv() {
        return this.aY;
    }

    private int bw() {
        return this.aS;
    }

    private int bx() {
        return this.aT;
    }

    private int by() {
        return this.aU;
    }

    private int bz() {
        return this.aV;
    }

    private void d(String str) {
        this.X = str;
    }

    private void g(int i) {
        this.V = i;
    }

    private void h(int i) {
        this.T = i;
    }

    private void i(int i) {
        this.U = i;
    }

    private void j(int i) {
        this.aD.add(Integer.valueOf(i));
    }

    private boolean k(int i) {
        return this.aD.contains(Integer.valueOf(i));
    }

    private void l(int i) {
        this.as = i;
    }

    private void m(int i) {
        this.ap = i;
    }

    private void n(int i) {
        this.an = i;
    }

    private void o(int i) {
        this.aF = i;
    }

    private void p(int i) {
        this.aE = i;
    }

    private void q(int i) {
        this.Y = i;
    }

    private void r(int i) {
        this.aa = i;
    }

    private void s(int i) {
        this.ab = i;
    }

    private void t(int i) {
        this.ac = i;
    }

    private void u(int i) {
        this.ad = i;
    }

    private void v(int i) {
        this.G = i;
    }

    private void w(int i) {
        this.H = i;
    }

    private void x(int i) {
        this.I = i;
    }

    private void y(int i) {
        this.D = i;
    }

    private void z(int i) {
        this.F = i;
    }

    public final void a() {
        this.R = 10;
    }

    public final int b() {
        return this.W;
    }

    public final void c() {
        this.a = 0;
    }

    public final void e(int i) {
        this.aA = i;
    }

    public final void f(int i) {
        this.aB = i;
    }

    public final String toString() {
        return "cc=" + this.b + " upal=" + this.c + " cfc=" + this.d + " getpf=" + this.e + " uplc=" + this.f + " rurl=" + this.m;
    }

    private void Z(int i) {
        this.bh = i;
    }

    private void aa(int i) {
        this.bj = i;
    }

    private void ab(int i) {
        this.bk = i;
    }

    private void ac(int i) {
        this.bp = i;
    }

    private void ad(int i) {
        this.br = i;
    }

    private void ae(int i) {
        this.bs = i;
    }

    private void af(int i) {
        this.bt = i;
    }

    private void ag(int i) {
        this.bu = i;
    }

    private void ah(int i) {
        this.bv = i;
    }

    private void e(String str) {
        this.aq = str;
    }

    private void f(String str) {
        this.ar = str;
    }

    private void g(String str) {
        this.ao = str;
    }

    private void k(String str) {
        this.B = str;
    }

    public final void A() {
        this.o = 0L;
    }

    public final void B() {
        this.d = 1;
    }

    public final void C() {
        this.i = true;
    }

    public final String D() {
        return this.aN;
    }

    public final String E() {
        return this.aO;
    }

    public final String F() {
        return this.aP;
    }

    public final String G() {
        return this.aR;
    }

    public final void H() {
        String language = Locale.getDefault().getLanguage();
        boolean z = true;
        if (!((TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) ? false : true)) {
            if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
                this.aN = "确认关闭？";
                this.aO = "关闭后您将不会获得任何奖励噢~ ";
                this.aP = "确认关闭";
                this.aQ = "继续观看";
            } else {
                this.aN = "Confirm to close? ";
                this.aO = "You will not be rewarded after closing the window";
                this.aP = "Close it";
                this.aQ = "Continue";
            }
        }
        if ((TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) ? false : false) {
            return;
        }
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            this.aN = "确认关闭？";
            this.aO = "关闭后您将不会获得任何奖励噢~ ";
            this.aP = "确认关闭";
            this.aR = "继续试玩";
            return;
        }
        this.aN = "Confirm to close? ";
        this.aO = "You will not be rewarded after closing the window";
        this.aP = "Close it";
        this.aR = "Continue";
    }

    public final String I() {
        return this.aZ;
    }

    public final String J() {
        return this.ba;
    }

    public final String K() {
        return this.bb;
    }

    public final int L() {
        return this.bf;
    }

    public final b M() {
        return this.bg;
    }

    public final String N() {
        return this.bl;
    }

    public final String O() {
        return this.bm;
    }

    public final void P() {
        this.bn = 0;
    }

    public final void Q() {
        this.bo = false;
    }

    public final int R() {
        return this.bp;
    }

    public final void S() {
        this.bq = 1;
    }

    public final String T() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.d.a.b.h, this.b);
            jSONObject.put(com.anythink.expressad.d.a.b.l, this.c);
            jSONObject.put(com.anythink.expressad.d.a.b.m, this.d);
            jSONObject.put(com.anythink.expressad.d.a.b.p, this.f);
            jSONObject.put(com.anythink.expressad.d.a.b.w, this.g);
            jSONObject.put(com.anythink.expressad.d.a.b.o, this.i);
            jSONObject.put("plct", this.n);
            jSONObject.put(com.anythink.expressad.d.a.b.B, this.o);
            jSONObject.put(com.anythink.expressad.d.a.b.C, this.m);
            jSONObject.put(com.anythink.expressad.d.a.b.G, this.q);
            jSONObject.put("plctb", this.u);
            jSONObject.put(com.anythink.expressad.d.a.b.ab, this.aG);
            jSONObject.put(com.anythink.expressad.d.a.b.ac, this.aH);
            jSONObject.put(com.anythink.expressad.d.a.b.af, this.y);
            jSONObject.put(com.anythink.expressad.d.a.b.ag, this.z);
            jSONObject.put(com.anythink.expressad.d.a.b.i, this.J);
            jSONObject.put(com.anythink.expressad.d.a.b.j, this.K);
            jSONObject.put(com.anythink.expressad.d.a.b.k, this.L);
            jSONObject.put(com.anythink.expressad.d.a.b.ai, this.aK);
            jSONObject.put(com.anythink.expressad.d.a.b.aa, this.x);
            jSONObject.put(com.anythink.expressad.d.a.b.aG, this.F);
            jSONObject.put(com.anythink.expressad.d.a.b.aE, this.D);
            jSONObject.put(com.anythink.expressad.d.a.b.aF, this.E);
            jSONObject.put(com.anythink.expressad.d.a.b.ae, this.aJ);
            jSONObject.put(com.anythink.expressad.d.a.b.bn, this.aL);
            jSONObject.put(com.anythink.expressad.d.a.b.bv, this.aF);
            jSONObject.put("iex", this.I);
            jSONObject.put(com.anythink.expressad.d.a.b.ao, this.G);
            jSONObject.put(com.anythink.expressad.d.a.b.ap, this.H);
            jSONObject.put(com.anythink.expressad.d.a.b.at, this.aM);
            jSONObject.put(com.anythink.expressad.d.a.b.al, this.aE);
            jSONObject.put("pf", this.Y);
            jSONObject.put(com.anythink.expressad.d.a.b.aA, this.aa);
            jSONObject.put(com.anythink.expressad.d.a.b.aB, this.ae);
            jSONObject.put(com.anythink.expressad.d.a.b.ax, this.ab);
            jSONObject.put(com.anythink.expressad.d.a.b.ay, this.ac);
            jSONObject.put(com.anythink.expressad.d.a.b.az, this.ad);
            jSONObject.put(com.anythink.expressad.d.a.b.ad, this.aI);
            jSONObject.put(com.anythink.expressad.d.a.b.bE, this.ah);
            jSONObject.put(com.anythink.expressad.d.a.b.bF, this.ag);
            jSONObject.put(com.anythink.expressad.d.a.b.bG, this.ai);
            jSONObject.put(com.anythink.expressad.d.a.b.bH, this.aj);
            jSONObject.put(com.anythink.expressad.d.a.b.bI, this.ak);
            jSONObject.put(com.anythink.expressad.d.a.b.bK, this.am);
            jSONObject.put(com.anythink.expressad.d.a.b.bJ, this.al);
            jSONObject.put(com.anythink.expressad.d.a.b.bV, this.an);
            jSONObject.put(com.anythink.expressad.d.a.b.bY, this.ap);
            jSONObject.put(com.anythink.expressad.d.a.b.cO, this.a);
            jSONObject.put(com.anythink.expressad.d.a.b.cT, this.bi);
            jSONObject.put(com.anythink.expressad.d.a.b.di, this.W);
            jSONObject.put(com.anythink.expressad.d.a.b.dg, this.V);
            jSONObject.put(com.anythink.expressad.d.a.b.dw, this.bo);
            jSONObject.put(com.anythink.expressad.d.a.b.dt, this.bn);
            jSONObject.put("isDefault", this.bq);
            return jSONObject.toString();
        } catch (Throwable th) {
            n.d("Setting", th.getMessage());
            return null;
        }
    }

    public final int U() {
        return this.br;
    }

    public final int V() {
        return this.bs;
    }

    public final int W() {
        return this.bt;
    }

    public final int X() {
        return this.bu;
    }

    public final int Y() {
        return this.bv;
    }

    public final void a(int i) {
        this.W = i;
    }

    public final void b(int i) {
        if (i > 0) {
            this.aC = i;
        }
    }

    public final void c(int i) {
        this.ay = i;
    }

    public final void d(int i) {
        this.az = i;
    }

    public final void h() {
        this.ak = 1;
    }

    public final void i() {
        this.am = -1;
    }

    public final void j() {
        this.L = 1;
    }

    public final int l() {
        return this.x;
    }

    public final long m() {
        if (this.u <= 0) {
            this.u = com.anythink.expressad.d.a.b.Q;
        }
        return this.u;
    }

    public final void n() {
        this.u = com.anythink.expressad.d.a.b.Q;
    }

    public final int o() {
        return this.aM;
    }

    public final void p() {
        this.aM = 259200;
    }

    public final void q() {
        this.aK = com.anythink.expressad.d.a.b.aC;
    }

    public final long r() {
        return this.aG * 1000;
    }

    public final long s() {
        return this.aH * 1000;
    }

    public final void t() {
        this.aH = 10L;
    }

    public final boolean u() {
        return this.q;
    }

    public final void v() {
        this.q = false;
    }

    public final boolean w() {
        return this.m;
    }

    public final void x() {
        this.m = false;
    }

    public final long y() {
        return this.n;
    }

    public final void z() {
        this.n = com.anythink.expressad.d.a.b.P;
    }

    private void A(String str) {
        this.bm = str;
    }

    private void a(LinkedList<String> linkedList) {
        this.S = linkedList;
    }

    private void b(List<String> list) {
        this.Z = list;
    }

    private void c(List<com.anythink.expressad.foundation.d.c> list) {
        this.M = list;
    }

    private void h(String str) {
        this.al = str;
    }

    private void i(String str) {
        this.ae = str;
    }

    private void j(String str) {
        this.J = str;
    }

    private void l(String str) {
        this.b = str;
    }

    private void n(String str) {
        this.k = str;
    }

    private void o(String str) {
        this.aN = str;
    }

    private void p(String str) {
        this.aO = str;
    }

    private void q(String str) {
        this.aP = str;
    }

    private void r(String str) {
        this.aQ = str;
    }

    private void s(String str) {
        this.aR = str;
    }

    private void t(String str) {
        this.aZ = str;
    }

    private void u(String str) {
        this.ba = str;
    }

    private void v(String str) {
        this.bb = str;
    }

    private void w(String str) {
        this.bc = str;
    }

    private void x(String str) {
        this.bd = str;
    }

    private static Map<String, C0059a> y(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C0059a c0059a = new C0059a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    c0059a.a(optJSONObject);
                }
                hashMap.put(next, c0059a);
            }
            return hashMap;
        } catch (JSONException e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    private void z(String str) {
        this.bl = str;
    }

    public final void d() {
        this.ag = 1;
    }

    public final void e() {
        this.ah = 1;
    }

    public final void f() {
        this.ai = 1;
    }

    public final void g() {
        this.aj = 0;
    }

    public final int k() {
        return this.A;
    }

    private void a(List<com.anythink.expressad.foundation.d.b> list) {
        this.N = list;
    }

    private void b(long j) {
        this.C = j;
    }

    private void c(long j) {
        this.aG = j;
    }

    private void d(long j) {
        this.p = j;
    }

    private void e(long j) {
        this.c = j;
    }

    private void f(long j) {
        this.e = j;
    }

    private void g(long j) {
        this.j = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                try {
                    aVar.b = jSONObject.optString(com.anythink.expressad.d.a.b.h);
                    aVar.K = jSONObject.optString(com.anythink.expressad.d.a.b.j, "anythink");
                    aVar.c = jSONObject.optLong(com.anythink.expressad.d.a.b.l);
                    aVar.d = jSONObject.optInt(com.anythink.expressad.d.a.b.m);
                    aVar.e = jSONObject.optLong("getpf");
                    aVar.f = jSONObject.optInt(com.anythink.expressad.d.a.b.p);
                    aVar.g = jSONObject.optBoolean(com.anythink.expressad.d.a.b.w);
                    aVar.j = jSONObject.optLong("current_time");
                    aVar.i = jSONObject.optBoolean(com.anythink.expressad.d.a.b.o);
                    aVar.o = jSONObject.optLong(com.anythink.expressad.d.a.b.B);
                    aVar.n = jSONObject.optLong("plct") == 0 ? com.anythink.expressad.d.a.b.P : jSONObject.optLong("plct");
                    aVar.m = jSONObject.optBoolean(com.anythink.expressad.d.a.b.C);
                    aVar.p = jSONObject.optLong(com.anythink.expressad.d.a.b.F);
                    aVar.q = jSONObject.optBoolean(com.anythink.expressad.d.a.b.G);
                    aVar.r = jSONObject.optInt(com.anythink.expressad.d.a.b.X);
                    aVar.s = jSONObject.optInt(com.anythink.expressad.d.a.b.Y);
                    aVar.L = jSONObject.optInt(com.anythink.expressad.d.a.b.k);
                    aVar.t = jSONObject.optInt(com.anythink.expressad.d.a.b.Z, 1800);
                    aVar.x = jSONObject.optInt(com.anythink.expressad.d.a.b.aa);
                    aVar.u = jSONObject.optLong("plctb") == 0 ? com.anythink.expressad.d.a.b.Q : jSONObject.optLong("plctb");
                    aVar.aI = jSONObject.optInt(com.anythink.expressad.d.a.b.ad);
                    aVar.aJ = jSONObject.optInt(com.anythink.expressad.d.a.b.ae);
                    aVar.x = jSONObject.optInt(com.anythink.expressad.d.a.b.aa, 100);
                    aVar.y = jSONObject.optInt(com.anythink.expressad.d.a.b.af, 2);
                    aVar.z = jSONObject.optInt(com.anythink.expressad.d.a.b.ag, 2);
                    boolean z = true;
                    aVar.A = jSONObject.optInt(com.anythink.expressad.d.a.b.ah, 1);
                    aVar.aK = jSONObject.optLong(com.anythink.expressad.d.a.b.ai, com.anythink.expressad.d.a.b.aC);
                    aVar.B = jSONObject.optString(com.anythink.expressad.d.a.b.aj);
                    aVar.C = jSONObject.optLong(com.anythink.expressad.d.a.b.ak, com.anythink.expressad.d.a.b.aD);
                    aVar.D = jSONObject.optInt(com.anythink.expressad.d.a.b.aE, 1);
                    aVar.E = jSONObject.optInt(com.anythink.expressad.d.a.b.aF, 604800);
                    aVar.F = jSONObject.optInt(com.anythink.expressad.d.a.b.aG, com.anythink.expressad.d.a.b.aK);
                    aVar.aL = jSONObject.optInt(com.anythink.expressad.d.a.b.bn, 3);
                    aVar.aF = jSONObject.optInt(com.anythink.expressad.d.a.b.bv, 1);
                    aVar.af = jSONObject.optString(com.anythink.expressad.d.a.b.aH, "");
                    aVar.aE = jSONObject.optInt(com.anythink.expressad.d.a.b.al, 1);
                    aVar.ah = jSONObject.optInt(com.anythink.expressad.d.a.b.bE, 1);
                    aVar.ag = jSONObject.optInt(com.anythink.expressad.d.a.b.bF, 1);
                    aVar.ai = jSONObject.optInt(com.anythink.expressad.d.a.b.bG, 1);
                    int i = 0;
                    aVar.aj = jSONObject.optInt(com.anythink.expressad.d.a.b.bH, 0);
                    aVar.ak = jSONObject.optInt(com.anythink.expressad.d.a.b.bI, 1);
                    aVar.am = jSONObject.optInt(com.anythink.expressad.d.a.b.bK, -1);
                    aVar.an = jSONObject.optInt(com.anythink.expressad.d.a.b.bV, 2);
                    aVar.ap = jSONObject.optInt(com.anythink.expressad.d.a.b.bY, 86400);
                    aVar.ao = jSONObject.optString(com.anythink.expressad.d.a.b.bW);
                    aVar.ar = jSONObject.optString(com.anythink.expressad.d.a.b.cG);
                    aVar.aq = jSONObject.optString(com.anythink.expressad.d.a.b.cF);
                    aVar.as = jSONObject.optInt(com.anythink.expressad.d.a.b.cN);
                    aVar.U = jSONObject.optInt(com.anythink.expressad.d.a.b.ci, com.anythink.expressad.d.a.b.ck);
                    aVar.T = jSONObject.optInt(com.anythink.expressad.d.a.b.ch, 0);
                    JSONArray optJSONArray = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.cg);
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        LinkedList<String> linkedList = new LinkedList<>();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            linkedList.add(optJSONArray.optString(i2));
                        }
                        aVar.S = linkedList;
                    }
                    long optLong = jSONObject.optLong(com.anythink.expressad.d.a.b.ab);
                    if (optLong == 0) {
                        aVar.aG = 20L;
                    } else {
                        aVar.aG = optLong;
                    }
                    long optLong2 = jSONObject.optLong(com.anythink.expressad.d.a.b.ac);
                    if (optLong2 == 0) {
                        aVar.aH = 10L;
                    } else {
                        aVar.aH = optLong2;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.v);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            HashMap hashMap = new HashMap();
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                JSONObject optJSONObject = optJSONArray2.optJSONObject(i3);
                                hashMap.put(optJSONObject.optString("domain"), optJSONObject.optString("format"));
                            }
                            aVar.h = hashMap;
                        }
                    }
                    aVar.G = jSONObject.optInt(com.anythink.expressad.d.a.b.ao, 3);
                    aVar.H = jSONObject.optInt(com.anythink.expressad.d.a.b.ap, 86400);
                    aVar.I = jSONObject.optInt("iex", 1);
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.ar);
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            String optString = optJSONArray3.optString(i4);
                            if (v.b(optString)) {
                                arrayList.add(com.anythink.expressad.foundation.d.c.a(new JSONObject(optString)));
                            }
                        }
                    }
                    if (arrayList != null) {
                        aVar.M = arrayList;
                    }
                    try {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.as);
                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                            arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                String optString2 = optJSONArray4.optString(i5);
                                if (v.b(optString2)) {
                                    JSONObject jSONObject2 = new JSONObject(optString2);
                                    arrayList2.add(new com.anythink.expressad.foundation.d.b(jSONObject2.optInt("adtype"), jSONObject2.optString(d.a.c)));
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            aVar.N = arrayList2;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    aVar.aM = jSONObject.optInt(com.anythink.expressad.d.a.b.at, 259200);
                    aVar.Y = jSONObject.optInt("pf", 900);
                    aVar.aa = jSONObject.optInt(com.anythink.expressad.d.a.b.aA, 20);
                    aVar.ae = jSONObject.optString(com.anythink.expressad.d.a.b.aB);
                    JSONArray optJSONArray5 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.av);
                    if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                            arrayList3.add(optJSONArray5.optString(i6));
                        }
                        aVar.Z = arrayList3;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(com.anythink.expressad.d.a.b.aw);
                    if (optJSONObject2 != null) {
                        aVar.ab = optJSONObject2.optInt(com.anythink.expressad.d.a.b.ax, 1);
                        aVar.ac = optJSONObject2.optInt(com.anythink.expressad.d.a.b.ay, 1);
                        aVar.ad = optJSONObject2.optInt(com.anythink.expressad.d.a.b.az, 1);
                    }
                    aVar.aN = jSONObject.optString(com.anythink.expressad.d.a.b.ct, "");
                    aVar.aO = jSONObject.optString(com.anythink.expressad.d.a.b.cu, "");
                    aVar.aP = jSONObject.optString(com.anythink.expressad.d.a.b.cv, "");
                    aVar.aQ = jSONObject.optString(com.anythink.expressad.d.a.b.cw, "");
                    aVar.aR = jSONObject.optString(com.anythink.expressad.d.a.b.cx, "");
                    aVar.aS = jSONObject.optInt(com.anythink.expressad.d.a.b.cy, 0);
                    aVar.aT = jSONObject.optInt(com.anythink.expressad.d.a.b.cz, 21600);
                    aVar.aU = jSONObject.optInt(com.anythink.expressad.d.a.b.cA, 2);
                    aVar.aV = jSONObject.optInt(com.anythink.expressad.d.a.b.cB, 0);
                    aVar.aW = jSONObject.optInt(com.anythink.expressad.d.a.b.cC, 0);
                    aVar.aX = jSONObject.optInt(com.anythink.expressad.d.a.b.cD, 604800);
                    aVar.aY = jSONObject.optInt(com.anythink.expressad.d.a.b.cE, 0);
                    aVar.aZ = jSONObject.optString("adchoice_icon", "");
                    aVar.bb = jSONObject.optString("adchoice_link", "");
                    aVar.ba = jSONObject.optString("adchoice_size", "");
                    aVar.bd = jSONObject.optString("platform_logo", "");
                    aVar.bc = jSONObject.optString("platform_name", "");
                    aVar.be = y(jSONObject.optString(com.anythink.expressad.d.a.b.cM, ""));
                    aVar.a = jSONObject.optInt(com.anythink.expressad.d.a.b.cO, 0);
                    aVar.bh = jSONObject.optInt(com.anythink.expressad.d.a.b.cQ, 0);
                    aVar.W = jSONObject.optInt(com.anythink.expressad.d.a.b.di, 120);
                    aVar.V = jSONObject.optInt(com.anythink.expressad.d.a.b.dg, 10);
                    aVar.X = jSONObject.optString(com.anythink.expressad.d.a.b.dI, "");
                    aVar.bi = jSONObject.optString(com.anythink.expressad.d.a.b.cT, "");
                    aVar.bj = jSONObject.optInt(com.anythink.expressad.d.a.b.cU, 2);
                    aVar.bk = jSONObject.optInt(com.anythink.expressad.d.a.b.cV, 7200);
                    aVar.bm = jSONObject.optString(com.anythink.expressad.d.a.b.ds);
                    aVar.bl = jSONObject.optString(com.anythink.expressad.d.a.b.dA);
                    int optInt = jSONObject.optInt(com.anythink.expressad.d.a.b.dt, 0);
                    aVar.bn = (optInt > 2 || optInt < 0) ? 0 : 0;
                    aVar.bo = jSONObject.optBoolean(com.anythink.expressad.d.a.b.dw, false);
                    JSONArray optJSONArray6 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.dr);
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                            JSONObject jSONObject3 = optJSONArray6.getJSONObject(i7);
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                    aVar.aD.add(Integer.valueOf(Integer.parseInt(next)));
                                }
                            }
                        }
                    }
                    try {
                        int optInt2 = jSONObject.optInt("lqcnt", 30);
                        int optInt3 = jSONObject.optInt("lqto", 5);
                        int optInt4 = jSONObject.optInt("lqswt", 0);
                        int optInt5 = jSONObject.optInt("lqtype", 0);
                        aVar.au = optInt3;
                        aVar.at = optInt2;
                        aVar.av = optInt4;
                        aVar.aw = optInt5;
                        int parseInt = Integer.parseInt(i.b(jSONObject.optString("lqpt")));
                        if (parseInt > 0 && parseInt < 65535) {
                            aVar.ax = parseInt;
                        }
                    } catch (Exception unused) {
                    }
                    aVar.bp = jSONObject.optInt(com.anythink.expressad.d.a.b.dB, 0);
                    try {
                        int optInt6 = jSONObject.optInt("l", 3);
                        boolean z2 = jSONObject.optInt("k", 0) == 1;
                        if (jSONObject.optInt(com.anythink.expressad.d.a.b.dH, 1) != 1) {
                            z = false;
                        }
                        aVar.P = optInt6;
                        aVar.O = z2;
                        aVar.Q = z;
                    } catch (Exception e2) {
                        n.d("Setting", e2.getMessage());
                    }
                    aVar.bf = jSONObject.optInt(com.anythink.expressad.d.a.b.dK, 0);
                    aVar.bg = b.a(jSONObject.optJSONObject(com.anythink.expressad.d.a.b.dL));
                    try {
                        int optInt7 = jSONObject.optInt(com.anythink.expressad.d.a.b.dQ, com.anythink.expressad.foundation.g.a.cH);
                        int optInt8 = jSONObject.optInt(com.anythink.expressad.d.a.b.dR, com.anythink.expressad.foundation.g.a.cI);
                        int optInt9 = jSONObject.optInt(com.anythink.expressad.d.a.b.dS, com.anythink.expressad.foundation.g.a.cJ);
                        int optInt10 = jSONObject.optInt(com.anythink.expressad.d.a.b.dU, com.anythink.expressad.foundation.g.a.cO);
                        if (optInt7 <= 0) {
                            optInt7 = com.anythink.expressad.foundation.g.a.cH;
                        }
                        if (optInt8 <= 0) {
                            optInt8 = com.anythink.expressad.foundation.g.a.cI;
                        }
                        if (optInt9 <= 0) {
                            optInt9 = com.anythink.expressad.foundation.g.a.cJ;
                        }
                        if (optInt10 < 0) {
                            optInt10 = com.anythink.expressad.foundation.g.a.cO;
                        }
                        aVar.aA = optInt7;
                        aVar.ay = optInt8;
                        aVar.az = optInt9;
                        aVar.aB = optInt10;
                        int optInt11 = jSONObject.optInt(com.anythink.expressad.d.a.b.dT, 0);
                        if (optInt11 >= 0) {
                            i = optInt11;
                        }
                        aVar.R = i;
                        aVar.b(jSONObject.optInt(com.anythink.expressad.d.a.b.dV, 10));
                        return aVar;
                    } catch (Exception unused2) {
                        arrayList2 = aVar;
                    }
                } catch (Exception e3) {
                    e = e3;
                    arrayList2 = aVar;
                    e.printStackTrace();
                    return arrayList2;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        return arrayList2;
    }

    private void c(boolean z) {
        this.Q = z;
    }

    private void d(List<c> list) {
        this.l = list;
    }

    private void m(String str) {
        this.af = str;
    }

    public final void a(String str) {
        this.K = str;
    }

    private void a(long j) {
        this.E = j;
    }

    public final void c(String str) {
        this.bi = str;
    }

    private void a(Map<String, String> map) {
        this.h = map;
    }

    private void a(boolean z) {
        this.g = z;
    }

    public static String a(Context context, String str) {
        a b2;
        String str2 = "";
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            b2 = com.anythink.expressad.d.b.b();
        } catch (Throwable unused) {
        }
        if (b2 != null && b2.h != null) {
            String host = Uri.parse(str).getHost();
            for (Map.Entry<String, String> entry : b2.h.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(host) && host.contains(key)) {
                    String str3 = b2.h.get(key);
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    String replace = str3.replace("{gaid}", com.anythink.core.common.j.d.f());
                    if (replace.contains(com.anythink.expressad.d.a.b.I)) {
                        if (com.anythink.core.common.j.d.d(context) != null) {
                            str2 = replace.replace(com.anythink.expressad.d.a.b.I, com.anythink.core.common.j.d.d(context));
                        }
                        str2 = replace;
                    } else {
                        if (replace.contains(com.anythink.expressad.d.a.b.H) && com.anythink.core.common.j.d.e(context) != null) {
                            str2 = replace.replace(com.anythink.expressad.d.a.b.H, com.anythink.core.common.j.d.e(context));
                        }
                        str2 = replace;
                    }
                    return str2;
                }
            }
        }
        return str2;
    }

    private void a(b bVar) {
        this.bg = bVar;
    }

    private void b(Map<String, C0059a> map) {
        this.be = map;
    }

    private void b(boolean z) {
        this.O = z;
    }
}