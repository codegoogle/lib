package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;
import com.p7700g.p99005.pt0;
import com.p7700g.p99005.r2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public class zzu extends zzt {
    @r2
    public static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdT)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            int zzw = zzcfb.zzw(activity, configuration.screenHeightDp);
            int zzw2 = zzcfb.zzw(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzr.heightPixels;
            int i2 = zzr.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", pt0.a);
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdP)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
            return (zzf(i, zzw + dimensionPixelSize, intValue) && zzf(i2, zzw2, intValue)) ? false : true;
        }
        return false;
    }
}