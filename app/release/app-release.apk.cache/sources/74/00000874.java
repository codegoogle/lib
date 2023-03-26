package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.out.p;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class r extends e {
    public static boolean a = false;
    public static char[] b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};
    private static final String c = "SDKUtil";

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "com.android.vending";
        public static final String b = "market";
        public static final String c = "play.google.com";
        public static final String d = "market.android.com";
        public static final String e = "google.com";
        public static final String f = "market://";
        public static final String g = "details?id=";
        public static final String h = "market://details?id=com.package.name";

        private static Intent a() {
            return new Intent("android.intent.action.VIEW", Uri.parse(h));
        }

        private static boolean b(Context context) {
            List<ResolveInfo> a2 = a(context);
            return a2 != null && a2.size() > 0;
        }

        private static boolean c(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (parse.getHost().equals("play.google.com")) {
                        return true;
                    }
                    return parse.getHost().equals("market.android.com");
                }
            } catch (Throwable th) {
                n.d(r.c, Log.getStackTraceString(th));
            }
            return false;
        }

        private static String d(String str) {
            if (b(str)) {
                return str;
            }
            if (c(str)) {
                return "market://".concat(String.valueOf(str.substring(str.indexOf(g))));
            }
            return null;
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(a(), 0);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public static boolean b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                n.d(r.c, Log.getStackTraceString(th));
                return false;
            }
        }

        public static boolean a(String str) {
            return b(str) || c(str);
        }

        public static boolean a(Context context, String str, p.c cVar) {
            try {
                if (!b(str)) {
                    str = c(str) ? "market://".concat(String.valueOf(str.substring(str.indexOf(g)))) : null;
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                Intent a2 = a();
                a2.setData(Uri.parse(str));
                a2.addFlags(268435456);
                context.startActivity(a2);
                r.a(cVar);
                return true;
            } catch (Throwable th) {
                n.d(r.c, Log.getStackTraceString(th));
                return false;
            }
        }
    }

    public static void a(p.c cVar) {
        if (cVar instanceof p.e) {
            ((p.e) cVar).b();
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.hashCode());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
        return sb2.toString();
    }

    public static void a(Context context, String str, com.anythink.expressad.foundation.d.c cVar, p.c cVar2) {
        if (context == null) {
            return;
        }
        if (a) {
            a(context, str, cVar2);
            return;
        }
        try {
            Class.forName("com.anythink.expressad.activity.ATCommonActivity");
            Intent intent = new Intent(context, Class.forName("com.anythink.expressad.activity.ATCommonActivity"));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            intent.putExtra("url", str);
            n.b("url", "webview url = ".concat(String.valueOf(str)));
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", cVar);
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context, str, cVar2);
        }
    }

    private static void b(Context context, String str, p.c cVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = queryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    b(context, "market://details?id=".concat(String.valueOf(str.replace("https://play.google.com/store/apps/details?id=", ""))), cVar);
                }
            } else if (!z) {
                a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
            } else {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo.packageName.equals("com.android.vending")) {
                        intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                        break;
                    }
                }
                try {
                    context.startActivity(intent);
                    a(cVar);
                } catch (Exception unused) {
                    a(context, "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", ""))), cVar);
                }
            }
        } catch (Exception e) {
            n.d(c, e.getMessage());
        }
    }

    public static void a(Context context, String str, p.c cVar) {
        if (str == null || context == null) {
            return;
        }
        try {
            if (a.b(str)) {
                str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(cVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String a(String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File a2 = com.anythink.expressad.foundation.g.c.d.a(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_IMG);
        if (TextUtils.isEmpty(str)) {
            sb = "";
        } else if (str.lastIndexOf("/") == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode());
            sb = sb3.toString();
        }
        return new File(a2, sb).getAbsolutePath();
    }

    private static String a() {
        return com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.AD_ANYTHINK_700);
    }
}