package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.anythink.core.common.e.k;
import com.anythink.expressad.foundation.g.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenz implements zzetg {
    private final zzetg zza;
    private final zzfcd zzb;
    private final Context zzc;
    private final zzcer zzd;

    public zzenz(zzepq zzepqVar, zzfcd zzfcdVar, Context context, zzcer zzcerVar) {
        this.zza = zzepqVar;
        this.zzb = zzfcdVar;
        this.zzc = context;
        this.zzd = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzm(this.zza.zzb(), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzenz.this.zzc((zzetl) obj);
            }
        }, zzcfv.zzf);
    }

    public final /* synthetic */ zzeoa zzc(zzetl zzetlVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append(a.bQ);
                    }
                    int i5 = zzqVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzqVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, a.bQ);
                } else {
                    i3 = 0;
                }
                sb.insert(i3, k.a);
            }
        }
        return new zzeoa(zzqVar, str, z, sb.toString(), f, i, i2, str2, this.zzb.zzp);
    }
}