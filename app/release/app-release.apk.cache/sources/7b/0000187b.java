package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbys;
import com.p7700g.p99005.x1;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ReportingInfo {
    private final zzbys zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzbyr zza;

        @KeepForSdk
        public Builder(@x1 View view) {
            zzbyr zzbyrVar = new zzbyr();
            this.zza = zzbyrVar;
            zzbyrVar.zzb(view);
        }

        @x1
        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @x1
        @KeepForSdk
        public Builder setAssetViews(@x1 Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbys(builder.zza);
    }

    @KeepForSdk
    public void recordClick(@x1 List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(@x1 List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(@x1 MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(@x1 Uri uri, @x1 UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(@x1 List<Uri> list, @x1 UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}