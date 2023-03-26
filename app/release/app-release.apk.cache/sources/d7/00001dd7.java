package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.wo1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayl {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayl(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzayz.zzc(j >= 0);
        zzayz.zzc(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzayz.zzc(z);
            this.zza = uri;
            this.zzb = j;
            this.zzc = j2;
            this.zzd = j3;
        }
        z = true;
        zzayz.zzc(z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.zzb;
        long j2 = this.zzc;
        long j3 = this.zzd;
        StringBuilder N = wo1.N("DataSpec[", valueOf, ", ", arrays, ", ");
        N.append(j);
        N.append(", ");
        N.append(j2);
        N.append(", ");
        N.append(j3);
        N.append(", null, 0]");
        return N.toString();
    }
}