package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzos extends zzqi implements zzjb {
    private final Context zzb;
    private final zznj zzc;
    private final zznq zzd;
    private int zze;
    private boolean zzf;
    @z1
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    @z1
    private zzjs zzl;

    public zzos(Context context, zzqc zzqcVar, zzqk zzqkVar, boolean z, @z1 Handler handler, @z1 zznk zznkVar, zznq zznqVar) {
        super(1, zzqcVar, zzqkVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznqVar;
        this.zzc = new zznj(handler, zznkVar);
        zznqVar.zzn(new zzor(this, null));
    }

    private final int zzaw(zzqf zzqfVar, zzad zzadVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzqfVar.zza) || (i = zzeg.zza) >= 24 || (i == 23 && zzeg.zzW(this.zzb))) {
            return zzadVar.zzn;
        }
        return -1;
    }

    private static List zzax(zzqk zzqkVar, zzad zzadVar, boolean z, zznq zznqVar) throws zzqr {
        zzqf zzd;
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrj.zzo();
        }
        if (zznqVar.zzv(zzadVar) && (zzd = zzqx.zzd()) != null) {
            return zzfrj.zzp(zzd);
        }
        List zzf = zzqx.zzf(str, false, false);
        String zze = zzqx.zze(zzadVar);
        if (zze == null) {
            return zzfrj.zzm(zzf);
        }
        List zzf2 = zzqx.zzf(zze, false, false);
        zzfrg zzi = zzfrj.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzay() {
        long zzb = this.zzd.zzb(zzM());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzh, zzb);
            }
            this.zzh = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final float zzP(float f, zzad zzadVar, zzad[] zzadVarArr) {
        int i = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i2 = zzadVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr {
        boolean z;
        if (zzbo.zzg(zzadVar.zzm)) {
            int i = zzeg.zza >= 21 ? 32 : 0;
            int i2 = zzadVar.zzF;
            boolean zzav = zzqi.zzav(zzadVar);
            if (zzav && this.zzd.zzv(zzadVar) && (i2 == 0 || zzqx.zzd() != null)) {
                return i | 140;
            }
            if ((!"audio/raw".equals(zzadVar.zzm) || this.zzd.zzv(zzadVar)) && this.zzd.zzv(zzeg.zzE(2, zzadVar.zzz, zzadVar.zzA))) {
                List zzax = zzax(zzqkVar, zzadVar, false, this.zzd);
                if (zzax.isEmpty()) {
                    return 129;
                }
                if (zzav) {
                    zzqf zzqfVar = (zzqf) zzax.get(0);
                    boolean zzd = zzqfVar.zzd(zzadVar);
                    if (!zzd) {
                        for (int i3 = 1; i3 < zzax.size(); i3++) {
                            zzqf zzqfVar2 = (zzqf) zzax.get(i3);
                            if (zzqfVar2.zzd(zzadVar)) {
                                zzqfVar = zzqfVar2;
                                z = false;
                                zzd = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i4 = true != zzd ? 3 : 4;
                    int i5 = 8;
                    if (zzd && zzqfVar.zze(zzadVar)) {
                        i5 = 16;
                    }
                    return i4 | i5 | i | (true != zzqfVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
                }
                return WKSRecord.Service.CISCO_FNA;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        int i;
        int i2;
        zzgm zzb = zzqfVar.zzb(zzadVar, zzadVar2);
        int i3 = zzb.zze;
        if (zzaw(zzqfVar, zzadVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqfVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb.zzd;
            i2 = 0;
        }
        return new zzgm(str, zzadVar, zzadVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @z1
    public final zzgm zzS(zziz zzizVar) throws zzgt {
        zzgm zzS = super.zzS(zzizVar);
        this.zzc.zzg(zzizVar.zza, zzS);
        return zzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqb zzV(zzqf zzqfVar, zzad zzadVar, @z1 MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        zzad[] zzJ = zzJ();
        int zzaw = zzaw(zzqfVar, zzadVar);
        if (zzJ.length != 1) {
            for (zzad zzadVar2 : zzJ) {
                if (zzqfVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    zzaw = Math.max(zzaw, zzaw(zzqfVar, zzadVar2));
                }
            }
        }
        this.zze = zzaw;
        String str = zzqfVar.zza;
        int i = zzeg.zza;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzeg.zzc)) {
            String str2 = zzeg.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.zzf = z;
                String str3 = zzqfVar.zzc;
                int i2 = this.zze;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                mediaFormat.setInteger("channel-count", zzadVar.zzz);
                mediaFormat.setInteger("sample-rate", zzadVar.zzA);
                zzdp.zzb(mediaFormat, zzadVar.zzo);
                zzdp.zza(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str4 = zzeg.zzd;
                            if (!"ZTE B2017G".equals(str4)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(zzadVar.zzm)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24 && this.zzd.zza(zzeg.zzE(4, zzadVar.zzz, zzadVar.zzA)) == 2) {
                    mediaFormat.setInteger("pcm-encoding", 4);
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.zzg = ("audio/raw".equals(zzqfVar.zzb) || "audio/raw".equals(zzadVar.zzm)) ? null : zzadVar;
                return zzqb.zza(zzqfVar, mediaFormat, zzadVar, null);
            }
        }
        z = false;
        this.zzf = z;
        String str32 = zzqfVar.zzc;
        int i22 = this.zze;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", zzadVar.zzz);
        mediaFormat.setInteger("sample-rate", zzadVar.zzA);
        zzdp.zzb(mediaFormat, zzadVar.zzo);
        zzdp.zza(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
        }
        this.zzg = ("audio/raw".equals(zzqfVar.zzb) || "audio/raw".equals(zzadVar.zzm)) ? null : zzadVar;
        return zzqb.zza(zzqfVar, mediaFormat, zzadVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final List zzW(zzqk zzqkVar, zzad zzadVar, boolean z) throws zzqr {
        return zzqx.zzg(zzax(zzqkVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzY(String str, zzqb zzqbVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzaa(zzad zzadVar, @z1 MediaFormat mediaFormat) throws zzgt {
        int zzn;
        int i;
        zzad zzadVar2 = this.zzg;
        int[] iArr = null;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzadVar.zzm)) {
                zzn = zzadVar.zzB;
            } else if (zzeg.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                zzn = mediaFormat.getInteger("pcm-encoding");
            } else {
                zzn = mediaFormat.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzN(zzn);
            zzabVar.zzC(zzadVar.zzC);
            zzabVar.zzD(zzadVar.zzD);
            zzabVar.zzw(mediaFormat.getInteger("channel-count"));
            zzabVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzabVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i = zzadVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzadVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzadVar = zzY;
        }
        try {
            this.zzd.zzd(zzadVar, 0, iArr);
        } catch (zznl e) {
            throw zzbg(e, e.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @t0
    public final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzad(zzgb zzgbVar) {
        if (!this.zzi || zzgbVar.zzf()) {
            return;
        }
        if (Math.abs(zzgbVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgbVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzae() throws zzgt {
        try {
            this.zzd.zzi();
        } catch (zznp e) {
            throw zzbg(e, e.zzc, e.zzb, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean zzaf(long j, long j2, @z1 zzqd zzqdVar, @z1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzadVar) throws zzgt {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zzqdVar);
            zzqdVar.zzn(i, false);
            return true;
        } else if (z) {
            if (zzqdVar != null) {
                zzqdVar.zzn(i, false);
            }
            ((zzqi) this).zza.zzf += i3;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (this.zzd.zzs(byteBuffer, j3, i3)) {
                    if (zzqdVar != null) {
                        zzqdVar.zzn(i, false);
                    }
                    ((zzqi) this).zza.zze += i3;
                    return true;
                }
                return false;
            } catch (zznm e) {
                throw zzbg(e, e.zzc, e.zzb, IronSourceConstants.errorCode_biddingDataException);
            } catch (zznp e2) {
                throw zzbg(e2, zzadVar, e2.zzb, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean zzag(zzad zzadVar) {
        return this.zzd.zzv(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbtVar) {
        this.zzd.zzo(zzbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    @z1
    public final zzjb zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjp
    public final void zzp(int i, @z1 Object obj) throws zzgt {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzi) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjs) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzj) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzt(boolean z, boolean z2) throws zzgt {
        super.zzt(z, z2);
        this.zzc.zzf(((zzqi) this).zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzu(long j, boolean z) throws zzgt {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public final void zzx() {
        zzay();
        this.zzd.zzg();
    }
}