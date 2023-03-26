package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.qe3;
import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class i extends qe3 {
    public i(d dVar) {
        super(dVar);
    }

    public final void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        b(b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public final void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        b(b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public final void a(String str) {
        b(b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, wo1.R("reason", str));
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, str);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str2);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str3);
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str4);
        hashMap.put("reason", str5);
        b(b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    public final void b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        b(b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public final void b(String str) {
        b(b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, wo1.R("reason", str));
    }

    public final void c(String str) {
        b(b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, wo1.R("reason", str));
    }

    public final void d(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, wo1.R("reason", str));
    }

    public final void e(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, wo1.R("reason", str));
    }

    public final void f(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, wo1.R("reason", str));
    }

    public final void g(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, wo1.R("reason", str));
    }

    public final void h(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, wo1.R("reason", str));
    }

    public final void i(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, wo1.R("reason", str));
    }

    public final void j(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, wo1.R("reason", str));
    }

    public final void k(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_CLOSED, wo1.R("reason", str));
    }

    public final void l(String str) {
        b(b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, wo1.R("reason", str));
    }

    public final void m(String str) {
        b(b.TROUBLESHOOT_INTERNAL_ERROR, wo1.R("reason", str));
    }

    public final void n(String str) {
        b(b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, wo1.R("reason", str));
    }

    public final void o(String str) {
        b(b.TROUBLESHOOTING_WATERFALL_OVERHEAD, wo1.R("reason", str));
    }

    public final void p(String str) {
        b(b.TROUBLESHOOT_AD_EXPIRED, wo1.R("reason", str));
    }
}