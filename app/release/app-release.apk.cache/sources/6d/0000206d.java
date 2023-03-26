package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwy implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzblv zza;

    public zzbwy(zzblv zzblvVar) {
        this.zza = zzblvVar;
        try {
            zzblvVar.zzl();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzo(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return false;
        }
    }
}