package com.microsoft.appcenter.utils;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;

/* loaded from: classes3.dex */
public class AppCenterLog {
    public static final String LOG_TAG = "AppCenter";
    public static final int NONE = 8;
    private static int sLogLevel = 7;

    public static void debug(@x1 String str, @x1 String str2) {
        int i = sLogLevel;
    }

    public static void error(@x1 String str, @x1 String str2) {
        int i = sLogLevel;
    }

    @p1(from = 2, to = PlaybackStateCompat.v)
    public static int getLogLevel() {
        return sLogLevel;
    }

    public static void info(@x1 String str, @x1 String str2) {
        int i = sLogLevel;
    }

    public static void logAssert(@x1 String str, @x1 String str2) {
        if (sLogLevel <= 7) {
            Log.println(7, str, str2);
        }
    }

    public static void setLogLevel(@p1(from = 2, to = 8) int i) {
        sLogLevel = i;
    }

    public static void verbose(@x1 String str, @x1 String str2) {
        int i = sLogLevel;
    }

    public static void warn(@x1 String str, @x1 String str2) {
        int i = sLogLevel;
    }

    public static void debug(@x1 String str, @x1 String str2, Throwable th) {
        int i = sLogLevel;
    }

    public static void error(@x1 String str, @x1 String str2, Throwable th) {
        int i = sLogLevel;
    }

    public static void info(@x1 String str, @x1 String str2, Throwable th) {
        int i = sLogLevel;
    }

    public static void verbose(@x1 String str, @x1 String str2, Throwable th) {
        int i = sLogLevel;
    }

    public static void warn(@x1 String str, @x1 String str2, Throwable th) {
        int i = sLogLevel;
    }

    public static void logAssert(@x1 String str, @x1 String str2, Throwable th) {
        if (sLogLevel <= 7) {
            StringBuilder L = wo1.L(str2, "\n");
            L.append(Log.getStackTraceString(th));
            Log.println(7, str, L.toString());
        }
    }
}