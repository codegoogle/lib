package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.p7700g.p99005.wo1;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatb {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzasi[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzatc zza;
    private final zzati zzb;
    private final zzasi[] zzc;
    private final zzasx zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzast zzg;
    private final LinkedList zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzarx zzq;
    private zzarx zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzatb(zzasg zzasgVar, zzasi[] zzasiVarArr, zzasx zzasxVar) {
        this.zzd = zzasxVar;
        if (zzazo.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzazo.zza >= 19) {
            this.zzg = new zzasu();
        } else {
            this.zzg = new zzast(null);
        }
        zzatc zzatcVar = new zzatc();
        this.zza = zzatcVar;
        zzati zzatiVar = new zzati();
        this.zzb = zzatiVar;
        this.zzc = r1;
        System.arraycopy(zzasiVarArr, 0, r1, 2, 0);
        zzasi[] zzasiVarArr2 = {new zzatg(), zzatcVar, zzatiVar};
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzarx.zza;
        this.zzT = -1;
        this.zzN = new zzasi[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList();
    }

    private final long zzp(long j) {
        return (j * this.zzj) / 1000000;
    }

    private final long zzq(long j) {
        return (j * 1000000) / this.zzj;
    }

    private final long zzr() {
        return this.zzn ? this.zzG : this.zzF / this.zzE;
    }

    private final void zzs(long j) throws zzata {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzO[i - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzasi.zza;
                }
            }
            if (i == length) {
                zzz(byteBuffer, j);
            } else {
                zzasi zzasiVar = this.zzN[i];
                zzasiVar.zzf(byteBuffer);
                ByteBuffer zzc = zzasiVar.zzc();
                this.zzO[i] = zzc;
                if (zzc.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    private final void zzt() {
        ArrayList arrayList = new ArrayList();
        zzasi[] zzasiVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzasi zzasiVar = zzasiVarArr[i];
            if (zzasiVar.zzi()) {
                arrayList.add(zzasiVar);
            } else {
                zzasiVar.zzd();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzasi[]) arrayList.toArray(new zzasi[size]);
        this.zzO = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzasi zzasiVar2 = this.zzN[i2];
            zzasiVar2.zzd();
            this.zzO[i2] = zzasiVar2.zzc();
        }
    }

    private final void zzu() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final void zzv() {
        if (zzx()) {
            if (zzazo.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f = this.zzM;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzw() throws zzata {
        boolean z;
        int i;
        zzasi[] zzasiVarArr;
        if (this.zzT == -1) {
            this.zzT = this.zzn ? this.zzN.length : 0;
            z = true;
            i = this.zzT;
            zzasiVarArr = this.zzN;
            if (i < zzasiVarArr.length) {
                zzasi zzasiVar = zzasiVarArr[i];
                if (z) {
                    zzasiVar.zze();
                }
                zzs(-9223372036854775807L);
                if (!zzasiVar.zzj()) {
                    return false;
                }
                this.zzT++;
                z = true;
                i = this.zzT;
                zzasiVarArr = this.zzN;
                if (i < zzasiVarArr.length) {
                    ByteBuffer byteBuffer = this.zzQ;
                    if (byteBuffer != null) {
                        zzz(byteBuffer, -9223372036854775807L);
                        if (this.zzQ != null) {
                            return false;
                        }
                    }
                    this.zzT = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.zzT;
            zzasiVarArr = this.zzN;
            if (i < zzasiVarArr.length) {
            }
        }
    }

    private final boolean zzx() {
        return this.zzi != null;
    }

    private final boolean zzy() {
        int i;
        return zzazo.zza < 23 && ((i = this.zzm) == 5 || i == 6);
    }

    private final boolean zzz(ByteBuffer byteBuffer, long j) throws zzata {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzQ;
            if (byteBuffer2 != null) {
                zzayz.zzc(byteBuffer2 == byteBuffer);
            } else {
                this.zzQ = byteBuffer;
                if (zzazo.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzR;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzR = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzR, 0, remaining);
                    byteBuffer.position(position);
                    this.zzS = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzazo.zza < 21) {
                int zza = this.zzo - ((int) (this.zzF - (this.zzg.zza() * this.zzE)));
                if (zza > 0) {
                    write = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzS += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzi.write(byteBuffer, remaining2, 1);
            }
            this.zzY = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.zzn;
                if (!z) {
                    this.zzF += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.zzG += this.zzH;
                    }
                    this.zzQ = null;
                    return true;
                }
                return false;
            }
            throw new zzata(write);
        }
        return true;
    }

    public final long zza(boolean z) {
        long zzb;
        long j;
        long j2;
        zzarx zzarxVar;
        long j3;
        long j4;
        if (!zzx() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zzb2 = this.zzg.zzb();
            if (zzb2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i = this.zzu;
                    jArr[i] = zzb2 - nanoTime;
                    this.zzu = (i + 1) % 10;
                    int i2 = this.zzv;
                    if (i2 < 10) {
                        this.zzv = i2 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzv;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzw = (this.zzf[i3] / i4) + this.zzw;
                        i3++;
                    }
                }
                if (!zzy() && nanoTime - this.zzz >= 500000) {
                    boolean zzh = this.zzg.zzh();
                    this.zzy = zzh;
                    if (zzh) {
                        long zzd = this.zzg.zzd() / 1000;
                        long zzc = this.zzg.zzc();
                        if (zzd < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzd - nanoTime) > 5000000) {
                            this.zzy = false;
                        } else if (Math.abs(zzq(zzc) - zzb2) > 5000000) {
                            this.zzy = false;
                        }
                    }
                    Method method = this.zzA;
                    if (method != null && !this.zzn) {
                        try {
                            long intValue = (((Integer) method.invoke(this.zzi, null)).intValue() * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzL = max;
                            if (max > 5000000) {
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            zzb = zzq(this.zzg.zzc() + zzp(nanoTime2 - (this.zzg.zzd() / 1000)));
        } else {
            zzb = this.zzv == 0 ? this.zzg.zzb() : nanoTime2 + this.zzw;
            if (!z) {
                zzb -= this.zzL;
            }
        }
        long j5 = this.zzJ;
        while (!this.zzh.isEmpty()) {
            j2 = ((zzasz) this.zzh.getFirst()).zzc;
            if (zzb < j2) {
                break;
            }
            zzasz zzaszVar = (zzasz) this.zzh.remove();
            zzarxVar = zzaszVar.zza;
            this.zzr = zzarxVar;
            j3 = zzaszVar.zzc;
            this.zzt = j3;
            j4 = zzaszVar.zzb;
            this.zzs = j4 - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j = (zzb + this.zzs) - this.zzt;
        } else {
            if (this.zzh.isEmpty()) {
                zzati zzatiVar = this.zzb;
                if (zzatiVar.zzn() >= 1024) {
                    j = zzazo.zzj(zzb - this.zzt, zzatiVar.zzm(), zzatiVar.zzn()) + this.zzs;
                }
            }
            j = ((long) (this.zzr.zzb * (zzb - this.zzt))) + this.zzs;
        }
        return j5 + j;
    }

    public final zzarx zzc() {
        return this.zzr;
    }

    public final zzarx zzd(zzarx zzarxVar) {
        if (this.zzn) {
            zzarx zzarxVar2 = zzarx.zza;
            this.zzr = zzarxVar2;
            return zzarxVar2;
        }
        float zzl = this.zzb.zzl(zzarxVar.zzb);
        this.zzb.zzk(1.0f);
        zzarx zzarxVar3 = new zzarx(zzl, 1.0f);
        zzarx zzarxVar4 = this.zzq;
        if (zzarxVar4 == null) {
            if (!this.zzh.isEmpty()) {
                zzarxVar4 = ((zzasz) this.zzh.getLast()).zza;
            } else {
                zzarxVar4 = this.zzr;
            }
        }
        if (!zzarxVar3.equals(zzarxVar4)) {
            if (zzx()) {
                this.zzq = zzarxVar3;
            } else {
                this.zzr = zzarxVar3;
            }
        }
        return this.zzr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(String str, int i, int i2, int i3, int i4, int[] iArr) throws zzasv {
        int i5;
        int i6;
        int i7;
        this.zzB = zzazo.zzi(i3, i);
        this.zza.zzk(iArr);
        zzasi[] zzasiVarArr = this.zzc;
        boolean z = false;
        for (int i8 = 0; i8 < 3; i8++) {
            zzasi zzasiVar = zzasiVarArr[i8];
            try {
                z |= zzasiVar.zzh(i2, i, i3);
                if (zzasiVar.zzi()) {
                    i = zzasiVar.zza();
                    zzasiVar.zzb();
                    i3 = 2;
                }
            } catch (zzash e) {
                throw new zzasv(e);
            }
        }
        if (z) {
            zzt();
        }
        int i9 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = zzare.zza;
                break;
            default:
                throw new zzasv(wo1.l("Unsupported channel count: ", i));
        }
        int i10 = zzazo.zza;
        if (i10 <= 23 && "foster".equals(zzazo.zzb) && "NVIDIA".equals(zzazo.zzc)) {
            if (i != 3 && i != 5) {
                if (i == 7) {
                    i9 = zzare.zza;
                }
            }
            if (i10 <= 25) {
                "fugu".equals(zzazo.zzb);
            }
            if (z && zzx() && this.zzl == i3 && this.zzj == i2 && this.zzk == i9) {
                return;
            }
            zzk();
            this.zzl = i3;
            this.zzn = false;
            this.zzj = i2;
            this.zzk = i9;
            this.zzm = 2;
            this.zzE = zzazo.zzi(2, i);
            int minBufferSize = AudioTrack.getMinBufferSize(i2, i9, this.zzm);
            zzayz.zze(minBufferSize != -2);
            i6 = minBufferSize * 4;
            long zzp = zzp(250000L);
            int i11 = this.zzE;
            i7 = ((int) zzp) * i11;
            int max = (int) Math.max(minBufferSize, zzp(750000L) * i11);
            if (i6 >= i7) {
                i6 = i7;
            } else if (i6 > max) {
                i6 = max;
            }
            this.zzo = i6;
            this.zzp = zzq(i6 / this.zzE);
            zzd(this.zzr);
        }
        i9 = i5;
        if (i10 <= 25) {
        }
        if (z) {
        }
        zzk();
        this.zzl = i3;
        this.zzn = false;
        this.zzj = i2;
        this.zzk = i9;
        this.zzm = 2;
        this.zzE = zzazo.zzi(2, i);
        int minBufferSize2 = AudioTrack.getMinBufferSize(i2, i9, this.zzm);
        zzayz.zze(minBufferSize2 != -2);
        i6 = minBufferSize2 * 4;
        long zzp2 = zzp(250000L);
        int i112 = this.zzE;
        i7 = ((int) zzp2) * i112;
        int max2 = (int) Math.max(minBufferSize2, zzp(750000L) * i112);
        if (i6 >= i7) {
        }
        this.zzo = i6;
        this.zzp = zzq(i6 / this.zzE);
        zzd(this.zzr);
    }

    public final void zzf() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final void zzg() {
        this.zzV = false;
        if (zzx()) {
            zzu();
            this.zzg.zzf();
        }
    }

    public final void zzh() {
        this.zzV = true;
        if (zzx()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzi() throws zzata {
        if (!this.zzU && zzx() && zzw()) {
            this.zzg.zze(zzr());
            this.zzU = true;
        }
    }

    public final void zzj() {
        zzk();
        zzasi[] zzasiVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzasiVarArr[i].zzg();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    public final void zzk() {
        zzarx zzarxVar;
        if (zzx()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzarx zzarxVar2 = this.zzq;
            if (zzarxVar2 != null) {
                this.zzr = zzarxVar2;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                zzarxVar = ((zzasz) this.zzh.getLast()).zza;
                this.zzr = zzarxVar;
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i = 0;
            while (true) {
                zzasi[] zzasiVarArr = this.zzN;
                if (i >= zzasiVarArr.length) {
                    break;
                }
                zzasi zzasiVar = zzasiVarArr[i];
                zzasiVar.zzd();
                this.zzO[i] = zzasiVar.zzc();
                i++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzu();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zzg(null, false);
            this.zze.close();
            new zzasr(this, audioTrack).start();
        }
    }

    public final void zzl(float f) {
        if (this.zzM != f) {
            this.zzM = f;
            zzv();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j) throws zzasw, zzata {
        int i;
        zzasp zzaspVar;
        zzasp zzaspVar2;
        ByteBuffer byteBuffer2 = this.zzP;
        zzayz.zzc(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzx()) {
            this.zze.block();
            int i2 = this.zzW;
            if (i2 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i2);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    zzaspVar2 = ((zzate) this.zzd).zza.zzb;
                    zzaspVar2.zzb(audioSessionId);
                }
                this.zzg.zzg(this.zzi, zzy());
                zzv();
                this.zzX = false;
                if (this.zzV) {
                    zzh();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzasw(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzy()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zza() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zzn = zzn();
        this.zzX = zzn;
        if (z && !zzn && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.zzY;
            zzasx zzasxVar = this.zzd;
            int i3 = this.zzo;
            long zzb = zzare.zzb(this.zzp);
            zzaspVar = ((zzate) zzasxVar).zza.zzb;
            zzaspVar.zzc(i3, zzb, elapsedRealtime - j2);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i4 = this.zzm;
                if (i4 == 7 || i4 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i4 == 5) {
                    int i5 = zzasf.zza;
                    i = 1536;
                } else if (i4 == 6) {
                    i = zzasf.zza(byteBuffer);
                } else {
                    throw new IllegalStateException(wo1.l("Unexpected audio encoding: ", i4));
                }
                this.zzH = i;
            }
            if (this.zzq != null) {
                if (!zzw()) {
                    return false;
                }
                this.zzh.add(new zzasz(this.zzq, Math.max(0L, j), zzq(zzr()), null));
                this.zzq = null;
                zzt();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j);
                this.zzI = 1;
            } else {
                long zzq = this.zzJ + zzq(this.zzn ? this.zzD : this.zzC / this.zzB);
                if (this.zzI == 1 && Math.abs(zzq - j) > 200000) {
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ = (j - zzq) + this.zzJ;
                    this.zzI = 1;
                    ((zzate) this.zzd).zza.zzh = true;
                }
            }
            if (this.zzn) {
                this.zzD += this.zzH;
            } else {
                this.zzC += byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzz(this.zzP, j);
        } else {
            zzs(j);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final boolean zzn() {
        if (zzx()) {
            if (zzr() > this.zzg.zza()) {
                return true;
            }
            if (zzy() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzo() {
        return !zzx() || (this.zzU && !zzn());
    }
}