package com.p7700g.p99005;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class wl2 {
    private final String a;

    public wl2(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    private static String f(String str, String str2, @z1 Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = wo1.v(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return wo1.u(str, " : ", str2);
    }

    public final int a(String str, @z1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int b(String str, @z1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int c(Throwable th, String str, @z1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.a, str, objArr), th);
        }
        return 0;
    }

    public final int d(String str, @z1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @z1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}