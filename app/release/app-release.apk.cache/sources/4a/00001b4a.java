package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaag implements zzyr {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzyu zzp;
    private zzzy zzq;
    private zzzu zzr;
    private boolean zzs;
    public static final zzyy zza = zzaaf.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzeg.zzZ("#!AMR\n");
    private static final byte[] zze = zzeg.zzZ("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzaag() {
        this(0);
    }

    public zzaag(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zze(zzys zzysVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzysVar.zzj();
                ((zzyl) zzysVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) <= 0) {
                    int i3 = (b >> 3) & 15;
                    boolean z = this.zzh;
                    if (z) {
                        if (i3 >= 10) {
                            if (i3 > 13) {
                            }
                        }
                        i2 = !z ? zzc[i3] : zzb[i3];
                        this.zzj = i2;
                        this.zzk = i2;
                        i = this.zzm;
                        if (i == -1) {
                            this.zzm = i2;
                            i = i2;
                        }
                        if (i == i2) {
                            this.zzn++;
                        }
                    }
                    if (!z) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                        if (!z) {
                        }
                        this.zzj = i2;
                        this.zzk = i2;
                        i = this.zzm;
                        if (i == -1) {
                        }
                        if (i == i2) {
                        }
                    }
                    throw zzbp.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                throw zzbp.zza("Invalid padding bits for frame header " + ((int) b), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = zzzw.zza(this.zzq, zzysVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i4 = this.zzk - zza2;
        this.zzk = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }

    private static boolean zzf(zzys zzysVar, byte[] bArr) throws IOException {
        zzysVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzyl) zzysVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzys zzysVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzysVar, bArr)) {
            this.zzh = false;
            ((zzyl) zzysVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (zzf(zzysVar, bArr2)) {
            this.zzh = true;
            ((zzyl) zzysVar).zzo(bArr2.length, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzq);
        int i = zzeg.zza;
        if (zzysVar.zzf() == 0 && !zzg(zzysVar)) {
            throw zzbp.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzzy zzzyVar = this.zzq;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzL(zzf);
            zzabVar.zzw(1);
            zzabVar.zzT(i2);
            zzzyVar.zzk(zzabVar.zzY());
        }
        int zze2 = zze(zzysVar);
        if (this.zzl) {
            return zze2;
        }
        zzzt zzztVar = new zzzt(-9223372036854775807L, 0L);
        this.zzr = zzztVar;
        this.zzp.zzL(zzztVar);
        this.zzl = true;
        return zze2;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzp = zzyuVar;
        this.zzq = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzg(zzysVar);
    }
}