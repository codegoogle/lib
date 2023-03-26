package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.p7700g.p99005.z1;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzr {
    private final Context zza;
    @GuardedBy("this")
    private int zzb;
    @GuardedBy("this")
    private int zzc = 0;

    public zzr(Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.zza.getPackageManager();
        if (Wrappers.packageManager(this.zza).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.zzc = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.zzc = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.zzc = 2;
        } else {
            this.zzc = 1;
        }
        return this.zzc;
    }

    public final synchronized int zzb() {
        PackageInfo zza;
        if (this.zzb == 0 && (zza = zza("com.google.android.gms")) != null) {
            this.zzb = zza.versionCode;
        }
        return this.zzb;
    }

    @z1
    private final PackageInfo zza(String str) {
        try {
            return Wrappers.packageManager(this.zza).getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String.valueOf(e).length();
            return null;
        }
    }
}