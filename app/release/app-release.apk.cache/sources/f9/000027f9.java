package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.anythink.expressad.video.dynview.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqj implements zzetf {
    public final String zza;
    public final boolean zzb;

    public zzeqj(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString(a.P, "1");
        }
    }
}