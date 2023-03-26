package com.google.android.gms.ads;

import com.p7700g.p99005.x1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
    }

    @x1
    public static AdValue zza(int i, @x1 String str, long j) {
        return new AdValue(i, str, j);
    }

    @x1
    public String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}