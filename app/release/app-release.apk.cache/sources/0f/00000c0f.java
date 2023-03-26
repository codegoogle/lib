package com.anythink.rewardvideo.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.rewardvideo.api.ATRewardVideoAutoEventListener;
import com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {
    private static d c;
    public String a = "RewardVideoAuto";
    public ATRewardVideoAutoLoadListener b = new ATRewardVideoAutoLoadListener() { // from class: com.anythink.rewardvideo.a.d.1
        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoadFail(final String str, final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.d.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.d != null) {
                        d.this.d.onRewardVideoAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoaded(final String str) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.d.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.d != null) {
                        d.this.d.onRewardVideoAutoLoaded(str);
                    }
                }
            });
        }
    };
    private ATRewardVideoAutoLoadListener d;

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

    private ATAdStatusInfo d(String str) {
        a a;
        if (m.a().e() == null || TextUtils.isEmpty(m.a().n()) || TextUtils.isEmpty(m.a().o()) || (a = a.a(m.a().E(), str)) == null) {
            return null;
        }
        return a.a(m.a().E());
    }

    public final List<ATAdInfo> c(String str) {
        a a;
        if (TextUtils.isEmpty(str) || (a = a.a(m.a().E(), str)) == null) {
            return null;
        }
        return a.b(m.a().E());
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    public final void a(Context context, String[] strArr, ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener) {
        if (context instanceof Activity) {
            m.a().a((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !t.a().f(str)) {
                    t.a().a(str, true);
                    a.a(context, str).a(context, 3, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        this.d = aTRewardVideoAutoLoadListener;
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
        com.anythink.core.common.j.m.a(str, g.i.o, g.i.t, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    private ATRewardVideoAutoLoadListener b() {
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

    private void a(Activity activity, String str, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        a(activity, str, "", aTRewardVideoAutoEventListener);
    }

    public final void a(Activity activity, String str, String str2, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener) {
        com.anythink.core.common.j.m.a(str, g.i.o, g.i.r, g.i.h, "");
        if (TextUtils.isEmpty(str)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId is empty.");
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode, j.a((com.anythink.core.common.b.d) null));
            }
        }
        if (m.a().e() != null && !TextUtils.isEmpty(m.a().n()) && !TextUtils.isEmpty(m.a().o())) {
            a.a(activity, str).a(activity, str2, new c(aTRewardVideoAutoEventListener), (ATEventInterface) null);
            return;
        }
        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
        if (aTRewardVideoAutoEventListener != null) {
            aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode2, j.a((com.anythink.core.common.b.d) null));
        }
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
        com.anythink.core.common.j.m.a(str, g.i.o, g.i.s, String.valueOf(z), "");
        return z;
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.a().a(str, str2, "1");
    }
}