package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafn extends zzafl {
    @z1
    private zzafm zza;
    private int zzb;
    private boolean zzc;
    @z1
    private zzaad zzd;
    @z1
    private zzaab zze;

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        if ((zzdyVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzdyVar.zzH()[0];
        zzafm zzafmVar = this.zza;
        zzcw.zzb(zzafmVar);
        int i = !zzafmVar.zzd[(b >> 1) & (255 >>> (8 - zzafmVar.zze))].zza ? zzafmVar.zza.zze : zzafmVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzdyVar.zzb() < zzdyVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd() + 4);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            zzdyVar.zzE(zzdyVar.zzd() + 4);
        }
        byte[] zzH = zzdyVar.zzH();
        zzH[zzdyVar.zzd() - 4] = (byte) (j & 255);
        zzH[zzdyVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzH[zzdyVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzH[zzdyVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) throws IOException {
        zzafm zzafmVar;
        int i;
        int i2;
        int i3;
        if (this.zza != null) {
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        }
        zzaad zzaadVar = this.zzd;
        if (zzaadVar == null) {
            zzaae.zzd(1, zzdyVar, false);
            int zzh = zzdyVar.zzh();
            int zzk = zzdyVar.zzk();
            int zzh2 = zzdyVar.zzh();
            int zzg = zzdyVar.zzg();
            int i4 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzdyVar.zzg();
            int i5 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzdyVar.zzg();
            int i6 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzdyVar.zzk();
            this.zzd = new zzaad(zzh, zzk, zzh2, i4, i5, i6, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzdyVar.zzk() & 1), Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd()));
        } else {
            zzaab zzaabVar = this.zze;
            if (zzaabVar == null) {
                this.zze = zzaae.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zzd()];
                System.arraycopy(zzdyVar.zzH(), 0, bArr, 0, zzdyVar.zzd());
                int i7 = zzaadVar.zza;
                int i8 = 5;
                zzaae.zzd(5, zzdyVar, false);
                int zzk3 = zzdyVar.zzk() + 1;
                zzaaa zzaaaVar = new zzaaa(zzdyVar.zzH());
                zzaaaVar.zzc(zzdyVar.zzc() * 8);
                int i9 = 0;
                while (i9 < zzk3) {
                    if (zzaaaVar.zzb(24) == 5653314) {
                        int zzb = zzaaaVar.zzb(16);
                        int zzb2 = zzaaaVar.zzb(24);
                        long[] jArr = new long[zzb2];
                        long j2 = 0;
                        if (!zzaaaVar.zzd()) {
                            boolean zzd = zzaaaVar.zzd();
                            int i10 = 0;
                            while (i10 < zzb2) {
                                if (zzd) {
                                    if (zzaaaVar.zzd()) {
                                        i3 = zzk3;
                                        jArr[i10] = zzaaaVar.zzb(i8) + 1;
                                    } else {
                                        i3 = zzk3;
                                        jArr[i10] = 0;
                                    }
                                } else {
                                    i3 = zzk3;
                                    jArr[i10] = zzaaaVar.zzb(5) + 1;
                                }
                                i10++;
                                zzk3 = i3;
                                i8 = 5;
                            }
                            i2 = zzk3;
                        } else {
                            i2 = zzk3;
                            int zzb3 = zzaaaVar.zzb(5) + 1;
                            int i11 = 0;
                            while (i11 < zzb2) {
                                int zzb4 = zzaaaVar.zzb(zzaae.zza(zzb2 - i11));
                                int i12 = 0;
                                while (i12 < zzb4 && i11 < zzb2) {
                                    jArr[i11] = zzb3;
                                    i11++;
                                    i12++;
                                    zzaabVar = zzaabVar;
                                    bArr = bArr;
                                }
                                zzb3++;
                                zzaabVar = zzaabVar;
                                bArr = bArr;
                            }
                        }
                        zzaab zzaabVar2 = zzaabVar;
                        byte[] bArr2 = bArr;
                        int zzb5 = zzaaaVar.zzb(4);
                        if (zzb5 > 2) {
                            throw zzbp.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                        }
                        if (zzb5 != 1) {
                            if (zzb5 == 2) {
                                zzb5 = 2;
                            } else {
                                i9++;
                                zzaabVar = zzaabVar2;
                                zzk3 = i2;
                                bArr = bArr2;
                                i8 = 5;
                            }
                        }
                        zzaaaVar.zzc(32);
                        zzaaaVar.zzc(32);
                        int zzb6 = zzaaaVar.zzb(4) + 1;
                        zzaaaVar.zzc(1);
                        if (zzb5 != 1) {
                            j2 = zzb2 * zzb;
                        } else if (zzb != 0) {
                            j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                        }
                        zzaaaVar.zzc((int) (zzb6 * j2));
                        i9++;
                        zzaabVar = zzaabVar2;
                        zzk3 = i2;
                        bArr = bArr2;
                        i8 = 5;
                    } else {
                        throw zzbp.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaaaVar.zza(), null);
                    }
                }
                zzaab zzaabVar3 = zzaabVar;
                byte[] bArr3 = bArr;
                int i13 = 6;
                int zzb7 = zzaaaVar.zzb(6) + 1;
                for (int i14 = 0; i14 < zzb7; i14++) {
                    if (zzaaaVar.zzb(16) != 0) {
                        throw zzbp.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i15 = 1;
                int zzb8 = zzaaaVar.zzb(6) + 1;
                int i16 = 0;
                while (true) {
                    int i17 = 3;
                    if (i16 < zzb8) {
                        int zzb9 = zzaaaVar.zzb(16);
                        if (zzb9 == 0) {
                            int i18 = 8;
                            zzaaaVar.zzc(8);
                            zzaaaVar.zzc(16);
                            zzaaaVar.zzc(16);
                            zzaaaVar.zzc(6);
                            zzaaaVar.zzc(8);
                            int zzb10 = zzaaaVar.zzb(4) + 1;
                            int i19 = 0;
                            while (i19 < zzb10) {
                                zzaaaVar.zzc(i18);
                                i19++;
                                i18 = 8;
                            }
                        } else if (zzb9 != i15) {
                            throw zzbp.zza("floor type greater than 1 not decodable: " + zzb9, null);
                        } else {
                            int zzb11 = zzaaaVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i20 = -1;
                            for (int i21 = 0; i21 < zzb11; i21++) {
                                int zzb12 = zzaaaVar.zzb(4);
                                iArr[i21] = zzb12;
                                if (zzb12 > i20) {
                                    i20 = zzb12;
                                }
                            }
                            int i22 = i20 + 1;
                            int[] iArr2 = new int[i22];
                            int i23 = 0;
                            while (i23 < i22) {
                                iArr2[i23] = zzaaaVar.zzb(i17) + 1;
                                int zzb13 = zzaaaVar.zzb(2);
                                if (zzb13 > 0) {
                                    i = 8;
                                    zzaaaVar.zzc(8);
                                } else {
                                    i = 8;
                                }
                                int i24 = 0;
                                for (int i25 = 1; i24 < (i25 << zzb13); i25 = 1) {
                                    zzaaaVar.zzc(i);
                                    i24++;
                                    i = 8;
                                }
                                i23++;
                                i17 = 3;
                            }
                            zzaaaVar.zzc(2);
                            int zzb14 = zzaaaVar.zzb(4);
                            int i26 = 0;
                            int i27 = 0;
                            for (int i28 = 0; i28 < zzb11; i28++) {
                                i26 += iArr2[iArr[i28]];
                                while (i27 < i26) {
                                    zzaaaVar.zzc(zzb14);
                                    i27++;
                                }
                            }
                        }
                        i16++;
                        i13 = 6;
                        i15 = 1;
                    } else {
                        int i29 = 1;
                        int zzb15 = zzaaaVar.zzb(i13) + 1;
                        int i30 = 0;
                        while (i30 < zzb15) {
                            if (zzaaaVar.zzb(16) <= 2) {
                                zzaaaVar.zzc(24);
                                zzaaaVar.zzc(24);
                                zzaaaVar.zzc(24);
                                int zzb16 = zzaaaVar.zzb(i13) + i29;
                                int i31 = 8;
                                zzaaaVar.zzc(8);
                                int[] iArr3 = new int[zzb16];
                                for (int i32 = 0; i32 < zzb16; i32++) {
                                    iArr3[i32] = ((zzaaaVar.zzd() ? zzaaaVar.zzb(5) : 0) * 8) + zzaaaVar.zzb(3);
                                }
                                int i33 = 0;
                                while (i33 < zzb16) {
                                    int i34 = 0;
                                    while (i34 < i31) {
                                        if ((iArr3[i33] & (1 << i34)) != 0) {
                                            zzaaaVar.zzc(i31);
                                        }
                                        i34++;
                                        i31 = 8;
                                    }
                                    i33++;
                                    i31 = 8;
                                }
                                i30++;
                                i13 = 6;
                                i29 = 1;
                            } else {
                                throw zzbp.zza("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int zzb17 = zzaaaVar.zzb(i13);
                        int i35 = 1;
                        int i36 = zzb17 + 1;
                        int i37 = 0;
                        while (i37 < i36) {
                            if (zzaaaVar.zzb(16) == 0) {
                                int zzb18 = zzaaaVar.zzd() ? zzaaaVar.zzb(4) + 1 : 1;
                                if (zzaaaVar.zzd()) {
                                    int zzb19 = zzaaaVar.zzb(8) + i35;
                                    for (int i38 = 0; i38 < zzb19; i38++) {
                                        int i39 = i7 - 1;
                                        zzaaaVar.zzc(zzaae.zza(i39));
                                        zzaaaVar.zzc(zzaae.zza(i39));
                                    }
                                }
                                if (zzaaaVar.zzb(2) != 0) {
                                    throw zzbp.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (zzb18 > 1) {
                                    for (int i40 = 0; i40 < i7; i40++) {
                                        zzaaaVar.zzc(4);
                                    }
                                }
                                for (int i41 = 0; i41 < zzb18; i41++) {
                                    zzaaaVar.zzc(8);
                                    zzaaaVar.zzc(8);
                                    zzaaaVar.zzc(8);
                                }
                            }
                            i37++;
                            i35 = 1;
                        }
                        int zzb20 = zzaaaVar.zzb(6) + 1;
                        zzaac[] zzaacVarArr = new zzaac[zzb20];
                        for (int i42 = 0; i42 < zzb20; i42++) {
                            zzaacVarArr[i42] = new zzaac(zzaaaVar.zzd(), zzaaaVar.zzb(16), zzaaaVar.zzb(16), zzaaaVar.zzb(8));
                        }
                        if (zzaaaVar.zzd()) {
                            zzafmVar = new zzafm(zzaadVar, zzaabVar3, bArr3, zzaacVarArr, zzaae.zza(zzb20 - 1));
                        } else {
                            throw zzbp.zza("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        zzafmVar = null;
        this.zza = zzafmVar;
        if (zzafmVar == null) {
            return true;
        }
        zzaad zzaadVar2 = zzafmVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaadVar2.zzg);
        arrayList.add(zzafmVar.zzc);
        zzbl zzb21 = zzaae.zzb(zzfrj.zzn(zzafmVar.zzb.zzb));
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/vorbis");
        zzabVar.zzv(zzaadVar2.zzd);
        zzabVar.zzO(zzaadVar2.zzc);
        zzabVar.zzw(zzaadVar2.zza);
        zzabVar.zzT(zzaadVar2.zzb);
        zzabVar.zzI(arrayList);
        zzabVar.zzM(zzb21);
        zzafiVar.zza = zzabVar.zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaad zzaadVar = this.zzd;
        this.zzb = zzaadVar != null ? zzaadVar.zze : 0;
    }
}