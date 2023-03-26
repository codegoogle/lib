package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerj implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzerj(zzfvm zzfvmVar, zzfcd zzfcdVar, @z1 PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfcdVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzerk zzc(zzerj zzerjVar) {
        final ArrayList arrayList = zzerjVar.zzb.zzg;
        return arrayList == null ? zzerf.zza : arrayList.isEmpty() ? zzerg.zza : new zzerk() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                zzerj.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerj.zzc(zzerj.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00e2, code lost:
        if (r9 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzb.zzi.zzc;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(i3);
        }
        JSONObject zzp = this.zzd.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.zzb.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbqs zzbqsVar = this.zzb.zzb;
        if (zzbqsVar != null) {
            if (TextUtils.isEmpty(zzbqsVar.zzc)) {
                String str4 = "p";
                if (zzbqsVar.zza < 2) {
                    int i5 = zzbqsVar.zzb;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            zzcfi.zzg("Instream ad video aspect ratio " + i5 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzbqsVar.zzd;
                    if (i6 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbqsVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }
}