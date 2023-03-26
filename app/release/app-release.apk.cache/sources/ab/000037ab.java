package com.microsoft.appcenter.utils.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Set;

/* loaded from: classes3.dex */
public class SharedPreferencesManager {
    private static final String PREFERENCES_NAME = "AppCenter";
    @SuppressLint({"StaticFieldLeak"})
    private static Context sContext;
    private static SharedPreferences sSharedPreferences;

    public static void clear() {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.clear();
        edit.apply();
    }

    public static boolean getBoolean(@x1 String str) {
        return getBoolean(str, false);
    }

    public static float getFloat(@x1 String str) {
        return getFloat(str, 0.0f);
    }

    public static int getInt(@x1 String str) {
        return getInt(str, 0);
    }

    public static long getLong(@x1 String str) {
        return getLong(str, 0L);
    }

    @z1
    public static String getString(@x1 String str) {
        return getString(str, null);
    }

    public static Set<String> getStringSet(@x1 String str) {
        return getStringSet(str, null);
    }

    public static synchronized void initialize(Context context) {
        synchronized (SharedPreferencesManager.class) {
            if (sContext == null) {
                sContext = context;
                sSharedPreferences = context.getSharedPreferences("AppCenter", 0);
            }
        }
    }

    public static void putBoolean(@x1 String str, boolean z) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void putFloat(@x1 String str, float f) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putFloat(str, f);
        edit.apply();
    }

    public static void putInt(@x1 String str, int i) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void putLong(@x1 String str, long j) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void putString(@x1 String str, String str2) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void putStringSet(@x1 String str, Set<String> set) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public static void remove(@x1 String str) {
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        edit.remove(str);
        edit.apply();
    }

    public static boolean getBoolean(@x1 String str, boolean z) {
        return sSharedPreferences.getBoolean(str, z);
    }

    public static float getFloat(@x1 String str, float f) {
        return sSharedPreferences.getFloat(str, f);
    }

    public static int getInt(@x1 String str, int i) {
        return sSharedPreferences.getInt(str, i);
    }

    public static long getLong(@x1 String str, long j) {
        return sSharedPreferences.getLong(str, j);
    }

    public static String getString(@x1 String str, String str2) {
        return sSharedPreferences.getString(str, str2);
    }

    public static Set<String> getStringSet(@x1 String str, Set<String> set) {
        return sSharedPreferences.getStringSet(str, set);
    }
}