package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxb implements zzxa {
    private final WindowManager zza;

    private zzxb(WindowManager windowManager) {
        this.zza = windowManager;
    }

    @z1
    public static zzxa zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxb(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwy zzwyVar) {
        zzxe.zzb(zzwyVar.zza, this.zza.getDefaultDisplay());
    }
}