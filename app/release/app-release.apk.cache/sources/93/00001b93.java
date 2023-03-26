package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzacz implements zzadb {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzadi zzc = new zzadi();
    private zzada zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzys zzysVar, int i) throws IOException {
        ((zzyl) zzysVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zza(zzada zzadaVar) {
        this.zzd = zzadaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzys zzysVar) throws IOException {
        String str;
        double longBitsToDouble;
        zzyl zzylVar;
        int zzb;
        int zzc;
        long j;
        int i;
        zzcw.zzb(this.zzd);
        while (true) {
            zzacy zzacyVar = (zzacy) this.zzb.peek();
            if (zzacyVar != null) {
                long zzf = zzysVar.zzf();
                j = zzacyVar.zzb;
                if (zzf >= j) {
                    zzada zzadaVar = this.zzd;
                    i = ((zzacy) this.zzb.pop()).zza;
                    ((zzade) zzadaVar).zza.zzh(i);
                    return true;
                }
            }
            int i2 = this.zze;
            if (i2 == 0) {
                long zzd = this.zzc.zzd(zzysVar, true, false, 4);
                if (zzd == -2) {
                    zzysVar.zzj();
                    while (true) {
                        zzylVar = (zzyl) zzysVar;
                        zzylVar.zzm(this.zza, 0, 4, false);
                        zzb = zzadi.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzadi.zzc(this.zza, zzb, false);
                            zzadg zzadgVar = ((zzade) this.zzd).zza;
                            if (zzadg.zzo(zzc)) {
                                break;
                            }
                        }
                        zzylVar.zzo(1, false);
                    }
                    zzylVar.zzo(zzb, false);
                    zzd = zzc;
                }
                if (zzd == -1) {
                    return false;
                }
                this.zzf = (int) zzd;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzysVar, false, true, 8);
            this.zze = 2;
            zzada zzadaVar2 = this.zzd;
            int i3 = this.zzf;
            zzade zzadeVar = (zzade) zzadaVar2;
            zzadg zzadgVar2 = zzadeVar.zza;
            int zzn = zzadg.zzn(i3);
            if (zzn != 0) {
                if (zzn == 1) {
                    long zzf2 = zzysVar.zzf();
                    this.zzb.push(new zzacy(i3, this.zzg + zzf2, null));
                    ((zzade) this.zzd).zza.zzk(this.zzf, zzf2, this.zzg);
                    this.zze = 0;
                    return true;
                } else if (zzn == 2) {
                    long j2 = this.zzg;
                    if (j2 <= 8) {
                        zzadeVar.zza.zzj(i3, zzd(zzysVar, (int) j2));
                        this.zze = 0;
                        return true;
                    }
                    throw zzbp.zza("Invalid integer size: " + j2, null);
                } else if (zzn != 3) {
                    if (zzn == 4) {
                        zzadgVar2.zzg(i3, (int) this.zzg, zzysVar);
                        this.zze = 0;
                        return true;
                    }
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        throw zzbp.zza("Invalid float size: " + j3, null);
                    }
                    int i4 = (int) j3;
                    long zzd2 = zzd(zzysVar, i4);
                    if (i4 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zzd2);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zzd2);
                    }
                    zzadeVar.zza.zzi(i3, longBitsToDouble);
                    this.zze = 0;
                    return true;
                } else {
                    long j4 = this.zzg;
                    if (j4 <= TTL.MAX_VALUE) {
                        int i5 = (int) j4;
                        if (i5 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i5];
                            ((zzyl) zzysVar).zzn(bArr, 0, i5, false);
                            while (i5 > 0) {
                                int i6 = i5 - 1;
                                if (bArr[i6] != 0) {
                                    break;
                                }
                                i5 = i6;
                            }
                            str = new String(bArr, 0, i5);
                        }
                        zzadeVar.zza.zzl(i3, str);
                        this.zze = 0;
                        return true;
                    }
                    throw zzbp.zza("String element size: " + j4, null);
                }
            }
            ((zzyl) zzysVar).zzo((int) this.zzg, false);
            this.zze = 0;
        }
    }
}