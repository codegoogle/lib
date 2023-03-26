package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.p7700g.p99005.k21;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzkg {
    @z1
    private final WifiManager zza;

    public zzkg(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService(k21.b);
    }
}