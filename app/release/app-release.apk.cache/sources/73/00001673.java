package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@x1 Intent intent) {
        try {
            zzaw.zza().zzl(this, new zzbtx()).zze(intent);
        } catch (RemoteException e) {
            zzcfi.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}