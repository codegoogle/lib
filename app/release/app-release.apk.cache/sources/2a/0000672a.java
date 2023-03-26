package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: AppLaunchChecker.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class yf {
    private static final String a = "android.support.AppLaunchChecker";
    private static final String b = "startedFromLauncher";

    public static boolean a(@x1 Context context) {
        return context.getSharedPreferences(a, 0).getBoolean(b, false);
    }

    public static void b(@x1 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(a, 0);
        if (sharedPreferences.getBoolean(b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(jh.e)) {
            sharedPreferences.edit().putBoolean(b, true).apply();
        }
    }
}