package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class Builder extends AdRequest.Builder {
        @x1
        public Builder addCategoryExclusion(@x1 String str) {
            this.zza.zzq(str);
            return this;
        }

        @x1
        public Builder addCustomTargeting(@x1 String str, @x1 String str2) {
            this.zza.zzs(str, str2);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @x1
        @KeepForSdk
        @Deprecated
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdInfo(@x1 AdInfo adInfo) {
            setAdInfo(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @x1
        @KeepForSdk
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdString(@x1 String str) {
            setAdString(str);
            return this;
        }

        @x1
        public Builder setPublisherProvidedId(@x1 String str) {
            this.zza.zzG(str);
            return this;
        }

        @x1
        public Builder addCustomTargeting(@x1 String str, @x1 List<String> list) {
            if (list != null) {
                this.zza.zzs(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @x1
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @x1
        @KeepForSdk
        @Deprecated
        public Builder setAdInfo(@x1 AdInfo adInfo) {
            this.zza.zzy(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @x1
        @KeepForSdk
        public Builder setAdString(@x1 String str) {
            this.zza.zzz(str);
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    @x1
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @x1
    public String getPublisherProvidedId() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.ads.AdRequest
    public final zzdr zza() {
        return this.zza;
    }
}