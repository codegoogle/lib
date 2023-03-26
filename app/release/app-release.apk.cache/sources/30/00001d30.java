package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.p7700g.p99005.wo1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzasg {
    public static final zzasg zza = new zzasg(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    public zzasg(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzasg) && Arrays.equals(this.zzb, ((zzasg) obj).zzb);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        return wo1.u("AudioCapabilities[maxChannelCount=2, supportedEncodings=", Arrays.toString(this.zzb), "]");
    }
}