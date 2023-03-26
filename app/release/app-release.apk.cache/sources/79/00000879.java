package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class u {
    public static final String a = "H+tU+FeXHM==";
    public static final String b = "cv";
    private static final String c = "anythink_share_date";

    private static void a() {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.b().d().getApplicationContext().getSharedPreferences(b, 0).edit();
        edit.clear();
        edit.commit();
    }

    public static Object b(Context context, String str, Object obj) {
        if (context == null) {
            return obj;
        }
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
        SharedPreferences sharedPreferences = context.getSharedPreferences(c, 0);
        if ("String".equals(simpleName)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        return "Long".equals(simpleName) ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    private static void c(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(b, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static Object d(Context context, String str, Object obj) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
        SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
        if ("String".equals(simpleName)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        return "Long".equals(simpleName) ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    private static void a(String str) {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.b().d().getApplicationContext().getSharedPreferences(b, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(c, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(c, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    private static void a(Context context, String... strArr) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(c, 0).edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.apply();
    }
}