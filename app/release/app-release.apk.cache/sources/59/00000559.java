package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.e.l;
import com.p7700g.p99005.zg2;

/* loaded from: classes2.dex */
public class ATBiddingResult extends l {
    private ATBiddingResult(boolean z, double d, String str, ATBiddingNotice aTBiddingNotice, String str2, ATAdConst.CURRENCY currency) {
        super(z, d, str, aTBiddingNotice, str2, currency);
    }

    public static ATBiddingResult fail(String str) {
        return new ATBiddingResult(false, zg2.s, null, null, str, ATAdConst.CURRENCY.USD);
    }

    public static ATBiddingResult success(double d, String str, ATBiddingNotice aTBiddingNotice) {
        return new ATBiddingResult(true, d, str, aTBiddingNotice, null, ATAdConst.CURRENCY.USD);
    }

    public static ATBiddingResult success(double d, String str, ATBiddingNotice aTBiddingNotice, ATAdConst.CURRENCY currency) {
        return new ATBiddingResult(true, d, str, aTBiddingNotice, null, currency);
    }
}