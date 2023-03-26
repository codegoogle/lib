package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.xbill.DNS.Flags;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzqi extends zzgk {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Flags.CD, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    @z1
    private ArrayDeque zzB;
    @z1
    private zzqh zzC;
    @z1
    private zzqf zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    @z1
    private zzpy zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    @z1
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    public zzgl zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    @z1
    private zzpj zzan;
    @z1
    private zzpj zzao;
    private final zzqc zzc;
    private final zzqk zzd;
    private final float zze;
    private final zzgb zzf;
    private final zzgb zzg;
    private final zzgb zzh;
    private final zzpx zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    @z1
    private zzad zzp;
    @z1
    private zzad zzq;
    @z1
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    @z1
    private zzqd zzw;
    @z1
    private zzad zzx;
    @z1
    private MediaFormat zzy;
    private boolean zzz;

    public zzqi(int i, zzqc zzqcVar, zzqk zzqkVar, boolean z, float f) {
        super(i);
        this.zzc = zzqcVar;
        Objects.requireNonNull(zzqkVar);
        this.zzd = zzqkVar;
        this.zze = f;
        this.zzf = new zzgb(0, 0);
        this.zzg = new zzgb(0, 0);
        this.zzh = new zzgb(2, 0);
        zzpx zzpxVar = new zzpx();
        this.zzi = zzpxVar;
        this.zzj = new zzed(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzpxVar.zzi(0);
        zzpxVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzgt {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    @e2(23)
    private final void zzaA() throws zzgt {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, 6006);
        }
    }

    @TargetApi(23)
    private final boolean zzaB() throws zzgt {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaC() throws zzgt {
        zzqd zzqdVar = this.zzw;
        boolean z = 0;
        if (zzqdVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzqdVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zziz zzh = zzh();
            try {
                int zzbf = zzbf(zzh, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh);
                    return true;
                }
                zzgb zzgbVar = this.zzg;
                if (zzgbVar.zzg()) {
                    if (this.zzZ == 2) {
                        zzgbVar.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbg(e, this.zzp, false, zzeg.zzl(e.getErrorCode()));
                    }
                } else if (!this.zzac && !zzgbVar.zzh()) {
                    zzgbVar.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                } else {
                    boolean zzk = zzgbVar.zzk();
                    if (zzk) {
                        zzgbVar.zza.zzb(position);
                    }
                    if (this.zzF && !zzk) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzzo.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 < position2) {
                                int i5 = byteBuffer.get(i2) & 255;
                                if (i3 == 3) {
                                    if (i5 == 1) {
                                        if ((byteBuffer.get(i4) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i2 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i5 = 1;
                                    }
                                } else if (i5 == 0) {
                                    i3++;
                                }
                                if (i5 != 0) {
                                    i3 = 0;
                                }
                                i2 = i4;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgb zzgbVar2 = this.zzg;
                    long j = zzgbVar2.zzd;
                    zzpy zzpyVar = this.zzO;
                    if (zzpyVar != null) {
                        j = zzpyVar.zzb(this.zzp, zzgbVar2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j2));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j2, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j2);
                    this.zzg.zzj();
                    zzgb zzgbVar3 = this.zzg;
                    if (zzgbVar3.zze()) {
                        zzam(zzgbVar3);
                    }
                    zzad(this.zzg);
                    try {
                        if (zzk) {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                        } else {
                            this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                        }
                        zzay();
                        this.zzac = true;
                        this.zzZ = 0;
                        zzgl zzglVar = this.zza;
                        z = zzglVar.zzc + 1;
                        zzglVar.zzc = z;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzbg(e2, this.zzp, z, zzeg.zzl(e2.getErrorCode()));
                    }
                }
            } catch (zzga e3) {
                zzX(e3);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzgt {
        zziz zzh = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh, this.zzf, i | 4);
        if (zzbf == -5) {
            zzS(zzh);
            return true;
        } else if (zzbf == -4 && this.zzf.zzg()) {
            this.zzah = true;
            zzax();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaF(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaG(zzad zzadVar) throws zzgt {
        if (zzeg.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbe() != 0) {
            float zzP = zzP(this.zzv, zzadVar, zzJ());
            float f = this.zzA;
            if (f == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP);
                this.zzw.zzp(bundle);
                this.zzA = zzP;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    public static boolean zzav(zzad zzadVar) {
        return zzadVar.zzF == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0190, code lost:
        if ("stvm8".equals(r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a0, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaw(zzqf zzqfVar, MediaCrypto mediaCrypto) throws Exception {
        MediaCodec createByCodecName;
        zzpq zzqzVar;
        int i;
        boolean z;
        boolean z2;
        String str;
        String str2 = zzqfVar.zza;
        int i2 = zzeg.zza;
        float zzP = i2 < 23 ? -1.0f : zzP(this.zzv, this.zzp, zzJ());
        float f = zzP > this.zze ? zzP : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzqb zzV = zzV(zzqfVar, this.zzp, null, f);
        if (i2 >= 31) {
            zzqg.zza(zzV, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str2);
            if (i2 >= 23 && i2 >= 31) {
                int zzb2 = zzbo.zzb(zzV.zzc.zzm);
                "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeg.zzN(zzb2));
                zzqzVar = new zzpo(zzb2, false).zzc(zzV);
            } else {
                try {
                    zzqf zzqfVar2 = zzV.zza;
                    Objects.requireNonNull(zzqfVar2);
                    String str3 = zzqfVar2.zza;
                    Trace.beginSection("createCodec:".concat(String.valueOf(str3)));
                    createByCodecName = MediaCodec.createByCodecName(str3);
                    Trace.endSection();
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Trace.beginSection("configureCodec");
                    createByCodecName.configure(zzV.zzb, zzV.zzd, (MediaCrypto) null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    createByCodecName.start();
                    Trace.endSection();
                    zzqzVar = new zzqz(createByCodecName, null);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            }
            this.zzw = zzqzVar;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.zzD = zzqfVar;
            this.zzA = f;
            this.zzx = this.zzp;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str4 = zzeg.zzd;
                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                    i = 2;
                    this.zzE = i;
                    this.zzF = i2 >= 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzG = i2 != 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
                    this.zzH = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                        if (i2 <= 19) {
                            String str5 = zzeg.zzb;
                            if (!"hb2000".equals(str5)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str2)) {
                            }
                        }
                        z = false;
                        this.zzI = z;
                        this.zzJ = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                        if (i2 < 21 && "OMX.SEC.mp3.dec".equals(str2) && "samsung".equals(zzeg.zzc)) {
                            str = zzeg.zzb;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z2 = true;
                                this.zzK = z2;
                                String str6 = zzqfVar.zza;
                                this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str6)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
                                this.zzw.zzr();
                                if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
                                    this.zzO = new zzpy();
                                }
                                if (zzbe() == 2) {
                                    this.zzP = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.zza.zza++;
                                zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                        }
                        z2 = false;
                        this.zzK = z2;
                        String str62 = zzqfVar.zza;
                        this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str62)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str62) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str62))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
                        this.zzw.zzr();
                        if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
                        }
                        if (zzbe() == 2) {
                        }
                        this.zza.zza++;
                        zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z = true;
                    this.zzI = z;
                    this.zzJ = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                        str = zzeg.zzb;
                        if (!str.startsWith("baffin")) {
                        }
                        z2 = true;
                        this.zzK = z2;
                        String str622 = zzqfVar.zza;
                        this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str622)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str622) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str622))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
                        this.zzw.zzr();
                        if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
                        }
                        if (zzbe() == 2) {
                        }
                        this.zza.zza++;
                        zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z2 = false;
                    this.zzK = z2;
                    String str6222 = zzqfVar.zza;
                    this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str6222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6222))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
                    this.zzw.zzr();
                    if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
                    }
                    if (zzbe() == 2) {
                    }
                    this.zza.zza++;
                    zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                String str7 = zzeg.zzb;
                if ("flounder".equals(str7) || "flounder_lte".equals(str7) || "grouper".equals(str7) || "tilapia".equals(str7)) {
                    i = 1;
                    this.zzE = i;
                    this.zzF = i2 >= 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzG = i2 != 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
                    this.zzH = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23) {
                    }
                    if (i2 <= 19) {
                    }
                    z = false;
                    this.zzI = z;
                    this.zzJ = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                    }
                    z2 = false;
                    this.zzK = z2;
                    String str62222 = zzqfVar.zza;
                    this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str62222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str62222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str62222))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
                    this.zzw.zzr();
                    if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
                    }
                    if (zzbe() == 2) {
                    }
                    this.zza.zza++;
                    zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i = 0;
            this.zzE = i;
            this.zzF = i2 >= 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.zzG = i2 != 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2));
            this.zzH = i2 != 29 && "c2.android.aac.decoder".equals(str2);
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z = false;
            this.zzI = z;
            this.zzJ = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
            if (i2 < 21) {
            }
            z2 = false;
            this.zzK = z2;
            String str622222 = zzqfVar.zza;
            this.zzN = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str622222)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str622222) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str622222))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqfVar.zzf);
            this.zzw.zzr();
            if ("c2.android.mp3.decoder".equals(zzqfVar.zza)) {
            }
            if (zzbe() == 2) {
            }
            this.zza.zza++;
            zzY(str2, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @TargetApi(23)
    private final void zzax() throws zzgt {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaA();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    public void zzD(float f, float f2) throws zzgt {
        this.zzu = f;
        this.zzv = f2;
        zzaG(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:124|(5:(6:126|(1:216)(2:130|131)|(2:133|(2:135|(1:156)(1:141))(3:157|158|(1:165)(0)))(2:166|(1:168)(2:169|(12:175|(1:177)|178|(2:180|(2:184|(1:186)))|187|(1:(2:189|(2:192|193)(1:191))(2:210|211))|194|(1:196)(1:209)|197|(1:201)|(1:203)(2:205|(1:207))|204)(2:173|174)))|142|143|(2:146|147)(1:145))|(3:219|220|(6:222|223|224|225|226|(3:228|229|(2:232|233)(3:231|143|(0)(0)))(2:235|236)))|261|262|(0)(0))|217|258|259|260) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0260, code lost:
        if (r15.zzq != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x032d, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030e A[LOOP:2: B:72:0x0139->B:180:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e A[Catch: IllegalStateException -> 0x034f, TryCatch #0 {IllegalStateException -> 0x034f, blocks: (B:177:0x0307, B:182:0x0318, B:184:0x031e, B:186:0x0324, B:173:0x02ef, B:175:0x0301, B:193:0x0335), top: B:227:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // com.google.android.gms.internal.ads.zzjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzL(long j, long j2) throws zzgt {
        zzqi zzqiVar;
        char c;
        int i;
        StackTraceElement[] stackTrace;
        long j3;
        zzqd zzqdVar;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zzaf;
        long j4;
        int zzb2;
        boolean z;
        ?? r13;
        zzqi zzqiVar2 = this;
        boolean z2 = true;
        boolean z3 = false;
        try {
            if (zzqiVar2.zzai) {
                zzae();
                return;
            }
            int i3 = 2;
            if (zzqiVar2.zzp == null && !zzqiVar2.zzaE(2)) {
                return;
            }
            zzan();
            if (zzqiVar2.zzV) {
                int i4 = zzeg.zza;
                Trace.beginSection("bypassRender");
                while (true) {
                    zzcw.zzf(zzqiVar2.zzai ^ z2);
                    zzpx zzpxVar = zzqiVar2.zzi;
                    if (zzpxVar.zzp()) {
                        try {
                            if (!zzaf(j, j2, null, zzpxVar.zzb, zzqiVar2.zzR, 0, zzpxVar.zzl(), zzpxVar.zzd, zzpxVar.zzf(), zzpxVar.zzg(), zzqiVar2.zzq)) {
                                zzqiVar2 = this;
                                break;
                            }
                            zzqiVar2 = this;
                            zzqiVar2.zzao(zzqiVar2.zzi.zzm());
                            zzqiVar2.zzi.zzb();
                        } catch (IllegalStateException e) {
                            e = e;
                            c = 0;
                            zzqiVar = this;
                            i = zzeg.zza;
                            if (i >= 21) {
                            }
                            stackTrace = e.getStackTrace();
                            if (stackTrace.length > 0) {
                            }
                            throw e;
                        }
                    }
                    if (!zzqiVar2.zzah) {
                        z2 = true;
                        if (zzqiVar2.zzW) {
                            zzcw.zzf(zzqiVar2.zzi.zzo(zzqiVar2.zzh));
                            r13 = 0;
                            zzqiVar2.zzW = false;
                        } else {
                            r13 = 0;
                        }
                        if (zzqiVar2.zzX) {
                            if (!zzqiVar2.zzi.zzp()) {
                                zzT();
                                zzqiVar2.zzX = r13;
                                zzan();
                                if (!zzqiVar2.zzV) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        zzcw.zzf(!zzqiVar2.zzah);
                        zziz zzh = zzh();
                        zzqiVar2.zzh.zzb();
                        while (true) {
                            zzqiVar2.zzh.zzb();
                            int zzbf = zzqiVar2.zzbf(zzh, zzqiVar2.zzh, r13);
                            if (zzbf == -5) {
                                zzqiVar2.zzS(zzh);
                                break;
                            } else if (zzbf != -4) {
                                break;
                            } else if (!zzqiVar2.zzh.zzg()) {
                                if (zzqiVar2.zzaj) {
                                    zzad zzadVar = zzqiVar2.zzp;
                                    Objects.requireNonNull(zzadVar);
                                    zzqiVar2.zzq = zzadVar;
                                    zzqiVar2.zzaa(zzadVar, null);
                                    zzqiVar2.zzaj = r13;
                                }
                                zzqiVar2.zzh.zzj();
                                if (!zzqiVar2.zzi.zzo(zzqiVar2.zzh)) {
                                    zzqiVar2.zzW = true;
                                    break;
                                }
                            } else {
                                zzqiVar2.zzah = true;
                                break;
                            }
                        }
                        zzpx zzpxVar2 = zzqiVar2.zzi;
                        if (zzpxVar2.zzp()) {
                            zzpxVar2.zzj();
                        }
                        if (!zzqiVar2.zzi.zzp() && !zzqiVar2.zzah && !zzqiVar2.zzX) {
                            break;
                        }
                    } else {
                        zzqiVar2.zzai = true;
                        break;
                    }
                }
                Trace.endSection();
                zzqiVar = zzqiVar2;
                c = 0;
            } else {
                try {
                    if (zzqiVar2.zzw != null) {
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int i5 = zzeg.zza;
                            Trace.beginSection("drainAndFeed");
                            while (true) {
                                try {
                                    if (!zzaD()) {
                                        if (zzqiVar2.zzJ && zzqiVar2.zzad) {
                                            try {
                                                zzb2 = zzqiVar2.zzw.zzb(zzqiVar2.zzl);
                                            } catch (IllegalStateException unused) {
                                                zzax();
                                                if (zzqiVar2.zzai) {
                                                    zzap();
                                                }
                                                j4 = elapsedRealtime;
                                                zzqiVar = zzqiVar2;
                                                c = 0;
                                                while (zzaC()) {
                                                    while (zzaC()) {
                                                    }
                                                }
                                                Trace.endSection();
                                                zzqiVar.zza.zza();
                                            }
                                        } else {
                                            zzb2 = zzqiVar2.zzw.zzb(zzqiVar2.zzl);
                                        }
                                        if (zzb2 >= 0) {
                                            if (zzqiVar2.zzM) {
                                                zzqiVar2.zzM = z3;
                                                zzqiVar2.zzw.zzn(zzb2, z3);
                                            } else {
                                                MediaCodec.BufferInfo bufferInfo2 = zzqiVar2.zzl;
                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                    zzax();
                                                    break;
                                                }
                                                zzqiVar2.zzR = zzb2;
                                                ByteBuffer zzg = zzqiVar2.zzw.zzg(zzb2);
                                                zzqiVar2.zzS = zzg;
                                                if (zzg != null) {
                                                    zzg.position(zzqiVar2.zzl.offset);
                                                    ByteBuffer byteBuffer2 = zzqiVar2.zzS;
                                                    MediaCodec.BufferInfo bufferInfo3 = zzqiVar2.zzl;
                                                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                                                }
                                                if (zzqiVar2.zzK) {
                                                    MediaCodec.BufferInfo bufferInfo4 = zzqiVar2.zzl;
                                                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                                                        long j5 = zzqiVar2.zzaf;
                                                        if (j5 != -9223372036854775807L) {
                                                            bufferInfo4.presentationTimeUs = j5;
                                                        }
                                                    }
                                                }
                                                long j6 = zzqiVar2.zzl.presentationTimeUs;
                                                int size = zzqiVar2.zzk.size();
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 >= size) {
                                                        z = false;
                                                        break;
                                                    } else if (((Long) zzqiVar2.zzk.get(i6)).longValue() == j6) {
                                                        zzqiVar2.zzk.remove(i6);
                                                        z = true;
                                                        break;
                                                    } else {
                                                        i6++;
                                                    }
                                                }
                                                zzqiVar2.zzT = z;
                                                long j7 = zzqiVar2.zzag;
                                                long j8 = zzqiVar2.zzl.presentationTimeUs;
                                                zzqiVar2.zzU = j7 == j8;
                                                zzad zzadVar2 = (zzad) zzqiVar2.zzj.zzc(j8);
                                                if (zzadVar2 == null && zzqiVar2.zzz) {
                                                    zzadVar2 = (zzad) zzqiVar2.zzj.zzb();
                                                }
                                                if (zzadVar2 != null) {
                                                    zzqiVar2.zzq = zzadVar2;
                                                } else if (zzqiVar2.zzz) {
                                                }
                                                zzqiVar2.zzaa(zzqiVar2.zzq, zzqiVar2.zzy);
                                                zzqiVar2.zzz = z3;
                                            }
                                        } else if (zzb2 == -2) {
                                            zzqiVar2.zzae = z2;
                                            MediaFormat zzc = zzqiVar2.zzw.zzc();
                                            if (zzqiVar2.zzE != 0 && zzc.getInteger("width") == 32 && zzc.getInteger("height") == 32) {
                                                zzqiVar2.zzM = z2;
                                            } else {
                                                zzqiVar2.zzy = zzc;
                                                zzqiVar2.zzz = z2;
                                            }
                                        } else if (zzqiVar2.zzN && (zzqiVar2.zzah || zzqiVar2.zzaa == i3)) {
                                            zzax();
                                        }
                                        j4 = elapsedRealtime;
                                        zzqiVar = zzqiVar2;
                                        c = 0;
                                        if (zzqiVar.zzaF(j4)) {
                                            break;
                                        }
                                        zzqiVar2 = zzqiVar;
                                        elapsedRealtime = j4;
                                        i3 = 2;
                                        z3 = false;
                                        z2 = true;
                                    }
                                    if (zzqiVar2.zzJ) {
                                        try {
                                            if (zzqiVar2.zzad) {
                                                try {
                                                    zzqd zzqdVar2 = zzqiVar2.zzw;
                                                    ByteBuffer byteBuffer3 = zzqiVar2.zzS;
                                                    int i7 = zzqiVar2.zzR;
                                                    MediaCodec.BufferInfo bufferInfo5 = zzqiVar2.zzl;
                                                    j3 = elapsedRealtime;
                                                    c = 0;
                                                    try {
                                                        zzaf = zzaf(j, j2, zzqdVar2, byteBuffer3, i7, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, zzqiVar2.zzT, zzqiVar2.zzU, zzqiVar2.zzq);
                                                        if (zzaf) {
                                                            zzqiVar = this;
                                                            break;
                                                        }
                                                        zzqiVar = this;
                                                        zzqiVar.zzao(zzqiVar.zzl.presentationTimeUs);
                                                        int i8 = zzqiVar.zzl.flags;
                                                        zzaz();
                                                        if ((i8 & 4) != 0) {
                                                            zzax();
                                                            break;
                                                        } else {
                                                            j4 = j3;
                                                            if (zzqiVar.zzaF(j4)) {
                                                            }
                                                        }
                                                    } catch (IllegalStateException unused2) {
                                                        try {
                                                            zzax();
                                                            zzqiVar2 = this;
                                                            if (zzqiVar2.zzai) {
                                                                zzap();
                                                            }
                                                            zzqiVar = zzqiVar2;
                                                            j4 = j3;
                                                            while (zzaC()) {
                                                            }
                                                            Trace.endSection();
                                                            zzqiVar.zza.zza();
                                                        } catch (IllegalStateException e2) {
                                                            e = e2;
                                                            zzqiVar = this;
                                                            i = zzeg.zza;
                                                            if (i >= 21) {
                                                            }
                                                            stackTrace = e.getStackTrace();
                                                            if (stackTrace.length > 0) {
                                                            }
                                                            throw e;
                                                        }
                                                    }
                                                } catch (IllegalStateException unused3) {
                                                    j3 = elapsedRealtime;
                                                    c = 0;
                                                }
                                            }
                                        } catch (IllegalStateException e3) {
                                            e = e3;
                                            c = 0;
                                            zzqiVar = zzqiVar2;
                                            i = zzeg.zza;
                                            if (i >= 21 || !(e instanceof MediaCodec.CodecException)) {
                                                stackTrace = e.getStackTrace();
                                                if (stackTrace.length > 0 || !stackTrace[c].getClassName().equals("android.media.MediaCodec")) {
                                                    throw e;
                                                }
                                            }
                                            zzqiVar.zzX(e);
                                            boolean z4 = i >= 21 && (e instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e).isRecoverable();
                                            if (z4) {
                                                zzap();
                                            }
                                            throw zzqiVar.zzbg(zzqiVar.zzak(e, zzqiVar.zzD), zzqiVar.zzp, z4, 4003);
                                        }
                                    }
                                    zzaf = zzaf(j, j2, zzqdVar, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, zzqiVar2.zzT, zzqiVar2.zzU, zzqiVar2.zzq);
                                    if (zzaf) {
                                    }
                                } catch (IllegalStateException e4) {
                                    e = e4;
                                    zzqiVar = this;
                                    i = zzeg.zza;
                                    if (i >= 21) {
                                    }
                                    stackTrace = e.getStackTrace();
                                    if (stackTrace.length > 0) {
                                    }
                                    throw e;
                                }
                                j3 = elapsedRealtime;
                                c = 0;
                                zzqdVar = zzqiVar2.zzw;
                                byteBuffer = zzqiVar2.zzS;
                                i2 = zzqiVar2.zzR;
                                bufferInfo = zzqiVar2.zzl;
                            }
                            j4 = j3;
                            while (zzaC() && zzqiVar.zzaF(j4)) {
                            }
                            Trace.endSection();
                        } catch (IllegalStateException e5) {
                            e = e5;
                            zzqiVar = zzqiVar2;
                            c = 0;
                        }
                    } else {
                        zzqiVar = zzqiVar2;
                        c = 0;
                        zzqiVar.zza.zzd += zzd(j);
                        try {
                            zzqiVar.zzaE(1);
                        } catch (IllegalStateException e6) {
                            e = e6;
                            i = zzeg.zza;
                            if (i >= 21) {
                            }
                            stackTrace = e.getStackTrace();
                            if (stackTrace.length > 0) {
                            }
                            throw e;
                        }
                    }
                } catch (IllegalStateException e7) {
                    e = e7;
                }
            }
            zzqiVar.zza.zza();
        } catch (IllegalStateException e8) {
            e = e8;
            zzqiVar = zzqiVar2;
            c = 0;
            i = zzeg.zza;
            if (i >= 21) {
            }
            stackTrace = e.getStackTrace();
            if (stackTrace.length > 0) {
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final int zzO(zzad zzadVar) throws zzgt {
        try {
            return zzQ(this.zzd, zzadVar);
        } catch (zzqr e) {
            throw zzbg(e, zzadVar, false, 4002);
        }
    }

    public float zzP(float f, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    public abstract int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr;

    public zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (zzaB() == false) goto L28;
     */
    @t0
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgm zzS(zziz zzizVar) throws zzgt {
        int i;
        boolean z = true;
        this.zzaj = true;
        zzad zzadVar = zzizVar.zza;
        Objects.requireNonNull(zzadVar);
        if (zzadVar.zzm == null) {
            throw zzbg(new IllegalArgumentException(), zzadVar, false, 4005);
        }
        zzpj zzpjVar = zzizVar.zzb;
        this.zzao = zzpjVar;
        this.zzp = zzadVar;
        if (this.zzV) {
            this.zzX = true;
            return null;
        }
        zzqd zzqdVar = this.zzw;
        if (zzqdVar == null) {
            this.zzB = null;
            zzan();
            return null;
        }
        zzqf zzqfVar = this.zzD;
        zzad zzadVar2 = this.zzx;
        zzpj zzpjVar2 = this.zzan;
        if (zzpjVar2 == zzpjVar) {
            zzcw.zzf(zzpjVar == zzpjVar2 || zzeg.zza >= 23);
            zzgm zzR = zzR(zzqfVar, zzadVar2, zzadVar);
            int i2 = zzR.zzd;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (zzaG(zzadVar)) {
                        this.zzx = zzadVar;
                        if (zzpjVar == zzpjVar2) {
                            if (this.zzac) {
                                this.zzaa = 1;
                                if (this.zzG || this.zzI) {
                                    this.zzab = 3;
                                    i = 2;
                                } else {
                                    this.zzab = 1;
                                }
                            }
                        }
                    }
                    i = 16;
                } else if (i2 != 2) {
                    if (zzaG(zzadVar)) {
                        this.zzx = zzadVar;
                        if (zzpjVar != zzpjVar2) {
                        }
                    }
                    i = 16;
                } else {
                    if (zzaG(zzadVar)) {
                        this.zzY = true;
                        this.zzZ = 1;
                        int i3 = this.zzE;
                        if (i3 != 2 && (i3 != 1 || zzadVar.zzr != zzadVar2.zzr || zzadVar.zzs != zzadVar2.zzs)) {
                            z = false;
                        }
                        this.zzL = z;
                        this.zzx = zzadVar;
                        if (zzpjVar != zzpjVar2) {
                        }
                    }
                    i = 16;
                }
                return (zzR.zzd != 0 || (this.zzw == zzqdVar && this.zzab != 3)) ? zzR : new zzgm(zzqfVar.zza, zzadVar2, zzadVar, 0, i);
            }
            zzU();
            i = 0;
            if (zzR.zzd != 0) {
            }
        }
        if (zzpjVar != null && zzpjVar2 != null && zzeg.zza >= 23) {
            UUID uuid = zzm.zze;
            UUID uuid2 = zzm.zza;
            if (!uuid.equals(uuid2)) {
                uuid.equals(uuid2);
            }
        }
        zzU();
        return new zzgm(zzqfVar.zza, zzadVar2, zzadVar, 0, 128);
    }

    public abstract zzqb zzV(zzqf zzqfVar, zzad zzadVar, @z1 MediaCrypto mediaCrypto, float f);

    public abstract List zzW(zzqk zzqkVar, zzad zzadVar, boolean z) throws zzqr;

    public void zzX(Exception exc) {
        throw null;
    }

    public void zzY(String str, zzqb zzqbVar, long j, long j2) {
        throw null;
    }

    public void zzZ(String str) {
        throw null;
    }

    public void zzaa(zzad zzadVar, @z1 MediaFormat mediaFormat) throws zzgt {
        throw null;
    }

    public void zzac() {
    }

    public void zzad(zzgb zzgbVar) throws zzgt {
        throw null;
    }

    public void zzae() throws zzgt {
    }

    public abstract boolean zzaf(long j, long j2, @z1 zzqd zzqdVar, @z1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzadVar) throws zzgt;

    public boolean zzag(zzad zzadVar) {
        return false;
    }

    public final float zzah() {
        return this.zzu;
    }

    public final long zzai() {
        return this.zzal;
    }

    @z1
    public final zzqd zzaj() {
        return this.zzw;
    }

    public zzqe zzak(Throwable th, @z1 zzqf zzqfVar) {
        return new zzqe(th, zzqfVar);
    }

    @z1
    public final zzqf zzal() {
        return this.zzD;
    }

    public void zzam(zzgb zzgbVar) throws zzgt {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1 A[Catch: zzqh -> 0x0114, TryCatch #2 {zzqh -> 0x0114, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00cf, B:59:0x00f1, B:61:0x00fa, B:64:0x0103, B:65:0x0105, B:60:0x00f4, B:66:0x0106, B:68:0x0109, B:69:0x0113, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00cd, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4 A[Catch: zzqh -> 0x0114, TryCatch #2 {zzqh -> 0x0114, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00cf, B:59:0x00f1, B:61:0x00fa, B:64:0x0103, B:65:0x0105, B:60:0x00f4, B:66:0x0106, B:68:0x0109, B:69:0x0113, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00cd, B:49:0x00bd), top: B:78:0x0065, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzan() throws zzgt {
        zzad zzadVar;
        zzqh zzqhVar;
        if (this.zzw != null || this.zzV || (zzadVar = this.zzp) == null) {
            return;
        }
        if (this.zzao == null && zzag(zzadVar)) {
            zzad zzadVar2 = this.zzp;
            zzT();
            String str = zzadVar2.zzm;
            if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                this.zzi.zzn(1);
            } else {
                this.zzi.zzn(32);
            }
            this.zzV = true;
            return;
        }
        zzpj zzpjVar = this.zzao;
        this.zzan = zzpjVar;
        zzad zzadVar3 = this.zzp;
        String str2 = zzadVar3.zzm;
        if (zzpjVar != null && zzpk.zza) {
            zzpa zza = zzpjVar.zza();
            throw zzbg(zza, this.zzp, false, zza.zza);
        }
        try {
            if (this.zzB == null) {
                try {
                    List zzW = zzW(this.zzd, zzadVar3, false);
                    zzW.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!zzW.isEmpty()) {
                        this.zzB.add((zzqf) zzW.get(0));
                    }
                    this.zzC = null;
                } catch (zzqr e) {
                    throw new zzqh(this.zzp, (Throwable) e, false, -49998);
                }
            }
            if (!this.zzB.isEmpty()) {
                zzqf zzqfVar = (zzqf) this.zzB.peekFirst();
                while (this.zzw == null) {
                    zzqf zzqfVar2 = (zzqf) this.zzB.peekFirst();
                    if (!zzau(zzqfVar2)) {
                        return;
                    }
                    try {
                        zzaw(zzqfVar2, null);
                    } catch (Exception e2) {
                        if (zzqfVar2 == zzqfVar) {
                            try {
                                Thread.sleep(50L);
                                zzaw(zzqfVar2, null);
                            } catch (Exception e3) {
                                zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqfVar2)), e3);
                                this.zzB.removeFirst();
                                zzqh zzqhVar2 = new zzqh(this.zzp, (Throwable) e3, false, zzqfVar2);
                                zzX(zzqhVar2);
                                zzqhVar = this.zzC;
                                if (zzqhVar != null) {
                                    this.zzC = zzqhVar2;
                                } else {
                                    this.zzC = zzqh.zza(zzqhVar, zzqhVar2);
                                }
                                if (!this.zzB.isEmpty()) {
                                    throw this.zzC;
                                }
                            }
                        } else {
                            throw e2;
                            break;
                        }
                        zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqfVar2)), e3);
                        this.zzB.removeFirst();
                        zzqh zzqhVar22 = new zzqh(this.zzp, (Throwable) e3, false, zzqfVar2);
                        zzX(zzqhVar22);
                        zzqhVar = this.zzC;
                        if (zzqhVar != null) {
                        }
                        if (!this.zzB.isEmpty()) {
                        }
                    }
                }
                this.zzB = null;
                return;
            }
            throw new zzqh(this.zzp, (Throwable) null, false, -49999);
        } catch (zzqh e4) {
            throw zzbg(e4, this.zzp, false, 4001);
        }
    }

    @t0
    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzpj, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqd] */
    public final void zzap() {
        try {
            zzqd zzqdVar = this.zzw;
            if (zzqdVar != null) {
                zzqdVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    @t0
    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzpy zzpyVar = this.zzO;
        if (zzpyVar != null) {
            zzpyVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    @t0
    public final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public final boolean zzas() throws zzgt {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    public final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab != 3 && !this.zzG && ((!this.zzH || this.zzae) && (!this.zzI || !this.zzad))) {
            zzab();
            return false;
        }
        zzap();
        return true;
    }

    public boolean zzau(zzqf zzqfVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzju
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzt(boolean z, boolean z2) throws zzgt {
        this.zza = new zzgl();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzu(long j, boolean z) throws zzgt {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzedVar = this.zzj;
        if (zzedVar.zza() > 0) {
            this.zzaj = true;
        }
        zzedVar.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public final void zzy(zzad[] zzadVarArr, long j, long j2) throws zzgt {
        if (this.zzal == -9223372036854775807L) {
            zzcw.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            long j3 = this.zzn[9];
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }
}