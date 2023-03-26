package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    private static b c;
    public String a = "InterstitialAuto";
    public ATInterstitialAutoLoadListener b = new ATInterstitialAutoLoadListener() { // from class: com.anythink.interstitial.a.b.1
        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoadFail(final String str, final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.a.b.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.d != null) {
                        b.this.d.onInterstitialAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoaded(final String str) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.a.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.d != null) {
                        b.this.d.onInterstitialAutoLoaded(str);
                    }
                }
            });
        }
    };
    private ATInterstitialAutoLoadListener d;

    private static void b(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !t.a().f(str)) {
                t.a().a(str, true);
                a.a(m.a().E(), str).a(m.a().E(), 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
            }
        }
    }

    private static List<ATAdInfo> c(String str) {
        a a = a.a(m.a().E(), str);
        if (a != null) {
            return a.b(m.a().E());
        }
        return null;
    }

    private ATAdStatusInfo d(String str) {
        a a;
        if (m.a().e() == null || TextUtils.isEmpty(m.a().n()) || TextUtils.isEmpty(m.a().o()) || (a = a.a(m.a().E(), str)) == null) {
            return null;
        }
        return a.a(m.a().E());
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    public final void a(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
        if (context instanceof Activity) {
            m.a().a((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!t.a().f(str)) {
                    t.a().a(str, true);
                    a.a(context, str).a(context, 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        this.d = aTInterstitialAutoLoadListener;
    }

    public final ATAdStatusInfo b(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (!TextUtils.isEmpty(str)) {
            aTAdStatusInfo = d(str);
            if (aTAdStatusInfo == null) {
                aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
            }
        } else {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        }
        com.anythink.core.common.j.m.a(str, g.i.n, g.i.t, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    private ATInterstitialAutoLoadListener b() {
        return this.b;
    }

    public static void a(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                t.a().a(str, false);
                a.a(m.a().e(), str).j();
            }
        }
    }

    private static void a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.a().a(str, map);
    }

    private void a(Activity activity, String str, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        a(activity, str, "", aTInterstitialAutoEventListener);
    }

    public final void a(Activity activity, String str, String str2, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        com.anythink.core.common.j.m.a(str, g.i.n, g.i.r, g.i.h, "");
        if (TextUtils.isEmpty(str) || m.a().e() == null || TextUtils.isEmpty(m.a().n()) || TextUtils.isEmpty(m.a().o())) {
            return;
        }
        a.a(activity, str).a(activity, str2, new c(aTInterstitialAutoEventListener), (ATEventInterface) null);
    }

    public final boolean a(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo d = d(str);
            if (d == null) {
                return false;
            }
            z = d.isReady();
        }
        com.anythink.core.common.j.m.a(str, g.i.n, g.i.s, String.valueOf(z), "");
        return z;
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.a().a(str, str2, "1");
    }
}