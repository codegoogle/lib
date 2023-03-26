package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.p7700g.p99005.e2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(19)
@TargetApi(19)
/* loaded from: classes2.dex */
public abstract class zzavr extends zzard {
    private static final byte[] zzb = zzazo.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    public zzatn zza;
    private final zzavt zzc;
    private final zzato zzd;
    private final zzato zze;
    private final zzaru zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzart zzi;
    private MediaCodec zzj;
    private zzavp zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzavr(int i, zzavt zzavtVar, zzatt zzattVar, boolean z) {
        super(i);
        zzayz.zze(zzazo.zza >= 16);
        this.zzc = zzavtVar;
        this.zzd = new zzato(0);
        this.zze = new zzato(0);
        this.zzf = new zzaru();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() throws zzarf {
        if (this.zzC == 2) {
            zzY();
            zzW();
            return;
        }
        this.zzG = true;
        zzS();
    }

    private final boolean zzJ() throws zzarf {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzato zzatoVar = this.zzd;
            zzatoVar.zzb = this.zzu[dequeueInputBuffer];
            zzatoVar.zzb();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        } else if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        } else {
            if (this.zzB == 1) {
                for (int i2 = 0; i2 < this.zzi.zzh.size(); i2++) {
                    this.zzd.zzb.put((byte[]) this.zzi.zzh.get(i2));
                }
                this.zzB = 2;
            }
            int position = this.zzd.zzb.position();
            int zzd = zzd(this.zzf, this.zzd, false);
            if (zzd == -3) {
                return false;
            }
            if (zzd == -5) {
                if (this.zzB == 2) {
                    this.zzd.zzb();
                    this.zzB = 1;
                }
                zzQ(this.zzf.zza);
                return true;
            }
            zzato zzatoVar2 = this.zzd;
            if (zzatoVar2.zzf()) {
                if (this.zzB == 2) {
                    zzatoVar2.zzb();
                    this.zzB = 1;
                }
                this.zzF = true;
                if (!this.zzD) {
                    zzI();
                    return false;
                }
                try {
                    if (!this.zzo) {
                        this.zzE = true;
                        this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                        this.zzx = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzarf.zza(e, zza());
                }
            } else if (this.zzH && !zzatoVar2.zzg()) {
                zzatoVar2.zzb();
                if (this.zzB == 2) {
                    this.zzB = 1;
                }
                return true;
            } else {
                this.zzH = false;
                boolean zzi = zzatoVar2.zzi();
                if (this.zzl && !zzi) {
                    ByteBuffer byteBuffer2 = zzatoVar2.zzb;
                    byte[] bArr2 = zzazf.zza;
                    int position2 = byteBuffer2.position();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i5 < position2) {
                            int i6 = byteBuffer2.get(i3) & 255;
                            if (i4 == 3) {
                                if (i6 == 1) {
                                    if ((byteBuffer2.get(i5) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer2.duplicate();
                                        duplicate.position(i3 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(duplicate);
                                        break;
                                    }
                                    i6 = 1;
                                }
                            } else if (i6 == 0) {
                                i4++;
                            }
                            if (i6 != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        } else {
                            byteBuffer2.clear();
                            break;
                        }
                    }
                    if (this.zzd.zzb.position() == 0) {
                        return true;
                    }
                    this.zzl = false;
                }
                try {
                    zzato zzatoVar3 = this.zzd;
                    long j = zzatoVar3.zzc;
                    if (zzatoVar3.zze()) {
                        this.zzg.add(Long.valueOf(j));
                    }
                    this.zzd.zzb.flip();
                    zzX(this.zzd);
                    if (zzi) {
                        MediaCodec.CryptoInfo zza = this.zzd.zza.zza();
                        if (position != 0) {
                            if (zza.numBytesOfClearData == null) {
                                zza.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = zza.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.zzj.queueSecureInputBuffer(this.zzx, 0, zza, j, 0);
                    } else {
                        this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j, 0);
                    }
                    this.zzx = -1;
                    this.zzD = true;
                    this.zzB = 0;
                    this.zza.zzc++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzarf.zza(e2, zza());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzD(long j, long j2) throws zzarf {
        boolean zzT;
        int dequeueOutputBuffer;
        boolean z;
        if (this.zzG) {
            zzS();
            return;
        }
        if (this.zzi == null) {
            this.zze.zzb();
            int zzd = zzd(this.zzf, this.zze, true);
            if (zzd != -5) {
                if (zzd == -4) {
                    zzayz.zze(this.zze.zzf());
                    this.zzF = true;
                    zzI();
                    return;
                }
                return;
            }
            zzQ(this.zzf.zza);
        }
        zzW();
        if (this.zzj != null) {
            zzazm.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (this.zzq && this.zzE) {
                        try {
                            dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.zzy = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.zzh;
                            if ((bufferInfo.flags & 4) != 0) {
                                zzI();
                                this.zzy = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.zzh;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z = false;
                                    break;
                                } else if (((Long) this.zzg.get(i)).longValue() == j3) {
                                    this.zzg.remove(i);
                                    z = true;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            this.zzz = z;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzR(this.zzj, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzI();
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i2 = this.zzy;
                        ByteBuffer byteBuffer2 = byteBufferArr[i2];
                        MediaCodec.BufferInfo bufferInfo3 = this.zzh;
                        zzT = zzT(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i3 = this.zzy;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i3];
                    MediaCodec.BufferInfo bufferInfo4 = this.zzh;
                    zzT = zzT(j, j2, mediaCodec2, byteBuffer3, i3, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.zzz);
                }
                if (!zzT) {
                    break;
                }
                long j4 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            do {
            } while (zzJ());
            zzazm.zzb();
        } else {
            zzx(j);
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, false);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzayz.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public boolean zzE() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public boolean zzF() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzarz
    public final int zzG(zzart zzartVar) throws zzarf {
        try {
            return zzH(this.zzc, zzartVar);
        } catch (zzavw e) {
            throw zzarf.zza(e, zza());
        }
    }

    public abstract int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw;

    public zzavp zzM(zzavt zzavtVar, zzart zzartVar, boolean z) throws zzavw {
        return zzawb.zzc(zzartVar.zzf, false);
    }

    public abstract void zzO(zzavp zzavpVar, MediaCodec mediaCodec, zzart zzartVar, MediaCrypto mediaCrypto) throws zzavw;

    public void zzP(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.zzk == r0.zzk) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzQ(zzart zzartVar) throws zzarf {
        zzart zzartVar2 = this.zzi;
        this.zzi = zzartVar;
        if (!zzazo.zzo(zzartVar.zzi, zzartVar2 == null ? null : zzartVar2.zzi) && this.zzi.zzi != null) {
            throw zzarf.zza(new IllegalStateException("Media requires a DrmSessionManager"), zza());
        }
        MediaCodec mediaCodec = this.zzj;
        boolean z = true;
        if (mediaCodec == null || !zzZ(mediaCodec, this.zzk.zzb, zzartVar2, this.zzi)) {
            if (this.zzD) {
                this.zzC = 1;
                return;
            }
            zzY();
            zzW();
            return;
        }
        this.zzA = true;
        this.zzB = 1;
        if (this.zzn) {
            zzart zzartVar3 = this.zzi;
            if (zzartVar3.zzj == zzartVar2.zzj) {
            }
        }
        z = false;
        this.zzs = z;
    }

    public void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        throw null;
    }

    public void zzS() throws zzarf {
    }

    public abstract boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzarf;

    public final MediaCodec zzU() {
        return this.zzj;
    }

    public final zzavp zzV() {
        return this.zzk;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzW() throws zzarf {
        zzart zzartVar;
        boolean z;
        if (this.zzj != null || (zzartVar = this.zzi) == null) {
            return;
        }
        zzavp zzavpVar = this.zzk;
        if (zzavpVar == null) {
            try {
                zzavpVar = zzM(this.zzc, zzartVar, false);
                this.zzk = zzavpVar;
                if (zzavpVar == null) {
                    throw zzarf.zza(new zzavq(this.zzi, (Throwable) null, false, -49999), zza());
                }
            } catch (zzavw e) {
                throw zzarf.zza(new zzavq(this.zzi, (Throwable) e, false, -49998), zza());
            }
        }
        if (!zzaa(zzavpVar)) {
            return;
        }
        String str = this.zzk.zza;
        zzart zzartVar2 = this.zzi;
        int i = zzazo.zza;
        this.zzl = i < 21 && zzartVar2.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
        this.zzm = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && zzazo.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
        try {
            if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str2 = zzazo.zzb;
                if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                    z = true;
                    this.zzn = z;
                    this.zzo = i > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                    this.zzp = (i > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(zzazo.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                    this.zzq = i != 21 && "OMX.google.aac.decoder".equals(str);
                    this.zzr = i > 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzazm.zza("createCodec:" + str);
                    this.zzj = MediaCodec.createByCodecName(str);
                    zzazm.zzb();
                    zzazm.zza("configureCodec");
                    zzO(this.zzk, this.zzj, this.zzi, null);
                    zzazm.zzb();
                    zzazm.zza("startCodec");
                    this.zzj.start();
                    zzazm.zzb();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    zzP(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.zzu = this.zzj.getInputBuffers();
                    this.zzv = this.zzj.getOutputBuffers();
                    this.zzw = zzb() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzx = -1;
                    this.zzy = -1;
                    this.zzH = true;
                    this.zza.zza++;
                    return;
                }
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            zzazm.zza("createCodec:" + str);
            this.zzj = MediaCodec.createByCodecName(str);
            zzazm.zzb();
            zzazm.zza("configureCodec");
            zzO(this.zzk, this.zzj, this.zzi, null);
            zzazm.zzb();
            zzazm.zza("startCodec");
            this.zzj.start();
            zzazm.zzb();
            long elapsedRealtime22 = SystemClock.elapsedRealtime();
            zzP(str, elapsedRealtime22, elapsedRealtime22 - elapsedRealtime3);
            this.zzu = this.zzj.getInputBuffers();
            this.zzv = this.zzj.getOutputBuffers();
            this.zzw = zzb() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zza.zza++;
            return;
        } catch (Exception e2) {
            throw zzarf.zza(new zzavq(this.zzi, (Throwable) e2, false, str), zza());
        }
        z = false;
        this.zzn = z;
        this.zzo = i > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
        this.zzp = (i > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(zzazo.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
        this.zzq = i != 21 && "OMX.google.aac.decoder".equals(str);
        this.zzr = i > 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public void zzX(zzato zzatoVar) {
    }

    public void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean zzZ(MediaCodec mediaCodec, boolean z, zzart zzartVar, zzart zzartVar2) {
        return false;
    }

    public boolean zzaa(zzavp zzavpVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarz
    public final int zze() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public void zzn() {
        this.zzi = null;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public void zzo(boolean z) throws zzarf {
        this.zza = new zzatn();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public void zzp(long j, boolean z) throws zzarf {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (!this.zzm && (!this.zzp || !this.zzE)) {
                if (this.zzC != 0) {
                    zzY();
                    zzW();
                } else {
                    this.zzj.flush();
                    this.zzD = false;
                }
            } else {
                zzY();
                zzW();
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }
}