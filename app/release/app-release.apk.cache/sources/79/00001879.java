package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcex;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class QueryInfo {
    private final zzeg zza;

    public QueryInfo(zzeg zzegVar) {
        this.zza = zzegVar;
    }

    @KeepForSdk
    public static void generate(@x1 final Context context, @x1 final AdFormat adFormat, @z1 final AdRequest adRequest, @x1 final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzh.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        new zzbym(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza()).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbym(context, adFormat, adRequest == null ? null : adRequest.zza()).zzb(queryInfoGenerationCallback);
    }

    @x1
    @KeepForSdk
    public String getQuery() {
        return this.zza.zzb();
    }

    @x1
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @x1
    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzd();
    }

    @x1
    public final zzeg zza() {
        return this.zza;
    }
}