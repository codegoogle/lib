package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahk {
    public final int zza;
    @z1
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzahk(int i, @z1 String str, @z1 List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}