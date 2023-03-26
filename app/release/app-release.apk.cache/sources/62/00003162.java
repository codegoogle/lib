package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.WakeLockTracker;
import com.p7700g.p99005.uy;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GCoreWakefulBroadcastReceiver extends uy {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    @KeepForSdk
    @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
        } else {
            String valueOf = String.valueOf(intent.toUri(0));
            if (valueOf.length() != 0) {
                "context shouldn't be null. intent: ".concat(valueOf);
            } else {
                new String("context shouldn't be null. intent: ");
            }
        }
        return uy.completeWakefulIntent(intent);
    }
}