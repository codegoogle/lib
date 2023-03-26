package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfhg {
    public static zzfhh zza(Context context, int i) {
        boolean booleanValue;
        if (zzfhu.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbji.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbji.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbji.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbji.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfhj(context, i);
            }
        }
        return new zzfid();
    }

    public static zzfhh zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfhh zza = zza(context, i);
        if (zza instanceof zzfhj) {
            zza.zzf();
            zza.zzk(i2);
            if (zzfhr.zze(zzlVar.zzp)) {
                zza.zzd(zzlVar.zzp);
            }
            return zza;
        }
        return zza;
    }
}