package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzbp extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbp(@z1 String str, @z1 Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbp zza(@z1 String str, @z1 Throwable th) {
        return new zzbp(str, th, true, 1);
    }

    public static zzbp zzb(@z1 String str, @z1 Throwable th) {
        return new zzbp(str, th, true, 0);
    }

    public static zzbp zzc(@z1 String str) {
        return new zzbp(str, null, false, 1);
    }
}