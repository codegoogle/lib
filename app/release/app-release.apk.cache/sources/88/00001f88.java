package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.d.a.b;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbol {
    public static final zzbom zza = zzbnx.zza;
    public static final zzbom zzb = zzbny.zza;
    public static final zzbom zzc = zzbnq.zza;
    public static final zzbom zzd = new zzbod();
    public static final zzbom zze = new zzboe();
    public static final zzbom zzf = zzbnw.zza;
    public static final zzbom zzg = new zzbof();
    public static final zzbom zzh = new zzbog();
    public static final zzbom zzi = zzbnv.zza;
    public static final zzbom zzj = new zzboh();
    public static final zzbom zzk = new zzboi();
    public static final zzbom zzl = new zzcji();
    public static final zzbom zzm = new zzcjj();
    public static final zzbom zzn = new zzbnp();
    public static final zzbpa zzo = new zzbpa();
    public static final zzbom zzp = new zzboj();
    public static final zzbom zzq = new zzbok();
    public static final zzbom zzr = new zzbnz();
    public static final zzbom zzs = new zzboa();
    public static final zzbom zzt = new zzbob();

    public static zzbom zza(final zzdjg zzdjgVar) {
        return new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnu
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzcli zzcliVar = (zzcli) obj;
                zzbol.zzd(map, zzdjg.this);
                String str = (String) map.get("u");
                if (str == null) {
                    zzcfi.zzj("URL missing from click GMSG.");
                } else {
                    zzfvc.zzr(zzbol.zzb(zzcliVar, str), new zzboc(zzcliVar), zzcfv.zza);
                }
            }
        };
    }

    public static zzfvl zzb(zzcli zzcliVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaoc zzK = zzcliVar.zzK();
            if (zzK != null && zzK.zzf(parse)) {
                parse = zzK.zza(parse, zzcliVar.getContext(), zzcliVar.zzH(), zzcliVar.zzk());
            }
        } catch (zzaod unused) {
            zzcfi.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzcdp.zzb(parse, zzcliVar.getContext());
        long longValue = ((Long) zzbjo.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 221908400) {
            zzfut zzv = zzfut.zzv(zzcliVar.zzT());
            zzbnr zzbnrVar = zzbnr.zza;
            zzfvm zzfvmVar = zzcfv.zzf;
            return zzfvc.zzf(zzfvc.zzm(zzfvc.zzf(zzv, Throwable.class, zzbnrVar, zzfvmVar), new zzfok() { // from class: com.google.android.gms.internal.ads.zzbns
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    String str3 = (String) obj;
                    zzbom zzbomVar = zzbol.zza;
                    if (str3 != null) {
                        if (((Boolean) zzbjo.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i = 0; i < 3; i++) {
                                if (!host.endsWith(strArr[i])) {
                                }
                            }
                        }
                        String str4 = (String) zzbjo.zza.zze();
                        String str5 = (String) zzbjo.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str2.replace(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, zzfvmVar), Throwable.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzbnt
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    Throwable th = (Throwable) obj;
                    zzbom zzbomVar = zzbol.zza;
                    if (((Boolean) zzbjo.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, zzfvmVar);
        }
        return zzfvc.zzi(zzb2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzt(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zzc(zzcmj zzcmjVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcmjVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString(b.dH);
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        zzcfi.zzh("Error parsing the intent data.", e);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            zzcfi.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((zzbrd) zzcmjVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbrd) zzcmjVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbrd) zzcmjVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzd(Map map, zzdjg zzdjgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzii)).booleanValue() && map.containsKey(b.bH) && ((String) map.get(b.bH)).equals("1") && zzdjgVar != null) {
            zzdjgVar.zzq();
        }
    }
}