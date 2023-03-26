package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzazx extends zzavr {
    private int zzA;
    private final Context zzb;
    private final zzazz zzc;
    private final zzbah zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzart[] zzg;
    private zzazw zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazx(Context context, zzavt zzavtVar, long j, Handler handler, zzbai zzbaiVar, int i) {
        super(2, zzavtVar, null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzazz(context);
        this.zzd = new zzbah(handler, zzbaiVar);
        if (zzazo.zza <= 22 && "foster".equals(zzazo.zzb) && "NVIDIA".equals(zzazo.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private static int zzN(zzart zzartVar) {
        int i = zzartVar.zzm;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zzd(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private final void zzad() {
        int i = this.zzv;
        int i2 = this.zzr;
        if (i == i2 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzh(i2, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzae() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzh(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private static boolean zzaf(long j) {
        return j < -30000;
    }

    private final boolean zzag(boolean z) {
        return zzazo.zza >= 23 && (!z || zzazu.zzb(this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzF() {
        Surface surface;
        if (super.zzF() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzU() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        } else if (this.zzl == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzl) {
                return true;
            }
            this.zzl = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw {
        boolean z;
        int i;
        int i2;
        String str = zzartVar.zzf;
        if (zzaze.zzb(str)) {
            zzats zzatsVar = zzartVar.zzi;
            if (zzatsVar != null) {
                z = false;
                for (int i3 = 0; i3 < zzatsVar.zza; i3++) {
                    z |= zzatsVar.zza(i3).zzc;
                }
            } else {
                z = false;
            }
            zzavp zzc = zzawb.zzc(str, z);
            if (zzc == null) {
                return 1;
            }
            boolean zze = zzc.zze(zzartVar.zzc);
            if (zze && (i = zzartVar.zzj) > 0 && (i2 = zzartVar.zzk) > 0) {
                if (zzazo.zza >= 21) {
                    zze = zzc.zzf(i, i2, zzartVar.zzl);
                } else {
                    zze = i * i2 <= zzawb.zza();
                    if (!zze) {
                        String str2 = zzazo.zze;
                    }
                }
            }
            return (true != zze ? 2 : 3) | (true != zzc.zzb ? 4 : 8) | (true == zzc.zzc ? 16 : 0);
        }
        return 0;
    }

    public final void zzI() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    public final void zzJ(MediaCodec mediaCodec, int i, long j) {
        zzad();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzazm.zzb();
        ((zzavr) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    @TargetApi(21)
    public final void zzK(MediaCodec mediaCodec, int i, long j, long j2) {
        zzad();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzazm.zzb();
        ((zzavr) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    public final void zzL(MediaCodec mediaCodec, int i, long j) {
        zzazm.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzazm.zzb();
        ((zzavr) this).zza.zze++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzO(zzavp zzavpVar, MediaCodec mediaCodec, zzart zzartVar, MediaCrypto mediaCrypto) throws zzavw {
        char c;
        int i;
        zzart[] zzartVarArr = this.zzg;
        int i2 = zzartVar.zzj;
        int i3 = zzartVar.zzk;
        int i4 = zzartVar.zzg;
        if (i4 == -1) {
            String str = zzartVar.zzf;
            if (i2 != -1 && i3 != -1) {
                int i5 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0 && c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4 || c == 5) {
                                i = i2 * i3;
                                i4 = (i * 3) / (i5 + i5);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzazo.zzd)) {
                        i = zzazo.zzd(i3, 16) * zzazo.zzd(i2, 16) * 256;
                        i5 = 2;
                        i4 = (i * 3) / (i5 + i5);
                    }
                }
                i = i2 * i3;
                i5 = 2;
                i4 = (i * 3) / (i5 + i5);
            }
            i4 = -1;
        }
        int length = zzartVarArr.length;
        zzazw zzazwVar = new zzazw(i2, i3, i4);
        this.zzh = zzazwVar;
        boolean z = this.zze;
        MediaFormat zzb = zzartVar.zzb();
        zzb.setInteger("max-width", zzazwVar.zza);
        zzb.setInteger("max-height", zzazwVar.zzb);
        int i6 = zzazwVar.zzc;
        if (i6 != -1) {
            zzb.setInteger("max-input-size", i6);
        }
        if (z) {
            zzb.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzayz.zze(zzag(zzavpVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzazu.zza(this.zzb, zzavpVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(zzb, this.zzi, (MediaCrypto) null, 0);
        int i7 = zzazo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzP(String str, long j, long j2) {
        this.zzd.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzQ(zzart zzartVar) throws zzarf {
        super.zzQ(zzartVar);
        this.zzd.zzf(zzartVar);
        float f = zzartVar.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.zzq = f;
        this.zzp = zzN(zzartVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzr = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzs = integer2;
        float f = this.zzq;
        this.zzu = f;
        if (zzazo.zza >= 21) {
            int i = this.zzp;
            if (i == 90 || i == 270) {
                int i2 = this.zzr;
                this.zzr = integer2;
                this.zzs = i2;
                this.zzu = 1.0f / f;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzA;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.zzz = j4;
            int i4 = i3 - 1;
            this.zzA = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.zzz;
        if (z) {
            zzL(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.zzi == this.zzj) {
            if (zzaf(j6)) {
                zzL(mediaCodec, i, j5);
                return true;
            }
            return false;
        } else if (!this.zzk) {
            if (zzazo.zza >= 21) {
                zzK(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzJ(mediaCodec, i, j5);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zza = this.zzc.zza(j3, ((j6 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j7 = (zza - nanoTime) / 1000;
            if (zzaf(j7)) {
                zzazm.zza("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                zzazm.zzb();
                zzatn zzatnVar = ((zzavr) this).zza;
                zzatnVar.zzf++;
                this.zzn++;
                int i5 = this.zzo + 1;
                this.zzo = i5;
                zzatnVar.zzg = Math.max(i5, zzatnVar.zzg);
                if (this.zzn == -1) {
                    zzac();
                }
                return true;
            }
            if (zzazo.zza >= 21) {
                if (j7 < 50000) {
                    zzK(mediaCodec, i, j5, zza);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzJ(mediaCodec, i, j5);
                return true;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzX(zzato zzatoVar) {
        int i = zzazo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final boolean zzZ(MediaCodec mediaCodec, boolean z, zzart zzartVar, zzart zzartVar2) {
        if (zzartVar.zzf.equals(zzartVar2.zzf) && zzN(zzartVar) == zzN(zzartVar2)) {
            if (z || (zzartVar.zzj == zzartVar2.zzj && zzartVar.zzk == zzartVar2.zzk)) {
                int i = zzartVar2.zzj;
                zzazw zzazwVar = this.zzh;
                return i <= zzazwVar.zza && zzartVar2.zzk <= zzazwVar.zzb && zzartVar2.zzg <= zzazwVar.zzc;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final boolean zzaa(zzavp zzavpVar) {
        return this.zzi != null || zzag(zzavpVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarh
    public final void zzl(int i, Object obj) throws zzarf {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzavp zzV = zzV();
                    if (zzV != null && zzag(zzV.zzd)) {
                        surface = zzazu.zza(this.zzb, zzV.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi != surface) {
                this.zzi = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec zzU = zzU();
                    if (zzazo.zza >= 23 && zzU != null && surface != null) {
                        zzU.setOutputSurface(surface);
                    } else {
                        zzY();
                        zzW();
                    }
                }
                if (surface != null && surface != this.zzj) {
                    zzae();
                    this.zzk = false;
                    int i2 = zzazo.zza;
                    if (zzb == 2) {
                        this.zzl = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                zzab();
                this.zzk = false;
                int i3 = zzazo.zza;
            } else if (surface == null || surface == this.zzj) {
            } else {
                zzae();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzn() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i = zzazo.zza;
        this.zzc.zzb();
        try {
            super.zzn();
        } finally {
            ((zzavr) this).zza.zza();
            this.zzd.zzc(((zzavr) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzo(boolean z) throws zzarf {
        super.zzo(z);
        int i = zzg().zzb;
        this.zzd.zze(((zzavr) this).zza);
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzp(long j, boolean z) throws zzarf {
        super.zzp(j, z);
        this.zzk = false;
        int i = zzazo.zza;
        this.zzo = 0;
        int i2 = this.zzA;
        if (i2 != 0) {
            this.zzz = this.zzf[i2 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzq() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzr() {
        zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzs(zzart[] zzartVarArr, long j) throws zzarf {
        this.zzg = zzartVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j;
            return;
        }
        int i = this.zzA;
        if (i == 10) {
            long j2 = this.zzf[9];
        } else {
            this.zzA = i + 1;
        }
        this.zzf[this.zzA - 1] = j;
    }
}