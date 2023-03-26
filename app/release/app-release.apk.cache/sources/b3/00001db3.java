package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxc implements zzawz, zzawy {
    public final zzawz[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawy zzc;
    private int zzd;
    private zzaxq zze;
    private zzawz[] zzf;
    private zzaxn zzg;

    public zzaxc(zzawz... zzawzVarArr) {
        this.zza = zzawzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzB(zzaxu[] zzaxuVarArr, boolean[] zArr, zzaxl[] zzaxlVarArr, boolean[] zArr2, long j) {
        int length;
        zzaxl[] zzaxlVarArr2 = zzaxlVarArr;
        int length2 = zzaxuVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzaxuVarArr.length;
            if (i >= length) {
                break;
            }
            zzaxl zzaxlVar = zzaxlVarArr2[i];
            iArr[i] = zzaxlVar == null ? -1 : ((Integer) this.zzb.get(zzaxlVar)).intValue();
            iArr2[i] = -1;
            zzaxu zzaxuVar = zzaxuVarArr[i];
            if (zzaxuVar != null) {
                zzaxp zzd = zzaxuVar.zzd();
                int i2 = 0;
                while (true) {
                    zzawz[] zzawzVarArr = this.zza;
                    if (i2 >= zzawzVarArr.length) {
                        break;
                    } else if (zzawzVarArr[i2].zzn().zza(zzd) != -1) {
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
        zzaxl[] zzaxlVarArr3 = new zzaxl[length];
        zzaxl[] zzaxlVarArr4 = new zzaxl[length];
        zzaxu[] zzaxuVarArr2 = new zzaxu[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzaxuVarArr.length; i4++) {
                zzaxu zzaxuVar2 = null;
                zzaxlVarArr4[i4] = iArr[i4] == i3 ? zzaxlVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzaxuVar2 = zzaxuVarArr[i4];
                }
                zzaxuVarArr2[i4] = zzaxuVar2;
            }
            int i5 = i3;
            zzaxu[] zzaxuVarArr3 = zzaxuVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i3].zzB(zzaxuVarArr2, zArr, zzaxlVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzaxuVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzayz.zze(zzaxlVarArr4[i6] != null);
                    zzaxl zzaxlVar2 = zzaxlVarArr4[i6];
                    zzaxlVarArr3[i6] = zzaxlVar2;
                    this.zzb.put(zzaxlVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzayz.zze(zzaxlVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzaxuVarArr2 = zzaxuVarArr3;
            zzaxlVarArr2 = zzaxlVarArr;
        }
        zzaxl[] zzaxlVarArr5 = zzaxlVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxlVarArr3, 0, zzaxlVarArr5, 0, length);
        zzawz[] zzawzVarArr2 = new zzawz[arrayList3.size()];
        this.zzf = zzawzVarArr2;
        arrayList3.toArray(zzawzVarArr2);
        this.zzg = new zzawn(this.zzf);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final /* bridge */ /* synthetic */ void zze(zzaxn zzaxnVar) {
        zzawz zzawzVar = (zzawz) zzaxnVar;
        if (this.zze == null) {
            return;
        }
        this.zzc.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzf(zzawz zzawzVar) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzawz zzawzVar2 : this.zza) {
            i2 += zzawzVar2.zzn().zzb;
        }
        zzaxp[] zzaxpVarArr = new zzaxp[i2];
        int i3 = 0;
        for (zzawz zzawzVar3 : this.zza) {
            zzaxq zzn = zzawzVar3.zzn();
            int i4 = zzn.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzaxpVarArr[i3] = zzn.zzb(i5);
                i5++;
                i3++;
            }
        }
        this.zze = new zzaxq(zzaxpVarArr);
        this.zzc.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzawz zzawzVar : this.zzf) {
            long zzg = zzawzVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j = Math.min(j, zzg);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        zzawz[] zzawzVarArr;
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzawz[] zzawzVarArr2 = this.zza;
            if (i >= zzawzVarArr2.length) {
                if (zzh != -9223372036854775807L) {
                    for (zzawz zzawzVar : this.zzf) {
                        if (zzawzVar != this.zza[0] && zzawzVar.zzi(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzawzVarArr2[i].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzawz[] zzawzVarArr = this.zzf;
            if (i >= zzawzVarArr.length) {
                return zzi;
            }
            if (zzawzVarArr[i].zzi(zzi) != zzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long j) {
        for (zzawz zzawzVar : this.zzf) {
            zzawzVar.zzq(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzs() throws IOException {
        for (zzawz zzawzVar : this.zza) {
            zzawzVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawyVar, long j) {
        this.zzc = zzawyVar;
        zzawz[] zzawzVarArr = this.zza;
        this.zzd = zzawzVarArr.length;
        for (zzawz zzawzVar : zzawzVarArr) {
            zzawzVar.zzw(this, j);
        }
    }
}