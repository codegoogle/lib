package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfkl extends zzfkg {
    public zzfkl(zzfjz zzfjzVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjzVar, hashSet, jSONObject, j, null);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjt.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfjc zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfjc.zza()) != null) {
            for (zzfir zzfirVar : zza.zzc()) {
                if (((zzfkg) this).zza.contains(zzfirVar.zzh())) {
                    zzfirVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}