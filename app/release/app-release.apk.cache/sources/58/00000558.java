package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;

/* loaded from: classes2.dex */
public interface ATBiddingNotice {
    ATAdConst.CURRENCY getNoticePriceCurrency();

    void notifyBidDisplay(boolean z, double d);

    void notifyBidLoss(String str, double d);

    void notifyBidWin(double d);
}