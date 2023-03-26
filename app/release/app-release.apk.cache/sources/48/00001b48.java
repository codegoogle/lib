package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaae {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    @z1
    public static zzbl zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] zzag = zzeg.zzag(str, AppCenter.KEY_VALUE_DELIMITER);
            if (zzag.length != 2) {
                "Failed to parse Vorbis comment: ".concat(String.valueOf(str));
            } else if (zzag[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzabg.zzb(new zzdy(Base64.decode(zzag[1], 0))));
                } catch (RuntimeException e) {
                    zzdn.zzb("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzacw(zzag[0], zzag[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    public static zzaab zzc(zzdy zzdyVar, boolean z, boolean z2) throws zzbp {
        if (z) {
            zzd(3, zzdyVar, false);
        }
        String zzx = zzdyVar.zzx((int) zzdyVar.zzq(), zzfoi.zzc);
        long zzq = zzdyVar.zzq();
        String[] strArr = new String[(int) zzq];
        int length = zzx.length() + 15;
        for (int i = 0; i < zzq; i++) {
            String zzx2 = zzdyVar.zzx((int) zzdyVar.zzq(), zzfoi.zzc);
            strArr[i] = zzx2;
            length = length + 4 + zzx2.length();
        }
        if (z2 && (zzdyVar.zzk() & 1) == 0) {
            throw zzbp.zza("framing bit expected to be set", null);
        }
        return new zzaab(zzx, strArr, length + 1);
    }

    public static boolean zzd(int i, zzdy zzdyVar, boolean z) throws zzbp {
        if (zzdyVar.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzdyVar.zza();
            throw zzbp.zza("too short header: " + zza, null);
        } else if (zzdyVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzdyVar.zzk() == 118 && zzdyVar.zzk() == 111 && zzdyVar.zzk() == 114 && zzdyVar.zzk() == 98 && zzdyVar.zzk() == 105 && zzdyVar.zzk() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected characters 'vorbis'", null);
        }
    }
}