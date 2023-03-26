package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbre {
    public static void zza(zzbrf zzbrfVar, String str, Map map) {
        try {
            zzbrfVar.zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbrf zzbrfVar, String str, JSONObject jSONObject) {
        StringBuilder N = wo1.N("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(N.toString()));
        zzbrfVar.zza(N.toString());
    }

    public static void zzc(zzbrf zzbrfVar, String str, String str2) {
        zzbrfVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbrf zzbrfVar, String str, JSONObject jSONObject) {
        zzbrfVar.zzb(str, jSONObject.toString());
    }
}