package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzff;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @x1
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @x1
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @x1
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @x1
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzf zzfVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(zzff zzffVar) {
        this.zza = zzffVar.zza;
        this.zzb = zzffVar.zzb;
        this.zzc = zzffVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}