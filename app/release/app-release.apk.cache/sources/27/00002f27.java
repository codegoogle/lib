package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvd extends zzva {
    private final boolean zze;
    private final zzut zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvd(int i, zzck zzckVar, int i2, zzut zzutVar, int i3, int i4, boolean z) {
        super(i, zzckVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        String str;
        char c;
        zzut zzutVar2;
        boolean z4;
        zzad zzadVar;
        int i6;
        int i7;
        float f;
        int i8;
        this.zzf = zzutVar;
        int i9 = 1;
        int i10 = true != zzutVar.zzI ? 16 : 24;
        if (z) {
            zzad zzadVar2 = this.zzd;
            int i11 = zzadVar2.zzr;
            int i12 = zzadVar2.zzs;
            float f2 = zzadVar2.zzt;
            if (f2 == -1.0f || f2 <= 2.1474836E9f) {
                int i13 = zzadVar2.zzi;
                z2 = true;
                this.zze = z2;
                if (z && (((i6 = (zzadVar = this.zzd).zzr) == -1 || i6 >= 0) && ((i7 = zzadVar.zzs) == -1 || i7 >= 0))) {
                    f = zzadVar.zzt;
                    if ((f != -1.0f || f >= 0.0f) && ((i8 = zzadVar.zzi) == -1 || i8 >= 0)) {
                        z3 = true;
                        this.zzg = z3;
                        this.zzh = zzve.zzi(i3, false);
                        zzad zzadVar3 = this.zzd;
                        this.zzi = zzadVar3.zzi;
                        this.zzj = zzadVar3.zza();
                        int i14 = this.zzd.zzf;
                        this.zzl = Integer.bitCount(0);
                        int i15 = this.zzd.zzf;
                        this.zzm = true;
                        i5 = 0;
                        while (true) {
                            if (i5 < zzutVar.zzo.size()) {
                                i5 = Integer.MAX_VALUE;
                                break;
                            }
                            String str2 = this.zzd.zzm;
                            if (str2 != null && str2.equals(zzutVar.zzo.get(i5))) {
                                break;
                            }
                            i5++;
                        }
                        this.zzk = i5;
                        this.zzo = (i3 & 128) != 128;
                        this.zzp = (i3 & 64) != 64;
                        zzad zzadVar4 = this.zzd;
                        str = zzadVar4.zzm;
                        int i16 = 3;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i16 = 4;
                            } else if (c != 1) {
                                if (c == 2) {
                                    i16 = 2;
                                } else if (c == 3) {
                                    i16 = 1;
                                }
                            }
                            this.zzq = i16;
                            zzutVar2 = this.zzf;
                            if (!zzve.zzi(i3, zzutVar2.zzP) || (!(z4 = this.zze) && !zzutVar2.zzG)) {
                                i9 = 0;
                            } else if (zzve.zzi(i3, false) && this.zzg && z4 && zzadVar4.zzi != -1 && (i10 & i3) != 0) {
                                i9 = 2;
                            }
                            this.zzn = i9;
                        }
                        i16 = 0;
                        this.zzq = i16;
                        zzutVar2 = this.zzf;
                        if (!zzve.zzi(i3, zzutVar2.zzP)) {
                            if (zzve.zzi(i3, false)) {
                                i9 = 2;
                            }
                            this.zzn = i9;
                        }
                        i9 = 0;
                        this.zzn = i9;
                    }
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = zzve.zzi(i3, false);
                zzad zzadVar32 = this.zzd;
                this.zzi = zzadVar32.zzi;
                this.zzj = zzadVar32.zza();
                int i142 = this.zzd.zzf;
                this.zzl = Integer.bitCount(0);
                int i152 = this.zzd.zzf;
                this.zzm = true;
                i5 = 0;
                while (true) {
                    if (i5 < zzutVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzk = i5;
                this.zzo = (i3 & 128) != 128;
                this.zzp = (i3 & 64) != 64;
                zzad zzadVar42 = this.zzd;
                str = zzadVar42.zzm;
                int i162 = 3;
                if (str != null) {
                }
                i162 = 0;
                this.zzq = i162;
                zzutVar2 = this.zzf;
                if (!zzve.zzi(i3, zzutVar2.zzP)) {
                }
                i9 = 0;
                this.zzn = i9;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
            f = zzadVar.zzt;
            if (f != -1.0f) {
            }
            z3 = true;
            this.zzg = z3;
            this.zzh = zzve.zzi(i3, false);
            zzad zzadVar322 = this.zzd;
            this.zzi = zzadVar322.zzi;
            this.zzj = zzadVar322.zza();
            int i1422 = this.zzd.zzf;
            this.zzl = Integer.bitCount(0);
            int i1522 = this.zzd.zzf;
            this.zzm = true;
            i5 = 0;
            while (true) {
                if (i5 < zzutVar.zzo.size()) {
                }
                i5++;
            }
            this.zzk = i5;
            this.zzo = (i3 & 128) != 128;
            this.zzp = (i3 & 64) != 64;
            zzad zzadVar422 = this.zzd;
            str = zzadVar422.zzm;
            int i1622 = 3;
            if (str != null) {
            }
            i1622 = 0;
            this.zzq = i1622;
            zzutVar2 = this.zzf;
            if (!zzve.zzi(i3, zzutVar2.zzP)) {
            }
            i9 = 0;
            this.zzn = i9;
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzve.zzi(i3, false);
        zzad zzadVar3222 = this.zzd;
        this.zzi = zzadVar3222.zzi;
        this.zzj = zzadVar3222.zza();
        int i14222 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        int i15222 = this.zzd.zzf;
        this.zzm = true;
        i5 = 0;
        while (true) {
            if (i5 < zzutVar.zzo.size()) {
            }
            i5++;
        }
        this.zzk = i5;
        this.zzo = (i3 & 128) != 128;
        this.zzp = (i3 & 64) != 64;
        zzad zzadVar4222 = this.zzd;
        str = zzadVar4222.zzm;
        int i16222 = 3;
        if (str != null) {
        }
        i16222 = 0;
        this.zzq = i16222;
        zzutVar2 = this.zzf;
        if (!zzve.zzi(i3, zzutVar2.zzP)) {
        }
        i9 = 0;
        this.zzn = i9;
    }

    public static /* synthetic */ int zza(zzvd zzvdVar, zzvd zzvdVar2) {
        zzfsr zzfsrVar;
        zzfsr zza;
        zzfsr zzfsrVar2;
        if (zzvdVar.zze && zzvdVar.zzh) {
            zza = zzve.zzb;
        } else {
            zzfsrVar = zzve.zzb;
            zza = zzfsrVar.zza();
        }
        zzfqy zzj = zzfqy.zzj();
        Integer valueOf = Integer.valueOf(zzvdVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzvdVar2.zzi);
        boolean z = zzvdVar.zzf.zzz;
        zzfsrVar2 = zzve.zzc;
        return zzj.zzc(valueOf, valueOf2, zzfsrVar2).zzc(Integer.valueOf(zzvdVar.zzj), Integer.valueOf(zzvdVar2.zzj), zza).zzc(Integer.valueOf(zzvdVar.zzi), Integer.valueOf(zzvdVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzvd zzvdVar, zzvd zzvdVar2) {
        zzfqy zzc = zzfqy.zzj().zzd(zzvdVar.zzh, zzvdVar2.zzh).zzb(zzvdVar.zzl, zzvdVar2.zzl).zzd(true, true).zzd(zzvdVar.zze, zzvdVar2.zze).zzd(zzvdVar.zzg, zzvdVar2.zzg).zzc(Integer.valueOf(zzvdVar.zzk), Integer.valueOf(zzvdVar2.zzk), zzfsr.zzc().zza());
        boolean z = zzvdVar.zzo;
        zzfqy zzd = zzc.zzd(z, zzvdVar2.zzo);
        boolean z2 = zzvdVar.zzp;
        zzfqy zzd2 = zzd.zzd(z2, zzvdVar2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzvdVar.zzq, zzvdVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        zzvd zzvdVar = (zzvd) zzvaVar;
        if (zzeg.zzS(this.zzd.zzm, zzvdVar.zzd.zzm)) {
            boolean z = this.zzf.zzJ;
            return this.zzo == zzvdVar.zzo && this.zzp == zzvdVar.zzp;
        }
        return false;
    }
}