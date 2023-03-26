package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzy {
    private final SparseBooleanArray zza;

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzy) {
            zzy zzyVar = (zzy) obj;
            if (zzeg.zza < 24) {
                if (this.zza.size() == zzyVar.zza.size()) {
                    for (int i = 0; i < this.zza.size(); i++) {
                        if (zza(i) != zzyVar.zza(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzyVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzeg.zza < 24) {
            int size = this.zza.size();
            for (int i = 0; i < this.zza.size(); i++) {
                size = (size * 31) + zza(i);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i) {
        zzcw.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}