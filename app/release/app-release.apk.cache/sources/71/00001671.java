package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public class AdRequest {
    @x1
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    public final zzdr zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class Builder {
        public final zzdq zza;

        public Builder() {
            zzdq zzdqVar = new zzdq();
            this.zza = zzdqVar;
            zzdqVar.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @x1
        public Builder addCustomEventExtrasBundle(@x1 Class<? extends CustomEvent> cls, @x1 Bundle bundle) {
            this.zza.zzr(cls, bundle);
            return this;
        }

        @x1
        public Builder addKeyword(@x1 String str) {
            this.zza.zzt(str);
            return this;
        }

        @x1
        public Builder addNetworkExtrasBundle(@x1 Class<? extends MediationExtrasReceiver> cls, @x1 Bundle bundle) {
            this.zza.zzu(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzx("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @x1
        public AdRequest build() {
            return new AdRequest(this);
        }

        @x1
        @KeepForSdk
        @Deprecated
        public Builder setAdInfo(@x1 AdInfo adInfo) {
            this.zza.zzy(adInfo);
            return this;
        }

        @x1
        @KeepForSdk
        public Builder setAdString(@x1 String str) {
            this.zza.zzz(str);
            return this;
        }

        @x1
        public Builder setContentUrl(@x1 String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zza.zzB(str);
            return this;
        }

        @x1
        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzD(i);
            return this;
        }

        @x1
        public Builder setNeighboringContentUrls(@x1 List<String> list) {
            if (list == null) {
                zzcfi.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzF(list);
            return this;
        }

        @x1
        public Builder setRequestAgent(@x1 String str) {
            this.zza.zzH(str);
            return this;
        }

        @x1
        @Deprecated
        public final Builder zza(@x1 String str) {
            this.zza.zzw(str);
            return this;
        }

        @x1
        @Deprecated
        public final Builder zzb(@x1 Date date) {
            this.zza.zzA(date);
            return this;
        }

        @x1
        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzC(i);
            return this;
        }

        @x1
        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzE(z);
            return this;
        }

        @x1
        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzI(z);
            return this;
        }
    }

    public AdRequest(@x1 Builder builder) {
        this.zza = new zzdr(builder.zza, null);
    }

    @x1
    public String getContentUrl() {
        return this.zza.zzl();
    }

    @z1
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@x1 Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @x1
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @x1
    public Set<String> getKeywords() {
        return this.zza.zzr();
    }

    @x1
    public List<String> getNeighboringContentUrls() {
        return this.zza.zzp();
    }

    @z1
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@x1 Class<T> cls) {
        return this.zza.zzf(cls);
    }

    public boolean isTestDevice(@x1 Context context) {
        return this.zza.zzt(context);
    }

    public zzdr zza() {
        return this.zza;
    }
}