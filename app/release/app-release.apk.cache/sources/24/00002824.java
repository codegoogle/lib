package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.anythink.core.api.ATAdConst;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerz implements zzetf {
    private final String zza;
    private final String zzb;

    public zzerz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfT)).booleanValue()) {
            bundle.putString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, this.zzb);
        } else {
            bundle.putString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, this.zza);
        }
    }
}