package com.anythink.core.common.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.c.i;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.p7700g.p99005.zg2;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j extends ATAdInfo {
    private ATBaseAdAdapter a;
    private Map<String, Object> x;
    private int b = -1;
    private String c = "";
    private int d = -1;
    private double e = zg2.s;
    private int f = 0;
    private String g = "";
    private Double h = Double.valueOf((double) zg2.s);
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private String m = "unknow";
    private String n = "Network";
    private String o = "";
    private int p = 1;
    private int q = 0;
    private String r = "";
    private String s = "";
    private int t = 0;
    private String u = "";
    private String v = "";
    private Map<String, Object> w = null;
    private String y = "";
    private int z = 0;

    public static j a(d dVar) {
        if (dVar != null) {
            return a(a(dVar.getTrackingInfo()), dVar);
        }
        return new j();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.j;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        return this.w != null ? new JSONObject(this.w).toString() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.m;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.a;
        return aTBaseAdAdapter != null ? aTBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.g);
            jSONObject.put("publisher_revenue", this.h);
            jSONObject.put("currency", this.i);
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.j);
            jSONObject.put("adunit_id", this.k);
            jSONObject.put("adunit_format", this.l);
            jSONObject.put("precision", this.m);
            jSONObject.put("network_type", this.n);
            jSONObject.put("network_placement_id", this.o);
            jSONObject.put(com.anythink.core.common.l.O, this.p);
            jSONObject.put(ATCustomRuleKeys.SEGMENT_ID, this.q);
            if (!TextUtils.isEmpty(this.r)) {
                jSONObject.put("scenario_id", this.r);
            }
            if (!TextUtils.isEmpty(this.s) && this.t != 0) {
                jSONObject.put("scenario_reward_name", this.s);
                jSONObject.put("scenario_reward_number", this.t);
            }
            if (!TextUtils.isEmpty(this.v)) {
                jSONObject.put("channel", this.v);
            }
            if (!TextUtils.isEmpty(this.u)) {
                jSONObject.put("sub_channel", this.u);
            }
            Map<String, Object> map = this.w;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.w));
            }
            jSONObject.put(i.a.d, this.b);
            jSONObject.put("adsource_id", this.c);
            jSONObject.put("adsource_index", this.d);
            jSONObject.put("adsource_price", this.e);
            jSONObject.put("adsource_isheaderbidding", this.f);
            Map<String, Object> map2 = this.x;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.x));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.y)) {
                jSONObject.put("tp_bid_id", this.y);
            }
            int i = this.z;
            if (i != 0) {
                jSONObject.put("dismiss_type", i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static j a(BaseAd baseAd) {
        if (baseAd != null) {
            j a = a(baseAd.getDetail());
            a.x = baseAd.getNetworkInfoMap();
            return a;
        }
        return new j();
    }

    public static j a(com.anythink.core.common.e.e eVar, d dVar) {
        return a(a(eVar), dVar);
    }

    private static j a(com.anythink.core.common.e.e eVar) {
        j jVar = new j();
        return eVar != null ? a(jVar, eVar) : jVar;
    }

    private static j a(j jVar, d dVar) {
        if (dVar != null && (dVar instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) dVar;
            jVar.a = aTBaseAdAdapter;
            jVar.x = aTBaseAdAdapter.getNetworkInfoMap();
        }
        return jVar;
    }

    private static j a(j jVar, com.anythink.core.common.e.e eVar) {
        ATRewardInfo q;
        ATRewardInfo aTRewardInfo;
        jVar.b = eVar.G();
        jVar.c = eVar.w();
        jVar.d = eVar.z();
        jVar.f = eVar.u();
        jVar.e = eVar.e();
        jVar.i = eVar.g();
        jVar.g = eVar.k();
        jVar.h = Double.valueOf(jVar.e / 1000.0d);
        jVar.j = eVar.n();
        jVar.l = com.anythink.core.common.j.g.d(eVar.U());
        jVar.k = eVar.S();
        jVar.m = eVar.m();
        if (eVar.G() == 35) {
            jVar.n = "Cross_Promotion";
        } else if (eVar.G() == 66) {
            jVar.n = "Adx";
        } else {
            jVar.n = "Network";
        }
        jVar.o = eVar.j();
        jVar.p = eVar.l();
        jVar.q = eVar.H();
        jVar.r = eVar.C;
        if (TextUtils.equals(g.C0044g.b, jVar.l)) {
            Map<String, ATRewardInfo> p = eVar.p();
            if (p != null && p.containsKey(jVar.r) && (aTRewardInfo = p.get(jVar.r)) != null) {
                jVar.s = aTRewardInfo.rewardName;
                jVar.t = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(jVar.s) || jVar.t == 0) && (q = eVar.q()) != null) {
                jVar.s = q.rewardName;
                jVar.t = q.rewardNumber;
            }
        }
        jVar.v = m.a().l();
        jVar.u = m.a().m();
        jVar.w = eVar.r();
        jVar.y = eVar.d();
        jVar.z = eVar.L();
        return jVar;
    }
}