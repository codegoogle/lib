package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j73 {
    @NotNull
    public static final j73 a = new j73();
    @NotNull
    private static final String b = "text/plain";

    private j73() {
    }

    private final void c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.facebook.katana", 0);
            c25.o(applicationInfo, "pm.getApplicationInfo(FACEBOOK_PACKAGE, 0)");
            if (applicationInfo.enabled) {
                intent.setData(parse);
                intent.setPackage("com.facebook.katana");
            } else {
                intent.setData(Uri.parse(parse.getQueryParameter("href")));
                xz2.c("UrlHlpr", "[ERROR] Facebook not installed");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            intent.setData(Uri.parse(parse.getQueryParameter("href")));
            xz2.c("UrlHlpr", "[ERROR] Facebook not installed");
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private final void d(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo("com.twitter.android", 0);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage("com.twitter.android");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            xz2.c("UrlHlpr", c25.C("[ERROR] Twitter not installed", e.getMessage()));
        }
    }

    private final void e(Context context, String str) {
        if (!c95.V2(str, "send_text", false, 2, null)) {
            xz2.c("UrlHlpr", "[ERROR] Engagement whatsapp message not available");
            return;
        }
        try {
            context.getPackageManager().getPackageInfo("com.whatsapp", 128);
            String substring = str.substring(c95.r3(str, "send_text", 0, false, 6, null) + 9 + 1, str.length());
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(1);
            intent.setType(b);
            intent.setPackage("com.whatsapp");
            intent.putExtra("android.intent.extra.TEXT", substring);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (PackageManager.NameNotFoundException e) {
            xz2.c("UrlHlpr", c25.C("[ERROR] Whatsapp not installed", e.getMessage()));
        }
    }

    public final void a(@Nullable Context context, @NotNull String str) {
        c25.p(str, "url");
        if (context != null && !TextUtils.isEmpty(str)) {
            String a2 = ma3.a.a(str);
            Uri parse = Uri.parse(a2);
            String scheme = parse.getScheme();
            if (scheme != null) {
                switch (scheme.hashCode()) {
                    case -1081306052:
                        if (scheme.equals("market")) {
                            Intent intent = new Intent("android.intent.action.VIEW", parse);
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                            return;
                        }
                        break;
                    case -916346253:
                        if (scheme.equals("twitter")) {
                            d(context, a2);
                            return;
                        }
                        break;
                    case 3260:
                        if (scheme.equals(com.anythink.expressad.foundation.d.l.f)) {
                            c(context, a2);
                            return;
                        }
                        break;
                    case 114715:
                        if (scheme.equals("tel")) {
                            Intent intent2 = new Intent("android.intent.action.DIAL");
                            intent2.setFlags(268435456);
                            intent2.setData(parse);
                            context.startActivity(intent2);
                            return;
                        }
                        break;
                    case 1934780818:
                        if (scheme.equals("whatsapp")) {
                            e(context, a2);
                            return;
                        }
                        break;
                }
            }
            Intent intent3 = new Intent("android.intent.action.VIEW", parse);
            intent3.setFlags(268435456);
            try {
                if (intent3.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent3);
                } else {
                    xz2.c("UrlHlpr", "[ERROR] No intent available to handle action");
                }
                return;
            } catch (Exception e) {
                xz2.b("UrlHlpr", "Crashed when opening external mActivity", e);
                return;
            }
        }
        xz2.c("UrlHlpr", "[ERROR] Redirection failed null context or empty string url");
    }

    public final boolean b(@NotNull String str, @NotNull String str2) {
        c25.p(str, "startUrl");
        c25.p(str2, "endUrl");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new i73().b(str, str2);
        }
        xz2.c("UrlHlpr", "[ERROR] Url provided to compare is empty");
        return false;
    }
}