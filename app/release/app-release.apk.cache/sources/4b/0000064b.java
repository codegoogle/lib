package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.common.c.g;
import com.anythink.core.common.c.i;
import com.p7700g.p99005.zg2;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends l implements Comparable<m> {
    private boolean A;
    public int a;
    public String b;
    public String c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public double l;
    public String m;
    public int n;
    public double o;
    public String p;
    public double q;
    public com.anythink.core.b.c.a r;
    public boolean s;
    private final String t;
    private boolean u;
    private final String v;
    private final String w;
    private final String x;
    private final String y;
    private final String z;

    public m(boolean z, double d, String str, String str2, String str3, String str4, String str5) {
        super(z, d, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.t = m.class.getSimpleName() + ":";
        this.v = "${AUCTION_PRICE}";
        this.w = "${AUCTION_LOSS}";
        this.x = "${AUCTION_SEAT_ID}";
        this.y = "${AUCTION_BID_TO_WIN}";
        this.z = "${AUCTION_CURRENCY}";
    }

    public final boolean a() {
        return this.f < System.currentTimeMillis();
    }

    public final synchronized void b() {
        this.A = true;
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(i.a.b, this.token);
            jSONObject.put("cur", this.b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put("price", this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.c);
            jSONObject.put("nw_firm_id", this.d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.e);
            jSONObject.put("out_data_time", this.f);
            jSONObject.put("is_send_winurl", this.u);
            jSONObject.put(i.a.e, this.i);
            jSONObject.put("tp_bid_id", this.g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.k);
            jSONObject.put("cur_rate", this.l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.l.ae, this.n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("bid_response", this.m);
            }
            jSONObject.put("ecpm_api", this.o);
            jSONObject.put("precision", this.p);
            jSONObject.put("second_price", this.q);
            jSONObject.put(g.a.d, this.h);
            jSONObject.put("bd_type", this.useType);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(m mVar) {
        m mVar2 = mVar;
        if (mVar2 == null) {
            return -1;
        }
        double d = this.price;
        if (d == zg2.s) {
            d = com.anythink.core.b.f.a().a(this.g, this.k);
        }
        double d2 = mVar2.price;
        if (d2 == zg2.s) {
            d2 = com.anythink.core.b.f.a().a(mVar2.g, mVar2.k);
        }
        return d > d2 ? -1 : 1;
    }

    public final synchronized void a(af afVar) {
        a(afVar, this.q);
    }

    private void b(double d) {
        this.q = d;
    }

    private synchronized void a(af afVar, double d) {
        if (this.u) {
            return;
        }
        this.u = true;
        double d2 = this.l;
        if (d2 > zg2.s) {
            d *= d2;
        }
        double d3 = d2 > zg2.s ? this.price * d2 : this.price;
        if (!TextUtils.isEmpty(this.winNoticeUrl)) {
            String replace = this.winNoticeUrl.replace("${AUCTION_BID_TO_WIN}", a(d));
            if (this.d == 28) {
                replace = this.winNoticeUrl.replace("${AUCTION_PRICE}", a(d3));
            }
            new com.anythink.core.common.g.f(replace, afVar.c(), afVar.t()).a(0, (com.anythink.core.common.g.h) null);
        }
        ATBiddingNotice aTBiddingNotice = this.biddingNotice;
        if (aTBiddingNotice != null) {
            if (this.d == 28) {
                aTBiddingNotice.notifyBidWin(d3);
            } else {
                aTBiddingNotice.notifyBidWin(d);
            }
        }
        if ((afVar.l() == 3 || afVar.l() == 7) && !this.A) {
            com.anythink.core.b.f.a();
            com.anythink.core.b.f.a(this.k, this);
        }
    }

    public final void a(boolean z, double d, boolean z2) {
        double d2 = this.l;
        if (d2 > zg2.s) {
            d *= d2;
        }
        if (z) {
            String str = this.j;
            if (TextUtils.isEmpty(str)) {
                str = this.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                new com.anythink.core.common.g.f(str.replace("${AUCTION_PRICE}", a(d))).a(0, (com.anythink.core.common.g.h) null);
            }
        } else {
            String str2 = this.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                new com.anythink.core.common.g.f(str2.replace("${AUCTION_PRICE}", a(d)).replace("${AUCTION_LOSS}", a(z2, 2))).a(0, (com.anythink.core.common.g.h) null);
            }
        }
        ATBiddingNotice aTBiddingNotice = this.biddingNotice;
        if (aTBiddingNotice != null) {
            aTBiddingNotice.notifyBidDisplay(z, d);
            if (z) {
                this.biddingNotice = null;
            }
        }
    }

    public final synchronized void a(double d, int i, e eVar, af afVar) {
        a(d, true, i, eVar, afVar, this.d);
    }

    public final synchronized void a(double d, boolean z, int i, e eVar, af afVar, int i2) {
        String replace;
        m a = com.anythink.core.b.f.a().a(afVar);
        if (a != null && TextUtils.equals(a.token, this.token)) {
            com.anythink.core.b.f.a().a(this.k);
            com.anythink.core.b.f.a().b(this.k);
        }
        if (afVar.l() == 3 || afVar.l() == 7) {
            com.anythink.core.common.a.a.a().b(com.anythink.core.common.b.m.a().e(), this.token);
        }
        if (this.u) {
            return;
        }
        this.u = true;
        double d2 = d == this.price ? 0.01d + d : d;
        String str = this.loseNoticeUrl;
        String a2 = a(z, i);
        com.anythink.core.common.i.c.a(eVar, afVar, d, a2);
        double d3 = this.l;
        if (d3 > zg2.s) {
            d2 = d * d3;
        }
        if (!a2.equals("-1")) {
            ATBiddingNotice aTBiddingNotice = this.biddingNotice;
            if (aTBiddingNotice != null) {
                aTBiddingNotice.notifyBidLoss(a2, d2);
                this.biddingNotice = null;
            }
            if (!TextUtils.isEmpty(str)) {
                String replace2 = str.replace("${AUCTION_PRICE}", a(d2)).replace("${AUCTION_LOSS}", a2);
                int i3 = this.d;
                if (i3 == 8) {
                    replace = replace2.replace("${AUCTION_SEAT_ID}", i3 == i2 ? "1" : "2");
                } else if (i3 == 29) {
                    replace = replace2.replace("${AUCTION_SEAT_ID}", i3 == i2 ? "1" : "10001");
                } else {
                    replace = replace2.replace("${AUCTION_SEAT_ID}", "");
                }
                if (this.d == 6) {
                    replace = replace.replace("${AUCTION_CURRENCY}", ATAdConst.CURRENCY.USD.toString());
                }
                new com.anythink.core.common.g.f(replace).a(0, (com.anythink.core.common.g.h) null);
            }
        }
    }

    private String a(double d) {
        int i = this.d;
        if (i != 8 && i != 28) {
            return String.valueOf(d);
        }
        return String.valueOf((int) d);
    }

    private String a(boolean z, int i) {
        if (i == 3) {
            return "-1";
        }
        int i2 = this.d;
        return i2 == 8 ? i == 1 ? "5" : "1" : i2 == 29 ? i == 1 ? "2002" : "2" : z ? ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB : ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL;
    }

    public static m a(String str) {
        double d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            m mVar = new m(jSONObject.optInt("is_success") == 1, jSONObject.has("price") ? jSONObject.optDouble("price") : 0.0d, jSONObject.optString(i.a.b), jSONObject.optString("nurl"), jSONObject.optString("lurl"), jSONObject.optString("burl"), jSONObject.optString("err_msg"));
            mVar.b = jSONObject.optString("cur");
            mVar.c = jSONObject.optString("unit_id");
            mVar.d = jSONObject.optInt("nw_firm_id");
            mVar.a = jSONObject.optInt("err_code");
            mVar.e = jSONObject.optLong("expire");
            mVar.f = jSONObject.optLong("out_data_time");
            mVar.u = jSONObject.optBoolean("is_send_winurl");
            mVar.i = jSONObject.optString(i.a.e);
            mVar.g = jSONObject.optString("tp_bid_id");
            mVar.j = jSONObject.optString("burl_win");
            mVar.k = jSONObject.optString("ad_source_id");
            mVar.l = jSONObject.optDouble("cur_rate");
            if (jSONObject.has("bid_response")) {
                mVar.m = jSONObject.optString("bid_response");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ctrl");
            if (optJSONObject != null) {
                mVar.n = optJSONObject.optInt(com.anythink.core.common.l.ae);
            }
            if (jSONObject.has("ecpm_api")) {
                d = zg2.s;
                mVar.o = jSONObject.optDouble("ecpm_api", zg2.s);
            } else {
                d = zg2.s;
            }
            mVar.p = jSONObject.optString("precision");
            if (jSONObject.has("second_price")) {
                mVar.q = jSONObject.optDouble("second_price", d);
            }
            mVar.h = jSONObject.optString(g.a.d, "");
            mVar.useType = jSONObject.optInt("bd_type", 1);
            if (jSONObject.has("origin_price")) {
                mVar.originPrice = jSONObject.optDouble("origin_price");
            }
            return mVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int a(m mVar) {
        if (mVar == null) {
            return -1;
        }
        double d = this.price;
        if (d == zg2.s) {
            d = com.anythink.core.b.f.a().a(this.g, this.k);
        }
        double d2 = mVar.price;
        if (d2 == zg2.s) {
            d2 = com.anythink.core.b.f.a().a(mVar.g, mVar.k);
        }
        return d > d2 ? -1 : 1;
    }
}