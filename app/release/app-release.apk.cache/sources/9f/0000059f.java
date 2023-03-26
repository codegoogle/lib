package com.anythink.core.basead.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.core.c.b;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.k;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public final class a {
    public static final String a = "play.google.com";
    public static final String b = "market.android.com";
    public static final String c = "details?";
    public static final String d = "market";
    public static final String e = "market://";

    public static boolean a(Context context, String str, boolean z) {
        boolean z2 = true;
        if (a(str)) {
            return a(context, b(str), z, true);
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.startsWith("http")) {
            return false;
        }
        return a(context, str, z, (scheme.startsWith("market") && wo1.l0(b.a(context)).b().equals("1")) ? false : false);
    }

    private static String b(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf(c))));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a(Context context, String str) {
        k.a(context, str);
    }

    public static boolean a(String str) {
        Uri parse;
        try {
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.getHost() != null) {
                if (parse.getHost().equals("play.google.com")) {
                    return true;
                }
                return parse.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean a(final Context context, String str, boolean z, boolean z2) {
        Intent intent;
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().equals("intent")) {
                intent = Intent.parseUri(str, 1);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
                intent.setData(parse);
            }
            if (z2 && TextUtils.isEmpty(intent.getPackage())) {
                intent.setPackage("com.android.vending");
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            if (z) {
                m.a().a(new Runnable() { // from class: com.anythink.core.basead.a.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Toast.makeText(context, "Detect that the App Market is not installed and cannot be opened through the App Market.", 1).show();
                    }
                });
                return false;
            }
            return false;
        }
    }
}