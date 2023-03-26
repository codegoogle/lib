package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.anythink.expressad.foundation.c.d;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.z1;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbzz {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:20:0x0089, B:22:0x0097), top: B:34:0x0089 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbzz(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo packageInfo2;
        PackageManager packageManager = context.getPackageManager();
        zzc(context);
        zze(context);
        zzd(context);
        Locale locale = Locale.getDefault();
        this.zzq = zzb(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zzb(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        this.zzt = zzcfb.zzq();
        this.zzu = DeviceProperties.isLatchsky(context);
        this.zzv = DeviceProperties.isSidewinder(context);
        this.zzw = locale.getLanguage();
        ResolveInfo zzb = zzb(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (zzb != null && (activityInfo = zzb.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + CryptoConstants.ALIAS_SEPARATOR + activityInfo.packageName;
                this.zzx = str;
                packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    str2 = packageInfo2.versionCode + CryptoConstants.ALIAS_SEPARATOR + packageInfo2.packageName;
                }
                this.zzB = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.zzy = displayMetrics.density;
                    this.zzz = displayMetrics.widthPixels;
                    this.zzA = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.zzx = str;
        packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        this.zzB = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    @z1
    private static ResolveInfo zzb(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void zzc(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    private final void zzd(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.zzm = registerReceiver.getIntExtra(d.a.w, -1) / registerReceiver.getIntExtra("scale", -1);
        this.zzn = (intExtra == 2 || intExtra == 5) ? true : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zze(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhe)).booleanValue()) {
                networkType = 0;
                this.zzi = networkType;
                this.zzj = telephonyManager.getPhoneType();
                this.zzh = -2;
                this.zzk = false;
                this.zzl = -1;
                com.google.android.gms.ads.internal.zzt.zzp();
                if (com.google.android.gms.ads.internal.util.zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.zzh = activeNetworkInfo.getType();
                    this.zzl = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.zzh = -1;
                }
                this.zzk = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    public final zzcaa zza() {
        return new zzcaa(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbzz(Context context, zzcaa zzcaaVar) {
        zzc(context);
        zze(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbix.zzg(context);
        this.zzq = zzcaaVar.zza;
        this.zzr = zzcaaVar.zzb;
        this.zzs = zzcaaVar.zzd;
        this.zzt = zzcaaVar.zze;
        this.zzu = zzcaaVar.zzf;
        this.zzv = zzcaaVar.zzg;
        this.zzw = zzcaaVar.zzh;
        this.zzx = zzcaaVar.zzi;
        this.zzB = zzcaaVar.zzj;
        this.zzy = zzcaaVar.zzm;
        this.zzz = zzcaaVar.zzn;
        this.zzA = zzcaaVar.zzo;
    }
}