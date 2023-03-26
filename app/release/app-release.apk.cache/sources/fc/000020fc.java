package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.p7700g.p99005.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcce implements zzccj {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    @r2
    public boolean zza;
    @GuardedBy("lock")
    private final zzgol zzd;
    @GuardedBy("lock")
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccg zzi;
    private final zzccf zzn;
    @GuardedBy("lock")
    private final List zzf = new ArrayList();
    @GuardedBy("lock")
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcce(Context context, zzcfo zzcfoVar, zzccg zzccgVar, String str, zzccf zzccfVar, byte[] bArr) {
        Preconditions.checkNotNull(zzccgVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzccfVar;
        this.zzi = zzccgVar;
        for (String str2 : zzccgVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgol zza = zzgpq.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgom zza2 = zzgon.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza2.zza(str3);
        }
        zza.zzg((zzgon) zza2.zzal());
        zzgpl zza3 = zzgpm.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzcfoVar.zza;
        if (str4 != null) {
            zza3.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgpm) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zza() {
        return this.zzi;
    }

    public final /* synthetic */ zzfvl zzb(Map map) throws Exception {
        zzgpj zzgpjVar;
        zzfvl zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgpjVar = (zzgpj) this.zze.get(str);
                            }
                            if (zzgpjVar == null) {
                                zzcci.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgpjVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbjw.zzb.zze()).booleanValue()) {
                    zzcfi.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfvc.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if ((z && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z && this.zzi.zzd))) {
            synchronized (this.zzj) {
                for (zzgpj zzgpjVar2 : this.zze.values()) {
                    this.zzd.zzc((zzgpk) zzgpjVar2.zzal());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzcci.zzb()) {
                    String zzl = this.zzd.zzl();
                    String zzk = this.zzd.zzk();
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzl + "\n  clickUrl: " + zzk + "\n  resources: \n");
                    for (zzgpk zzgpkVar : this.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzgpkVar.zza());
                        sb.append("] ");
                        sb.append(zzgpkVar.zze());
                    }
                    zzcci.zza(sb.toString());
                }
                zzfvl zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgpq) this.zzd.zzal()).zzaw());
                if (zzcci.zzb()) {
                    zzb2.zzc(zzcbz.zza, zzcfv.zza);
                }
                zzm = zzfvc.zzm(zzb2, zzcca.zza, zzcfv.zzf);
            }
            return zzm;
        }
        return zzfvc.zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzgpj) this.zze.get(str)).zze(zzgpi.zza(3));
                }
                return;
            }
            zzgpj zzc2 = zzgpk.zzc();
            int zza = zzgpi.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgou zza2 = zzgox.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgos zza3 = zzgot.zza();
                        zza3.zza(zzgji.zzx(str2));
                        zza3.zzb(zzgji.zzx(str3));
                        zza2.zza((zzgot) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzgox) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfvl zzi = zzfvc.zzi(Collections.emptyMap());
            zzfuj zzfujVar = new zzfuj() { // from class: com.google.android.gms.internal.ads.zzccb
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzcce.this.zzb((Map) obj);
                }
            };
            zzfvm zzfvmVar = zzcfv.zzf;
            zzfvl zzn = zzfvc.zzn(zzi, zzfujVar, zzfvmVar);
            zzfvl zzo = zzfvc.zzo(zzn, 10L, TimeUnit.SECONDS, zzcfv.zzd);
            zzfvc.zzr(zzn, new zzccd(this, zzo), zzfvmVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgjf zzt = zzgji.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgol zzgolVar = this.zzd;
            zzgpc zza = zzgpe.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgolVar.zzi((zzgpe) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzccj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        zzcfi.zzh("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        zzcfi.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        zzcfi.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzcci.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            com.google.android.gms.ads.internal.util.zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcce.this.zzf(bitmap2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}