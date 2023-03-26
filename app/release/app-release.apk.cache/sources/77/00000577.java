package com.anythink.core.api;

import com.anythink.core.common.e.a;
import com.anythink.core.common.e.af;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediationBidManager {
    public static final String NO_BID_TOKEN_ERROR = "NO_BID_TOKEN";
    public String mRequestUrl;

    /* loaded from: classes2.dex */
    public interface BidListener {
        void onBidFail(String str);

        void onBidStart(af afVar, ATBaseAdAdapter aTBaseAdAdapter);

        void onBidSuccess(List<af> list);
    }

    public abstract void notifyWinnerDisplay(String str, af afVar);

    public void setBidRequestUrl(String str) {
        this.mRequestUrl = str;
    }

    public abstract void startBid(a aVar, BidListener bidListener);
}