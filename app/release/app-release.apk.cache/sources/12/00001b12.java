package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzz {
    @z1
    private String zza = null;
    private long zzb = -1;
    private zzag zzc = zzag.zzl();
    private zzag zzd = zzag.zzl();

    @CanIgnoreReturnValue
    public final zzz zza(long j) {
        this.zzb = j;
        return this;
    }

    @CanIgnoreReturnValue
    public final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzag.zzk(list);
        return this;
    }

    @CanIgnoreReturnValue
    public final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzag.zzk(list);
        return this;
    }

    @CanIgnoreReturnValue
    public final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzab zze() {
        if (this.zza != null) {
            if (this.zzb >= 0) {
                if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}