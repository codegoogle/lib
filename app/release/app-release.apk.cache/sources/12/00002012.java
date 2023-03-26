package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbto extends zzcfn {
    private final zzbtn zza;

    public zzbto(zzbtn zzbtnVar, @z1 String str) {
        super(str);
        this.zza = zzbtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfn, com.google.android.gms.internal.ads.zzcfa
    @s2
    public final boolean zza(String str) {
        zzcfi.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzcfi.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}