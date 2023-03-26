package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaw {
    public final Uri zza;
    public final List zze;
    public final zzfrj zzg;
    @Deprecated
    public final List zzh;
    @z1
    public final Object zzi;
    @z1
    public final String zzb = null;
    @z1
    public final zzaq zzc = null;
    @z1
    public final zzag zzd = null;
    @z1
    public final String zzf = null;

    public /* synthetic */ zzaw(Uri uri, String str, zzaq zzaqVar, zzag zzagVar, List list, String str2, zzfrj zzfrjVar, Object obj, zzav zzavVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfrjVar;
        zzfrg zzi = zzfrj.zzi();
        if (zzfrjVar.size() <= 0) {
            this.zzh = zzi.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzazVar = (zzaz) zzfrjVar.get(0);
        throw null;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            return this.zza.equals(zzawVar.zza) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && this.zze.equals(zzawVar.zze) && zzeg.zzS(null, null) && this.zzg.equals(zzawVar.zzg) && zzeg.zzS(null, null);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zze.hashCode();
        return (this.zzg.hashCode() + ((hashCode + (this.zza.hashCode() * 923521)) * 961)) * 31;
    }
}