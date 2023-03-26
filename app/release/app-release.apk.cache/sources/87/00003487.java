package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.p7700g.p99005.zg2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdInfo {
    private final ImpressionData a;

    public AdInfo() {
        this.a = null;
    }

    public AdInfo(@NotNull ImpressionData impressionData) {
        this.a = impressionData;
    }

    public String getAb() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getAb() == null) ? "" : this.a.getAb();
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getAdNetwork() == null) ? "" : this.a.getAdNetwork();
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getAdUnit() == null) ? "" : this.a.getAdUnit();
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getAuctionId() == null) ? "" : this.a.getAuctionId();
    }

    public String getCountry() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getCountry() == null) ? "" : this.a.getCountry();
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getEncryptedCPM() == null) ? "" : this.a.getEncryptedCPM();
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getInstanceId() == null) ? "" : this.a.getInstanceId();
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getInstanceName() == null) ? "" : this.a.getInstanceName();
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getLifetimeRevenue() == null) ? Double.valueOf((double) zg2.s) : this.a.getLifetimeRevenue();
    }

    public String getPrecision() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getPrecision() == null) ? "" : this.a.getPrecision();
    }

    public Double getRevenue() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getRevenue() == null) ? Double.valueOf((double) zg2.s) : this.a.getRevenue();
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.a;
        return (impressionData == null || impressionData.getSegmentName() == null) ? "" : this.a.getSegmentName();
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, getCountry());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, getAb());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, getSegmentName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, getAdNetwork());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, getInstanceName());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, getInstanceId());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_REVENUE, getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, getEncryptedCPM());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("error while parsing ad info " + e.getMessage());
        }
        return jSONObject.toString();
    }
}