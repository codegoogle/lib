package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzavk {
    private static final int[] zza = {zzazo.zzg("isom"), zzazo.zzg("iso2"), zzazo.zzg("iso3"), zzazo.zzg("iso4"), zzazo.zzg("iso5"), zzazo.zzg("iso6"), zzazo.zzg("avc1"), zzazo.zzg("hvc1"), zzazo.zzg("hev1"), zzazo.zzg("mp41"), zzazo.zzg("mp42"), zzazo.zzg("3g2a"), zzazo.zzg("3g2b"), zzazo.zzg("3gr6"), zzazo.zzg("3gs6"), zzazo.zzg("3ge6"), zzazo.zzg("3gg6"), zzazo.zzg("M4V "), zzazo.zzg("M4A "), zzazo.zzg("f4v "), zzazo.zzg("kddi"), zzazo.zzg("M4VP"), zzazo.zzg("qt  "), zzazo.zzg("MSNV")};

    public static boolean zza(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzc(zzatvVar, true);
    }

    public static boolean zzb(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzc(zzatvVar, false);
    }

    private static boolean zzc(zzatv zzatvVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        long zzc = zzatvVar.zzc();
        int i = (int) ((zzc == -1 || zzc > PlaybackStateCompat.E) ? 4096L : 4096L);
        zzazh zzazhVar = new zzazh(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            zzazhVar.zzs(8);
            zzatvVar.zzg(zzazhVar.zza, 0, 8, false);
            long zzm = zzazhVar.zzm();
            int zze = zzazhVar.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzatvVar.zzg(zzazhVar.zza, 8, 8, false);
                zzazhVar.zzu(16);
                zzm = zzazhVar.zzn();
            } else {
                i3 = 8;
            }
            long j = i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzaut.zzE) {
                if (zze == zzaut.zzN || zze == zzaut.zzP) {
                    z2 = true;
                    break;
                } else if ((i2 + zzm) - j >= i) {
                    break;
                } else {
                    int i4 = (int) (zzm - j);
                    i2 += i4;
                    if (zze == zzaut.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzazhVar.zzs(i4);
                        zzatvVar.zzg(zzazhVar.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 == 1) {
                                zzazhVar.zzw(4);
                            } else {
                                int zze2 = zzazhVar.zze();
                                if ((zze2 >>> 8) != zzazo.zzg("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != zze2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzatvVar.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}