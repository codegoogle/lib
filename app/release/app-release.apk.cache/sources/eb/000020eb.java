package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbo implements RewardItem {
    private final zzcbb zza;

    public zzcbo(zzcbb zzcbbVar) {
        this.zza = zzcbbVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcbb zzcbbVar = this.zza;
        if (zzcbbVar != null) {
            try {
                return zzcbbVar.zze();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @z1
    public final String getType() {
        zzcbb zzcbbVar = this.zza;
        if (zzcbbVar != null) {
            try {
                return zzcbbVar.zzf();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}