package com.anythink.core.common.e;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;

/* loaded from: classes2.dex */
public class l {
    public static final int EXPIRE_LOSS = 1;
    public static final int LOW_PRICE_LOSS = 2;
    public static final int NO_LOSS_NOTICE = 3;
    public ATBiddingNotice biddingNotice;
    public ATAdConst.CURRENCY currency;
    public String displayNoticeUrl;
    public String errorMsg;
    public boolean isSuccess;
    public String loseNoticeUrl;
    public double originPrice;
    public double price;
    public String token;
    public int useType = 1;
    public String winNoticeUrl;

    public l(boolean z, double d, String str, String str2, String str3, String str4, String str5, ATAdConst.CURRENCY currency) {
        this.isSuccess = z;
        this.originPrice = d;
        this.price = d;
        this.token = str;
        this.winNoticeUrl = str2;
        this.loseNoticeUrl = str3;
        this.displayNoticeUrl = str4;
        this.errorMsg = str5;
        this.currency = currency;
    }

    public boolean isSuccessWithUseType() {
        return this.isSuccess && this.useType == 1;
    }

    public void setBiddingNotice(ATBiddingNotice aTBiddingNotice) {
        this.biddingNotice = aTBiddingNotice;
    }

    public l(boolean z, double d, String str, ATBiddingNotice aTBiddingNotice, String str2, ATAdConst.CURRENCY currency) {
        this.isSuccess = z;
        this.originPrice = d;
        this.price = d;
        this.token = str;
        this.biddingNotice = aTBiddingNotice;
        this.errorMsg = str2;
        this.currency = currency;
    }
}