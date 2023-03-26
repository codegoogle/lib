package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfoz extends zzfpe {
    public final /* synthetic */ zzfpa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoz(zzfpa zzfpaVar, zzfpg zzfpgVar, CharSequence charSequence) {
        super(zzfpgVar, charSequence);
        this.zza = zzfpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final int zzd(int i) {
        zzfoh zzfohVar = this.zza.zza;
        CharSequence charSequence = ((zzfpe) this).zzb;
        int length = charSequence.length();
        zzfou.zzb(i, length, la1.l);
        while (i < length) {
            if (zzfohVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}