package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsq implements zzry, zzrx {
    private final zzry[] zza;
    @z1
    private zzrx zze;
    @z1
    private zzty zzf;
    private final zzrl zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzts zzh = new zzrk(new zzts[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzry[] zzg = new zzry[0];

    public zzsq(zzrl zzrlVar, long[] jArr, zzry[] zzryVarArr, byte... bArr) {
        this.zzi = zzrlVar;
        this.zza = zzryVarArr;
        for (int i = 0; i < zzryVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzso(zzryVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j, zzjw zzjwVar) {
        zzry[] zzryVarArr = this.zzg;
        return (zzryVarArr.length > 0 ? zzryVarArr[0] : this.zza[0]).zza(j, zzjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        zzry[] zzryVarArr;
        zzry[] zzryVarArr2;
        long j = -9223372036854775807L;
        for (zzry zzryVar : this.zzg) {
            long zzd = zzryVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzry zzryVar2 : this.zzg) {
                        if (zzryVar2 == zzryVar) {
                            break;
                        } else if (zzryVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzryVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzry[] zzryVarArr = this.zzg;
            if (i >= zzryVarArr.length) {
                return zze;
            }
            if (zzryVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j) {
        int length;
        zzvg zzvgVar;
        int length2 = zzvgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzvgVarArr.length;
            zzvgVar = null;
            if (i >= length) {
                break;
            }
            zztq zztqVar = zztqVarArr[i];
            Integer num = zztqVar != null ? (Integer) this.zzb.get(zztqVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzvg zzvgVar2 = zzvgVarArr[i];
            if (zzvgVar2 != null) {
                zzck zzckVar = (zzck) this.zzd.get(zzvgVar2.zze());
                Objects.requireNonNull(zzckVar);
                int i2 = 0;
                while (true) {
                    zzry[] zzryVarArr = this.zza;
                    if (i2 >= zzryVarArr.length) {
                        break;
                    } else if (zzryVarArr[i2].zzh().zza(zzckVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.zzb.clear();
        zztq[] zztqVarArr2 = new zztq[length];
        zztq[] zztqVarArr3 = new zztq[length];
        zzvg[] zzvgVarArr2 = new zzvg[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzvgVarArr.length; i4++) {
                zztqVarArr3[i4] = iArr[i4] == i3 ? zztqVarArr[i4] : zzvgVar;
                if (iArr2[i4] == i3) {
                    zzvg zzvgVar3 = zzvgVarArr[i4];
                    Objects.requireNonNull(zzvgVar3);
                    zzck zzckVar2 = (zzck) this.zzd.get(zzvgVar3.zze());
                    Objects.requireNonNull(zzckVar2);
                    zzvgVarArr2[i4] = new zzsn(zzvgVar3, zzckVar2);
                } else {
                    zzvgVarArr2[i4] = zzvgVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zztq[] zztqVarArr4 = zztqVarArr3;
            zzvg[] zzvgVarArr3 = zzvgVarArr2;
            long zzf = this.zza[i3].zzf(zzvgVarArr2, zArr, zztqVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzvgVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zztq zztqVar2 = zztqVarArr4[i6];
                    Objects.requireNonNull(zztqVar2);
                    zztqVarArr2[i6] = zztqVar2;
                    this.zzb.put(zztqVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzcw.zzf(zztqVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zztqVarArr3 = zztqVarArr4;
            zzvgVarArr2 = zzvgVarArr3;
            zzvgVar = null;
        }
        System.arraycopy(zztqVarArr2, 0, zztqVarArr, 0, length);
        zzry[] zzryVarArr2 = (zzry[]) arrayList.toArray(new zzry[0]);
        this.zzg = zzryVarArr2;
        this.zzh = new zzrk(zzryVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        zzry zzryVar = (zzry) zztsVar;
        zzrx zzrxVar = this.zze;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzty zztyVar = this.zzf;
        Objects.requireNonNull(zztyVar);
        return zztyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        this.zzc.remove(zzryVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzry zzryVar2 : this.zza) {
            i += zzryVar2.zzh().zzc;
        }
        zzck[] zzckVarArr = new zzck[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzry[] zzryVarArr = this.zza;
            if (i2 < zzryVarArr.length) {
                zzty zzh = zzryVarArr[i2].zzh();
                int i4 = zzh.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzck zzb = zzh.zzb(i5);
                    zzck zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzckVarArr[i3] = zzc;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.zzf = new zzty(zzckVarArr);
                zzrx zzrxVar = this.zze;
                Objects.requireNonNull(zzrxVar);
                zzrxVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j, boolean z) {
        for (zzry zzryVar : this.zzg) {
            zzryVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        for (zzry zzryVar : this.zza) {
            zzryVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j) {
        this.zze = zzrxVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzry zzryVar : this.zza) {
            zzryVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzry zzn(int i) {
        zzry zzryVar;
        zzry zzryVar2 = this.zza[i];
        if (zzryVar2 instanceof zzso) {
            zzryVar = ((zzso) zzryVar2).zza;
            return zzryVar;
        }
        return zzryVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                ((zzry) this.zzc.get(i)).zzo(j);
            }
            return false;
        }
        return this.zzh.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}