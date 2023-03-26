package com.anythink.expressad.video.dynview.h;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.j.d;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private static boolean a(List<com.anythink.expressad.foundation.d.c> list) {
        com.anythink.expressad.foundation.d.c cVar;
        if (list == null || list.size() <= 0 || (cVar = list.get(0)) == null) {
            return false;
        }
        return cVar.j();
    }

    private static int b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null || cVar.L() == null) {
            return 1;
        }
        return cVar.L().c();
    }

    private static void a(com.anythink.expressad.foundation.d.c cVar, Activity activity) {
        if (cVar == null || cVar.L() == null) {
            return;
        }
        int c = cVar.L().c();
        if (activity.isFinishing()) {
            return;
        }
        if (c == 1) {
            activity.setRequestedOrientation(7);
        } else if (c != 2) {
            if (a((Context) activity)) {
                activity.setRequestedOrientation(6);
            } else {
                activity.setRequestedOrientation(7);
            }
        } else {
            activity.setRequestedOrientation(6);
        }
    }

    private static void a(Activity activity) {
        if (a((Context) activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static String a(long j, Context context) {
        String f = d.f(context);
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.N)) {
            if (!f.contains(com.anythink.expressad.video.dynview.a.a.V) && !f.contains(com.anythink.expressad.video.dynview.a.a.W)) {
                return j + com.anythink.expressad.video.dynview.a.a.w;
            }
            return j + com.anythink.expressad.video.dynview.a.a.x;
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.O)) {
            return j + com.anythink.expressad.video.dynview.a.a.z;
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.P)) {
            return com.anythink.expressad.video.dynview.a.a.A + j + " Sekunden";
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Q)) {
            return j + com.anythink.expressad.video.dynview.a.a.B;
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.R)) {
            return com.anythink.expressad.video.dynview.a.a.C + j + " secondes";
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.S)) {
            return " ثوان" + j + com.anythink.expressad.video.dynview.a.a.D;
        } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.T)) {
            return com.anythink.expressad.video.dynview.a.a.E + j + " секунд";
        } else {
            return com.anythink.expressad.video.dynview.a.a.y + j + " s";
        }
    }

    public static String a(Context context, int i) {
        String str = i == 1 ? com.anythink.expressad.video.dynview.a.a.L : com.anythink.expressad.video.dynview.a.a.M;
        String f = d.f(context);
        if (f.startsWith(com.anythink.expressad.video.dynview.a.a.N)) {
            return (f.contains(com.anythink.expressad.video.dynview.a.a.V) || f.contains(com.anythink.expressad.video.dynview.a.a.W)) ? "anythink_reward_two_title_zh_trad" : "anythink_reward_two_title_zh";
        }
        return "anythink_reward_two_title_en".concat(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.video.dynview.a.a.I);
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("1");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null && cVar.L() != null) {
            int b = cVar.L().b();
            if (b == 202 || b == 302 || b == 802) {
                return -3;
            }
            if (b == 904) {
                return !a(cVar.L().e()) ? -1 : -3;
            }
        }
        return 100;
    }
}