package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdz implements zzcx {
    @Override // com.google.android.gms.internal.ads.zzcx
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzdg zzb(Looper looper, @z1 Handler.Callback callback) {
        return new zzec(new Handler(looper, callback));
    }
}