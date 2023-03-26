package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.anythink.expressad.video.module.a.a.m;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.it0;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.y5;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefa extends zzbxk {
    private final Context zza;
    private final zzdwh zzb;
    private final zzcfn zzc;
    private final zzees zzd;
    private final zzfgp zze;

    public zzefa(Context context, zzees zzeesVar, zzcfn zzcfnVar, zzdwh zzdwhVar, zzfgp zzfgpVar) {
        this.zza = context;
        this.zzb = zzdwhVar;
        this.zzc = zzcfnVar;
        this.zzd = zzeesVar;
        this.zze = zzfgpVar;
    }

    public static void zzc(Context context, zzdwh zzdwhVar, zzfgp zzfgpVar, zzees zzeesVar, String str, String str2) {
        zzd(context, zzdwhVar, zzfgpVar, zzeesVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdwh zzdwhVar, zzfgp zzfgpVar, zzees zzeesVar, String str, String str2, Map map) {
        String zzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzb = zzfgo.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? y5.g : "offline");
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zzf = zzfgpVar.zza(zzb);
        } else {
            zzdwg zza = zzdwhVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? y5.g : "offline");
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zzf = zza.zzf();
        }
        zzeesVar.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), str, zzf, 2));
    }

    public static void zzh(final Activity activity, @z1 final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final zzees zzeesVar, final zzdwh zzdwhVar, final zzfgp zzfgpVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, com.google.android.gms.ads.internal.zzt.zzq().zza());
        final Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builder.setTitle(zzd == null ? "Open ad when you're back online." : zzd.getString(R.string.offline_opt_in_title)).setMessage(zzd == null ? "We'll send you a notification with a link to the advertiser site." : zzd.getString(R.string.offline_opt_in_message)).setPositiveButton(zzd == null ? it0.a : zzd.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeew
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
                if (r0.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(DialogInterface dialogInterface, int i) {
                final com.google.android.gms.ads.internal.overlay.zzl zzlVar2;
                zzdwh zzdwhVar2 = zzdwh.this;
                Activity activity2 = activity;
                zzfgp zzfgpVar2 = zzfgpVar;
                zzees zzeesVar2 = zzeesVar;
                String str3 = str;
                com.google.android.gms.ads.internal.util.zzbr zzbrVar2 = zzbrVar;
                String str4 = str2;
                Resources resources = zzd;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar3 = zzlVar;
                if (zzdwhVar2 != null) {
                    zzlVar2 = zzlVar3;
                    zzefa.zzd(activity2, zzdwhVar2, zzfgpVar2, zzeesVar2, str3, "dialog_click", wo1.R("dialog_action", "confirm"));
                } else {
                    zzlVar2 = zzlVar3;
                }
                try {
                } catch (RemoteException e) {
                    zzcfi.zzh("Failed to schedule offline notification poster.", e);
                }
                zzeesVar2.zzc(str3);
                if (zzdwhVar2 != null) {
                    zzefa.zzc(activity2, zzdwhVar2, zzfgpVar2, zzeesVar2, str3, "offline_notification_worker_not_scheduled");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, com.google.android.gms.ads.internal.zzt.zzq().zza());
                builder2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeev
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zzl zzlVar4 = com.google.android.gms.ads.internal.overlay.zzl.this;
                        if (zzlVar4 != null) {
                            zzlVar4.zzb();
                        }
                    }
                });
                AlertDialog create = builder2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new zzeez(create, timer, zzlVar2), m.af);
            }
        }).setNegativeButton(zzd == null ? "No thanks" : zzd.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzees zzeesVar2 = zzees.this;
                String str3 = str;
                zzdwh zzdwhVar2 = zzdwhVar;
                Activity activity2 = activity;
                zzfgp zzfgpVar2 = zzfgpVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeesVar2.zzc(str3);
                if (zzdwhVar2 != null) {
                    zzefa.zzd(activity2, zzdwhVar2, zzfgpVar2, zzeesVar2, str3, "dialog_click", wo1.R("dialog_action", "dismiss"));
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzees zzeesVar2 = zzees.this;
                String str3 = str;
                zzdwh zzdwhVar2 = zzdwhVar;
                Activity activity2 = activity;
                zzfgp zzfgpVar2 = zzfgpVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeesVar2.zzc(str3);
                if (zzdwhVar2 != null) {
                    zzefa.zzd(activity2, zzdwhVar2, zzfgpVar2, zzeesVar2, str3, "dialog_click", wo1.R("dialog_action", "dismiss"));
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(kg.m.a.e);
            boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzv ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzees.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzcfi.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf() {
        zzees zzeesVar = this.zzd;
        final zzcfn zzcfnVar = this.zzc;
        zzeesVar.zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                zzees.zzj((SQLiteDatabase) obj, zzcfn.this);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzg(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(kg.m.a.e, str);
        int i = zzfoa.zza;
        PendingIntent zza = zzfoa.zza(context, 0, intent, i | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent zza2 = zzfoa.zza(context, 0, intent2, i | 1073741824, 0);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        ((NotificationManager) context.getSystemService(qm3.b.a)).notify(str2, 54321, new kg.g(context, "offline_notification_channel").P(zzd == null ? "View the ad you saved when you were offline" : zzd.getString(R.string.offline_notification_title)).O(zzd == null ? "Tap to open ad" : zzd.getString(R.string.offline_notification_text)).D(true).U(zza2).N(zza).t0(context.getApplicationInfo().icon).h());
        zzi(str2, "offline_notification_impression", new HashMap());
    }
}