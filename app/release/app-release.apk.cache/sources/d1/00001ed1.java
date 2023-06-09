package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbhr {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbhr(int i, String str, Object obj, zzbhq zzbhqVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzay.zza().zzd(this);
    }

    public static zzbhr zzf(int i, String str, float f) {
        return new zzbho(1, str, Float.valueOf(f));
    }

    public static zzbhr zzg(int i, String str, int i2) {
        return new zzbhm(1, str, Integer.valueOf(i2));
    }

    public static zzbhr zzh(int i, String str, long j) {
        return new zzbhn(1, str, Long.valueOf(j));
    }

    public static zzbhr zzi(int i, String str, Boolean bool) {
        return new zzbhl(i, str, bool);
    }

    public static zzbhr zzj(int i, String str, String str2) {
        return new zzbhp(1, str, str2);
    }

    public static zzbhr zzk(int i, String str) {
        zzbhr zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzay.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzay.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}