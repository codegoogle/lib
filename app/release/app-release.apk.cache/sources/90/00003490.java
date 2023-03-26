package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.qe3;
import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class e extends qe3 {
    public e(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.AUCTION_REQUEST);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        b(b.AUCTION_SUCCESS, hashMap);
    }

    public final void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        b(b.AUCTION_FAILED, hashMap);
    }

    public final void a(String str) {
        b(b.AUCTION_REQUEST_WATERFALL, wo1.R(IronSourceConstants.EVENTS_EXT1, str));
    }

    public final void b(String str) {
        b(b.AUCTION_RESULT_WATERFALL, wo1.R(IronSourceConstants.EVENTS_EXT1, str));
    }

    public final void c(String str) {
        b(b.AD_UNIT_CAPPED, wo1.R("auctionId", str));
    }
}