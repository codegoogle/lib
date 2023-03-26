package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzkf {
    @z1
    private final PowerManager zza;

    public zzkf(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}