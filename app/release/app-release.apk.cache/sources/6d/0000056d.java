package com.anythink.core.api;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class AdError {
    public String code;
    public String desc;
    public String itemsErrorInfo = "";
    public String platformCode;
    public String platformMSG;

    public AdError(String str, String str2, String str3, String str4) {
        this.code = str;
        this.desc = str2;
        this.platformCode = str3;
        this.platformMSG = str4;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getFullErrorInfo() {
        if (TextUtils.isEmpty(this.itemsErrorInfo)) {
            StringBuilder sb = new StringBuilder("code:[ ");
            sb.append(this.code);
            sb.append(" ]desc:[ ");
            sb.append(this.desc);
            sb.append(" ]platformCode:[ ");
            sb.append(this.platformCode);
            sb.append(" ]platformMSG:[ ");
            return wo1.C(sb, this.platformMSG, " ]");
        }
        StringBuilder sb2 = new StringBuilder("\ncode[ ");
        sb2.append(this.code);
        sb2.append(" ]\ndesc[ ");
        sb2.append(this.desc);
        sb2.append(" ]\ndetail[ ");
        return wo1.C(sb2, this.itemsErrorInfo, " \n]");
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getPlatformMSG() {
        return this.platformMSG;
    }

    public String printStackTrace() {
        StringBuilder sb = new StringBuilder("code:[ ");
        sb.append(this.code);
        sb.append(" ]desc:[ ");
        sb.append(this.desc);
        sb.append(" ]platformCode:[ ");
        sb.append(this.platformCode);
        sb.append(" ]platformMSG:[ ");
        return wo1.C(sb, this.platformMSG, " ]");
    }

    public void putNetworkErrorMsg(String str, int i, String str2, AdError adError) {
        this.platformCode = adError.platformCode;
        this.platformMSG = adError.platformMSG;
        StringBuilder sb = new StringBuilder();
        wo1.h0(sb, this.itemsErrorInfo, "\n  { ad_source_id[ ", str, " ];network_firm_id[ ");
        sb.append(i);
        sb.append(" ];network_name=[ ");
        sb.append(str2);
        sb.append(" ];network_error:[ ");
        sb.append(adError.printStackTrace());
        sb.append(" ] }");
        this.itemsErrorInfo = sb.toString();
    }

    public String toString() {
        return printStackTrace();
    }
}