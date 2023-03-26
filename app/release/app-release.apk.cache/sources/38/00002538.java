package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.basead.d.g;
import com.anythink.expressad.foundation.c.d;
import com.google.android.gms.ads.AdSize;
import com.p7700g.p99005.ck3;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdqh {
    private final Context zza;
    private final zzdpq zzb;
    private final zzaoc zzc;
    private final zzcfo zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdm zzf;
    private final Executor zzg;
    private final zzbkp zzh;
    private final zzdqz zzi;
    private final zzdtp zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsk zzl;
    private final zzdwh zzm;
    private final zzfgp zzn;
    private final zzfii zzo;
    private final zzees zzp;

    public zzdqh(Context context, zzdpq zzdpqVar, zzaoc zzaocVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, Executor executor, zzfcd zzfcdVar, zzdqz zzdqzVar, zzdtp zzdtpVar, ScheduledExecutorService scheduledExecutorService, zzdwh zzdwhVar, zzfgp zzfgpVar, zzfii zzfiiVar, zzees zzeesVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = zzdpqVar;
        this.zzc = zzaocVar;
        this.zzd = zzcfoVar;
        this.zze = zzaVar;
        this.zzf = zzbdmVar;
        this.zzg = executor;
        this.zzh = zzfcdVar.zzi;
        this.zzi = zzdqzVar;
        this.zzj = zzdtpVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdwhVar;
        this.zzn = zzfgpVar;
        this.zzo = zzfiiVar;
        this.zzp = zzeesVar;
        this.zzl = zzdskVar;
    }

    @z1
    public static final com.google.android.gms.ads.internal.client.zzef zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfrj.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.google.android.gms.ads.internal.client.zzef zzr = zzr(optJSONArray.optJSONObject(i));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfrj.zzm(arrayList);
        }
        return zzfrj.zzo();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }

    private static zzfvl zzl(zzfvl zzfvlVar, Object obj) {
        return zzfvc.zzg(zzfvlVar, Exception.class, new zzfuj(null) { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzfvc.zzi(null);
            }
        }, zzcfv.zzf);
    }

    private static zzfvl zzm(boolean z, final zzfvl zzfvlVar, Object obj) {
        if (z) {
            return zzfvc.zzn(zzfvlVar, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqc
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj2) {
                    return obj2 != null ? zzfvl.this : zzfvc.zzh(new zzeit(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcfv.zzf);
        }
        return zzl(zzfvlVar, null);
    }

    private final zzfvl zzn(@z1 JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfvc.zzi(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfvc.zzi(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfvc.zzi(new zzbkn(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfvc.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                String str = optString;
                return new zzbkn(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final zzfvl zzo(@z1 JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = z2 ? jSONArray.length() : 1;
            for (int i = 0; i < length; i++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i), z));
            }
            return zzfvc.zzm(zzfvc.zze(arrayList), zzdqd.zza, this.zzg);
        }
        return zzfvc.zzi(Collections.emptyList());
    }

    private final zzfvl zzp(JSONObject jSONObject, zzfbl zzfblVar, zzfbo zzfboVar) {
        final zzfvl zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(ck3.a), zzfblVar, zzfboVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfvc.zzn(zzb, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                zzfvl zzfvlVar = zzfvl.this;
                zzcli zzcliVar = (zzcli) obj;
                if (zzcliVar == null || zzcliVar.zzs() == null) {
                    throw new zzeit(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfvlVar;
            }
        }, zzcfv.zzf);
    }

    @z1
    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(g.i), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @z1
    private static final com.google.android.gms.ads.internal.client.zzef zzr(@z1 JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzef(optString, optString2);
    }

    public final /* synthetic */ zzbkk zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbkk(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ zzfvl zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbl zzfblVar, zzfbo zzfboVar, String str, String str2, Object obj) throws Exception {
        zzcli zza = this.zzj.zza(zzqVar, zzfblVar, zzfboVar);
        final zzcfz zza2 = zzcfz.zza(zza);
        zzdsh zzb = this.zzl.zzb();
        zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zza.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zza.zzaf("/getNativeClickMeta", zzbol.zzt);
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzcfz zzcfzVar = zzcfz.this;
                if (z) {
                    zzcfzVar.zzb();
                } else {
                    zzcfzVar.zze(new zzeit(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfvl zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcli zza = zzclu.zza(this.zza, zzcmx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzcfz zza2 = zzcfz.zza(zza);
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzcfz.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzee)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), tm4.D, "base64");
        } else {
            zza.loadData(str, tm4.D, "UTF-8");
        }
        return zza2;
    }

    public final zzfvl zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfvc.zzi(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfvc.zzm(zzo(optJSONArray, false, true), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdpy
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzdqh.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfvl zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfvl zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbkp zzbkpVar = this.zzh;
        return zzo(optJSONArray, zzbkpVar.zzb, zzbkpVar.zzd);
    }

    public final zzfvl zzg(JSONObject jSONObject, String str, final zzfbl zzfblVar, final zzfbo zzfboVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhX)).booleanValue()) {
            return zzfvc.zzi(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzfvc.zzi(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString(ck3.a);
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzfvc.zzi(null);
            }
            final zzfvl zzn = zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdpz
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzdqh.this.zzb(zzk, zzfblVar, zzfboVar, optString, optString2, obj);
                }
            }, zzcfv.zze);
            return zzfvc.zzn(zzn, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqa
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    zzfvl zzfvlVar = zzfvl.this;
                    if (((zzcli) obj) != null) {
                        return zzfvlVar;
                    }
                    throw new zzeit(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcfv.zzf);
        }
        return zzfvc.zzi(null);
    }

    public final zzfvl zzh(JSONObject jSONObject, zzfbl zzfblVar, zzfbo zzfboVar) {
        zzfvl zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(d.a.a);
            if (optJSONObject == null) {
                return zzfvc.zzi(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhW)).booleanValue() && optJSONObject.has(ck3.a)) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    zzcfi.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzfvc.zzi(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzfvc.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcQ)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfblVar, zzfboVar);
            return zzl(zzfvc.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcQ)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzfblVar, zzfboVar);
    }
}