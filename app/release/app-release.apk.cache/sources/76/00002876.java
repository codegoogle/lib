package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzev {
    public final Uri zza;
    public final int zzb;
    @z1
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    @z1
    public final String zzh;
    public final int zzi;

    static {
        zzbc.zzb("media3.datasource");
    }

    private zzev(Uri uri, long j, int i, @z1 byte[] bArr, Map map, long j2, long j3, @z1 String str, int i2, @z1 Object obj) {
        long j4 = j + j2;
        boolean z = false;
        zzcw.zzd(j4 >= 0);
        zzcw.zzd(j2 >= 0);
        long j5 = -1;
        if (j3 > 0) {
            j5 = j3;
        } else if (j3 != -1) {
            j5 = j3;
            zzcw.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j2;
            this.zze = j4;
            this.zzg = j5;
            this.zzh = null;
            this.zzi = i2;
        }
        z = true;
        zzcw.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j5;
        this.zzh = null;
        this.zzi = i2;
    }

    public static String zza(int i) {
        return "GET";
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzi;
        StringBuilder G = wo1.G("DataSpec[");
        G.append(zza(1));
        G.append(" ");
        G.append(valueOf);
        G.append(", ");
        G.append(j);
        G.append(", ");
        G.append(j2);
        G.append(", null, ");
        return wo1.z(G, i, "]");
    }

    public final boolean zzb(int i) {
        return (this.zzi & i) == i;
    }

    @Deprecated
    public zzev(Uri uri, @z1 byte[] bArr, long j, long j2, long j3, @z1 String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }
}