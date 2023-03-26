package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzatf extends zzavr implements zzazd {
    private final zzasp zzb;
    private final zzatb zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzatf(zzavt zzavtVar, zzatt zzattVar, boolean z, Handler handler, zzasq zzasqVar) {
        super(1, zzavtVar, null, true);
        this.zzc = new zzatb(null, new zzasi[0], new zzate(this, null));
        this.zzb = new zzasp(handler, zzasqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw {
        int i;
        int i2;
        String str = zzartVar.zzf;
        if (zzaze.zza(str)) {
            int i3 = zzazo.zza;
            int i4 = i3 >= 21 ? 16 : 0;
            zzavp zzc = zzawb.zzc(str, false);
            if (zzc == null) {
                return 1;
            }
            int i5 = 2;
            if (i3 < 21 || (((i = zzartVar.zzs) == -1 || zzc.zzd(i)) && ((i2 = zzartVar.zzr) == -1 || zzc.zzc(i2)))) {
                i5 = 3;
            }
            return i4 | 4 | i5;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzJ() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzK(zzarx zzarxVar) {
        return this.zzc.zzd(zzarxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final zzavp zzM(zzavt zzavtVar, zzart zzartVar, boolean z) throws zzavw {
        return super.zzM(zzavtVar, zzartVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzavr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzO(zzavp zzavpVar, MediaCodec mediaCodec, zzart zzartVar, MediaCrypto mediaCrypto) {
        String str = zzavpVar.zza;
        boolean z = true;
        if (zzazo.zza < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzazo.zzc)) {
            String str2 = zzazo.zzb;
            if (!str2.startsWith("zeroflte")) {
                if (!str2.startsWith("herolte")) {
                }
            }
            this.zzd = z;
            mediaCodec.configure(zzartVar.zzb(), (Surface) null, (MediaCrypto) null, 0);
        }
        z = false;
        this.zzd = z;
        mediaCodec.configure(zzartVar.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzQ(zzart zzartVar) throws zzarf {
        super.zzQ(zzartVar);
        this.zzb.zzg(zzartVar);
        this.zze = "audio/raw".equals(zzartVar.zzf) ? zzartVar.zzt : 2;
        this.zzf = zzartVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzasv e) {
            throw zzarf.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzS() throws zzarf {
        try {
            this.zzc.zzi();
        } catch (zzata e) {
            throw zzarf.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzarf {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            ((zzavr) this).zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (this.zzc.zzm(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                ((zzavr) this).zza.zzd++;
                return true;
            }
            return false;
        } catch (zzasw | zzata e) {
            throw zzarf.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzary
    public final zzazd zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarh
    public final void zzl(int i, Object obj) throws zzarf {
        if (i != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzn();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzo(boolean z) throws zzarf {
        super.zzo(z);
        this.zzb.zzf(((zzavr) this).zza);
        int i = zzg().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzp(long j, boolean z) throws zzarf {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzq() {
        this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzr() {
        this.zzc.zzg();
    }
}