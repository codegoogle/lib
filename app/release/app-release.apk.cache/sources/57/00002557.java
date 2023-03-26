package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.y7;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrl extends zzblu {
    private final Context zza;
    private final zzdnh zzb;
    private zzdoh zzc;
    private zzdnc zzd;

    public zzdrl(Context context, zzdnh zzdnhVar, zzdoh zzdohVar, zzdnc zzdncVar) {
        this.zza = context;
        this.zzb = zzdnhVar;
        this.zzc = zzdohVar;
        this.zzd = zzdncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final zzblb zzf(String str) {
        return (zzblb) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final String zzh() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final String zzi(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final List zzj() {
        y7 zzh = this.zzb.zzh();
        y7 zzi = this.zzb.zzi();
        String[] strArr = new String[zzi.size() + zzh.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzh.size()) {
            strArr[i3] = (String) zzh.n(i2);
            i2++;
            i3++;
        }
        while (i < zzi.size()) {
            strArr[i3] = (String) zzi.n(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzk() {
        zzdnc zzdncVar = this.zzd;
        if (zzdncVar != null) {
            zzdncVar.zzV();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzl() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            zzcfi.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzA)) {
            zzcfi.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdnc zzdncVar = this.zzd;
            if (zzdncVar != null) {
                zzdncVar.zzq(zzA, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzm(String str) {
        zzdnc zzdncVar = this.zzd;
        if (zzdncVar != null) {
            zzdncVar.zzy(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzn() {
        zzdnc zzdncVar = this.zzd;
        if (zzdncVar != null) {
            zzdncVar.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzo(IObjectWrapper iObjectWrapper) {
        zzdnc zzdncVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdncVar = this.zzd) == null) {
            return;
        }
        zzdncVar.zzC((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzp() {
        zzdnc zzdncVar = this.zzd;
        return (zzdncVar == null || zzdncVar.zzO()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        zzdoh zzdohVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdohVar = this.zzc) != null && zzdohVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzr().zzaq(new zzdrk(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzr() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzd(zzu);
            if (this.zzb.zzq() != null) {
                this.zzb.zzq().zzd("onSdkLoaded", new q7());
                return true;
            }
            return true;
        }
        zzcfi.zzj("Trying to start OMID session before creation.");
        return false;
    }
}