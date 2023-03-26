package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.qe3;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a extends qe3 {
    public a(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.SESSION_CAPPED);
    }

    public final void a(String str) {
        b(b.SHOW_AD, wo1.R("placement", str));
    }

    public final void a(String str, int i, String str2, String str3) {
        HashMap R = wo1.R("placement", str);
        R.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        R.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            R.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        b(b.SHOW_AD_FAILED, R);
    }

    public final void a(String str, String str2) {
        HashMap R = wo1.R("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            R.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        b(b.AD_CLOSED, R);
    }

    public final void a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put("duration", Long.valueOf(j2));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        c(b.AD_REWARDED, hashMap, j);
    }

    public final void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        b(b.SHOW_AD_CHANCE, hashMap);
    }

    public final void b(String str) {
        b(b.SHOW_AD_SUCCESS, wo1.R("placement", str));
    }

    public final void c(String str) {
        b(b.AD_OPENED, wo1.R("placement", str));
    }

    public final void d(String str) {
        b(b.AD_CLICKED, wo1.R("placement", str));
    }

    public final void e(String str) {
        b(b.AD_STARTED, wo1.R("placement", str));
    }

    public final void f(String str) {
        b(b.AD_ENDED, wo1.R("placement", str));
    }

    public final void g(String str) {
        b(b.AD_VISIBLE, wo1.R("placement", str));
    }

    public final void h(String str) {
        b(b.PLACEMENT_CAPPED, wo1.R("placement", str));
    }
}