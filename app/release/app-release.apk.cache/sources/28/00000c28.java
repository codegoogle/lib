package com.anythink.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.rewardvideo.a.a;
import com.anythink.rewardvideo.a.d;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATRewardVideoAutoAd {
    public static void addPlacementId(String... strArr) {
        d.a();
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !t.a().f(str)) {
                    t.a().a(str, true);
                    a.a(m.a().E(), str).a(m.a().E(), 3, (com.anythink.core.common.b.a) null, (b) null);
                }
            }
        }
    }

    public static ATAdStatusInfo checkAdStatus(String str) {
        return d.a().b(str);
    }

    public static List<ATAdInfo> checkValidAdCaches(String str) {
        return d.a().c(str);
    }

    public static void entryAdScenario(String str, String str2) {
        d.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.a().a(str, str2, "1");
    }

    public static void init(Context context, String[] strArr, ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener) {
        d.a().a(context, strArr, aTRewardVideoAutoLoadListener);
    }

    public static boolean isAdReady(String str) {
        return d.a().a(str);
    }

    public static void removePlacementId(String... strArr) {
        d.a();
        d.a(strArr);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        d.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.a().a(str, map);
    }

    public static void show(Activity activity, String str, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        d.a().a(activity, str, "", aTRewardVideoAutoEventListener);
    }

    public static void show(Activity activity, String str, String str2, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        d.a().a(activity, str, str2, aTRewardVideoAutoEventListener);
    }
}