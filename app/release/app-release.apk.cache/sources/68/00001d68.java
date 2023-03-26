package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.Stack;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaui {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzauq zzc = new zzauq();
    private int zzd;
    private int zze;
    private long zzf;
    private zzaul zzg;

    private final long zzd(zzatv zzatvVar, int i) throws IOException, InterruptedException {
        zzatvVar.zzh(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzaul zzaulVar) {
        this.zzg = zzaulVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzatv zzatvVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int zzb;
        int zzc;
        long j;
        int i;
        zzayz.zze(this.zzg != null);
        while (true) {
            if (!this.zzb.isEmpty()) {
                long zzd = zzatvVar.zzd();
                j = ((zzauh) this.zzb.peek()).zzb;
                if (zzd >= j) {
                    zzaul zzaulVar = this.zzg;
                    i = ((zzauh) this.zzb.pop()).zza;
                    zzaulVar.zza.zzb(i);
                    return true;
                }
            }
            int i2 = this.zzd;
            if (i2 == 0) {
                long zze = this.zzc.zze(zzatvVar, true, false, 4);
                if (zze == -2) {
                    zzatvVar.zze();
                    while (true) {
                        zzatvVar.zzg(this.zza, 0, 4, false);
                        zzb = zzauq.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzauq.zzc(this.zza, zzb, false);
                            zzauo zzauoVar = this.zzg.zza;
                            if (zzauo.zzm(zzc)) {
                                break;
                            }
                        }
                        zzatvVar.zzi(1, false);
                    }
                    zzatvVar.zzi(zzb, false);
                    zze = zzc;
                }
                if (zze == -1) {
                    return false;
                }
                this.zze = (int) zze;
                this.zzd = 1;
            }
            this.zzf = this.zzc.zze(zzatvVar, false, true, 8);
            this.zzd = 2;
            zzaul zzaulVar2 = this.zzg;
            int i3 = this.zze;
            zzauo zzauoVar2 = zzaulVar2.zza;
            int zzl = zzauo.zzl(i3);
            if (zzl != 0) {
                if (zzl == 1) {
                    long zzd2 = zzatvVar.zzd();
                    this.zzb.add(new zzauh(i3, this.zzf + zzd2, null));
                    this.zzg.zza.zzi(this.zze, zzd2, this.zzf);
                    this.zzd = 0;
                    return true;
                } else if (zzl == 2) {
                    long j2 = this.zzf;
                    if (j2 <= 8) {
                        zzaulVar2.zza.zzh(i3, zzd(zzatvVar, (int) j2));
                        this.zzd = 0;
                        return true;
                    }
                    throw new zzarw(wo1.p("Invalid integer size: ", j2));
                } else if (zzl == 3) {
                    long j3 = this.zzf;
                    if (j3 <= TTL.MAX_VALUE) {
                        int i4 = (int) j3;
                        if (i4 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i4];
                            zzatvVar.zzh(bArr, 0, i4, false);
                            str = new String(bArr);
                        }
                        zzaulVar2.zza.zzj(i3, str);
                        this.zzd = 0;
                        return true;
                    }
                    throw new zzarw(wo1.p("String element size: ", j3));
                } else if (zzl == 4) {
                    zzauoVar2.zzk(i3, (int) this.zzf, zzatvVar);
                    this.zzd = 0;
                    return true;
                } else {
                    long j4 = this.zzf;
                    if (j4 != 4 && j4 != 8) {
                        throw new zzarw(wo1.p("Invalid float size: ", j4));
                    }
                    int i5 = (int) j4;
                    long zzd3 = zzd(zzatvVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zzd3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zzd3);
                    }
                    zzaulVar2.zza.zzc(i3, longBitsToDouble);
                    this.zzd = 0;
                    return true;
                }
            }
            zzatvVar.zzi((int) this.zzf, false);
            this.zzd = 0;
        }
    }
}