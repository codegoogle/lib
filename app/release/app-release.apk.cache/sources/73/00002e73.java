package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Pair;
import com.p7700g.p99005.q95;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzom implements zznq {
    private boolean zzA;
    private boolean zzB;
    private long zzC;
    private float zzD;
    private zzmy[] zzE;
    private ByteBuffer[] zzF;
    @z1
    private ByteBuffer zzG;
    private int zzH;
    @z1
    private ByteBuffer zzI;
    private byte[] zzJ;
    private int zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzj zzR;
    private long zzS;
    private boolean zzT;
    private boolean zzU;
    private final zzoc zzV;
    private final zzmv zza;
    private final zznw zzb;
    private final zzox zzc;
    private final zzmy[] zzd;
    private final zzmy[] zze;
    private final ConditionVariable zzf;
    private final zznu zzg;
    private final ArrayDeque zzh;
    private zzok zzi;
    private final zzof zzj;
    private final zzof zzk;
    private final zznz zzl;
    @z1
    private zzmu zzm;
    @z1
    private zznn zzn;
    @z1
    private zzob zzo;
    private zzob zzp;
    @z1
    private AudioTrack zzq;
    private zzi zzr;
    @z1
    private zzoe zzs;
    private zzoe zzt;
    private final zzbt zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private int zzz;

    public /* synthetic */ zzom(zzoa zzoaVar, zzol zzolVar) {
        zzmv zzmvVar;
        zzoc zzocVar;
        zzmvVar = zzoaVar.zzb;
        this.zza = zzmvVar;
        zzocVar = zzoaVar.zzc;
        this.zzV = zzocVar;
        int i = zzeg.zza;
        this.zzl = zzoaVar.zza;
        this.zzf = new ConditionVariable(true);
        this.zzg = new zznu(new zzoh(this, null));
        zznw zznwVar = new zznw();
        this.zzb = zznwVar;
        zzox zzoxVar = new zzox();
        this.zzc = zzoxVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzot(), zznwVar, zzoxVar);
        Collections.addAll(arrayList, zzocVar.zze());
        this.zzd = (zzmy[]) arrayList.toArray(new zzmy[0]);
        this.zze = new zzmy[]{new zzop()};
        this.zzD = 1.0f;
        this.zzr = zzi.zza;
        this.zzQ = 0;
        this.zzR = new zzj(0, 0.0f);
        zzbt zzbtVar = zzbt.zza;
        this.zzt = new zzoe(zzbtVar, false, 0L, 0L, null);
        this.zzu = zzbtVar;
        this.zzL = -1;
        this.zzE = new zzmy[0];
        this.zzF = new ByteBuffer[0];
        this.zzh = new ArrayDeque();
        this.zzj = new zzof(100L);
        this.zzk = new zzof(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzE() {
        zzob zzobVar = this.zzp;
        return zzobVar.zzc == 0 ? this.zzv / zzobVar.zzb : this.zzw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        zzob zzobVar = this.zzp;
        return zzobVar.zzc == 0 ? this.zzx / zzobVar.zzd : this.zzy;
    }

    private final AudioTrack zzG(zzob zzobVar) throws zznm {
        try {
            return zzobVar.zzb(false, this.zzr, this.zzQ);
        } catch (zznm e) {
            zznn zznnVar = this.zzn;
            if (zznnVar != null) {
                zznnVar.zza(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair zzH(zzad zzadVar, zzmv zzmvVar) {
        int i;
        int zzj;
        String str = zzadVar.zzm;
        Objects.requireNonNull(str);
        int zza = zzbo.zza(str, zzadVar.zzj);
        int i2 = 8;
        if (zza != 5 && zza != 6 && zza != 18 && zza != 17 && zza != 7 && zza != 8 && zza != 14) {
            return null;
        }
        if (zza == 18 && !zzmvVar.zza(18)) {
            zza = 6;
        } else if (zza == 8 && !zzmvVar.zza(8)) {
            zza = 7;
        }
        if (!zzmvVar.zza(zza)) {
            return null;
        }
        if (zza == 18) {
            if (zzeg.zza >= 29) {
                int i3 = zzadVar.zzA;
                if (i3 == -1) {
                    i3 = 48000;
                }
                AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
                i = 8;
                while (true) {
                    if (i <= 0) {
                        i = 0;
                        break;
                    } else if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i3).setChannelMask(zzeg.zzj(i)).build(), build)) {
                        break;
                    } else {
                        i--;
                    }
                }
                if (i == 0) {
                    return null;
                }
            } else {
                i = 6;
            }
        } else {
            i = zzadVar.zzz;
            if (i > 8) {
                return null;
            }
        }
        int i4 = zzeg.zza;
        if (i4 <= 28) {
            if (i != 7) {
                if (i == 3 || i == 4 || i == 5) {
                    i2 = 6;
                }
            }
            if (i4 <= 26 && "fugu".equals(zzeg.zzb) && i2 == 1) {
                i2 = 2;
            }
            zzj = zzeg.zzj(i2);
            if (zzj != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(zza), Integer.valueOf(zzj));
        }
        i2 = i;
        if (i4 <= 26) {
            i2 = 2;
        }
        zzj = zzeg.zzj(i2);
        if (zzj != 0) {
        }
    }

    private final zzoe zzI() {
        zzoe zzoeVar = this.zzs;
        return zzoeVar != null ? zzoeVar : !this.zzh.isEmpty() ? (zzoe) this.zzh.getLast() : this.zzt;
    }

    private final void zzJ(long j) {
        zzbt zzbtVar;
        boolean z;
        if (zzU()) {
            zzoc zzocVar = this.zzV;
            zzbtVar = zzI().zza;
            zzocVar.zzc(zzbtVar);
        } else {
            zzbtVar = zzbt.zza;
        }
        zzbt zzbtVar2 = zzbtVar;
        if (zzU()) {
            zzoc zzocVar2 = this.zzV;
            boolean z2 = zzI().zzb;
            zzocVar2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzh.add(new zzoe(zzbtVar2, z, Math.max(0L, j), this.zzp.zza(zzF()), null));
        zzmy[] zzmyVarArr = this.zzp.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmy zzmyVar : zzmyVarArr) {
            if (zzmyVar.zzg()) {
                arrayList.add(zzmyVar);
            } else {
                zzmyVar.zzc();
            }
        }
        int size = arrayList.size();
        this.zzE = (zzmy[]) arrayList.toArray(new zzmy[size]);
        this.zzF = new ByteBuffer[size];
        zzK();
        zznn zznnVar = this.zzn;
        if (zznnVar != null) {
            zzos.zzU(((zzor) zznnVar).zza).zzs(z);
        }
    }

    private final void zzK() {
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzE;
            if (i >= zzmyVarArr.length) {
                return;
            }
            zzmy zzmyVar = zzmyVarArr[i];
            zzmyVar.zzc();
            this.zzF[i] = zzmyVar.zzb();
            i++;
        }
    }

    private final void zzL() {
        if (this.zzp.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzM() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        this.zzg.zzd(zzF());
        this.zzq.stop();
    }

    private final void zzN(long j) throws zznp {
        ByteBuffer byteBuffer;
        int length = this.zzE.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzF[i - 1];
            } else {
                byteBuffer = this.zzG;
                if (byteBuffer == null) {
                    byteBuffer = zzmy.zza;
                }
            }
            if (i == length) {
                zzQ(byteBuffer, j);
            } else {
                zzmy zzmyVar = this.zzE[i];
                if (i > this.zzL) {
                    zzmyVar.zze(byteBuffer);
                }
                ByteBuffer zzb = zzmyVar.zzb();
                this.zzF[i] = zzb;
                if (zzb.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    private final void zzO(zzbt zzbtVar, boolean z) {
        zzoe zzI = zzI();
        if (zzbtVar.equals(zzI.zza) && z == zzI.zzb) {
            return;
        }
        zzoe zzoeVar = new zzoe(zzbtVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzS()) {
            this.zzs = zzoeVar;
        } else {
            this.zzt = zzoeVar;
        }
    }

    private final void zzP() {
        if (zzS()) {
            if (zzeg.zza >= 21) {
                this.zzq.setVolume(this.zzD);
                return;
            }
            AudioTrack audioTrack = this.zzq;
            float f = this.zzD;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzQ(ByteBuffer byteBuffer, long j) throws zznp {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzI;
            if (byteBuffer2 != null) {
                zzcw.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzI = byteBuffer;
                if (zzeg.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzJ;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzJ = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzJ, 0, remaining);
                    byteBuffer.position(position);
                    this.zzK = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i = zzeg.zza;
            if (i < 21) {
                int zza = this.zzg.zza(this.zzx);
                if (zza > 0) {
                    write = this.zzq.write(this.zzJ, this.zzK, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzK += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzq.write(byteBuffer, remaining2, 1);
            }
            this.zzS = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((i < 24 || write != -6) && write != -32) {
                    r0 = false;
                }
                if (r0) {
                    zzL();
                }
                zznp zznpVar = new zznp(write, this.zzp.zza, r0);
                zznn zznnVar = this.zzn;
                if (zznnVar != null) {
                    zznnVar.zza(zznpVar);
                }
                if (!zznpVar.zzb) {
                    this.zzk.zzb(zznpVar);
                    return;
                }
                throw zznpVar;
            }
            this.zzk.zza();
            if (zzT(this.zzq)) {
                long j2 = this.zzy;
                if (j2 > 0) {
                    this.zzU = false;
                }
                if (this.zzO && this.zzn != null && write < remaining2 && !this.zzU) {
                    long zzc = this.zzg.zzc(j2);
                    zzos zzosVar = ((zzor) this.zzn).zza;
                    if (zzos.zzT(zzosVar) != null) {
                        zzos.zzT(zzosVar).zza(zzc);
                    }
                }
            }
            int i2 = this.zzp.zzc;
            if (i2 == 0) {
                this.zzx += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    zzcw.zzf(byteBuffer == this.zzG);
                    this.zzy = (this.zzz * this.zzH) + this.zzy;
                }
                this.zzI = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzR() throws zznp {
        boolean z;
        int i;
        zzmy[] zzmyVarArr;
        if (this.zzL == -1) {
            this.zzL = 0;
            z = true;
            i = this.zzL;
            zzmyVarArr = this.zzE;
            if (i < zzmyVarArr.length) {
                zzmy zzmyVar = zzmyVarArr[i];
                if (z) {
                    zzmyVar.zzd();
                }
                zzN(-9223372036854775807L);
                if (!zzmyVar.zzh()) {
                    return false;
                }
                this.zzL++;
                z = true;
                i = this.zzL;
                zzmyVarArr = this.zzE;
                if (i < zzmyVarArr.length) {
                    ByteBuffer byteBuffer = this.zzI;
                    if (byteBuffer != null) {
                        zzQ(byteBuffer, -9223372036854775807L);
                        if (this.zzI != null) {
                            return false;
                        }
                    }
                    this.zzL = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.zzL;
            zzmyVarArr = this.zzE;
            if (i < zzmyVarArr.length) {
            }
        }
    }

    private final boolean zzS() {
        return this.zzq != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzeg.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        if ("audio/raw".equals(this.zzp.zza.zzm)) {
            int i = this.zzp.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final int zza(zzad zzadVar) {
        if ("audio/raw".equals(zzadVar.zzm)) {
            if (zzeg.zzU(zzadVar.zzB)) {
                return zzadVar.zzB != 2 ? 1 : 2;
            }
            return 0;
        }
        if (!this.zzT) {
            int i = zzeg.zza;
        }
        return zzH(zzadVar, this.zza) != null ? 2 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final long zzb(boolean z) {
        long zzs;
        if (!zzS() || this.zzB) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzg.zzb(z), this.zzp.zza(zzF()));
        while (!this.zzh.isEmpty() && min >= ((zzoe) this.zzh.getFirst()).zzd) {
            this.zzt = (zzoe) this.zzh.remove();
        }
        zzoe zzoeVar = this.zzt;
        long j = min - zzoeVar.zzd;
        if (zzoeVar.zza.equals(zzbt.zza)) {
            zzs = this.zzt.zzc + j;
        } else if (this.zzh.isEmpty()) {
            zzs = this.zzV.zza(j) + this.zzt.zzc;
        } else {
            zzoe zzoeVar2 = (zzoe) this.zzh.getFirst();
            zzs = zzoeVar2.zzc - zzeg.zzs(zzoeVar2.zzd - min, this.zzt.zza.zzc);
        }
        return this.zzp.zza(this.zzV.zzb()) + zzs;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final zzbt zzc() {
        return zzI().zza;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzd(zzad zzadVar, int i, @z1 int[] iArr) throws zznl {
        int i2;
        zzmy[] zzmyVarArr;
        int intValue;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int zzf;
        int[] iArr2;
        if ("audio/raw".equals(zzadVar.zzm)) {
            zzcw.zzd(zzeg.zzU(zzadVar.zzB));
            i3 = zzeg.zzo(zzadVar.zzB, zzadVar.zzz);
            zzmy[] zzmyVarArr2 = this.zzd;
            this.zzc.zzq(zzadVar.zzC, zzadVar.zzD);
            if (zzeg.zza < 21 && zzadVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzb.zzo(iArr2);
            zzmw zzmwVar = new zzmw(zzadVar.zzA, zzadVar.zzz, zzadVar.zzB);
            for (zzmy zzmyVar : zzmyVarArr2) {
                try {
                    zzmw zza = zzmyVar.zza(zzmwVar);
                    if (true == zzmyVar.zzg()) {
                        zzmwVar = zza;
                    }
                } catch (zzmx e) {
                    throw new zznl(e, zzadVar);
                }
            }
            int i7 = zzmwVar.zzd;
            int i8 = zzmwVar.zzb;
            int i9 = zzmwVar.zzc;
            int zzj = zzeg.zzj(i9);
            zzmyVarArr = zzmyVarArr2;
            i5 = zzeg.zzo(i7, i9);
            i4 = i8;
            i2 = 0;
            intValue = i7;
            intValue2 = zzj;
        } else {
            zzmy[] zzmyVarArr3 = new zzmy[0];
            int i10 = zzadVar.zzA;
            int i11 = zzeg.zza;
            Pair zzH = zzH(zzadVar, this.zza);
            if (zzH != null) {
                i2 = 2;
                zzmyVarArr = zzmyVarArr3;
                intValue = ((Integer) zzH.first).intValue();
                i3 = -1;
                intValue2 = ((Integer) zzH.second).intValue();
                i4 = i10;
                i5 = -1;
            } else {
                throw new zznl("Unable to configure passthrough for: ".concat(String.valueOf(zzadVar)), zzadVar);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        zzcw.zzf(minBufferSize != -2);
        int i12 = 250000;
        if (i2 == 0) {
            zzf = zzeg.zzf(minBufferSize * 4, zzoo.zza(250000, i4, i5), zzoo.zza(750000, i4, i5));
        } else if (i2 != 1) {
            int i13 = 5;
            if (intValue == 5) {
                i12 = 500000;
                intValue = 5;
            } else {
                i13 = intValue;
            }
            zzf = zzfto.zza((i12 * zzoo.zzb(intValue)) / 1000000);
            i5 = i5;
            intValue = i13;
        } else {
            zzf = zzfto.zza((zzoo.zzb(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, zzf) + i5) - 1) / i5) * i5;
        if (intValue == 0) {
            throw new zznl("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzadVar), zzadVar);
        } else if (intValue2 != 0) {
            this.zzT = false;
            zzob zzobVar = new zzob(zzadVar, i3, i2, i5, i4, intValue2, intValue, max, zzmyVarArr);
            if (zzS()) {
                this.zzo = zzobVar;
            } else {
                this.zzp = zzobVar;
            }
        } else {
            throw new zznl("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zze() {
        if (zzS()) {
            this.zzv = 0L;
            this.zzw = 0L;
            this.zzx = 0L;
            this.zzy = 0L;
            this.zzU = false;
            this.zzz = 0;
            this.zzt = new zzoe(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzC = 0L;
            this.zzs = null;
            this.zzh.clear();
            this.zzG = null;
            this.zzH = 0;
            this.zzI = null;
            this.zzN = false;
            this.zzM = false;
            this.zzL = -1;
            this.zzc.zzp();
            zzK();
            if (this.zzg.zzi()) {
                this.zzq.pause();
            }
            if (zzT(this.zzq)) {
                zzok zzokVar = this.zzi;
                Objects.requireNonNull(zzokVar);
                zzokVar.zzb(this.zzq);
            }
            AudioTrack audioTrack = this.zzq;
            this.zzq = null;
            if (zzeg.zza < 21 && !this.zzP) {
                this.zzQ = 0;
            }
            zzob zzobVar = this.zzo;
            if (zzobVar != null) {
                this.zzp = zzobVar;
                this.zzo = null;
            }
            this.zzg.zze();
            this.zzf.close();
            new zznx(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzk.zza();
        this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzf() {
        this.zzA = true;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzg() {
        this.zzO = false;
        if (zzS() && this.zzg.zzl()) {
            this.zzq.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzh() {
        this.zzO = true;
        if (zzS()) {
            this.zzg.zzg();
            this.zzq.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzi() throws zznp {
        if (!this.zzM && zzS() && zzR()) {
            zzM();
            this.zzM = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzj() {
        zze();
        for (zzmy zzmyVar : this.zzd) {
            zzmyVar.zzf();
        }
        zzmy[] zzmyVarArr = this.zze;
        int length = zzmyVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzmyVarArr[i].zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzk(zzi zziVar) {
        if (this.zzr.equals(zziVar)) {
            return;
        }
        this.zzr = zziVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzl(int i) {
        if (this.zzQ != i) {
            this.zzQ = i;
            this.zzP = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzm(zzj zzjVar) {
        if (this.zzR.equals(zzjVar)) {
            return;
        }
        int i = zzjVar.zza;
        if (this.zzq != null) {
            int i2 = this.zzR.zza;
        }
        this.zzR = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzn(zznn zznnVar) {
        this.zzn = zznnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzo(zzbt zzbtVar) {
        zzO(new zzbt(zzeg.zza(zzbtVar.zzc, 0.1f, 8.0f), zzeg.zza(zzbtVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzp(@z1 zzmu zzmuVar) {
        this.zzm = zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzq(boolean z) {
        zzO(zzI().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzr(float f) {
        if (this.zzD != f) {
            this.zzD = f;
            zzP();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzs(ByteBuffer byteBuffer, long j, int i) throws zznm, zznp {
        AudioTrack zzG;
        zzmu zzmuVar;
        boolean z;
        int zza;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7;
        ByteBuffer byteBuffer2 = this.zzG;
        boolean z2 = false;
        zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzo != null) {
            if (!zzR()) {
                return false;
            }
            zzob zzobVar = this.zzo;
            zzob zzobVar2 = this.zzp;
            if (zzobVar2.zzc == zzobVar.zzc && zzobVar2.zzg == zzobVar.zzg && zzobVar2.zze == zzobVar.zze && zzobVar2.zzf == zzobVar.zzf && zzobVar2.zzd == zzobVar.zzd) {
                this.zzp = zzobVar;
                this.zzo = null;
                if (zzT(this.zzq)) {
                    this.zzq.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzq;
                    zzad zzadVar = this.zzp.zza;
                    audioTrack.setOffloadDelayPadding(zzadVar.zzC, zzadVar.zzD);
                    this.zzU = true;
                }
            } else {
                zzM();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            zzJ(j);
        }
        if (!zzS()) {
            try {
                this.zzf.block();
                try {
                    zzob zzobVar3 = this.zzp;
                    Objects.requireNonNull(zzobVar3);
                    zzG = zzG(zzobVar3);
                } catch (zznm e) {
                    zzob zzobVar4 = this.zzp;
                    if (zzobVar4.zzh > 1000000) {
                        zzob zzobVar5 = new zzob(zzobVar4.zza, zzobVar4.zzb, zzobVar4.zzc, zzobVar4.zzd, zzobVar4.zze, zzobVar4.zzf, zzobVar4.zzg, q95.a, zzobVar4.zzi);
                        try {
                            zzG = zzG(zzobVar5);
                            this.zzp = zzobVar5;
                        } catch (zznm e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            zzL();
                            throw e;
                        }
                    }
                    zzL();
                    throw e;
                }
                this.zzq = zzG;
                if (zzT(zzG)) {
                    AudioTrack audioTrack2 = this.zzq;
                    if (this.zzi == null) {
                        this.zzi = new zzok(this);
                    }
                    this.zzi.zza(audioTrack2);
                    AudioTrack audioTrack3 = this.zzq;
                    zzad zzadVar2 = this.zzp.zza;
                    audioTrack3.setOffloadDelayPadding(zzadVar2.zzC, zzadVar2.zzD);
                }
                if (zzeg.zza >= 31 && (zzmuVar = this.zzm) != null) {
                    zzny.zza(this.zzq, zzmuVar);
                }
                this.zzQ = this.zzq.getAudioSessionId();
                zznu zznuVar = this.zzg;
                AudioTrack audioTrack4 = this.zzq;
                zzob zzobVar6 = this.zzp;
                zznuVar.zzf(audioTrack4, zzobVar6.zzc == 2, zzobVar6.zzg, zzobVar6.zzd, zzobVar6.zzh);
                zzP();
                int i8 = this.zzR.zza;
                this.zzB = true;
                z2 = false;
            } catch (zznm e3) {
                if (!e3.zzb) {
                    this.zzj.zzb(e3);
                    return false;
                }
                throw e3;
            }
        }
        this.zzj.zza();
        if (this.zzB) {
            this.zzC = Math.max(0L, j);
            this.zzA = z2;
            this.zzB = z2;
            zzJ(j);
            if (this.zzO) {
                zzh();
            }
        }
        if (this.zzg.zzk(zzF())) {
            if (this.zzG == null) {
                zzcw.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                zzob zzobVar7 = this.zzp;
                if (zzobVar7.zzc != 0 && this.zzz == 0) {
                    int i9 = zzobVar7.zzg;
                    switch (i9) {
                        case 5:
                        case 6:
                        case 18:
                            z = true;
                            zza = zzxw.zza(byteBuffer);
                            break;
                        case 7:
                        case 8:
                            int i10 = zzyp.zza;
                            int position = byteBuffer.position();
                            byte b2 = byteBuffer.get(position);
                            if (b2 != -2) {
                                if (b2 == -1) {
                                    i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b = byteBuffer.get(position + 7);
                                } else if (b2 != 31) {
                                    i2 = (byteBuffer.get(position + 4) & 1) << 6;
                                    i6 = byteBuffer.get(position + 5) & 252;
                                    i5 = 2;
                                    i3 = i6 >> i5;
                                } else {
                                    i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b = byteBuffer.get(position + 6);
                                }
                                i2 = i4;
                                i5 = 2;
                                i6 = b & 60;
                                i3 = i6 >> i5;
                            } else {
                                i2 = (byteBuffer.get(position + 5) & 1) << 6;
                                i3 = (byteBuffer.get(position + 4) & 252) >> 2;
                            }
                            int i11 = i3 | i2;
                            z = true;
                            zza = (i11 + 1) * 32;
                            break;
                        case 9:
                            zza = zzzl.zzc(zzeg.zzk(byteBuffer, byteBuffer.position()));
                            if (zza == -1) {
                                throw new IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                        case 16:
                            zza = 1024;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            zza = 2048;
                            z = true;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException(wo1.l("Unexpected audio encoding: ", i9));
                        case 14:
                            int i12 = zzxw.zza;
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i13 = position2;
                            while (true) {
                                if (i13 > limit) {
                                    i7 = -1;
                                } else if ((zzeg.zzk(byteBuffer, i13 + 4) & (-2)) == -126718022) {
                                    i7 = i13 - position2;
                                } else {
                                    i13++;
                                }
                            }
                            if (i7 == -1) {
                                zza = 0;
                            } else {
                                zza = (40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            z = true;
                            break;
                        case 15:
                            zza = 512;
                            z = true;
                            break;
                        case 17:
                            int i14 = zzxz.zza;
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            zza = zzxz.zza(new zzdx(bArr, 16)).zzc;
                            z = true;
                            break;
                    }
                    this.zzz = zza;
                    if (zza == 0) {
                        return z;
                    }
                }
                if (this.zzs != null) {
                    if (!zzR()) {
                        return false;
                    }
                    zzJ(j);
                    this.zzs = null;
                }
                long zzE = (((zzE() - this.zzc.zzo()) * 1000000) / this.zzp.zza.zzA) + this.zzC;
                if (!this.zzA && Math.abs(zzE - j) > 200000) {
                    this.zzn.zza(new zzno(j, zzE));
                    this.zzA = true;
                }
                if (this.zzA) {
                    if (!zzR()) {
                        return false;
                    }
                    long j2 = j - zzE;
                    this.zzC += j2;
                    this.zzA = false;
                    zzJ(j);
                    zznn zznnVar = this.zzn;
                    if (zznnVar != null && j2 != 0) {
                        ((zzor) zznnVar).zza.zzab();
                    }
                }
                if (this.zzp.zzc == 0) {
                    this.zzv += byteBuffer.remaining();
                } else {
                    this.zzw = (this.zzz * i) + this.zzw;
                }
                this.zzG = byteBuffer;
                this.zzH = i;
            }
            zzN(j);
            if (!this.zzG.hasRemaining()) {
                this.zzG = null;
                this.zzH = 0;
                return true;
            } else if (this.zzg.zzj(zzF())) {
                zze();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzt() {
        return zzS() && this.zzg.zzh(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzu() {
        return !zzS() || (this.zzM && !zzt());
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzv(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }
}