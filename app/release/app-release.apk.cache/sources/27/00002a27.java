package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfl extends zzfj {
    public final int zzd;
    @z1
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfl(int i, @z1 String str, @z1 IOException iOException, Map map, zzev zzevVar, byte[] bArr) {
        super(wo1.l("Response code: ", i), iOException, zzevVar, 2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}