package com.anythink.interstitial.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.interstitial.a.a;
import com.anythink.interstitial.a.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATInterstitialAutoAd {
    public static void addPlacementId(String... strArr) {
        b.a();
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !t.a().f(str)) {
                    t.a().a(str, true);
                    a.a(m.a().E(), str).a(m.a().E(), 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
    }

    public static ATAdStatusInfo checkAdStatus(String str) {
        return b.a().b(str);
    }

    public static List<ATAdInfo> checkValidAdCaches(String str) {
        b.a();
        a a = a.a(m.a().E(), str);
        if (a != null) {
            return a.b(m.a().E());
        }
        return null;
    }

    public static void entryAdScenario(String str, String str2) {
        b.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.a().a(str, str2, "1");
    }

    public static void init(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
        b.a().a(context, strArr, aTInterstitialAutoLoadListener);
    }

    public static boolean isAdReady(String str) {
        return b.a().a(str);
    }

    public static void removePlacementId(String... strArr) {
        b.a();
        b.a(strArr);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        b.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.a().a(str, map);
    }

    public static void show(Activity activity, String str, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        b.a().a(activity, str, "", aTInterstitialAutoEventListener);
    }

    public static void show(Activity activity, String str, String str2, ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        b.a().a(activity, str, str2, aTInterstitialAutoEventListener);
    }
}