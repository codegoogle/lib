package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmv {
    public static final zzmv zza = new zzmv(new int[]{2}, 8);
    private static final zzmv zzb = new zzmv(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzmv(@z1 int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzmv) && Arrays.equals(this.zzc, ((zzmv) obj).zzc);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        return wo1.u("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.zzc), "]");
    }

    public final boolean zza(int i) {
        return Arrays.binarySearch(this.zzc, i) >= 0;
    }
}