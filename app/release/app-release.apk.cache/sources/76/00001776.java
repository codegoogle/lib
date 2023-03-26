package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxl;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final zzbxl zza;

    public OfflinePingSender(@x1 Context context, @x1 WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtx());
    }

    @Override // androidx.work.Worker
    @x1
    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzf();
            return ListenableWorker.a.e();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}