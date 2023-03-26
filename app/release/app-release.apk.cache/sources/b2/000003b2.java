package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzajn;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class VolleyLog {
    public static String TAG = "Volley";
    public static boolean DEBUG = Log.isLoggable(zzajn.zza, 2);
    private static final String CLASS_NAME = VolleyLog.class.getName();

    /* loaded from: classes2.dex */
    public static class MarkerLog {
        public static final boolean ENABLED = VolleyLog.DEBUG;
        private static final long MIN_DURATION_FOR_LOGGING_MS = 0;
        private final List<Marker> mMarkers = new ArrayList();
        private boolean mFinished = false;

        /* loaded from: classes2.dex */
        public static class Marker {
            public final String name;
            public final long thread;
            public final long time;

            public Marker(String str, long j, long j2) {
                this.name = str;
                this.thread = j;
                this.time = j2;
            }
        }

        private long getTotalDuration() {
            if (this.mMarkers.size() == 0) {
                return 0L;
            }
            long j = this.mMarkers.get(0).time;
            List<Marker> list = this.mMarkers;
            return list.get(list.size() - 1).time - j;
        }

        public synchronized void add(String str, long j) {
            if (!this.mFinished) {
                this.mMarkers.add(new Marker(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public void finalize() throws Throwable {
            if (this.mFinished) {
                return;
            }
            finish("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public synchronized void finish(String str) {
            this.mFinished = true;
            long totalDuration = getTotalDuration();
            if (totalDuration <= 0) {
                return;
            }
            long j = this.mMarkers.get(0).time;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(totalDuration), str);
            for (Marker marker : this.mMarkers) {
                long j2 = marker.time;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(marker.thread), marker.name);
                j = j2;
            }
        }
    }

    private static String buildMessage(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(CLASS_NAME)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder L = wo1.L(substring.substring(substring.lastIndexOf(36) + 1), CryptoConstants.ALIAS_SEPARATOR);
                L.append(stackTrace[i].getMethodName());
                str2 = L.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void d(String str, Object... objArr) {
        buildMessage(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        buildMessage(str, objArr);
    }

    public static void setTag(String str) {
        d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            buildMessage(str, objArr);
        }
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf(TAG, buildMessage(str, objArr));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        buildMessage(str, objArr);
    }

    public static void wtf(Throwable th, String str, Object... objArr) {
        Log.wtf(TAG, buildMessage(str, objArr), th);
    }
}