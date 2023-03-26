package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzenv implements zzfuj {
    public static final /* synthetic */ zzenv zza = new zzenv();

    private /* synthetic */ zzenv() {
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object obj) {
        final String str = (String) obj;
        return zzfvc.zzi(new zzetf() { // from class: com.google.android.gms.internal.ads.zzenu
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj2) {
                ((Bundle) obj2).putString("ms", str);
            }
        });
    }
}