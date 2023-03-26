package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.p7700g.p99005.gc0;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawv implements zzawz, zzatx, zzayt, zzaxj {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzaym zzG;
    private final Uri zza;
    private final zzayj zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzaww zze;
    private final zzaxa zzf;
    private final long zzg;
    private final zzawt zzi;
    private zzawy zzo;
    private zzaud zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzaxq zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzayx zzh = new zzayx("Loader:ExtractorMediaPeriod");
    private final zzazb zzj = new zzazb();
    private final Runnable zzk = new zzawo(this);
    private final Runnable zzl = new zzawp(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray zzn = new SparseArray();
    private long zzA = -1;

    public zzawv(Uri uri, zzayj zzayjVar, zzatw[] zzatwVarArr, int i, Handler handler, zzaww zzawwVar, zzaxa zzaxaVar, zzaym zzaymVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzayjVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzawwVar;
        this.zzf = zzaxaVar;
        this.zzG = zzaymVar;
        this.zzg = i2;
        this.zzi = new zzawt(zzatwVarArr, this);
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzaxk) this.zzn.valueAt(i2)).zze();
        }
        return i;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((zzaxk) this.zzn.valueAt(i)).zzg());
        }
        return j;
    }

    private final void zzE(zzaws zzawsVar) {
        long j;
        if (this.zzA == -1) {
            j = zzawsVar.zzj;
            this.zzA = j;
        }
    }

    private final void zzF() {
        zzaud zzaudVar;
        zzaws zzawsVar = new zzaws(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzayz.zze(zzG());
            long j = this.zzw;
            if (j != -9223372036854775807L && this.zzC >= j) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
            zzawsVar.zzd(this.zzp.zzb(this.zzC), this.zzC);
            this.zzC = -9223372036854775807L;
        }
        this.zzD = zzC();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzaudVar = this.zzp) == null || zzaudVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzawsVar, this, i);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzawv zzawvVar) {
        if (zzawvVar.zzF || zzawvVar.zzr || zzawvVar.zzp == null || !zzawvVar.zzq) {
            return;
        }
        int size = zzawvVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (((zzaxk) zzawvVar.zzn.valueAt(i)).zzh() == null) {
                return;
            }
        }
        zzawvVar.zzj.zzb();
        zzaxp[] zzaxpVarArr = new zzaxp[size];
        zzawvVar.zzy = new boolean[size];
        zzawvVar.zzx = new boolean[size];
        zzawvVar.zzw = zzawvVar.zzp.zza();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzart zzh = ((zzaxk) zzawvVar.zzn.valueAt(i2)).zzh();
                zzaxpVarArr[i2] = new zzaxp(zzh);
                String str = zzh.zzf;
                if (!zzaze.zzb(str) && !zzaze.zza(str)) {
                    z = false;
                }
                zzawvVar.zzy[i2] = z;
                zzawvVar.zzz = z | zzawvVar.zzz;
                i2++;
            } else {
                zzawvVar.zzv = new zzaxq(zzaxpVarArr);
                zzawvVar.zzr = true;
                zzawvVar.zzf.zzg(new zzaxo(zzawvVar.zzw, zzawvVar.zzp.zzc()), null);
                zzawvVar.zzo.zzf(zzawvVar);
                return;
            }
        }
    }

    public final boolean zzA(int i) {
        return this.zzE || (!zzG() && ((zzaxk) this.zzn.valueAt(i)).zzm());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
        if (r1 != false) goto L55;
     */
    @Override // com.google.android.gms.internal.ads.zzawz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzB(zzaxu[] zzaxuVarArr, boolean[] zArr, zzaxl[] zzaxlVarArr, boolean[] zArr2, long j) {
        zzaxu zzaxuVar;
        int i;
        zzayz.zze(this.zzr);
        for (int i2 = 0; i2 < zzaxuVarArr.length; i2++) {
            zzaxl zzaxlVar = zzaxlVarArr[i2];
            if (zzaxlVar != null && (zzaxuVarArr[i2] == null || !zArr[i2])) {
                i = ((zzawu) zzaxlVar).zzb;
                zzayz.zze(this.zzx[i]);
                this.zzu--;
                this.zzx[i] = false;
                ((zzaxk) this.zzn.valueAt(i)).zzi();
                zzaxlVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzaxuVarArr.length; i3++) {
            if (zzaxlVarArr[i3] == null && (zzaxuVar = zzaxuVarArr[i3]) != null) {
                zzaxuVar.zzb();
                zzayz.zze(zzaxuVar.zza(0) == 0);
                int zza = this.zzv.zza(zzaxuVar.zzd());
                zzayz.zze(!this.zzx[zza]);
                this.zzu++;
                this.zzx[zza] = true;
                zzaxlVarArr[i3] = new zzawu(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    ((zzaxk) this.zzn.valueAt(i4)).zzi();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            zzayx zzayxVar = this.zzh;
            if (zzayxVar.zzi()) {
                zzayxVar.zzf();
            }
        } else if (!this.zzs) {
            if (j == 0) {
                j = 0;
            }
            j = zzi(j);
            for (int i5 = 0; i5 < zzaxlVarArr.length; i5++) {
                if (zzaxlVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final zzauf zzbi(int i, int i2) {
        zzaxk zzaxkVar = (zzaxk) this.zzn.get(i);
        if (zzaxkVar == null) {
            zzaxk zzaxkVar2 = new zzaxk(this.zzG, null);
            zzaxkVar2.zzk(this);
            this.zzn.put(i, zzaxkVar2);
            return zzaxkVar2;
        }
        return zzaxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zzc = this.zzj.zzc();
        if (this.zzh.zzi()) {
            return zzc;
        }
        zzF();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzc(zzaud zzaudVar) {
        this.zzp = zzaudVar;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ int zzd(zzayv zzayvVar, long j, long j2, IOException iOException) {
        zzaud zzaudVar;
        zzaws zzawsVar = (zzaws) zzayvVar;
        zzE(zzawsVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzawr(this, iOException));
        }
        if (iOException instanceof zzaxr) {
            return 3;
        }
        int zzC = zzC();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzaudVar = this.zzp) == null || zzaudVar.zza() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzaxk) this.zzn.valueAt(i2)).zzj(!this.zzr || this.zzx[i2]);
            }
            zzawsVar.zzd(0L, 0L);
        }
        this.zzD = zzC();
        return zzC <= i ? 0 : 1;
    }

    public final int zze(int i, zzaru zzaruVar, zzato zzatoVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzaxk) this.zzn.valueAt(i)).zzf(zzaruVar, zzatoVar, z, this.zzE, this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        long zzD;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzD = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    zzD = Math.min(zzD, ((zzaxk) this.zzn.valueAt(i)).zzg());
                }
            }
        } else {
            zzD = zzD();
        }
        return zzD == Long.MIN_VALUE ? this.zzB : zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        if (this.zzt) {
            this.zzt = false;
            return this.zzB;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long j) {
        if (true != this.zzp.zzc()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j;
                this.zzE = false;
                zzayx zzayxVar = this.zzh;
                if (zzayxVar.zzi()) {
                    zzayxVar.zzf();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((zzaxk) this.zzn.valueAt(i2)).zzj(this.zzx[i2]);
                    }
                }
            } else if (i >= size) {
                break;
            } else {
                if (this.zzx[i]) {
                    zzG = ((zzaxk) this.zzn.valueAt(i)).zzn(j, false);
                }
                i++;
            }
        }
        this.zzt = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long j) {
    }

    public final void zzr() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzs() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ void zzt(zzayv zzayvVar, long j, long j2, boolean z) {
        zzE((zzaws) zzayvVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzaxk) this.zzn.valueAt(i)).zzj(this.zzx[i]);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ void zzu(zzayv zzayvVar, long j, long j2) {
        zzE((zzaws) zzayvVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD = zzD();
            long j3 = zzD == Long.MIN_VALUE ? 0L : zzD + gc0.c;
            this.zzw = j3;
            this.zzf.zzg(new zzaxo(j3, this.zzp.zzc()), null);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzv(zzart zzartVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawyVar, long j) {
        this.zzo = zzawyVar;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzawq(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    public final void zzy(int i, long j) {
        zzaxk zzaxkVar = (zzaxk) this.zzn.valueAt(i);
        if (this.zzE && j > zzaxkVar.zzg()) {
            zzaxkVar.zzl();
        } else {
            zzaxkVar.zzn(j, true);
        }
    }
}