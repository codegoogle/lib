package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzy implements zzfuy {
    public final /* synthetic */ zzbyk zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzaa zzc;

    public zzy(zzaa zzaaVar, zzbyk zzbykVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbykVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        try {
            zzbyk zzbykVar = this.zza;
            String message = th.getMessage();
            zzbykVar.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzW;
        zzfii zzfiiVar;
        zzfii zzfiiVar2;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            z = this.zzc.zzu;
            if (z || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        str = this.zzc.zzC;
                        zzW = zzaa.zzW(uri, str, "1");
                        zzfiiVar = this.zzc.zzs;
                        zzfiiVar.zzc(zzW.toString(), null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgu)).booleanValue()) {
                            zzfiiVar2 = this.zzc.zzs;
                            zzfiiVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}