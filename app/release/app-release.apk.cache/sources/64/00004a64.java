package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: IntentCompat.java */
/* loaded from: classes.dex */
public final class jh {
    @SuppressLint({"ActionValue"})
    public static final String a = "android.intent.action.CREATE_REMINDER";
    public static final String b = "android.intent.extra.HTML_TEXT";
    public static final String c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})
    public static final String d = "android.intent.extra.TIME";
    public static final String e = "android.intent.category.LEANBACK_LAUNCHER";

    /* compiled from: IntentCompat.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Intent a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    private jh() {
    }

    @x1
    public static Intent a(@x1 Context context, @x1 String str) {
        if (oh.a(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(oh.b).setData(Uri.fromParts("package", str, null));
            return i >= 30 ? data : data.setPackage((String) jp.l(oh.b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @x1
    public static Intent b(@x1 String str, @x1 String str2) {
        return a.a(str, str2);
    }
}