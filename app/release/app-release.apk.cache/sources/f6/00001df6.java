package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazp {
    public final List zza;
    public final int zzb;
    public final float zzc;

    private zzazp(List list, int i, int i2, int i3, float f) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5 A[Catch: ArrayIndexOutOfBoundsException -> 0x0198, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0198, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:99:0x018b, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:101:0x0192, B:102:0x0197), top: B:106:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e A[Catch: ArrayIndexOutOfBoundsException -> 0x0198, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0198, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:99:0x018b, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:101:0x0192, B:102:0x0197), top: B:106:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[Catch: ArrayIndexOutOfBoundsException -> 0x0198, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0198, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:99:0x018b, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:101:0x0192, B:102:0x0197), top: B:106:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a A[Catch: ArrayIndexOutOfBoundsException -> 0x0198, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0198, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:99:0x018b, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:101:0x0192, B:102:0x0197), top: B:106:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzazp zza(zzazh zzazhVar) throws zzarw {
        int i;
        int i2;
        float f;
        int zzc;
        int i3;
        int zzc2;
        boolean zze;
        int zza;
        try {
            zzazhVar.zzw(4);
            int zzg = (zzazhVar.zzg() & 3) + 1;
            if (zzg != 3) {
                ArrayList arrayList = new ArrayList();
                int zzg2 = zzazhVar.zzg() & 31;
                for (int i4 = 0; i4 < zzg2; i4++) {
                    arrayList.add(zzb(zzazhVar));
                }
                int zzg3 = zzazhVar.zzg();
                for (int i5 = 0; i5 < zzg3; i5++) {
                    arrayList.add(zzb(zzazhVar));
                }
                float f2 = 1.0f;
                if (zzg2 > 0) {
                    zzazi zzaziVar = new zzazi((byte[]) arrayList.get(0), zzg, ((byte[]) arrayList.get(0)).length);
                    zzaziVar.zzd(8);
                    int zza2 = zzaziVar.zza(8);
                    zzaziVar.zzd(16);
                    zzaziVar.zzc();
                    if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128 && zza2 != 138) {
                        zzc = 1;
                        zzaziVar.zzc();
                        zzc2 = zzaziVar.zzc();
                        if (zzc2 != 0) {
                            zzaziVar.zzc();
                        } else if (zzc2 == 1) {
                            zzaziVar.zze();
                            zzaziVar.zzb();
                            zzaziVar.zzb();
                            long zzc3 = zzaziVar.zzc();
                            for (int i6 = 0; i6 < zzc3; i6++) {
                                zzaziVar.zzc();
                            }
                        }
                        zzaziVar.zzc();
                        zzaziVar.zzd(1);
                        int zzc4 = zzaziVar.zzc() + 1;
                        zze = zzaziVar.zze();
                        int i7 = 2 - (zze ? 1 : 0);
                        int zzc5 = (zzaziVar.zzc() + 1) * i7;
                        if (!zze) {
                            zzaziVar.zzd(1);
                        }
                        zzaziVar.zzd(1);
                        int i8 = zzc4 * 16;
                        int i9 = zzc5 * 16;
                        if (zzaziVar.zze()) {
                            int zzc6 = zzaziVar.zzc();
                            int zzc7 = zzaziVar.zzc();
                            int zzc8 = zzaziVar.zzc();
                            int zzc9 = zzaziVar.zzc();
                            if (zzc != 0) {
                                int i10 = zzc == 3 ? 1 : 2;
                                i7 *= zzc == 1 ? 2 : 1;
                                r3 = i10;
                            }
                            i8 -= (zzc6 + zzc7) * r3;
                            i9 -= (zzc8 + zzc9) * i7;
                        }
                        if (zzaziVar.zze() && zzaziVar.zze()) {
                            zza = zzaziVar.zza(8);
                            if (zza != 255) {
                                int zza3 = zzaziVar.zza(16);
                                int zza4 = zzaziVar.zza(16);
                                if (zza3 != 0 && zza4 != 0) {
                                    f2 = zza3 / zza4;
                                }
                            } else if (zza < 17) {
                                f2 = zzazf.zzb[zza];
                            }
                        }
                        f = f2;
                        i2 = i9;
                        i = i8;
                    }
                    zzc = zzaziVar.zzc();
                    if (zzc == 3) {
                        zzaziVar.zze();
                        i3 = 3;
                    } else {
                        i3 = zzc;
                    }
                    zzaziVar.zzc();
                    zzaziVar.zzc();
                    zzaziVar.zzd(1);
                    if (zzaziVar.zze()) {
                        int i11 = i3 != 3 ? 8 : 12;
                        int i12 = 0;
                        while (i12 < i11) {
                            if (zzaziVar.zze()) {
                                int i13 = i12 < 6 ? 16 : 64;
                                int i14 = 8;
                                int i15 = 8;
                                for (int i16 = 0; i16 < i13; i16++) {
                                    if (i14 != 0) {
                                        i14 = ((zzaziVar.zzb() + i15) + 256) % 256;
                                    }
                                    if (i14 != 0) {
                                        i15 = i14;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    zzaziVar.zzc();
                    zzc2 = zzaziVar.zzc();
                    if (zzc2 != 0) {
                    }
                    zzaziVar.zzc();
                    zzaziVar.zzd(1);
                    int zzc42 = zzaziVar.zzc() + 1;
                    zze = zzaziVar.zze();
                    int i72 = 2 - (zze ? 1 : 0);
                    int zzc52 = (zzaziVar.zzc() + 1) * i72;
                    if (!zze) {
                    }
                    zzaziVar.zzd(1);
                    int i82 = zzc42 * 16;
                    int i92 = zzc52 * 16;
                    if (zzaziVar.zze()) {
                    }
                    if (zzaziVar.zze()) {
                        zza = zzaziVar.zza(8);
                        if (zza != 255) {
                        }
                    }
                    f = f2;
                    i2 = i92;
                    i = i82;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new zzazp(arrayList, zzg, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarw("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzazh zzazhVar) {
        int zzj = zzazhVar.zzj();
        int zzc = zzazhVar.zzc();
        zzazhVar.zzw(zzj);
        return zzaza.zzb(zzazhVar.zza, zzc, zzj);
    }
}