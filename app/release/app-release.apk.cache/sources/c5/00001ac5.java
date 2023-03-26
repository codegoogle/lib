package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class WakeLockTracker {
    private static WakeLockTracker zza = new WakeLockTracker();

    @x1
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(@x1 Context context, @x1 Intent intent, @x1 String str, @x1 String str2, @x1 String str3, int i, @x1 String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@x1 Context context, @x1 String str, @x1 String str2, @x1 String str3, int i, @x1 List<String> list, boolean z, long j) {
    }

    @KeepForSdk
    public void registerEvent(@x1 Context context, @x1 String str, int i, @x1 String str2, @x1 String str3, @x1 String str4, int i2, @x1 List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(@x1 Context context, @x1 String str, int i, @x1 String str2, @x1 String str3, @x1 String str4, int i2, @x1 List<String> list, long j) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@x1 Context context, @x1 Intent intent) {
    }
}