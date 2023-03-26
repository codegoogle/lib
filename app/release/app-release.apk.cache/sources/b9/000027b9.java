package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeo extends zzek {
    @z1
    private zzev zza;
    @z1
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzeo() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(zzeg.zzG(this.zzb), this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        zzi(zzevVar);
        this.zza = zzevVar;
        Uri uri = zzevVar.zza;
        String scheme = uri.getScheme();
        zzcw.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzaf = zzeg.zzaf(uri.getSchemeSpecificPart(), ",");
        if (zzaf.length == 2) {
            String str = zzaf[1];
            if (zzaf[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzbp.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.zzb = zzeg.zzZ(URLDecoder.decode(str, zzfoi.zza.name()));
            }
            long j = zzevVar.zzf;
            int length = this.zzb.length;
            if (j <= length) {
                int i = (int) j;
                this.zzc = i;
                int i2 = length - i;
                this.zzd = i2;
                long j2 = zzevVar.zzg;
                if (j2 != -1) {
                    this.zzd = (int) Math.min(i2, j2);
                }
                zzj(zzevVar);
                long j3 = zzevVar.zzg;
                return j3 != -1 ? j3 : this.zzd;
            }
            this.zzb = null;
            throw new zzer(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzbp.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        zzev zzevVar = this.zza;
        if (zzevVar != null) {
            return zzevVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}