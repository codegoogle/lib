package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.d.a.b;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.ck3;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.pg;
import com.p7700g.p99005.z1;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbox implements zzbom {
    @z1
    private final com.google.android.gms.ads.internal.zzb zza;
    @z1
    private final zzdwh zzb;
    @z1
    private final zzfgp zzc;
    @z1
    private final zzbwp zze;
    @z1
    private final zzees zzf;
    private com.google.android.gms.ads.internal.overlay.zzu zzg = null;
    private final zzcfn zzd = new zzcfn(null);

    public zzbox(com.google.android.gms.ads.internal.zzb zzbVar, zzbwp zzbwpVar, zzees zzeesVar, zzdwh zzdwhVar, zzfgp zzfgpVar) {
        this.zza = zzbVar;
        this.zze = zzbwpVar;
        this.zzf = zzeesVar;
        this.zzb = zzdwhVar;
        this.zzc = zzfgpVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get(ij3.b);
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzaoc zzaocVar, Uri uri, View view, @z1 Activity activity) {
        if (zzaocVar == null) {
            return uri;
        }
        try {
            return zzaocVar.zze(uri) ? zzaocVar.zza(uri, context, view, activity) : uri;
        } catch (zzaod unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcfi.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzbow.zzc(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        boolean z3 = true;
        zzi(true);
        zzcli zzcliVar = (zzcli) zzaVar;
        Context context = zzcliVar.getContext();
        zzaoc zzK = zzcliVar.zzK();
        View zzH = zzcliVar.zzH();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri zzd = zzd(zzc(context, zzK, Uri.parse(str2), zzH, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdA)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent zza = zzbow.zza(zzd, context, zzK, zzH);
            Intent zza2 = zzbow.zza(build, context, zzK, zzH);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza2);
            }
            ResolveInfo zzd2 = zzbow.zzd(zza, arrayList, context, zzK, zzH);
            if (zzd2 != null) {
                intent = zzbow.zzb(zza, zzd2, context, zzK, zzH);
            } else {
                if (zza2 != null && (zzc = zzbow.zzc(zza2, context, zzK, zzH)) != null) {
                    intent = zzbow.zzb(zza, zzc, context, zzK, zzH);
                }
                if (arrayList.size() != 0) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                    if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        intent = zzbow.zzb(zza, resolveInfo, context, zzK, zzH);
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                    if (parseBoolean) {
                        intent = zzbow.zzb(zza, (ResolveInfo) arrayList.get(0), context, zzK, zzH);
                    }
                }
                intent = zza;
            }
        }
        if (!z || this.zzf == null || intent == null || !zzj(zzaVar, zzcliVar.getContext(), intent.getData().toString(), str)) {
            try {
                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2);
            } catch (ActivityNotFoundException e) {
                zzcfi.zzj(e.getMessage());
            }
        }
    }

    private final void zzi(boolean z) {
        zzbwp zzbwpVar = this.zze;
        if (zzbwpVar != null) {
            zzbwpVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdwh zzdwhVar = this.zzb;
        if (zzdwhVar != null) {
            zzefa.zzc(context, zzdwhVar, this.zzc, this.zzf, str2, "offline_open");
        }
        zzcli zzcliVar = (zzcli) zzaVar;
        boolean z = zzcliVar.zzQ().zzi() && zzcliVar.zzk() == null;
        if (zzv) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (pg.p(context).a() && zzw != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
                if (zzcliVar.zzQ().zzi()) {
                    zzefa.zzh(zzcliVar.zzk(), null, zzw, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcmn) zzaVar).zzaG(zzw, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdwh zzdwhVar2 = this.zzb;
                if (zzdwhVar2 != null) {
                    zzefa.zzc(context, zzdwhVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!pg.p(context).a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzw == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzefa.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgp zzfgpVar = this.zzc;
            zzfgo zzb = zzfgo.zzb("cct_action");
            zzb.zza("cct_open_status", zzbiw.zza(i));
            zzfgpVar.zzb(zzb);
            return;
        }
        zzdwg zza = this.zzb.zza();
        zza.zzb("action", "cct_action");
        zza.zzb("cct_open_status", zzbiw.zza(i));
        zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    /* renamed from: zze */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        zzcli zzcliVar = (zzcli) zzaVar;
        String zzc = zzcdp.zzc((String) map.get("u"), zzcliVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzcfi.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzfbl zzF = zzcliVar.zzF();
        zzfbo zzR = zzcliVar.zzR();
        boolean z2 = false;
        if (zzF == null || zzR == null) {
            str = "";
            z = false;
        } else {
            z = zzF.zzak;
            str = zzR.zzb;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzih)).booleanValue() && map.containsKey(b.bH) && ((String) map.get(b.bH)).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcliVar.zzaC()) {
                zzcfi.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzi(false);
            ((zzcmn) zzaVar).zzaH(zzf(map), zzb(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzi(false);
            if (zzc != null) {
                ((zzcmn) zzaVar).zzaI(zzf(map), zzb(map), zzc, z3);
            } else {
                ((zzcmn) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get(ck3.a), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcliVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdC)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdI)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdG)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdH);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfpg.zzc(zzfoh.zzc(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zzg = zzbix.zzg(zzcliVar.getContext());
            if (z2) {
                if (!zzg) {
                    zzk(4);
                } else {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        zzcfi.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk()));
                    if (z && this.zzf != null && zzj(zzaVar, zzcliVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbou(this);
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzh(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcfi.zzj("Package name missing from open app action.");
                } else if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), str5, str)) {
                    PackageManager packageManager = zzcliVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzcfi.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    }
                }
            }
        } else {
            zzi(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e) {
                    zzcfi.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), data, zzcliVar.zzH(), zzcliVar.zzk()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgU)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhf)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.zzg = new zzbov(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), intent2.getData().toString(), str)) {
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbrd) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk())).toString();
            }
            if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), zzc, str)) {
                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzc, (String) map.get(b.dH), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzbrd) zzaVar).zzd("openIntentAsync", hashMap4);
            }
        }
    }
}