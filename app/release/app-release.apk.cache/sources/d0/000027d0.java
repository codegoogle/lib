package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzeow implements zzfuj {
    public static final /* synthetic */ zzeow zza = new zzeow();

    private /* synthetic */ zzeow() {
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfvc.zzi(new zzeoz(null, -1));
        }
        return zzfvc.zzi(new zzeoz(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}