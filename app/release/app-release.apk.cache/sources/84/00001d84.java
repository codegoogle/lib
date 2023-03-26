package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzavj implements zzatw, zzaud {
    public static final zzaty zza = new zzavh();
    private static final int zzb = zzazo.zzg("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzazh zzk;
    private int zzl;
    private int zzm;
    private zzatx zzn;
    private zzavi[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzazh zze = new zzazh(16);
    private final Stack zzf = new Stack();
    private final zzazh zzc = new zzazh(zzazf.zza);
    private final zzazh zzd = new zzazh(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzarw {
        zzawe zzaweVar;
        zzaua zzauaVar;
        zzawe zzaweVar2;
        zzavl zza2;
        while (!this.zzf.isEmpty() && ((zzaur) this.zzf.peek()).zza == j) {
            zzaur zzaurVar = (zzaur) this.zzf.pop();
            if (zzaurVar.zzaR == zzaut.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaua zzauaVar2 = new zzaua();
                zzaus zzb2 = zzaurVar.zzb(zzaut.zzaC);
                if (zzb2 != null) {
                    zzaweVar = zzava.zzc(zzb2, this.zzq);
                    if (zzaweVar != null) {
                        zzauaVar2.zzb(zzaweVar);
                    }
                } else {
                    zzaweVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzaurVar.zzc.size()) {
                    zzaur zzaurVar2 = (zzaur) zzaurVar.zzc.get(i);
                    if (zzaurVar2.zzaR == zzaut.zzG && (zza2 = zzava.zza(zzaurVar2, zzaurVar.zzb(zzaut.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzavo zzb3 = zzava.zzb(zza2, zzaurVar2.zza(zzaut.zzH).zza(zzaut.zzI).zza(zzaut.zzJ), zzauaVar2);
                        if (zzb3.zza != 0) {
                            zzavi zzaviVar = new zzavi(zza2, zzb3, this.zzn.zzbi(i, zza2.zzb));
                            zzart zze = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzauaVar2.zza()) {
                                    zze = zze.zzd(zzauaVar2.zzb, zzauaVar2.zzc);
                                }
                                if (zzaweVar != null) {
                                    zze = zze.zzf(zzaweVar);
                                }
                            }
                            zzaviVar.zzc.zza(zze);
                            zzauaVar = zzauaVar2;
                            zzaweVar2 = zzaweVar;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzaviVar);
                            long j4 = zzb3.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzauaVar2 = zzauaVar;
                            zzaweVar = zzaweVar2;
                        }
                    }
                    zzauaVar = zzauaVar2;
                    zzaweVar2 = zzaweVar;
                    i++;
                    zzauaVar2 = zzauaVar;
                    zzaweVar = zzaweVar2;
                }
                this.zzp = j2;
                this.zzo = (zzavi[]) arrayList.toArray(new zzavi[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzaur) this.zzf.peek()).zzc(zzaurVar);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zzb(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzavi zzaviVar : this.zzo) {
            zzavo zzavoVar = zzaviVar.zzb;
            int zza2 = zzavoVar.zza(j);
            if (zza2 == -1) {
                zza2 = zzavoVar.zzb(j);
            }
            long j3 = zzavoVar.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatxVar) {
        this.zzn = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzavi[] zzaviVarArr = this.zzo;
        if (zzaviVarArr != null) {
            for (zzavi zzaviVar : zzaviVarArr) {
                zzavo zzavoVar = zzaviVar.zzb;
                int zza2 = zzavoVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzavoVar.zzb(j2);
                }
                zzaviVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatvVar, zzaub zzaubVar) throws IOException, InterruptedException {
        zzavi[] zzaviVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzatvVar.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzatvVar.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i2 = this.zzh;
                if (i2 != zzaut.zzE && i2 != zzaut.zzG && i2 != zzaut.zzH && i2 != zzaut.zzI && i2 != zzaut.zzJ && i2 != zzaut.zzS) {
                    if (i2 != zzaut.zzU && i2 != zzaut.zzF && i2 != zzaut.zzV && i2 != zzaut.zzW && i2 != zzaut.zzao && i2 != zzaut.zzap && i2 != zzaut.zzaq && i2 != zzaut.zzT && i2 != zzaut.zzar && i2 != zzaut.zzas && i2 != zzaut.zzat && i2 != zzaut.zzau && i2 != zzaut.zzav && i2 != zzaut.zzR && i2 != zzaut.zzd && i2 != zzaut.zzaC) {
                        this.zzk = null;
                    } else {
                        zzayz.zze(this.zzj == 8);
                        zzayz.zze(this.zzi <= TTL.MAX_VALUE);
                        zzazh zzazhVar = new zzazh((int) this.zzi);
                        this.zzk = zzazhVar;
                        System.arraycopy(this.zze.zza, 0, zzazhVar.zza, 0, 8);
                    }
                    this.zzg = 1;
                } else {
                    long zzd = (zzatvVar.zzd() + this.zzi) - this.zzj;
                    this.zzf.add(new zzaur(this.zzh, zzd));
                    if (this.zzi == this.zzj) {
                        zzi(zzd);
                    } else {
                        zzh();
                    }
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    zzaviVarArr = this.zzo;
                    if (i3 >= zzaviVarArr.length) {
                        break;
                    }
                    zzavi zzaviVar = zzaviVarArr[i3];
                    int i5 = zzaviVar.zzd;
                    zzavo zzavoVar = zzaviVar.zzb;
                    if (i5 != zzavoVar.zza) {
                        long j2 = zzavoVar.zzb[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                zzavi zzaviVar2 = zzaviVarArr[i4];
                zzauf zzaufVar = zzaviVar2.zzc;
                int i6 = zzaviVar2.zzd;
                zzavo zzavoVar2 = zzaviVar2.zzb;
                long j3 = zzavoVar2.zzb[i6];
                int i7 = zzavoVar2.zzc[i6];
                if (zzaviVar2.zza.zzg == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long zzd2 = (j3 - zzatvVar.zzd()) + this.zzl;
                if (zzd2 >= 0 && zzd2 < PlaybackStateCompat.K) {
                    int i8 = (int) zzd2;
                    boolean z3 = false;
                    zzatvVar.zzi(i8, false);
                    int i9 = zzaviVar2.zza.zzk;
                    if (i9 == 0) {
                        while (true) {
                            int i10 = this.zzl;
                            if (i10 >= i7) {
                                break;
                            }
                            int zzd3 = zzaufVar.zzd(zzatvVar, i7 - i10, false);
                            this.zzl += zzd3;
                            this.zzm -= zzd3;
                        }
                    } else {
                        byte[] bArr = this.zzd.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i11 = 4 - i9;
                        while (this.zzl < i7) {
                            int i12 = this.zzm;
                            if (i12 == 0) {
                                zzatvVar.zzh(this.zzd.zza, i11, i9, z3);
                                this.zzd.zzv(z3 ? 1 : 0);
                                this.zzm = this.zzd.zzi();
                                this.zzc.zzv(z3 ? 1 : 0);
                                zzaufVar.zzb(this.zzc, 4);
                                this.zzl += 4;
                                i7 += i11;
                            } else {
                                int zzd4 = zzaufVar.zzd(zzatvVar, i12, z3);
                                this.zzl += zzd4;
                                this.zzm -= zzd4;
                                z3 = false;
                            }
                        }
                    }
                    int i13 = i7;
                    zzavo zzavoVar3 = zzaviVar2.zzb;
                    zzaufVar.zzc(zzavoVar3.zze[i6], zzavoVar3.zzf[i6], i13, 0, null);
                    zzaviVar2.zzd++;
                    this.zzl = 0;
                    this.zzm = 0;
                    return 0;
                }
                zzaubVar.zza = j3;
                return 1;
            } else {
                long j4 = this.zzi;
                int i14 = this.zzj;
                long j5 = j4 - i14;
                long zzd5 = zzatvVar.zzd() + j5;
                zzazh zzazhVar2 = this.zzk;
                if (zzazhVar2 != null) {
                    zzatvVar.zzh(zzazhVar2.zza, i14, (int) j5, false);
                    if (this.zzh == zzaut.zzd) {
                        zzazh zzazhVar3 = this.zzk;
                        zzazhVar3.zzv(8);
                        if (zzazhVar3.zze() == zzb) {
                            z2 = true;
                            break;
                        }
                        zzazhVar3.zzw(4);
                        while (zzazhVar3.zza() > 0) {
                            if (zzazhVar3.zze() == zzb) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzaur) this.zzf.peek()).zzd(new zzaus(this.zzh, this.zzk));
                    }
                } else if (j5 < PlaybackStateCompat.K) {
                    zzatvVar.zzi((int) j5, false);
                } else {
                    zzaubVar.zza = zzatvVar.zzd() + j5;
                    z = true;
                    zzi(zzd5);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzd5);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzavk.zzb(zzatvVar);
    }
}