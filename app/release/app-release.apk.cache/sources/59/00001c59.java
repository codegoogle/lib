package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzakh implements zzajw {
    public final /* synthetic */ Context zza;
    private File zzb = null;

    public zzakh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}