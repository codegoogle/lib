package com.google.android.gms.ads.rewarded;

import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        @x1
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @x1
        public Builder setCustomData(@x1 String str) {
            this.zzb = str;
            return this;
        }

        @x1
        public Builder setUserId(@x1 String str) {
            this.zza = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @x1
    public String getCustomData() {
        return this.zzb;
    }

    @x1
    public String getUserId() {
        return this.zza;
    }
}