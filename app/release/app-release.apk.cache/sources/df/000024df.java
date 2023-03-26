package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.j2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdn {
    @Pure
    public static void zza(@j2(max = 23) String str, String str2, @z1 Throwable th) {
        zzc(str2, th);
    }

    @Pure
    public static void zzb(@j2(max = 23) String str, String str2, @z1 Throwable th) {
        zzc(str2, th);
    }

    @Pure
    private static String zzc(String str, @z1 Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        return !TextUtils.isEmpty(replace) ? wo1.v(str, "\n  ", replace.replace("\n", "\n  "), "\n") : str;
    }
}