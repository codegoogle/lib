package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfum extends zzfuc {
    @CheckForNull
    private List zza;

    public zzfum(zzfre zzfreVar, boolean z) {
        super(zzfreVar, true, true);
        List zza;
        if (zzfreVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfrx.zza(zzfreVar.size());
        }
        for (int i = 0; i < zzfreVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzful(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}