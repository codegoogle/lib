package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.x1;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfln {
    private final Context zza;
    private final Executor zzb;
    private final zzfku zzc;
    private final zzfkw zzd;
    private final zzflm zze;
    private final zzflm zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    public zzfln(Context context, Executor executor, zzfku zzfkuVar, zzfkw zzfkwVar, zzflk zzflkVar, zzfll zzfllVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfkuVar;
        this.zzd = zzfkwVar;
        this.zze = zzflkVar;
        this.zzf = zzfllVar;
    }

    public static zzfln zze(@x1 Context context, @x1 Executor executor, @x1 zzfku zzfkuVar, @x1 zzfkw zzfkwVar) {
        zzfln zzflnVar = new zzfln(context, executor, zzfkuVar, zzfkwVar, new zzflk(), new zzfll());
        if (zzflnVar.zzd.zzd()) {
            zzflnVar.zzg = zzflnVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzflh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfln.this.zzc();
                }
            });
        } else {
            zzflnVar.zzg = Tasks.forResult(zzflnVar.zze.zza());
        }
        zzflnVar.zzh = zzflnVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfli
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfln.this.zzd();
            }
        });
        return zzflnVar;
    }

    private static zzaly zzg(@x1 Task task, @x1 zzaly zzalyVar) {
        return !task.isSuccessful() ? zzalyVar : (zzaly) task.getResult();
    }

    private final Task zzh(@x1 Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzflj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfln.this.zzf(exc);
            }
        });
    }

    public final zzaly zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaly zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzaly zzc() throws Exception {
        Context context = this.zza;
        zzali zza = zzaly.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzr(id);
            zza.zzq(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzaa(6);
        }
        return (zzaly) zza.zzal();
    }

    public final /* synthetic */ zzaly zzd() throws Exception {
        Context context = this.zza;
        return zzflc.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}