package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgt extends zzbr {
    public static final zzl zzd = zzgs.zza;
    public final int zze;
    @z1
    public final String zzf;
    public final int zzg;
    @z1
    public final zzad zzh;
    public final int zzi;
    @z1
    public final zzbi zzj;
    public final boolean zzk;

    private zzgt(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzgt zzb(Throwable th, String str, int i, @z1 zzad zzadVar, int i2, boolean z, int i3) {
        return new zzgt(1, th, null, i3, str, i, zzadVar, zzadVar == null ? 4 : i2, z);
    }

    public static zzgt zzc(IOException iOException, int i) {
        return new zzgt(0, iOException, i);
    }

    public static zzgt zzd(RuntimeException runtimeException, int i) {
        return new zzgt(2, runtimeException, i);
    }

    @u0
    public final zzgt zza(@z1 zzbi zzbiVar) {
        String message = getMessage();
        int i = zzeg.zza;
        return new zzgt(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbiVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgt(int i, @z1 Throwable th, @z1 String str, int i2, @z1 String str2, int i3, @z1 zzad zzadVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzadVar, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzadVar);
            String zzL = zzeg.zzL(i4);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(valueOf);
            str3 = wo1.C(sb, ", format_supported=", zzL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgt(String str, @z1 Throwable th, int i, int i2, @z1 String str2, int i3, @z1 zzad zzadVar, int i4, @z1 zzbi zzbiVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 != 1) {
                z2 = false;
                zzcw.zzd(z2);
                zzcw.zzd(th != null);
                this.zze = i5;
                this.zzf = str2;
                this.zzg = i3;
                this.zzh = zzadVar;
                this.zzi = i4;
                this.zzj = zzbiVar;
                this.zzk = z;
            }
            i5 = 1;
        } else {
            i5 = i2;
        }
        z2 = true;
        zzcw.zzd(z2);
        zzcw.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzadVar;
        this.zzi = i4;
        this.zzj = zzbiVar;
        this.zzk = z;
    }
}