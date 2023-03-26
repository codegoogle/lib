package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxn extends zzbpj {
    private final zzdxq zza;
    private final zzdxl zzb;
    private final Map zzc = new HashMap();

    public zzdxn(zzdxq zzdxqVar, zzdxl zzdxlVar) {
        this.zza = zzdxqVar;
        this.zzb = zzdxlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.android.gms.ads.internal.client.zzl zzc(Map map) {
        char c;
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case 2:
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzg(1);
                            break;
                        } else {
                            zzmVar.zzg(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.zzh(1);
                            break;
                        } else {
                            zzmVar.zzh(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zzmVar.zzf(nextString);
                            break;
                        }
                    case 6:
                        zzmVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            zzcfi.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzl zza = zzmVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzl(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.zzbpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(String str) throws RemoteException {
        char c;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzp();
            Map zzK = com.google.android.gms.ads.internal.util.zzs.zzK(parse);
            String str2 = (String) zzK.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zze("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c2 = 0;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str2.equals("dispose_all")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.zzc.clear();
                this.zzb.zza();
            } else if (c != 1) {
                String str3 = (String) zzK.get("obj_id");
                try {
                    str3.getClass();
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 393881811:
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhT)).intValue()) {
                                zzcfi.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map = this.zzc;
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                zzcfi.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str4 = (String) zzK.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                zzcfi.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdxh zzb = this.zza.zzb();
                            zzb.zzb(parseLong);
                            zzb.zza(str4);
                            this.zzc.put(valueOf, zzb.zzc().zza());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            zzdxg zzdxgVar = (zzdxg) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdxgVar == null) {
                                zzcfi.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                            zzdxgVar.zzb(zzc(zzK));
                            return;
                        case 2:
                            zzdxg zzdxgVar2 = (zzdxg) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdxgVar2 == null) {
                                zzcfi.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                            zzdxgVar2.zzc();
                            return;
                        case 3:
                            if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhT)).intValue()) {
                                zzcfi.zzj("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map2 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                zzcfi.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str5 = (String) zzK.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                zzcfi.zzj("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdxh zzb2 = this.zza.zzb();
                            zzb2.zzb(parseLong);
                            zzb2.zza(str5);
                            this.zzc.put(valueOf2, zzb2.zzc().zzb());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            zzdxg zzdxgVar3 = (zzdxg) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdxgVar3 == null) {
                                zzcfi.zze("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                            zzdxgVar3.zzb(zzc(zzK));
                            return;
                        case 5:
                            zzdxg zzdxgVar4 = (zzdxg) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdxgVar4 == null) {
                                zzcfi.zze("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                            zzdxgVar4.zzc();
                            return;
                        case 6:
                            Map map3 = this.zzc;
                            Long valueOf3 = Long.valueOf(parseLong);
                            zzdxg zzdxgVar5 = (zzdxg) map3.get(valueOf3);
                            if (zzdxgVar5 == null) {
                                zzcfi.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdxgVar5.zza();
                            this.zzc.remove(valueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            zzcfi.zze("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    zzcfi.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                }
            } else {
                for (zzdxg zzdxgVar6 : this.zzc.values()) {
                    zzdxgVar6.zza();
                }
                this.zzc.clear();
            }
        }
    }
}