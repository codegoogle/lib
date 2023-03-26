package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdog implements zzbko {
    public final /* synthetic */ zzdpc zza;
    public final /* synthetic */ ViewGroup zzb;

    public zzdog(zzdpc zzdpcVar, ViewGroup viewGroup) {
        this.zza = zzdpcVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzc() {
        zzdpc zzdpcVar = this.zza;
        zzfrj zzfrjVar = zzdod.zza;
        Map zzm = zzdpcVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfrjVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzm.get((String) zzfrjVar.get(i)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}