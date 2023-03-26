package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import com.p7700g.p99005.c6;
import com.p7700g.p99005.z5;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgrj extends c6 {
    private final WeakReference zza;

    public zzgrj(zzbix zzbixVar, byte[] bArr) {
        this.zza = new WeakReference(zzbixVar);
    }

    @Override // com.p7700g.p99005.c6
    public final void onCustomTabsServiceConnected(ComponentName componentName, z5 z5Var) {
        zzbix zzbixVar = (zzbix) this.zza.get();
        if (zzbixVar != null) {
            zzbixVar.zzc(z5Var);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbix zzbixVar = (zzbix) this.zza.get();
        if (zzbixVar != null) {
            zzbixVar.zzd();
        }
    }
}