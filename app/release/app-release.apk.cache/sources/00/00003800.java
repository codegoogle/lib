package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UrlHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000f¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/a03;", "", "Landroid/content/Context;", "context", "", a03.c, "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/content/Context;Ljava/lang/String;)V", "url", "c", "d", "e", "a", "l", "Ljava/lang/String;", "TEXT", "i", "TWITTER_PACKAGE", "f", "FACEBOOK", "j", "WHATSAPP_PACKAGE", "TAG", "TWITTER", "MARKET", "WHATSAPP", com.anythink.basead.d.g.i, "TELEPHONE", "h", "FACEBOOK_PACKAGE", "k", "WHATSAPP_MESSAGE_PREFIX", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a03 {
    @NotNull
    private static final String b = "UrlHlpr";
    @NotNull
    private static final String c = "twitter";
    @NotNull
    private static final String d = "whatsapp";
    @NotNull
    private static final String e = "market";
    @NotNull
    private static final String f = "fb";
    @NotNull
    private static final String g = "tel";
    @NotNull
    private static final String h = "com.facebook.katana";
    @NotNull
    private static final String i = "com.twitter.android";
    @NotNull
    private static final String j = "com.whatsapp";
    @NotNull
    private static final String k = "send_text";
    @NotNull
    public static final a03 a = new a03();
    @NotNull
    private static final String l = "text/plain";

    private a03() {
    }

    private final void b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(i, 0);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage(i);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            throw e2;
        }
    }

    @r2
    private final void c(Context context, String str) {
        if (!c95.V2(str, k, false, 2, null)) {
            xz2.c(b, "[ERROR] Engagement whatsapp message not available");
            return;
        }
        try {
            context.getPackageManager().getPackageInfo(j, 128);
            String substring = str.substring(c95.r3(str, k, 0, false, 6, null) + 9 + 1, str.length());
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(1);
            intent.setType(l);
            intent.setPackage(j);
            intent.putExtra("android.intent.extra.TEXT", substring);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (PackageManager.NameNotFoundException e2) {
            throw e2;
        }
    }

    public final void a(@NotNull Context context, @NotNull String str) {
        c25.p(context, "context");
        c25.p(str, "url");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(h, 0);
            c25.o(applicationInfo, "pm.getApplicationInfo(FACEBOOK_PACKAGE, 0)");
            if (applicationInfo.enabled) {
                intent.setData(parse);
                intent.setPackage(h);
            } else {
                intent.setData(Uri.parse(parse.getQueryParameter("href")));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            intent.setData(Uri.parse(parse.getQueryParameter("href")));
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void d(@Nullable Context context, @NotNull String str) {
        c25.p(str, "url");
        try {
            e(context, str);
        } catch (Exception e2) {
            xz2.b(b, "[ERROR] Redirection failed ", e2);
        }
    }

    public final void e(@Nullable Context context, @NotNull String str) {
        c25.p(str, "url");
        if (context != null) {
            if (str.length() > 0) {
                Uri parse = Uri.parse(str);
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
                            if (scheme.equals(c)) {
                                b(context, str);
                                return;
                            }
                            break;
                        case 3260:
                            if (scheme.equals("fb")) {
                                a(context, str);
                                return;
                            }
                            break;
                        case 114715:
                            if (scheme.equals(g)) {
                                Intent intent2 = new Intent("android.intent.action.DIAL");
                                intent2.setFlags(268435456);
                                intent2.setData(parse);
                                context.startActivity(intent2);
                                return;
                            }
                            break;
                        case 1934780818:
                            if (scheme.equals(d)) {
                                c(context, str);
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
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}