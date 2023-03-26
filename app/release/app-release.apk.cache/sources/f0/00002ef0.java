package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.z1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztc implements zzry, zzyu, zzwb, zzwg, zzto {
    private static final Map zzb;
    private static final zzad zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzvz zzM;
    private final zzvv zzN;
    private final Uri zzd;
    private final zzeq zze;
    private final zzpi zzf;
    private final zzsj zzg;
    private final zzpc zzh;
    private final zzsy zzi;
    private final long zzj;
    private final zzst zzl;
    @z1
    private zzrx zzq;
    @z1
    private zzabk zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztb zzx;
    private zzzu zzy;
    private final zzwj zzk = new zzwj("ProgressiveMediaPeriod");
    private final zzcz zzm = new zzcz(zzcx.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsu
        @Override // java.lang.Runnable
        public final void run() {
            zztc.zzz(zztc.this);
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsv
        @Override // java.lang.Runnable
        public final void run() {
            zztc.this.zzC();
        }
    };
    private final Handler zzp = zzeg.zzC(null);
    private zzta[] zzt = new zzta[0];
    private zztp[] zzs = new zztp[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzabVar = new zzab();
        zzabVar.zzH("icy");
        zzabVar.zzS("application/x-icy");
        zzc = zzabVar.zzY();
    }

    public zztc(Uri uri, zzeq zzeqVar, zzst zzstVar, zzpi zzpiVar, zzpc zzpcVar, zzvz zzvzVar, zzsj zzsjVar, zzsy zzsyVar, zzvv zzvvVar, @z1 String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzeqVar;
        this.zzf = zzpiVar;
        this.zzh = zzpcVar;
        this.zzM = zzvzVar;
        this.zzg = zzsjVar;
        this.zzi = zzsyVar;
        this.zzN = zzvvVar;
        this.zzj = i;
        this.zzl = zzstVar;
    }

    private final int zzN() {
        int i = 0;
        for (zztp zztpVar : this.zzs) {
            i += zztpVar.zzc();
        }
        return i;
    }

    public final long zzO() {
        long j = Long.MIN_VALUE;
        for (zztp zztpVar : this.zzs) {
            j = Math.max(j, zztpVar.zzg());
        }
        return j;
    }

    private final zzzy zzP(zzta zztaVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zztaVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzvv zzvvVar = this.zzN;
        zzpi zzpiVar = this.zzf;
        zzpc zzpcVar = this.zzh;
        Objects.requireNonNull(zzpiVar);
        zztp zztpVar = new zztp(zzvvVar, zzpiVar, zzpcVar, null);
        zztpVar.zzu(this);
        int i2 = length + 1;
        zzta[] zztaVarArr = (zzta[]) Arrays.copyOf(this.zzt, i2);
        zztaVarArr[length] = zztaVar;
        this.zzt = (zzta[]) zzeg.zzab(zztaVarArr);
        zztp[] zztpVarArr = (zztp[]) Arrays.copyOf(this.zzs, i2);
        zztpVarArr[length] = zztpVar;
        this.zzs = (zztp[]) zzeg.zzab(zztpVarArr);
        return zztpVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzQ() {
        zzcw.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    private final void zzR(zzsx zzsxVar) {
        long j;
        if (this.zzF == -1) {
            j = zzsxVar.zzm;
            this.zzF = j;
        }
    }

    public final void zzS() {
        zzbl zzc2;
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zztp zztpVar : this.zzs) {
            if (zztpVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzck[] zzckVarArr = new zzck[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzad zzh = this.zzs[i2].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbo.zzg(str);
            boolean z = zzg || zzbo.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzabk zzabkVar = this.zzr;
            if (zzabkVar != null) {
                if (zzg || this.zzt[i2].zzb) {
                    zzbl zzblVar = zzh.zzk;
                    if (zzblVar == null) {
                        zzc2 = new zzbl(zzabkVar);
                    } else {
                        zzc2 = zzblVar.zzc(zzabkVar);
                    }
                    zzab zzb2 = zzh.zzb();
                    zzb2.zzM(zzc2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzabkVar.zza) != -1) {
                    zzab zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzckVarArr[i2] = new zzck(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztb(new zzty(zzckVarArr), zArr);
        this.zzv = true;
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzi(this);
    }

    private final void zzT(int i) {
        zzQ();
        zztb zztbVar = this.zzx;
        boolean[] zArr = zztbVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzad zzb2 = zztbVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbo.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzU(int i) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzp(false);
            }
            zzrx zzrxVar = this.zzq;
            Objects.requireNonNull(zzrxVar);
            zzrxVar.zzg(this);
        }
    }

    private final void zzV() {
        zzev zzevVar;
        long j;
        long j2;
        zzsx zzsxVar = new zzsx(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzcw.zzf(zzW());
            long j3 = this.zzz;
            if (j3 != -9223372036854775807L && this.zzH > j3) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzzu zzzuVar = this.zzy;
            Objects.requireNonNull(zzzuVar);
            zzsx.zzg(zzsxVar, zzzuVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzN();
        long zza = this.zzk.zza(zzsxVar, this, zzvz.zza(this.zzB));
        zzevVar = zzsxVar.zzl;
        zzsj zzsjVar = this.zzg;
        j = zzsxVar.zzb;
        zzrr zzrrVar = new zzrr(j, zzevVar, zzevVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j2 = zzsxVar.zzk;
        zzsjVar.zzl(zzrrVar, 1, -1, null, 0, null, j2, this.zzz);
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzX() {
        return this.zzD || zzW();
    }

    public static /* synthetic */ void zzz(zztc zztcVar) {
        zztcVar.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzB() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzC() {
        if (this.zzL) {
            return;
        }
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    public final /* synthetic */ void zzD(zzzu zzzuVar) {
        this.zzy = this.zzr == null ? zzzuVar : new zzzt(-9223372036854775807L, 0L);
        this.zzz = zzzuVar.zze();
        boolean z = false;
        if (this.zzF == -1 && zzzuVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzzuVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzS();
    }

    public final void zzE() throws IOException {
        this.zzk.zzi(zzvz.zza(this.zzB));
    }

    public final void zzF(int i) throws IOException {
        this.zzs[i].zzm();
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzG(zzwf zzwfVar, long j, long j2, boolean z) {
        zzfr zzfrVar;
        long j3;
        zzev zzevVar;
        long j4;
        long unused;
        zzsx zzsxVar = (zzsx) zzwfVar;
        zzfrVar = zzsxVar.zzd;
        j3 = zzsxVar.zzb;
        zzevVar = zzsxVar.zzl;
        zzrr zzrrVar = new zzrr(j3, zzevVar, zzfrVar.zzh(), zzfrVar.zzi(), j, j2, zzfrVar.zzg());
        unused = zzsxVar.zzb;
        zzsj zzsjVar = this.zzg;
        j4 = zzsxVar.zzk;
        zzsjVar.zzf(zzrrVar, 1, -1, null, 0, null, j4, this.zzz);
        if (z) {
            return;
        }
        zzR(zzsxVar);
        for (zztp zztpVar : this.zzs) {
            zztpVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzrx zzrxVar = this.zzq;
            Objects.requireNonNull(zzrxVar);
            zzrxVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzH(zzwf zzwfVar, long j, long j2) {
        zzfr zzfrVar;
        long j3;
        zzev zzevVar;
        long j4;
        zzzu zzzuVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzzuVar = this.zzy) != null) {
            boolean zzh = zzzuVar.zzh();
            long zzO = zzO();
            long j5 = zzO == Long.MIN_VALUE ? 0L : zzO + gc0.c;
            this.zzz = j5;
            this.zzi.zza(j5, zzh, this.zzA);
        }
        zzsx zzsxVar = (zzsx) zzwfVar;
        zzfrVar = zzsxVar.zzd;
        j3 = zzsxVar.zzb;
        zzevVar = zzsxVar.zzl;
        zzrr zzrrVar = new zzrr(j3, zzevVar, zzfrVar.zzh(), zzfrVar.zzi(), j, j2, zzfrVar.zzg());
        unused = zzsxVar.zzb;
        zzsj zzsjVar = this.zzg;
        j4 = zzsxVar.zzk;
        zzsjVar.zzh(zzrrVar, 1, -1, null, 0, null, j4, this.zzz);
        zzR(zzsxVar);
        this.zzK = true;
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzI() {
        for (zztp zztpVar : this.zzs) {
            zztpVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final void zzJ(zzad zzadVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzK() {
        if (this.zzv) {
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL(final zzzu zzzuVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsw
            @Override // java.lang.Runnable
            public final void run() {
                zztc.this.zzD(zzzuVar);
            }
        });
    }

    public final boolean zzM(int i) {
        return !zzX() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j, zzjw zzjwVar) {
        long j2;
        zzQ();
        if (this.zzy.zzh()) {
            zzzs zzg = this.zzy.zzg(j);
            long j3 = zzg.zza.zzb;
            long j4 = zzg.zzb.zzb;
            long j5 = zzjwVar.zzf;
            if (j5 != 0) {
                j2 = j5;
            } else if (zzjwVar.zzg == 0) {
                return j;
            } else {
                j2 = 0;
            }
            long zzx = zzeg.zzx(j, j2, Long.MIN_VALUE);
            long zzq = zzeg.zzq(j, zzjwVar.zzg, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzx <= j3 && j3 <= zzq;
            z = (zzx > j4 || j4 > zzq) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : zzx;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long j;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzO();
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzN() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j) {
        int i;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzW()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i < length) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzwj zzwjVar = this.zzk;
        if (zzwjVar.zzl()) {
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwjVar.zzh();
            for (zztp zztpVar2 : this.zzs) {
                zztpVar2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.google.android.gms.internal.ads.zzry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzvg zzvgVar;
        int i;
        zzQ();
        zztb zztbVar = this.zzx;
        zzty zztyVar = zztbVar.zza;
        boolean[] zArr3 = zztbVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzvgVarArr.length; i4++) {
            zztq zztqVar = zztqVarArr[i4];
            if (zztqVar != null && (zzvgVarArr[i4] == null || !zArr[i4])) {
                i = ((zzsz) zztqVar).zzb;
                zzcw.zzf(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zztqVarArr[i4] = null;
            }
        }
        if (!this.zzC) {
            if (j == 0) {
                j = 0;
                z = false;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzvgVarArr.length; i5++) {
            if (zztqVarArr[i5] == null && (zzvgVar = zzvgVarArr[i5]) != null) {
                zzcw.zzf(zzvgVar.zzc() == 1);
                zzcw.zzf(zzvgVar.zza(0) == 0);
                int zza = zztyVar.zza(zzvgVar.zze());
                zzcw.zzf(!zArr3[zza]);
                this.zzE++;
                zArr3[zza] = true;
                zztqVarArr[i5] = new zzsz(this, zza);
                zArr2[i5] = true;
                if (!z) {
                    zztp zztpVar = this.zzs[zza];
                    z = (zztpVar.zzy(j, true) || zztpVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zztp[] zztpVarArr = this.zzs;
                int length = zztpVarArr.length;
                while (i3 < length) {
                    zztpVarArr[i3].zzj();
                    i3++;
                }
                this.zzk.zzg();
            } else {
                for (zztp zztpVar2 : this.zzs) {
                    zztpVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i3 < zztqVarArr.length) {
                if (zztqVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    public final int zzg(int i, zziz zzizVar, zzgb zzgbVar, int i2) {
        if (zzX()) {
            return -3;
        }
        zzT(i);
        int zzd = this.zzs[i].zzd(zzizVar, zzgbVar, i2, this.zzK);
        if (zzd == -3) {
            zzU(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzQ();
        return this.zzx.zza;
    }

    public final int zzi(int i, long j) {
        if (zzX()) {
            return 0;
        }
        zzT(i);
        zztp zztpVar = this.zzs[i];
        int zzb2 = zztpVar.zzb(j, this.zzK);
        zztpVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzU(i);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j, boolean z) {
        zzQ();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        zzE();
        if (this.zzK && !this.zzv) {
            throw zzbp.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j) {
        this.zzq = zzrxVar;
        this.zzm.zze();
        zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzV();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzwd zzt(zzwf zzwfVar, long j, long j2, IOException iOException, int i) {
        zzfr zzfrVar;
        long j3;
        zzev zzevVar;
        long j4;
        zzwa zzwaVar;
        long j5;
        zzwd zzb2;
        zzzu zzzuVar;
        boolean z;
        long j6;
        long unused;
        zzsx zzsxVar = (zzsx) zzwfVar;
        zzR(zzsxVar);
        zzfrVar = zzsxVar.zzd;
        j3 = zzsxVar.zzb;
        zzevVar = zzsxVar.zzl;
        zzrr zzrrVar = new zzrr(j3, zzevVar, zzfrVar.zzh(), zzfrVar.zzi(), j, j2, zzfrVar.zzg());
        j4 = zzsxVar.zzk;
        Throwable th = new zzwa(zzrrVar, new zzrw(1, -1, null, 0, null, zzeg.zzz(j4), zzeg.zzz(this.zzz)), iOException, i).zzc;
        if (!(th instanceof zzbp) && !(th instanceof FileNotFoundException) && !(th instanceof zzfi) && !(th instanceof zzwi)) {
            while (th != null) {
                if (!(th instanceof zzer) || ((zzer) th).zza != 2008) {
                    th = th.getCause();
                }
            }
            j5 = Math.min((zzwaVar.zzd - 1) * 1000, (int) un3.f.v);
            if (j5 != -9223372036854775807L) {
                zzb2 = zzwj.zzd;
            } else {
                int zzN = zzN();
                boolean z2 = zzN > this.zzJ;
                if (this.zzF == -1 && ((zzzuVar = this.zzy) == null || zzzuVar.zze() == -9223372036854775807L)) {
                    boolean z3 = this.zzv;
                    if (!z3 || zzX()) {
                        this.zzD = z3;
                        this.zzG = 0L;
                        this.zzJ = 0;
                        for (zztp zztpVar : this.zzs) {
                            zztpVar.zzp(false);
                        }
                        zzsx.zzg(zzsxVar, 0L, 0L);
                    } else {
                        this.zzI = true;
                        zzb2 = zzwj.zzc;
                    }
                } else {
                    this.zzJ = zzN;
                }
                zzb2 = zzwj.zzb(z2, j5);
            }
            z = !zzb2.zzc();
            zzsj zzsjVar = this.zzg;
            j6 = zzsxVar.zzk;
            zzsjVar.zzj(zzrrVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
            if (z) {
                unused = zzsxVar.zzb;
            }
            return zzb2;
        }
        j5 = -9223372036854775807L;
        if (j5 != -9223372036854775807L) {
        }
        z = !zzb2.zzc();
        zzsj zzsjVar2 = this.zzg;
        j6 = zzsxVar.zzk;
        zzsjVar2.zzj(zzrrVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
        if (z) {
        }
        return zzb2;
    }

    public final zzzy zzu() {
        return zzP(new zzta(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzzy zzv(int i, int i2) {
        return zzP(new zzta(i, false));
    }
}