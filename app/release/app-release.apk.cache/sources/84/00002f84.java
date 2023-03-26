package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.h.l;
import com.p7700g.p99005.qi4;
import com.p7700g.p99005.yg1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import org.xbill.DNS.SimpleResolver;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyp {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, yg1.K, 224, 256, 384, l.a.a, 512, 640, 768, 896, 1024, 1152, SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, qi4.h.k, 4096, 6144, 7680};

    public static zzad zza(byte[] bArr, @z1 String str, @z1 String str2, @z1 zzv zzvVar) {
        zzdx zzdxVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzdxVar = new zzdx(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzdxVar = new zzdx(copyOf, length);
            if (copyOf[0] == 31) {
                zzdx zzdxVar2 = new zzdx(copyOf, length);
                while (zzdxVar2.zza() >= 16) {
                    zzdxVar2.zzj(2);
                    zzdxVar.zze(zzdxVar2.zzc(14), 14);
                }
            }
            zzdxVar.zzg(copyOf, copyOf.length);
        }
        zzdxVar.zzj(60);
        int i3 = zzb[zzdxVar.zzc(6)];
        int i4 = zzc[zzdxVar.zzc(4)];
        int zzc2 = zzdxVar.zzc(5);
        int i5 = zzc2 < 29 ? (zzd[zzc2] * 1000) / 2 : -1;
        zzdxVar.zzj(10);
        int i6 = zzdxVar.zzc(2) > 0 ? 1 : 0;
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS("audio/vnd.dts");
        zzabVar.zzv(i5);
        zzabVar.zzw(i3 + i6);
        zzabVar.zzT(i4);
        zzabVar.zzB(null);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }
}