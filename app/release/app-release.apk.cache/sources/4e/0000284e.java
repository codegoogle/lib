package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzetn implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    public zzetn(zzfvm zzfvmVar, Context context) {
        this.zza = zzfvmVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetn.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(1:60)|4|(1:6)(1:59)|7|(3:9|(2:12|10)|13)|14|(3:53|54|(14:56|17|18|19|(9:21|22|23|(1:25)(2:36|(3:39|(3:42|(2:45|46)(1:44)|40)|47))|26|27|(1:35)(1:31)|32|33)|49|23|(0)(0)|26|27|(1:29)|35|32|33))|16|17|18|19|(0)|49|23|(0)(0)|26|27|(0)|35|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:26:0x009c, B:28:0x00aa), top: B:57:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzetl zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        String str3;
        boolean equals;
        PackageInfo packageInfo2;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z = zzd(packageManager, "geo:0,0?q=donuts") != null;
        boolean z2 = zzd(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        boolean zzq = zzcfb.zzq();
        boolean isLatchsky = DeviceProperties.isLatchsky(this.zzb);
        boolean isSidewinder = DeviceProperties.isSidewinder(this.zzb);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        Context context = this.zzb;
        ResolveInfo zzd = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd != null && (activityInfo = zzd.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + CryptoConstants.ALIAS_SEPARATOR + activityInfo.packageName;
                packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    str2 = packageInfo2.versionCode + CryptoConstants.ALIAS_SEPARATOR + packageInfo2.packageName;
                    String str4 = Build.FINGERPRINT;
                    Context context2 = this.zzb;
                    if (packageManager == null) {
                        str3 = str4;
                    } else {
                        str3 = str4;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzgri.zza(context2));
                                    break;
                                }
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    return new zzetl(z, z2, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziy)).booleanValue() && DeviceProperties.isBstar(this.zzb));
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                Context context22 = this.zzb;
                if (packageManager == null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzt.zzp();
                return new zzetl(z, z2, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziy)).booleanValue() && DeviceProperties.isBstar(this.zzb));
            }
        }
        str = null;
        packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str2 = null;
        String str422 = Build.FINGERPRINT;
        Context context222 = this.zzb;
        if (packageManager == null) {
        }
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzetl(z, z2, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziy)).booleanValue() && DeviceProperties.isBstar(this.zzb));
    }
}